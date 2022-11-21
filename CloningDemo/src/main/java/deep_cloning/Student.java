package deep_cloning;

public class Student implements Cloneable {
	int rollno;
	String name;
	Address address;
	public Student() {
		super();
	}
	public Student(int rollno, String name, Address address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student dummy= (Student) super.clone();
		dummy.setAddress((Address) dummy.getAddress().clone());
		return dummy;
	}
	
		
	
	

}
