package basics;

public class Cat extends Animals {
	
	public Cat(){
		
		
	}
	
		public String makeSound(){
		
		return "Meoowwwwww";
	}

		public static void main(String[] args) { 
			
			Animals fido = new Dog();
			Animals fluffy = new Cat();
			
			Animals[] theAnimals = new Animals[10];
			
			theAnimals[0] = fido;
			theAnimals[1] = fluffy;
			
			System.out.println("Fido says " + theAnimals[0].makeSound());
			System.out.println("Fluffy says " + theAnimals[1].makeSound());
			
			speakAnimal(fluffy);
		}


}
