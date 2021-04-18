package kasus3;

public class Itachi extends Rikudo{
	private String KekkeiGenkai = "Susanoo";
	private String Dojutsu = super.Dojutsu;
	
	void printKekkeiGenkai() {
	System.out.println(this.KekkeiGenkai);
	}
	
	void printDojutsu() {
	System.out.println(this.Dojutsu);
	setDojutsu(); //Memanggil method untuk mengubah string Dojutsu yang asalnya "Rinnegan" menjadi "Mangekyou Sharingan"
	System.out.println(this.Dojutsu);
	}
	
	private void setDojutsu() {
	this.Dojutsu = "Mangekyou Sharingan";
	}
}
