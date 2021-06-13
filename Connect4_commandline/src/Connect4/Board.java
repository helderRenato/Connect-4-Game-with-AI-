package Connect4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board extends JPanel{
    private int[][] b;
    private int positionX;
    private int size;
    private int token;
    
    public Board(int[][] b ,int positionX, int size, int token){
        this.b = b;
        this.positionX = positionX;
        this.size = size;
        this.token = token;
    }
    
    private int[][] getB(){
        return this.b;
    }
    public void setPositionX(int x){
        this.positionX = x;
    }
    private int getPositionX(){
        return this.positionX;
    }
    private int getSiz(){
        return this.size;
    }
    
    public void setToken(int token){
        this.token = token;
    }
    private int getToken(){
        return this.token;
    }
    
    public void drawBoard(JPanel boardPanel, MouseListener mouseEvent, MouseMotionListener mouseMoves, JFrame frame){
        boardPanel.setLayout(new BorderLayout());
        boardPanel.add(this, BorderLayout.CENTER);
        
        
        boardPanel.addMouseListener(mouseEvent);
        boardPanel.addMouseMotionListener(mouseMoves);
        
        frame.add(boardPanel);
        frame.setPreferredSize(new Dimension(800, 700));
        frame.pack();
    }
    
    public void paintComponent(Graphics g){
        int size = getSiz();
        int positionX = getPositionX();
        super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            
            RenderingHints render = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON); //renderizar os meus components
            g2.addRenderingHints(render);
            //animação do circulo do player
            if(token == 1){
                g2.setColor(Color.RED);
                g2.fillOval(positionX, size-5, size, size);
                repaint();
            }else if(token == 2){
                g2.setColor(Color.YELLOW);
                g2.fillOval(positionX, size-5, size, size);
                repaint();
            }
            //end animação cima do board
            
            //criar uma matriz 6x7 de circulos e um background cor azul
            for(int r = 0 ; r < 6 ; ++r){
                for(int c = 0 ; c <= 6 ; ++c){
                    g2.setColor(Color.BLUE);
                    g2.fillRect(c*size, (r+2)*size, size, size);
                    
                    //ocupar cada circulo do board com a sua respectiva cor de representação do token
                    g2.setColor(Color.WHITE);
                    if(b[r][c] > 0){
                        if(b[r][c] == 1){g2.setColor(Color.red);}
                        if(b[r][c] == 2){g2.setColor(Color.YELLOW);}
                    }
                    g2.fillOval(c*size, (r+2)*size, size, size);//posicionar cada circulo por colunas    
            }
        }
        
    }
}

