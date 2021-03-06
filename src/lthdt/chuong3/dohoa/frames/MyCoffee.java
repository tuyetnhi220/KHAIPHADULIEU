/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong3.dohoa.frames;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import lthdt.chuong3.coffeelogic.CoffeeShop;
import lthdt.chuong3.coffeelogic.Manager;

/**
 *
 * @author Administrator
 */
public class MyCoffee extends javax.swing.JInternalFrame {
    
     Manager[] managers;

    /**
     * Creates new form MyCoffee
     */
    public MyCoffee() throws ParseException {
        initComponents();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        CoffeeShop[] a = new CoffeeShop[] 
        {
            new CoffeeShop("Kha Coffee", "2 Nguyen Hue"),
            new CoffeeShop("White garden", "4 Nguyen Sinh Cung"),
            new CoffeeShop("Hong Kong", "33 Nguyen Khuyen")
                    
        };
       Manager[] managers = new Manager[]
       {
           new Manager(a, 1000, "Le Thi A", 0, df.parse("12-12-2000")),
           new Manager(new CoffeeShop[] 
           {
             new CoffeeShop("Hoang Hac", "12 Nguyen Hue")
           },
           2000, "Nguyen Van B", 1, df.parse("12-12-1999"))
       };
       for(int i =0; i< managers.length; i++)
       {
//           cbQuanly.addItem(managers[i].getHoten());
          
       }
       
        DefaultTableModel model = (DefaultTableModel) tblCoffeeShop.getModel();
        model.setRowCount(0);
        CoffeeShop[] shops = managers[0].getShops();
        for(int i=0; i<shops.length; i++)
        {
            model.insertRow(model.getRowCount(),
                    new Object[] 
                    {
                        model.getRowCount()+1,
                        shops[i].getName(),
                        shops[i].getAddress(),
//                    new Object[] {model.getRowCount() + 1), shops[i].getName(),
//                    shops[i].getAddress()
//            
                    });
        
        
        }
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
        cbQuanly = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCoffeeShop = new javax.swing.JTable();

        setTitle("Danh sach cac quan caffee");

        jLabel1.setText("Ho Te Nguoi quan ly");

        cbQuanly.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbQuanlyItemStateChanged(evt);
            }
        });

        tblCoffeeShop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "STT", "Ten QUan", "Dia Chi"
            }
        ));
        jScrollPane1.setViewportView(tblCoffeeShop);
        if (tblCoffeeShop.getColumnModel().getColumnCount() > 0) {
            tblCoffeeShop.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbQuanly, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbQuanly, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbQuanlyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbQuanlyItemStateChanged
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblCoffeeShop.getModel();
        model.setRowCount(0);
        int index = cbQuanly.getSelectedIndex();
        CoffeeShop[] shops = managers[index].getShops();
        for(int i=0; i<shops.length; i++)
        {
            model.insertRow(model.getRowCount(),
                    new Object[] 
                    {
                        model.getRowCount()+1,
                        shops[i].getName(),
                        shops[i].getAddress(),
//                    new Object[] {model.getRowCount() + 1), shops[i].getName(),
//                    shops[i].getAddress()
//            
                    });
    }//GEN-LAST:event_cbQuanlyItemStateChanged
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbQuanly;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCoffeeShop;
    // End of variables declaration//GEN-END:variables

//    private void initComponents() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    //cái initComponents khởi tạo 1 lần thôi cha
    //rứa là hết rồi đó , rua chu xoa cai dong no af
    //ầy, hàm tọa mô ra 3 cái dễ sợ rứa mà, cái mô k cần thì xóa đi, ban iu xoa luon di hahah
    //t có biết cái mô m k dùng mô mà, nhung ma t cung ko biet bat dau tu dau :(((( txoang
    //k thôi cmt lại tạm rứa đc,
    //rứa chăc đc rồi, m thử chạy coi được k
    
}
