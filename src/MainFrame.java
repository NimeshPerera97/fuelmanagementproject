
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class MainFrame extends javax.swing.JFrame {

    
    public MainFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        txtcname = new javax.swing.JTextField();
        lnl_vehinumber = new javax.swing.JLabel();
        txtvnum = new javax.swing.JTextField();
        lbl_vehitype = new javax.swing.JLabel();
        btn_motorcycle = new javax.swing.JButton();
        btn_car = new javax.swing.JButton();
        btn_3wheeler = new javax.swing.JButton();
        btn_van = new javax.swing.JButton();
        btn_lorry = new javax.swing.JButton();
        btn_bus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(672, 453));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gas-pump.png"))); // NOI18N
        jLabel1.setText("Welcome to Maggona Fuel Station");

        lbl_name.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lbl_name.setText("Name :");

        txtcname.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtcname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcnameActionPerformed(evt);
            }
        });

        lnl_vehinumber.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lnl_vehinumber.setText("Vehicle Number :");

        txtvnum.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        lbl_vehitype.setBackground(new java.awt.Color(204, 255, 204));
        lbl_vehitype.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lbl_vehitype.setText("Select your vehicle type: ");

        btn_motorcycle.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_motorcycle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/motorbike.png"))); // NOI18N
        btn_motorcycle.setText("Motor-Cycle");
        btn_motorcycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_motorcycleActionPerformed(evt);
            }
        });

        btn_car.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_car.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car.png"))); // NOI18N
        btn_car.setText("Car");
        btn_car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carActionPerformed(evt);
            }
        });

        btn_3wheeler.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_3wheeler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tuk-tuk.png"))); // NOI18N
        btn_3wheeler.setText("Three-wheeler");
        btn_3wheeler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3wheelerActionPerformed(evt);
            }
        });

        btn_van.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_van.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delivery-van.png"))); // NOI18N
        btn_van.setText("Van");
        btn_van.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vanActionPerformed(evt);
            }
        });

        btn_lorry.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_lorry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lorry.png"))); // NOI18N
        btn_lorry.setText("Lorry");
        btn_lorry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lorryActionPerformed(evt);
            }
        });

        btn_bus.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_bus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school-bus.png"))); // NOI18N
        btn_bus.setText("Bus");
        btn_bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_busActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lnl_vehinumber, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(txtvnum, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_vehitype, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtcname, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_3wheeler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_car, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_motorcycle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_van, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_bus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_lorry, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                        .addGap(81, 81, 81)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_name)
                    .addComponent(txtcname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnl_vehinumber)
                    .addComponent(txtvnum, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(lbl_vehitype)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_motorcycle)
                    .addComponent(btn_van))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_3wheeler)
                    .addComponent(btn_bus))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_lorry)
                    .addComponent(btn_car))
                .addGap(61, 61, 61))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtcnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcnameActionPerformed
       
    }//GEN-LAST:event_txtcnameActionPerformed

    private void btn_motorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_motorcycleActionPerformed
        MotorBicycleFrame bicycle = new MotorBicycleFrame();
        bicycle.show();
        dispose();
        
        bicycle.printDetails();
       // MotorBicycleFrame.txfMotorBFuelStorage.setText(Double.toString(f));


    }//GEN-LAST:event_btn_motorcycleActionPerformed

    private void btn_carActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carActionPerformed
        CarFrame car = new CarFrame();
        car.show();
        dispose();
        car.printDetails();
    }//GEN-LAST:event_btn_carActionPerformed

    private void btn_3wheelerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3wheelerActionPerformed
        Three_WheelerFrame threewheel = new Three_WheelerFrame();
        threewheel.show();
        dispose();
        threewheel.printDetails();
        
    }//GEN-LAST:event_btn_3wheelerActionPerformed

    private void btn_vanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vanActionPerformed
       VanFrame van = new VanFrame();
       van.show();
       dispose();
       van.printDetails();
       
    }//GEN-LAST:event_btn_vanActionPerformed

    private void btn_lorryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lorryActionPerformed
        LorryFrame  lorry = new LorryFrame();
        lorry.show();
        dispose();
        lorry.printDetails();
        
    }//GEN-LAST:event_btn_lorryActionPerformed

    private void btn_busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_busActionPerformed
        BusFrame bus= new BusFrame();
        bus.show();
        bus.printDetails();
     
        dispose();
        
    }//GEN-LAST:event_btn_busActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    public void printmotorbicycleDetail(){
        txtcname.setText("Nimesh Lakshitha");
        txtvnum.setText("");
    }
    public void printcarDetail(){
        txtcname.setText("Nimesh Lakshitha");
        txtvnum.setText("");
    }
     public void printlorryDetail(){
        txtcname.setText("Nimesh Lakshitha");
        txtvnum.setText("");
    }
     public void printvanDetail(){
        txtcname.setText("Nimesh Lakshitha");
        txtvnum.setText("");
    }
     public void printbusDetail(){
        txtcname.setText("Nimesh Lakshitha");
        txtvnum.setText("");
    }
     public void printthreewheelerDetail(){
        txtcname.setText("Nimesh Lakshitha");
        txtvnum.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_3wheeler;
    private javax.swing.JButton btn_bus;
    private javax.swing.JButton btn_car;
    private javax.swing.JButton btn_lorry;
    private javax.swing.JButton btn_motorcycle;
    private javax.swing.JButton btn_van;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_vehitype;
    private javax.swing.JLabel lnl_vehinumber;
    private javax.swing.JTextField txtcname;
    private javax.swing.JTextField txtvnum;
    // End of variables declaration//GEN-END:variables
}
