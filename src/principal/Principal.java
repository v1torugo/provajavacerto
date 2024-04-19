package principal;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        // Coleta informações da pessoa
        String nome = JOptionPane.showInputDialog("Digite o nome:");
        String cargo = JOptionPane.showInputDialog("Digite o cargo:");
        String habilidades = JOptionPane.showInputDialog("Digite as habilidades:");
        String idadeStr = JOptionPane.showInputDialog("Digite a idade:");
        int idade = Integer.parseInt(idadeStr);
        String sexo = JOptionPane.showInputDialog("Digite o sexo:");
        String endereco = JOptionPane.showInputDialog("Digite o endereço:");
        String cidade = JOptionPane.showInputDialog("Digite a cidade:");
        String estado = JOptionPane.showInputDialog("Digite o estado:");

        // Exibe as informações coletadas
        String mensagem = "Informações da Pessoa:\n\n" +
                "Nome: " + nome + "\n" +
                "Cargo: " + cargo + "\n" +
                "Habilidades: " + habilidades + "\n" +
                "Idade: " + idade + "\n" +
                "Sexo: " + sexo + "\n" +
                "Endereço: " + endereco + "\n" +
                "Cidade: " + cidade + "\n" +
                "Estado: " + estado;

        JOptionPane.showMessageDialog(null, mensagem);
    }
}

