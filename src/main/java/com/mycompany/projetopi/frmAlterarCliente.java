<<<<<<< HEAD
=======

>>>>>>> f8eb109b5924e32a42e8b081a4efa1336c31d99b
package com.mycompany.projetopi;

import br.com.infox.DAO.ClienteDAO;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import br.com.infox.DAO.Conexao;
import br.com.infox.DAO.ProdutoDAO;
import com.mycompany.projetopi.model.Cliente;
import com.mycompany.projetopi.model.Produto;
import java.util.Date;

<<<<<<< HEAD
=======

>>>>>>> f8eb109b5924e32a42e8b081a4efa1336c31d99b
public class frmAlterarCliente extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet st = null;

<<<<<<< HEAD
=======
    
>>>>>>> f8eb109b5924e32a42e8b081a4efa1336c31d99b
    public frmAlterarCliente(int id) throws SQLException, ClassNotFoundException {
        initComponents();
        conexao = Conexao.conector();
        System.out.println(conexao);
        lblId.setVisible(false);
<<<<<<< HEAD
        lblId.setText("" + id);

=======
        lblId.setText(""+id);
        
>>>>>>> f8eb109b5924e32a42e8b081a4efa1336c31d99b
        Cliente cliente = ClienteDAO.consultarSelecionado(id);
        txtCPF.setText(cliente.getCpf());
        txtNome.setText(cliente.getCpf());
        txtTelefone.setText(cliente.getCpf());
        txtEmail.setText(cliente.getCpf());
        //txtDataNascimento.setText(t);
        String sexo = cliente.getSexo();
<<<<<<< HEAD
        if (sexo.equals("M")) {
=======
        if (sexo.equals("M") ) {
>>>>>>> f8eb109b5924e32a42e8b081a4efa1336c31d99b
            rbMasculino.isSelected();
        } else if (sexo.equals("F")) {
            rbFeminino.isSelected();
        }
        cmbEstadoCivil.setSelectedItem(cliente.getEstadocivil());
        txtPais.setText(cliente.getNomePais());
        txtCidade.setText(cliente.getNomeCidade());
        txtCep.setText(cliente.getCep());
        txtLogradouro.setText(cliente.getLogradouro());
        txtNumero.setText(cliente.getNumero());
        txtComplemento.setText(cliente.getComplemento());
    }
<<<<<<< HEAD

=======
    
>>>>>>> f8eb109b5924e32a42e8b081a4efa1336c31d99b
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        txtDataNascimento1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCep = new javax.swing.JFormattedTextField();
        cmbEstadoCivil = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        lblId = new javax.swing.JLabel();
<<<<<<< HEAD
        lblLimpar = new javax.swing.JButton();
=======
>>>>>>> f8eb109b5924e32a42e8b081a4efa1336c31d99b

        try {
            txtDataNascimento1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNascimento1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDataNascimento1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataNascimento1FocusLost(evt);
            }
        });
        txtDataNascimento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascimento1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Nome*");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 410, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Telefone*");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Data Nascimento");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Logradouro");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, 30));

        btnAlterar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 160, 60));

        btnSair.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 160, 60));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Email*");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, 30));

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 350, 30));

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusLost(evt);
            }
        });
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 190, 30));

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCepFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCepFocusLost(evt);
            }
        });
        txtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepActionPerformed(evt);
            }
        });
        jPanel1.add(txtCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 150, 30));

        cmbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viúvo(a)", " " }));
        jPanel1.add(cmbEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 195, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Estado civil");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, 30));

        txtLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogradouroActionPerformed(evt);
            }
        });
        jPanel1.add(txtLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 550, 30));

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCPFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCPFFocusLost(evt);
            }
        });
        jPanel1.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 120, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("CPF*");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 550, 10));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Numero");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 30));

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 100, 30));

        txtComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplementoActionPerformed(evt);
            }
        });
        jPanel1.add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 240, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Complemento");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, 30));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("CEP");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, 30));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Cidade");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, 30));

        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });
        jPanel1.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 290, 30));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("País");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, 30));

        txtPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisActionPerformed(evt);
            }
        });
        jPanel1.add(txtPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 200, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Sexo*");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 30));

        rbMasculino.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbMasculino.setText("Masculino");
        rbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoActionPerformed(evt);
            }
        });
        jPanel1.add(rbMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 133, -1, 30));

        rbFeminino.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbFeminino.setText("Feminino");
        jPanel1.add(rbFeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, 40));

        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDataNascimentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataNascimentoFocusLost(evt);
            }
        });
        txtDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascimentoActionPerformed(evt);
            }
        });
        jPanel1.add(txtDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 120, 30));

        lblId.setText("jLabel14");
<<<<<<< HEAD
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 0, -1));

        lblLimpar.setText("Limpar");
        lblLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblLimparActionPerformed(evt);
            }
        });
        jPanel1.add(lblLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 150, 60));
