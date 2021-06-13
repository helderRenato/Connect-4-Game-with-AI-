package Connect4;

import java.awt.Color;
import javax.swing.*;

public class About extends JDialog{
    Sound som = Sound.getInstance();
    public About(){
        criarJDialog();
        //fazer o frame invisivel 
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
    }
    
    public void criarJDialog(){
        JLabel jLabel9 = new javax.swing.JLabel();
        JLabel jLabel8 = new javax.swing.JLabel();
        JLabel jLabel7 = new javax.swing.JLabel();
        JLabel jLabel6 = new javax.swing.JLabel();
        JLabel jLabel5 = new javax.swing.JLabel();
        JButton jButton1 = new javax.swing.JButton();
        JLabel jLabel4 = new javax.swing.JLabel();
        JLabel jLabel3 = new javax.swing.JLabel();
        JLabel jLabel2 = new javax.swing.JLabel();
        JLabel jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("que podem ser horizontais , verticais e diagonal");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(90, 160, 270, 15);

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("3. Para ganhar é necessário formar uma linha de 4 discos  ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(90, 140, 330, 15);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("2. Clique nos espaços em branco para lançar os discos");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(90, 110, 310, 15);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("1. Discos Vermelhos ( você ) vs Discos Amarelos( PC )");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 80, 310, 15);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Como Jogar ?");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 30, 160, 30);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SAIR");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 400, 140, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/img3.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 250, 100, 90);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/img2.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 250, 100, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/img1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 250, 100, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fundo1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 6, 468, 480);

        setSize(new java.awt.Dimension(433, 489));
        setLocationRelativeTo(null);  
        setModalityType(ModalityType.APPLICATION_MODAL);
    }
    
   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        som.buttonClick();
        dispose();
    }        
}
