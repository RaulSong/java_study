package school;

public class Student {
	//����
	private String name;
	private int age;
	private boolean isVisible;
	private double temperature;
	
	public Student() {
		//�⺻ ������
		name = "�̸� ��";
		age = 18;
		isVisible = false;
		temperature = 36.0;
	}
	
	//������ (�̸�, ����, ��ü, ü��)
	public Student(String name, int age, boolean isVisible, double temperature) {
		this.name = name;
		this.age = age;
		this.isVisible = isVisible;
		this.temperature = temperature;
	}


	//getter, setter �ڵ�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public double getTeperature() {
		return temperature;
	}
	public void setTeperature(double teperature) {
		this.temperature = teperature;
	}


	@Override
	public String toString() {
		return "Student [�̸� : " + name + ", ���� : " + age + ", ��ü : " + isVisible + ", ü�� : " + temperature
				+ "]";
	}
	
	


}
