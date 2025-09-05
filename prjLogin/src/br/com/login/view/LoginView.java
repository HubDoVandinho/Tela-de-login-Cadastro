package br.com.login.view;

import br.com.login.controller.LoginController;
import javax.swing.JOptionPane;

public class LoginView extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginView.class.getName());
    private LoginController controller;
    private LoginController loginController;

    public LoginView() {
        initComponents();
        controller = new LoginController();
        loginController = new LoginController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextSenha = new javax.swing.JPasswordField();
        TextUsuario = new javax.swing.JTextField();
        OlhoSenha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(TextSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 650, 35));

        TextUsuario.setPreferredSize(new java.awt.Dimension(71, 35));
        getContentPane().add(TextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 710, -1));

        OlhoSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/OlhoFechado.png"))); // NOI18N
        OlhoSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OlhoSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickOlho(evt);
            }
        });
        getContentPane().add(OlhoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(876, 400, 40, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ButtonEntrar.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickEntrar(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 485, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/BotaoRegistre-se.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickRegistrar(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 485, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TelaLogin.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ClickRegistrar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickRegistrar
        CadastroView telaCadastro = new CadastroView();
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_ClickRegistrar

    private void ClickEntrar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickEntrar
        LoginController loginController = new LoginController();

        String login = TextUsuario.getText();
        String senha = new String(TextSenha.getPassword());

        if (loginController.fazerLogin(login, senha)) {
            JOptionPane.showMessageDialog(this, "Login realizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Login ou senha incorretos!");
        }
    }//GEN-LAST:event_ClickEntrar

    private void ClickOlho(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickOlho
        if (TextSenha.getEchoChar() != (char) 0) {

            TextSenha.setEchoChar((char) 0);
            OlhoSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/OlhoAberto.png")));
        } else {

            TextSenha.setEchoChar('•');
            OlhoSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/OlhoFechado.png")));
        }
    }//GEN-LAST:event_ClickOlho

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new LoginView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OlhoSenha;
    private javax.swing.JPasswordField TextSenha;
    private javax.swing.JTextField TextUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
