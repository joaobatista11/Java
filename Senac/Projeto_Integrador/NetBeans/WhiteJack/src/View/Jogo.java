/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.DAO;
import Model.Baralho_Jogador;
import Model.Modelo_Tabela;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author adm
 */
public class Jogo extends javax.swing.JFrame {
    private ArrayList<Baralho_Jogador> baralho_jogador;
    private Modelo_Tabela modelo_tabela;
    public Jogo() {
  //setDefaultCloseOperation(DISPOSE_ON_CLOSE);        
        initComponents();
        
                setTitle("Jogo");
        // Inicializar a lista de clientes
        DAO dao = new DAO();
        try{
            baralho_jogador = dao.listar_cartas();
        }catch(Exception e){
        e.printStackTrace();
        baralho_jogador = new ArrayList<>();
        }
        modelo_tabela = new Modelo_Tabela(baralho_jogador);
        
        Tabela_Jogador.setModel(modelo_tabela);
        
        Botao_Adicionar_Carta.addActionListener(new ActionListener(){ //
            
            
        @Override
        public void actionPerformed(ActionEvent e){
        }
    });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
            //dispose(); // Fecha apenas a janela
            }
        });

        setVisible(true);
    }                  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Adversario = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela_Jogador = new javax.swing.JTable();
        Soma_Jogador = new javax.swing.JLabel();
        Soma_Adversario = new javax.swing.JLabel();
        Botao_Adicionar_Carta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(62, 33, 3));

        Tabela_Adversario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Carta", "Valor"
            }
        ));
        jScrollPane1.setViewportView(Tabela_Adversario);

        Tabela_Jogador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Carta", "Valor"
            }
        ));
        jScrollPane2.setViewportView(Tabela_Jogador);

        Soma_Jogador.setText("jLabel1");

        Soma_Adversario.setText("jLabel2");

        Botao_Adicionar_Carta.setText("Adicionar Carta");
        Botao_Adicionar_Carta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_Adicionar_CartaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Botao_Adicionar_Carta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Soma_Adversario)
                    .addComponent(Soma_Jogador)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Soma_Adversario)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Soma_Jogador)
                    .addComponent(Botao_Adicionar_Carta))
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void Botao_Adicionar_CartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_Adicionar_CartaActionPerformed
        // TODO add your handling code here:
    try {
        DAO dao = new DAO();
        dao.adicionar_carta();

        // Atualiza a lista e o modelo
        baralho_jogador = dao.listar_cartas();
        modelo_tabela.setDados(baralho_jogador);
        modelo_tabela.fireTableDataChanged(); // Atualiza a tabela visualmente

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());        
    }
    }//GEN-LAST:event_Botao_Adicionar_CartaActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            Label label = new Label();
            DAO dao = new DAO();
            Jogo jogo = new Jogo();
            jogo.setVisible(true);
            //Soma_Jogador.add(dao.somar_cartas());

            try {
                jogo.getSoma_jogador().setText("Total: " + dao.somar_cartas()); // Se precisar acessar diretamente
            } catch (SQLException ex) {
                Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    });
    }
                


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_Adicionar_Carta;
    private javax.swing.JLabel Soma_Adversario;
    private javax.swing.JLabel Soma_Jogador;
    private javax.swing.JTable Tabela_Adversario;
    private javax.swing.JTable Tabela_Jogador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

public JLabel getSoma_jogador(){
return Soma_Jogador;
}

}

