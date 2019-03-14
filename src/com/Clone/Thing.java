package com.Clone;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Thing implements Serializable {

	String name;

	public Thing(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

}