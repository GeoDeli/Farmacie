/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package farmacie;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultListModel;
import java.text.DateFormatSymbols;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;

/**
 *
 * @author delim
 */
public class AfisareOrasFarmacii extends javax.swing.JFrame {
        Connection con;
       
     
    /**
     * Creates new form NewJFrame
     */
    public AfisareOrasFarmacii() {
        initComponents();
        jListFarmacii.removeAll();//elibereaza toate elementele din lista
        jPanel1.setVisible(false);  //ascunde panoul cu informatii
       
        try{        //realizeaza conexiunea conexiunea la baza de date
        String database="jdbc:mysql://localhost:3306/farmacie";
        String username="root";
        String pass="";
        con=DriverManager.getConnection(database,username,pass);
        
        
        }catch(Exception e)
        { 
            System.out.println(e);
        }
        IncarcareLuni();
    }

    
     void afiseaza(ArrayList<String> linii, JList Lista)
	{
            Lista.removeAll();
	DefaultListModel model=new DefaultListModel();
	
        for(String s:linii)
            model.addElement(s);
            Lista.setModel(model);
	
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListFarmacii = new javax.swing.JList<>();
        RBBucuresti = new javax.swing.JRadioButton();
        RBCluj = new javax.swing.JRadioButton();
        RBTimi = new javax.swing.JRadioButton();
        RBIasi = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        ComboLuna = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LabelSuma = new javax.swing.JLabel();
        LabelMedie = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LabelComenzi = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LabelAnalgezice = new javax.swing.JLabel();
        LabelAnabolizante = new javax.swing.JLabel();
        labelVitamine = new javax.swing.JLabel();
        LabelAntidepresive = new javax.swing.JLabel();
        LabelAntiinflamatorii = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListFarmacii.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListFarmacii.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListFarmacii.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListFarmaciiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListFarmacii);

        buttonGroup1.add(RBBucuresti);
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

        buttonGroup1.add(RBTimi);
        RBTimi.setText("Timisoara");
        RBTimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBTimiActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBIasi);
        RBIasi.setText("Iasi");
        RBIasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBIasiActionPerformed(evt);
            }
        });

        ComboLuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboLuna.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                ComboLunaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel1.setText("Luna:");

        jLabel2.setText("Suma totala:");

        jLabel3.setText("Valoare Medie per Comanda:");

        LabelSuma.setText("jLabel4");

        LabelMedie.setText("jLabel5");

        jLabel4.setText("Numar de comenzi:");

        LabelComenzi.setText("jLabel5");

        jLabel5.setText("Comenzi anuale");

        jLabel6.setText("Comenzi Lunare");

        jLabel7.setText("Analgezice");

        jLabel8.setText("Anabolizante");

        jLabel9.setText("Vitamine");

        jLabel10.setText("Antidepresive");

        jLabel11.setText("Antiinflamatorii");

        LabelAnalgezice.setText("jLabel12");

        LabelAnabolizante.setText("jLabel13");

        labelVitamine.setText("jLabel14");

        LabelAntidepresive.setText("jLabel15");

        LabelAntiinflamatorii.setText("jLabel16");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(71, 71, 71)
                        .addComponent(ComboLuna, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(64, 64, 64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(LabelAnalgezice)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addComponent(LabelAnabolizante)
                                .addComponent(labelVitamine)
                                .addComponent(LabelAntidepresive)
                                .addComponent(LabelAntiinflamatorii))
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelSuma)
                                    .addComponent(LabelMedie)
                                    .addComponent(LabelComenzi))
                                .addGap(64, 64, 64))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jScrollPane2)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboLuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LabelComenzi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LabelSuma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(LabelMedie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(LabelAnalgezice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(LabelAnabolizante))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(labelVitamine))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(LabelAntidepresive))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(LabelAntiinflamatorii)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(RBBucuresti)
                        .addGap(15, 15, 15)
                        .addComponent(RBCluj)
                        .addGap(18, 18, 18)
                        .addComponent(RBTimi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RBIasi)
                        .addGap(0, 86, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBBucuresti)
                    .addComponent(RBCluj)
                    .addComponent(RBTimi)
                    .addComponent(RBIasi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RBBucurestiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBBucurestiActionPerformed
                jPanel1.setVisible(false);
IncarcareLuni();
        try {
         // TODO add your handling code here:
         String query="Select * from `farmacie-tab` where oras='Bucuresti'"; //querry
         Statement statement=con.createStatement();  
         ResultSet resultSet = statement.executeQuery(query); 
         ArrayList farmacii=new ArrayList(); //unde se stocheaza valorile
         while(resultSet.next())
         {
             String item=resultSet.getString("nume"); //preia doar campul ce ne intereseaza
              farmacii.add(item);     
         }
         afiseaza(farmacii,jListFarmacii);

     } catch (SQLException ex) {
        
     }
    }//GEN-LAST:event_RBBucurestiActionPerformed

    private void RBClujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBClujActionPerformed
        
        jPanel1.setVisible(false);
        IncarcareLuni();
        try {
      
         String query="Select * from `farmacie-tab` where oras='Cluj'"; //querry
         Statement statement=con.createStatement();  
         ResultSet resultSet = statement.executeQuery(query); 
         ArrayList farmacii=new ArrayList(); //unde se stocheaza valorile
         while(resultSet.next())
         {
             String item=resultSet.getString("nume"); //preia doar campul ce ne intereseaza
              farmacii.add(item);     
         }
       afiseaza(farmacii,jListFarmacii);

     } catch (SQLException ex) {
     }
    }//GEN-LAST:event_RBClujActionPerformed

    private void RBTimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBTimiActionPerformed
                jPanel1.setVisible(false);
