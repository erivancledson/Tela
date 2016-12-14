
package tela;

public class Aluno {
    
    private long matricula;
    private String nome;
    private String cpf;
    private String email;
    private String telefoneContato;
    private static long contadorMatricula;
    
    public Aluno(){
        contadorMatricula++;
        
        matricula = contadorMatricula;
    }
    
    public Aluno(String nome, String cpf, String email, String telefoneContato ){
     contadorMatricula++;
        
     matricula = contadorMatricula;   
        
     this.nome = nome;
     this.cpf = cpf;
     this.email = email;
     this.telefoneContato = telefoneContato; 
    }
    
    public long getMatricula(){
        return matricula;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
     public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }
    
    
}
