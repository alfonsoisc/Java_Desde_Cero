import java.util.Scanner;

public class EjemploArreglosNotasAlumnos {
    public static void main(String[] args) {

        double[] classMatematicas, classHistoria, classLenguas;
        double sumNotasMate = 0, sumNotasHist = 0, sumNotasLengua = 0;
        classMatematicas = new double[7];
        classHistoria = new double[7];
        classLenguas = new double[7];

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 notas de matematicas");
        for (int i = 0; i < classMatematicas.length; i++){
            classMatematicas[i] = s.nextDouble();
        }

        System.out.println("Ingrese 7 notas de Historia");
        for (int i = 0; i < classHistoria.length; i++){
            classHistoria[i] = s.nextDouble();
        }

        System.out.println("Ingrese 7 notas de lenguas");
        for (int i = 0; i < classLenguas.length; i++){
            classLenguas[i] = s.nextDouble();
        }

        for (int i = 0; i < 7; i++){
            sumNotasMate += classMatematicas[i];
            sumNotasHist += classHistoria[i];
            sumNotasLengua += classLenguas[i];
        }

        double promedioMate = (sumNotasMate/classMatematicas.length);
        double promedioHist = (sumNotasHist/classHistoria.length);
        double promedioLengua = (sumNotasLengua/classLenguas.length);
        System.out.println("Promedio clase Mate" + promedioMate);
        System.out.println("Promedio clase Historia" + promedioHist);
        System.out.println("Promedio clase Lenguas" + promedioLengua);
        System.out.println("Promedio total el curso" + (promedioMate + promedioHist + promedioLengua)/3);

        System.out.println("Ingrese el identificador del alumno (0 - 6): ");
        int id = s.nextInt();
        double promedioAlumno = (classMatematicas[id] + classHistoria[id] + classLenguas[id]/3);
        System.out.println("Promedio Alumno = " + id + " :" + promedioAlumno);
    }
}
