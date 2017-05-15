import java.util.Scanner; 
public class Zadatak2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Auto[] a= new Auto[5];
		int i;
		for(i=0;i<5;i++){
			a[i].setSer_br(reader.nextLine());
			a[i].setModel(reader.nextLine());
			a[i].setMarka(reader.nextLine());
			a[i].setCijena(reader.nextInt());
			a[i].setPotrosnja(reader.nextFloat());
			a[i].setGodiste(reader.nextInt());
			a[i].setGorivo(reader.nextLine());
		}
		for(i=0;i<5;i++){
		System.out.print("Seriski broj: "+a[i].getSer_br()+"\n Model: "+a[i].getModel()+"\nMarka: "+a[i].getMarka()+"\nCijena: "+a[i].getCijena()+"€\n Potrosnja po km:"+a[i].getPotrosnja()+"l/km\n Godiste: "+a[i].getGodiste()+"\nVrsta goriva: "+a[i].getGorivo());
	}
	}
}
