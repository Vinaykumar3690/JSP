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


@WebServlet("/getHospitalById")
public class GetHospitalbyid extends HttpServlet {
	
	
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			Hospital hospital=new Hospital();
			
			int id=Integer.parseInt(req.getParameter("id"));
			hospital.setId(id);
			
			HospitalService hospitalService=new HospitalService();
			Hospital hospital2 =hospitalService.getHospitalbyid(id);
			
			
			if(hospital2 !=null) {
				
				RequestDispatcher dispatcher=req.getRequestDispatcher("GetHospitalByid.jsp");
				dispatcher.forward(req, resp); 
				
				}
				else {
					RequestDispatcher dispatcher=req.getRequestDispatcher("Hospital.jsp");
					dispatcher.include(req, resp);
			
			
			
			
			
			
			
		}
		
		
		
		

	}

}
