
package pets.telasMob;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import pets.modelo.Animal;
import pets.persistenciaArquivo.PersistenciaArquivo;

/**
 *
 * @author B. Dalzini/Maiky
 */
public class CadastroAnimalV2 extends javax.swing.JFrame {

    /**
     * Creates new form CadastroAnimalV2
     */
    public CadastroAnimalV2() {
        initComponents();
        verificador2 = false;
    }
    
    public CadastroAnimalV2(List<String[]> dadosAnimal, int posAnimal) {
        initComponents();
        
        File file = new File("fotos/", dadosAnimal.get(posAnimal)[0]);
        TesteResizeFoto tamanho = new TesteResizeFoto();
        labelFoto.setIcon(tamanho.ResizeImage(file.getAbsolutePath(), labelFoto));
        
        String name = file.getName(); 
        this.setNomeFoto(name);
        this.setNovaFoto(name);  
        this.campoNome.setText(dadosAnimal.get(posAnimal)[1]);
        this.campoTipo.setText(dadosAnimal.get(posAnimal)[2]);
        this.campoCor.setText(dadosAnimal.get(posAnimal)[3]);
        this.campoRaca.setSelectedItem(dadosAnimal.get(posAnimal)[4]);
        this.campoSexo.setSelectedItem(dadosAnimal.get(posAnimal)[5]);
        this.campoPorte.setSelectedItem(dadosAnimal.get(posAnimal)[6]);
        this.campoIdade.setText(dadosAnimal.get(posAnimal)[7]);
        this.campoCastracao.setSelectedItem(dadosAnimal.get(posAnimal)[8]);
        this.campoV10.setText(dadosAnimal.get(posAnimal)[9]);
        this.campoAntirrabica.setText(dadosAnimal.get(posAnimal)[10]);
        this.campoVermifugacao.setText(dadosAnimal.get(posAnimal)[11]);
        this.campoUltimaLocalizacao.setText(dadosAnimal.get(posAnimal)[12]);
        this.campoObservacao.setText(dadosAnimal.get(posAnimal)[13]);
                        
        this.posAnimal = posAnimal;        
        verificador2 = true;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        campoObservacao = new javax.swing.JTextField();
        campoUltimaLocalizacao = new javax.swing.JTextField();
        campoVermifugacao = new javax.swing.JFormattedTextField();
        campoV10 = new javax.swing.JFormattedTextField();
        campoAntirrabica = new javax.swing.JFormattedTextField();
        campoCastracao = new javax.swing.JComboBox<>();
        campoIdade = new javax.swing.JTextField();
        campoPorte = new javax.swing.JComboBox<>();
        campoSexo = new javax.swing.JComboBox<>();
        campoRaca = new javax.swing.JComboBox<>();
        campoCor = new javax.swing.JTextField();
        campoTipo = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        botaoFoto = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        labelFoto = new javax.swing.JLabel();
        bgFoto = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setMinimumSize(new java.awt.Dimension(300, 533));
        setResizable(false);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(318, 540));

