import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator {
    private JLabel labelTitulo;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton buttonSuma;
    private JButton buttonResta;
    private JButton buttonMultiplicacion;
    private JButton buttonDivision;
    private JButton button8;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a8Button;
    private JButton a9Button;
    private JLabel labelResult;
    private JButton a0Button;
    public JPanel panelCalculator;
    private JLabel labelPantalla;

    private String numeros = null;
    private double resultado, numPrimero;
    private boolean activador = false;
    private String operador = null;

    public calculator()
    {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (labelPantalla.getText().equals("0"))
                    numeros = "1";
                else
                    numeros += "1";
                labelPantalla.setText(numeros);
                activador = true;
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (labelPantalla.getText().equals("0"))
                    numeros = "2";
                else
                    numeros += "2";
                labelPantalla.setText(numeros);
                activador = true;
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (labelPantalla.getText().equals("0"))
                    numeros = "3";
                else
                    numeros += "3";
                labelPantalla.setText(numeros);
                activador = true;
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (labelPantalla.getText().equals("0"))
                    numeros = "4";
                else
                    numeros += "4";
                labelPantalla.setText(numeros);
                activador = true;
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (labelPantalla.getText().equals("0"))
                    numeros = "5";
                else
                    numeros += "5";
                labelPantalla.setText(numeros);
                activador = true;
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (labelPantalla.getText().equals("0"))
                    numeros = "6";
                else
                    numeros += "6";
                labelPantalla.setText(numeros);
                activador = true;
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (labelPantalla.getText().equals("0"))
                    numeros = "7";
                else
                    numeros += "7";
                labelPantalla.setText(numeros);
                activador = true;
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (labelPantalla.getText().equals("0"))
                    numeros = "8";
                else
                    numeros += "8";
                labelPantalla.setText(numeros);
                activador = true;
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (labelPantalla.getText().equals("0"))
                    numeros = "9";
                else
                    numeros += "9";
                labelPantalla.setText(numeros);
                activador = true;
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (labelPantalla.getText().equals("0"))
                    numeros = "0";
                else
                    numeros += "0";
                labelPantalla.setText(numeros);
                activador = true;
            }
        });
        buttonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (activador) {
                    numPrimero = Double.parseDouble(numeros);
                    labelResult.setText(numeros + " + ");
                    numeros = "";
                    activador = false;
                    operador = "suma";
                }
            }
        });
        buttonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (activador) {
                    numPrimero = Double.parseDouble(numeros);
                    labelResult.setText(numeros + " - ");
                    numeros = "";
                    activador = false;
                    operador = "resta";
                }
            }
        });
        buttonMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (activador) {
                    numPrimero = Double.parseDouble(numeros);
                    labelResult.setText(numeros + " X ");
                    numeros = "";
                    activador = false;
                    operador = "multiplicacion";
                }
            }
        });
        buttonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (activador) {
                    numPrimero = Double.parseDouble(numeros);
                    labelResult.setText(numeros + " / ");
                    numeros = "";
                    activador = false;
                    operador = "division";
                }
            }
        });
    }
}
