package com.jsp.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Dto.Hospital;
import com.jsp.Service.HospitalService;

@WebServlet("/displayHospital")
public class DisplayHospital extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HospitalService hospitalService=new HospitalService();
		List<Hospital> list=hospitalService.getallHospitals();
		
		if(list.size()>0) {
			
			req.setAttribute("addlist",list);
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("Display.jsp");
			requestDispatcher.forward(req, resp);
			
		}
		else {
			

			RequestDispatcher requestDispatcher=req.getRequestDispatcher("Hospital.jsp");
			requestDispatcher.forward(req, resp);
			
			
			
		}
		
		
		
	}
	
	

}
