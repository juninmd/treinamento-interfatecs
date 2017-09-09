
import java.util.Scanner;

public class Vizinhanca {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int coluna = scanner.nextInt();
        int largura = scanner.nextInt();
        String[][] lotes = new String[coluna][largura];

        for (int c = 0; c < coluna; c++) {
            for (int l = 0; l < largura; l++) {
                lotes[c][l] = scanner.next();
            }
        }

        for (int c = 0; c < coluna; c++) {
            for (int l = 0; l < largura; l++) {
                System.out.println(lotes[c][l]);
            }
        }
    }
}
