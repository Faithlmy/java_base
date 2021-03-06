package Inheritance2;

import static java.lang.System.*;

public class PlateSetting  extends Custom  {

	 Spoon sp;
	 Fork frk;
	 Knife kn;
	 DinnerPlate pl;
	 PlateSetting(int i) {
		 super(i + 1);
		 sp = new Spoon(i + 2);
		 frk = new Fork(i + 3);
		 kn = new Knife(i + 4);
		 pl = new DinnerPlate(i + 5);
		 System.out.println("PlateSetting constructor");
	 }

	 public static void main(String[] args) {
		 PlateSetting ps = new PlateSetting(9);
			
	 }
}

class Plate{
	public Plate(int i) {
		out.println("Plate  constructor");
	}
}

class DinnerPlate extends Plate{
	public DinnerPlate(int i) {
		super(i);
		// TODO Auto-generated constructor stub
		out.println("DinnerPlare constructor");
	}
}

class Utensil {
	 Utensil(int i) {
	 System.out.println("Utensil constructor");
	 }
}

class Spoon extends Utensil {
	 Spoon(int i) {
	 super(i);
	 System.out.println("Spoon constructor");
	 }
}

class Fork extends Utensil {
	 Fork(int i) {
	 super(i);
	 System.out.println("Fork constructor");
	 }
}

class Knife extends Utensil {
	 Knife(int i) {
	 super(i);
	 System.out.println("Knife constructor");
	 }
}
	// A cultural way of doing something:
class Custom {
	 Custom(int i) {
	 System.out.println("Custom constructor");
	 }
}


	
	
	
	
	
	