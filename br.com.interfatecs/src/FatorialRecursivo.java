import java.util.Scanner;

public class FatorialRecursivo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int f = 1; 
        int numero = scanner.nextInt();
        while (numero > 1){
            f *= numero;
            numero--;
        }
        System.out.println(f);
    }
}
