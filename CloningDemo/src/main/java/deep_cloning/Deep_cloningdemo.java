package deep_cloning;

public class Deep_cloningdemo {
	public static void main(String[] args) throws CloneNotSupportedException  {
		Address ad=new Address(1002,"pune");
		Student s1=new Student(102,"marish",ad);
		
		 Student s2=(Student) s1.clone();
		
		System.out.println("before city change: "+s1);
		System.out.println("before city change: "+s2);
		
		s1.getAddress().setCity("mumbai");
		
		System.out.println("After city change: "+s1);
		System.out.println("After city change: "+s2);
	}


}
