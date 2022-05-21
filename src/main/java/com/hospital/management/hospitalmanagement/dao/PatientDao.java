package com.hospital.management.hospitalmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.management.hospitalmanagement.entity.Patient;

public interface PatientDao extends JpaRepository<Patient, Integer>{
}
