package Dominio;

public abstract class Conteudo {
    
    protected static final double Xp_padrao = 10d;

    public String titulo;
    public String descricao;
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public abstract double calcularXp();
}
