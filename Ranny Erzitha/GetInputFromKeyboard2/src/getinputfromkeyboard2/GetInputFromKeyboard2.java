
package getinputfromkeyboard2;

/**
 *
 * @author 21343013-Ranny Erzitha
 */
import javax.swing.JOptionPane;

public class GetInputFromKeyboard2 {

    public static void main(String[] args) {
        String name = "", hoby = "";
        
        name = JOptionPane.showInputDialog("Nama Anda : ");
        hoby = JOptionPane.showInputDialog("Hobi Anda : ");
        
        String msg = "Jadi Hobi anda " + hoby + ","
                + "Hoby yang Bagus" +name ;
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println("Jadi Hobi Anda " + hoby + ", Hobi yang Bagus");
        
    }
    
}
