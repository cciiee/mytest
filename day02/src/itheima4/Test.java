package itheima4;
//���������������������
/*������ÿ�����췽��   ��һ��  ����һ��Ĭ��super()���ø���Ŀղι���
super()���ø���
super(ʵ�ʲ���)���ø������*/
public class Test {
  public static void main(String[] args) {
	Person p=new Person();
	Person p2=new Person("����",30);
	
	Student s=new Student();
	System.out.println("--------");
	Student s2=new Student ("����",28,"34232");
	System.out.println(s2.getName()+" "+s2.getAge()+" "+s2.getNumber());
  }
}
