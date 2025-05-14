package EvidenciaFinal;

import java.util.Scanner;

public class Metodo_Secante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Variables Iniciales
        int iteracion = 0;
        double xa = 0, xb = 0, xr, Ea=100;

        //Pedir datos iniciales
        System.out.println("Ingresa el xa:");
            xa = scanner.nextDouble();
        System.out.println("Ingresa el xb:");
            xb = scanner.nextDouble();

        //Iniciar Iteración
        do{

            xr = (xa+xb)/2;
            System.out.println(xr);

            iteracion=+1;
        }while(Ea<1);

    }

    //Función del problema
    public double Funcion(double num){
        Double resultado = Math.pow(num,3)-(4*num)-9;
        return resultado;
    }
}
