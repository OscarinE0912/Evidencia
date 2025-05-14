package EvidenciaFinal;

import java.util.Scanner;

public class Metodo_Secante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Variables Iniciales
        int iteracion = 0;
        double xa = 0, xb = 0, xr = 0, Ea=100, fxr_fxa = 0;

        //Pedir datos iniciales
        System.out.println("Ingresa el xa:");
            xa = scanner.nextDouble();
        System.out.println("Ingresa el xb:");
            xb = scanner.nextDouble();

        //Iniciar Iteración
        do{
            //Condicional para cambiar xa o xb
            if (iteracion != 0){
                if(fxr_fxa < 0){
                    xa=xr;
                } else{
                    xb=xr;
                }

            }

            //Obtener el resultado de xr
            xr = (xa+xb)/2;
            System.out.println(xr);

            //Hacer la funcion de xa
            double fxa = Funcion(xa);

            //Hacer la funcion de xr
            double fxr = Funcion(xr);

            //Hacer la multiplicacion de funciones
            fxr_fxa = fxa*fxr;

            iteracion+=1;
        }while(Ea<1);

    }

    //Función del problema
    public static double Funcion(double num){
        return Math.pow(num, 3) - (4 * num) - 9;
    }
}
