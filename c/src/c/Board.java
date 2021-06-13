package c;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board {
        
    public void drawboard(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
        MyDrawPanel desenho = new MyDrawPanel();
        panel.setLayout(new BorderLayout());
        panel.add(desenho, BorderLayout.CENTER);
        panel.addMouseListener(new MouseEvents());
        
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
    
    //class para desenhar o board e os outros elementos
    class MyDrawPanel extends JPanel{
        public void paintComponent(Graphics g){
            Graphics2D g2 = (Graphics2D) g;
            int size = 50; //tamanho do quadrado
        
            //criar uma matriz 6x7 de circulos e um background cor azul
            for(int r = 0 ; r < 6 ; ++r){
                for(int c = 0 ; c <= 6 ; ++c){
                    g2.setColor(Color.BLUE);
                    g2.fillRect(c*size,r*size, size, size);
                    g2.setColor(Color.WHITE);
                    g2.fillOval(c*size, r*size, size, size);//posicionar cada circulo por colunas
                }
            } 
        }
    }
    //end MYDRAWPANEL
    
    //Criar classe para reconhecer cada posição dos meus circulos
    class MouseEvents implements MouseListener{
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("["+e.getX()+","+e.getY()+" ]");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
}
