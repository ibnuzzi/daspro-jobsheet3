import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jamKerja, upahPerJam, totalGaji, bonus, totalGajiDenganBonus, pajak, gajiBersih;

        System.out.print("Masukkan jumlah jam kerja: ");
        jamKerja = input.nextDouble();

        System.out.print("Masukkan upah per jam (Rp): ");
        upahPerJam = input.nextDouble();

        totalGaji = jamKerja * upahPerJam;
        bonus = totalGaji * 0.10;
        totalGajiDenganBonus = totalGaji + bonus;
        pajak = totalGajiDenganBonus * 0.05;
        gajiBersih = totalGajiDenganBonus - pajak;

        System.out.println("\n--- Rincian Gaji Karyawan ---");
        System.out.println("Total gaji sebelum pajak: Rp " + totalGaji);
        System.out.println("Bonus: Rp " + bonus);
        System.out.println("Total gaji setelah bonus: Rp " + totalGajiDenganBonus);
        System.out.println("Pajak yang dikenakan: Rp " + pajak);
        System.out.println("Total gaji bersih setelah pajak: Rp " + gajiBersih);
    }
}
