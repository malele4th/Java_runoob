package animals;

public class Dog implements Animals{
  public void eat(){
      System.out.println("Mammal eats");
   }
 
   public void travel(){
      System.out.println("Mammal travels");
   } 
   public static void main(String args[]){
      Dog m = new Dog();
      m.eat();
      m.travel();
   }
}
