package net.xeill.elpuig;

import java.util.ArrayList;

import java.util.Scanner;

public class Agenda {

  // Atributos
  ArrayList<Contacto> contactos = new ArrayList<Contacto>();

  // Métodos
  public void mostrarContactos() {

    for (Contacto c : contactos) {

      System.out.println(c.name);
      System.out.println(c.number);
      System.out.println(c.email);
      System.out.println(c.edad);
      System.out.println("----------");

    }

  }

  public void mostrarContactosConIndice() {
	int cont = 0;
    for (Contacto c : contactos) {
      System.out.println("----------");
      System.out.println("Indice "+ cont);
      System.out.println("----------");
      System.out.println(c.name);
      System.out.println(c.number);
      System.out.println(c.email);
      System.out.println(c.edad);
      System.out.println("----------");

	cont ++;
    }

  }

  public void modificarContacto(){
  	Scanner escaneo = new Scanner(System.in);
  	  // Mostrar los contactos con un índice delante
  System.out.println("modificar contacto");
    // El usuario indica el índice del elemento que quiere modificar
    System.out.println("Mostrando contactos...");
    mostrarContactosConIndice();

        System.out.println("Indica el indice de contacto que quiera modificar");

        int indice = escaneo.nextInt();
        escaneo.nextLine();
     Contacto c = contactos.get(indice);
     System.out.println(c);


    // Modificamos el contacto c

    System.out.println("Quiere modificar el nombre? (si|no)");

    String cambiaNombre = escaneo.nextLine();

	 if (cambiaNombre.equals("si")) {
        System.out.println("Introduce el nuevo nombre:");
        String nuevoNombre = escaneo.nextLine();
        c.name = nuevoNombre;
      }
       System.out.println("Quiere modificar el numero? (si|no)");

    String cambiarNumero = escaneo.nextLine();

	 if (cambiarNumero.equals("si")) {
        System.out.println("Introduce el nuevo numero:");
        String nuevoNumero = escaneo.nextLine();
        c.number = nuevoNumero;
      }

     System.out.println("Quiere modificar el correo? (si|no)");
     String cambiarCorreo = escaneo.nextLine();

	 if (cambiarCorreo.equals("si")) {
        System.out.println("Introduce el nuevo correo:");
        String nuevoCorreo = escaneo.nextLine();
        c.email = nuevoCorreo;
      }
      System.out.println("Quiere modificar la edad? (si|no)");
     String cambiarEdad = escaneo.nextLine();

	 if (cambiarEdad.equals("si")) {
        System.out.println("Introduce el nuevo edad:");
        int nuevoEdad = escaneo.nextInt();
        c.edad = nuevoEdad;
      }
    // Preguntamos al usuario los nuevos valores del contacto

  }

  public void anadirContacto(){

    Contacto c = new Contacto();
    c.crearContacto();

    contactos.add(c);

  }

}
