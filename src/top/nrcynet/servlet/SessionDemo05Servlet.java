package top.nrcynet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({ "/d5m2", "/d5m1" })
public class SessionDemo05Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SessionDemo05Servlet() {
    }

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		String uri = request.getRequestURI();
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		if(uri.equals("/d5m1")) {
			addSession(request, response);
			writer.print("session 设置成功");
		}else if(uri.equals("/d5m2")) {
			String data = getSession(request, response);
			writer.print(data);
		}else {
			writer.print("内部错误");
		}
		
	}
	
	private void addSession(HttpServletRequest request, 
			HttpServletResponse response) {
		HttpSession session = request.getSession();
		session.setAttribute("session", "SessionData");
	}
	
	private String getSession(HttpServletRequest request, 
			HttpServletResponse response) {
		HttpSession session = request.getSession();
		String data = (String) session.getAttribute("session");
		return data;
	}
}
