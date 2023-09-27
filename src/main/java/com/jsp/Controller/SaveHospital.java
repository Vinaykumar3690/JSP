package com.jsp.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Dto.Hospital;
import com.jsp.Service.HospitalService;

@WebServlet("/Hospital")
public class SaveHospital  extends HttpServlet{
	
	
	
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			//int id=Integer.parseInt(req.getParameter("id"));
			//String name=req.getParameter("name");
			//String website=req.getParameter("website");
			//long phone=Long.parseLong(req.getParameter("phone"));
			
			
			Hospital hospital=new Hospital();
			
			//hospital.setId(req.getParameter(id));
			hospital.setName(req.getParameter("name"));
			hospital.setWebsite(req.getParameter("website"));
			hospital.setPhone(Long.parseLong(req.getParameter("phone")));
			
			HospitalService hospitalService=new HospitalService();
			
			Hospital hospital2=hospitalService.saveHospital(hospital);
			
			
			
			
			if(hospital2 !=null) {
				
			RequestDispatcher dispatcher=req.getRequestDispatcher("Hospital.jsp");
			dispatcher.forward(req, resp); 
			
			}
			else {
				RequestDispatcher dispatcher=req.getRequestDispatcher("SaveHospital.jsp");
				dispatcher.include(req, resp);
				
				
			}
	
			
			
			PrintWriter printWriter = resp.getWriter();
			printWriter.print("<html><body><h1>Data Saved</h1> </body></html>");
			
		
			
			
		}
		
		
	
	
	

}
