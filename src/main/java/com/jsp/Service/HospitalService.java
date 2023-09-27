package com.jsp.Service;

import java.util.List;

import com.jsp.Dao.HospitalDao;
import com.jsp.Dto.Hospital;

public class HospitalService {
	

	HospitalDao hospitalDao=new HospitalDao();
	
	
	public Hospital saveHospital(Hospital hospital) {
		
		return hospitalDao.saveHospital(hospital);
	}
	
	public Hospital updateHospital( Hospital hospital) {
		
		return hospitalDao.updateHospital(hospital);
		
	}
	
	public Hospital deleteHospitalByid( int id ) {
		return hospitalDao.DeleteHospital(id);
	}
	
	public Hospital getHospitalbyid( int id) {
		
		return hospitalDao.getHospitalbyid(id);

	}
	
	
	public List<Hospital> getallHospitals(){
		
		return hospitalDao.getallHospital();
		
	}
	
	/*
	
	HospitalDao hospitalDao=new HospitalDao();
		
	// Save Hospital
	public Hospital saveHospital(Hospital hospital) {
		
		return hospitalDao.saveHospital(hospital);
		
	}
	
	
	//Update  Hospital
	
	public Hospital updateHospital(Hospital hospital) {
		
		return hospitalDao.updateHospital(hospital);
		
	}
	
	//get Hospital by id
	
     public Hospital getHospitalbyid( int id ) {
		
		return hospitalDao.getHospitalbyid(id);
	}
     
     //delete Hospital 
     
     public Hospital deleteHospital( int  id) {
 		
 		return hospitalDao.DeleteHospital(id);
 	}
 	//get all Hospital
     
     public List<Hospital> getallStudent(  ) {
  		
  		return hospitalDao.getallHospital( );
  	}
     
     
   */  


}
