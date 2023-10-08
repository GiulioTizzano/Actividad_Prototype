package Prototype;

import java.util.HashMap;

public class PersonajePrototype {
    private HashMap<String, Personajes> prototipos = new HashMap<>();
    
    public PersonajePrototype() {
        Villano villano1 = new Villano("Salazar", (float) 70.6 , 100 , 170 , "H", "Ratatopiense", 70 , 10 , 32);
        Heroe heroe1 = new Heroe("Adolfo", 170, -1, 165, "H", "Humano", 50, 10, 80);
        Aldeano aldeano1 = new Aldeano("Juan", 70, 100, 170, "H", "Humano", "Piedra", "Minero", "Baja");
       
        prototipos.put("Heroe", heroe1);
        prototipos.put("Villano", villano1);
        prototipos.put("Aldeano", aldeano1);
    }
    public Object prototipo(String tipo) throws CloneNotSupportedException {
        return prototipos.get(tipo).clone();
    }
}