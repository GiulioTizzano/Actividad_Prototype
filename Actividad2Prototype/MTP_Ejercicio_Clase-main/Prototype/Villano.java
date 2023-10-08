package Prototype;

public class Villano extends Personajes {
    private int maldad;
    private int reputacion;
    private int poder;

    public Villano(String nombre, float peso, int inteligencia, float altura, String sexo, String especie , int maldad , int reputacion , int poder) {
        super(nombre, peso, inteligencia, altura, sexo, especie);
        this.maldad = maldad;
        this.reputacion = reputacion;
        this.poder = poder;
    }
    
    public int getMaldad() { return maldad; }
    public int getReputacion(){ return reputacion;}
    public int getPoder() { return poder; }

    public void setMaldad(int maldad) { this.maldad = maldad; }
    public void setReputacion(int reputacion) { this.reputacion = reputacion;}
    public void setPoder(int poder){ this.poder = poder;}

    @Override
    public Object clone() throws CloneNotSupportedException {
        Villano clone = (Villano) super.clone();
        clone.maldad = this.maldad;
        clone.reputacion = this.reputacion;
        clone.poder = this.poder;
        return clone;
    }

    @Override
     public String toString() {
        return "El villano " +
                getNombre() +
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
                ". El villano tiene una maldad de " +
                getMaldad() +
                ", una reputación de " +
                getReputacion() +
                " y un poder de " +
                getPoder();
               
}
}