package Dominio;


import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data){
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }
    
    public LocalDate getData(){
        return data;
    }

    @Override
    public double calcularXp() {
        return Xp_padrao + 20d;
    }

    @Override
    public String toString(){
        return "mentoria{" +
                ", titulo ='" + getTitulo() + '\'' +
                ", descricao ='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    
}