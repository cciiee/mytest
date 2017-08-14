package itheima5;

public class Person {
   private String name;
   private int age;
   public Person(){
	   super();
   }
   public Person(String name,int age){
	   super();
	   this.name=name;
	   this.age=age;
   }
   public Person(String name,int age,int n){
	   this(name,age);
	   for (int i = 0; i < n; i++) {
		System.out.println("hello");
	}
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
