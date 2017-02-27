import java.util.*;
import java.io.*;

class manual{
	public static void main(String[] args) {

		int isi = 0 ;
		int tabungan,total;

		Scanner atm = new Scanner(System.in);

		System.out.print("Masukan pin anda : ");
		String pin = atm.nextLine();

		if (pin.equals("1234")) {

			System.out.println("==============");
			System.out.println("=====Menu=====");
			System.out.println("1.Cek Saldo");
			System.out.println("2.Menabung");
			System.out.println("3.Tarik Tabungan");
			System.out.print("Pilih yang mana : ");
			int pilihan = atm.nextInt();

			String pilih;

			switch(pilihan){
				case 1:

				try{
					File file = new File("baru.txt");
					Scanner fileinput = new Scanner(file);

					while(fileinput.hasNextLine()){
						isi = fileinput.nextInt();
					}

					fileinput.close();

					System.out.print("saldo anda adalah " + isi );

				}catch(Exception ex){
					ex.printStackTrace();
				}
				break;

				case 2:
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

				System.out.print("Masukan yang ingin di tabung : ");
				tabungan = atm.nextInt();
				total = isi + tabungan ;

				String totalbaru = Integer.toString(total);

				System.out.print("Tabungan anda adalah : "+ total);
				try{

					File file = new File("baru.txt");

					FileWriter fw = new FileWriter(file);

					fw.write(totalbaru);
					fw.close();

				}catch(Exception ez){
					ez.printStackTrace();
				}

				break;

				case 3:
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

				System.out.print("Masukan yang ingin di tabung : ");
				tabungan = atm.nextInt();
				total = isi - tabungan ;

				String totalbaru = Integer.toString(total);

				System.out.print("Tabungan anda adalah : "+ total);
				try{

					File file = new File("baru.txt");

					FileWriter fw = new FileWriter(file);

					fw.write(totalbaru);
					fw.close();

				}catch(Exception ez){
					ez.printStackTrace();
				}

				}
			}else{
				System.out.print("Pin anda salah");

			}

	}
}