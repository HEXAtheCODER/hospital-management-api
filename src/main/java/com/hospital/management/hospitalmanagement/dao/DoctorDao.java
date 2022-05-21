package com.hospital.management.hospitalmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.management.hospitalmanagement.entity.Doctor;

public interface DoctorDao extends JpaRepository<Doctor, Integer>{
}
