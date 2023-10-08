package Prototype;

public abstract class Personajes implements Cloneable {
    // nombre, peso, inteligencia, altura , sexo , ESPECIE 
    private String nombre;
    private float peso;
    private int inteligencia;
    private float altura;
    private String sexo;
    private String especie;
 
    public Personajes(String nombre, float peso, int inteligencia, float altura, String sexo, String especie) {
        this.nombre = nombre;
        this.peso = peso;
        this.inteligencia = inteligencia;
        this.altura = altura;
        this.sexo = sexo;
        this.especie = especie;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public void setNombre(String nombre){ this.nombre = nombre;}
    public void setPeso(float peso){ this.peso = peso;}
    public void setInteligencia(int inteligencia){ this.inteligencia = inteligencia;}
    public void setAltura(float altura){ this.altura = altura;}
    public void setSexo(String sexo){ this.sexo = sexo;}
    public void setEspecie(String especie){ this.especie = especie;}

    public String getNombre() { return nombre; }
    public float getPeso() { return peso; }
    public int getInteligencia() { return inteligencia; }
    public float getAltura() { return altura; }
    public String getSexo(){ return sexo;}
    public String getEspecie(){ return especie; }

    
}