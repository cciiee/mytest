package itheima3;

public class Phone {
   private String brand;
   public void call(){
	   System.out.println("打电话");
   }
   public void sendMessage(){
	   System.out.println("发短信");
   }
   public void numberShow(){
	   System.out.println("来电显示");
   }
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
   
}
