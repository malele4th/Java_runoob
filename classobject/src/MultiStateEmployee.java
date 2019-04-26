
public class MultiStateEmployee {
   public static void main(String [] args) {
	      Salary s = new Salary("Ա�� A", "����", 3, 3600.00);
	      Employee e = new Salary("Ա�� B", "�Ϻ�", 2, 2400.00);
	      System.out.println("ʹ�� Salary �����õ��� mailCheck -- ");
	      s.mailCheck();
	      System.out.println("\nʹ�� Employee �����õ��� mailCheck--");
	      e.mailCheck();
	    }
}

class Employee {
   private String name;
   private String address;
   private int number;
   public Employee(String name, String address, int number) {
      System.out.println("Employee ���캯��");
      this.name = name;
      this.address = address;
      this.number = number;
   }
   public void mailCheck() {
      System.out.println("Employee�࣬�ʼ�֧Ʊ���� " + this.name + " " + this.address);
   }
   public String toString() {
      return name + " " + address + " " + number;
   }
   public String getName() {
      return name;
   }
   public String getAddress() {
      return address;
   }
   public void setAddress(String newAddress) {
      address = newAddress;
   }
   public int getNumber() {
     return number;
   }
}

class Salary extends Employee
{
   private double salary; // ȫ�깤��
   public Salary(String name, String address, int number, double salary) {
       super(name, address, number);
	   System.out.println("Salary ���캯��");
       setSalary(salary);
   }
   public void mailCheck() {
       System.out.println("Salary ��� mailCheck ���� ");
       System.out.println("Salary�࣬�ʼ�֧Ʊ����" + getName() + " ������Ϊ��" + salary);
   }
   public double getSalary() {
       return salary;
   }
   public void setSalary(double newSalary) {
       if(newSalary >= 0.0) {
          salary = newSalary;
       }
   }
   public double computePay() {
      System.out.println("���㹤�ʣ�������" + getName());
      return salary/52;
   }
}