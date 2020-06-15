
package ResEjerCPila01;



import java.util.Scanner;
public class AplicaCPila {
    
    static Scanner teclado = new Scanner (System.in);
    public static CPila Pila= new CPila();
    
    public static void main(String[] args) {
        MenuPila();
    }
    
     
    
    public static void MenuPila (){
    
    int opcion;
    
    do {
        System.out.println("========================");
        System.out.println("\tMenú de opciones");
        System.out.println("=========================");
        System.out.println("[1] Crear Pila");
        System.out.println("=========================");
        System.out.println("[2] Insrtar elemento");
        System.out.println("[3] Eliminar elemento");
                
                
                
                
        System.out.println("[4] Mostrar pila");
        
        System.out.println("============================");
        System.out.println("[0] Salir");
        
        System.out.print("\nIngrese una opción : ");
        opcion=teclado.nextInt();
        
        switch (opcion){
            case 1: 
                Pila.CrearPila();
                break;
            case 2:
                Pila.InsertarElem();
                break;
            case 3:
                Pila.eliminarElem();
                break;
            case 4:
                Pila.mostrarPilas();
                
                break;
            
            case 0:
                System.out.println("Saliendo del sistema");
                System.exit(0);
                break;
            default:
                System.out.println("Ingrese opcion correcta....");
                System.out.println("\n");
                
        }
        
    }while(opcion != 0);
    }
}
