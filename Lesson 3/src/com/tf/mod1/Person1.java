package com.tf.mod1;

public class Person1 extends Person{
	
	public Person1 (String nam){
		name = nam;
	}
	
	public void doIt() {
		Person p = new Person();
		p.name = "Slava";
		p.surname = "Andr";
		p.age = "28";
		p.isMale = true;
	}
	
  public void go() {
	  name = "Olya";
	  surname = "Liubchenko";
	  age = "25";
	  isMale = false;
  }
}
