package com.pp.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pp.po.TestObj;
import com.pp.service.TestObjService;

@Controller
public class TestObjAction {
	@Autowired
	private TestObjService testObjService;
	
	
	@RequestMapping("/getName")
	public void getName(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html;charset=utf-8");
		int id = Integer.parseInt(req.getParameter("id"));
		TestObj obj = testObjService.getTestObjById(id);
		String name =obj.getName();
		System.out.println(name);
		resp.getWriter().write(name);
	}
}
