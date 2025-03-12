
package metTriangulo;

/**
 * em 11/07/24
 * @author 2975
 */
public class Condicao {


    // -------------------------------------------------------------------
    // método para verificar se dados formam um triângulo
    public boolean verificaDados(float fladoA, float fladoB, float fladoC) {
        
        // conceito da matemática - princípio básico de triângulo
        if ((fladoA < fladoB+fladoC) && (fladoB < fladoA+fladoC) && (fladoC < fladoA+fladoB)) {
            return true;
        }
        return false; 
    }
    
    // -------------------------------------------------------------------
    // método para identificar o tipo de triângulo
    public String verificaTipo(float fladoA, float fladoB, float fladoC) {
    
        String tipoT = null;
        
        // especificar tipo de triângulo
        if ((fladoA == fladoB) && (fladoB == fladoC) && (fladoA == fladoC)) {
            tipoT = "/metTriangulo/equilatero.png";
        }
        else if ((fladoA != fladoB) && (fladoA != fladoC) && (fladoC != fladoB)) {
            tipoT = "/metTriangulo/escaleno.png";
        }
        else if ((fladoA == fladoB) || (fladoA == fladoC) || (fladoB == fladoC)) {
            tipoT = "/metTriangulo/isosceles.png";
        }
        return tipoT;

    }
}
