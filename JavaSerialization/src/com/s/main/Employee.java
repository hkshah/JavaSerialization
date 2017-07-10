package com.s.main;

import java.io.Serializable;

/**
 * @author Hardik Shah
 *
 */
public class Employee  {

	public String name;
	public String address;
	public transient int SSN;
	public int number;

	public void mailCheck() {
		System.out.println("Mailing a check to " + name + " " + address);
	}
}
