package Connect4;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Connect4 extends javax.swing.JFrame {
    Sound som = Sound.getInstance();
    InitialFrame inicio = InitialFrame.getInstance();
    int positionX = 0, coluna = 0, token = 1, jogada = 1 ;
    int[][] board = new int[6][7];
    int winner = 0;
    Board desenho = new Board(board, positionX, 60, token);
    boolean vitoria = false, empate = false;
    GamePlay gameplay = new GamePlay();
    private static Connect4 instance = null;
    
    private Connect4() {
        initComponents();
        desenho.drawBoard(boardPanel, new MouseEvents(), new MouseMoves(), this);
    }
    
    public static Connect4 getInstance(){
        if(instance == null){
            instance = new Connect4();
        }
    return instance;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        boardPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        retryButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout boardPanelLayout = new javax.swing.GroupLayout(boardPanel);
        boardPanel.setLayout(boardPanelLayout);
        boardPanelLayout.setHorizontalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
        );
        boardPanelLayout.setVerticalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(4, 59, 96));

        backButton.setBackground(new java.awt.Color(7, 195, 136));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back_icon.png"))); // NOI18N
        backButton.setBorder(null);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        retryButton.setBackground(new java.awt.Color(7, 195, 136));
        retryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/retry_icon.png"))); // NOI18N
        retryButton.setBorder(null);
        retryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retryButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/player1_icon.png"))); // NOI18N
        jLabel1.setText("Player 1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/player2_icon.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Jogador 2");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Jogador 1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(179, 179, 179)
                .addComponent(retryButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel4))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(retryButton)
                            .addComponent(backButton))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        som.buttonClick();
        confirmBack();
        reset();
    }//GEN-LAST:event_backButtonActionPerformed

    private void retryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retryButtonActionPerformed
        som.buttonClick();
        confirmReset();
    }//GEN-LAST:event_retryButtonActionPerformed

    public void reset(){
        for(int r = 0 ; r < 6 ; ++r){
            for(int c = 0; c <= 6 ; ++c){
                board[r][c] = 0;
            }
        }
    token = 1; vitoria = false; positionX = 0; 
    coluna = 0; token = 1; jogada = 1 ; vitoria = false;
    gameplay = new GamePlay(); winner = 0;empate = false;
    desenho.setToken(token);
    }
    
    //Criar classe para reconhecer cada posição dos meus circulos
    class MouseEvents implements MouseListener{
        
        @Override
        public void mouseClicked(MouseEvent e) {
            coluna = (int) (e.getX()/60); //obter o valor exato da coluna
            if(coluna >= 0 && coluna <= 6){ jogada = gameplay.move(coluna, board, token); }//atualizar o board
            som.discPlacing();
            if(jogada == 1){ // caso tiver onde jogar posso atualizar  token
                token = gameplay.vez(token); //atualizar o token
                desenho.setToken(token);
            }
            //verificar se houve alguma vitoria e abrir um pop up
            vitoria = gameplay.gameOver(board);
            empate = gameplay.isFull(board);
            if(vitoria){
                winner = gameplay.win(board);
                int resp = 0;
                //saber qual dos jogadores venceu e mandar uma mensagem customizada para cada
                resp = JOptionPane.showConfirmDialog(new JFrame(), "Jogador "+winner+" venceu !. Continuar ?",
                            "Resultado", JOptionPane.YES_NO_OPTION);
                if(resp == JOptionPane.YES_OPTION){
                    reset();
                }else if(resp == JOptionPane.NO_OPTION || resp == JOptionPane.CLOSED_OPTION){
                    instance = null;
                    inicio.setVisible(true);
                    dispose();
                }
            }else if(empate){
                int resp = 0;
                //saber qual dos jogadores venceu e mandar uma mensagem customizada para cada
                resp = JOptionPane.showConfirmDialog(new JFrame(), "Empate",
                            "Resultado", JOptionPane.YES_NO_OPTION);
                if(resp == JOptionPane.YES_OPTION){
                    reset();
                }else if(resp == JOptionPane.NO_OPTION || resp == JOptionPane.CLOSED_OPTION){
                    instance = null;
                    inicio.setVisible(true);
                    dispose();
                }
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
        }
        @Override
        public void mouseExited(MouseEvent e) {
        }
    }
    //end MouseEvents
    
    class MouseMoves extends JFrame implements MouseMotionListener{
        @Override
        public void mouseDragged(MouseEvent e) {
        }
        @Override
        public void mouseMoved(MouseEvent e) {
            positionX = e.getX();
            desenho.setPositionX(positionX);
        }
    }
    //end MouseMoves
    public void confirmReset(){
      int resp = 0;
      resp = JOptionPane.showConfirmDialog(new JFrame(), "Quer mesmo resetar o jogo?", "Reset", JOptionPane.OK_OPTION);
      if(resp == JOptionPane.OK_OPTION){
          reset();
      }
    }
    
    public void confirmBack(){
      int resp = 0;
      resp = JOptionPane.showConfirmDialog(new JFrame(), "Quer mesmo voltar?", "Voltar", JOptionPane.OK_OPTION);
      if(resp == JOptionPane.OK_OPTION){
        inicio.setVisible(true);
        dispose();
      }        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel background;
    private javax.swing.JPanel boardPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton retryButton;
    // End of variables declaration//GEN-END:variables
}
