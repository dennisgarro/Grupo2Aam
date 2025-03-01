import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int opt = 0, d = 0;
            boolean bandera = true;
            while (bandera) {
                System.out.println("Ingrese el punto que desea validar");
                while (!sc.hasNextInt()) {
                    System.out.println("por favor ingrese un dato numerico");
                    sc.next();
                }
                opt = sc.nextInt();
                System.out.println("ingrese la dimension de la matriz");
                while (!sc.hasNextInt()) {
                    System.out.println("la dimension de la matriz debe ser numerica");
                    sc.next();
                }
                d = sc.nextInt();
                switch (opt) {
                    case 1:
                       
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        
                        break;
                    case 6:

                        // Ejemplo de uso para el punto 6
                        ProductoP6[][] supermercado = {
                                {new ProductoP6("Producto1", "leva", 10.0, 1), new ProductoP6("Producto2","freno", 20.0, 1)},
                                {new ProductoP6("Producto3","aceite", 15.0, 0), new ProductoP6("Producto4","manubrio", 25.0, 0)}
                        };

                        Metodos.punto6(supermercado);
                        
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;

                    default:
                        break;
                }
            }
        }

    }
}