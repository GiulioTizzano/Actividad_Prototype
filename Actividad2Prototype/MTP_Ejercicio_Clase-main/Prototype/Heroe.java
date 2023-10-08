package Prototype;

public class Heroe extends Personajes{
    private int heroismo;
    private int fuerza;
    private int velocidad;

    public Heroe(String nombre, float peso, int inteligencia, float altura, String sexo, String especie, int heroismo, int fuerza, int velocidad){
        super(nombre, peso, inteligencia, altura, sexo, especie);
        this.heroismo = heroismo;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
    }

    public int getHeroismo() { return heroismo; }
    public int getFuerza() { return fuerza; }
    public int getVelocidad() {  return velocidad; }

    public void setHeroismo(int heroismo) { this.heroismo = heroismo; }
    public void setFuerza(int fuerza) {  this.fuerza = fuerza;}
    public void setVelocidad(int velocidad) {  this.velocidad = velocidad;}

    @Override
    public Object clone() throws CloneNotSupportedException {
        Heroe clone = (Heroe) super.clone();
        clone.heroismo = this.heroismo;
        clone.fuerza = this.fuerza;
        clone.velocidad = this.velocidad;
        return clone;
    }

    @Override
     public String toString() {
        return "El heroe " + getNombre() + 
        ", pesa: " + 
        getPeso() +
        "\" tiene una inteligencia de " +
        getInteligencia() +
        " de IQ  y una altura de " +
        getAltura() +
        ", es " +
        getSexo() +
        " y de la especie " +
        getEspecie() +
        ". El heroe tiene un heroismo de " +
        getHeroismo() +
        ", una fuerza de " +
        getFuerza() +
        " y una velocidad de " +
        getVelocidad();
               
}

}