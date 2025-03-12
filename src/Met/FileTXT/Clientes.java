package Met.FileTXT;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Clientes {

    private String sNome;
    private String sEmail;
    private String sCPF;

// construtor padrao
    public Clientes() {

    }

// construtor parametrizado da classe
    public Clientes(String sNome, String sEmail, String sCPF) {
        this.sNome = sNome;
        this.sEmail = sEmail;
        this.sCPF = sCPF;
    }

//  metodo geter s e setter s 
    public String getsNome() {
        return sNome;
    }

    public void setsNome(String sNome) {
        this.sNome = sNome;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getsCPF() {
        return sCPF;
    }

    public void setsCPF(String sCPF) {
        this.sCPF = sCPF;
    }

    // metodo para grava dados no arquivo TXT
    

   public String salvarDados() {

        try {
            // usaremos biblioteca IO (controle entrada e sainda de dados )

            FileWriter escrever = new FileWriter(" clientes.txt", true);
            PrintWriter gravar = new PrintWriter(escrever);

            // acessar atributo da classe clientes
            gravar.println("Nome: " + this.getsNome());
            gravar.println("E-mail: " + this.getsEmail());
            gravar.println("CPF: " + this.getsCPF());

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
