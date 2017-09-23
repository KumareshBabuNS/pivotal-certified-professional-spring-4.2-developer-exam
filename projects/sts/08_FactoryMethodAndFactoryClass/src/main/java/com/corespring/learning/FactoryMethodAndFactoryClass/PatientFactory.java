package com.corespring.learning.FactoryMethodAndFactoryClass;

public class PatientFactory {
	public Patient createPatient(int id, String name) {
		System.out.println("Using Factory Class to create patient!");
		return new Patient(id,name);
	}

}
