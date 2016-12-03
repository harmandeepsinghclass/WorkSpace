package org.totalbeginner.tutorial;

public class Person {
    //fields
	private String name;//name of the person.
	private int maximumBooks; //most books the person can check out.
	
	//constructors
	public Person() {
		name = "unknow name";
		maximumBooks = 3;
		}
	//Methods
	public String getName(){
		return name;
	}
    public void setName(String anyName) {
		// TODO Auto-generated method stub
    	name= anyName;
	}
	public int getMaximumBooks() {
		return maximumBooks;
	}
	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
	

}

