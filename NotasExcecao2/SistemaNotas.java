//package teste;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaNotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> alunos = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();

      
        int contadorA = 0;

        // Tratamento para InputMismatchException ao ler a quantidade de alunos
        while (true) {
            try {
				System.out.print("Quantos alunos a turma possui: ");
                contadorA = sc.nextInt();
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Entrada invalida. Por favor, insira um numero inteiro.");
                sc.nextLine(); // Limpar o buffer do scanner
            }
        }

        for (int i = 0; i < contadorA; i++) {
            while (true) {
                System.out.print("Insira o nome do aluno " + (i + 1) + ": ");
                String aluno = sc.nextLine();
                String nome_sem_espaco = aluno.replace(" ","");
                try {
                    validarDado(nome_sem_espaco);
                    alunos.add(aluno.trim());
                    break;
                } catch (DadosExcecao e) {
                    System.out.println("ERRO: " + e);
                }
            }
        }

        for (int i = 0; i < contadorA; i++) {
            while (true) {
                System.out.print("Insira a nota semestral do aluno " + (i + 1) + ": ");
                try {
					String notaE = sc.nextLine().replace(",", ".").trim();
					Double nota = Double.parseDouble(notaE);
                    validarNotas(nota);
                    notas.add(nota);
                    break;
                    
                } catch (NumberFormatException e) {
                    System.out.println("ERRO: Entrada invalida. Por favor, insira um numero decimal.");

                } catch (NotasExcecao e) {
                    System.out.println("ERRO: " + e);
                }
            }
        }

        double soma = 0.0;
        for (Double nota : notas) {
            soma += nota;
        }
        double media = soma / contadorA;
        System.out.println("A nota media da turma e: " + media);

        boolean validar1 = true;
        while(validar1){
            
            try {
                System.out.print("Aluno selecionado para consulta individual (digite posicao na lista de 1 a "
                        + (contadorA) + "): ");
                int posicao = sc.nextInt();
                sc.nextLine(); 
                System.out.println("ALUNO: " + alunos.get(posicao - 1));
                System.out.println("NOTA: " + notas.get(posicao - 1));

                
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Entrada invalida. Por favor, insira um numero inteiro.");
                sc.nextLine(); // Limpar o buffer do scanner
                
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERRO: Posicao invalida. " + e.getMessage());
                
            } finally {

                boolean validar2 = true;
                while(validar2){
                    System.out.print("\nDeseja continuar a consulta? (s) sim | (n) Nao : ");
                    String valor = sc.next().toUpperCase();

                    if (valor.equals("N")){
                        System.out.println("\n\nEXECUCAO CONCLUIDA");
                        // sai dos do primeiro e segundo loop
                        validar1 = false;
                        validar2 = false;
                        
                    }else if (valor.equals("S")){
                    // sai do segundo loop 
                    validar2 = false;
                    }
                }
                
                System.out.println("============================================");
            }

            
        }
     sc.close();
     
    }

    public static void validarNotas(double nota) throws NotasExcecao {
        if (nota < 0 || nota > 10) {
            throw new NotasExcecao(nota);
        }
    }

    public static void validarDado(String dados) throws DadosExcecao {
		// Para verificar se esta realmente digitando uma letra
        if (!dados.matches("[a-zA-Z]+")) {
            throw new DadosExcecao(dados);
        }
    }
}
