package patronesdedisenosegundoparcial.ejercicio1Memento;

import java.util.HashMap;
import java.util.Map;

public class Computadora {

    private Map<String, Memento> versionesTesis = new HashMap<>();

    public Computadora addVersionTesis(Memento memento){
        System.out.println("GUARDANDO TESIS...");
        versionesTesis.put(memento.getFecha(), memento);
        memento.getTesis().show();
        return this;
    }

    public Memento getTesis(String fecha){
        return versionesTesis.get(fecha);
    }

    public void show(){
        System.out.println("---------------------A CONTINUACION TODAS LAS VERSIONES DE TESIS---------------------");
        versionesTesis.entrySet().stream().forEach( a -> {
            System.out.println("--------------------"+a.getKey()+"------------------------------");
            a.getValue().getTesis().show();}
        );
    }
    
}
