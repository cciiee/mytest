package itheima8;
/*抽象类的细节 
    1  抽象类可以有具体的方法
    2  抽象类可以没有抽象方法
    3  抽象类可以有多个抽象方法  子类想穿件对象  必须全部实现方法
    4  抽象类必须是一个父类
    4  抽象类有构造方法  为了子类使用 的*/
public class Test {
 
public static void main(String[] args) {
	Dog d=new Dog();
	d.eat();
	d.sleep();
}
   
}
