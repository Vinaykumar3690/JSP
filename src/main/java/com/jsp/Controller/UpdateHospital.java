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

@WebServlet("/update")
public class UpdateHospital extends HttpServlet {
	
			@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			Hospital hospital=new Hospital();
			
			hospital.setId(Integer.parseInt(req.getParameter("id")));
			hospital.setName(req.getParameter("name"));
			hospital.setWebsite(req.getParameter("website"));
			hospital.setPhone(Long.parseLong(req.getParameter("phone")));
			
			
			HospitalService hospitalService=new HospitalService();
			Hospital hospital2=hospitalService.updateHospital(hospital);
			
			if(hospital2!=null) {
				RequestDispatcher dispatcher=req.getRequestDispatcher("/displayHospital");
				dispatcher.forward(req, resp);
				
				
			}
			else {
				RequestDispatcher dispatcher=req.getRequestDispatcher("UpdateHospital.jsp");
				dispatcher.include(req, resp);
				
				
			}
			
			
			
		}

	}



