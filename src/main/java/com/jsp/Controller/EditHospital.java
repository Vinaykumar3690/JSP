package com.jsp.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Dto.Hospital;
import com.jsp.Service.HospitalService;


@WebServlet("/edit")
public class EditHospital  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		Hospital hospital=new Hospital();
		
		hospital.setId(id);
		
		HospitalService hospitalService=new HospitalService();
		Hospital hospital2=hospitalService.getHospitalbyid(id);
		

		if(hospital2!=null) {
			
			req.setAttribute("hospital", hospital2);
		
			RequestDispatcher dispatcher=req.getRequestDispatcher("UpdateHospital.jsp");
			dispatcher.forward(req, resp);       //UpdateHospital.jsp
														///displayHospital
			
			
		}
		else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("Hospital.jsp");
			dispatcher.include(req, resp);
			
		
		
		
		}
	}
}
