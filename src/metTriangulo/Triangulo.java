
package metTriangulo;

/**
 * em 11/07/24
 * @author 2975
 */
public class Triangulo {
    
    // atributos da classe
    private float fLadoA;
    private float fLadoB;
    private float fLadoC;
    
    // construtor da classe
    
    
    // ---------------------------------------------------------------------------------------------
    // métodos getter´s & setter´s - acesso aos atributos encapsulados
    public float getfLadoA() { return fLadoA; }
    public void setfLadoA(float fLadoA) {
        this.fLadoA = fLadoA;
    }

    public float getfLadoB() { return fLadoB; }
    public void setfLadoB(float fLadoB) {
        this.fLadoB = fLadoB;
    }

    public float getfLadoC() { return fLadoC; }
    public void setfLadoC(float fLadoC) {
        this.fLadoC = fLadoC;
    }
    
    // ----------------------------------------------------------------------------------------------
    // método padrão - informa valor dos atributos
    @Override
    public String toString() {
        return "Triangulo{" + "fLadoA=" + fLadoA 
                                    + ", fLadoB=" + fLadoB 
                                    + ", fLadoC=" + fLadoC + "}";
    }
    
}
