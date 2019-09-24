public class TestaCasa {
    public static void main(String[] args){
        Casa c1 = new Casa("azul", 1, 0, 1);        
        c1.pinta("rosa");
        System.out.println("a cor é"+c1.getCor());
        c1.quantasPortasEstaoAbertas();
    }
}
