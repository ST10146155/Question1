/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package TEST_PROG5121;

import javax.swing.JOptionPane;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        JOptionPane.showMessageDialog(null, "Helloooo");
        JOptionPane.showMessageDialog(null, new Login().login);
       
    }
}
