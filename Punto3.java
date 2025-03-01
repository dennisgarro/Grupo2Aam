import java.util.Scanner;

public class Punto3 {

    public void Punto3 (int d) {
        Scanner sc = new Scanner(System.in); 

            ObjBiblioteca M = new ObjBiblioteca();
            ObjBiblioteca[][] m = M.LlenarMatrizLibreria(d);
            M.MostrarMatrizLibreria(m);
            System.out.println(M.LibroMayorPrecio(m));
            
    } 
}