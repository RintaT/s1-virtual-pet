import javax.swing.*;


public class Runner {
    
    public Runner(){

        VirtualPet v = new VirtualPet();
        
        
    }

    public static void main(String[] args) {
        new Runner();
        
    }

    String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    "Your Message",
                    "Your Title",
                    JOptionPane.PLAIN_MESSAGE
);

    String s2 = (String)JOptionPane.showInputDialog(
    new JFrame(),
    "How many laps should I run?",
    "Question?",
    JOptionPane.PLAIN_MESSAGE
  );
int x = Integer.parseInt(s);





}
