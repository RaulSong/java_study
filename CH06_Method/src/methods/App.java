package methods;

public class App {
	public static void main(String[] args) {
		Person p1=new Person();
		System.out.println(p1.name);//���� �ڷ��� String�� null���� �ʱⰪ
		System.out.println(p1.age);//int�� 0 �ʱⰪ
		
		p1.sayHello();//�޼ҵ� ȣ��
		p1.name="Saka";
		p1.age=21;
		
		System.out.println(p1.name);
		System.out.println(p1.age);		
		p1.sayHello();
		
		Person p2=new Person();
		p2.name="Partey";
		Person p3=new Person();
		p3.name="Ramsdale";
		
		p2.sayHello();
		p3.sayHello();
	
	}
}
