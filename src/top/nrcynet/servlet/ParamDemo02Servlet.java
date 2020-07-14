package top.nrcynet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import top.nrcynet.bean.DataModal;

@WebServlet("/demo02")
public class ParamDemo02Servlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	private DataModal dataModal;
	
	public ParamDemo02Servlet() {
		dataModal = new DataModal();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String str01 = req.getParameter("str01");
		String str02 = req.getParameter("str02");
		dataModal.setStr01(str01);
		dataModal.setStr02(str02);
		resp.getWriter().print(dataModal);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String str01 = req.getParameter("str01");
		String str02 = req.getParameter("str02");
		dataModal.setStr01(str01);
		dataModal.setStr02(str02);
		resp.getWriter().print(dataModal);
	}

	
	
}
