package Classes;


public class Pessoa {
    
    //Atributos
    private float peso;
    private float altura;
    
    public Pessoa(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }
    
    public float calcularIMC() {
        float imc = getPeso() / (getAltura() * getAltura());
        return imc;
    }

    //Métodos acessores
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if(peso <= 0){
            System.out.println("Valor de peso INCORRETO!");
        }else {
            System.out.println("OK!");
        }
        
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if(altura <= 0){
            System.out.println("Valor de altura INCORRETO!");
        }else {
            System.out.println("OK!");
        }
        this.altura = altura;
    }
    
    
    
}
