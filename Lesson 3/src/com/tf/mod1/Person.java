package com.tf.mod1;

public class Person {
	
	public String name;
	protected String surname;
	private int age;
	boolean isMale;
	
	public Person (String n, String s, int a, boolean m) {
		name = n;
		surname = s;
		age = a;
		isMale =m;
	}
	
	public Person () {
		
	}
	
	public void setAge (int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}	
	
	public static void doSmth(){
		
		System.out.println("do");
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (isMale != other.isMale)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	
	
/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", age=" + age + ", isMale=" + isMale + "]";
	}

public static void main(String[] args) {
	
	Person p = new Person();
	p.name = "Slava";
	p.surname = "Andr";
	p.setAge(20);
	System.out.println(p.getAge());
	
   Person p1 = new Person ("vasya", "petrov", 25, true);
    
   Person p2 = new Person();
   p.doSmth();
   Person.doSmth();
   
}
}
