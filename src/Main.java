import java.time.LocalDate;

import Dominio.*;


public class Main {
    public static void main(String[] args) throws Exception {
        var curso1 = new Curso("curso java", "12 horas de curso java", 12) ;
        
        var curso2 = new Curso("curso 2 de java","8 horas de curso java",8) ;

        var mentoria = new Mentoria("mentoria java","descricao de mentoria java", LocalDate.now());

        var bootcamp = new Bootcamp();
        bootcamp.setNome("java dev");
        bootcamp.setDescricao("descr bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        

        Dev devGags = new Dev();
        devGags.setNome("gags");
        devGags.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos: " + devGags.getConteudosInscritos());
        devGags.progredir();
        System.out.println("conteudos inscritos: " + devGags.getConteudosInscritos());
        System.out.println("conteudos concluidos: " + devGags.getConteudosConcluidos());
        System.out.println("XP: "+ devGags.calcularXpTotal());

        System.out.println("------");

        Dev devSant = new Dev();
        devSant.setNome("sant");
        devSant.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos: " + devSant.getConteudosInscritos());
        devSant.progredir();
        devSant.progredir();
        devSant.progredir();
        System.out.println("conteudos inscritos: " + devSant.getConteudosInscritos());
        System.out.println("conteudos concluidos: " + devSant.getConteudosConcluidos());
    }
}
