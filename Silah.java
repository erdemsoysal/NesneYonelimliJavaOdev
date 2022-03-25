package NesneYonelimliJavaOdev;
import java.util.Scanner;

public class Silah 
{
	int menzil;
	static int hedefMenzili;
	
	Sarjor sarjorSinifi = new Sarjor(20,20);
	
	
	public static void main(String[] args) 
	{
		
		Silah silahSinifi = new Silah(50);
		Scanner scan = new Scanner(System.in);
		
		while (true) 
		{
			
			
			
			System.out.println("Lütfen ne yapmak istediðinizi sayi ile giriniz.");
			System.out.println("1-Ates Et");
			System.out.println("2-Silahi doldur");
			System.out.println("3-Silahi birak.");
			int neYapilsin = scan.nextInt();
			
			
			if (neYapilsin == 1) 
			{	
				System.out.println("Hedefiniz ne kadar uzaklikta metre cinsinden giriniz: ");
				hedefMenzili = scan.nextInt();
				
				silahSinifi.silahiAtesle(30);
				continue;
			}
			if (neYapilsin == 2) 
			{
				silahSinifi.sarjorYenile();
				continue;
			}
			if (neYapilsin == 3) 
			{
				System.out.println("Silah birakildi.");
				break;
			}
		}
		
	}
	
	public Silah(int menzil) 
	{
		this.menzil = menzil;
	}
	public void silahiAtesle(int girilenHedefMenzili) 
	{
		girilenHedefMenzili = hedefMenzili;
		if (this.menzil >= hedefMenzili) 
		{
			sarjorSinifi.mermiAtesle();
		}
		//if(this.menzil < this.hedefMenzili) 
		else
		{
			System.out.println("Hedef menzilinizden uzakta.");
			System.out.println("------------------");
		}
	}
	
	public void sarjorYenile() 
	{
		sarjorSinifi.sarjorDoldur();
	}
	
	

}
