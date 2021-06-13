package Connect4;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AIFrame extends javax.swing.JFrame {
    private Sound som = Sound.getInstance();
    private int robotToken = 2, playerToken = 1, ply = 0, playerPontos = 0, robotPontos = 0;
    InitialFrame inicio = InitialFrame.getInstance();
    int positionX = 0, coluna = 0, token = 1, jogada = 1 ;
    int[][] board = new int[6][7];
    int winner = 0;
    Board desenho = new Board(board, positionX, 60, token);
    Robot robot = new Robot();
    boolean vitoria = false, empate = false;
    GamePlay gameplay = new GamePlay();
    private static volatile AIFrame instance = null; 
    
    
    private AIFrame() {
        initComponents();  
        desenho.drawBoard(boardPanel, new MouseEvents(), new MouseMoves(), this);
    }
    
    public static AIFrame getInstance(){
        if(instance == null){
            instance = new AIFrame();
        }
    return instance;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        retryButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botIcon = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botPoints = new javax.swing.JLabel();
        playerPoints = new javax.swing.JLabel();
        boardPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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

        botIcon.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botIcon.setForeground(new java.awt.Color(255, 255, 0));
        botIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/robot_icon.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user_icon.png"))); // NOI18N

        botPoints.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        botPoints.setForeground(new java.awt.Color(255, 255, 255));
        botPoints.setText("0");

        playerPoints.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        playerPoints.setForeground(new java.awt.Color(255, 255, 255));
        playerPoints.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(playerPoints)
                .addGap(55, 55, 55)
                .addComponent(botPoints)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botIcon)
                .addGap(107, 107, 107)
                .addComponent(retryButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botPoints)
                                .addComponent(playerPoints))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(retryButton)
                                .addComponent(backButton)
                                .addComponent(jLabel4)
                                .addComponent(botIcon)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        boardPanel.setPreferredSize(new java.awt.Dimension(421, 487));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void setPly(int a){
        ply = a;
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        som.buttonClick();
        robotPontos = 0; playerPontos = 0;
        confirmBack();
    }//GEN-LAST:event_backButtonActionPerformed

    private void retryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retryButtonActionPerformed
        som.buttonClick();
        robotPontos = 0; playerPontos = 0;
        confirmReset();
    }//GEN-LAST:event_retryButtonActionPerformed
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
                //se o token for o robo então será permitido ele jogar
                if(token == robotToken && gameplay.gameOver(board) == false){
                    int move = robot.minmax(board, ply, Integer.MIN_VALUE, Integer.MAX_VALUE, true).getMove();
                    gameplay.move(move, board, token);
                    token = gameplay.vez(token); 
                    desenho.setToken(token);
                }
            }
            //verificar se houve alguma vitoria e abrir um pop up
            vitoria = gameplay.gameOver(board);
            empate = gameplay.isFull(board);
            if(vitoria){
                winner = gameplay.win(board);
                int resp = 0;
                //saber qual dos jogadores venceu e mandar uma mensagem customizada para cada
                    if(winner == robotToken){
                        som.loseSound();
                        resp = JOptionPane.showConfirmDialog(new JFrame(), "A AI venceu . Continuar ?",
                        "Resultado", JOptionPane.YES_NO_OPTION);
                        ++robotPontos;
                    }else{
                        som.winSound();
                        resp = JOptionPane.showConfirmDialog(new JFrame(), "Jogador "+winner+" venceu !. Continuar ?",
                        "Resultado", JOptionPane.YES_NO_OPTION); 
                        ++playerPontos;
                    }
                if(resp == JOptionPane.YES_OPTION){
                    reset();
                    atualizarPontos(playerPontos, robotPontos);
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
                    setVisible(false);
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
    atualizarPontos(playerPontos, robotPontos);
    }
    
    public void atualizarPontos(int player, int robot){
        botPoints.setText(String.valueOf(robot));
        playerPoints.setText( String.valueOf(player));
    }
    
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
        reset();
        inicio.setVisible(true);
        dispose();
      }        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel boardPanel;
    private javax.swing.JLabel botIcon;
    private javax.swing.JLabel botPoints;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel playerPoints;
    private javax.swing.JButton retryButton;
    // End of variables declaration//GEN-END:variables
}
