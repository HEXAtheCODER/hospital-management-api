package com.hospital.management.hospitalmanagement.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.hospital.management.hospitalmanagement.dao.DoctorDao;
import com.hospital.management.hospitalmanagement.entity.Doctor;
import com.hospital.management.hospitalmanagement.service.DoctorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DoctorControllerTest {

	@Autowired
	private DoctorService doctorService;
	
	@MockBean
	private DoctorDao doctorDao;

	@Test
	void testAddDoctor() throws Exception {
		Doctor doctor = new Doctor(7000, "Dr. abc", "None", 2);
//		when(doctorDao.save(doctor)).thenReturn(doctor);
		assertEquals("Success", doctorService.addDoctor(doctor));
		
	}


//	@Test
//	void testGetDoctorById() {
//		
//	}

}

