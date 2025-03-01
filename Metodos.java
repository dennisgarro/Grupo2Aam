
public class Metodos {
    
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
                    System.out.println("Nombre: " + ProductoP6.getNombre() + ", Precio: " + ProductoP6.getPrecio() + ", Disponibilidad: " + ProductoP6.getDisponibilidad());
                }
            }

            return disponibles;
        }
    }
    //----------------------------------------------------------------------------------------------------------------
    
