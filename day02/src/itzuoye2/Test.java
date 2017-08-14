package itzuoye2;
/*2、根据需求，完成如下代码（使用抽象类/接口 按照标准格式写），并在测试类中进行测试。
需求一：
	具体事物：基础班老师，就业班老师
	共性：姓名，年龄，讲课。
	特性：
		基础班老师讲JavaSE
		就业班老师讲Android
需求二：
	已知接口Play中有一个方法playGame()，再测试类中如何调用该方法？*/
public class Test {
 public static void main(String[] args) {
	 JiuYeTeacher t1=new JiuYeTeacher();
	 JiChuTeacher t2=new JiChuTeacher();
	 t1.teach();
	 t2.teach();
	 
}
}
