package S8A2.BORDERLAYOUT;
//DemoBorderLayout.java
import javax.swing.JFrame;

public class DemoBorderLayout {
    public static void main(String[] args) {
        MarcoBorderLayout marcoBorderLayout = new MarcoBorderLayout();
        marcoBorderLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoBorderLayout.setSize(400, 200);
        marcoBorderLayout.setVisible(true);
    }
} // fin de la clase DemoBorderLayout