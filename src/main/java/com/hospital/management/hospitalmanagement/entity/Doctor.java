package com.hospital.management.hospitalmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {
	
	@Id
	private int doctorId;
	private String doctorName;
	private String specializationField;
	private int numberOfPatientAttended;
	
	
	public Doctor(int doctorId, String doctorName, String specializationField, int numberOfPatientAttended) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specializationField = specializationField;
		this.numberOfPatientAttended = numberOfPatientAttended;
	}


	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public String getSpecializationField() {
		return specializationField;
	}


	public void setSpecializationField(String specializationField) {
		this.specializationField = specializationField;
	}


	public int getNumberOfPatientAttended() {
		return numberOfPatientAttended;
	}


	public void setNumberOfPatientAttended(int numberOfPatientAttended) {
		this.numberOfPatientAttended = numberOfPatientAttended;
	}

	
}
