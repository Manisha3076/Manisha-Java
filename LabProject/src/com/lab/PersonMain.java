package com.lab;

public class PersonMain {
	
	public static void main(String...args)
	{
		Address add=new Address();
		
		add.setHouseno("A101");
		add.setArea("Hadapsar");
		add.setCity("Pune");
		add.setPin("1009");
		
		
		Person s=new Person("XYZ",20,add,"0987654321");
		//Employee emp=new Employee();
		
		/*s.setName("XYZ");
		s.setAddress("Mumbai");
		s.setAge(19);
		s.setMob("9876543");*/
		System.out.println(s.getINSTITUTE_NAME());
		System.out.println(s.getName());
		add=s.getAddress();
		System.out.println(add.getHouseno());
		System.out.println(add.getArea());
		System.out.println(add.getCity());
		System.out.println(add.getPin());
		System.out.println(s.getAge());
		System.out.println(s.getMob());
		//System.out.println(s.getRollno());
		//System.out.println(s.getStandard());
		//System.out.println(s.getSubject());
		 s.display();
		
		
		
	}

}
