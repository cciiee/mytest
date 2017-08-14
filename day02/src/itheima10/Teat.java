package itheima10;

public class Teat {
  public static void main(String[] args) {
	Home h=new Home();
	Cat c=new Cat();
	h.eatAtHome(c);
	System.out.println("------");
	Dog d=new Dog();
	h.eatAtHome(d);
}
}
