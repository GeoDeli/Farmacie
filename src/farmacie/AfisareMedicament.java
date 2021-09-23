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
        }
        SelecteMedicament.setModel(model);
          AutoCompleteDecorator.decorate(SelecteMedicament);
        }catch(Exception e)
        { 
            System.out.println(e);
        } 
      
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SelecteMedicament = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedicamentInStoc = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();

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

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addComponent(SelecteMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelecteMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelecteMedicamentPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_SelecteMedicamentPopupMenuWillBecomeVisible
        // TODO add your handling code here:
       
    }//GEN-LAST:event_SelecteMedicamentPopupMenuWillBecomeVisible

    private void SelecteMedicamentPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_SelecteMedicamentPopupMenuWillBecomeInvisible
         //afiseaza farmaciile care au in stoc medicamentul selectat
        try {
            String med=String.valueOf(SelecteMedicament.getSelectedItem());
            String cod_med=String.valueOf(SelecteMedicament.getSelectedIndex()+1);
           String query="Select * from Medicamente where Nume=\""+med+"\""; //querry
         Statement statement=con.createStatement();  
         ResultSet resultSet = statement.executeQuery(query); 
         ArrayList farmacii=new ArrayList(); //unde se stocheaza valorile
        
         while(resultSet.next())
         {
             
              String q="Select * from Stoc where Cod_Med=\""+cod_med+"\"";
              Statement st=con.createStatement();
              ResultSet rs=st.executeQuery(q);
              while(rs.next())
              {
                  String q2="Select * from `farmacie-tab` where Cod_F=\""+rs.getString("Cod_F")+"\"";
                  Statement s=con.createStatement();
                  ResultSet rs2=s.executeQuery(q2);
                  while(rs2.next())
                  {
                      String nume=rs2.getString("Nume");
                      String oras=rs2.getString("Oras");
                      farmacii.add(nume+" "+oras);
                  }
              }
         }
         afiseaza(farmacii,MedicamentInStoc);

     } catch (SQLException ex) {
                         Logger.getLogger(AfisareOrasFarmacii.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_SelecteMedicamentPopupMenuWillBecomeInvisible

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
    private javax.swing.JList<String> MedicamentInStoc;
    private javax.swing.JComboBox<String> SelecteMedicament;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
