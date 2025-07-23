/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author adm
 */

public class Empate extends javax.swing.JFrame {
    /**
     * Creates new form Game_Over
*/
    public Empate() {
        initComponents();
        setTitle("Empate");
        
        setSize(615,615);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        //Criando o painel com a imagem
        JPanel p = new JPanel(){
        @Override
        protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g.create();
        Image imagem = new ImageIcon("src/Imagens/Walter_White_Empate.png").getImage();        
        float transparencia = 1f;
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,transparencia));
        g2d.drawImage(imagem,0,0,getWidth(),getHeight(),this);
        g2d.drawImage(imagem, 0,0,600,600, this);
        g2d.dispose();
        }
        };
        p.setBounds(0,0,600,600);
        p.setOpaque(true);
        p.setLayout(null);
        
        getContentPane().add(p);                
        p.add(jLabel1);
        p.add(Jogar_Novamente);
        p.add(Ir_ao_Menu);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Jogar_Novamente = new javax.swing.JButton();
        Ir_ao_Menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Empate");

        Jogar_Novamente.setText("Jogar novamente");
        Jogar_Novamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jogar_NovamenteActionPerformed(evt);
            }
        });

        Ir_ao_Menu.setText("Ir ao Menu");
        Ir_ao_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ir_ao_MenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Jogar_Novamente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ir_ao_Menu))
                    .addComponent(jLabel1))
                .addGap(143, 143, 143))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 202, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jogar_Novamente)
                    .addComponent(Ir_ao_Menu))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jogar_NovamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jogar_NovamenteActionPerformed

try{
            Jogo novo = new Jogo();
            novo.setLocationRelativeTo(null);
            novo.setVisible(true);
        //}
        dispose();

    } catch (SQLException ex) {
        ex.printStackTrace();
        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_Jogar_NovamenteActionPerformed

    private void Ir_ao_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ir_ao_MenuActionPerformed
        Menu m = new Menu();
        m.setLocationRelativeTo(m); // Centraliza a janela
        m.setVisible(true);
            dispose(); // Fecha tela atual
    }//GEN-LAST:event_Ir_ao_MenuActionPerformed

   public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empate().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ir_ao_Menu;
    private javax.swing.JButton Jogar_Novamente;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
