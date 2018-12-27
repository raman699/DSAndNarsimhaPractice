package com.hello.hit;

import java.util.ArrayList;
import java.util.HashMap;

public class TestHashMap {

	static ArrayList<Protection> al = new ArrayList();
	ArrayList<Person> persons = new ArrayList();
	static HashMap<String,Employee> emap;

	public static void main(String[] args) {
		
		ArrayList<Person> per= new ArrayList<Person>();
		
		per.add(new Person(1,"raman"));
		per.add(new Person(2,"gagan"));
		per.add(new Person(3,"naman"));
		
		
		ArrayList<String> empids= new ArrayList<String>();
		empids.add("3");
		empids.add("2");
		empids.add("1");
		empids.add("4");
		
		emap= getEmpHashMap();
		
		for(Person p:per)
		{
			Protection pr=getProtectionEntity(p);
			al.add(pr);
		}
		for(Protection p: al)
		{
			System.out.println(p.protectionID);
			System.out.println(p.name);
			System.out.println(p.add);
			System.out.println(p.sp);
			System.out.println("*****************");
		}

	}

	public static Protection getProtectionEntity(Person per)
	{
		Protection p= new Protection();
		Employee e= emap.get(per.getId()+"");
		p.setAdd(e.getAdd());
		p.setName(e.getName());
		
		p.setSp("sp"+e.getAdd());
		
		p.setProtectionID(1);
		return p;
		
	}
	public static HashMap<String, Employee> getEmpHashMap() {

		HashMap hmap = new HashMap();
		Employee e1 = new Employee();
		e1.setAdd("1");
		e1.setName("Raman");
		Employee e2 = new Employee();
		e2.setAdd("2");
		e2.setName("Gagan");
		Employee e3 = new Employee();
		e3.setAdd("3");
		e3.setName("Raman");
		Employee e4 = new Employee();
		e4.setAdd("4");
		e4.setName("Gagan");

		hmap.put("1", e1);
		hmap.put("2", e2);
		hmap.put("3", e3);
		hmap.put("4", e4);

		return hmap;
	}
}

class Employee {
	String name;
	String add;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}
}

class Protection {

	int protectionID;

	String name;

	String add;

	String sp;

	public int getProtectionID() {
		return protectionID;
	}

	public void setProtectionID(int protectionID) {
		this.protectionID = protectionID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getSp() {
		return sp;
	}

	public void setSp(String sp) {
		this.sp = sp;
	}
}

class Person {

	int id;
	String name;

	Person(int id, String name) {
		this.id = id;
		this.name = name;

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

}