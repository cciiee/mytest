package itheima2;
import itheima.Chinese;
import itheima.Person;

public class Zi extends Fu {
   @Override
   public void method(){
	   System.out.println("Zi");
   }
   @Override
   public Chinese method2(){
	   return new Chinese();
   }
}
