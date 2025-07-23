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
import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.Timer;

/**
 *
 * @author adm
 */
public class Jogo extends javax.swing.JFrame {
    private int i;
    private Jogo jogoAnterior;
    private ArrayList<Baralho_Jogador> baralho_jogador;
    private Modelo_Tabela_Jogador modelo_tabela_jogador;

    private ArrayList<Baralho_Adversario> baralho_adversario;
    private Modelo_Tabela_Adversario modelo_tabela_adversario;

    public Jogo() throws SQLException {
        initComponents();
        setTitle("Jogo");
    setSize(615,435);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        //Criando o painel com a imagem
        JPanel p = new JPanel(){
        @Override
        protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g.create();
        Image imagem = new ImageIcon("src/Imagens/mesa.jpg").getImage();
        Image imagem2 = new ImageIcon("src/Imagens/Walter_White_Jogo.png").getImage();        
        float transparencia = 1f;
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,transparencia));
        g2d.drawImage(imagem,0,0,getWidth(),getHeight(),this);
        g2d.drawImage(imagem, 0,0,600,400, this);
        
        g2d.drawImage(imagem,0,0,getWidth(),getHeight(),this);
        g2d.drawImage(imagem2, 60,25,82,120, this);        
        
        g2d.dispose();
        
        }
        };
        p.setBounds(0,0,600,400);
        p.setOpaque(true);
        p.setLayout(null);
        
        getContentPane().add(p);

        p.add(Botao_Adicionar_Carta);
        p.add(Botao_Parar);
        p.add(Pegar_Carta);

    // Posicione os componentes manualmente
//        Tabela_Jogador.setBounds(285, 30, 400, 70);
//        Tabela_Adversario.setBounds(260, 500, 100, 30);
        
//        p.add(Tabela_Jogador);
        p.add(Soma_Jogador);        
        
//        p.add(Tabela_Adversario);
        p.add(Soma_Adversario);
