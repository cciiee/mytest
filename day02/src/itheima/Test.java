package itheima;
//子类继承父类后  自动拥有父类的所以可继承的属性和行为
public class Test {
   public static void main(String[] args) {
	Chinese c=new Chinese();
	c.eat();//方法重写了
	//私有的属性  不能直接使用  但是使用继承过来的公共方法访问
	c.setName("柳岩");
	String name=c.getName();
	System.out.println(name);
}
}
