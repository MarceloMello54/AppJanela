/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author 1001724
 */
public class Metodos {
 
    // metodo implementando pelo programador YOU
    public String operacoes(String v1, String v2, String op) {

        // atributo para calculos de v1 e v2 
        String resposta = " ";
        Double resultadus = 0.0;

        //5  operacoes basicas
        switch (op) {
            case " + " -> resultadus = Double.parseDouble(v1) + Double.parseDouble(v2);
            case " - " -> resultadus = Double.parseDouble(v1) - Double.parseDouble(v2);
            case " / " -> resultadus = Double.parseDouble(v1) /  Double.parseDouble(v2);
            case " * " -> resultadus = Double.parseDouble(v1) * Double.parseDouble(v2);
            case "x^y" -> resultadus = Math.pow(Double.parseDouble(v1), Double.parseDouble(v2));
            default -> {
            }
        }
        
        // conversao de calculos numerico para retorno de String
        resposta = resultadus.toString();
        
        
        
        
        return resposta;
    }   
}
