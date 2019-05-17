/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets.telas;

import pets.modelo.Animal;
import pets.persistenciaArquivo.PersistenciaArquivo;

/**
 *
 * @author rafae
 */
public class CadastroAnimal extends javax.swing.JFrame {

    /**
     * Creates new form CadastroAnimal
     */
    public CadastroAnimal() {
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

        nome = new javax.swing.JLabel();
        dadosAnimal = new javax.swing.JLabel();
        tipo = new javax.swing.JLabel();
        cor = new javax.swing.JLabel();
        raca = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        porte = new javax.swing.JLabel();
        idade = new javax.swing.JLabel();
        castracao = new javax.swing.JLabel();
        vacinaAntirrabica = new javax.swing.JLabel();
        vacinaV10 = new javax.swing.JLabel();
        vermifugacao = new javax.swing.JLabel();
        ultimaLocalizacao = new javax.swing.JLabel();
        observacao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoObservacao = new javax.swing.JTextArea();
        campoNome = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        campoTipo = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        campoCor = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        campoIdade = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        campoUltimaLocalizacao = new javax.swing.JTextPane();
        campoRaca = new javax.swing.JComboBox<>();
        campoSexo = new javax.swing.JComboBox<>();
        campoPorte = new javax.swing.JComboBox<>();
        campoCastracao = new javax.swing.JComboBox<>();
        botaoFinalizar = new javax.swing.JButton();
        campoAntirrabica = new javax.swing.JFormattedTextField();
        campoV10 = new javax.swing.JFormattedTextField();
        campoVermifugacao = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nome.setText("Nome");

        dadosAnimal.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        dadosAnimal.setText("Dados do Animal");

        tipo.setText("Tipo de animal");

        cor.setText("Cor");

        raca.setText("Raça");

        sexo.setText("Sexo");

        porte.setText("Porte");

        idade.setText("Idade");

        castracao.setText("O animal é castrado?");

        vacinaAntirrabica.setText("Vacina antirrábica");

        vacinaV10.setText("Vacina V8 ou V10");

        vermifugacao.setText("Vermifugação");

        ultimaLocalizacao.setText("Último local visto");

        observacao.setText("Informações adicionais");

        campoObservacao.setColumns(20);
        campoObservacao.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        campoObservacao.setRows(5);
        jScrollPane1.setViewportView(campoObservacao);

        jScrollPane3.setViewportView(campoTipo);

        jScrollPane4.setViewportView(campoCor);

        jScrollPane5.setViewportView(campoIdade);

        jScrollPane6.setViewportView(campoUltimaLocalizacao);

        campoRaca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a raça", "Akita", "Basset Hound", "Beagle", "Boxer", "Buldogue", "Bull Terrier", "Chihuahua", "Chow Chow", "Cocker", "Collie", "Dachshund", "Dálmata", "Doberman", "Dogo Argentino", "Fila Brasileiro", "Fox Terrier", "Golden Retriever", "Husky Siberiano", "Labrador", "Lhasa Apso", "Lulu da Pomerânia", "Maltês", "Pastor Alemão", "Pinscher", "Poodle", "Pug", "Rottweiler", "Sem Raça Definida (SRD)", "ShihTzu", "Yorkshire Terrier", "Outra Raça" }));

        campoSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o sexo", "Macho", "Fêmea" }));

        campoPorte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o porte", "Micro Toy", "Pequeno", "Médio", "Grande", "Extra Grande" }));

        campoCastracao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a informação sobre castração", "Sim", "Não", "Não se aplica" }));

        botaoFinalizar.setText("Finalizar");
        botaoFinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoFinalizarMouseClicked(evt);
            }
        });
        botaoFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalizarActionPerformed(evt);
            }
        });

        try {
            campoAntirrabica.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campoV10.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campoVermifugacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(sexo)
                                    .addGap(121, 121, 121))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cor)
                                    .addGap(129, 129, 129)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vacinaV10)
                                    .addComponent(vermifugacao)
                                    .addComponent(vacinaAntirrabica)
                                    .addComponent(idade)
                                    .addComponent(castracao)
                                    .addComponent(dadosAnimal)
                                    .addComponent(porte)
                                    .addComponent(nome)
                                    .addComponent(raca)
                                    .addComponent(ultimaLocalizacao)
                                    .addComponent(tipo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(observacao)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoPorte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoNome)
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane4)
                        .addComponent(campoRaca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5)
                        .addComponent(campoCastracao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(campoAntirrabica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                        .addComponent(campoV10, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campoVermifugacao, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(botaoFinalizar)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(dadosAnimal)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(nome)
                        .addGap(18, 18, 18)
                        .addComponent(tipo)
                        .addGap(23, 23, 23)
                        .addComponent(cor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(campoRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoPorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoCastracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoAntirrabica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoV10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoVermifugacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(raca)
                        .addGap(18, 18, 18)
                        .addComponent(sexo)
                        .addGap(18, 18, 18)
                        .addComponent(porte)
                        .addGap(18, 18, 18)
                        .addComponent(idade)
                        .addGap(18, 18, 18)
                        .addComponent(castracao)
                        .addGap(18, 18, 18)
                        .addComponent(vacinaAntirrabica)
                        .addGap(18, 18, 18)
                        .addComponent(vacinaV10)
                        .addGap(18, 18, 18)
                        .addComponent(vermifugacao)
                        .addGap(24, 24, 24)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ultimaLocalizacao)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(observacao))
                .addGap(27, 27, 27)
                .addComponent(botaoFinalizar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFinalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoFinalizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoFinalizarMouseClicked

    private void botaoFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalizarActionPerformed
         
        //cria um objeto do tipo animal
        Animal novoAnimal = new Animal(this.campoNome.getText(), this.campoTipo.getText(), this.campoCor.getText(), (String)this.campoRaca.getSelectedItem(),
                (String)this.campoSexo.getSelectedItem(), (String)this.campoPorte.getSelectedItem(), this.campoIdade.getText(), (String)this.campoCastracao.getSelectedItem(), this.campoAntirrabica.getText(),
                this.campoV10.getText(), this.campoVermifugacao.getText(), this.campoUltimaLocalizacao.getText(), this.campoObservacao.getText());
        
        // vai salvar os dados do formulário do animal na persistencia de arquivo
        PersistenciaArquivo persistencia = new PersistenciaArquivo();
        
        persistencia.salvarDadosAnimal(novoAnimal);
        
    }//GEN-LAST:event_botaoFinalizarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoFinalizar;
    private javax.swing.JFormattedTextField campoAntirrabica;
    private javax.swing.JComboBox<String> campoCastracao;
    private javax.swing.JTextPane campoCor;
    private javax.swing.JTextPane campoIdade;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextArea campoObservacao;
    private javax.swing.JComboBox<String> campoPorte;
    private javax.swing.JComboBox<String> campoRaca;
    private javax.swing.JComboBox<String> campoSexo;
    private javax.swing.JTextPane campoTipo;
    private javax.swing.JTextPane campoUltimaLocalizacao;
    private javax.swing.JFormattedTextField campoV10;
    private javax.swing.JFormattedTextField campoVermifugacao;
    private javax.swing.JLabel castracao;
    private javax.swing.JLabel cor;
    private javax.swing.JLabel dadosAnimal;
    private javax.swing.JLabel idade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel observacao;
    private javax.swing.JLabel porte;
    private javax.swing.JLabel raca;
    private javax.swing.JLabel sexo;
    private javax.swing.JLabel tipo;
    private javax.swing.JLabel ultimaLocalizacao;
    private javax.swing.JLabel vacinaAntirrabica;
    private javax.swing.JLabel vacinaV10;
    private javax.swing.JLabel vermifugacao;
    // End of variables declaration//GEN-END:variables
}
