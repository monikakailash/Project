package com.lulu.collections.employee_rec;

public class Vehicle {

	int Modelno;
	String name;
	int enginecode;
	
	public void setName(String name) {
		this.name = name;
	}
	public int getModelno() {
		return Modelno;
	}
	public int getenginecode() {
		return enginecode;
	}
	public void Vehicle() {

		// TODO Auto-generated constructor stub
	}
	public Vehicle(String name,int modelno, int engineno) {
		super();
		this.name = name;
		this.Modelno = Modelno;
		this.enginecode = enginecode;
	}
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", enginecode=" + enginecode + ", Modelno=" + Modelno + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Modelno;
		result = prime * result + enginecode;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (Modelno != other.Modelno)
			return false;
		if (enginecode != other.enginecode)
			return false;
		if (name != other.name)
			return false;
		return false;
						} 
	}
