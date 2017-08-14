package itheima10;
//一切使用父类引用的地方  都可以传入其子类对象
public class Home {
/*public void eatAtHome(Cat c){
	System.out.println("在加吃饭了");
	c.eat();
}
public void eatAtHome(Dog d){
	System.out.println("在加吃饭了");
	d.eat();
}*/
  public void eatAtHome(Animal a){
	  System.out.println("在加吃饭了");
  a.eat();
  }
  //方法参数是Animal  但是Animal不能创建对象
  //可以传入其子类对象  方法运行的是类重写后的方法
 
}
