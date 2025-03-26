
public class Produto {
    private String nome;
    private String codigo;
    private String marca;
    
    //metodos acessores (gets) e modificadores (sets)
    public void setNome(String nome){
    this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }
}
