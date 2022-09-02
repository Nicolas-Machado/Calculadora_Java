package pacote_teste;

import javax.swing.JOptionPane;

public class App {

    static double valor1;
    static double valor2;

    private static final int OPERACAO_SOMA = 1;
    private static final int OPERACAO_SUBTRACAO = 2;
    private static final int OPERACAO_DIVISAO = 3;
    private static final int OPERACAO_MULTIPLICACAO = 4;
    private static final int OPERACAO_DIFERENCA = 5;
    private static final int OPERACAO_SAIDA = 9;
    static double resultado;


    public static void main(String[] args) {


        boolean valida = true;


        while (valida) {

            try {

                int operacao = Integer.parseInt(JOptionPane.showInputDialog("Selecione um tipo de operação: \nSoma: 1 \nSubtração: 2 \nDivisão: 3 \nMultiplicação: 4 \nDiferença de Valores: 5 \nFechar: 9"));
                String descricaoResultado = "Resultado da Operação: ";

                switch (operacao) {

                    case OPERACAO_SOMA: {
                        dadosCalculo();
                        resultado = soma();
                        JOptionPane.showMessageDialog(null, descricaoResultado + resultado);
                        break;
                    }

                    case OPERACAO_SUBTRACAO: {
                        dadosCalculo();
                        resultado = valor1 - valor2;
                        JOptionPane.showMessageDialog(null, descricaoResultado + resultado);
                        break;
                    }

                    case OPERACAO_DIVISAO: {
                        dadosCalculo();
                        resultado = valor1 / valor2;
                        JOptionPane.showMessageDialog(null, descricaoResultado + resultado);
                        break;
                    }

                    case OPERACAO_MULTIPLICACAO: {
                        dadosCalculo();
                        resultado = valor1 * valor2;
                        JOptionPane.showMessageDialog(null, descricaoResultado + resultado);
                        break;
                    }

                    case OPERACAO_DIFERENCA: {
                        dadosDiferenca();
                        JOptionPane.showMessageDialog(null, descricaoResultado + resultado);
                        break;
                    }

                    case OPERACAO_SAIDA: {
                        JOptionPane.showMessageDialog(null, "Até Mais!!!");
                        valida = false;
                        break;
                    }

                    default:
                        JOptionPane.showMessageDialog(null, "Valor incorreto!! tente novamente");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Insira somente números nestes campos");
            }
        }
    }

    private static double soma() {
        return valor1 + valor2;
    }

    public static void dadosCalculo() {
        valor1 = (Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número")));
        valor2 = (Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número")));
    }

    public static void dadosDiferenca() {
        dadosCalculo();
        double valor3 = (Double.parseDouble(JOptionPane.showInputDialog("Insira o terceiro número")));
        double valor4 = (Double.parseDouble(JOptionPane.showInputDialog("Insira o quarto número")));
        resultado = (valor1 * valor2) - (valor3 * valor4);
    }

}
