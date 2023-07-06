package org.example;

import org.example.modelos.Herramienta;
import org.example.modelos.Samurai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //CREANDO OBJETOS
        Samurai dos=new Samurai();
        Samurai samurai= new Samurai();
        Herramienta herramienta=new Herramienta("escopeta",90.0);
        Herramienta herramienta1=new Herramienta();
        Scanner entradaPorTeclado=new Scanner(System.in);

        samurai.setNombre("keisha monoto");
        System.out.print("Digite la edad del primer samurai:  ");
        System.out.print("Digita el nombre del 2 Samurai: ");
        samurai dos.nombre=entradaPorTeclado.nextLine();
        Samurai.setEdad(entradaPorTeclado.nextInt());

        System.out.print(****RESULTADO****);
        System.out.print("El samurai: "+samurai.getNombre()+ "Tiene: "+samurai.getEdad());

    }
}