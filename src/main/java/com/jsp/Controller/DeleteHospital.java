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

@WebServlet("/delete")
public class DeleteHospital extends HttpServlet{
	
	

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			Hospital hospital=new Hospital();
			
			int id=Integer.parseInt(req.getParameter("id"));
			
			
			HospitalService hospitalService=new HospitalService();
			Hospital hospital2=hospitalService.deleteHospitalByid(id);
			
			if(hospital2 !=null) {
				RequestDispatcher dispatcher=req.getRequestDispatcher("/displayHospital");
				dispatcher.forward(req, resp);
				
			}
			else {
				
				RequestDispatcher dispatcher=req.getRequestDispatcher("DeleteHospital.jsp");              //("Hospital.jsp");
				dispatcher.include(req, resp);
					
			    	
			}
			
		}
}
		

