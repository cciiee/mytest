package itheima5;
//����һ��Person����,�������һ������,��������������,����  38
//�ٴ���һ��person����,�������һ������,��������������  ���� 18  ���Ǵ���
//�����ͬʱ   ��ӡn��  hello
//this ���ñ��������Ĺ��췽��
//this��super ���ù��췽��ʱ��,��Ҫ�ڵ�һ��   ���ܹ���
public class Test {
  public static void main(String[] args) {
	Person p=new Person("����",38);
	Person p2=new Person("����",18,10);
	System.out.println(p2.getName());
	System.out.println(p2.getAge());
}
}
