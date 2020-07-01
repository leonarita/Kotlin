package imc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class MainForm extends JFrame {
    private JTextField txtPeso;
    private JTextField txtAltura;
    private JRadioButton rdM;
    private JRadioButton rdF;
    private javax.swing.JPanel JPanel;
    private JTextField txtNome;
    private JButton btnCalcular;

    private float peso, altura, result;
    private String nome, sexo, mensagem;

    DecimalFormat df = new DecimalFormat("0.00");

    public MainForm() {

        this.setContentPane(JPanel);
        this.setSize(500, 250);

        // Faz com que a janela seja iniciado no centro da tela
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Atribui eventos
        this.setEvents();
    }

    private void setEvents () {

        this.btnCalcular.addActionListener( new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    if (txtNome.getText().isEmpty() || txtPeso.getText().isEmpty() || txtAltura.getText().isEmpty()) {
                        throw new Exception();
                    }

                    nome = txtNome.getText().toString();
                    peso = Float.parseFloat(txtPeso.getText().toString());
                    altura = Float.parseFloat(txtAltura.getText().toString());

                    result = peso / (altura * altura);

                    if (result < 17) {
                        mensagem = "Muito abaixo do peso!";
                    } else if (result < 19) {
                        mensagem = "Abaixo do peso!";
                    } else if (result < 25) {
                        mensagem = "Peso normal!";
                    } else if (result < 30) {
                        mensagem = "Acima do peso!";
                    } else if (result < 35) {
                        mensagem = "Obesidade I";
                    } else if (result < 40) {
                        mensagem = "Obesidade II";
                    } else {
                        mensagem = "Obesidade III";
                    }

                    if (rdF.isSelected()) {
                        sexo = "Feminino";
                    } else {
                        sexo = "Masculino";
                    }

                    JOptionPane.showMessageDialog(null, "<html><h1>"+ nome + "</h1><p>Peso: "
                            + df.format(peso) + "kg</p> <p>Altura: " + df.format(altura) + "m </p><p>Sexo: " + sexo + "</p> <br><hr> " +
                            "<p>Resultado: "+ df.format(result)+ "Kg/m<sup>2</sup></p> <p>" + mensagem+ "</p></html>");
                }
                catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                }
            }
        } );

        this.rdF.addActionListener( new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                rdM.setSelected(false);
            }
        } );

        this.rdM.addActionListener( new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                rdF.setSelected(false);
            }
        } );
    }
}
