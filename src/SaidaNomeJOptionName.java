import javax.swing.JOptionPane;

public class SaidaNomeJOptionName {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog( "Digite o nome: ");
        String sobreNome = JOptionPane.showInputDialog("Digite o sobrenome: ");

        String nomeCompleto = nome + " " + sobreNome;

        JOptionPane.showMessageDialog(null, "Nome Completo: "+nomeCompleto, "Nome Completo", JOptionPane.INFORMATION_MESSAGE);
    }
}
