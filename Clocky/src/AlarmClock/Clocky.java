/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlarmClock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import java.util.Timer;
import javax.swing.DefaultListModel;


/**
 *
 * @author Ayushi
 */
public class Clocky extends javax.swing.JFrame {
     int curRow = 0;
    int clk = 0;
    int clk1 = 0;
    Connection con;
    Statement stmt;
    ResultSet rs;
    public Clocky() {
        initComponents();
         new Thread()
        {
            public void run()
            {
                while(clk==0)
                {
                 
                    String day = ""+new Date();            
                        labFont.setText(day);
                }
            }
       }.start();
    }
    public void Doconnect(){
        try{
             String host = "jdbc:derby://localhost:1527/PersonInfo";
        String uName = "Ayushi";
        String uPass = "123";
         con = DriverManager.getConnection(host, uName, uPass);
         stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String sql = "SELECT* FROM Clocky";
        rs = stmt.executeQuery(sql);
        }
        catch(SQLException err){
          JOptionPane.showMessageDialog(Clocky.this,err.getMessage());  
        }
        
    }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        alarmPanel = new javax.swing.JPanel();
        hhLab = new javax.swing.JLabel();
        hhText = new javax.swing.JTextField();
        mmLab = new javax.swing.JLabel();
        mmText = new javax.swing.JTextField();
        ssLab = new javax.swing.JLabel();
        ssText = new javax.swing.JTextField();
        amR = new javax.swing.JRadioButton();
        pmR = new javax.swing.JRadioButton();
        resetButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bAdd = new javax.swing.JButton();
        showButton = new javax.swing.JButton();
        delButton = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jFrame4 = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labFont = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jFrame1.setTitle("Alarm_Clock");
        jFrame1.setBackground(new java.awt.Color(49, 3, 14));
        jFrame1.setPreferredSize(new java.awt.Dimension(560, 280));
        jFrame1.setResizable(false);
        jFrame1.setSize(new java.awt.Dimension(560, 274));

