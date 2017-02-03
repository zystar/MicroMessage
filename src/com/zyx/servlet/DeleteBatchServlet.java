package com.zyx.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zyx.service.MaintainService;

/**
 * 批量删除控制层
 */
@SuppressWarnings("serial")
public class DeleteBatchServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String[] ids = req.getParameterValues("id");
		MaintainService maintainService = new MaintainService();
		maintainService.deleteBatch(ids);
		req.getRequestDispatcher("/List.action").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
