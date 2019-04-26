
public class AbstractClassTest {
   public static void main(String [] args)
   {
      // Employee1 e = new Employee1("malele", "Beijing", 25); // abstract class 不能实例化
      Salary1 s = new Salary1("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
      Employee1 e = new Salary1("John Adams", "Boston, MA", 2, 2400.00);
 
      System.out.println("Call mailCheck using Salary reference --");
      s.mailCheck();
 
      System.out.println("\n Call mailCheck using Employee reference--");
      e.mailCheck();
   }
}

abstract class Employee1   // 抽象类不能实例化
{
   private String name;
   private String address;
   private int number;
   
   public Employee1(String name, String address, int number)
   {
      System.out.println("Constructing an Employee1");
      this.name = name;
      this.address = address;
      this.number = number;
   }
   public double computePay()
   {
     System.out.println("Inside Employee computePay");
     return 0.0;
   }
   public void mailCheck()
   {
      System.out.println("Mailing a check to " + this.name + " " + this.address);
   }
   public String toString()
   {
      return name + " " + address + " " + number;
   }
   public void setAddress(String newAddress)
   {
      address = newAddress;
   }
   
   public String getName()
   {
      return name;
   }
   public String getAddress()
   {
      return address;
   }
   public int getNumber()
   {
     return number;
   }
}

class Salary1 extends Employee1   // 继承 Employee1的成员方法
{
   private double salary; //Annual salary
   public Salary1(String name, String address, int number, double salary)
   {
       super(name, address, number);
       setSalary(salary);
   }
   public void mailCheck()
   {
       System.out.println("Within mailCheck of Salary class ");
       System.out.println("Mailing check to " + getName() + " with salary " + salary);
   }
   public double getSalary()
   {
       return salary;
   }
   public void setSalary(double newSalary)
   {
       if(newSalary >= 0.0)
       {
          salary = newSalary;
       }
   }
   public double computePay()
   {
      System.out.println("Computing salary pay for " + getName());
      return salary/52;
   }
}