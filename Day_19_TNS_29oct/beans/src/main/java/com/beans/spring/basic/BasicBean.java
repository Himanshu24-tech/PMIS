package com.beans.spring.basic;
public class BasicBean {

	/*
	 * private restricts access to this class.
	 * final means name is assigned once in the constructor and cannot
	 * be reassigned later.
	 */
	private final String name;

	/*
	 * A constructor initializes a new BasicBean.
	 * For example, new BasicBean("Spring bean") stores that text in name.
	 */
	public BasicBean(String name) {
		this.name = name;
	}

	/*
	 * This is a normal public Java method. Code holding a BasicBean
	 * reference can call it, whether the object came from Spring or new.
	 */
	public String greet() {
		return "Hello, " + name + "!";
	}
}