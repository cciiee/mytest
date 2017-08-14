package itheima4;

public class Student extends Person {
  private String number;
  public Student(){
	  super();
	  System.out.println("学生的空参构造执行了");
  }
  public Student(String name,int age,String number){
	  super(name,age);
	  System.out.println("学生的带参构造执行了");
	  this.number=number;
  }
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
  
}
