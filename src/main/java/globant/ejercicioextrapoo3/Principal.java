package globant.ejercicioextrapoo3;

import Entidad.Cliente;
import Entidad.Rutina;
import Servicio.ClienteServicio;
import Servicio.RutinaServicio;


import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
       
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        ArrayList<Rutina> listaRutinas = new ArrayList<Rutina>();
        
        menu(listaClientes, listaRutinas);
        
    }
    
   public static void menu(ArrayList<Cliente> listaClientes, ArrayList<Rutina> listaRutinas) {
        Scanner leer = new Scanner(System.in);
         ClienteServicio cs = new ClienteServicio();
         RutinaServicio rs = new RutinaServicio();
        
        boolean menu = true;
        int option;
        do {
            System.out.println("Elija que quiere hacer");
            System.out.println("********************************");
            System.out.println("1. Crear Nuevo Cliente");
            System.out.println("2. Mostrar Clientes");
            System.out.println("3. Actualizar Cliente");
            System.out.println("4. Eliminar Cliente");
            System.out.println("5. Crear Rutina");
            System.out.println("6. Mostrar Rutinas");
            System.out.println("7. Actualizar rutina");
            System.out.println("8. Eliminar rutina");
            
            System.out.println("9. Crear lista rapida de clientes");
            System.out.println("10. Crear lista rapida de rutinas");
            System.out.println("0. Salir");
            System.out.println("********************************");

            option = leer.nextInt();

            switch (option) {
                case 1:
                    cs.crearCliente(listaClientes);
                    break;
                
                
                case 2:
                   cs.mostrarClientes(listaClientes);
                   break;
                
                case 3 :
                   cs.modificarCliente(listaClientes);
                   break;
                   
                case 4:
                   cs.eliminarCliente(listaClientes);
                   break;
                   
                case 5:
                    rs.crearRutina(listaRutinas);
                    break;
                    
                case 6:
                    rs.mostrarRutina(listaRutinas);
                    break;
                    
                case 7:
                    rs.actualizarRutina(listaRutinas);
                    break;
                    
                case 8:
                    rs.eliminarRutina(listaRutinas);
                    
                case 9:
                   cs.listaRapida(listaClientes);
                   break;
                
                case 10:
                    rs.listaRutinaRapida(listaRutinas);
                    break;
               
                case 0 :
                    menu = false;
                    break;
                default:
                    System.out.println("Ha ingresado una opcion incorrecta");
                    break;
            }
        } while (menu);
    }
    
}
        

