
package edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ProfessorHomework extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public ProfessorHomework() {
        initComponents();
        welcomeuser();
        selectcourse();
    }

    
    
    void welcomeuser(){
        String id = Signin.id.getText();
        
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/eductivedb","root","");
            pst=con.prepareStatement("select name, surname from professor where id = ?");
            pst.setString(1, id);
            rs=pst.executeQuery();
            
            if(rs.next()){
                name.setText(rs.getString("name"));     
                surname.setText(rs.getString("surname"));  
                
            }
            
                    
                    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProfessorHomework.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorHomework.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
    }
    
     void selectcourse(){
        String id = Signin.id.getText();
        
        selprof.addItem(id);
        
        String user = (String) selprof.getSelectedItem();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/eductivedb","root","");
            pst=con.prepareStatement("select title from course where professor_user = ?");
            pst.setString(1, user);
            rs=pst.executeQuery();
            
            while(rs.next()){
               
                selcourse.addItem(rs.getString("title"));
            }
            
                    
                    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProfessorHomework.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorHomework.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        ManagerPage = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        surname = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        ManagerPage1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        profaccount = new javax.swing.JButton();
        hometitle = new javax.swing.JTextField();
        welcome1 = new javax.swing.JLabel();
        welcome2 = new javax.swing.JLabel();
        welcome3 = new javax.swing.JLabel();
        welcome4 = new javax.swing.JLabel();
        selcourse = new javax.swing.JComboBox<>();
        selprof = new javax.swing.JComboBox<>();
        homedate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 166, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        logo.setText("EDUCTIVE");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, -1));

        exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/icons8_exit_30px_1.png"))); // NOI18N
        exit.setText("Exit");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 60, -1));

        ManagerPage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ManagerPage.setText("Professor Page");
        jPanel1.add(ManagerPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, -1));

        logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/icons8_back_to_30px.png"))); // NOI18N
        logout.setText("Back");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 90, -1));

        welcome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        welcome.setText("Welcome");
        jPanel1.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 70, 20));

        surname.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        surname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 150, 20));

        name.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 150, 20));

        ManagerPage1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ManagerPage1.setForeground(new java.awt.Color(255, 255, 255));
        ManagerPage1.setText(" Test");
        jPanel1.add(ManagerPage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 660));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Wide Latin", 0, 50)); // NOI18N
        jLabel2.setText("EDUCTIVE");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 550, 43));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 522, 10));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setText("School Managment Application");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 270, 30));

        profaccount.setBackground(new java.awt.Color(33, 166, 230));
        profaccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profaccount.setForeground(new java.awt.Color(255, 255, 255));
        profaccount.setText("Upload Test");
        profaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profaccountActionPerformed(evt);
            }
        });
        jPanel2.add(profaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 180, 50));

        hometitle.setBackground(new java.awt.Color(33, 166, 230));
        hometitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(hometitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 300, 30));

        welcome1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        welcome1.setText("Select Professor");
        jPanel2.add(welcome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 110, 20));

        welcome2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        welcome2.setText("Select Course");
        jPanel2.add(welcome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 90, 20));

        welcome3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        welcome3.setText("Homework Title");
        jPanel2.add(welcome3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 120, 20));

        welcome4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        welcome4.setText("Homework Date");
        jPanel2.add(welcome4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 110, 20));

        selcourse.setBackground(new java.awt.Color(33, 166, 230));
        selcourse.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(selcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 300, 30));

        selprof.setBackground(new java.awt.Color(33, 166, 230));
        selprof.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(selprof, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 300, 30));

        homedate.setBackground(new java.awt.Color(33, 166, 230));
        jPanel2.add(homedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 300, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 800, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
       
        Professor b = new Professor();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void profaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profaccountActionPerformed
       
        String user = (String) selprof.getSelectedItem();
        String course = (String) selcourse.getSelectedItem();
        String title = hometitle.getText();
        
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
          String home_date = sdf.format(homedate.getDate());
         
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/eductivedb","root","");
            pst=con.prepareStatement("insert into homework (home_professor,home_course,home_title,home_date) values (?,?,?,?)");
            pst.setString(1, user);
            pst.setString(2, course );
            pst.setString(3, title);
            pst.setString(4, home_date);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Homework uploaded successfully!");
            
            
             Professor b = new Professor();
             b.setVisible(true);
             this.dispose();
            
            
                    
                    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProfessorHomework.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorHomework.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
    
    }//GEN-LAST:event_profaccountActionPerformed

        
        
         
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
            java.util.logging.Logger.getLogger(ProfessorHomework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfessorHomework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfessorHomework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfessorHomework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfessorHomework().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ManagerPage;
    private javax.swing.JLabel ManagerPage1;
    private javax.swing.JLabel exit;
    private com.toedter.calendar.JDateChooser homedate;
    private javax.swing.JTextField hometitle;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel name;
    private javax.swing.JButton profaccount;
    private javax.swing.JComboBox<String> selcourse;
    private javax.swing.JComboBox<String> selprof;
    private javax.swing.JLabel surname;
    private javax.swing.JLabel welcome;
    private javax.swing.JLabel welcome1;
    private javax.swing.JLabel welcome2;
    private javax.swing.JLabel welcome3;
    private javax.swing.JLabel welcome4;
    // End of variables declaration//GEN-END:variables
}
