package morse;

import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Morse {

    /**
     * @param args the command line arguments
     */
    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put(" "," ");
        diccionario.put("A",".-");
        diccionario.put("B","-...");
        diccionario.put("C","-.-.");
        diccionario.put("D","-..");
        diccionario.put("E",".");
        diccionario.put("F","..-.");
        diccionario.put("G","--.");
        diccionario.put("H","....");
        diccionario.put("I","..");
        diccionario.put("J",".---");
        diccionario.put("K","-.-");
        diccionario.put("L",".-..");
        diccionario.put("M","--");
        diccionario.put("N","-.");
        diccionario.put("O","---");
        diccionario.put("P",".--.");
        diccionario.put("Q","--.-");
        diccionario.put("R",".-.");
        diccionario.put("S","...");
        diccionario.put("T","-");
        diccionario.put("U","..-");
        diccionario.put("V","...-");
        diccionario.put("W",".--");
        diccionario.put("X","-..-");
        diccionario.put("Y","-.--");
        diccionario.put("Z","--..");
        diccionario.put("1",".----");
        diccionario.put("2","..---");
        diccionario.put("3","...--");
        diccionario.put("4","....-");
        diccionario.put("5",".....");
        diccionario.put("6","-....");
        diccionario.put("7","--...");
        diccionario.put("8","---..");
        diccionario.put("9","----.");
        diccionario.put("0","-----");
        
        
        
        String text;
        
        text = JOptionPane.showInputDialog(null, "Ingrese una frase para traducir a codigo morse");
        
        String morse = "";
        
        for (char c : text.toCharArray()) {
        	
        	morse += diccionario.get((c + "").toUpperCase()) + " ";
        }
        
        JOptionPane.showMessageDialog(null, "Codigo Morse: " + morse);
	
    }
    
}
