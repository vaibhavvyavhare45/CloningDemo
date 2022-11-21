package shallow_cloning;

public class Employee implements Cloneable {
	int id;
	String name;
	Address address;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Address a=new Address(101,"pune");
		Employee e1=new Employee(1001,"Ram",a);
		Employee e2=null;
		
		 e2=(Employee) e1.clone();
		
		
		
		System.out.println("before city change of e1: "+e1);
		System.out.println("before city change of e2: "+e2);
		e1.getAddress().setCity("mumbai");
		System.out.println("After city change of e1: "+e1);
		System.out.println("After city change of e2: "+e2);
		
		
	}
	

}
