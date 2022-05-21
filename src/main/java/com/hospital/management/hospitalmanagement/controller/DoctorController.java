package com.hospital.management.hospitalmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.management.hospitalmanagement.entity.Doctor;
import com.hospital.management.hospitalmanagement.service.DoctorService;

@RestController
@CrossOrigin
public class DoctorController {
	
	@Autowired
	DoctorService doctorService;

//	@GetMapping("/test")
//	public String test() {
//		return "Working";
//	}
	
	@PostMapping("/doctor")
	public String addDoctor(@RequestBody Doctor doctor) {
		return doctorService.addDoctor(doctor);
		
	}
	
	@GetMapping("/doctor")
	public List<Doctor> getAllDoctors() {
		return doctorService.getAllDoctors();
	}
	
	
	@GetMapping("doctor/{doctorId}")
	public Doctor getDoctorById(@PathVariable String doctorId) {
		return doctorService.getDoctorById(Integer.parseInt(doctorId));
	}
	
	@PutMapping("doctor/{doctorId}")
	public Doctor updateNumberOfPatientAttended(@PathVariable String doctorId) {
		return doctorService.updateNumberOfPatientAttended(Integer.parseInt(doctorId));
	}
	
	
	@DeleteMapping("/doctor/{doctorId}")
	public ResponseEntity<String> deleteDoctor(@PathVariable String doctorId) {
		return doctorService.deleteDoctor(Integer.parseInt(doctorId));
	}
}
