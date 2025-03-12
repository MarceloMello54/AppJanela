
package Met.FileTXT;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class Metodos {
    // instanciar um objeto para classe clientes 
    
      Clientes dados = new Clientes ();

    // metodo para grava dados no arquivo TXT
    
    public String salvarDados(){
     
      
        
        
        try {
            // usaremos biblioteca IO (controle entrada e sainda de dados )

            FileWriter escrever = new FileWriter (" clientes.txt");
            PrintWriter gravar = new PrintWriter (escrever);
            
            // acessar atributo da classe clientes
            gravar.println("Nome: " + dados.getsNome());
            gravar.println("E-mail: " + dados.getsEmail());
            gravar.println("CPF: " + dados.getsCPF());
            
            
        // metodo FLUSH: envia os dados do formulario no mesmo instante 
        // ou seja, não armazena no BUFFER de dados 
        gravar.flush();
        gravar.close();
        escrever.close();
        
            
        } catch (IOException ex) {
         
            
            
            
        }
        
        
        
        return "Cadastrado com Sucesso";
    
        
    }



}
