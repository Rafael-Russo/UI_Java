import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class FramesPanel {
    public static void main(String[] args) {
        JFrame janela = new JFrame("UI");
        JButton botao = new JButton("Botão do Swing");
        JLabel texto = new JLabel("N Clicks");
        JPanel painel = new JPanel();
        painel.add(botao);
        painel.add(texto);
        janela.getContentPane().add(painel);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new GridBagLayout());
        janela.setSize(600, 400);
        janela.setLocationRelativeTo(null);
        janela.setUndecorated(true);
        janela.setShape(new Ellipse2D.Double(0, 0, 400, 400));
        janela.setVisible(true);
    }
}