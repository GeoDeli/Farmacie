package farmacie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author delim
 */
public class AfisareMedicament extends javax.swing.JFrame {
 Connection con;
    
    public AfisareMedicament() {
        initComponents();
        
    DefaultComboBoxModel  model=new DefaultComboBoxModel();
DefaultComboBoxModel  model1=new DefaultComboBoxModel();
        try{        //realizeaza conexiunea conexiunea la baza de date
        String database="jdbc:mysql://localhost:3306/farmacie";
        String username="root";
        String pass="";
        con=DriverManager.getConnection(database,username,pass);
        
        String query="select * from Medicamente";
         Statement statement=con.createStatement();  
         ResultSet resultSet = statement.executeQuery(query); 
        while(resultSet.next())
        {
            model.addElement(resultSet.getString("Nume"));
             model1.addElement(resultSet.getString("Nume"));
        }
        SelecteMedicament.setModel(model);
        MedicamentPerOras.setModel(model1);
          AutoCompleteDecorator.decorate(SelecteMedicament);
          AutoCompleteDecorator.decorate(MedicamentPerOras);
        }catch(Exception e)
        { 
            System.out.println(e);
        } 
      
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        SelecteMedicament = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedicamentInStoc = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MedInOras = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        RBBucuresti = new javax.swing.JRadioButton();
        RBCluj = new javax.swing.JRadioButton();
        RBTimisoara = new javax.swing.JRadioButton();
        RBIasi = new javax.swing.JRadioButton();
        MedicamentPerOras = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SelecteMedicament.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        SelecteMedicament.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                SelecteMedicamentPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                SelecteMedicamentPopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel1.setText("Selecteaza medicamentul");

        MedicamentInStoc.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(MedicamentInStoc);

        jLabel2.setText("Lista farmaciilor ce au medicamentul selectat");

        MedInOras.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(MedInOras);

        jLabel3.setText("Selecteaza medicamentul");

        buttonGroup1.add(RBBucuresti);
        RBBucuresti.setSelected(true);
        RBBucuresti.setText("Bucuresti");
        RBBucuresti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBBucurestiActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBCluj);
        RBCluj.setText("Cluj");
        RBCluj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBClujActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBTimisoara);
        RBTimisoara.setText("Timisoara");
        RBTimisoara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBTimisoaraActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBIasi);
        RBIasi.setText("Iasi");
        RBIasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBIasiActionPerformed(evt);
            }
        });

        MedicamentPerOras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(SelecteMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RBBucuresti)
                                .addGap(18, 18, 18)
                                .addComponent(RBCluj))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RBTimisoara)
                                .addGap(18, 18, 18)
                                .addComponent(RBIasi))
                            .addComponent(MedicamentPerOras, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelecteMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(MedicamentPerOras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBBucuresti)
                    .addComponent(RBCluj)
                    .addComponent(RBTimisoara)
                    .addComponent(RBIasi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelecteMedicamentPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_SelecteMedicamentPopupMenuWillBecomeVisible
        // TODO add your handling code here:
       
    }//GEN-LAST:event_SelecteMedicamentPopupMenuWillBecomeVisible

    private void SelecteMedicamentPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_SelecteMedicamentPopupMenuWillBecomeInvisible
         //afiseaza farmaciile care au in stoc medicamentul selectat
        try {
        
            String cod_med=String.valueOf(SelecteMedicament.getSelectedIndex()+1); //preia codul medicamentului cautat
             ArrayList farmacii=new ArrayList(); //unde se stocheaza rezultatul

         //cauta in stoc medicamentul cu codul curent
              String q="Select * from Stoc where Cod_Med=\""+cod_med+"\"";
              Statement st=con.createStatement();
              ResultSet rs=st.executeQuery(q);
              while(rs.next())
              {//preia informatiile despre farmacie
                  String q2="Select * from `farmacie-tab` where Cod_F=\""+rs.getString("Cod_F")+"\"";
                  Statement s=con.createStatement();
                  ResultSet rs2=s.executeQuery(q2);
                  while(rs2.next())
                  {//stocheaza informatiile ce vor fi afisate utilizatorului
                      String nume=rs2.getString("Nume");
                      String oras=rs2.getString("Oras");
                      farmacii.add(nume+" "+oras);
                  }
              }
         
         afiseaza(farmacii,MedicamentInStoc);

     } catch (SQLException ex) {
                         Logger.getLogger(AfisareOrasFarmacii.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_SelecteMedicamentPopupMenuWillBecomeInvisible
 
        //afiseaza cantitatile de medicament din orasul Bucuresti
    private void RBBucurestiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBBucurestiActionPerformed
       CautaInOras("\"Bucuresti\"");
    }//GEN-LAST:event_RBBucurestiActionPerformed

    private void RBTimisoaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBTimisoaraActionPerformed
        // TODO add your handling code here:
      CautaInOras("\"Timisoara\"");
    }//GEN-LAST:event_RBTimisoaraActionPerformed

    private void RBClujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBClujActionPerformed
        // TODO add your handling code here:
        CautaInOras("\"Cluj\"");
    }//GEN-LAST:event_RBClujActionPerformed

    private void RBIasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBIasiActionPerformed
        // TODO add your handling code here:
        CautaInOras("\"Iasi\"");
    }//GEN-LAST:event_RBIasiActionPerformed

    void CautaInOras(String oras)
    {
           String cod_med=String.valueOf(MedicamentPerOras.getSelectedIndex()+1); //preia codul medicamentului cautat
             ArrayList farmacii=new ArrayList(); //unde se stocheaza rezultatul
        
        try {
             //cauta in stoc medicamentul cu codul curent
              String q="Select * from Stoc where Cod_Med=\""+cod_med+"\"";
              Statement st=con.createStatement();
              ResultSet rs=st.executeQuery(q);
              while(rs.next())
              {
                  String query="Select * from `farmacie-tab` where oras="+oras+" and Cod_F=\""+rs.getString("Cod_F")+"\""; //querry
                  Statement statement=con.createStatement();  
                  ResultSet resultSet = statement.executeQuery(query); 
   
         while(resultSet.next())
         {
             String nume=resultSet.getString("nume"); //preia doar campul ce ne intereseaza
             String bucati=rs.getString("Cantitate");
              farmacii.add(nume+" "+bucati+" bucati");     
         }
              }
            
        afiseaza(farmacii,MedInOras);

     } catch (SQLException ex) {
                        Logger.getLogger(AfisareOrasFarmacii.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
    void afiseaza(ArrayList<String> linii, JList Lista)
	{
            Lista.removeAll();
	DefaultListModel model=new DefaultListModel();
	
        for(String s:linii)
            model.addElement(s);
            Lista.setModel(model);
	
        }
    
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
            java.util.logging.Logger.getLogger(AfisareMedicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AfisareMedicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AfisareMedicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AfisareMedicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AfisareMedicament().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> MedInOras;
    private javax.swing.JList<String> MedicamentInStoc;
    private javax.swing.JComboBox<String> MedicamentPerOras;
    private javax.swing.JRadioButton RBBucuresti;
    private javax.swing.JRadioButton RBCluj;
    private javax.swing.JRadioButton RBIasi;
    private javax.swing.JRadioButton RBTimisoara;
    private javax.swing.JComboBox<String> SelecteMedicament;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
