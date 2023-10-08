package Prototype;

public class TestPrototype {

    public static void main(String[] args) throws Exception {
        PersonajePrototype Heroe = new PersonajePrototype();
        PersonajePrototype Villano = new PersonajePrototype();
        PersonajePrototype Aldeano = new PersonajePrototype();
        
        Heroe Heroe1 = (Heroe) Heroe.prototipo("Heroe");
        Villano villano1 = (Villano) Villano.prototipo("Villano");
        Personajes aldeano1 = (Aldeano) Aldeano.prototipo("Aldeano");
        
        System.out.println(villano1.toString());
        System.out.println(Heroe1.toString());
        System.out.println(aldeano1.toString());
    }
}