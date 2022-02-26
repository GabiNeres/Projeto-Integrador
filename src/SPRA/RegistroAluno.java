/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SPRA;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author cliente
 */
public class RegistroAluno extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public RegistroAluno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    User us;

    public User getUs() {
        return us;
    }

    public void setUs(User us) {
        this.us = us;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        labelMatAl = new javax.swing.JLabel();
        labelNomeAl = new javax.swing.JLabel();
        labelIdadeAl = new javax.swing.JLabel();
        labelTurmaAl = new javax.swing.JLabel();
        txtMatAl = new javax.swing.JTextField();
        txtNomeAl = new javax.swing.JTextField();
        txtIdadeAl = new javax.swing.JTextField();
        txtTurmaAl = new javax.swing.JTextField();
        buttRegAluno = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        labelTitle.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        labelTitle.setText("Sistema para Registro de Autorizações - Registrar Aluno");

        labelMatAl.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        labelMatAl.setText("Matrícula");

        labelNomeAl.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        labelNomeAl.setText("Nome Completo");

        labelIdadeAl.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        labelIdadeAl.setText("Idade");

        labelTurmaAl.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        labelTurmaAl.setText("Turma");

        txtTurmaAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTurmaAlActionPerformed(evt);
            }
        });

        buttRegAluno.setText("Registrar Aluno");
        buttRegAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttRegAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTitle)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNomeAl)
                            .addComponent(labelMatAl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIdadeAl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTurmaAl, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtIdadeAl, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNomeAl, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMatAl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTurmaAl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(buttRegAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtIdadeAl, txtMatAl, txtNomeAl, txtTurmaAl});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMatAl)
                            .addComponent(txtMatAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNomeAl)
                            .addComponent(txtNomeAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelIdadeAl))
                    .addComponent(txtIdadeAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelTurmaAl)
                    .addComponent(txtTurmaAl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(buttRegAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtIdadeAl, txtMatAl, txtNomeAl, txtTurmaAl});

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

    private void txtTurmaAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTurmaAlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTurmaAlActionPerformed

    private void buttRegAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttRegAlunoActionPerformed
        // TODO add your handling code here:
        if ((txtMatAl.getText().length() != 0) && (txtNomeAl.getText().length() != 0)
                && (txtIdadeAl.getText().length() != 0) && (txtTurmaAl.getText().length() != 0)) {
            //confere se todos os campos estão preenchidos 

            try {
                int a = Integer.parseInt(txtIdadeAl.getText());
                
                try {

                    Connection conn = null;
                    conn = Conexao.getConnection();
                    //inicia a conexão centralizada com o banco
                    Statement stmt = conn.createStatement();
                    //cria o statement

                    String cmd = "insert into aluno values('"
                            + txtMatAl.getText() + "','" + txtNomeAl.getText() + "','"
                            + txtIdadeAl.getText() + "'," + "'" + txtTurmaAl.getText() + "')";
                    //comando insert do mysql para o banco de dados

                    int i = stmt.executeUpdate(cmd);
                    //cria variável i que vai saber quantas linhas foram aleradas

                    if (i == 0) {
                        JOptionPane.showMessageDialog(null, "ERRO! Registro não inserido.", "Mensagem",
                                JOptionPane.INFORMATION_MESSAGE);
                        //se nenhuma linha foi alterada, diz que ocorreu algum erro
                    } else {
                        JOptionPane.showMessageDialog(null, "SUCESSO! Aluno cadastrado.", "Mensagem",
                                JOptionPane.INFORMATION_MESSAGE);
                        //se alguma linha foi alterada, está no banco de dados, significa que foi cadastrado com sucesso
                        this.setVisible(false);
                        RegistroAutorizacao in = new RegistroAutorizacao();
                        Alun al = new Alun(txtMatAl.getText());
                        in.setAs(al);
                        in.alterarAlu();
                        in.setUs(us);
                        in.setVisible(true);
                        //sai dessa tela e vai para a proxima e usa um construtor para já alterar alguns
                        //dados de lá
                    }
                    stmt.close();
                    conn.close();
                    //fecha a conxão

                } catch (Exception e) {
                    e.printStackTrace();
                    //trata os erros
                }

            } catch (NumberFormatException e) {
                // Se entrar aqui o numero é invalido.  
                JOptionPane.showMessageDialog(null, "Coloque números inteiros e não palavras no campo de idade!",
                                             "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                
            }

            //inicializa a variável para a conxão com o banco
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Mensagem",
                    JOptionPane.INFORMATION_MESSAGE);
            //mensagem de erro se tiver algum dado faltando
        }
    }//GEN-LAST:event_buttRegAlunoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttRegAluno;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelIdadeAl;
    private javax.swing.JLabel labelMatAl;
    private javax.swing.JLabel labelNomeAl;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelTurmaAl;
    private javax.swing.JTextField txtIdadeAl;
    private javax.swing.JTextField txtMatAl;
    private javax.swing.JTextField txtNomeAl;
    private javax.swing.JTextField txtTurmaAl;
    // End of variables declaration//GEN-END:variables
}