        jPanel1.setMaximumSize(new java.awt.Dimension(290, 2147483647));
        jPanel1.setMinimumSize(new java.awt.Dimension(290, 808));
        jPanel1.setPreferredSize(new java.awt.Dimension(290, 808));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoObservacao.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoObservacao.setForeground(new java.awt.Color(102, 102, 102));
        campoObservacao.setToolTipText("Informações adicionais");
        campoObservacao.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        jPanel1.add(campoObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 700, 220, 23));

        campoUltimaLocalizacao.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoUltimaLocalizacao.setForeground(new java.awt.Color(102, 102, 102));
        campoUltimaLocalizacao.setToolTipText("Última localização");
        campoUltimaLocalizacao.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        campoUltimaLocalizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUltimaLocalizacaoActionPerformed(evt);
            }
        });
        jPanel1.add(campoUltimaLocalizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 660, 220, 23));

        campoVermifugacao.setForeground(new java.awt.Color(102, 102, 102));
        try {
            campoVermifugacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoVermifugacao.setToolTipText("Data Vermifugação");
        campoVermifugacao.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jPanel1.add(campoVermifugacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 220, 23));

        campoV10.setForeground(new java.awt.Color(102, 102, 102));
        try {
            campoV10.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoV10.setToolTipText("Última vacina V8 ou V10");
        campoV10.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jPanel1.add(campoV10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 220, 23));

        campoAntirrabica.setForeground(new java.awt.Color(102, 102, 102));
        try {
            campoAntirrabica.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoAntirrabica.setToolTipText("Última vacina antirrábica");
        campoAntirrabica.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoAntirrabica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAntirrabicaActionPerformed(evt);
            }
        });
        jPanel1.add(campoAntirrabica, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 220, 23));

        campoCastracao.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoCastracao.setForeground(new java.awt.Color(102, 102, 102));
        campoCastracao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "É castrado?", "Sim", "Não", "Não se aplica" }));
        campoCastracao.setSelectedIndex(1);
        campoCastracao.setBorder(null);
        campoCastracao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        campoCastracao.setFocusable(false);
        campoCastracao.setRequestFocusEnabled(false);
        jPanel1.add(campoCastracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 220, 30));

        campoIdade.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoIdade.setForeground(new java.awt.Color(102, 102, 102));
        campoIdade.setToolTipText("Idade");
        campoIdade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        campoIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdadeActionPerformed(evt);
            }
        });
        jPanel1.add(campoIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 220, 23));

        campoPorte.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoPorte.setForeground(new java.awt.Color(102, 102, 102));
        campoPorte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Selecione o porte", "Micro Toy", "Pequeno", "Médio", "Grande", "Extra Grande" }));
        campoPorte.setSelectedIndex(1);
        campoPorte.setBorder(null);
        campoPorte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        campoPorte.setFocusable(false);
        campoPorte.setRequestFocusEnabled(false);
        jPanel1.add(campoPorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 220, 30));

        campoSexo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoSexo.setForeground(new java.awt.Color(102, 102, 102));
        campoSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Selecione o sexo", "Macho", "Fêmea" }));
        campoSexo.setSelectedIndex(1);
        campoSexo.setBorder(null);
        campoSexo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        campoSexo.setFocusable(false);
        campoSexo.setRequestFocusEnabled(false);
        jPanel1.add(campoSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 220, 30));

        campoRaca.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoRaca.setForeground(new java.awt.Color(102, 102, 102));
        campoRaca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Selecione a raça", "Akita", "Basset Hound", "Beagle", "Boxer", "Buldogue", "Bull Terrier", "Chihuahua", "Chow Chow", "Cocker", "Collie", "Dachshund", "Dálmata", "Doberman", "Dogo Argentino", "Fila Brasileiro", "Fox Terrier", "Golden Retriever", "Husky Siberiano", "Labrador", "Lhasa Apso", "Lulu da Pomerânia", "Maltês", "Pastor Alemão", "Pinscher", "Poodle", "Pug", "Rottweiler", "Sem Raça Definida (SRD)", "ShihTzu", "Yorkshire Terrier", "Outra Raça" }));
        campoRaca.setSelectedIndex(1);
        campoRaca.setBorder(null);
        campoRaca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        campoRaca.setFocusable(false);
        campoRaca.setRequestFocusEnabled(false);
        campoRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRacaActionPerformed(evt);
            }
        });
        jPanel1.add(campoRaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 343, 220, 30));

        campoCor.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoCor.setForeground(new java.awt.Color(102, 102, 102));
        campoCor.setToolTipText("Cor");
        campoCor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        jPanel1.add(campoCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 220, 23));

        campoTipo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoTipo.setForeground(new java.awt.Color(102, 102, 102));
        campoTipo.setToolTipText("Tipo");
        campoTipo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        jPanel1.add(campoTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 220, 23));

        campoNome.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoNome.setForeground(new java.awt.Color(102, 102, 102));
        campoNome.setToolTipText("Nome");
        campoNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        jPanel1.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 220, 23));

        botaoFoto.setBackground(new java.awt.Color(242, 242, 242));
        botaoFoto.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botaoFoto.setForeground(new java.awt.Color(102, 102, 102));
        botaoFoto.setText("Adicionar foto");
        botaoFoto.setBorder(null);
        botaoFoto.setBorderPainted(false);
        botaoFoto.setContentAreaFilled(false);
        botaoFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoFoto.setFocusPainted(false);
        botaoFoto.setFocusable(false);
        botaoFoto.setRequestFocusEnabled(false);
        botaoFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFotoActionPerformed(evt);
            }
        });
        jPanel1.add(botaoFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 280, 20));

        botaoSalvar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        botaoSalvar.setForeground(new java.awt.Color(255, 255, 255));
        botaoSalvar.setText("Salvar");
        botaoSalvar.setBorder(null);
        botaoSalvar.setBorderPainted(false);
        botaoSalvar.setContentAreaFilled(false);
        botaoSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(botaoSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 751, 260, 30));

        botaoVoltar.setFont(new java.awt.Font("Comic Sans MS", 1, 40)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(102, 102, 102));
        botaoVoltar.setText("<");
        botaoVoltar.setBorder(null);
        botaoVoltar.setContentAreaFilled(false);
        botaoVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoVoltar.setFocusPainted(false);
        botaoVoltar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(botaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        labelFoto.setBackground(new java.awt.Color(102, 102, 102));
        labelFoto.setToolTipText("Foto");
        labelFoto.setOpaque(true);
        labelFoto.setPreferredSize(new java.awt.Dimension(78, 78));
        jPanel1.add(labelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 61, -1, -1));

        bgFoto.setBackground(new java.awt.Color(255, 255, 255));
        bgFoto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 4, 1, 4, new java.awt.Color(255, 186, 120)));
        bgFoto.setOpaque(true);
        bgFoto.setPreferredSize(new java.awt.Dimension(86, 80));
        jPanel1.add(bgFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 60, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testes/animal1.png"))); // NOI18N
        bg.setToolTipText("");
        bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg.setMaximumSize(new java.awt.Dimension(283, 808));
        bg.setPreferredSize(new java.awt.Dimension(285, 808));
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRacaActionPerformed

    
    
    
    private String checaJText2(JTextField jtext){
        if(jtext.getText().length() < 2 || jtext.getText() == null){
            jtext.setText(" ");
        }
        return jtext.getText();
    }
    
    private String checaJText(JTextField jtext){
        if(jtext.getText() == null){
            jtext.setText(" ");
        }
        return jtext.getText();
    }
    
    private Object checaJCombo(JComboBox<String> jcombo){
        if(jcombo.getSelectedIndex() == 1){
            jcombo.setSelectedIndex(0);
        }
        return jcombo.getSelectedItem();
    }
    
    private String checaJFormated(JFormattedTextField jformated){
        if(jformated.getText() == null){
            jformated.setText(" ");
        }
        return jformated.getText();
    }
    
    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        boolean verificador;
        if (campoNome.getText().trim().equals("") ){
            JOptionPane.showMessageDialog(null, "Nome não pode ficar vazio");
        }
        else{

            try {
                Animal cadastro = new Animal();
                if(verificador2 == false){
                    verificador=cadastro.cadastrarAnimal(this.getNomeFoto(),
                            this.campoNome.getText(), checaJText(this.campoTipo),
                            checaJText(this.campoCor), (String)checaJCombo(this.campoRaca),
                            (String)checaJCombo(this.campoSexo), (String)checaJCombo(this.campoPorte),
                            this.campoIdade.getText(), (String)checaJCombo(this.campoCastracao),
                            checaJFormated(this.campoAntirrabica),checaJFormated(this.campoV10),
                            checaJFormated(this.campoVermifugacao), checaJText2(this.campoUltimaLocalizacao),
                            checaJText2(this.campoObservacao));
                }
                else{
                    verificador=cadastro.atualizarAnimal(posAnimal, this.getNomeFoto(),
                            this.campoNome.getText(), checaJText(this.campoTipo),
                            checaJText(this.campoCor), (String)checaJCombo(this.campoRaca),
                            (String)checaJCombo(this.campoSexo), (String)checaJCombo(this.campoPorte),
                            this.campoIdade.getText(), (String)checaJCombo(this.campoCastracao),
                            checaJFormated(this.campoAntirrabica),checaJFormated(this.campoV10),
                            checaJFormated(this.campoVermifugacao), checaJText2(this.campoUltimaLocalizacao),
                            checaJText2(this.campoObservacao));      
                }
                
                if(verificador){
                    this.dispose();
                    InicialV2 inicial = new InicialV2();
                    inicial.setVisible(true);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void setNovaFoto(String novaFoto){
        this.novaFoto = novaFoto;
    }
    
    private String getNovaFoto(){
        return this.novaFoto;
    }
    
    private void setNomeFoto(String nomeFoto){
        this.nomeFoto = nomeFoto;
    }
    
    private String getNomeFoto(){
        return this.nomeFoto;
    }
    
    private void botaoFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFotoActionPerformed
        
        JFileChooser foto = new JFileChooser();
        FileNameExtensionFilter tipoFoto = new FileNameExtensionFilter(".jpg, .jpeg, .png", "jpg", "jpeg", "png");
        foto.setFileFilter(tipoFoto);
        int selecao = foto.showOpenDialog(null);
        
        String name = "";
        File f = null;
        
        if(selecao == JFileChooser.APPROVE_OPTION) {
            
            f = foto.getSelectedFile();
            String path = f.getAbsolutePath();
            
            //redimensionar imagem pra caber no label
            TesteResizeFoto tamanho = new TesteResizeFoto();
            labelFoto.setIcon(tamanho.ResizeImage(path, labelFoto));
            //labelFoto.setIcon(new ImageIcon(f.toString()));
           
            name = f.getName();
        }
        
        //salvar foto na pasta
        PersistenciaArquivo persistencia = new PersistenciaArquivo();
        try {

            persistencia.salvarFoto(f, name);
            this.setNomeFoto(name);

            if(this.getNovaFoto() != null){
                //System.out.println("a");
                if(!this.getNomeFoto().equals(this.getNovaFoto())){
                    //System.out.println("b");
                    Path p = Paths.get("fotos\\" + this.getNovaFoto());
                 /*   try {
                        System.out.println("c");
                        Files.delete(p);
                    } catch (IOException ex) {
                        Logger.getLogger(CadastroAnimalV2.class.getName()).log(Level.SEVERE, null, ex);
                    }*/
                }

            }
            else{
                this.setNovaFoto("");
            }

            } catch (Exception ex) {

            }      
    }//GEN-LAST:event_botaoFotoActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.dispose();
        InicialV2 inicial;
        try {
            inicial = new InicialV2();
            inicial.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(CadastroAnimalV2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void campoAntirrabicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAntirrabicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAntirrabicaActionPerformed

    private void campoIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIdadeActionPerformed

    private void campoUltimaLocalizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUltimaLocalizacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUltimaLocalizacaoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroAnimalV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAnimalV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAnimalV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAnimalV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAnimalV2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bgFoto;
    private javax.swing.JButton botaoFoto;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JFormattedTextField campoAntirrabica;
    private javax.swing.JComboBox<String> campoCastracao;
    private javax.swing.JTextField campoCor;
    private javax.swing.JTextField campoIdade;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoObservacao;
    private javax.swing.JComboBox<String> campoPorte;
    private javax.swing.JComboBox<String> campoRaca;
    private javax.swing.JComboBox<String> campoSexo;
    private javax.swing.JTextField campoTipo;
    private javax.swing.JTextField campoUltimaLocalizacao;
    private javax.swing.JFormattedTextField campoV10;
    private javax.swing.JFormattedTextField campoVermifugacao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFoto;
    // End of variables declaration//GEN-END:variables

    private String nomeFoto = "";
    private String novaFoto = null;
    private boolean verificador2 = false;
    private int posAnimal;
}
