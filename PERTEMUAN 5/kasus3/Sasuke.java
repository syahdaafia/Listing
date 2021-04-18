package kasus3;

public class Sasuke extends Itachi {
	String Dojutsu = "Sharingan";
	
	void printDojutsu() {
	super.printDojutsu();//memanggil method dari superclassnya yaitu itachi untuk menampilkan string "Rinnegan" dan "Mangekyou Sharingan"
	System.out.println(this.Dojutsu);
	}
}
