package br.com.login.view;

import br.com.login.controller.CadastroController;
import javax.swing.JOptionPane;

public class CadastroView extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CadastroView.class.getName());

    private CadastroController controller;

    public CadastroView() {
        initComponents();

        controller = new CadastroController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OlhoSenha = new javax.swing.JLabel();
        OlhoRepSenha = new javax.swing.JLabel();
        TextRepSenha = new javax.swing.JPasswordField();
        TextSenha = new javax.swing.JPasswordField();
        TextRepEmail = new javax.swing.JTextField();
        TextCpf = new javax.swing.JTextField();
        TextEmail = new javax.swing.JTextField();
        TextNome = new javax.swing.JTextField();
        TextSobrenome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OlhoSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/OlhoFechado.png"))); // NOI18N
        OlhoSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OlhoSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickOlho(evt);
            }
        });
        getContentPane().add(OlhoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 378, -1, 60));

        OlhoRepSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/OlhoFechado.png"))); // NOI18N
        OlhoRepSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OlhoRepSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickRepOlho(evt);
            }
        });
        getContentPane().add(OlhoRepSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(927, 378, -1, 60));

        TextRepSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(TextRepSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 350, 35));

        TextSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(TextSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 350, 35));

        TextRepEmail.setPreferredSize(new java.awt.Dimension(71, 35));
        getContentPane().add(TextRepEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 830, -1));

        TextCpf.setPreferredSize(new java.awt.Dimension(71, 35));
        getContentPane().add(TextCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 830, -1));

        TextEmail.setPreferredSize(new java.awt.Dimension(71, 35));
        getContentPane().add(TextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 830, -1));

        TextNome.setPreferredSize(new java.awt.Dimension(71, 35));
        getContentPane().add(TextNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 400, -1));

        TextSobrenome.setPreferredSize(new java.awt.Dimension(71, 35));
        getContentPane().add(TextSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 400, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ButtonRegistrar.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickCadastrar(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 560, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TelaCadastro.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ClickCadastrar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickCadastrar
        String nome = TextNome.getText().trim();
        String sobrenome = TextSobrenome.getText().trim();
        String email = TextEmail.getText().trim();
        String repEmail = TextRepEmail.getText().trim();
        String senha = new String(TextSenha.getPassword()).trim();
        String repSenha = new String(TextRepSenha.getPassword()).trim();
        String cpf = TextCpf.getText().trim();

        if (nome.isEmpty() || sobrenome.isEmpty() || email.isEmpty() || repEmail.isEmpty()
                || senha.isEmpty() || repSenha.isEmpty() || cpf.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!email.equals(repEmail)) {
            JOptionPane.showMessageDialog(this, "Emails não conferem!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!senha.equals(repSenha)) {
            JOptionPane.showMessageDialog(this, "Senhas não conferem!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (controller.cadastrarUsuario(nome, sobrenome, email, senha, cpf)) {
            JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar. Verifique os dados.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ClickCadastrar

    private void ClickOlho(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickOlho
        if (TextSenha.getEchoChar() != (char) 0) {
            TextSenha.setEchoChar((char) 0);
            TextRepSenha.setEchoChar((char) 0);
            OlhoSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/OlhoAberto.png")));
            OlhoRepSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/OlhoAberto.png")));
        } else {
            TextSenha.setEchoChar('•');
            TextRepSenha.setEchoChar('•');
            OlhoSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/OlhoFechado.png")));
            OlhoRepSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/OlhoFechado.png")));
        }
    }//GEN-LAST:event_ClickOlho

    private void ClickRepOlho(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickRepOlho
        if (TextSenha.getEchoChar() != (char) 0) {
            TextSenha.setEchoChar((char) 0);
            TextRepSenha.setEchoChar((char) 0);
            OlhoSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/OlhoAberto.png")));
            OlhoRepSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/OlhoAberto.png")));
        } else {
            TextSenha.setEchoChar('•');
            TextRepSenha.setEchoChar('•');
            OlhoSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/OlhoFechado.png")));
            OlhoRepSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/OlhoFechado.png")));
        }
    }//GEN-LAST:event_ClickRepOlho

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new CadastroView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OlhoRepSenha;
    private javax.swing.JLabel OlhoSenha;
    private javax.swing.JTextField TextCpf;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TextRepEmail;
    private javax.swing.JPasswordField TextRepSenha;
    private javax.swing.JPasswordField TextSenha;
    private javax.swing.JTextField TextSobrenome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
