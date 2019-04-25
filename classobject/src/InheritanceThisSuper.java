//this指向自己的引用
//super指向父类的引用
class Animal{
	void eat() {
		System.out.println("animal:eat");
	}
}

class Dog extends Animal{
	void eat() {
		System.out.println("dog:eat");
	}
	void eatTest() {
		this.eat();
		super.eat();
	}
}

public class InheritanceThisSuper {
	public static void main(String [] args) {
		Animal a = new Animal();
		a.eat();
		
		Dog d = new Dog();
		d.eatTest();
	}
}
