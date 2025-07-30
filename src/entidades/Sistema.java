package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    Scanner input = new Scanner(System.in);
    List<Professor> professores = new ArrayList<>();
    List<Aluno> alunos = new ArrayList<>();
    List<Curso> cursos = new ArrayList<>();

    public void comecarPrograma() {
        System.out.println("=================================");
        System.out.println("Bem-vindo ao nosso sistema!");
        System.out.println("=================================");
        System.out.println("Informe seu tipo:");

        System.out.println("1 - Professor");
        System.out.println("2 - Aluno");
        System.out.println("0 - Encerrar sistema");
        int opcao = input.nextInt();

        do {
            if (opcao == 1) {//TODO Tratar exceptions da seção
                secaoProfessor();
            } else if (opcao == 2) {
                secaoAluno();
            }


            System.out.println("1 - Professor");
            System.out.println("2 - Aluno");
            System.out.println("0 - Encerrar sistema");
            opcao = input.nextInt();
        } while (opcao != 0);
    }


    private void secaoProfessor() {
        boolean secaoProfessorBool = true;
        do {
            int opcaoProfessor;
            System.out.println("Selecione a opcao desejada:");
            System.out.println("1 - Efetuar login:");
            System.out.println("2 - Cadastrar:");
            System.out.println("3 - listar professores:");
            System.out.println("0 - Voltar!");

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
                                loginAceito = false;
                            } else {
                                System.out.println("Opcao invalida!");
                            }

                        }
                    }

                }
            } else if (opcaoProfessor == 2) { //TODO tratar erros de entrada não String!!
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

                professores.add(new Professor(nomeProfessor, dataNascimentoProfessor, emailProfessor, senhaProfessor, departamentoProfessor));
            } else if (opcaoProfessor == 3) {
                for (Professor i : professores) {
                    System.out.println(i);
                }
            } else if (opcaoProfessor == 0) {
                System.out.println("Voltando...!");
                secaoProfessorBool = false;
            } else {
                System.out.println("Opcao invalida!");
            }
        } while (secaoProfessorBool);

    }

    private void secaoAluno() {
        boolean alunoAceito = true;
        do {

            int opcaoAluno;
            System.out.println("Selecione a opcao desejada:");
            System.out.println("1 - Efetuar login:");
            System.out.println("2 - Cadastrar:");
            System.out.println("3 - listar cursos:");
            System.out.println("0 - voltar");

            opcaoAluno = input.nextInt();

            if (opcaoAluno == 1) {
                System.out.println("Passe seus dados:");
                input.nextLine(); //TODO Usado para limpar o Scanner sem fechar o input!
                System.out.print("Email: ");
                String login = input.nextLine();
                System.out.println("Senha:");
                String senha = input.nextLine();

                for (Aluno aluno : alunos) {
                    if (aluno.getEmail().equals(login) && aluno.getSenha().equals(senha)) {
                        boolean loginAceito = true;

                        while (loginAceito) {
                            //TODO tratar erros de entrada não numerica!!
                            //logica funcionando!
                            int opcaoLoginAceito;
                            System.out.println("Selecione a opcao desejada:");
                            System.out.println("1 - Listar cursos:");
                            System.out.println("2 - Se cadastrar em um curso:");
                            System.out.println("3 - Sair:");

                            opcaoLoginAceito = input.nextInt();

                            if (opcaoLoginAceito == 1) {
                                for (Curso curso : cursos) {
                                    System.out.println(curso);
                                }
                            } else if (opcaoLoginAceito == 2) {
                                System.out.println("Digite o nome do curso que voce quer se cadastrar:");
                                input.nextLine();
                                String nomeCurso = input.nextLine();

                                for (Curso curso : cursos) {
                                    if (curso.getNome().equals(nomeCurso)) {
                                        curso.cadastrarAluno(aluno);
                                    } else {
                                        System.out.println("Curso não encontrado!");
                                    }
                                }
                            } else if (opcaoLoginAceito == 3) {
                                loginAceito = false;
                            } else {
                                System.out.println("Opcao invalida!");
                            }
                        }
                    }

                }

            } else if (opcaoAluno == 2) {
                System.out.print("Para se cadastrar passe os seguintes dados");

                input.nextLine();
                System.out.print("\nNome:");
                String nomeAluno = input.nextLine();

                System.out.print("\nData de nascimento(**/**/****):");
                String dataNascimentoAluno = input.nextLine();

                System.out.print("\nEmail:");
                String emailAluno = input.nextLine();

                System.out.print("\nSenha:");
                String senhaAluno = input.nextLine();

                for (Aluno aluno : alunos) {
                    if (!aluno.getEmail().equals(emailAluno)) {
                        alunos.add(new Aluno(nomeAluno, dataNascimentoAluno, emailAluno, senhaAluno));
                    } else {
                        System.out.println("Aluno ja no sistema cadastrado!");
                    }
                }
                System.out.println("Cadastro concluido com sucesso!");
            } else if (opcaoAluno == 3) {
                for (Curso curso : cursos) {
                    System.out.println(curso);
                }
            } else if (opcaoAluno == 0) {
                System.out.println("Voltando...");
                alunoAceito = false;
            } else {
                System.out.println("Opcao invalida!");
            }

        } while (alunoAceito);
    }
}
