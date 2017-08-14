package itheima;
//方法重写,当子类继承父类后,拥有了父类所以可继承的属性和行为,但是子类如果觉得父类的方法
//不够强大,可以按照自身的逻辑   重新定义此方法. 方法重写  方法重写   方法覆盖
public class Chinese extends Person{
    public void eat(){
    	System.out.println("中国人使用筷子吃饭");
    }
}
