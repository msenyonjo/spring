package com.msenyonjo.person;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Person {
	protected String firstName;
	protected String surname;
	protected Date birthdate;
	protected String fullName;
	protected int age;
	protected List<String> myList;

	
	public Person(String firstName, String surName, int iYear, int iMonth,
			int iDay) {
		this.firstName = firstName;
		this.surname = surName;
		setFullName();
		setBirthdate(iYear, iMonth, iDay);

	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName() {
		this.fullName = firstName + surname;
	}

	
	public void setAge() {
		// Calendar objects for "today" and "date of birth"...

		Calendar today = Calendar.getInstance();
		Calendar birthday = new GregorianCalendar();
		birthday.setTime(birthdate);

		// Compute basic difference in years ....

		int yearDiff = today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);

		// Birthday still needs to occur this year...

		if (today.get(Calendar.MONTH) < birthday.get(Calendar.MONTH))
			yearDiff = yearDiff - 1;
		else if (today.get(Calendar.MONTH) == birthday.get(Calendar.MONTH)
				&& today.get(Calendar.DATE) < birthday.get(Calendar.DATE)) {
			yearDiff = yearDiff - 1;
		}
		this.age = yearDiff;
	}

	public int getAge() {
		return this.age;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(int iYear, int iMonth, int iDay) {
		Calendar cal = Calendar.getInstance();
		cal.set(iYear, iMonth, iDay);
		this.birthdate = cal.getTime();
	}
	
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public List<String> getMyList() {
		return myList;
	}

	public void setMyList(List<String> myList) {
		this.myList = myList;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", surname=" + surname
				+ ", birthdate=" + birthdate + ", fullName=" + fullName
				+ ", age=" + age + "]";
	}
	
	


}