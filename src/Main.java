import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Dev Camila
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.progredir();
        devCamila.progredir();

        // Dev João
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();

        // Dev Gelonita
        Dev devGelonita = new Dev();
        devGelonita.setNome("Gelonita");
        devGelonita.inscreverBootcamp(bootcamp);
        devGelonita.progredir();

        // Dev Manoel
        Dev devManoel = new Dev();
        devManoel.setNome("Manoel");
        devManoel.inscreverBootcamp(bootcamp);
        devManoel.progredir();
        devManoel.progredir();

        // Dev Dourinha
        Dev devDourinha = new Dev();
        devDourinha.setNome("Dourinha");
        devDourinha.inscreverBootcamp(bootcamp);

        // Dev Daluz
        Dev devDaluz = new Dev();
        devDaluz.setNome("Daluz");
        devDaluz.inscreverBootcamp(bootcamp);
        devDaluz.progredir();
        devDaluz.progredir();
        devDaluz.progredir();

        // Exibir informações dos Devs
        exibirInfoDev(devCamila);
        exibirInfoDev(devJoao);
        exibirInfoDev(devGelonita);
        exibirInfoDev(devManoel);
        exibirInfoDev(devDourinha);
        exibirInfoDev(devDaluz);
    }

    private static void exibirInfoDev(Dev dev) {
        System.out.println("Dev: " + dev.getNome());
        System.out.println("Conteúdos Inscritos: " + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());
        System.out.println("-------");
    }
}
