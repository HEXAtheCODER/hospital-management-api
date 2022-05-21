package com.hospital.management.hospitalmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hospital.management.hospitalmanagement.dao.PatientDao;
import com.hospital.management.hospitalmanagement.entity.Patient;

@Service
public class PatientService {
	
	@Autowired
	PatientDao patientDao;
	
	public Patient getPatientById(int id) {
		return patientDao.findById(id).get();
	}
	
	public ResponseEntity<Patient> addPatient(Patient patient) {
		boolean isPresent = patientDao.existsById(patient.getPatientId());
		
//		patientDao.save(patient)
//		return patient;
		
		if(isPresent) {
			return new ResponseEntity<Patient>(new Patient(), HttpStatus.BAD_REQUEST);
			
		}
		patientDao.save(patient);
		return new ResponseEntity<Patient>(patient, HttpStatus.OK);
	}
}
