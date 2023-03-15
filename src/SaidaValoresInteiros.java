import javax.swing.JOptionPane;

public class SaidaValoresInteiros {
    public static void main(String[] args) throws NumberFormatException{
        int valorA = Integer.parseInt(JOptionPane.showInputDialog("Informar Valor A: "));
        int valorB = Integer.parseInt(JOptionPane.showInputDialog("Informar valor B: "));

        int resultado = valorA * valorB;

        JOptionPane.showMessageDialog(null, "Resultado final: "+resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
