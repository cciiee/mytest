package itheima4;

public class Student extends Person {
  private String number;
  public Student(){
	  super();
	  System.out.println("ѧ���Ŀղι���ִ����");
  }
  public Student(String name,int age,String number){
	  super(name,age);
	  System.out.println("ѧ���Ĵ��ι���ִ����");
	  this.number=number;
  }
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
  
}
