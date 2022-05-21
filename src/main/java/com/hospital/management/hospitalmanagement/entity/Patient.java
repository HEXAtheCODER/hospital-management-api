package com.hospital.management.hospitalmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {
	@Id
	private int patientId;
	private String patientName;
	private int patientAge;
	private String visitedDoctorName;
	private String dateOfVisit;
	private String prescription;
	
	
	public Patient(int patientId, String patientName, int patientAge, String visitedDoctorName, String dateOfVisit,
			String prescription) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.visitedDoctorName = visitedDoctorName;
		this.dateOfVisit = dateOfVisit;
		this.prescription = prescription;
	}


	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getPatientId() {
		return patientId;
	}


	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}


	public String getPatientName() {
		return patientName;
	}


	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}


	public int getPatientAge() {
		return patientAge;
	}


	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}


	public String getVisitedDoctorName() {
		return visitedDoctorName;
	}


	public void setVisitedDoctorName(String visitedDoctorName) {
		this.visitedDoctorName = visitedDoctorName;
	}


	public String getDateOfVisit() {
		return dateOfVisit;
	}


	public void setDateOfVisit(String dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}


	public String getPrescription() {
		return prescription;
	}


	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	
	
}
