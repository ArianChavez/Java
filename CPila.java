package ResEjerCPila01;

import java.util.Scanner;

public class CPila {

    int tope, max;
    CAlumno[] pila;
    CAlumno alu = new CAlumno();
    static Scanner teclado = new Scanner(System.in);

    public CPila(int MAX) {
        this.tope = 0;
        this.max = MAX;
        this.pila = new CAlumno[this.max + 1];
    }

    public CPila() {
        this.tope = 0;
        this.max = 100;
        this.pila = new CAlumno[this.max + 1];
    }

    public int getTope() {
        return tope;
    }

    public boolean IsPilaLlena() {

        if (this.max == this.tope) {
            return true;

        } else {
            return false;
        }
    }

    public boolean IsPilaVacia() {
        if (this.tope == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void CrearPila() {
        int valor;
        System.out.println("Ingrese tamaño de la pila");
        valor = teclado.nextInt();
        pila = new CAlumno[valor];

    }

    public void InsertarElem() {
        if (this.IsPilaLlena()) {
            System.out.println("La pila esta llena");
        } else {

            System.out.println("Digite los datos del alumno : ");
            System.out.println("=================================");
            System.out.println("Ingrese el codigo del alumno : ");
            String codigo = teclado.next();
            alu.setCodigo(codigo);
            System.out.println("Ingrese el nombre del alumno : ");
            String nom = teclado.next();
            alu.setNombre(nom);
            System.out.println("Ingrese la nota 01 del alumno : ");
            int n1 = teclado.nextInt();
            alu.setNota01(n1);
            System.out.println("Ingrese la nota 02 del alumno : ");
            int n2 = teclado.nextInt();
            alu.setNota02(n2);
            System.out.println("Se inserto a la pila en la posicion\n" + tope);
            System.out.println(alu.Cadena());
            this.tope++;

        }
    }

    public void mostrarPilas() {
        if (this.IsPilaVacia()) {
            System.out.println("La pila esta vacia");
        } else if (this.tope != this.max) {
            for (int i = 0; i < this.tope; i++) {
                System.out.println(pila[i].Cadena());

            }
        } else if (this.IsPilaLlena()) {
            for (int i = 0; i == this.tope; i++) {
                System.out.println(pila[i].Cadena());

            }
        }
    }

    public void eliminarElem() {
        if (this.IsPilaVacia()) {
            System.out.println("La pila esta vacia");
        } else if (this.IsPilaLlena()) {

            this.tope--;
            System.out.println("El item" + pila[tope-1].Cadena() + "se elimino a la pila");

        }
    }
}
