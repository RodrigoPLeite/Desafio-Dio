import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setTitulo("Curso Java");
		curso.setDescricao("Descrição Curso Java");
		curso.setCargaHoraria(5);
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso JavaScript");
		curso1.setDescricao("Descrição Curso JavaScript");
		curso1.setCargaHoraria(10);
		
		Conteudo conteudo = new Curso();
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Curso Java");
		mentoria.setDescricao("Mentoria do Curso Java");
		mentoria.setData(LocalDate.now());
		
		//System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("BootCamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devRodrigo = new Dev();
		devRodrigo.setNome("Rodrigo");
		devRodrigo.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Rodrigo " + devRodrigo.getConteudosInscritos());
		devRodrigo.progredir();
		devRodrigo.progredir();
		System.out.println("Conteúdos Inscritos Rodrigo " + devRodrigo.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Rodrigo " + devRodrigo.getConteudosConcluidos());
		System.out.println("XP: " + devRodrigo.calcularTotalXp());
		
		System.out.println("--------------");
		Dev devRayan = new Dev();
		devRayan.setNome("Rayan");
		devRayan.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Rayan " + devRayan.getConteudosInscritos());
	}

}
