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
                        Punto3 p3 = new Punto3();
                        p3.Punto3(d);
                        break;
                    case 4:
                        break;
                    case 5:

                        break;
                    case 6:

                        // Ejemplo de uso para el punto 6
                        ProductoP6[][] matriz = Metodos.LlenarMatrizp6(d);
                        Metodos.punto6(matriz);

                        break;
                    case 7:
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Ingrese la cantidad de estudiantes:");
                        int cantidadEstudiantes = scanner.nextInt();
                        scanner.nextLine();
                        Estudiante[][] estudiantes = new Estudiante[cantidadEstudiantes][1];
                        for (int i = 0; i < cantidadEstudiantes; i++) {
                            System.out.println("Ingrese el nombre del estudiante:");
                            String nombre = scanner.nextLine();
                            System.out.println("Ingrese el apellido del estudiante:");
                            String apellido = scanner.nextLine();
                            System.out.println("Ingrese el carnet del estudiante:");
                            String carnet = scanner.nextLine();
                            System.out.println("Ingrese el semestre del estudiante:");
                            int semestre = scanner.nextInt();
                            System.out.println("Ingrese el promedio del estudiante:");
                            double promedio = scanner.nextDouble();
                            scanner.nextLine();
                            estudiantes[i][0] = new Estudiante(nombre, apellido, carnet, semestre, promedio);
                        }

                        Estudiante[][] mayoresQueCuatro = new Estudiante[cantidadEstudiantes][1];
                        Estudiante[][] entreTresYCuatro = new Estudiante[cantidadEstudiantes][1];
                        Estudiante[][] menoresQueTres = new Estudiante[cantidadEstudiantes][1];

                        int contMayores = 0;
                        int contEntre = 0;
                        int contMenores = 0;

                        for (int i = 0; i < cantidadEstudiantes; i++) {
                            double promedio = estudiantes[i][0].getPromedio();
                            if (promedio > 4) {
                                mayoresQueCuatro[contMayores][0] = estudiantes[i][0];
                                contMayores++;
                            } else if (promedio >= 3) {
                                entreTresYCuatro[contEntre][0] = estudiantes[i][0];
                                contEntre++;
                            } else {
                                menoresQueTres[contMenores][0] = estudiantes[i][0];
                                contMenores++;
                            }
                        }

                        MostrarResultados(mayoresQueCuatro, contMayores, entreTresYCuatro, contEntre, menoresQueTres,
                                contMenores);

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

    public static void MostrarResultados(Estudiante[][] mayoresQueCuatro, int contMayores,
            Estudiante[][] entreTresYCuatro, int contEntre,
            Estudiante[][] menoresQueTres, int contMenores) {
        System.out.println("\nEstudiantes con promedio superior a 4:");
        for (int i = 0; i < contMayores; i++) {
            System.out.println(mayoresQueCuatro[i][0]);
        }

        System.out.println("\nEstudiantes con promedio entre 3 y 4:");
        for (int i = 0; i < contEntre; i++) {
            System.out.println(entreTresYCuatro[i][0]);
        }

        System.out.println("\nEstudiantes con promedio inferior a 3:");
        for (int i = 0; i < contMenores; i++) {
            System.out.println(menoresQueTres[i][0]);
        }
    }
}
