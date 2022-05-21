package com.hospital.management.hospitalmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.management.hospitalmanagement.entity.Patient;
import com.hospital.management.hospitalmanagement.service.PatientService;

@RestController
@CrossOrigin
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	
	@GetMapping("/patient/{patientId}")
	public Patient getPatientById(@PathVariable String patientId) {
		
		return patientService.getPatientById(Integer.parseInt(patientId));
	}
	
	
	@PostMapping("/patient")
	public ResponseEntity<Patient> addPatient(@RequestBody Patient patient) {
		return patientService.addPatient(patient);
	}
}
