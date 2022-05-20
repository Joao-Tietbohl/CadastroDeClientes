
package cadastrodeclientes;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class PainelCadastroDeClientes extends javax.swing.JPanel {
    
    private ControleCliente repositorio;
    private PainelListaDeContatos telaLista;
    
    public PainelCadastroDeClientes(ControleCliente repositorio) 
    {       
        this.repositorio = repositorio;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtFone = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        RbMasculino = new javax.swing.JRadioButton();
        RbFeminino = new javax.swing.JRadioButton();
        CbxEstadoCivil = new javax.swing.JComboBox<>();
        btnCadastrar = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        rbComum = new javax.swing.JRadioButton();
        rbVIP = new javax.swing.JRadioButton();

        jLabel1.setText("Cadastro De Clientes");

        jLabel2.setText("Nome:");

        jLabel3.setText("Fone:");

        jLabel4.setText("Idade:");

        jLabel5.setText("Sexo");

        jLabel6.setText("Estado Cívil");

        buttonGroup1.add(RbMasculino);
        RbMasculino.setText("Masculino");

        buttonGroup1.add(RbFeminino);
        RbFeminino.setText("Feminino");

        CbxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Viuvo", "Corno" }));

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnVisualizar.setText("Visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbComum);
        rbComum.setText("Comum");

        buttonGroup2.add(rbVIP);
        rbVIP.setText("VIP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVisualizar)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RbMasculino)
                        .addGap(18, 18, 18)
                        .addComponent(RbFeminino))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(rbComum)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbVIP))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFone)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addGap(151, 151, 151))
                                .addComponent(txtNome)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(RbMasculino)
                    .addComponent(RbFeminino))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbComum)
                    .addComponent(rbVIP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnVisualizar))
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Cliente cliente = ObterCliente();
        if(Validar() == true){
            repositorio.Inserir(cliente);
            System.out.println(cliente);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
            telaLista = new PainelListaDeContatos(repositorio);
            JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
            janela.getContentPane().removeAll();
            janela.add(telaLista, BorderLayout.CENTER);
            janela.pack(); 
    }//GEN-LAST:event_btnVisualizarActionPerformed
    
    private Cliente ObterCliente(){
        String nome = txtNome.getText();
        String fone =  txtFone.getText();
        String idade = txtIdade.getText();
        String sexo = null;
        if(RbMasculino.isSelected())
            sexo = "Masculino";
        
        else if(RbFeminino.isSelected())
            sexo = "Feminino";
        
        String EstadoCivil = CbxEstadoCivil.getSelectedItem().toString();
        
        Cliente cliente;
        
        if(rbComum.isSelected() == true)
            cliente = new ClienteComum(nome, fone, idade, sexo, EstadoCivil);
        else 
            cliente = new ClienteVIP(nome, fone, idade, sexo, EstadoCivil);
        
        return cliente;
    }
    
    public boolean Validar(){
        if(txtNome.getText().length() == 0){
            JOptionPane.showMessageDialog(null,"Preencher o Nome é Obrigatório","Erro de preenchimento",JOptionPane.ERROR_MESSAGE);
            return false;
        }    
        
        if(txtFone.getText().length() == 0 || isNumber(txtFone.getText()) == false){
            JOptionPane.showMessageDialog(null,"Preencher o Telefone É obrigatório e so deve ser preencchido com números","Erro de preenchimento",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(txtIdade.getText().length() == 0 || isNumber(txtIdade.getText()) == false){
            JOptionPane.showMessageDialog(null,"Preencher a Idade É obrigatório e so deve ser preencchido com números","Erro de preenchimento",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(RbFeminino.isSelected() == false && RbMasculino.isSelected() == false){
            JOptionPane.showMessageDialog(null,"Selecione o sexo","Erro de preenchimento",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(CbxEstadoCivil.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null,"Selecione o Estado Cívil","Erro de preenchimento",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public boolean isNumber(String input){
        try {
            Integer.valueOf(input);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbxEstadoCivil;
    private javax.swing.JRadioButton RbFeminino;
    private javax.swing.JRadioButton RbMasculino;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbComum;
    private javax.swing.JRadioButton rbVIP;
    private javax.swing.JTextField txtFone;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
