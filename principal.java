import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        List<aluno> listaAluno = new ArrayList<>();
        List<atividadeComplementar> listaAtividadeComplementar = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Escolha uma operação");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Atividade Complementar");
            System.out.println("3 - Pesquisar as Atividade Complementar");
            System.out.println("4 - Alterar status da Atividade Complementar");
            System.out.println("5 - Mostrar a carga horária das Atividades Complementares de todos os alunos cadastrados");
            System.out.println("6 - Mostrar a carga horária das Atividades Complementares de um aluno cadastrado");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha){
                case 1: // Cadastrar Aluno
                    System.out.println("Digite o nome completo do Aluno:");
                    String nomeCompleto = scanner.nextLine();
                    System.out.println("Digite uma matricula para Aluno:");
                    int matricula = scanner.nextInt();
                    System.out.println("Digite seu curso:");
                    String curso = scanner.nextLine();
                    System.out.println("Digite a carga horaria total do Aluno:");
                    int cargaHorariaTotal = scanner.nextInt();
                    System.out.println("Digite a quantidade de atividades do Aluno:");
                    int quantidadeAtividades = scanner.nextInt();
                    aluno novoAluno = new aluno(nomeCompleto,matricula,curso,cargaHorariaTotal,quantidadeAtividades);
                    listaAluno.add(novoAluno);
                    System.out.println("Aluno adicionado com sucesso!");
                    break;
                
                case 2: // Cadastrar Atividade Complementar
                    System.out.println("Digite o nome completo do Aluno:");
                    String nomeAluno = scanner.nextLine();
                    System.out.println("Digite uma matricula para Aluno:");
                    int matriculacom = scanner.nextInt();
                    System.out.println("Digite seu número de Registro:");
                    int numeroRegistro = scanner.nextInt();
                    System.out.println("Digite o grupo de Atividade:");
                    int grupoAtividade = scanner.nextInt();
                    System.out.println("Digite a descrição da atividade:");
                    String descricaoAtividade = scanner.nextLine();
                    System.out.println("Digite o status de aproveitamento 0 ou 1:");
                    Boolean statusAproveitamento = scanner.nextBoolean();
                    System.out.println("Digite a carga Horaria Considerada:");
                    int cargaHorariaConsiderada = scanner.nextInt();
                    atividadeComplementar novaAtividadeComplementar = new atividadeComplementar(nomeAluno,matriculacom,numeroRegistro,grupoAtividade,descricaoAtividade,statusAproveitamento, cargaHorariaConsiderada);
                    listaAtividadeComplementar.add(novaAtividadeComplementar);
                    System.out.println("Atividade adicionada com sucesso!");
                    scanner.close();
                    break;
                case 3:
                    System.out.println("Para pesquisar as atividades complementares de um aluno digite a matricula:");
                    int matriculaPesquisa = scanner.nextInt();
                    pesquisarAlunoPorMatricula(listaAluno, listaAtividadeComplementar, matriculaPesquisa);

                    break;
            }

        }
    }
    public static void pesquisarAlunoPorMatricula(List<aluno> alunos, List<atividadeComplementar> atividadesComplementares, int matriculaPesquisa){
    for (aluno a : alunos){
        if (a.getMatricula() == matriculaPesquisa){
            System.out.println("Aluno encontrado");
            System.out.println("Nome Completo: "+a.getNomeCompleto()+" Matricula: "+ +a.getMatricula()+ "Curso: "+ a.getCurso()+"Carga Horária Total: "+a.getCargaHorariaTotal()+" Quantidade de Atividades: "+a.getQuantidadeAtividades());

            System.out.println("Atividades Complementares feitos por este aluno");
            for (atividadeComplementar ac : atividadesComplementares){
                if (ac.getNomeAluno().equals(a.getNomeCompleto())){
                    System.out.println();
                }
            }
        }
    }
    }
}
