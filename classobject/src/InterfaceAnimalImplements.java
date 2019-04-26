public class InterfaceAnimalImplements  implements InterfaceAnimal{
   public void eat(){
      System.out.println("Mammal eats");
   }
 
   public void travel(){
      System.out.println("Mammal travels");
   } 
 
   public int noOfLegs(){
      return 0;
   }
 
   public static void main(String args[]){
      InterfaceAnimalImplements m = new InterfaceAnimalImplements();
      m.eat();
      m.travel();
   }
}