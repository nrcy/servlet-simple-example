package top.nrcynet.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class URLDemo03Servlet
 */
@WebServlet("/demo03")
public class URLDemo03Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public URLDemo03Servlet() {
    }

    @Override
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
    	String option = request.getParameter("url");
    	request.setAttribute("attr", "这是转发");
    	if(option.equals("forward")) {
    		request.getRequestDispatcher("/demo03.jsp").forward(request, response);
    	}else {
    		response.sendRedirect("/demo03.jsp");
    	}
    	
	}

}
