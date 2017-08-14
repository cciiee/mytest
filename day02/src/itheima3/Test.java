package itheima3;

public class Test {
  public static void main(String[] args) {
	Phone p=new Phone();
	p.call();
	p.sendMessage();
	p.numberShow();
	
	System.out.println("------");
	IPhone p2=new IPhone();
	p2.numberShow();
	p2.call();
	p2.sendMessage();
}
}
