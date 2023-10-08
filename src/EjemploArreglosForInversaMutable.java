import java.util.Arrays;

public class EjemploArreglosForInversaMutable {
    public static void main(String[] args) {

        String[] productos = {"Kingston usb 32 gb","Disco Duero Externo 1T","Teclado logintech",
                "Web Cam usb","Hub de usb","Celular Redmi Note 12","Acer TouchScreen"};
        int total = productos.length;

        Arrays.sort(productos);
        System.out.println("=================Usando for=================");
        for (int i = 0; i < total; i++){
            System.out.println("para indice = " +  i + " : " + productos[i]);
        }

        for (int i = 0; i <total/2; i++){
            String actual = productos[i];
            String inverso = productos[total-1-i];
            productos[i] = inverso;
            productos[total-1-i] = actual;

        }







    }
}
