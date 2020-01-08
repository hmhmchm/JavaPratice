public class Person {
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void show() {
		System.out.printf("사람(이름=%s, 나이 =%d)\n", name, age);
	}
}


public class Student extends Person {
	protected int stuNum; //학번

	public Student(String name, int age, int stuNum) {
		super(name, age);
		this.stuNum = stuNum;
	}

	public int getStuNum() {
		return stuNum;
	}
	
	public void show() {
		System.out.printf("학생(이름=%s, 나이=%d, 학번=%d)\n",name,age,stuNum);
	}
}


public class ForeignStudent extends Student {
	protected String country; //국적

	public ForeignStudent(String name, int age, int stuNum, String country) {
		super(name, age, stuNum);
		this.country = country;
	}

	public String getCountry() {
		return country;
	}
	
	public void show() {
		System.out.printf("외국학생(이름=%s, 나이=%d, 학번=%d, 국적=%s)\n",name,age,stuNum,country);
	}
  
}

public class TestPerson {

	public static void main(String[] args) {
		
		Person p[] = new Person[3];
				
		p[0] = new Person("길동이", 22);
		p[1] = new Student("황진이", 23, 100);
		p[2] = new ForeignStudent("Amy", 30, 200, "U.S.A");
			
		for(Person pr : p) {
			pr.show();
		}
	}
}
