package itheima5;
//创建一个Person对象,这个对象一旦建立,就有姓名和年龄,柳岩  38
//再创建一个person对象,这个对象一旦建立,就有姓名和年龄  唐嫣 18  但是创建
//对象的同时   打印n此  hello
//this 调用本类其他的构造方法
//this和super 调用构造方法时候,都要在第一行   不能共存
public class Test {
  public static void main(String[] args) {
	Person p=new Person("柳岩",38);
	Person p2=new Person("唐嫣",18,10);
	System.out.println(p2.getName());
	System.out.println(p2.getAge());
}
}
