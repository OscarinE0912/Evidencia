package EvidenciaFinal;

import java.util.Scanner;

public class Metodo_Biseccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Variables Iniciales
        int iteracion = 0;
        double xa = 0, xb = 0, xr = 0, Ea=100, fxr_fxa = 0, aux;

        //Pedir datos iniciales
        System.out.println("Ingresa el xa:");
            xa = scanner.nextDouble();
        System.out.println("Ingresa el xb:");
            xb = scanner.nextDouble();

        //Iniciar Iteración
        do{
            aux = xr;
            //Obtener el resultado de xr
            xr = (xa+xb)/2;

            //Calcular error
            if (iteracion > 0) {
                Ea = Error(xr, aux);
            }

            //Hacer la funcion de xa
            double fxa = Funcion(xa);

            //Hacer la funcion de xr
            double fxr = Funcion(xr);

            //Hacer la multiplicacion de funciones
            fxr_fxa = fxa*fxr;

            System.out.printf("Iteración %d: xa=%.6f xb=%.6f xr=%.6f f(xa)=%.6f f(xr)=%.6f fxa*fxr=%.6f Ea=%.6f%%\n",
            iteracion + 1, xa, xb, xr, fxa, fxr, fxr_fxa, Ea * 100);

            
            // Decidir nuevo intervalo
            if (fxr_fxa < 0) {
                xb = xr;
            } else {
                xa = xr;
            }

            iteracion++;
            
        } while (Ea > 0.01);
    }

    //Función del problema
    public static double Funcion(double num){
        return Math.pow(num, 3) - (4 * num) - 9;
    }

    //Error Porcentual
    public static double Error(double xr, double aux){
        return Math.abs((aux-xr)/aux);
    }
}