        alarmPanel.setBackground(new java.awt.Color(104, 255, 255));
        alarmPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 4));
        alarmPanel.setForeground(new java.awt.Color(0, 0, 158));
        alarmPanel.setPreferredSize(new java.awt.Dimension(560, 274));

        hhLab.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        hhLab.setForeground(new java.awt.Color(0, 0, 158));
        hhLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hhLab.setText("HH");

        hhText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        hhText.setForeground(new java.awt.Color(0, 0, 158));
        hhText.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        mmLab.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        mmLab.setForeground(new java.awt.Color(0, 0, 158));
        mmLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mmLab.setText("MM");

        mmText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        mmText.setForeground(new java.awt.Color(0, 0, 158));
        mmText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmTextActionPerformed(evt);
            }
        });

        ssLab.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ssLab.setForeground(new java.awt.Color(0, 0, 158));
        ssLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ssLab.setText("SS");

        ssText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ssText.setForeground(new java.awt.Color(0, 0, 158));
        ssText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssTextActionPerformed(evt);
            }
        });

        buttonGroup1.add(amR);
        amR.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        amR.setForeground(new java.awt.Color(0, 0, 158));
        amR.setText("AM");

        buttonGroup1.add(pmR);
        pmR.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        pmR.setForeground(new java.awt.Color(0, 0, 158));
        pmR.setText("PM");
        pmR.setToolTipText("");

        resetButton.setBackground(new java.awt.Color(104, 255, 255));
        resetButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        resetButton.setForeground(new java.awt.Color(0, 0, 153));
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DS-Digital", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 158));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("remaining time");

        bAdd.setBackground(new java.awt.Color(104, 255, 255));
        bAdd.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        bAdd.setForeground(new java.awt.Color(0, 0, 158));
        bAdd.setText("+");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        showButton.setBackground(new java.awt.Color(104, 255, 255));
        showButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        showButton.setForeground(new java.awt.Color(0, 0, 153));
        showButton.setText("Show Alarms");
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });

        delButton.setBackground(new java.awt.Color(104, 255, 255));
        delButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        delButton.setForeground(new java.awt.Color(0, 0, 158));
        delButton.setText("Delete");
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout alarmPanelLayout = new javax.swing.GroupLayout(alarmPanel);
        alarmPanel.setLayout(alarmPanelLayout);
        alarmPanelLayout.setHorizontalGroup(
            alarmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alarmPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alarmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alarmPanelLayout.createSequentialGroup()
                        .addComponent(hhLab, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(hhText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(alarmPanelLayout.createSequentialGroup()
                        .addGroup(alarmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(alarmPanelLayout.createSequentialGroup()
                                .addComponent(resetButton)
                                .addGap(45, 45, 45)
                                .addComponent(showButton))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(alarmPanelLayout.createSequentialGroup()
                                .addComponent(mmLab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mmText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(alarmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(alarmPanelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(ssLab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(ssText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alarmPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delButton)
                                .addGap(41, 41, 41)))
                        .addGroup(alarmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pmR)
                            .addComponent(amR)
                            .addComponent(bAdd, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        alarmPanelLayout.setVerticalGroup(
            alarmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alarmPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alarmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton)
                    .addComponent(bAdd)
                    .addComponent(showButton)
                    .addComponent(delButton))
                .addGap(77, 77, 77)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(alarmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alarmPanelLayout.createSequentialGroup()
                        .addGroup(alarmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hhLab, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hhText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mmLab, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mmText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ssLab, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ssText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alarmPanelLayout.createSequentialGroup()
                        .addComponent(amR)
                        .addGap(28, 28, 28)
                        .addComponent(pmR)
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addComponent(alarmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(alarmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.setBackground(new java.awt.Color(104, 255, 255));

        jList1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jList1.setForeground(new java.awt.Color(0, 0, 158));
        jScrollPane3.setViewportView(jList1);

        jLabel3.setBackground(new java.awt.Color(104, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 158));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Alarm List");
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
            .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
            .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alarmy");

        jPanel1.setBackground(new java.awt.Color(49, 3, 14));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(204, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 143, 153));

        labFont.setFont(new java.awt.Font("DS-Digital", 1, 48)); // NOI18N
        labFont.setForeground(new java.awt.Color(255, 153, 153));
        labFont.setText(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setText("Set Alarm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labFont, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(labFont, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jFrame1.setVisible(true);
        alarmPanel.setVisible(true);
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ssTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssTextActionPerformed
        
    }//GEN-LAST:event_ssTextActionPerformed

    private void mmTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmTextActionPerformed
        
    }//GEN-LAST:event_mmTextActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        hhText.setText(null);
        mmText.setText(null);
        ssText.setText(null);
        jLabel1.setText(null);
       // jLabel1.setVisible(false);
        
        
        
    }//GEN-LAST:event_resetButtonActionPerformed

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        Doconnect(); 
        String hr = hhText.getText();
       int HR = Integer.parseInt(hr);
       String mn = mmText.getText();
       int MN = Integer.parseInt(mn);
       String sc = ssText.getText();
       int SC = Integer.parseInt(sc);
       String AP = "";
       if(amR.isSelected()){
           AP = "AM";
       }
       if(pmR.isSelected()){
           AP = "PM";
       }
       
       try{
            rs.moveToInsertRow();
            rs.updateInt("HH", HR);
           
            rs.updateInt("MM", MN);
            
            rs.updateInt("SS", SC);       
            rs.updateString("AM_PM",AP);
                  
            rs.insertRow();
            stmt.close();
            rs.close();
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT* FROM Clocky";
            rs = stmt.executeQuery(sql);
            JOptionPane.showMessageDialog(this.jFrame1, "Alarm added");
            
            new Thread(){
                 Thread t1;
           public void run(){
             Timer t = null;  
            while(clk1==0){
            Calendar cal = new GregorianCalendar();
            int h = cal.get(Calendar.HOUR);
            int m = cal.get(Calendar.MINUTE);
            int s = cal.get(Calendar.SECOND);
            int am_pm = cal.get(Calendar.AM_PM);
             String a_p = "";
                  if(am_pm==1)
                  {
                   //  a_p = "PM"; 
                  
                
            if(amR.isSelected()){
                int Temp_H = HR-h;
                int Temp_M = MN-m;
                int Temp_S = SC-s;
                String time1 = Temp_H+":"+Temp_M+":"+Temp_S+" remaining";
                jLabel1.setText(time1);
                if(h==HR && m==MN && s==SC){
                    jLabel1.setText(null);
                    
                   JOptionPane.showMessageDialog(jFrame1, "Wakeup.....Wakeup");
                    t.cancel();
                }
            }
            if(pmR.isSelected()){
               int Temp_H = HR-h;
               int Temp_M = MN-m;
               int Temp_S = SC-s;
               String time1 = Temp_H+":"+Temp_M+":"+Temp_S+" remaining";
                jLabel1.setText(time1);
                 if(h==HR && m==MN && s==SC){
                    
                      jLabel1.setText(null);
                   JOptionPane.showMessageDialog(jFrame1, "Wakeup.....Wakeup");
                    t.cancel();
                 }
            }
            }
              else
                  {
                      //a_p = "AM";
                        if(amR.isSelected()){
                int Temp_H = h-HR;
                int Temp_M = m-MN;
                int Temp_S = s-SC;
                String time1 = Temp_H+":"+Temp_M+":"+Temp_S+" remaining";
                jLabel1.setText(time1);
                 if(h==HR && m==MN && s==SC){
                   jLabel1.setText(null);
                  // t1.suspend();
                   JOptionPane.showMessageDialog(jFrame1, "Wakeup.....Wakeup");
                    t.cancel();
                 }
            }
            if(pmR.isSelected()){
               int Temp_H = h-HR;
               int Temp_M = m-MN;
               int Temp_S = s-SC;
               String time1 = Temp_H+":"+Temp_M+":"+Temp_S+" remaining";
                jLabel1.setText(time1);
                 if(h==HR && m==MN && s==SC){
                     jLabel1.setText(null);
                    // t1.suspend();
                   JOptionPane.showMessageDialog(jFrame1, "Wakeup.....Wakeup.....");
                    t.cancel();
                 }
            }
            }
                
                  }
                  }
            
           
       }.start();
       
            
            rs.next();
             stmt.close();
            rs.close();
            
            
       }
       catch(SQLException err){
           JOptionPane.showMessageDialog(Clocky.this, err.getMessage());
       }
    }//GEN-LAST:event_bAddActionPerformed

    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showButtonActionPerformed
        Doconnect();
        DefaultListModel d = new DefaultListModel();
        jFrame4.setVisible(true);
        jPanel5.setVisible(true);
        try{
            while(rs.next()){
              int hh = rs.getInt("HH");
               int mm = rs.getInt("MM");
                int ss = rs.getInt("SS");
                 String ap = rs.getString("AM_PM");
                 String time1 = hh+":"+mm+":"+ss+" "+ap;
                // jList1.setSelectedValue(time1, true);
                d.addElement(time1);
                jList1.setModel(d);
                 //d.addElement(jList1.setSelectedValue());
            }
        }
        catch(SQLException err){
            JOptionPane.showMessageDialog(Clocky.this,err.getMessage());
        }
        
    }//GEN-LAST:event_showButtonActionPerformed

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
        Doconnect();
        try{
//            curRow = rs.getRow();
//            rs.absolute(curRow);
//        rs.deleteRow();
       
         stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
         String sql = "SELECT* FROM Clocky";
         rs = stmt.executeQuery(sql);
         DefaultListModel model = (DefaultListModel)(jList1.getModel());
         //curRow = rs.getRow();
         int selectedIndex = jList1.getMinSelectionIndex();
         rs.absolute(selectedIndex);
         rs.deleteRow();
         if(selectedIndex != -1){
            model.remove(selectedIndex);
         }
          stmt.close();
        rs.close();
        }
        catch(SQLException err){
           JOptionPane.showMessageDialog(jFrame1,err.getMessage());  
        }
    }//GEN-LAST:event_delButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Clocky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clocky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clocky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clocky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clocky().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alarmPanel;
    private javax.swing.JRadioButton amR;
    private javax.swing.JButton bAdd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton delButton;
    private javax.swing.JLabel hhLab;
    private javax.swing.JTextField hhText;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labFont;
    private javax.swing.JLabel mmLab;
    private javax.swing.JTextField mmText;
    private javax.swing.JRadioButton pmR;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton showButton;
    private javax.swing.JLabel ssLab;
    private javax.swing.JTextField ssText;
    // End of variables declaration//GEN-END:variables
}
