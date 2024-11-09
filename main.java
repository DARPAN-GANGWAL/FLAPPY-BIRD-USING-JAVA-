import javax.swing.*;
public class main{
    public static void main(String[] args) {
        
    
        int boardwidth=360;
        int boardheight=640;

        JFrame frame = new JFrame("Fbird");
        frame.setSize(boardwidth,boardheight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FLAPPY darpan=new FLAPPY();
        frame.add(darpan);
        frame.pack();//pack attribute is added so that the title bar is not included in the width and height entered//
        darpan.requestFocus();
        frame.setVisible(true);

    }
}