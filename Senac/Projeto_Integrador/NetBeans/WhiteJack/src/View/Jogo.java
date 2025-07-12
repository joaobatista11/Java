/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.DAO;
import Model.Baralho_Adversario;
import Model.Baralho_Jogador;
import Model.Modelo_Tabela_Adversario;
import Model.Modelo_Tabela_Jogador;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.Timer;
/**
 *
 * @author adm
 */
public class Jogo extends javax.swing.JFrame {
    private ArrayList<Baralho_Jogador> baralho_jogador;
    private Modelo_Tabela_Jogador modelo_tabela_jogador;

    private ArrayList<Baralho_Adversario> baralho_adversario;       
    private Modelo_Tabela_Adversario modelo_tabela_adversario;        
    
public Jogo() throws SQLException {
    initComponents();
    setTitle("Jogo");

    baralho_jogador = new ArrayList<>();
    modelo_tabela_jogador = new Modelo_Tabela_Jogador(baralho_jogador);
    Tabela_Jogador.setModel(modelo_tabela_jogador);
    
    baralho_adversario = new ArrayList<>();    
    modelo_tabela_adversario = new Modelo_Tabela_Adversario(baralho_adversario);
    Tabela_Adversario.setModel(modelo_tabela_adversario);
    
    setVisible(true); // <-- agora sim

    SwingUtilities.invokeLater(() -> {
    new Thread(() -> {
        IA_adversario(); // Chamada segura fora da EDT
    }).start();
});
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
        Botao_Parar = new javax.swing.JButton();

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

        Soma_Jogador.setForeground(new java.awt.Color(255, 255, 255));
        Soma_Jogador.setText("Total: 0");

        Soma_Adversario.setForeground(new java.awt.Color(255, 255, 255));
        Soma_Adversario.setText("Total: 0");

        Botao_Adicionar_Carta.setText("Adicionar Carta");
        Botao_Adicionar_Carta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_Adicionar_CartaActionPerformed(evt);
            }
        });

        Botao_Parar.setText("Parar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Botao_Adicionar_Carta)
                .addGap(37, 37, 37)
                .addComponent(Botao_Parar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
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
                    .addComponent(Botao_Adicionar_Carta)
                    .addComponent(Botao_Parar))
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

public void IA_adversario(){
    try {
        DAO dao = new DAO();
  Timer timer = new Timer(1000, null);        
        
    timer.setInitialDelay(0); // Começa imediatamente
        while(dao.somar_cartas_adversario()<17){
    timer.start();
            dao.adicionar_carta_adversario();
            //Thread.sleep(1000);
        }
 timer.stop();
        
        SwingWorker<ArrayList<Baralho_Adversario>, Void> worker = new SwingWorker<>() {
            private int soma_cartas = 0;

            @Override
            protected ArrayList<Baralho_Adversario> doInBackground() throws Exception {
                ArrayList<Baralho_Adversario> cartas = dao.listar_cartas_adversario();
                soma_cartas = dao.somar_cartas_adversario();

                return cartas;
            }

            @Override
            protected void done() {
                try {
                    baralho_adversario = get();
                    modelo_tabela_adversario.setDados(baralho_adversario);
                    modelo_tabela_adversario.fireTableDataChanged();

                    Soma_Adversario.setText("Total: " + soma_cartas);

                    
                    if (soma_cartas > 21) {
                        javax.swing.Timer timer = new javax.swing.Timer(200, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JOptionPane.showMessageDialog(
                                    Jogo.this,
                                    "O adversario estourou",
                                    "Vitória",
                                    JOptionPane.WARNING_MESSAGE
                                );
                                dispose();
                                Vitoria v = new Vitoria();
                                v.setLocationRelativeTo(v);
                                v.setVisible(true);
                            }
                        });
                        timer.setRepeats(false);
                        timer.start();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(
                        Jogo.this,
                        "Erro ao atualizar: " + ex.getMessage()
                    );
                }
            }
        };

        worker.execute(); // <-- Aqui é onde tudo começa

    } catch (SQLException ex) {
        Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());        
    }
}

    private void Botao_Adicionar_CartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_Adicionar_CartaActionPerformed
        // TODO add your handling code here:
    try {
        DAO dao = new DAO();
        dao.adicionar_carta_jogador();

        SwingWorker<ArrayList<Baralho_Jogador>, Void> worker = new SwingWorker<>() {
            private int soma_cartas = 0;

            @Override
            protected ArrayList<Baralho_Jogador> doInBackground() throws Exception {
                ArrayList<Baralho_Jogador> cartas = dao.listar_cartas_jogador();
                soma_cartas = dao.somar_cartas_jogador();
                return cartas;
            }

            @Override
            protected void done() {
                try {
                    baralho_jogador = get();
                    modelo_tabela_jogador.setDados(baralho_jogador);
                    modelo_tabela_jogador.fireTableDataChanged();

                    Soma_Jogador.setText("Total: " + soma_cartas);

                    if (soma_cartas > 21) {
                        javax.swing.Timer timer = new javax.swing.Timer(200, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JOptionPane.showMessageDialog(
                                    Jogo.this,
                                    "Você estourou",
                                    "Game Over",
                                    JOptionPane.WARNING_MESSAGE
                                );
                                dispose();
                                Game_Over go = new Game_Over();
                                go.setLocationRelativeTo(go);
                                go.setVisible(true);
                            }
                        });
                        timer.setRepeats(false);
                        timer.start();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(
                        Jogo.this,
                        "Erro ao atualizar: " + ex.getMessage()
                    );
                }
            }
        };

        worker.execute(); // <-- Aqui é onde tudo começa

    } catch (SQLException ex) {
        Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());        
    }
    }//GEN-LAST:event_Botao_Adicionar_CartaActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            try {
                Label label = new Label();
                DAO dao = new DAO();
                Jogo jogo = new Jogo();
                jogo.setVisible(true);
                //Soma_Jogador.add(dao.somar_cartas());
            } catch (SQLException ex) {
                Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    });
    }
                


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_Adicionar_Carta;
    private javax.swing.JButton Botao_Parar;
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
public JLabel getSoma_adversario(){
return Soma_Adversario;
}
}

