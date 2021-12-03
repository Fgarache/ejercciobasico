import javax.swing.*;

public class condicionales {
    public static void main(String[] args) {
        int n, dato = 5;
        n = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));

        if (n == dato) {
            JOptionPane.showMessageDialog(null, "el numero si es 5");
        } else JOptionPane.showMessageDialog(null, "no es el  numero");
    }
}
