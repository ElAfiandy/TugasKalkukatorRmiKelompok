package rmikalkulatorpart5;

import java.rmi.Naming;
import java.util.Scanner;

public class KalClient {

    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        try {
            CalciInterface c = (CalciInterface) Naming.lookup("rmi://localhost:1099/KalkulatorRmi");
            System.out.println("Client terhubung ke Server");
            System.out.print("Kalkulator : Pilih operasi perhitungan :\n"
                    + "1. Penjumlahan \n"
                    + "2. Pengurangan \n"
                    + "3. Perkalian \n"
                    + "4. Pembagian \n"
                    + "Pilih salah satu operasi :");
            int co = s.nextInt();
            double a, b;
            switch (co) {
                case 1: {
                    System.out.print("Masukan Angka Pertama :");
                    a = s.nextDouble();

                    System.out.print("Masukan Angka Kedua :");
                    b = s.nextDouble();
                    System.out.println("Hasil dari " + a + " ditambah " + b + " adalah : " + c.add(a, b));
                    break;
                }
                case 2: {
                    System.out.print("Masukan Angka Pertama :");
                    a = s.nextDouble();
                    System.out.print("Masukan Angka Kedua :");
                    b = s.nextDouble();
                    System.out.println("Hasil dari " + a + " dikurang " + b + " adalah : " + c.sub(a, b));
                    break;
                }
                case 3: {
                    System.out.print("Masukan Angka Pertama :");
                    a = s.nextDouble();

                    System.out.print("Masukan Angka Kedua :");
                    b = s.nextDouble();
                    System.out.println("Hasil dari " + a + " dikali " + b + " adalah : " + c.mul(a, b));
                    break;
                }
                case 4: {
                    System.out.print("Masukan Angka Pertama :");
                    a = s.nextDouble();

                    System.out.print("Masukan Angka Kedua :");
                    b = s.nextDouble();
                    System.out.println("Hasil dari " + a + " dibagi " + b + " adalah : " + c.div(a, b));
                    break;
                }

            }
        } catch (Exception e) {

            System.out.println("exception :" + e);

        }
    }
}
