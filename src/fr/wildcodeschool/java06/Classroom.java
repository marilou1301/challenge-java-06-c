package fr.wildcodeschool.java06;

public class Classroom {
	
	public static void main(String[] args) {
	
	boolean awareYes=true;
	//Instance de Wilders / les testeurs
	Wilder Vanouna = new Wilder("Vanouna",awareYes);
	Wilder Julien = new Wilder("Julien",awareYes);
	Wilder Jorys = new Wilder("Jorys",awareYes);
	Wilder Abdé = new Wilder("Abdé",awareYes);
	Wilder Marie = new Wilder("Marie",!awareYes);
	
	
	System.out.println(Vanouna.whoAmI());	
	System.out.println(Marie.whoAmI());
	System.out.println(Abdé.whoAmI());
	System.out.println(Julien.whoAmI());
	System.out.println(Jorys.whoAmI());
	
	}

}