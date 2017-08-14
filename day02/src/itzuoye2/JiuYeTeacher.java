package itzuoye2;



public class JiuYeTeacher extends Person {
	public JiuYeTeacher(){ 
	 }
	 public JiuYeTeacher(String name,int age){
		 super(name,age);
	 }
	@Override
	public void teach() {
		// TODO Auto-generated method stub
	System.out.println("就业班老师讲Android");
	}

}
