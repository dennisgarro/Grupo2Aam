import java.util.Scanner;

public class Metodos {
    
    public static ProductoP6[][] LlenarMatrizp6(int d) {
        ProductoP6[][] m = new ProductoP6[d][d];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ProductoP6 o = new ProductoP6();
                System.out.println("Ingrese el nombre: ");
                o.setNombre(sc.next());
                System.out.println("Ingrese la descripcion: ");
                o.setDescripcion(sc.next());
                System.out.println("Ingrese el precio: ");
                o.setPrecio(sc.nextDouble());
                System.out.println("Ingrese la disponibilidad: ");
                o.setDisponibilidad(sc.nextInt());
                m[i][j] = o;
            }
        }
        return m;
    }
    
        // Método para el punto 6-----------------------------------------------------------------------------------------
        public static ProductoP6[][] punto6(ProductoP6[][] supermercado) {
            // Contar cuántos ProductoP6s están disponibles
            int contador = 0;
            for (ProductoP6[] fila : supermercado) {
                for (ProductoP6 ProductoP6 : fila) {
                    if (ProductoP6.getDisponibilidad() == 1) {
                        contador++;
                    }
                }
            }

            // Crear una nueva matriz para los ProductoP6s disponibles
            ProductoP6[][] disponibles = new ProductoP6[contador][1];
            int index = 0;

            // Llenar la nueva matriz con los ProductoP6s disponibles
            for (ProductoP6[] fila : supermercado) {
                for (ProductoP6 ProductoP6 : fila) {
                    if (ProductoP6.getDisponibilidad() == 1) {
                        disponibles[index++][0] = ProductoP6;
                    }
                }
            }

            // Imprimir el resultado final
            System.out.println("ProductoP6s disponibles:");
            for (ProductoP6[] fila : disponibles) {
                for (ProductoP6 ProductoP6 : fila) {
                    System.out.println("Descripcion: " + ProductoP6.getDescripcion() + "Nombre: " + ProductoP6.getNombre() + ", Precio: " + ProductoP6.getPrecio());
                }
            }

            return disponibles;
        }
    }
    //----------------------------------------------------------------------------------------------------------------
    
