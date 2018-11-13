package GestionarUsuario.Utils;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Validador {

    public static boolean condString = false;
    public static boolean condEdad = false;

    public static boolean validadorString(ArrayList<String> jtextfield, int min, int max) {
        for (String string : jtextfield) {
            int cadena = string.toString().length();
            if (cadena >= min && cadena <= max) {
                condString = true;
            } else {
                condString = false;
                JOptionPane.showMessageDialog(null, "Debe ingresar cadenas de entre " + min + " y " + max + " caracteres");
                break;
            }
        }
        return condString;
    }

    public static boolean LimitadorEdad(JTextField arg, int min, int max) {
        try {
            int num = Integer.parseInt(arg.getText());
            if (num >= min && num <= max) {
                condEdad = true;
            } else {
                condEdad = false;
                JOptionPane.showMessageDialog(null, "Debe ingresar edad entre: " + min + " y " + max);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar edad entre: " + min + " y " + max);
        }
        return condEdad;
    }
}
