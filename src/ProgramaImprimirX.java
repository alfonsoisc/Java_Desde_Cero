import java.util.Scanner;

public class ProgramaImprimirX {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz (nxn): ");
        int n = s.nextInt();

        if (n == 0){
            System.out.println("Error");
            System.exit(1);
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; i++){
                if (i == j || (j == n - i - 1)){
                    System.out.println("X");
                }else {
                    System.out.println("_");
                }
            }
            System.out.println();
        }
    }
}
