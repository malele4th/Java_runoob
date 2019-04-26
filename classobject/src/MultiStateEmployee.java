
public class MultiStateEmployee {
   public static void main(String [] args) {
	      Salary s = new Salary("员工 A", "北京", 3, 3600.00);
	      Employee e = new Salary("员工 B", "上海", 2, 2400.00);
	      System.out.println("使用 Salary 的引用调用 mailCheck -- ");
	      s.mailCheck();
	      System.out.println("\n使用 Employee 的引用调用 mailCheck--");
	      e.mailCheck();
	    }
}

class Employee {
   private String name;
   private String address;
   private int number;
   public Employee(String name, String address, int number) {
      System.out.println("Employee 构造函数");
      this.name = name;
      this.address = address;
      this.number = number;
   }
   public void mailCheck() {
      System.out.println("Employee类，邮寄支票给： " + this.name + " " + this.address);
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
   private double salary; // 全年工资
   public Salary(String name, String address, int number, double salary) {
       super(name, address, number);
	   System.out.println("Salary 构造函数");
       setSalary(salary);
   }
   public void mailCheck() {
       System.out.println("Salary 类的 mailCheck 方法 ");
       System.out.println("Salary类，邮寄支票给：" + getName() + " ，工资为：" + salary);
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
      System.out.println("计算工资，付给：" + getName());
      return salary/52;
   }
}