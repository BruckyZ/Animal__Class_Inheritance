package com.company;


// Getter and setters (getname & set name help to get information from private string and calling it in public
// to get the getname & setname --right click on name--Generate--select setter and Getter which will put the script..
public class Cat extends Animal
{
	private String name;

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public void setName(String name)

	{
		this.name = name;
	}

	public String speaks()
	{
		return "A Cat Speaks";
	}

	public String Bite()
	{
		return " A Cat Scratch & bites";
	}
}
