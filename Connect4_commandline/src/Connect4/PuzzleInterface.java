package Connect4;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PuzzleInterface extends javax.swing.JFrame {
    private Sound som = Sound.getInstance();
    private int robotToken = 2, playerToken = 1, ply = 3;
    InitialFrame inicio = InitialFrame.getInstance();
    int positionX = 0, coluna = 0, token = 1, jogada = 1, movimentos = 0, nPuzzle = 0, pastMoves = 0;
    int[][] board = new int[6][7];
    int winner = 0;
    Board desenho = new Board(board, positionX, 60, token);
    Robot robot = new Robot();
    boolean vitoria = false, empate = false;
    GamePlay gameplay = new GamePlay();
    Puzzles p = Puzzles.getInstance();
    private static volatile PuzzleInterface instance = null; 
    
    
    private PuzzleInterface() {
        initComponents();  
        desenho.drawBoard(boardPanel, new PuzzleInterface.MouseEvents(), new PuzzleInterface.MouseMoves(), this);
        
    }
    
    public static PuzzleInterface getInstance(){
        if(instance == null){
            instance = new PuzzleInterface();
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
        jLabel3 = new javax.swing.JLabel();
        restantesMovimentos = new javax.swing.JLabel();
        boardPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Número de Movimentos : ");

        restantesMovimentos.setForeground(new java.awt.Color(255, 255, 255));
        restantesMovimentos.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botIcon)
                .addGap(107, 107, 107)
                .addComponent(retryButton)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(restantesMovimentos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(retryButton)
                            .addComponent(backButton)
                            .addComponent(jLabel4)
                            .addComponent(botIcon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(restantesMovimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
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
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void setNPuzzle(int nPuzzle){
        this.nPuzzle = nPuzzle;
    }
    public void setMovimentos(int mov){
        this.movimentos = mov;
        this.pastMoves = mov;
        atualizarMovimentos(movimentos);
    }
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        som.buttonClick();
        confirmBack();
    }//GEN-LAST:event_backButtonActionPerformed

    private void retryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retryButtonActionPerformed
        som.buttonClick();
        confirmReset();
    }//GEN-LAST:event_retryButtonActionPerformed
   class MouseEvents implements MouseListener{
        @Override
        public void mouseClicked(MouseEvent e) {
            coluna = (int) (e.getX()/60); //obter o valor exato da coluna
            if(coluna >= 0 && coluna <= 6){ jogada = gameplay.move(coluna, board, token); }//atualizar o board
            som.discPlacing();
            if(jogada == 1){ // caso tiver onde jogar posso atualizar  token
                --movimentos;
                atualizarMovimentos(movimentos);
                token = gameplay.vez(token); //atualizar o token
                desenho.setToken(token);
                //se o token for o robo então será permitido ele jogar se o jogo ainda não terminou
                if(token == robotToken && gameplay.gameOver(board) == false){
                    int move = robot.minmax(board, ply, Integer.MIN_VALUE, Integer.MAX_VALUE, true).getMove();
                    gameplay.move(move, board, token);
                    token = gameplay.vez(token); 
                    desenho.setToken(token);
                }
            }
            //verificar se houve alguma vitoria e abrir um pop up
            vitoria = gameplay.gameOver(board);
            if(movimentos >= 0 && vitoria){
                winner = gameplay.win(board);
                if(winner == playerToken){
                    som.winSound();
                    int resp = 0;
                    resp = JOptionPane.showConfirmDialog(new JFrame(), "Você Venceu !. Repetir o puzzle?",
                            "Resultado", JOptionPane.YES_NO_OPTION);
                    //guardar que já passou este puzzle
                    if( !(p.getDoneLvl(nPuzzle).contains("/Images/done_icon.png")) ){
                        p.setDoneLvl(nPuzzle);
                    }
                    if(resp == JOptionPane.YES_OPTION){
                        reset();
                    }else if(resp == JOptionPane.NO_OPTION || resp == JOptionPane.CLOSED_OPTION){
                        instance = null;
                        inicio.setVisible(true);
                        dispose();
                    }
                }else if(winner == robotToken){
                    som.loseSound();
                    int resp = 0;
                    resp = JOptionPane.showConfirmDialog(new JFrame(), "Você perdeu. Repetir o puzzle?",
                                "Resultado", JOptionPane.YES_NO_OPTION);
                    if(resp == JOptionPane.YES_OPTION){
                        reset();
                    }else if(resp == JOptionPane.NO_OPTION || resp == JOptionPane.CLOSED_OPTION){
                        instance = null;
                        inicio.setVisible(true);
                        setVisible(false);
                    }
                }
            }else if(movimentos == 0){
                som.loseSound();
                int resp = 0;
                resp = JOptionPane.showConfirmDialog(new JFrame(), "Seus movimentos terminaram. Repetir o puzzle?",
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
    desenho.setToken(token); movimentos = pastMoves;
    atualizarMovimentos(movimentos);
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
    
    public void atualizarMovimentos(int mov){
        restantesMovimentos.setText(String.valueOf(mov));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel boardPanel;
    private javax.swing.JLabel botIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel restantesMovimentos;
    private javax.swing.JButton retryButton;
    // End of variables declaration//GEN-END:variables
}
