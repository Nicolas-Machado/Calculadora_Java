package pacote_teste;

import javax.swing.JOptionPane;

public class App {

    static String valor1;
    static String valor2;

    public static void main(String[] args) throws Exception {

        double resultado;
        boolean valida = true;


       while (valida) {

           try {

               String dado = JOptionPane.showInputDialog("Selecione um tipo de operação: \nSoma: 1 \nSubtração: 2 \nDivisão: 3 \nMultiplicação: 4 \nFechar: 5");

               switch (dado) {
                   case "1":
                       dadosCalculo();
                       resultado = Double.parseDouble(valor1) + Double.parseDouble(valor2);
                       JOptionPane.showMessageDialog(null, "Resultado da operação " + resultado);
                       break;

                   case "2":
                       dadosCalculo();
                       resultado = Double.parseDouble(valor1) - Double.parseDouble(valor2);
                       JOptionPane.showMessageDialog(null, "Resultado da operação " + resultado);
                       break;

                   case "3":
                       dadosCalculo();
                       resultado = Double.parseDouble(valor1) / Double.parseDouble(valor2);
                       JOptionPane.showMessageDialog(null, "Resultado da operação " + resultado);
                       break;

                   case "4":
                       dadosCalculo();
                       resultado = Double.parseDouble(valor1) * Double.parseDouble(valor2);
                       JOptionPane.showMessageDialog(null, "Resultado da operação " + resultado);
                       break;

                   case "5":
                       JOptionPane.showMessageDialog(null, "Até Mais!!!");
                       valida = false;
                       break;

                   default:
                       JOptionPane.showMessageDialog(null, "Valor incorreto!! tente novamente");
               }
           }catch (Exception e){
               JOptionPane.showMessageDialog(null, "Erro ao inserir os dados: " + e);
           }
       }
    }

    public static void dadosCalculo(){
        boolean validaNumero = true;

        while (validaNumero) {

            valor1 = (JOptionPane.showInputDialog("Insira o primeiro número"));

            if (!valor1.matches("\\d+")){
                JOptionPane.showMessageDialog(null, "Digite apenas números!!");
                validaNumero = false;
            }else {
                valor2 = (JOptionPane.showInputDialog("Insira o segundo número"));

                if (!valor2.matches("\\d+")){
                    JOptionPane.showMessageDialog(null, "Digite apenas números!!");
                    validaNumero = false;

                }
            }
        }
    }
}
