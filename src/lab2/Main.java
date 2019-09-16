package lab2;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee();
		Employee f = new Employee("Huzaifah", 99, 99);
		
		System.out.printf("The pay for %s is $%.2f\n", f.getName(), f.getPay());
		System.out.printf("The pay for %s is $%.2f\n", e.getName(), e.getPay());
		
		
		
	}

}
