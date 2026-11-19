
import java.util.Scanner;

public class SIAKAD28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahMahasiswa, jumlahMataKuliah;
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = input.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        jumlahMataKuliah = input.nextInt();

        int nilai[][] = new int[jumlahMahasiswa][jumlahMataKuliah];
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + " : ");
                nilai[i][j] = input.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata mahasiswa: " + totalPerSiswa / nilai[i].length);
        }

        System.out.println("Rata-rata nilai setiap mata kuliah: ");
        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j + 1) + " : " + totalPerMatkul / nilai.length);
        }

        input.close();
    }
}
