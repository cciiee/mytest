package itzuoye2;

public abstract class Person {
 private String name;
 private int age;
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
 public abstract void teach();
}
