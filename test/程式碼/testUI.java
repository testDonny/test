package test;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
import java.util.Date;

public class testUI extends javax.swing.JFrame {
//String url="jdbc:mysql//localhost:3306/data";
//String user="root";
//String password="1234";
//String sqlInsert="INSERT INTO * FROM CARD";

    management m;

    public testUI() {
        initComponents();
        
        m = new management(m.getUR(),
                m.getSSR(), m.getSR(), m.getR(), m.getN());
        t1.setText(String.valueOf(m.getDiamond()));
        String UR = String.valueOf(m.getUR());
        String SSR = String.valueOf(m.getSSR());
        String SR = String.valueOf(m.getSR());
        String R = String.valueOf(m.getR());
        String N = String.valueOf(m.getN());

        s1.setText(m.test2(m.getUR(), m.getSSR(), m.getSR(), m.getR(), m.getN()));
        s2.setText(m.test1(m.getMyCrad()[0], m.getMyCrad()[1],
                m.getMyCrad()[2], m.getMyCrad()[3], m.getMyCrad()[4]));
        Date da = new Date();
        t2.setText(da.toString());
        t4.setText(String.valueOf(m.getConsumption()));
        

//        
//    try {
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection conn=DriverManager.getConnection(url, user,password);
//        PreparedStatement ps = conn.prepareStatement(sqlInsert);
//
//    } catch (ClassNotFoundException ex) {
//        System.out.println("找不到Driver");
//    } catch (SQLException ex) {
//        System.out.println("登入失敗");
//    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        s1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        b1 = new javax.swing.JRadioButton();
        b2 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        s2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        t3 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        s1.setColumns(12);
        s1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        s1.setRows(5);
        s1.setTabSize(7);
        jScrollPane1.setViewportView(s1);

        jLabel1.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        jLabel1.setText("你擁有的鑽石");

        jLabel2.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        jLabel2.setText("現在時間");

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("新細明體", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 0));
        jButton1.setText("抽卡");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(b1);
        b1.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        b1.setText("抽一次");

        buttonGroup1.add(b2);
        b2.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        b2.setText("抽十次");

        s2.setColumns(10);
        s2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        s2.setRows(5);
        s2.setTabSize(7);
        jScrollPane2.setViewportView(s2);

        jLabel3.setFont(new java.awt.Font("新細明體", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 255));
        jLabel3.setText("目前擁有的卡片");

        jLabel4.setFont(new java.awt.Font("新細明體", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("卡池裡剩餘卡片");

        jTextArea3.setColumns(13);
        jTextArea3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("抽中ＵＲ卡機率１％\n抽中ＳＳＲ卡機率５％\n抽中ＳＲ卡機率１０％\n抽中Ｒ卡機率２４％\n抽中Ｎ卡機率６０％");
        jScrollPane3.setViewportView(jTextArea3);

        t3.setColumns(12);
        t3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        t3.setRows(5);
        t3.setTabSize(7);
        jScrollPane4.setViewportView(t3);

        jLabel5.setFont(new java.awt.Font("新細明體", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 102));
        jLabel5.setText("抽到的卡片");

        jLabel6.setText("80鑽石");

        jLabel7.setText("680鑽石");

        jButton2.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        jButton2.setText("儲值");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 153));
        jButton3.setText("手動刷新卡池");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 102));
        jLabel8.setText("累積消費");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(t4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b1)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b2)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(t2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2))
                                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                    .addComponent(t4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String number0 = String.valueOf(m.getMyCrad()[0]);
        String number1 = String.valueOf(m.getMyCrad()[1]);
        String number2 = String.valueOf(m.getMyCrad()[2]);
        String number3 = String.valueOf(m.getMyCrad()[3]);
        String number4 = String.valueOf(m.getMyCrad()[4]);
        String UR = String.valueOf(m.getUR());
        String SSR = String.valueOf(m.getSSR());
        String SR = String.valueOf(m.getSR());
        String R = String.valueOf(m.getR());
        String N = String.valueOf(m.getN());
        if (b1.isSelected()) {
            if(m.getUR()+m.getSSR()+m.getSR()+m.getR()+m.getN()==0)
                t3.setText("卡池卡片為0請更新");
            else if (m.getDiamond() < m.getDraw_once()) {
                t3.setText("你的鑽石不夠");
            } else {
                t3.setText(m.test(m.getOne()));
                s2.setText(m.test1(m.getMyCrad()[0], m.getMyCrad()[1], m.getMyCrad()[2], m.getMyCrad()[3], m.getMyCrad()[4]));
                s1.setText(m.test2(m.getUR(), m.getSSR(), m.getSR(), m.getR(), m.getN()));
                m.setDiamond(-m.getDraw_once());
                m.setConsumption(+m.getDraw_once());
                t1.setText(String.valueOf(m.getDiamond()));
                t4.setText(String.valueOf(m.getConsumption()));
            }

        } else if (b2.isSelected()) {
            if(m.getUR()+m.getSSR()+m.getSR()+m.getR()+m.getN()<10)
                t3.setText("卡池卡片不足請更新");
             if(m.getUR()+m.getSSR()+m.getSR()+m.getR()+m.getN()==0)
                t3.setText("卡池卡片為0請更新");
            else if (m.getDiamond() < m.getDraw_ten()) {
                t3.setText("你的鑽石不夠");
            } else {
                m.setDiamond(-m.getDraw_ten());
                t3.setText("");
                for (int x = 0; x < m.getTen().length; x++) {
                    m.getTen()[x] = m.getRandom();
                    t3.append(m.test(m.getTen()[x]));
                    s2.setText(m.test1(m.getMyCrad()[0], m.getMyCrad()[1], m.getMyCrad()[2], m.getMyCrad()[3], m.getMyCrad()[4]));
                    s1.setText(m.test2(m.getUR(), m.getSSR(), m.getSR(), m.getR(), m.getN()));
                }
                t1.setText(String.valueOf(m.getDiamond()));
                m.setConsumption(+m.getDraw_ten());
                t4.setText(String.valueOf(m.getConsumption()));
            }
        } else {

            t3.setText("請選擇你的抽卡方式");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        diamond d = new diamond();
        d.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        m.setUR(1);
        m.setSSR(5);
        m.setSR(20);
        m.setR(80);
        m.setN(94);
        s1.setText(m.test2(m.getUR(), m.getSSR(), m.getSR(), m.getR(), m.getN()));
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton b1;
    private javax.swing.JRadioButton b2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea s1;
    private javax.swing.JTextArea s2;
    private javax.swing.JLabel t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextArea t3;
    private javax.swing.JLabel t4;
    // End of variables declaration//GEN-END:variables
}