=======
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, -1, -1));
>>>>>>> f8eb109b5924e32a42e8b081a4efa1336c31d99b

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 570));
        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed


    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeKeyTyped

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        // TODO add your handling code here:
        txtNome.setBackground(Color.yellow);
    }//GEN-LAST:event_txtNomeFocusGained

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        // TODO add your handling code here:
        txtNome.setBackground(Color.white);
    }//GEN-LAST:event_txtNomeFocusLost

    private void rbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoActionPerformed

    }//GEN-LAST:event_rbMasculinoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:]
        txtEmail.setBackground(Color.yellow);
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        txtEmail.setBackground(Color.white);
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtCPFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPFFocusGained
        // TODO add your handling code here:
        txtCPF.setBackground(Color.yellow);
    }//GEN-LAST:event_txtCPFFocusGained

    private void txtCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPFFocusLost
        // TODO add your handling code here:
        txtCPF.setBackground(Color.white);
    }//GEN-LAST:event_txtCPFFocusLost

    private void txtTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusGained
        // TODO add your handling code here:
        txtTelefone.setBackground(Color.yellow);
    }//GEN-LAST:event_txtTelefoneFocusGained

    private void txtTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusLost
        // TODO add your handling code here:
        txtTelefone.setBackground(Color.white);
    }//GEN-LAST:event_txtTelefoneFocusLost

    private void txtCepFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCepFocusGained
        // TODO add your handling code here:
        txtCep.setBackground(Color.yellow);
    }//GEN-LAST:event_txtCepFocusGained

    private void txtCepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCepFocusLost
        // TODO add your handling code here:
        txtCep.setBackground(Color.white);
    }//GEN-LAST:event_txtCepFocusLost

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
<<<<<<< HEAD

=======
        
>>>>>>> f8eb109b5924e32a42e8b081a4efa1336c31d99b
        String cpf = txtCPF.getText().replace("-", "").replace(".", "");
        String nome = txtNome.getText();
        String telefone = txtTelefone.getText().replace("-", "").replace("(", "").replace(")", "");
        String email = txtEmail.getText();
        System.out.println(txtDataNascimento.getText());
        String dia = txtDataNascimento.getText().substring(0, 2);
        System.out.println(dia);
        String mes = txtDataNascimento.getText().substring(3, 5);
        System.out.println(mes);
        String ano = txtDataNascimento.getText().substring(6, 10);
        System.out.println(ano);
        String dataNascimento = ano + "-" + mes + "-" + dia;
        dataNascimento.getBytes().toString();
        String sexo = null;
        if (rbMasculino.isSelected()) {
            sexo = "M";
        } else if (rbFeminino.isSelected()) {
            sexo = "F";
        }
        String estadocivil = (String) cmbEstadoCivil.getSelectedItem();
        String nomePais = txtPais.getText();
        String nomeCidade = txtCidade.getText();
        String cep = txtCep.getText().replaceAll("-", "");
        String logradouro = txtLogradouro.getText();
        String numero = txtNumero.getText();
        String complemento = txtComplemento.getText();

        Cliente objCliente = new Cliente();
<<<<<<< HEAD

=======
        
>>>>>>> f8eb109b5924e32a42e8b081a4efa1336c31d99b
        objCliente.setCpf(cpf);
        objCliente.setNome(cep);
        objCliente.setTelefone(telefone);
        objCliente.setEmail(email);
        objCliente.setDataNascimento(dataNascimento);
        objCliente.setSexo(sexo);
        objCliente.setEstadocivil(estadocivil);
        objCliente.setNomePais(nomePais);
        objCliente.setNomeCidade(nomeCidade);
        objCliente.setCep(cep);
        objCliente.setLogradouro(logradouro);
        objCliente.setNumero(numero);
<<<<<<< HEAD
        objCliente.setComplemento(complemento);
        int id = Integer.parseInt(lblId.getText());
        boolean retorno = ClienteDAO.alterar(objCliente, id);
=======
        objCliente.setComplemento(complemento);        
        int id = Integer.parseInt(lblId.getText());
        boolean retorno = ClienteDAO.alterar(objCliente,id);
>>>>>>> f8eb109b5924e32a42e8b081a4efa1336c31d99b

        if (retorno) {
            JOptionPane.showMessageDialog(null, "Cliente Cadastrado com sucesso!");
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Falha na Gravação!");
        }

        if ((txtNome.getText().length() > 0)
                && (txtCPF.getText().length() > 0)
                && (txtCep.getText().length() > 0)
                && (txtTelefone.getText().length() > 0)
                && (rbMasculino.getText().length() > 0)
                && (rbFeminino.getText().length() > 0)) {

            // JOptionPane.showMessageDialog(null, "Dados Validados!");
        } else {
            JOptionPane.showMessageDialog(null, "Confira os campos Obrigatorios!");
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepActionPerformed

    private void txtLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLogradouroActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplementoActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void txtPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisActionPerformed

    private void txtDataNascimento1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataNascimento1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascimento1FocusGained

    private void txtDataNascimento1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataNascimento1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascimento1FocusLost

    private void txtDataNascimento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascimento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascimento1ActionPerformed

    private void txtDataNascimentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataNascimentoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascimentoFocusGained

    private void txtDataNascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataNascimentoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascimentoFocusLost

    private void txtDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascimentoActionPerformed
<<<<<<< HEAD

    private void lblLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblLimparActionPerformed
        // TODO add your handling code here:
        txtNome.setText("");
        txtCPF.setText("");
        txtDataNascimento.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
        txtLogradouro.setText("");
        txtComplemento.setText("");
        txtCep.setText("");
        txtNumero.setText("");
        txtCidade.setText("");
        txtPais.setText("");

    }//GEN-LAST:event_lblLimparActionPerformed
=======
>>>>>>> f8eb109b5924e32a42e8b081a4efa1336c31d99b
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> cmbEstadoCivil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblId;
<<<<<<< HEAD
    private javax.swing.JButton lblLimpar;
=======
>>>>>>> f8eb109b5924e32a42e8b081a4efa1336c31d99b
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JFormattedTextField txtDataNascimento1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPais;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
