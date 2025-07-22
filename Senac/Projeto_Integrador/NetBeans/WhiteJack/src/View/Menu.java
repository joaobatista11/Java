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

//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import javax.imageio.ImageIO;


public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
                setTitle("Menu");

        Audio audio= new Audio();
        audio.tocar_musica("src/Sons/heisenberg.wav");
                
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
        Image imagem = new ImageIcon("src/Imagens/Walter_White_fofo.gif").getImage();        
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
        
        
    // Posicione os componentes manualmente
//    jLabel1.setBounds(150, 30, 400, 70);
//    Jogar.setBounds(260, 500, 100, 30);

    // Adicione os componentes ao painel
    p.add(jLabel1);
    p.add(Jogar);

    // Adicione o painel ao conteúdo da janela
    getContentPane().add(p);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Jogar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("High Tower Text", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Whitejack");

        Jogar.setText("Jogar");
        Jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(169, 169, 169))
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(Jogar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 315, Short.MAX_VALUE)
                .addComponent(Jogar)
                .addGap(140, 140, 140))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JogarActionPerformed
        try{
            Jogo novo = new Jogo();
            novo.setLocationRelativeTo(null);
            novo.setVisible(true);
            dispose();

        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JogarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jogar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
