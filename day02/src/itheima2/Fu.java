package itheima2;

import itheima.Chinese;
import itheima.Person;
//方法重写 
//     前提  必须有继承关系
//     注意事项
//        可以通过@Override来检验是否为方法重写
//   子类重写方法的权限一定要大于等于父类方法的权限
//   3推荐    方法声明完全一致   方法参数   返回值类型   完全一致
public class Fu {
     public void method(){
    	 System.out.println("Fu");
     }
     public Person method2(){
    	 return new Person();
     }
}
