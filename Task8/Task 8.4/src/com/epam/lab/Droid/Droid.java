package com.epam.lab.Droid;

public abstract class Droid implements Cloneable{
	public String name;
	public String type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	abstract void move();
    public Object clone() {
	     Object clone = null;
	      
	  try {
	        clone = super.clone();
	      }
	  catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }	      
	      return clone;
	   }
}
