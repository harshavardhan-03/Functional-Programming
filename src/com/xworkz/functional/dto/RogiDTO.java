package com.xworkz.functional.dto;

import java.io.Serializable;

public class RogiDTO implements Serializable,Comparable<RogiDTO>{
	private int id;
	private String name;
	private int age;
	private String disease;
	private boolean badukuGuarantee;
	
	public RogiDTO() {
		super();
	}

	public RogiDTO(int id, String name, int age, String disease, boolean badukuGuarantee) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.disease = disease;
		this.badukuGuarantee = badukuGuarantee;
	}

	@Override
	public String toString() {
		return "RogiDTO [id=" + id + ", name=" + name + ", age=" + age + ", disease=" + disease + ", badukuGuarantee="
				+ badukuGuarantee + "]";
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof RogiDTO) {
			RogiDTO casted = (RogiDTO) obj;
			if (this.name.equals(casted.name) && this.id == casted.id && this.disease.equals(casted.disease)){
				return true;
			}
		}
		return false;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public boolean isbadukuGuarantee() {
		return badukuGuarantee;
	}

	public void setbadukuGuarantee(boolean badukuGuarantee) {
		this.badukuGuarantee = badukuGuarantee;
	}
	
	@Override
	public int compareTo(RogiDTO age) {
		double max = age.getAge();
		if (this.age == max)
			return 0;
		if (this.age > max)
			return 1;
		if (this.age < max)
			return -1;

		return 0;
	}
	
	
}
