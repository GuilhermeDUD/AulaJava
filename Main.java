
import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        //o usuario insere as inforcacoes do produto
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do produto");
        String nome = sc.nextLine();
        System.out.println("Digite o codigo do produto");
        String codigo = sc.nextLine();
        System.out.println("Digite a marca do produto");
        String marca = sc.nextLine();
        
        
        //instacia da classe para criar um objeto do tipo Produto
        Produto prod = new Produto();
        
        prod.setNome(nome);
        prod.setMarca(marca);
        prod.setCodigo(codigo);
        System.out.println("Nome: "+prod.getNome());
        System.out.println("Marca: "+prod.getMarca());
        System.out.println("Codigo: "+prod.getCodigo());
        
    }
}
