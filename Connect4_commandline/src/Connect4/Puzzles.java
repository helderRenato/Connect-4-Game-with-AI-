package Connect4;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Puzzles extends javax.swing.JFrame implements Serializable{

    Sound som = Sound.getInstance();
    private static Puzzles instance = null;
    private int nPuzzleCompletos = 0;
    
    private Puzzles() {
        initComponents();
        Salvar s = new Salvar();
        ArrayList<Integer> niveis = s.open("ficheiro.bin");
        
        for(Integer nivel :niveis) 
            setDoneLvl(nivel);
            
    }
    
    public static Puzzles getInstance(){
        if(instance == null){
            instance = new Puzzles();
        }
    return instance;   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        puzzle1 = new javax.swing.JButton();
        puzzle2 = new javax.swing.JButton();
        puzzle3 = new javax.swing.JButton();
        puzzle4 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        donelvl1 = new javax.swing.JLabel();
        donelvl2 = new javax.swing.JLabel();
        donelvl3 = new javax.swing.JLabel();
        donelvl4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 643));

        jPanel1.setBackground(new java.awt.Color(128, 206, 225));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/puzzle_icon.png"))); // NOI18N

        puzzle1.setBackground(new java.awt.Color(255, 153, 0));
        puzzle1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        puzzle1.setForeground(new java.awt.Color(255, 255, 255));
        puzzle1.setText("1");
        puzzle1.setBorder(null);
        puzzle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzle1ActionPerformed(evt);
            }
        });

        puzzle2.setBackground(new java.awt.Color(255, 153, 0));
        puzzle2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        puzzle2.setForeground(new java.awt.Color(255, 255, 255));
        puzzle2.setText("2");
        puzzle2.setBorder(null);
        puzzle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzle2ActionPerformed(evt);
            }
        });

        puzzle3.setBackground(new java.awt.Color(255, 153, 0));
        puzzle3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        puzzle3.setForeground(new java.awt.Color(255, 255, 255));
        puzzle3.setText("3");
        puzzle3.setBorder(null);
        puzzle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzle3ActionPerformed(evt);
            }
        });

        puzzle4.setBackground(new java.awt.Color(255, 153, 0));
        puzzle4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        puzzle4.setForeground(new java.awt.Color(255, 255, 255));
        puzzle4.setText("4");
        puzzle4.setBorder(null);
        puzzle4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puzzle4ActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(7, 195, 136));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back_icon.png"))); // NOI18N
        backButton.setBorder(null);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(donelvl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(puzzle1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(puzzle2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(puzzle3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(puzzle4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(donelvl2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(donelvl3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(donelvl4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puzzle1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puzzle2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puzzle3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puzzle4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(donelvl1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(donelvl2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(donelvl3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(donelvl4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(341, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        som.buttonClick();
        InitialFrame inicio = InitialFrame.getInstance();
        inicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void puzzle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzle1ActionPerformed
        som.buttonClick();
        PuzzleInterface p = PuzzleInterface.getInstance();
        p.setNPuzzle(1);
        p.setMovimentos(10);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_puzzle1ActionPerformed

    private void puzzle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzle2ActionPerformed
        som.buttonClick();
        PuzzleInterface p = PuzzleInterface.getInstance();
        p.setNPuzzle(2);
        p.setMovimentos(8);
        p.setVisible(true);
        dispose();   
    }//GEN-LAST:event_puzzle2ActionPerformed

    private void puzzle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzle3ActionPerformed
        som.buttonClick();
        PuzzleInterface p = PuzzleInterface.getInstance();
        p.setNPuzzle(3);
        p.setMovimentos(6);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_puzzle3ActionPerformed

    private void puzzle4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puzzle4ActionPerformed
        som.buttonClick();
        PuzzleInterface p = PuzzleInterface.getInstance();
        p.setNPuzzle(4);
        p.setMovimentos(4);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_puzzle4ActionPerformed
    
    public String getDoneLvl(int nLevel){
        if(nLevel == 1){
            if(this.donelvl1.getIcon() == null){
                return "";
            }
            return this.donelvl1.getIcon().toString();
        }else if(nLevel == 2){
            if(this.donelvl2.getIcon() == null){
                return "";
            }
            return this.donelvl2.getIcon().toString();
        }else if(nLevel == 3){
            if(this.donelvl3.getIcon() == null){
                return "";
            }
            return this.donelvl3.getIcon().toString();
        }else if(nLevel == 4){
            if(this.donelvl4.getIcon() == null){
                return "";
            }
            return this.donelvl4.getIcon().toString();
        }
    return "";
    }
    
    public void setDoneLvl(int nLevel){
        Salvar s = new Salvar();
        ArrayList niveis = s.open("ficheiro.bin");
        niveis.add(nLevel);
        if(nLevel == 1){
            this.donelvl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/done_icon.png")) );
            
        }else if(nLevel == 2){
            this.donelvl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/done_icon.png")) );   
      
        }else if(nLevel == 3){
            this.donelvl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/done_icon.png")) );
         
        }else if(nLevel == 4){
            this.donelvl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/done_icon.png")) );
         
        }
        //gravar em um ficheiro
        s.save("ficheiro.bin", niveis);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel donelvl1;
    private javax.swing.JLabel donelvl2;
    private javax.swing.JLabel donelvl3;
    private javax.swing.JLabel donelvl4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton puzzle1;
    private javax.swing.JButton puzzle2;
    private javax.swing.JButton puzzle3;
    private javax.swing.JButton puzzle4;
    // End of variables declaration//GEN-END:variables
}
