package itheima9;

public class JavaEE extends Developer{
public JavaEE(){
}
public JavaEE(String name,String id){
	super(name,id);
}
   @Override
   public void work(){
	   System.out.println("Ա����Ϊ"+getId()+"��"+getName()+"Ա��,�����з��Ա���վ");
   }
}
