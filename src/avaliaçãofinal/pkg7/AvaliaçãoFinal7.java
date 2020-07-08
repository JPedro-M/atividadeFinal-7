package avaliaçãofinal.pkg7;
import javax.swing.JOptionPane;
/**
 *
 * @author troll
 */
public class AvaliaçãoFinal7 {
    public static void main(String[] args) {
        int numero, resultado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        
        if (numero%2 != 0) {
            resultado = numero*3;
        }else {
            resultado = numero*2;
        }
        
        JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
    }
}
