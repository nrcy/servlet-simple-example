package top.nrcynet.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieDemo04Servlet
 */
@WebServlet({ "/d4m1", "/d4m2" })
public class CookieDemo04Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CookieDemo04Servlet() {
    }

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		response.setContentType("text/plain;charset=UTF-8");
		if(uri.equals("/d4m1")) {
			addCookie(request, response);
			response.getWriter().print("cookie 设置成功");
		}else if(uri.equals("/d4m2")) {
			String data = getCookie(request, response);
			response.getWriter().print(data);
		}else {
			response.getWriter().print("error");
		}
		
	}

	private void addCookie(HttpServletRequest request, 
			HttpServletResponse response) {
		Cookie cookie = new Cookie("cookie", "thisiscookiedata");
		cookie.setMaxAge(60);
		cookie.setPath("/");
		response.addCookie(cookie);
	}
	
	private String getCookie(HttpServletRequest request, 
			HttpServletResponse response) {
		String data = "cookie 获取失败";
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("cookie")) {
					data = cookie.getValue();
				}
			}
		}
		return data;
	}
}
