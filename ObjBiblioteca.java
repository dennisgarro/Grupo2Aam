import java.util.Scanner;

public class ObjBiblioteca {
    private String Titulo;
    private String Autor;
    private int AñoP;
    private double Precio;

    public ObjBiblioteca() {
    }

    public ObjBiblioteca(String titulo, String autor, int añoP, double precio) {
        Titulo = titulo;
        Autor = autor;
        AñoP = añoP;
        Precio = precio;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getAñoP() {
        return AñoP;
    }

    public void setAñoP(int añoP) {
        AñoP = añoP;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public ObjBiblioteca[][] LlenarMatrizLibreria(int d) {
        ObjBiblioteca[][] m = new ObjBiblioteca[d][d];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjBiblioteca o = new ObjBiblioteca();
                System.out.println("Ingrese el Titulo: ");
                o.setTitulo(sc.next());
                System.out.println("Ingrese el Autor: ");
                o.setAutor(sc.next());
                System.out.println("Ingrese el año de publicación del libro: ");
                o.setAñoP(sc.nextInt());
                System.out.println("Ingrese el Precio: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("el valor del precio es incorrecto");
                    sc.next();
                }
                o.setPrecio(sc.nextDouble());
                m[i][j] = o;
            }
        }
        return m;
    }

    public void MostrarMatrizLibreria(ObjBiblioteca[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                System.out.println("\n Titulo: " + m[i][j].getTitulo());
                System.out.println("\n Autor: " + m[i][j].getAutor());
                System.out.println("\n Año de publicación del libro: " + m[i][j].getAñoP());
                System.out.println("\n Precio: " + m[i][j].getPrecio());
                System.out.println("\n");
            }
        }
    }

    public String LibroMayorPrecio(ObjBiblioteca[][] m) {
        Double libroMayor = 0.0;
        ObjBiblioteca o = new ObjBiblioteca();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getPrecio() > libroMayor) {

                    libroMayor = m[i][j].getPrecio();
                    o.setTitulo(m[i][j].getTitulo());
                    o.setAutor(m[i][j].getAutor());
                    o.setPrecio(m[i][j].getPrecio());
                    o.setAñoP(m[i][j].getAñoP());
                }
            }
        }
        return "el libro con mayor valor es: " + libroMayor + "\nCon titulo: " + o.getTitulo() + "\nel autor es: "
                + o.getAutor() + "\ny el año de publicación es: " + o.getAñoP();
    }
}