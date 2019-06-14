/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets.telasMob;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pets.modelo.Clinica;
import pets.modelo.ContaLogada;
import pets.modelo.Contato;
import pets.modelo.Endereco;
import pets.modelo.RedeSocial;
import pets.persistenciaArquivo.PersistenciaArquivo;



/**
 *
 * @author Maiky
 */
public class CadastroClinica extends javax.swing.JFrame {

    /**
     * Creates new form CadastroAnimal
     * @throws java.io.IOException
     */
    public CadastroClinica() throws IOException{
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

        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        botaoMenu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        botaoSalvar = new javax.swing.JButton();
        nome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        nome1 = new javax.swing.JLabel();
        campoRua = new javax.swing.JTextField();
        nome2 = new javax.swing.JLabel();
        campoNumero = new javax.swing.JTextField();
        nome3 = new javax.swing.JLabel();
        nome4 = new javax.swing.JLabel();
        nome5 = new javax.swing.JLabel();
        nome6 = new javax.swing.JLabel();
        campoEstado = new javax.swing.JComboBox<>();
        nome7 = new javax.swing.JLabel();
        nome8 = new javax.swing.JLabel();
        nome9 = new javax.swing.JLabel();
        nome10 = new javax.swing.JLabel();
        nome11 = new javax.swing.JLabel();
        nome12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nome13 = new javax.swing.JLabel();
        campoComplemento = new javax.swing.JTextField();
        campoBairro = new javax.swing.JTextField();
        campoCidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nome14 = new javax.swing.JLabel();
        campoNumTelefone = new javax.swing.JFormattedTextField();
        campoNumCelular = new javax.swing.JFormattedTextField();
        campoWhatsapp = new javax.swing.JFormattedTextField();
        campoEmail = new javax.swing.JTextField();
        campoFacebook = new javax.swing.JTextField();
        campoTwitter = new javax.swing.JTextField();
        campoInstagram = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoCep = new javax.swing.JFormattedTextField();

        jButton1.setText("Adicionar uma foto");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setMinimumSize(new java.awt.Dimension(300, 533));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pets/telasMob/logo2.png"))); // NOI18N

        botaoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pets/telasMob/voltar.png"))); // NOI18N
        botaoMenu.setBorder(null);
        botaoMenu.setContentAreaFilled(false);
        botaoMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoMenu)
                .addGap(69, 69, 69)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoMenu)
                .addContainerGap())
        );

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(242, 167, 30));

        botaoSalvar.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        botaoSalvar.setForeground(new java.awt.Color(255, 255, 255));
        botaoSalvar.setText("Salvar");
        botaoSalvar.setBorderPainted(false);
        botaoSalvar.setContentAreaFilled(false);
        botaoSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(botaoSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        nome.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        nome.setForeground(new java.awt.Color(134, 134, 134));
        nome.setText("Nome:");

        campoNome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        nome1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        nome1.setForeground(new java.awt.Color(134, 134, 134));
        nome1.setText("Rua:");

        campoRua.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nome2.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        nome2.setForeground(new java.awt.Color(134, 134, 134));
        nome2.setText("Nº:");

        campoNumero.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        campoNumero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nome3.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        nome3.setForeground(new java.awt.Color(134, 134, 134));
        nome3.setText("Bairro:");

        nome4.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        nome4.setForeground(new java.awt.Color(134, 134, 134));
        nome4.setText("Cidade:");

        nome5.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        nome5.setForeground(new java.awt.Color(134, 134, 134));
        nome5.setText("Estado:");

        nome6.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        nome6.setForeground(new java.awt.Color(134, 134, 134));
        nome6.setText("CEP:");

        campoEstado.setFont(new java.awt.Font("Gadugi", 1, 10)); // NOI18N
        campoEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RS", "RR", "SC", "SE", "SP", "TO" }));
        campoEstado.setBorder(null);
        campoEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        nome7.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        nome7.setForeground(new java.awt.Color(134, 134, 134));
        nome7.setText("Telefone:");

        nome8.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        nome8.setForeground(new java.awt.Color(134, 134, 134));
        nome8.setText("Celular:");

        nome9.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        nome9.setForeground(new java.awt.Color(134, 134, 134));
        nome9.setText("e-mail:");

        nome10.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        nome10.setForeground(new java.awt.Color(134, 134, 134));
        nome10.setText("Facebook:");

        nome11.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        nome11.setForeground(new java.awt.Color(134, 134, 134));
        nome11.setText("Instagram:");

        nome12.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        nome12.setForeground(new java.awt.Color(134, 134, 134));
        nome12.setText("Twitter:");

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 167, 30));
        jLabel2.setText("Endereço");

        nome13.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        nome13.setForeground(new java.awt.Color(134, 134, 134));
        nome13.setText("Complemento:");

        campoComplemento.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        campoComplemento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        campoBairro.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        campoBairro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        campoCidade.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        campoCidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 167, 30));
        jLabel3.setText("Contato");

        nome14.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        nome14.setForeground(new java.awt.Color(134, 134, 134));
        nome14.setText("Whatsapp:");

        campoNumTelefone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        try {
            campoNumTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoNumTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNumTelefoneActionPerformed(evt);
            }
        });

        campoNumCelular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        try {
            campoNumCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        campoWhatsapp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        try {
            campoWhatsapp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        campoEmail.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        campoEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        campoFacebook.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        campoFacebook.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        campoTwitter.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        campoTwitter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        campoInstagram.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        campoInstagram.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 167, 30));
        jLabel5.setText("Dados da clínica");

        campoCep.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        try {
            campoCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(nome10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoFacebook))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(nome9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoEmail))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(nome12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTwitter))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(nome11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoInstagram))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(nome8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoNumCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(nome14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel3)))
                        .addGap(0, 132, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nome2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoComplemento))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nome3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoBairro))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nome4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCidade))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nome1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoRua))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nome)
                        .addGap(5, 5, 5)
                        .addComponent(campoNome))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nome5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCep))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nome7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNumTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome1)
                    .addComponent(campoRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome2)
                    .addComponent(campoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome3)
                    .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome4)
                    .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome5)
                    .addComponent(nome6)
                    .addComponent(campoCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome7)
                    .addComponent(campoNumTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome8)
                    .addComponent(campoNumCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome10)
                    .addComponent(campoFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome12)
                    .addComponent(campoTwitter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome14)
                    .addComponent(campoWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenuActionPerformed
        this.dispose();
        Inicial inicial = new Inicial();
        inicial.setVisible(true);
    }//GEN-LAST:event_botaoMenuActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        if (campoNome.getText().trim().equals("") ){
            this.dispose();
            Inicial inicial = new Inicial();
            inicial.setVisible(true);
        }
        else{
            try {
                //cria um objeto do tipo Clinica após criar Endereco, Contato e RedeSocial
                Endereco enderecoClinica = new Endereco(this.campoRua.getText(), this.campoNumero.getText(), this.campoBairro.getText(), this.campoCidade.getText(), 
                    (String)this.campoEstado.getSelectedItem(), this.campoCep.getText(), this.campoComplemento.getText());
                Contato contatoClinica = new Contato(this.campoNumTelefone.getText(), this.campoNumCelular.getText(), this.campoEmail.getText());
                RedeSocial redeSocial = new RedeSocial(this.campoFacebook.getText(), this.campoTwitter.getText(), this.campoInstagram.getText(), this.campoWhatsapp.getText());

                Clinica novaClinica = new Clinica(this.campoNome.getText(), enderecoClinica, contatoClinica, redeSocial);

                // vai salvar os dados do formulário do animal na persistencia de arquivo
                PersistenciaArquivo persistencia = new PersistenciaArquivo();
                persistencia.salvarDadosClinica(novaClinica);
                
                this.dispose();
                Inicial inicial = new Inicial();
                inicial.setVisible(true);
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }
            
            
        }            
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoNumTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNumTelefoneActionPerformed
    
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
            java.util.logging.Logger.getLogger(CadastroClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadastroClinica().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(CadastroClinica.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoMenu;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField campoBairro;
    private javax.swing.JFormattedTextField campoCep;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoComplemento;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JComboBox<String> campoEstado;
    private javax.swing.JTextField campoFacebook;
    private javax.swing.JTextField campoInstagram;
    private javax.swing.JTextField campoNome;
    private javax.swing.JFormattedTextField campoNumCelular;
    private javax.swing.JFormattedTextField campoNumTelefone;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JTextField campoRua;
    private javax.swing.JTextField campoTwitter;
    private javax.swing.JFormattedTextField campoWhatsapp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel nome1;
    private javax.swing.JLabel nome10;
    private javax.swing.JLabel nome11;
    private javax.swing.JLabel nome12;
    private javax.swing.JLabel nome13;
    private javax.swing.JLabel nome14;
    private javax.swing.JLabel nome2;
    private javax.swing.JLabel nome3;
    private javax.swing.JLabel nome4;
    private javax.swing.JLabel nome5;
    private javax.swing.JLabel nome6;
    private javax.swing.JLabel nome7;
    private javax.swing.JLabel nome8;
    private javax.swing.JLabel nome9;
    // End of variables declaration//GEN-END:variables
}
