/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ORM.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jermaine
 */
public class StudentGUI extends javax.swing.JFrame {

    /**
     * Creates new form StudentGUI
     */
    public StudentGUI() {
        initComponents();
        clearBtn.setVisible(false);
        studentIdTxt.setVisible(false);
        jLabel10.setVisible(false);
        okBtn.setVisible(false);
        updateBtn.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        fnTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lnTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        dobTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addrlTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        postcodeTxt = new javax.swing.JTextField();
        targetgTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        classTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        mwTxt = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        okBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        studentIdTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createBtn.setText("Create Student");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("E-mail ");

        jLabel4.setText("Date Of Birth");

        jLabel5.setText("Address line 1");

        jLabel6.setText("Post Code");

        jLabel8.setText("Target Grade");

        postcodeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postcodeTxtActionPerformed(evt);
            }
        });

        jLabel7.setText("Class ID");

        jLabel9.setText("Marked Work ID");

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        jLabel10.setText("Student ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(okBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createBtn))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lnTxt))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTxt)
                            .addComponent(dobTxt))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentIdTxt))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mwTxt))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addrlTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(22, 22, 22)
                        .addComponent(postcodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(targetgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(29, 29, 29)
                        .addComponent(classTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(addrlTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(postcodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(targetgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(classTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(mwTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(studentIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createBtn)
                    .addComponent(clearBtn)
                    .addComponent(updateBtn)
                    .addComponent(okBtn)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        fnTxt.setText("");
        lnTxt.setText("");
        addrlTxt.setText("");
        emailTxt.setText("");
        postcodeTxt.setText("");
        dobTxt.setText("");
        targetgTxt.setText("");
        classTxt.setText("");
        mwTxt.setText("");
        clearBtn.setVisible(false);
        okBtn.setVisible(false);
        studentIdTxt.setVisible(false);
        jLabel10.setVisible(false);
    }//GEN-LAST:event_clearBtnActionPerformed

    private void postcodeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postcodeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postcodeTxtActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        clearBtn.setVisible(true);
        updateBtn.setVisible(true);
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("StudentRecordManagementSystemPU");

        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        Students st1 = new Students();
        st1.setStudentId();
        st1.setFirstName(fnTxt.getText().trim());
        st1.setLastName(lnTxt.getText().trim());
        st1.setAddressLine1(addrlTxt.getText().trim());
        st1.setEmailAddress(emailTxt.getText().trim());
        st1.setPostCode(postcodeTxt.getText().trim());
        String s = dobTxt.getText().trim();
        String[] ss = s.split("/");
        int day = Integer.parseInt(ss[0]);
        int month = Integer.parseInt(ss[1]);
        int year = Integer.parseInt(ss[2]);
        st1.setDob(day, month, year);
        if (!classTxt.equals("")) {
            Classes cl = entitymanager.find(Classes.class, classTxt.getText().trim());
            st1.setClassId(cl);
            //st1.setClassId2();
        }

        st1.setTargetGrade(targetgTxt.getText().trim());

        if (!mwTxt.equals("")) {
            Markedworks mw = entitymanager.find(Markedworks.class, mwTxt.getText().trim());
            st1.setMarkedWorkId(mw);
        }

        entitymanager.persist(st1);
        entitymanager.getTransaction().commit();

        entitymanager.close();
        emfactory.close();
        // TODO add your handling code here:
    }//GEN-LAST:event_createBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        clearBtn.setVisible(true);
        studentIdTxt.setVisible(true);
        jLabel10.setVisible(true);
        okBtn.setVisible(true);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        // TODO add your handling code here:
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("StudentRecordManagementSystemPU");

        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

        Students s1 = entitymanager.find(Students.class, studentIdTxt.getText().trim());

        if (!fnTxt.getText().equals("")) {
            s1.setFirstName(fnTxt.getText().trim());
        }
        if (!lnTxt.getText().equals("")) {
            s1.setLastName(lnTxt.getText().trim());
        }
        if (!emailTxt.getText().equals("")) {
            s1.setEmailAddress(emailTxt.getText().trim());
        }
        if (!postcodeTxt.getText().equals("")) {
            s1.setPostCode(postcodeTxt.getText().trim());
        }
        if (!addrlTxt.getText().equals("")) {
            s1.setAddressLine1(addrlTxt.getText().trim());
        }
        if (!targetgTxt.getText().equals("")) {
            s1.setTargetGrade(targetgTxt.getText().trim());
        }
        if (!classTxt.getText().equals("")) {
            Classes cl = entitymanager.find(Classes.class, classTxt.getText().trim());
            s1.setClassId(cl);
        }
        if (!mwTxt.getText().equals("")) {
            Markedworks mw = entitymanager.find(Markedworks.class, mwTxt.getText().trim());
            s1.setMarkedWorkId(mw);
        }
        if (!dobTxt.getText().equals("")) {
            String s = dobTxt.getText().trim();
            String[] ss = s.split("/");
            int day = Integer.parseInt(ss[0]);
            int month = Integer.parseInt(ss[1]);
            int year = Integer.parseInt(ss[2]);
            s1.setDob(day, month, year);
        }
        entitymanager.persist(s1);
        entitymanager.getTransaction().commit();

        entitymanager.close();
        emfactory.close();

    }//GEN-LAST:event_okBtnActionPerformed

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
            java.util.logging.Logger.getLogger(StudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentGUI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addrlTxt;
    private javax.swing.JTextField classTxt;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField dobTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField fnTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lnTxt;
    private javax.swing.JTextField mwTxt;
    private javax.swing.JButton okBtn;
    private javax.swing.JTextField postcodeTxt;
    private javax.swing.JTextField studentIdTxt;
    private javax.swing.JTextField targetgTxt;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