IncarcareLuni();
      
         // TODO add your handling code here:
         String query="Select * from `farmacie-tab` where oras='Timisoara'"; //querry
         Statement statement;  
            try {
                statement = con.createStatement();
            
         ResultSet resultSet = statement.executeQuery(query); 
         ArrayList farmacii=new ArrayList(); //unde se stocheaza valorile
         while(resultSet.next())
         {
             String item=resultSet.getString("nume"); //preia doar campul ce ne intereseaza
              farmacii.add(item);     
         }
         afiseaza(farmacii,jListFarmacii);
} catch (SQLException ex) {
                Logger.getLogger(AfisareOrasFarmacii.class.getName()).log(Level.SEVERE, null, ex);
            }
     
    }//GEN-LAST:event_RBTimiActionPerformed

    private void RBIasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBIasiActionPerformed
                jPanel1.setVisible(false);
IncarcareLuni();
        try {
         // TODO add your handling code here:
         String query="Select * from `farmacie-tab` where oras='Iasi'"; //querry
         Statement statement=con.createStatement();  
         ResultSet resultSet = statement.executeQuery(query); 
         ArrayList farmacii=new ArrayList(); //unde se stocheaza valorile
         while(resultSet.next())
         {
             String item=resultSet.getString("nume"); //preia doar campul ce ne intereseaza
              farmacii.add(item);     
         }
         afiseaza(farmacii,jListFarmacii);

     } catch (SQLException ex) {
     }
    }//GEN-LAST:event_RBIasiActionPerformed

    
    //cand s-a selectat o farmacie se afiseaza informatiile extra
    private void jListFarmaciiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListFarmaciiMouseClicked
        // TODO add your handling code here:
         jPanel1.setVisible(true); 
        
    }//GEN-LAST:event_jListFarmaciiMouseClicked

    //cand s-a selectat o luna din combo se face o afisare amanuntia
    private void ComboLunaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_ComboLunaPopupMenuWillBecomeInvisible
 
        int luna= ComboLuna.getSelectedIndex(); //preia luna
        luna++;
          String farmace=jListFarmacii.getSelectedValue(); //preia numele farmaciei
        
          try {
              //cauta numele informatii in BD folosind legatura dintre tabela Farmacie si Comanda
         String query="select comanda.ID_Comanda,comanda.pret from comanda,`farmacie-tab` where comanda.Cod_F=`farmacie-tab`.Cod_F and `farmacie-tab`.`Nume`=\""+farmace+"\" and Month(comanda.Data_Livrare)="+luna; //querry
         Statement statement=con.createStatement();  
         ResultSet resultSet = statement.executeQuery(query); 
       
         int count=0;           //numara comenzile din luna selectata
         double suma=0;
         while(resultSet.next())
         {
            count++;    
             suma+=Double.parseDouble(resultSet.getString("pret"));
            // System.out.println("Comanda curenta:"+resultSet.getString("ID_Comanda")+" suma: "+resultSet.getString("pret"));
           //  System.out.println(suma);
         }
         LabelComenzi.setText(String.valueOf(count)); //afiseaza numarul de comenzi
         LabelSuma.setText(String.valueOf(suma));//afiseaza suma totala incasata in luna curenta
         LabelMedie.setText(String.valueOf(suma/count)); //afiseaza media pe luna curenta
         
         
         //preia info despre medicamente din fiecare comanda
        query="select Med_Cant from comanda,`farmacie-tab` where comanda.Cod_F=`farmacie-tab`.Cod_F and `farmacie-tab`.`Nume`=\""+farmace+"\"";
        ArrayList<String> a=new ArrayList();  //array folosit pentru a prelua cantiatea
        ArrayList<String> med=new ArrayList();
         statement=con.createStatement();  
          resultSet = statement.executeQuery(query); 
       while(resultSet.next())  
       {
           String mc=resultSet.getString("Med_Cant");    //preia toate medicamentele comandate din comanda curenta
           String[] pereche=mc.split(",");          //separa medicamentele in perechi COD-Cantitate
           for(String p:pereche)                    //stocheaza toate perechile intr-un Array
               a.add(p);
       }
        for(String pereche: a)      //preia doar codul medicamentului
        {
            String[] cod=pereche.split(" ");
            med.add(cod[0]);
        }
        
        ArrayList<String> rez=new ArrayList();
        for(String cod:med)
        {
            String q="select Medicamente.Nume, Categorie.Nume from Medicamente, Categorie where medicamente.Cod_Cat=categorie.Cod_Cat and medicamente.Cod_Med=\""+cod+"\"";
            Statement s=con.createStatement();  
            ResultSet rs = s.executeQuery(q); 
            while(rs.next())
            {
                rez.add(rs.getString("Medicamente.Nume")+" "+ rs.getString("Categorie.Nume"));
            }
        }
        
        afiseaza(rez,jList1); 

     } catch (SQLException ex) {
                Logger.getLogger(AfisareOrasFarmacii.class.getName()).log(Level.SEVERE, null, ex);
            }
          
                     
    }//GEN-LAST:event_ComboLunaPopupMenuWillBecomeInvisible

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
            java.util.logging.Logger.getLogger(AfisareOrasFarmacii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AfisareOrasFarmacii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AfisareOrasFarmacii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AfisareOrasFarmacii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AfisareOrasFarmacii().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboLuna;
    private javax.swing.JLabel LabelAnabolizante;
    private javax.swing.JLabel LabelAnalgezice;
    private javax.swing.JLabel LabelAntidepresive;
    private javax.swing.JLabel LabelAntiinflamatorii;
    private javax.swing.JLabel LabelComenzi;
    private javax.swing.JLabel LabelMedie;
    private javax.swing.JLabel LabelSuma;
    private javax.swing.JRadioButton RBBucuresti;
    private javax.swing.JRadioButton RBCluj;
    private javax.swing.JRadioButton RBIasi;
    private javax.swing.JRadioButton RBTimi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jListFarmacii;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelVitamine;
    // End of variables declaration//GEN-END:variables

    private void IncarcareLuni() {
        ComboLuna.removeAllItems();
        
        String[] luni = new DateFormatSymbols().getMonths(); //creaza un array cu toate lunile din calendar in format string
        for (String month : luni) {
            ComboLuna.addItem(month);
            
        }
        
    }
}