// Exemplo: suponha que a coluna da imagem seja a coluna 1 ("Carta")
//Tabela_Jogador.getColumnModel().getColumn(1).setCellRenderer(new ImageRenderer());
//Tabela_Adversario.getColumnModel().getColumn(1).setCellRenderer(new ImageRenderer());
        baralho_jogador = new ArrayList<>();
        modelo_tabela_jogador = new Modelo_Tabela_Jogador(baralho_jogador);
        Tabela_Jogador.setModel(modelo_tabela_jogador);

        baralho_adversario = new ArrayList<>();
        modelo_tabela_adversario = new Modelo_Tabela_Adversario(baralho_adversario);
        Tabela_Adversario.setModel(modelo_tabela_adversario);

        reiniciar_jogo();
        
    }

    public void reiniciar_jogo() throws SQLException {
        DAO dao = new DAO();
        dao.excluir_cartas_jogador();
        dao.excluir_cartas_adversario();
    }

    //public void iniciar_jogo()
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela_Jogador = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Adversario = new javax.swing.JTable();
        Soma_Adversario = new javax.swing.JLabel();
        Soma_Jogador = new javax.swing.JLabel();
        Botao_Adicionar_Carta = new javax.swing.JButton();
        Botao_Parar = new javax.swing.JButton();
        Pegar_Carta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        Soma_Adversario.setForeground(new java.awt.Color(255, 255, 255));
        Soma_Adversario.setText("Total: 0");

        Soma_Jogador.setForeground(new java.awt.Color(255, 255, 255));
        Soma_Jogador.setText("Total: 0");

        Botao_Adicionar_Carta.setIcon(new javax.swing.ImageIcon("C:\\Users\\adm\\Documents\\NetBeansProjects\\WhiteJack\\src\\Imagens\\Verso_de_Carta_Vermelha.png")); // NOI18N
        Botao_Adicionar_Carta.setActionCommand("");
        Botao_Adicionar_Carta.setLabel("");
        Botao_Adicionar_Carta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_Adicionar_CartaActionPerformed(evt);
            }
        });

        Botao_Parar.setText("Parar");
        Botao_Parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_PararActionPerformed(evt);
            }
        });

        Pegar_Carta.setForeground(new java.awt.Color(255, 255, 255));
        Pegar_Carta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pegar_Carta.setText("Pegar Carta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pegar_Carta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Botao_Adicionar_Carta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Botao_Parar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Soma_Adversario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Soma_Jogador, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Soma_Adversario)
                        .addGap(101, 101, 101)
                        .addComponent(Botao_Parar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(Pegar_Carta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Botao_Adicionar_Carta)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Soma_Jogador)
                        .addGap(34, 34, 34))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao_PararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_PararActionPerformed
        DAO dao = new DAO();
        IA_adversario(() -> {

            try {
                if (dao.somar_cartas_adversario() > 21) {
                    Timer timer = new Timer(200, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JOptionPane.showMessageDialog(
                                Jogo.this,
                                "O adversário estourou",
                                "Vitória",
                                JOptionPane.WARNING_MESSAGE
                            );
                            try {
                                dao.excluir_cartas_jogador();
                                dao.excluir_cartas_adversario();
                                dispose();
                                Vitoria v = new Vitoria();
                                v.setLocationRelativeTo(v);
                                v.setVisible(true);
                            } catch (SQLException ex) {
                                Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }
                    });
                    timer.setRepeats(false);
                    timer.start();
                } else {
                    if (dao.somar_cartas_jogador() > dao.somar_cartas_adversario()) {
                        JOptionPane.showMessageDialog(Botao_Parar, "Você ganhou");
                        dispose();
                        Vitoria v = new Vitoria();
                        v.setLocationRelativeTo(v);
                        v.setVisible(true);

                    } else if (dao.somar_cartas_jogador() < dao.somar_cartas_adversario()) {
                        JOptionPane.showMessageDialog(Botao_Parar, "Você perdeu");
                        Game_Over go = new Game_Over(); // ← 'this' é o Jogo atual
                        go.setLocationRelativeTo(null);
                        go.setVisible(true);
                        this.setVisible(false);
                    } else if (dao.somar_cartas_jogador() == dao.somar_cartas_adversario()) {
                        JOptionPane.showMessageDialog(Botao_Parar, "Deu empate");
                        dispose();
                        Empate e = new Empate();
                        e.setLocationRelativeTo(e);
                        e.setVisible(true);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }//GEN-LAST:event_Botao_PararActionPerformed

    private void Botao_Adicionar_CartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_Adicionar_CartaActionPerformed
        try {
            i=+1;
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
                                    Game_Over go = new Game_Over();
                                    go.setLocationRelativeTo(null);
                                    go.setVisible(true);
                                    Jogo.this.setVisible(false);

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

    public void IA_adversario(Runnable onFinish) {
        try {
            DAO dao = new DAO();

            Timer timer = new Timer(500, null); // 500 ms = 0,5 segundos

            timer.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        if (dao.somar_cartas_adversario() < 17) {
                            dao.adicionar_carta_adversario(); // adiciona uma carta
                            atualizarTabelaAdversario(); // atualiza a tabela após cada carta
                        } else {
                            timer.stop(); // para o timer se a soma >= 17
                            if (onFinish != null) {
                                SwingUtilities.invokeLater(onFinish);
                            }
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        timer.stop();
                        JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
                    }
                }
            });

            timer.setInitialDelay(0); // começa imediatamente
            timer.start();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void atualizarTabelaAdversario() throws SQLException {
        DAO dao = new DAO();
        ArrayList<Baralho_Adversario> baralho_adversario = dao.listar_cartas_adversario();
        int soma_cartas = dao.somar_cartas_adversario();

        modelo_tabela_adversario.setDados(baralho_adversario);
        modelo_tabela_adversario.fireTableDataChanged();

        Soma_Adversario.setText("Total: " + soma_cartas);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Label label = new Label();
                    DAO dao = new DAO();
                    Jogo jogo = new Jogo();
                    jogo.setVisible(true);
                    SwingUtilities.invokeLater(() -> {
                    });
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
    private javax.swing.JLabel Pegar_Carta;
    private javax.swing.JLabel Soma_Adversario;
    private javax.swing.JLabel Soma_Jogador;
    private javax.swing.JTable Tabela_Adversario;
    private javax.swing.JTable Tabela_Jogador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
