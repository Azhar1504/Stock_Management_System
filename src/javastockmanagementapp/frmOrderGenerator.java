/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastockmanagementapp;

/**
 *
 * @author Anuj
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class frmOrderGenerator extends javax.swing.JFrame {

    /**
     * Creates new form frmOrderGenerator
     */
    public frmOrderGenerator() {
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

        jLabel1 = new javax.swing.JLabel();
        ddClientID = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTakeOrder = new javax.swing.JTable(){
            private static final long serialVersionUID = 1L;
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                    return Boolean.class;
                    case 1:
                    return String.class;
                    case 2:
                    return Float.class;
                    case 3:
                    return Integer.class;
                    default:
                    return String.class;
                }
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ClientID:");

        ddClientID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ddClientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddClientIDActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Generate Order");

        jScrollPane2.setViewportView(tblTakeOrder);
        tblTakeOrder.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(ddClientID, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddClientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleName("lblClientId");
        ddClientID.getAccessibleContext().setAccessibleName("\"\"");
        jButton1.getAccessibleContext().setAccessibleName("btnGenerateOrder");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Variables and data structures initialization
    public static final Map<String,Integer> DIC_STOCK = new HashMap<>();
    
    private void ddClientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddClientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddClientIDActionPerformed

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
            java.util.logging.Logger.getLogger(frmOrderGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmOrderGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmOrderGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmOrderGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmOrderGenerator().setVisible(true);
            
            try {
                fillClientDropDown();
                checkStock();
                updateProductsTable();
            } catch (Exception ex) {
                Logger.getLogger(frmOrderGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    
    //Populate drop down using clients' name from clients table
    private static void fillClientDropDown() throws SQLException, Exception
    {
        HashMap<String,String> dicClients;

        try {
            ResultSet result = dbConnect.getConnection().createStatement().
                    executeQuery("SELECT * FROM tblclients");
            dicClients = new HashMap<>();
            
            while (result.next()) {
                dicClients.put(result.getString("clientID"),result.getString("clientName"));
            }
            
            dicClients.values().forEach((clientName) -> {
                ddClientID.addItem(clientName);
            });

        } catch (SQLException ex) {
            throw ex;
        }
    }
    
    //Update table with lists of products in stock
    private static void updateProductsTable() throws Exception{
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"", "Product Name", "Unit Price", "Quantity"});
        try{
            ResultSet result = dbConnect.getConnection().createStatement().
                    executeQuery("SELECT * FROM tblproducts");
            
            while(result.next()){
                if(DIC_STOCK.keySet().contains(result.getString("pdtID")))
                    model.addRow(new Object[]{ false,result.getString("pdtName"),
                        result.getFloat("pdtUnitPrice")});
            }
        }
        catch(Exception ex)
        {
        throw ex;
        }
        finally
        {
            tblTakeOrder.setModel(model);
        }
        
    }
    
    private static List<clsProduct> getProductList() throws SQLException, Exception
    {
        List<clsProduct> lstProducts = new ArrayList<>();
        try{
            ResultSet result = dbConnect.getConnection().createStatement().
                    executeQuery("SELECT * FROM tblproducts");
            
            while(result.next()){
                lstProducts.add(new clsProduct(result.getString("pdtID"),result.getString("pdtName"),
                        result.getString("pdtRefNum"),result.getFloat("pdtUnitPrice")));
            }
            
            return lstProducts;
        }
        catch(Exception ex)
        {
        throw ex;
        }
        
    }
    
    //check current quanitity of all products in stock and update quantity list
    private static void checkStock() throws Exception{
        try{
            ResultSet result = dbConnect.getConnection().createStatement().
                    executeQuery("SELECT * FROM tblstock where Quantity > 0");
            
            while(result.next()){
                if (!DIC_STOCK.isEmpty())
                    DIC_STOCK.clear();
               DIC_STOCK.put(result.getString("pdtID"),result.getInt("Quantity"));
            }
        }
        catch(Exception ex)
        {
        throw ex;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JComboBox<String> ddClientID;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private static javax.swing.JTable tblTakeOrder;
    // End of variables declaration//GEN-END:variables
}