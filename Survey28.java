import java.util.Scanner;
class Daspro10_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int survey[][] = new int[10][6];
        String responden[] = {"Doni", "Anto", "Putri", "Bagas", "Fitri", "Mulyo", "Tono", "Andini", "Purnomo", "Agus"};
        double rataRata;
        double totalSurvey = 0;
        for (int i = 0; i < survey.length; i++) {
            System.out.println("Responden " + responden[i]);
            for (int j = 0; j < survey[i].length; j++) {
                System.out.print("Pertanyaan ke " + (j + 1) + " : ");
                survey[i][j] = input.nextInt();
                while (survey[i][j] < 1 || survey[i][j] > 5) {
                    System.out.println("Nilai tidak valid, angka harus bernilai (1-5) Mohon ulangi input: ");
                    survey[i][j] = input.nextInt();
                }
            }
        }
        for (int i = 0; i < survey.length; i++) {
            int total = 0;
            for (int j = 0; j < survey[i].length; j++) {
                total += survey[i][j];
            }
            rataRata = (double) total / survey[i].length;
            System.out.println("Responden: " + responden[i] + " = " + rataRata);
        }
        for (int j = 0; j < survey[0].length; j++) {
            int total = 0;
            for (int i = 0; i < survey.length; i++) {
                total += survey[i][j];
            }
            rataRata = (double) total / survey.length;
            System.out.println("Pertanyaan: " + (j + 1) + " = " + rataRata);
        }
        for (int i = 0; i < survey.length; i++) {
            for (int j = 0; j < survey[i].length; j++) {
                totalSurvey += survey[i][j];
            }
        }
        rataRata = (double) totalSurvey / (survey.length * survey[0].length);
        System.out.println("Total Survey = " + totalSurvey);
        System.out.println("Rata Rata = " + rataRata);
        input.close();
    }
}