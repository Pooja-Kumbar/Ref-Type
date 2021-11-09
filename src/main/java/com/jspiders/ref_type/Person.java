package com.jspiders.ref_type;

public class Person
{
   private int id;
   private String name;
   private long phnum;
   private Address address;
   @Override
   public String toString() {
	return "Person [id=" + id + ", name=" + name + ", phnum=" + phnum + ", address=" + address + "]";
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
   public long getPhnum() {
	return phnum;
   }
   public void setPhnum(long phnum) {
	this.phnum = phnum;
   }
   public Address getAddress() {
	return address;
   }
   public void setAddress(Address address) {
	this.address = address;
   }
   
}
