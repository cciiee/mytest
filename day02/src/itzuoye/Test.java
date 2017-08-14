package itzuoye;
/*1、根据需求，完成如下代码（只用继承，不用抽象类，按照标准格式写），并在测试类中进行测试。
需求一：
	已知学生类和老师类如下：
		属性:姓名,年龄
		行为:吃饭
		老师有特有的方法:讲课
		学生有特有的方法:学习
需求二：
	已知猫类和狗类：
		属性:毛的颜色,腿的个数
		行为:吃饭
		猫特有行为:抓老鼠catchMouse
		狗特有行为:看家lookHome*/
public class Test {
 public static void main(String[] args) {
    Student s=new Student("柳岩",22);
    s.eat();
    s.study();
    System.out.println(s.getName()+" "+s.getAge());
    System.out.println("-------");
    Teacher t=new Teacher("哈哈",111);
    t.eat();
    t.teach();
    System.out.println(t.getName()+" "+t.getAge());
}
}
