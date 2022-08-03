package Dominio;


public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso(String titulo, String descricao,int cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria(){
        return cargaHoraria;
    }

    @Override
    public double calcularXp(){
        return Xp_padrao * cargaHoraria;
    }

    @Override
    public String toString(){
        return "mentoria{" +
                ", titulo ='" + getTitulo() + '\'' +
                ", descricao ='" + getDescricao() + '\'' +
                ", carga Horaria=" + cargaHoraria +
                '}';
    }
}