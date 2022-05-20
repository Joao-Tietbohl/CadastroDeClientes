package cadastrodeclientes;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class PainelListaDeContatos extends javax.swing.JPanel {
    
    public ControleCliente controle;
    public PainelVisalizacaoDeCliente telaCLiente;
    public PainelCadastroDeClientes telaAnterior;
    
    public PainelListaDeContatos(ControleCliente controle) {
        initComponents();
        this.controle = controle;
        AtualizarCbx();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cbx_listClientes = new javax.swing.JComboBox<>();
        btn_Imprimir = new javax.swing.JToggleButton();
        btn_Remover = new javax.swing.JToggleButton();
        btn_Voltar = new javax.swing.JToggleButton();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Lista de Clientes");

        btn_Imprimir.setText("Imprimir");
        btn_Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ImprimirActionPerformed(evt);
            }
        });

        btn_Remover.setText("Remover");
        btn_Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RemoverActionPerformed(evt);
            }
        });

        btn_Voltar.setText("Voltar");
        btn_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx_listClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btn_Voltar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btn_Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_Remover, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cbx_listClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Imprimir)
                    .addComponent(btn_Remover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Voltar)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ImprimirActionPerformed
        int id = cbx_listClientes.getSelectedIndex();
        Cliente cliente = controle.SelecionarPorId(id);
        
        telaCLiente = new PainelVisalizacaoDeCliente(controle, cliente);
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().removeAll();
        janela.add(telaCLiente, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_btn_ImprimirActionPerformed

    private void btn_RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RemoverActionPerformed
        int input = JOptionPane.showConfirmDialog(null,"Deseja Realmente Excluir este Cadastro ?","Janela De Confirmacao",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(input == 0){
             int id = cbx_listClientes.getSelectedIndex();
            cbx_listClientes.removeItemAt(id);
            controle.Excluir(id);
            if(cbx_listClientes.getItemCount() == 0){
                telaAnterior = new PainelCadastroDeClientes(controle);
                JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
                janela.getContentPane().removeAll();
                janela.add(telaAnterior, BorderLayout.CENTER);
                janela.pack();  
            }   
        }
    }//GEN-LAST:event_btn_RemoverActionPerformed

    private void btn_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarActionPerformed
        telaAnterior = new PainelCadastroDeClientes(controle);
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().removeAll();
        janela.add(telaAnterior, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_btn_VoltarActionPerformed
    
    private void AtualizarCbx(){        
        for(Cliente c : controle.selecionarTodos()){
        cbx_listClientes.addItem(c.nome);
        }
    }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_Imprimir;
    private javax.swing.JToggleButton btn_Remover;
    private javax.swing.JToggleButton btn_Voltar;
    private javax.swing.JComboBox<String> cbx_listClientes;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
