package com.corespring.learning.BeanInitAndDestroyMethods;

public class Patient {

	private int id;
	private String name;

	private Address address;

	private int nationalId;

	public Patient() {
		super();
	}

	public Patient(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNationalId() {
		return nationalId;
	}

	public void setNationalId(int nationalId) {
		this.nationalId = nationalId;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", address=" + address + ", nationalId=" + nationalId + "]";
	}

	public void speak() {
		System.out.println("Help Me!");
	}
	
	public void onCreate() {
		System.out.println("Patient Created!"+ this);
	}
	public void onDestroy() {
		System.out.println("Patient destroyed!");
	}

}
