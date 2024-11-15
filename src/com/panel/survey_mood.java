package com.panel;

import com.button.buttonGroupJawaban;
import koneksi.konek;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class survey_mood extends javax.swing.JPanel {

   public survey_mood(int userId) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        surveyForm1 = new com.button.buttonGroupJawaban();
        jLabel10 = new javax.swing.JLabel();
        surveyForm4 = new com.button.buttonGroupJawaban();
        jLabel11 = new javax.swing.JLabel();
        surveyForm2 = new com.button.buttonGroupJawaban();
        jLabel12 = new javax.swing.JLabel();
        surveyForm3 = new com.button.buttonGroupJawaban();
        btn_kirim = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(surveyForm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jLabel10.setText("Seberapa produktif Anda merasa hari ini?");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));
        add(surveyForm4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel11.setText("Bagaimana tingkat energi Anda sepanjang hari ini?");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));
        add(surveyForm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        jLabel12.setText("Seberapa tenang atau santai Anda merasa hari ini?");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));
        add(surveyForm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        btn_kirim.setText("kirim");
        btn_kirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kirimActionPerformed(evt);
            }
        });
        add(btn_kirim, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, -1, -1));

        jLabel13.setText("Bagaimana perasaan Anda secara umum hari ini?");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel2.setText("Survey Mood");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kirimActionPerformed

    }//GEN-LAST:event_btn_kirimActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_kirim;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private com.button.buttonGroupJawaban surveyForm1;
    private com.button.buttonGroupJawaban surveyForm2;
    private com.button.buttonGroupJawaban surveyForm3;
    private com.button.buttonGroupJawaban surveyForm4;
    // End of variables declaration//GEN-END:variables
}
