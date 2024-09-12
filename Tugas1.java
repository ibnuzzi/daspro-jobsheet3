import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tarifPerKWh = 1500, penggunaanListrik , totalTagihan;
        boolean cek;

        System.out.print("Masukkan jumlah penggunaan listrik (kWh): ");
        penggunaanListrik = scanner.nextInt();
        
        totalTagihan = penggunaanListrik * tarifPerKWh;
        cek = penggunaanListrik > 500;

        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        System.out.println("Apakah penggunaan listrik apakah melebihi 500 kWh " + cek);
    }
}
