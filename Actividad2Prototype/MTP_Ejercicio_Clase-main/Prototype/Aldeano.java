package Prototype;

public class Aldeano extends Personajes{
    private String trueque;
    private String oficio;
    private String claseSocial;
    public Aldeano(String nombre, int peso, int inteligencia, int altura, String sexo, String especie, String trueque, String oficio, String claseSocial){
        super(nombre, peso, inteligencia, altura, sexo, especie);
        this.trueque = trueque;
        this.oficio = oficio;
        this.claseSocial = claseSocial;
    }

    public String getTruque() { return trueque; }
    public String getOficio() { return oficio; }
    public String getClaseSocial(){ return claseSocial; }

    public void setTruque(String trueque) { this.trueque = trueque; }
    public void setOficio(String oficio) { this.oficio = oficio; }
    public void setClaseSocial(String claseSocial) { this.claseSocial = claseSocial; }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Aldeano clone = (Aldeano) super.clone();
        clone.trueque = this.trueque;
        clone.oficio = this.oficio;
        clone.claseSocial = this.claseSocial;
        return clone;
    }

    @Override
     public String toString() {
        return "El aldeano " + getNombre() + 
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
        ". El aldeano tiene " +
        getTruque() +
        " de trueque, tiene un oficio como " +
        getOficio() +
        " y es de una clase social " +
        getClaseSocial();
               
}

}