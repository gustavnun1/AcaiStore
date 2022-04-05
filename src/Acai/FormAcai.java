
package Acai;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormAcai extends javax.swing.JFrame {
    //                           x  y
    int pedidos [] [] = new int [4][3];
    String nome = " ";
    String cpf = " ";
    String contato = " ";
    
    ButtonGroup group;
    
    public FormAcai() {
        initComponents();
        definirEventos();
    }
    
     public void definirEventos(){
         group = new ButtonGroup();
		group.add(chk250ml);
		group.add(chk300ml);
                group.add(chk750ml);
                
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCardapio = new javax.swing.JLabel();
        lblTamanho = new javax.swing.JLabel();
        lblAcompanhamento = new javax.swing.JLabel();
        lblBebida = new javax.swing.JLabel();
        chk250ml = new javax.swing.JCheckBox();
        chk300ml = new javax.swing.JCheckBox();
        chk750ml = new javax.swing.JCheckBox();
        chkLeitepô = new javax.swing.JCheckBox();
        chkLeiteCondensado = new javax.swing.JCheckBox();
        chkGranola = new javax.swing.JCheckBox();
        chkRefri = new javax.swing.JCheckBox();
        chkAgua = new javax.swing.JCheckBox();
        chkSuco = new javax.swing.JCheckBox();
        lblSalgado = new javax.swing.JLabel();
        chkCoxinha = new javax.swing.JCheckBox();
        chkKibe = new javax.swing.JCheckBox();
        chkBolindeCarne = new javax.swing.JCheckBox();
        btnComprar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 51, 255));

        lblCardapio.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        lblCardapio.setForeground(new java.awt.Color(255, 255, 255));
        lblCardapio.setText("Cardapio");

        lblTamanho.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        lblTamanho.setForeground(new java.awt.Color(255, 255, 255));
        lblTamanho.setText("Tamanho");

        lblAcompanhamento.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        lblAcompanhamento.setForeground(new java.awt.Color(255, 255, 255));
        lblAcompanhamento.setText("Acompanhamento");

        lblBebida.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        lblBebida.setForeground(new java.awt.Color(255, 255, 255));
        lblBebida.setText("Bebidas");

        chk250ml.setBackground(new java.awt.Color(102, 102, 255));
        chk250ml.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chk250ml.setForeground(new java.awt.Color(255, 255, 255));
        chk250ml.setText("250ML");
        chk250ml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk250mlActionPerformed(evt);
            }
        });

        chk300ml.setBackground(new java.awt.Color(102, 102, 255));
        chk300ml.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chk300ml.setForeground(new java.awt.Color(255, 255, 255));
        chk300ml.setText("300ML");
        chk300ml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk300mlActionPerformed(evt);
            }
        });

        chk750ml.setBackground(new java.awt.Color(102, 102, 255));
        chk750ml.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chk750ml.setForeground(new java.awt.Color(255, 255, 255));
        chk750ml.setText("750ML");
        chk750ml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk750mlActionPerformed(evt);
            }
        });

        chkLeitepô.setBackground(new java.awt.Color(102, 102, 255));
        chkLeitepô.setForeground(new java.awt.Color(255, 255, 255));
        chkLeitepô.setText("Leite em pô");
        chkLeitepô.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLeitepôActionPerformed(evt);
            }
        });

        chkLeiteCondensado.setBackground(new java.awt.Color(102, 102, 255));
        chkLeiteCondensado.setForeground(new java.awt.Color(255, 255, 255));
        chkLeiteCondensado.setText("Leite condensado");
        chkLeiteCondensado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLeiteCondensadoActionPerformed(evt);
            }
        });

        chkGranola.setBackground(new java.awt.Color(102, 102, 255));
        chkGranola.setForeground(new java.awt.Color(255, 255, 255));
        chkGranola.setText("Granola");
        chkGranola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGranolaActionPerformed(evt);
            }
        });

        chkRefri.setBackground(new java.awt.Color(102, 102, 255));
        chkRefri.setForeground(new java.awt.Color(255, 255, 255));
        chkRefri.setText("Refrigerante");
        chkRefri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRefriActionPerformed(evt);
            }
        });

        chkAgua.setBackground(new java.awt.Color(102, 102, 255));
        chkAgua.setForeground(new java.awt.Color(255, 255, 255));
        chkAgua.setText("Agua");
        chkAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAguaActionPerformed(evt);
            }
        });

        chkSuco.setBackground(new java.awt.Color(102, 102, 255));
        chkSuco.setForeground(new java.awt.Color(255, 255, 255));
        chkSuco.setText("Suco");
        chkSuco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSucoActionPerformed(evt);
            }
        });

        lblSalgado.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        lblSalgado.setForeground(new java.awt.Color(255, 255, 255));
        lblSalgado.setText("Salgados");

        chkCoxinha.setBackground(new java.awt.Color(102, 102, 255));
        chkCoxinha.setForeground(new java.awt.Color(255, 255, 255));
        chkCoxinha.setText("Coxinha");
        chkCoxinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCoxinhaActionPerformed(evt);
            }
        });

        chkKibe.setBackground(new java.awt.Color(102, 102, 255));
        chkKibe.setForeground(new java.awt.Color(255, 255, 255));
        chkKibe.setText("Kibe");
        chkKibe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkKibeActionPerformed(evt);
            }
        });

        chkBolindeCarne.setBackground(new java.awt.Color(102, 102, 255));
        chkBolindeCarne.setForeground(new java.awt.Color(255, 255, 255));
        chkBolindeCarne.setText("Bolinho de carne");
        chkBolindeCarne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBolindeCarneActionPerformed(evt);
            }
        });

        btnComprar.setBackground(new java.awt.Color(102, 102, 255));
        btnComprar.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(255, 255, 255));
        btnComprar.setText("COMPRAR");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Acai/AgoraVai.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(lblCardapio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(chkKibe)))
                .addContainerGap(281, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTamanho)
                    .addComponent(chk250ml)
                    .addComponent(chk750ml)
                    .addComponent(chk300ml)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkLeitepô)
                            .addComponent(lblAcompanhamento)
                            .addComponent(chkGranola))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBebida)
                            .addComponent(chkRefri)
                            .addComponent(chkAgua)
                            .addComponent(chkSuco))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(btnComprar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(lblSalgado))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chkCoxinha)
                                    .addComponent(chkLeiteCondensado))
                                .addGap(44, 44, 44)
                                .addComponent(chkBolindeCarne)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCardapio)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTamanho)
                            .addComponent(lblBebida, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk250ml)
                            .addComponent(chkRefri)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAcompanhamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkLeitepô)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkLeiteCondensado)
                        .addComponent(chkSuco))
                    .addComponent(chk300ml))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk750ml)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkGranola)
                        .addComponent(chkAgua)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblSalgado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkKibe)
                            .addComponent(chkCoxinha)
                            .addComponent(chkBolindeCarne))
                        .addGap(39, 39, 39)
                        .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(105, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chk250mlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk250mlActionPerformed
    
        pedidos[0][0] = 250; 
    }//GEN-LAST:event_chk250mlActionPerformed

    private void chkAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAguaActionPerformed
       if(chkAgua.isSelected()){
             pedidos[2][2] = 1;
         }else{
            pedidos[2][2] = 0;
        }
    }//GEN-LAST:event_chkAguaActionPerformed

    private void chkCoxinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCoxinhaActionPerformed
       if(chkCoxinha.isSelected()){
             pedidos[3][1] = 1;
         }else{
            pedidos[3][1] = 0;
        }
    }//GEN-LAST:event_chkCoxinhaActionPerformed

    private void chk300mlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk300mlActionPerformed
        pedidos[0][0] = 300;
    }//GEN-LAST:event_chk300mlActionPerformed

    private void chk750mlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk750mlActionPerformed
        pedidos[0][0] = 750;
    }//GEN-LAST:event_chk750mlActionPerformed

    private void chkLeitepôActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLeitepôActionPerformed
        if(chkLeitepô.isSelected()){
            pedidos[1][0] = 1;
        }else{
            pedidos[1][0] = 0;
        }
        
    }//GEN-LAST:event_chkLeitepôActionPerformed

    private void chkGranolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGranolaActionPerformed
         if(chkGranola.isSelected()){
             pedidos[1][2] = 1;
         }else{
            pedidos[1][2] = 0;
        }
    }//GEN-LAST:event_chkGranolaActionPerformed

    private void chkLeiteCondensadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLeiteCondensadoActionPerformed
         if(chkLeiteCondensado.isSelected()){
             pedidos[1][1] = 1;
         }else{
            pedidos[1][1] = 0;
        }
    }//GEN-LAST:event_chkLeiteCondensadoActionPerformed

    private void chkRefriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRefriActionPerformed
        if(chkRefri.isSelected()){
             pedidos[2][0] = 1;
         }else{
            pedidos[2][0] = 0;
        }
    }//GEN-LAST:event_chkRefriActionPerformed

    private void chkSucoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSucoActionPerformed
        if(chkSuco.isSelected()){
             pedidos[2][1] = 1;
         }else{
            pedidos[2][1] = 0;
        }
    }//GEN-LAST:event_chkSucoActionPerformed

    private void chkKibeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkKibeActionPerformed
        if(chkKibe.isSelected()){
             pedidos[3][0] = 1;
         }else{
            pedidos[3][0] = 0;
        }
    }//GEN-LAST:event_chkKibeActionPerformed

    private void chkBolindeCarneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBolindeCarneActionPerformed
        if(chkBolindeCarne.isSelected()){
             pedidos[3][2] = 1;
         }else{
            pedidos[3][2] = 0;
        }
    }//GEN-LAST:event_chkBolindeCarneActionPerformed
     public void array(int matriz[][]){
        String tamanho =" ";
        String adicionais =" ";
        String bebidas = " ";
        String salgados=" ";
        
        if(matriz[0][0] == 250){
            tamanho = "250";
        }else{
            if(matriz[0][0] == 300){
                tamanho = "300";
            }else{
                 tamanho = "750";
            }
        }
        if(matriz[1][0] == 1){
            adicionais = "Leite em pó";
        }
        if(matriz[1][1] == 1){
            adicionais = adicionais +"  Leite condensado";
        }
        if(matriz[1][2] == 1){
            adicionais = adicionais +"  granola";
        }
        
        if(matriz[2][0] == 1){
            bebidas = "Refrigerante";
        }
        if(matriz[2][1] == 1){
            bebidas = bebidas +"  Suco";
        }
        if(matriz[2][2] == 1){
            bebidas = bebidas +"  Água";
        }
        
        if(matriz[3][0] == 1){
            salgados = "Kibe";
        }
        if(matriz[3][1] == 1){
            salgados = salgados +"  Coxinha";
        }
        if(matriz[3][2] == 1){
            salgados = salgados +"  Bolinho de carne";
        }
      System.out.println(tamanho +" "+ adicionais +" "+ bebidas +" "+ salgados);
        
    }

    public void btnComprarActionPerformed(java.awt.event.ActionEvent evt) { 
        String tamanho =" ";
        String adicionais =" ";
        String bebidas = " ";
        String salgados=" ";
        
        if(pedidos[0][0] == 250){
            tamanho = "250";
        }else{
            if(pedidos[0][0] == 300){
                tamanho = "300";
            }else{
                 tamanho = "750";
            }
        }
        if(pedidos[1][0] == 1){
            adicionais = "Leite em pó";
        }
        if(pedidos[1][1] == 1){
            adicionais = adicionais +"  Leite condensado";
        }
        if(pedidos[1][2] == 1){
            adicionais = adicionais +"  granola";
        }
        
        if(pedidos[2][0] == 1){
            bebidas = "Refrigerante";
        }
        if(pedidos[2][1] == 1){
            bebidas = bebidas +"  Suco";
        }
        if(pedidos[2][2] == 1){
            bebidas = bebidas +"  Água";
        }
        
        if(pedidos[3][0] == 1){
            salgados = "Kibe";
        }
        if(pedidos[3][1] == 1){
            salgados = salgados +"  Coxinha";
        }
        if(pedidos[3][2] == 1){
            salgados = salgados +"  Bolinho de carne";
        }
        JOptionPane.showMessageDialog(null,"NOTA FISCAL\nTamanho: "+tamanho+"\nAdicionais: "+ adicionais +"\nBebidas: "+ bebidas +"\nSalgados: "+ salgados+"\n\nCliente: "+nome+"\nCpf: "+cpf);
      //System.out.println(tamanho +" "+ adicionais +" "+ bebidas +" "+ salgados);
      
    }
/*
    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
       ;
    }//GEN-LAST:event_btnComprarActionPerformed
*/
    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAcai().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JCheckBox chk250ml;
    private javax.swing.JCheckBox chk300ml;
    private javax.swing.JCheckBox chk750ml;
    private javax.swing.JCheckBox chkAgua;
    private javax.swing.JCheckBox chkBolindeCarne;
    private javax.swing.JCheckBox chkCoxinha;
    private javax.swing.JCheckBox chkGranola;
    private javax.swing.JCheckBox chkKibe;
    private javax.swing.JCheckBox chkLeiteCondensado;
    private javax.swing.JCheckBox chkLeitepô;
    private javax.swing.JCheckBox chkRefri;
    private javax.swing.JCheckBox chkSuco;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAcompanhamento;
    private javax.swing.JLabel lblBebida;
    private javax.swing.JLabel lblCardapio;
    private javax.swing.JLabel lblSalgado;
    private javax.swing.JLabel lblTamanho;
    // End of variables declaration//GEN-END:variables
}
