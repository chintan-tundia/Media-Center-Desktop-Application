package media_ceter;

import java.awt.*;
import static java.awt.Frame.HAND_CURSOR;
import java.awt.event.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.*;
import javax.swing.*;

/**
 *
 * @author admin
 */
class InPage extends JFrame implements MouseListener{

    InPage() {
        super("Media Center");
        Dimension dimension = new Dimension(640, 480);
       
        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(dimension);
        setResizable(false);

        dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) (dimension.getWidth() / 2 - getWidth() / 2);
        int y = (int) (dimension.getHeight() / 2 - getHeight() / 2);
        setLocation(x, y);
        try {
            setLayout(new BorderLayout());
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("images/mainpagebk.jpg")))));

            JLayeredPane lpane = new JLayeredPane();
            lpane.setBounds(0, 0, 640, 480);
            add(lpane, BorderLayout.CENTER);
            
            JPanel startbuttonPanel = new JPanel();            
            x = (int) (getWidth() / 2);
            y = (int) (getHeight() / 2 );
            startbuttonPanel.setBounds(270, 200, 100, 150);
            startbuttonPanel.setCursor(new Cursor(HAND_CURSOR));
            startbuttonPanel.setOpaque(false);
            startbuttonPanel.add(new JLabel(new ImageIcon(ImageIO.read(new File("images/power2.png")))));
            startbuttonPanel.addMouseListener(this); 
            lpane.add(startbuttonPanel, new Integer(1), 0);
            
            
            JPanel buttonPanel1 = new JPanel();                        
            buttonPanel1.setBounds(270, 50, 100, 150);
            buttonPanel1.setCursor(new Cursor(HAND_CURSOR));
            buttonPanel1.setOpaque(false);
            buttonPanel1.add(new JLabel(new ImageIcon(ImageIO.read(new File("images/pictures.png")))));
            buttonPanel1.addMouseListener(this); 
            lpane.add(buttonPanel1, new Integer(1), 0);
            
            JPanel buttonPanel2 = new JPanel();                        
            buttonPanel2.setBounds(430, 200, 100, 150);
            buttonPanel2.setCursor(new Cursor(HAND_CURSOR));
            buttonPanel2.setOpaque(false);
            buttonPanel2.add(new JLabel(new ImageIcon(ImageIO.read(new File("images/music.png")))));
            buttonPanel2.addMouseListener(this); 
            lpane.add(buttonPanel2, new Integer(1), 0);
            
            JPanel buttonPanel3 = new JPanel();                        
            buttonPanel3.setBounds(270, 350, 100, 150);
            buttonPanel3.setCursor(new Cursor(HAND_CURSOR));
            buttonPanel3.setOpaque(false);
            buttonPanel3.add(new JLabel(new ImageIcon(ImageIO.read(new File("images/video.png")))));
            buttonPanel3.addMouseListener(this); 
            lpane.add(buttonPanel3, new Integer(1), 0);
            
            JPanel buttonPanel4 = new JPanel();                        
            buttonPanel4.setBounds(120, 200, 100, 100);
            buttonPanel4.setCursor(new Cursor(HAND_CURSOR));
            buttonPanel4.setOpaque(false);
            buttonPanel4.add(new JLabel(new ImageIcon(ImageIO.read(new File("images/record.png")))));
            buttonPanel4.addMouseListener(this); 
            lpane.add(buttonPanel4, new Integer(1), 0);
            
            
            
            pack();
        } catch (IOException ex) {
            Logger.getLogger(InPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void mouseDragged(MouseEvent e) {
        
    }


    public void mouseMoved(MouseEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        try
        {
            setVisible(false);
        }
        catch(Exception ioe)
        {
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        try
        {
            Component obj = e.getComponent();
            JPanel jp=(JPanel)obj;                
            //jp.updateUI();
            //jp.removeAll();
            //jp.add(new JLabel(new ImageIcon(ImageIO.read(new File("images/power1.png")))));
        }
        catch(Exception ioe)
        {
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
         try
        {
            Component obj = e.getComponent();
            JPanel jp=(JPanel)obj;                
            //jp.updateUI();
            //jp.removeAll();
            //jp.add(new JLabel(new ImageIcon(ImageIO.read(new File("images/power2.png")))));
        }
        catch(Exception ioe)
        {
        }
    }

}
class HomePage extends JFrame implements MouseListener{

    HomePage() {
        super("Media Center");
        Dimension dimension = new Dimension(720, 580);
        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(dimension);
        setResizable(false);

        dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) (dimension.getWidth() / 2 - getWidth() / 2);
        int y = (int) (dimension.getHeight() / 2 - getHeight() / 2);
        setLocation(x, y);
        try {
            setLayout(new BorderLayout());
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("images/mainpagebk.jpg")))));

            JLayeredPane lpane = new JLayeredPane();

            JPanel startbuttonPanel = new JPanel();

            lpane.setBounds(0, 0, 600, 400);
            x = (int) (getWidth() / 2);
            y = (int) (getHeight() / 2 );
            startbuttonPanel.setBounds(270, 200, 100, 150);
            startbuttonPanel.setCursor(new Cursor(HAND_CURSOR));
            startbuttonPanel.setOpaque(false);
            startbuttonPanel.add(new JLabel(new ImageIcon(ImageIO.read(new File("images/power1.png")))));
            startbuttonPanel.addMouseListener(this); 
            lpane.add(startbuttonPanel, new Integer(1), 0);
            add(lpane, BorderLayout.CENTER);
            pack();
        } catch (IOException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void mouseDragged(MouseEvent e) {
        
    }


    public void mouseMoved(MouseEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        try
        {
            setVisible(false);
            InPage inp=new InPage();
            
        }
        catch(Exception ioe)
        {
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        try
        {
            Component obj = e.getComponent();
            JPanel jp=(JPanel)obj;                
            jp.updateUI();
            jp.removeAll();
            jp.add(new JLabel(new ImageIcon(ImageIO.read(new File("images/power2.png")))));
        }
        catch(Exception ioe)
        {
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
         try
        {
            Component obj = e.getComponent();
            JPanel jp=(JPanel)obj;                
            jp.updateUI();
            jp.removeAll();
            jp.add(new JLabel(new ImageIcon(ImageIO.read(new File("images/power1.png")))));
        }
        catch(Exception ioe)
        {
        }
    }

}

public class Media_Ceter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        new HomePage();
    }
}
