import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {

    public static void arregloInverso(String[]arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;

        for (int i = 0; i <total/2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;

        }
    }
    public static void main(String[] args) {

        String[] productos = {"Kingston usb 32 gb","Disco Duero Externo 1T","Teclado logintech",
                "Web Cam usb","Hub de usb","Celular Redmi Note 12","Acer TouchScreen"};
        int total = productos.length;

        int contador = 0;

        for (int i = 0; i < total; i++){
            for (int j = 0; j <total; j++){
                if (productos[i].compareTo(productos[j])<0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j]= auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);

        //Arrays.sort(productos);
        System.out.println("=================Usando for=================");
        for (int i = 0; i < total; i++){
            System.out.println("para indice = " +  i + " : " + productos[i]);
        }


    }
}
