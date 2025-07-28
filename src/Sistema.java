import entidades.Aluno;
import entidades.Curso;
import entidades.Professor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Professor> professores = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();

        Professor prof1 = new Professor("-----", "-----", "-------", "------", "Dcomp");
        professores.add(prof1);


        System.out.println("=================================");
        System.out.println("Bem-vindo ao nosso sistema!");
        System.out.println("=================================");
        System.out.println("Informe seu tipo:");

        System.out.println("1 - Professor");
        System.out.println("2 - Aluno");
        System.out.println("0 - Encerrar sistema");

        int opcao = input.nextInt();

        while (opcao != 0) {
            if (opcao == 1) {
                int opcaoProfessor;
                System.out.println("Selecione a opcao desejada:");
                System.out.println("1 - Efetuar login:");
                System.out.println("2 - Cadastrar:");

                opcaoProfessor = input.nextInt();

                if (opcaoProfessor == 1) {
                    Scanner inputProfessor = new Scanner(System.in);

                    System.out.println("Passe seus dados:");
                    System.out.println("Email: ");
                    String login = inputProfessor.nextLine();
                    System.out.println();
                    System.out.println("Senha:");
                    String senha = inputProfessor.nextLine();


                    for (Professor i : professores) {
                        if (i.getEmail().equals(login) && i.getSenha().equals(senha)) {
                            boolean loginAceito = true;

                            while (loginAceito) {
                                //TODO tratar erros de entrada não numerica!!
                                //logica funcionando!
                                int opcaoLoginAceito;
                                System.out.println("Selecione a opcao desejada:");
                                System.out.println("1 - Cadastrar curso:");
                                System.out.println("2 - listar cursos cadastrados:");
                                System.out.println("3 - Sair:");

                                opcaoLoginAceito = input.nextInt();

                                if (opcaoLoginAceito == 1) {
                                    System.out.print("Digite o nome do curso:");
                                    String nomeCurso = inputProfessor.nextLine();

                                    System.out.print("Digite o descricao do curso:");
                                    String descricao = inputProfessor.nextLine();

                                    i.criarCurso(new Curso(nomeCurso, descricao));
                                } else if (opcaoLoginAceito == 2) {
                                    i.listarCursos();
                                } else if (opcaoLoginAceito == 3) {
                                    break;// retorna para login ou cadastro!
                                } else {
                                    System.out.println("Opcao invalida!");
                                }

                            }
                        }

                    }
                }


            }


        }


    }


}
