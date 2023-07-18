
package Servicio;

import Entidad.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class ClienteServicio {
    Scanner leer = new Scanner(System.in);
    
    public void crearCliente(ArrayList<Cliente> listaClientes){
        Cliente nuevo = new Cliente();
        System.out.println("Cual es el id del usuario");
        nuevo.setId(leer.nextInt());
        leer.nextLine();
        System.out.println("Cual es el nombre del cliente");
        nuevo.setNombre(leer.nextLine());
        System.out.println("Que edad tiene el usuario");
        nuevo.setEdad(leer.nextInt());
        leer.nextLine();
        System.out.println("Cual es la altura del usuario?");
        String medida=(leer.nextLine());
        nuevo.setAltura(Double.parseDouble(medida));
        System.out.println("Cual es el peso del usuario");
        String peso = leer.nextLine();
        nuevo.setPeso(Double.parseDouble(peso));
        System.out.println("Cual es el objetivo del usuario?");
        nuevo.setObjetivo(leer.nextLine());
        
        listaClientes.add(nuevo);
    }
    
    public void mostrarClientes(ArrayList<Cliente>listaClientes){
        for(int i=0;i<listaClientes.size();i++){
            System.out.println(listaClientes.get(i));
        }
    }
    
    
    public void modificarCliente(ArrayList<Cliente>listaClientes){
        System.out.println("Cual es el id del usuario que quiere modificar?");
        int id = leer.nextInt();
        leer.nextLine();
        boolean encontrado = false;
        for(int i=0;i<listaClientes.size();i++){
            
            if(listaClientes.get(i).getId()==id){
                System.out.println("Cual es el nombre del cliente");
                listaClientes.get(i).setNombre(leer.nextLine());     
                System.out.println("Que edad tiene el usuario");
                listaClientes.get(i).setEdad(leer.nextInt());
                leer.nextLine();
                System.out.println("Cual es la altura del usuario?");
                String medida=(leer.nextLine());
                listaClientes.get(i).setAltura(Double.parseDouble(medida));
                System.out.println("Cual es el peso del usuario");
                String peso = leer.nextLine();
                listaClientes.get(i).setPeso(Double.parseDouble(peso));
                System.out.println("Cual es el objetivo del usuario?");
                listaClientes.get(i).setObjetivo(leer.nextLine());
                encontrado=true;
                break;
            }
        }
        
        if(!encontrado){
            System.out.println("No se hallo ningun cliente con ese id");
        }
    }
    
    public void eliminarCliente(ArrayList<Cliente>listaClientes){
        System.out.println("Cual es el id del usuario que quiere modificar?");
        int id = leer.nextInt();
        leer.nextLine();
        boolean encontrado = false;
        for(int i=0;i<listaClientes.size();i++){
             if(listaClientes.get(i).getId()==id){
                 listaClientes.remove(i);
                 encontrado=true;
                 System.out.println("Cliente eliminado correctamente");
                 break;
             }
        }
        if(!encontrado){
            System.out.println("No se encontro este usuario");
        }
    }
    
     public void listaRapida(ArrayList<Cliente> listaClientes){
                   Cliente cliente1 = new Cliente (0001,"Adrian",20,1.70,65,"Entrenar");
                   Cliente cliente2 = new Cliente (0002,"Beto",40,1.75,85,"Adelgazar");
                   Cliente cliente3 = new Cliente (0003,"Carlos",50,1.80,78,"Divertirse");
                   Cliente cliente4 = new Cliente (0004,"Daniel",30,1.90,85,"Competir");
                   listaClientes.add(cliente1);
                   listaClientes.add(cliente2);
                   listaClientes.add(cliente3);
                   listaClientes.add(cliente4);
                   System.out.println("Clientes creados con exito");
    }
}
