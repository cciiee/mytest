package itheima4;
//父类对象优于子类对象产生
/*在子类每个构造方法   第一行  都有一个默认super()调用父类的空参构造
super()调用父类
super(实际参数)调用父类带参*/
public class Test {
  public static void main(String[] args) {
	Person p=new Person();
	Person p2=new Person("柳岩",30);
	
	Student s=new Student();
	System.out.println("--------");
	Student s2=new Student ("唐嫣",28,"34232");
	System.out.println(s2.getName()+" "+s2.getAge()+" "+s2.getNumber());
  }
}
