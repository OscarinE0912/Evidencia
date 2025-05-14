package EvidenciaFinal;

import java.util.Scanner;

public class Metodo_Secante {
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

            System.out.println("xa: "+xa+" xb: "+xb+" xr: "+xr+" f(xa): "+fxa+" f(xr): "+fxr+" f(xa)f(xr): "+fxr_fxa+" Ea: "+Ea);

            //Condicional para cambiar xa o xb
            if(fxr_fxa < 0){
                xa=xr;
            } else{
                xb=xr;
            }

            iteracion+=1;
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
