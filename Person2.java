package io;

public class Person2 {
	private String Firstname;
	private String Lastname;
	private String gender;
	
	public String getName1()
	{
		return Firstname;
	}
	public String getName2()
	{
		return Lastname;
	}
	public String getName3()
	{
		return gender;
	}
	 
	public void setName(String newName1,String newName2,String gen)
	{
		this.Firstname=newName1;
		this.Lastname=newName2;
		this.gender=gen;
	}
	public static void main(String[] args) {
		Person2 p=new Person2();
		p.setName("datta", "J", "M");
		System.out.println(p.getName1());
		System.out.println(p.getName2());
		System.out.println(p.getName3());
	}

}
