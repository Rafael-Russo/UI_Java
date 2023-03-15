import javax.swing.JOptionPane;

public class MediaLer {
    public static void main(String[] args) {
        float nota1, nota2, calcularMedia;

        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira Nota: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda Nota: "));

        calcularMedia = (nota1 + nota2) / 2;

        JOptionPane.showMessageDialog(null, "Resultado da Média: " + calcularMedia, "Resultado Média", JOptionPane.INFORMATION_MESSAGE);
    }
}
