package NesneYonelimliJavaOdev;

public class Sarjor 
{
	public int mermiSayisi;
	public int mermiKapasitesi;
	
	public Sarjor(int mermiSayisi, int mermiKapasitesi) 
	{
		this.mermiSayisi = mermiSayisi;
		this.mermiKapasitesi = mermiKapasitesi;
	}
	
	public void mermiAtesle() 
	{
		this.mermiSayisi--;
		System.out.println("Mermi ateþlendi.");
		System.out.println("Mermi sayisi: " + this.mermiSayisi + "/" + this.mermiKapasitesi);
		System.out.println("------------------");
	}
	
	public void sarjorDoldur() 
	{
		this.mermiSayisi++;
		if (this.mermiSayisi >= this.mermiKapasitesi) 
		{
			this.mermiSayisi = this.mermiKapasitesi;
			System.out.println("Sarjor zaten dolu.");
		}
		else 
		{
			System.out.println("Mermi dolduruldu.");
		}
		System.out.println("Mermi sayisi: " + this.mermiSayisi + "/" + this.mermiKapasitesi);
		System.out.println("------------------");
	}
}
