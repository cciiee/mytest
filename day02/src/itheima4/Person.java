package itheima4;

public class Person {
  private String name;
  private int age;
  public Person(){
	  System.out.println("Person�Ŀղι���ִ����");
  }
  public Person(String name,int age){
	  System.out.println();
	  this.name=name;
	  this.age=age;
	  System.out.println("Person�Ĵ��ι���ִ����");
	  
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
  
  
}
