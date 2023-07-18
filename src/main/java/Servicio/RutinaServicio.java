
package Servicio;

import Entidad.Rutina;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RutinaServicio {
    Scanner leer = new Scanner(System.in);
    
    public void crearRutina(ArrayList<Rutina>listaRutinas){
        Rutina nueva = new Rutina();
        Random random = new Random();
        int id = random.nextInt(9999 - 1000 + 1) + 1000;
        System.out.println("Cual es el nombre de la rutina?");
        nueva.setNombre(leer.nextLine());
        System.out.println("Cual es la duración de la rutina?");
        nueva.setDuracion(leer.nextInt());
        leer.nextLine();
        System.out.println("Cúal es el nivel de dificultad?");
        nueva.setNivelDificultad(leer.nextLine());
        System.out.println("Como lo describiria");
        nueva.setDescripcion(leer.nextLine());
        
        listaRutinas.add(nueva);
    }
    
    public void mostrarRutina(ArrayList<Rutina>listaRutina){
        for(int i=0; i<listaRutina.size();i++){
            System.out.println(listaRutina.get(i));
        }
    }
    
    public void actualizarRutina(ArrayList<Rutina>listaRutina){
        System.out.println("Cual es la rutina que desea actualizar?");
        String nombreRutina = leer.nextLine();
        boolean esta = false;
        
        for(int i=0; i<listaRutina.size();i++){
            if(nombreRutina.equals(listaRutina.get(i).getNombre())){
                System.out.println("Cual es el nombre de la rutina?");
                listaRutina.get(i).setNombre(leer.nextLine());
                System.out.println("Cual es la duración de la rutina?");
                listaRutina.get(i).setDuracion(leer.nextInt());
                leer.nextLine();
                System.out.println("Cúal es el nivel de dificultad?");
                listaRutina.get(i).setNivelDificultad(leer.nextLine());
                System.out.println("Como lo describiria");
                listaRutina.get(i).setDescripcion(leer.nextLine());
                esta = true;
                break;
            }
        }
        if(!esta){
            System.out.println("No se encontro esta rutina");
        }
    }
    
    public void eliminarRutina(ArrayList<Rutina>listaRutina){
        System.out.println("Cual es la rutina que desea actualizar?");
        String nombreRutina = leer.nextLine();
        boolean esta = false;
        
        for(int i=0; i<listaRutina.size();i++){
            if(nombreRutina.equals(listaRutina.get(i).getNombre())){
                listaRutina.remove(i);
                System.out.println("Rutina eliminada exitosamente");
                esta=true;
                break;
            }
        }
        if(!esta){
            System.out.println("Esta rutina no se encuentra disponible");
        }
    }
    
    public void listaRutinaRapida(ArrayList<Rutina>listaRutina){
        Rutina nueva1 = new Rutina(10001, "Trotar",30,"Medio","Trote por 30 minutos");
        Rutina nueva2 = new Rutina(10002, "Correr",20,"Alto","Carrera con salto");
        Rutina nueva3 = new Rutina(10003, "Caminar",60,"Bajo","Caminar a paso firme");
        Rutina nueva4 = new Rutina(10004, "Pesas",10,"Alto","Levantamiento de 30 kg");
        Rutina nueva5 = new Rutina(10005, "Aerobicos",40,"Alto","Zumba");
        
        listaRutina.add(nueva1);
        listaRutina.add(nueva2);
        listaRutina.add(nueva3);
        listaRutina.add(nueva4);
        listaRutina.add(nueva5);
        
    }
    
}
