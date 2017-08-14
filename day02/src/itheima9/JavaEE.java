package itheima9;

public class JavaEE extends Developer{
public JavaEE(){
}
public JavaEE(String name,String id){
	super(name,id);
}
   @Override
   public void work(){
	   System.out.println("员工号为"+getId()+"的"+getName()+"员工,正在研发淘宝网站");
   }
}
