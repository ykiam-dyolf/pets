/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets.telas;

/**
 *
 * @author rafae
 */
public class CadastroDono extends javax.swing.JPanel {

    /**
     * Creates new form CadastroDono
     */
    public CadastroDono() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dadosDono = new javax.swing.JLabel();
        numTelefone = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        numCelular = new javax.swing.JLabel();
        facebook = new javax.swing.JLabel();
        instagram = new javax.swing.JLabel();
        twitter = new javax.swing.JLabel();
        campoNumTelefone = new javax.swing.JFormattedTextField();
        campoNumCelular = new javax.swing.JFormattedTextField();
        campoEmail = new javax.swing.JTextField();
        campoFacebook = new javax.swing.JTextField();
        campoInstagram = new javax.swing.JTextField();
        campoTwitter = new javax.swing.JTextField();
        botaoFinaizar = new javax.swing.JButton();

        dadosDono.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        dadosDono.setText("Contato");

        numTelefone.setText("Telefone");

        email.setText("E-mail");

        numCelular.setText("Celular");

        facebook.setText("Facebook");

        instagram.setText("Instagram");

        twitter.setText("Twitter");

        try {
            campoNumTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campoNumCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        botaoFinaizar.setText("Finalizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dadosDono)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numTelefone)
                                .addGap(27, 27, 27)
                                .addComponent(campoNumTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numCelular)
                                .addGap(18, 18, 18)
                                .addComponent(campoNumCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email)
                                    .addComponent(facebook))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoEmail)
                                    .addComponent(campoFacebook)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(instagram)
                                    .addComponent(twitter))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoInstagram)
                                    .addComponent(campoTwitter)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(botaoFinaizar)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(dadosDono)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numTelefone)
                    .addComponent(campoNumTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numCelular)
                    .addComponent(campoNumCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facebook)
                    .addComponent(campoFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instagram)
                    .addComponent(campoInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twitter)
                    .addComponent(campoTwitter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(botaoFinaizar)
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoFinaizar;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoFacebook;
    private javax.swing.JTextField campoInstagram;
    private javax.swing.JFormattedTextField campoNumCelular;
    private javax.swing.JFormattedTextField campoNumTelefone;
    private javax.swing.JTextField campoTwitter;
    private javax.swing.JLabel dadosDono;
    private javax.swing.JLabel email;
    private javax.swing.JLabel facebook;
    private javax.swing.JLabel instagram;
    private javax.swing.JLabel numCelular;
    private javax.swing.JLabel numTelefone;
    private javax.swing.JLabel twitter;
    // End of variables declaration//GEN-END:variables
}
