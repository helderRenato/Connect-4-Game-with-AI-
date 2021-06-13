package Connect4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

public class SelecDific extends JDialog{
    Sound som = Sound.getInstance();
    AIFrame ai = AIFrame.getInstance();
    private JFrame frame;
    private static SelecDific instance = null;
    
    private SelecDific(JFrame framePrincipal){
        super(framePrincipal, true);
        frame = framePrincipal;
        createPanel();
    }
    
    public static SelecDific getInstance(JFrame framePrincipal){
        if(instance == null){
            instance = new SelecDific(framePrincipal);
        }
    return instance;
    }
    
    public void createPanel(){
        JPanel jPanel1 = new javax.swing.JPanel();
        JButton facilButton = new javax.swing.JButton();
        JButton dificilButton = new javax.swing.JButton();
        JButton medioButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(128, 206, 225));

        facilButton.setBackground(new java.awt.Color(51, 255, 0));
        facilButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        facilButton.setForeground(new java.awt.Color(255, 255, 255));
        facilButton.setText("FÁCIL");
        facilButton.setBorder(null);
        facilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFacilActionPerformed(evt);
            }
        });

        dificilButton.setBackground(new java.awt.Color(255, 0, 0));
        dificilButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        dificilButton.setForeground(new java.awt.Color(255, 255, 255));
        dificilButton.setText("DIFÍCIL");
        dificilButton.setBorder(null);
        dificilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDificActionPerformed(evt);
            }
        });

        medioButton.setBackground(new java.awt.Color(255, 255, 0));
        medioButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        medioButton.setForeground(new java.awt.Color(255, 255, 255));
        medioButton.setText("MÉDIO");
        medioButton.setBorder(null);
        medioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(medioButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dificilButton, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                        .addComponent(facilButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(facilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(medioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dificilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        
        getContentPane().add(jPanel1);
        pack();
        setModalityType(ModalityType.APPLICATION_MODAL);
        setLocationRelativeTo(null);
    }

    private void buttonFacilActionPerformed(ActionEvent e){
        som.buttonClick();
        ai.setPly(4);
        ai.setVisible(true);
        Dispose();
    }

    private void buttonMedioActionPerformed(ActionEvent e){
        som.buttonClick();
        ai.setPly(5);
        ai.setVisible(true);
        Dispose();
    }

    private void buttonDificActionPerformed(ActionEvent e){
        som.buttonClick();
        ai.setPly(6);
        ai.setVisible(true);
        Dispose();
    }
    
    public void Dispose(){
        instance = null;
        frame.dispose();
        super.dispose();
    }
}
