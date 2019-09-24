
public class TestaAluno {
    
    public static void main(String[] args){
        
        Data data = new Data(12, 9, 1998);
        
        Aluno a1 = new Aluno("Diego", "565.656.858", data);
           
        System.out.println(a1.getNome() + "\n" + a1.getCpf() + "\n" + a1.getDataDeNascimento().imprimir());
        
    }
}
