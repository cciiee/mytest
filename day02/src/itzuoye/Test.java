package itzuoye;
/*1����������������´��루ֻ�ü̳У����ó����࣬���ձ�׼��ʽд�������ڲ������н��в��ԡ�
����һ��
	��֪ѧ�������ʦ�����£�
		����:����,����
		��Ϊ:�Է�
		��ʦ�����еķ���:����
		ѧ�������еķ���:ѧϰ
�������
	��֪è��͹��ࣺ
		����:ë����ɫ,�ȵĸ���
		��Ϊ:�Է�
		è������Ϊ:ץ����catchMouse
		��������Ϊ:����lookHome*/
public class Test {
 public static void main(String[] args) {
    Student s=new Student("����",22);
    s.eat();
    s.study();
    System.out.println(s.getName()+" "+s.getAge());
    System.out.println("-------");
    Teacher t=new Teacher("����",111);
    t.eat();
    t.teach();
    System.out.println(t.getName()+" "+t.getAge());
}
}
