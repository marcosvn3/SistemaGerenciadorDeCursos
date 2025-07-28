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

        Professor prof1 = new Professor("Marcos","15/03/1999","Marcos@proje.com","ma123","Dcomp");
        professores.add(prof1);


        System.out.println("=================================");
        System.out.println("Bem-vindo ao nosso sistema!");
        System.out.println("=================================");
        System.out.println("Informe seu tipo:");

        System.out.println("1 - Professor");
        System.out.println("2 - Aluno");
        System.out.println("0 - Encerrar sistema");

        int opcao = input.nextInt();

        while(opcao != 0) {
            if(opcao == 1) {
                int opcaoProfessor;
                System.out.println("Selecione a opcao desejada:");
                System.out.println("1 - Efetuar login:");
                System.out.println("2 - Cadastrar:");

                opcaoProfessor = input.nextInt();

                if(opcaoProfessor == 1){
                    Scanner inputProfessor = new Scanner(System.in);

                    System.out.println("Passe seus dados:");
                    System.out.println("Email: ");
                    String login = inputProfessor.nextLine();
                    System.out.println();
                    System.out.println("Senha:");
                    String senha = inputProfessor.nextLine();


                    for(Professor i : professores){
                        if (i.getEmail().equals(login) && i.getSenha().equals(senha)){
                            boolean loginAceito = true;

                            while(loginAceito){
                                int opcaoLoginAceito;
                                System.out.println("Selecione a opcao desejada:");
                                System.out.println("1 - Cadastrar curso:");
                                System.out.println("2 - listar cursos cadastrados:");
                                System.out.println("3 - Sair:");

                                opcaoLoginAceito = input.nextInt(); // erro apos o primeiro cadastro, verificar!

                                if(opcaoLoginAceito == 1){
                                    System.out.print("Nome do curso:");
                                    String nomeCurso = input.next();

                                    System.out.print("Descricao do curso:");
                                    String descricao = input.next();

                                    i.criarCurso(new Curso(nomeCurso,descricao));
                                }
                            }
                    }

                    }
                }


            }



        }















    }



}
