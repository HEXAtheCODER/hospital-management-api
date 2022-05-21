package com.hospital.management.hospitalmanagement.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hospital.management.hospitalmanagement.dao.DoctorDao;
import com.hospital.management.hospitalmanagement.entity.Doctor;

@Service
public class DoctorService {

	@Autowired
	public DoctorDao doctorDao;

	public String addDoctor(Doctor doctor) {
		System.out.println(doctor.getDoctorName());
		boolean isPresent = doctorDao.existsById(doctor.getDoctorId());
		if(isPresent) {
			return "User already present";
			
		}
		doctorDao.save(doctor);
		return "Success";
	}

	public List<Doctor> getAllDoctors() {
		return doctorDao.findAll();
	}

	public Doctor getDoctorById(int doctorId) {
		return doctorDao.findById(doctorId).get();
	}

	public Doctor updateNumberOfPatientAttended(int doctorId) {
		Doctor dr = doctorDao.findById(doctorId).get();
		dr.setNumberOfPatientAttended(dr.getNumberOfPatientAttended() + 1);
		doctorDao.save(dr);

		return dr;
	}

	public ResponseEntity<String> deleteDoctor(int doctorId){
		
		try {
			Doctor dr = doctorDao.findById(doctorId).get();
			doctorDao.delete(dr);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<String>("Error", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<String>("Success", HttpStatus.OK);

	}

}
