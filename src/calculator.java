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
    private JButton buttonPunto;
    private JButton cButton;
    private JButton CEButton;
    private JButton button2;

    private String numeros = "";
    private double resultado, numPrimero;
    private boolean activador = false;
    private String operador = null;
    private boolean decimales = true;

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
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                double numeroAcutlaPantalla;

                if (operador.equals("nulo"))
                    labelPantalla.setText(numeros);
                else if (operador == "suma")
                {
                    numeroAcutlaPantalla = Double.parseDouble(numeros);
                    resultado = numPrimero + numeroAcutlaPantalla;
                    labelPantalla.setText(String.format("%.2f", resultado));
                    numeros = String.valueOf(resultado);
                    operador = "nulo";
                }
                else if (operador == "resta")
                {
                    numeroAcutlaPantalla = Double.parseDouble(numeros);
                    resultado = numPrimero - numeroAcutlaPantalla;
                    labelPantalla.setText(String.format("%.2f", resultado));
                    numeros = String.valueOf(resultado);
                    operador = "nulo";
                }
                else if (operador == "multiplicacion")
                {
                    numeroAcutlaPantalla = Double.parseDouble(numeros);
                    resultado = numPrimero * numeroAcutlaPantalla;
                    labelPantalla.setText(String.format("%.2f", resultado));
                    numeros = String.valueOf(resultado);
                    operador = "nulo";
                }
                else if (operador == "division")
                {
                    numeroAcutlaPantalla = Double.parseDouble(numeros);
                    if (numeroAcutlaPantalla == 0)
                        labelPantalla.setText("No se puede dividir entre 0");
                    else {
                        resultado = numPrimero / numeroAcutlaPantalla;
                        labelPantalla.setText(String.format("%.2f", resultado));
                        numeros = String.valueOf(resultado);
                    }
                    operador = "nulo";
                }
                labelResult.setText("");
                activador = true;
            }
        });
        buttonPunto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonPunto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(decimales)
                {
                    if (numeros.equals(""))
                        numeros = "0.";
                    else
                        numeros += ".";
                }
                labelPantalla.setText(numeros);
                decimales = false;
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelPantalla.setText("0");
                labelResult.setText("");
                numeros = "";
                activador = true;
                decimales = true;
                operador = "nulo";
            }
        });
        CEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelPantalla.setText("0");
                numeros = "";
                decimales = true;
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tamanioNumero = numeros.length();
                if (tamanioNumero > 0)
                {
                    if (tamanioNumero != 1)
                        numeros = numeros.substring(0, numeros.length() - 1);
                    else
                        numeros = "0";
                    labelPantalla.setText(numeros);
                }
            }
        });
    }
}
