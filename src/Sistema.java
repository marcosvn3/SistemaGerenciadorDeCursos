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

        System.out.println("=================================");
        System.out.println("Bem-vindo ao nosso sistema!");
        System.out.println("=================================");
        System.out.println("Informe seu tipo:");

        System.out.println("1 - Professor");
        System.out.println("2 - Aluno");
        System.out.println("0 - Encerrar sistema");

        int opcao = input.nextInt();

        while (opcao != 0) {
            if (opcao == 1) {//TODO Tratar exceptions da seção
                int opcaoProfessor;
                System.out.println("Selecione a opcao desejada:");
                System.out.println("1 - Efetuar login:");
                System.out.println("2 - Cadastrar:");
                System.out.println("3 - listar professores:");
                System.out.println("0 - Encerrar sistema!");

                opcaoProfessor = input.nextInt();

                if (opcaoProfessor == 1) {
                    System.out.println("Passe seus dados:");
                    input.nextLine(); //TODO Usado para limpar o Scanner sem fechar o input!
                    System.out.print("Email: ");
                    String login = input.nextLine();
                    System.out.println("Senha:");
                    String senha = input.nextLine();


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
                                    input.nextLine();
                                    System.out.print("Digite o nome do curso:");
                                    String nomeCurso = input.nextLine();

                                    System.out.print("Digite o descricao do curso:");
                                    String descricao = input.nextLine();

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
                else if(opcaoProfessor == 2){ //TODO tratar erros de entrada não String!!
                    System.out.print("Para se cadastrar passe os seguintes dados");

                    input.nextLine();
                    System.out.print("\nNome:");
                    String nomeProfessor = input.nextLine();

                    System.out.print("\nData de nascimento(**/**/****):");
                    String dataNascimentoProfessor = input.nextLine();

                    System.out.print("\nEmail:");
                    String emailProfessor = input.nextLine();

                    System.out.print("\nSenha:");
                    String senhaProfessor = input.nextLine();

                    System.out.print("\nDepartamento:");
                    String departamentoProfessor = input.nextLine();

                    professores.add(new Professor(nomeProfessor,dataNascimentoProfessor,emailProfessor,senhaProfessor,departamentoProfessor));
                }
                else if(opcaoProfessor == 3) {
                    for (Professor i : professores) {
                        System.out.println(i);
                    }
                }
                else{
                    System.out.println("Opcao invalida!");
                }

            }


        }


    }


}
