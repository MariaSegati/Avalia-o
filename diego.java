package aula;
import java.util.Scanner;

public class sz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 1, cont = 1;
		double notaP = 0, media = 0;
		String avaliacao, nomeAluno, mensagem = "-----";

		System.out.println("Insira o nome do professor: ");
		String nomeProf = sc.next();
		System.out.println("Insira o nome/sigla da turma que será registrada: ");
		String turma = sc.next();
		System.out.println("Insira a disciplina que este professor leciona para esta turma: ");
		String materia = sc.next();
		System.out.println("Insira a quantidade de alunos que essa turma possui: ");
		int qtd = sc.nextInt();
		System.out.println("Insira a quantidade de avaliações: ");
		int ava = sc.nextInt();

		do {
			System.out.println("Insira o nome do aluno: ");
			nomeAluno = sc.next();
			i++;

			for (int i2 = 1; i2 <= ava; i2++) {
				System.out.println("Insira a nota da avaliação: ");
				notaP = sc.nextDouble();

				mensagem += "\nNome do aluno: " + nomeAluno + "\nNota: " + notaP;

				cont++;
				
				media = (notaP) / ava;
				
			}
			
			
			
		} while (i <= qtd);

		if (media >= 7) {
			avaliacao = "aprovado";
		} else if (media < 5) {
			avaliacao = "reprovado";
		} else {
			avaliacao = "em exame";
		}

		
		

		System.out.println("Nome do professor: " + nomeProf + "\nTurma: " + turma + "\nmatéria: " + materia
				+ "\nQuantidade de alunos que a turma possui: " + qtd
				+ "\nQuantidade de avaliações que a turma possui: " + ava);
		System.out.println(mensagem);



		sc.close();

	}

}