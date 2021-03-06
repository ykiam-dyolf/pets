/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets.telasMob;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import static java.awt.Frame.HAND_CURSOR;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

/**
 *
 * @author B. Dalzini/Maiky
 */
public class Rede extends javax.swing.JFrame {

    /**
     * Creates new form InicialV2
     * @throws java.io.IOException
     */
    public Rede(List<String[]> dadosAnimal) throws IOException {
        initComponents();
        
        this.textoNenhum.setVisible(true);
        
        
        this.dadosAnimal = dadosAnimal;
        
        panelAviso.setVisible(false);
        //panelAviso.setEnabled(false);
        
        
        
        panelEnviar.setVisible(false);
        panelEnviar.setEnabled(false);
        
        
        if(this.panelAviso.isVisible()){
            this.textoNenhum.setVisible(false);
        }
        
        
        textAreaInicial = this.entraTexto.getText();
        
        //pega a posicao x do label da foto do animal para usar como referência para as que forem criadas
        this.setPosX(jLabel2.getX());
        
       
        if (dadosAnimal.size() > 1){    

            //nessa tela principal, o primeiro icone vem selecionado
            //então aumenta o tamanho do primeiro jlabel, pra marcar esse destaque
            jLabel2.setPreferredSize(new Dimension(43, 43));
            jLabel2.setSize(43,43);
            //poe borda laranja, também pra mostrar o destaque
            jLabel2.setBorder(borda());
            //salva que a seleção está nesse item 1 da lista (o 0 sendo os nomes das colunas)
            this.setSelected(1);
            //salva que a seleção está nesse jLabel2
            this.setAtualClicked(jLabel2);
            //configura o nome do jlabel como o nome da imagem desse animal
            jLabel2.setName(dadosAnimal.get(1)[0]);
            //carrega a imagem
            loadImage(dadosAnimal.get(1)[0], jLabel2);

            //chama a criação dos ícones dos outros animais cadastrados
            criaLabelsIcons();



        }
        else{

        }
        
        
    }

    private Rede() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        textoNenhum = new javax.swing.JLabel();
        panelEnviar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botaoCancelar = new javax.swing.JButton();
        entraTexto = new javax.swing.JTextArea();
        botaoSelecionar = new javax.swing.JButton();
        botaoPontos = new javax.swing.JButton();
        botaoMenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        panelAviso = new javax.swing.JPanel();
        labelUltimaLocalizacao = new javax.swing.JLabel();
        campoUltimaLocalizacao = new javax.swing.JLabel();
        labelFoto = new javax.swing.JLabel();
        areaAviso = new javax.swing.JTextArea();
        botaoAviso = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setMinimumSize(new java.awt.Dimension(301, 534));
        setResizable(false);

