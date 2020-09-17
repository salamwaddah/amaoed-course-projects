import javax.swing.JOptionPane;

public class GetInputUsingJOptionPane {
    public static void main(String[] args) {
        String name;
        name = JOptionPane.showInputDialog("Enter your name: ");
        String msg = "Hello " + name + "!";
        JOptionPane.showMessageDialog(null, msg);
    }
}
