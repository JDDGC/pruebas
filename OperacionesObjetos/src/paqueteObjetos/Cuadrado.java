package paqueteObjetos;

public class Cuadrado {
    public double lado;
    public void setLado(int lado){
        this.lado=lado;
    }
    public double getLado(){
        return lado;
    }
    public double calcularArea(){
        return lado*lado;
        
    }
    public double calcularPerimetro(){
        return lado*4;
    }
}