        jPanel2.setMinimumSize(new java.awt.Dimension(301, 534));
        jPanel2.setPreferredSize(new java.awt.Dimension(301, 534));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoNenhum.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textoNenhum.setForeground(new java.awt.Color(51, 51, 51));
        textoNenhum.setText("Nenhum ocorrência registrada ainda");
        jPanel2.add(textoNenhum, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        panelEnviar.setBackground(new java.awt.Color(255, 255, 255));
        panelEnviar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Qual animal está desaparecido?");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setOpaque(true);
        panelEnviar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 280, 40));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(330, 70));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(35, 35));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        jScrollPane2.setViewportView(jPanel5);

        panelEnviar.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 280, -1));

        botaoCancelar.setBackground(new java.awt.Color(255, 255, 255));
        botaoCancelar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botaoCancelar.setForeground(new java.awt.Color(255, 153, 0));
        botaoCancelar.setText("Cancelar");
        botaoCancelar.setBorder(null);
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        panelEnviar.add(botaoCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 70, 30));

        entraTexto.setBackground(new java.awt.Color(255, 255, 255));
        entraTexto.setColumns(20);
        entraTexto.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        entraTexto.setForeground(new java.awt.Color(51, 51, 51));
        entraTexto.setLineWrap(true);
        entraTexto.setRows(5);
        entraTexto.setText("Ei, perdi meu animalzinho.\nO nome dele é <nome>. E se parece com essa foto aqui do lado.");
        entraTexto.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(204, 204, 204)));
        entraTexto.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                entraTextoInputMethodTextChanged(evt);
            }
        });
        entraTexto.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                entraTextoPropertyChange(evt);
            }
        });
        panelEnviar.add(entraTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 240, 140));

        botaoSelecionar.setBackground(new java.awt.Color(255, 153, 0));
        botaoSelecionar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        botaoSelecionar.setForeground(new java.awt.Color(255, 255, 255));
        botaoSelecionar.setText("Publicar");
        botaoSelecionar.setBorder(null);
        botaoSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSelecionarActionPerformed(evt);
            }
        });
        panelEnviar.add(botaoSelecionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 70, 30));

        jPanel2.add(panelEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 530));

        botaoPontos.setBackground(new java.awt.Color(255, 255, 255));
        botaoPontos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testes/sairicon2.png"))); // NOI18N
        botaoPontos.setToolTipText("Fechar aplicativo");
        botaoPontos.setBorder(null);
        botaoPontos.setBorderPainted(false);
        botaoPontos.setContentAreaFilled(false);
        botaoPontos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPontos.setFocusable(false);
        botaoPontos.setPreferredSize(new java.awt.Dimension(35, 35));
        botaoPontos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPontosActionPerformed(evt);
            }
        });
        jPanel2.add(botaoPontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 40, 40));

        botaoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testes/menuicon3.png"))); // NOI18N
        botaoMenu.setToolTipText("Menu");
        botaoMenu.setBorder(null);
        botaoMenu.setContentAreaFilled(false);
        botaoMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoMenu.setFocusable(false);
        botaoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenuActionPerformed(evt);
            }
        });
        jPanel2.add(botaoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, 40));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REDE");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(255, 255, 255)));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setPreferredSize(new java.awt.Dimension(140, 37));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 60, 140, 37));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PETS");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setPreferredSize(new java.awt.Dimension(150, 37));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 60, 150, 37));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(301, 350));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(300, 235));
        jPanel1.setPreferredSize(new java.awt.Dimension(280, 350));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAviso.setBackground(new java.awt.Color(255, 255, 255));
        panelAviso.setToolTipText("");
        panelAviso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelUltimaLocalizacao.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        labelUltimaLocalizacao.setForeground(new java.awt.Color(102, 102, 102));
        labelUltimaLocalizacao.setText("Última localização: ");
        panelAviso.add(labelUltimaLocalizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        campoUltimaLocalizacao.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        campoUltimaLocalizacao.setForeground(new java.awt.Color(102, 102, 102));
        campoUltimaLocalizacao.setText("?");
        panelAviso.add(campoUltimaLocalizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 260, -1));

        labelFoto.setBackground(new java.awt.Color(102, 102, 102));
        labelFoto.setToolTipText("Foto");
        labelFoto.setOpaque(true);
        labelFoto.setPreferredSize(new java.awt.Dimension(78, 78));
        panelAviso.add(labelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        areaAviso.setBackground(new java.awt.Color(255, 255, 255));
        areaAviso.setColumns(20);
        areaAviso.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        areaAviso.setForeground(new java.awt.Color(51, 51, 51));
        areaAviso.setRows(5);
        panelAviso.add(areaAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 170, 80));

        jPanel1.add(panelAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 150));

        jScrollPane1.setViewportView(jPanel1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 115, 300, -1));

        botaoAviso.setBackground(new java.awt.Color(255, 153, 0));
        botaoAviso.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        botaoAviso.setForeground(new java.awt.Color(255, 255, 255));
        botaoAviso.setText("Publicar Sumiço");
        botaoAviso.setBorder(null);
        botaoAviso.setFocusable(false);
        botaoAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAvisoActionPerformed(evt);
            }
        });
        jPanel2.add(botaoAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 475, 250, 45));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testes/principal.png"))); // NOI18N
        jPanel2.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    //carrega a imagem
    private void loadImage(String fileName, JLabel label){
        File file = new File("fotos/", fileName);
        //chama a função pra redimensionar a imagem selecionada pra ela ficar do tamanho do jlabel
        TesteResizeFoto tamanho = new TesteResizeFoto();
        label.setIcon(tamanho.ResizeImage(file.getAbsolutePath(), label));
    }
    
    
    private int getPosX(){
        return this.posX;
    }
    
    private void setPosX(int posX){
        this.posX += posX;
    }
    
    private int getSelected(){
        return this.selected;
    }
    
    private void setSelected(int animal){
        this.selected = animal;
    }
   
    private JLabel getAtualClicked(){
        
        return this.atualClicked;
    }
    
    private void setAtualClicked(JLabel label){
        
        this.atualClicked = label;
        
    }
    
    //define o evento de "ao clicar" para o jlabel criado
    private void novoLabelClicked(java.awt.event.MouseEvent evt){
        JLabel novoT = new JLabel();
        novoT = (JLabel) evt.getSource();
        int j = 0;
        
        //se for clicado, o jlabel que estava selecionado antes diminui de tamanho
        resizeLabelSelecionado(this.atualClicked, 35, 35);
        //perde a borda 
        this.atualClicked.setBorder(null);
        //e redimensiona a imagem pra esse tamanho menor
        loadImage(dadosAnimal.get(this.getSelected())[0], this.atualClicked);
        
        
        //procura entre os dados dos animais qual posição que tem a imagem com o mesmo nome do jlabel clicado
        for(j = 0; dadosAnimal.get(j)[0] != novoT.getName(); j++){

        }
        
        //quando acha a posição, marca ela 
        if(dadosAnimal.get(j)[0] == novoT.getName()){
                
            this.setSelected(j);
        }
        
        //marca o jlabel clicado como o selecionado
        this.setAtualClicked(novoT);
        
        //aumenta o tamanho dele
        resizeLabelSelecionado(novoT, 43, 43);
        //poe borda
        novoT.setBorder(borda());
        //redimensiona imagem
        loadImage(dadosAnimal.get(j)[0], novoT);

        
        
    }
    
    //cria novos jlabels se existir mais de um animal
    private void criaLabelsIcons(){
        
        if(dadosAnimal.size() > 2){
            
            
            for(int i = 2; dadosAnimal.size() > i; i++){
                
                //vai colocar o novo jlabel na posição de acordo com a posição do anterior
                this.setPosX(52);
                
                JLabel novoLabel = new javax.swing.JLabel();
                
                novoLabel.setOpaque(true);
                novoLabel.setPreferredSize(new java.awt.Dimension(35, 35));
                novoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        
                        novoLabelClicked(evt);
                    }
                });
                jPanel5.add(novoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(this.getPosX(), 5, -1, -1));

                
                novoLabel.setBounds(this.getPosX(), 5, 35, 35);
                novoLabel.setSize(35,35);
                //diferencia cada jlabel criado ao colocar o nome da foto do animal desse ícone como o nome do jlabel
                novoLabel.setName(dadosAnimal.get(i)[0]);
                
                //mostra o cursor de mãozinha pra mostrar que dá pra clicar ali quando o usuário passa o mouse em cima do ícone
                Cursor c = new Cursor(HAND_CURSOR);
                novoLabel.setCursor(c);
                
                //carrega a imagem do animal pro jlabel/ícone dele
                loadImage(dadosAnimal.get(i)[0], novoLabel);

            }
        }
    }
    
    //redimensiona o jlabel pra um tamanho x,y
    private void resizeLabelSelecionado(JLabel label, int x, int y){
        label.setPreferredSize(new Dimension(x, y));
        label.setSize(x, y);
    }
    
    //poe a borda laranja de tamanho 2
    private Border borda(){
        MatteBorder novaB = new MatteBorder(2,2,2,2, new Color(255,186,120));
        return novaB;
        
        
    }
    
    
    //abre o menu
    private void botaoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenuActionPerformed
        Menu menu;
        try {
            menu = new Menu();
            menu.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(InicialV2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_botaoMenuActionPerformed

    //sair do aplicativo
    private void botaoPontosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPontosActionPerformed
        
        int nome = JOptionPane.showConfirmDialog(null, "Deseja sair do aplicativo?", "", JOptionPane.YES_NO_OPTION);
        if (nome==0){
            System.exit(0);
        }
        
    }//GEN-LAST:event_botaoPontosActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
    }//GEN-LAST:event_jLabel3MouseClicked

    //volta pra tela principal
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        InicialV2 principal = null;
        try {
            principal = new InicialV2();
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void botaoAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAvisoActionPerformed
        
        if(dadosAnimal.size() > 1){
        
            panelEnviar.setVisible(true);
            panelEnviar.setEnabled(true);
            
            panelEnviar.setBackground(new Color(255,255,255,170));
            
            botaoAviso.setEnabled(false);
            this.textoNenhum.setVisible(false);
            
            entraTexto.setText(textAreaInicial);
        }
        
        
    }//GEN-LAST:event_botaoAvisoActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if(dadosAnimal.size() > 1){
            //diminui o tamanho do antigo jlabel clicado
            resizeLabelSelecionado(this.atualClicked, 35, 35);
            //redimensiona a imagem dele pro tamanho menor
            loadImage(dadosAnimal.get(this.getSelected())[0], this.atualClicked);
            //tira a borda
            this.atualClicked.setBorder(null);

            //marca esse jlabel como o selecionado
            this.setAtualClicked(jLabel2);
            //marca esse item
            this.setSelected(1);
            //aumenta o tamanho desse jlabel
            resizeLabelSelecionado(jLabel2, 43, 43);
            //poe a borda nesse jlabel
            jLabel2.setBorder(borda());
            //redimensiona a imagem
            loadImage(dadosAnimal.get(1)[0], jLabel2);
            
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited

    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased

    }//GEN-LAST:event_jLabel2MouseReleased

    private void infoAviso(){
        panelAviso.setVisible(true);
        botaoAviso.setEnabled(true);
        
       
        loadImage(dadosAnimal.get(this.getSelected())[0], labelFoto);

        this.campoUltimaLocalizacao.setText(dadosAnimal.get(this.getSelected())[12]);
        
        String novoTexto = this.entraTexto.getText();
        
        if(!textAreaInicial.equals(novoTexto)){
           this.areaAviso.setText(this.entraTexto.getText()); 
        }
        else{
            this.areaAviso.setText("Ei, perdi meu animalzinho.\r\n" + "O nome dele é " + dadosAnimal.get(this.getSelected())[1] + 
                ". E se parece com essa foto aqui do lado.");
        }
        this.areaAviso.setLineWrap(true);
        this.areaAviso.setEditable(false);

    }
    
    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        if(this.panelAviso.isVisible()){
            this.textoNenhum.setVisible(false);
        }
        else{
            this.textoNenhum.setVisible(true);
        }
        
        panelEnviar.setVisible(false);
        panelEnviar.setEnabled(false);
        botaoAviso.setEnabled(true);
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void entraTextoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_entraTextoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_entraTextoPropertyChange

    private void entraTextoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_entraTextoInputMethodTextChanged

    }//GEN-LAST:event_entraTextoInputMethodTextChanged

    private void botaoSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSelecionarActionPerformed
        infoAviso();
        
        
        
        panelEnviar.setVisible(false);
        panelEnviar.setEnabled(false);
        
        
        this.textoNenhum.setVisible(false);
    }//GEN-LAST:event_botaoSelecionarActionPerformed

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
            java.util.logging.Logger.getLogger(Rede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rede().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaAviso;
    private javax.swing.JLabel bg;
    private javax.swing.JButton botaoAviso;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoMenu;
    private javax.swing.JButton botaoPontos;
    private javax.swing.JButton botaoSelecionar;
    private javax.swing.JLabel campoUltimaLocalizacao;
    private javax.swing.JTextArea entraTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel labelUltimaLocalizacao;
    private javax.swing.JPanel panelAviso;
    private javax.swing.JPanel panelEnviar;
    private javax.swing.JLabel textoNenhum;
    // End of variables declaration//GEN-END:variables

    private List<String[]> dadosAnimal = new ArrayList();
    private int posX = 0;
    private JLabel atualClicked = null;
    
    
    private int selected = 0;
    
    private String textAreaInicial = "";
    
}
