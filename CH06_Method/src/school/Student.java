package school;

public class Student {
	//변수
	private String name;
	private int age;
	private boolean isVisible;
	private double temperature;
	
	public Student() {
		//기본 생성자
		name = "이름 모름";
		age = 18;
		isVisible = false;
		temperature = 36.0;
	}
	
	//생성자 (이름, 나이, 집체, 체온)
	public Student(String name, int age, boolean isVisible, double temperature) {
		this.name = name;
		this.age = age;
		this.isVisible = isVisible;
		this.temperature = temperature;
	}


	//getter, setter 자동
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
		return "Student [이름 : " + name + ", 나이 : " + age + ", 집체 : " + isVisible + ", 체온 : " + temperature
				+ "]";
	}
	
	


}
