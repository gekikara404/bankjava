import java.util.Scanner;
import java.io.*;



class Tabungan{
	public static void main(String[] args) {
		
		char Tabungan;
		int isi = 0;
		int tabungan;
		String totalbaru;
		int total;

	Scanner ketik = new Scanner(System.in);

	System.out.print("masukan pin : ");
	String pin = ketik.nextLine();

	if(pin.equals ("1234")) {
		System.out.println("-----Menu-----");
		System.out.println("--------------");
		System.out.println("1.cek saldo");
		System.out.println("2.menabung");
		System.out.println("3.Ambil");
		System.out.print("masukan menu anda  : ");
		int menu = ketik.nextInt();

		String pilih;

		switch(menu){
			case 1: pilih = ("cek saldo : ");

	
			try{

			File file = new File("baru.txt");
			Scanner fileinput = new Scanner(file);

		while(fileinput.hasNextLine()){
				isi = fileinput.nextInt();
			}
			fileinput.close();

			
			System.out.print("saldo anda adalah : " + isi);

		}catch(Exception ex){
			ex.printStackTrace();
		}
		break;


		case 2: pilih = ("menabung : ");

		try{

			File file = new File("baru.txt");
			Scanner fileinput = new Scanner(file);

				while(fileinput.hasNextLine()){
				isi = fileinput.nextInt();
			}

			fileinput.close();

			

		}catch(Exception ex){
			ex.printStackTrace();
		}

		System.out.print("masukan tabungan anda : ");
		 tabungan = ketik.nextInt();

		total = isi + tabungan ;

	
		
        totalbaru = Integer.toString(total);
			
			System.out.print("hasil angak dari txt di tambah Tabungan adalah " + total);
		try{
					

			File file = new File("baru.txt");

			FileWriter fw = new FileWriter(file);
		
			
			fw.write(totalbaru);
			fw.close();

		}catch(IOException iox){
			iox.printStackTrace();
		}
		break;

		case 3: pilih = ("Ambil rekening : ");	
		try{

			File file = new File("baru.txt");
			Scanner fileinput = new Scanner(file);

				while(fileinput.hasNextLine()){
				isi = fileinput.nextInt();
			}

			fileinput.close();

			

		}catch(Exception ex){
			ex.printStackTrace();
		}

		System.out.print("masukan Ambil tabungan anda : ");
		 tabungan = ketik.nextInt();

		total = isi - tabungan ;

	
		
        totalbaru = Integer.toString(total);
			
			System.out.print("hasil angak dari txt di tambah Tabungan adalah " + total);
		try{
					

			File file = new File("baru.txt");

			FileWriter fw = new FileWriter(file);
		
			
			fw.write(totalbaru);
			fw.close();

		}catch(IOException iox){
			iox.printStackTrace();
		}

	}
			
	}else{
		System.out.print("pin anda salah");
	}
}
}
