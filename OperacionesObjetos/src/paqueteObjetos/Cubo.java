package paqueteObjetos;

public class Cubo extends Cuadrado{
    public double calcularVolumen(){        
        return lado*lado*lado;
    }
    public double calcularPerimetroCubo(){
        return lado*12;
    }
}
