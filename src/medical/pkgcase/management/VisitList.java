/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical.pkgcase.management;

import com.sun.glass.ui.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vishant
 */
class PatientVisits
{
    String id, chiefComplain, addiction, appetite, thirst, desire, aversion, stool, urine, perspiration, sleep, dreams, thermally, gynac_history, mind, temp, pulse, blood_pressure, resp_rate, others, cvs, rs, cns, pa, invg_advised, miasm, final_diagnosis, probable_remedies, link;
    PatientVisits( String i, String cc,String  addiction,String  appetite,String  thirst,String  desire,String  aversion,String  stool,String  urine,String  perspiration,String  sleep,String  dreams,String  thermally,String  gynac_history,String  mind,String  temp,String  pulse,String  blood_pressure,String  resp_rate,String  others,String  cvs,String  rs,String  cns,String  pa,String  invg_advised,String  miasm,String  final_diagnosis,String  probable_remedies, String l)
    {
        id = i;
        chiefComplain = cc;	
        this. addiction= addiction;	
        this. appetite= appetite;	
        this. thirst= thirst;	
        this. desire= desire;	
        this. aversion= aversion;	
        this. stool= stool;	
        this. urine= urine;	
        this. perspiration= perspiration;	
        this. sleep= sleep;	
        this. dreams= dreams;	
        this. thermally= thermally;	
        this. gynac_history= gynac_history;	
        this. mind= mind;	
        this. temp= temp;	
        this. pulse= pulse;	
        this. blood_pressure= blood_pressure;	
        this. resp_rate= resp_rate;	
        this. others= others;	
        this. cvs= cvs;	
        this. rs= rs;	
        this. cns= cns;	
        this. pa= pa;	
        this. invg_advised= invg_advised;	
        this. miasm= miasm;	
        this. final_diagnosis= final_diagnosis;	
        this. probable_remedies= probable_remedies;

        link = l;
        
    }
    
    public String getId()
    {
        return id;
    }
    public String getChiefComplain()
    {
        return chiefComplain;
    }

    public String getAddiction() {
        return addiction;
    }

    public String getAppetite() {
        return appetite;
    }

    public String getThirst() {
        return thirst;
    }

    public String getDesire() {
        return desire;
    }

    public String getAversion() {
        return aversion;
    }

    public String getStool() {
        return stool;
    }

    public String getUrine() {
        return urine;
    }

    public String getPerspiration() {
        return perspiration;
    }

    public String getSleep() {
        return sleep;
    }

    public String getDreams() {
        return dreams;
    }

    public String getThermally() {
        return thermally;
    }

    public String getGynac_history() {
        return gynac_history;
    }

    public String getMind() {
        return mind;
    }

    public String getTemp() {
        return temp;
    }

    public String getPulse() {
        return pulse;
    }

    public String getBlood_pressure() {
        return blood_pressure;
    }

    public String getResp_rate() {
        return resp_rate;
    }

    public String getOthers() {
        return others;
    }

    public String getCsv() {
        return cvs;
    }

    public String getRs() {
        return rs;
    }

    public String getCns() {
        return cns;
    }

    public String getPa() {
        return pa;
    }

    public String getInvg_advised() {
        return invg_advised;
    }

    public String getMiasm() {
        return miasm;
    }

    public String getFinal_diagnosis() {
        return final_diagnosis;
    }

    public String getProbable_remedies() {
        return probable_remedies;
    }
    
    public String getLink() {
        return link;
    }
}


public class VisitList extends javax.swing.JFrame {

    /**
     * Creates new form VisitList
     */
    ArrayList<PatientVisits> patientVisits = new ArrayList();
    String pat_id;

    /**
     * Creates new form VisitList
     */
    public VisitList(String id, String name, String ph) {
        initComponents();
        patientDetails.setText("ID: "+id+"\nName: "+name+"\nPast History: "+ph);
        String url = "jdbc:mysql://localhost:3306/medical_case_mgmt?autoReconnect=true&useSSL=false";
        String user = "vjtidev";
        String password = "vjti@123";
        System.out.println(id);
        pat_id = id;
        
        String query = "SELECT * from patient_visit_det where patient_id = ? order by id desc" ;

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs;

            st.setString(1,id);

            //rs = st.executeQuery("SELECT name FROM patient_det");
            
            rs = st.executeQuery();
            System.out.println("out");
            while(rs.next())
            {
                System.out.println("in");
                String visitId = rs.getString("id");
		String chiefComplain = rs.getString("chief_complaint");	
                String  addiction = rs.getString("addiction");	
                String  appetite = rs.getString("appetite");	
                String  thirst = rs.getString("thirst");	
                String  desire = rs.getString("desire");	
                String  aversion = rs.getString("aversion");	
                String  stool = rs.getString("stool");	
                String  urine = rs.getString("urine");	
                String  perspiration = rs.getString("perspiration");	
                String  sleep = rs.getString("sleep");	
                String  dreams = rs.getString("dreams");	
                String  thermally = rs.getString("thermally");
                String  gynac_history = rs.getString("gynac_history");
                String  mind = rs.getString("mind");	
                String  temp = rs.getString("temp");	
                String  pulse = rs.getString("pulse");
                String  blood_pressure = rs.getString("blood_pressure");	
                String  resp_rate = rs.getString("resp_rate");	
                String  others = rs.getString("others");	
                String  cvs = rs.getString("cvs");	
                String  rs_pat = rs.getString("rs");	
                String  cns = rs.getString("cns");	
                String  pa = rs.getString("pa");	
                String  invg_advised = rs.getString("invg_advised");	
                String  miasm = rs.getString("miasm");		
                String  final_diagnosis = rs.getString("final_diagnosis");	
                String  probable_remedies = rs.getString("probable_remedies");	
                String link = rs.getString("folder_link");
		System.out.println("id : " + id);
                PatientVisits p = new PatientVisits(visitId, chiefComplain, addiction,appetite,thirst,desire,aversion,stool,urine,perspiration,sleep,dreams,thermally,gynac_history,mind,temp,pulse,blood_pressure,resp_rate,others,cvs,rs_pat,cns,pa,invg_advised,miasm,final_diagnosis,probable_remedies,link);
                patientVisits.add(p);

            }
            System.out.println("outp");
        } catch (SQLException ex) {
            System.out.println(ex);
        } 
        
        DefaultTableModel model = new DefaultTableModel();            

        Object[] columnsName = new Object[29];
        System.out.println("outer");
        columnsName[0] = "Id"; 
        columnsName[1] = "Chief Complaint";   
        columnsName[2] = "addiction";	
        columnsName[3] = "appetite";	
        columnsName[4] = "thirst";	
        columnsName[5] = "desire";	
        columnsName[6] = "aversion";	
        columnsName[7] = "stool";	
        columnsName[8] = "urine";	
        columnsName[9] = "perspiration";	
        columnsName[10] = "sleep";	
        columnsName[11] = "dreams";	
        columnsName[12] = "thermally";	
        columnsName[13] = "gynac_history";	
        columnsName[14] = "mind";	
        columnsName[15] = "temp";	
        columnsName[16] = "pulse";	
        columnsName[17] = "blood_pressure";	
        columnsName[18] = "resp_rate";	
        columnsName[19] = "others";	
        columnsName[20] = "cvs";	
        columnsName[21] = "rs";	
        columnsName[22] = "cns";	
        columnsName[23] = "pa";	
        columnsName[24] = "invg_advised";	
        columnsName[25] = "miasm";		
        columnsName[26] = "final_diagnosis";	
        columnsName[27] = "probable_remedies"; 
        columnsName[28] = "Link";
       
        model.setColumnIdentifiers(columnsName);        

        System.out.println("outerp");
        Object[] rowData = new Object[29];        

        for(int i = 0; i < patientVisits.size(); i++)
        {            
            rowData[0] = patientVisits.get(i).getId();
            rowData[1] = patientVisits.get(i).getChiefComplain();
            rowData[2] = patientVisits.get(i).getAddiction();
            rowData[3] = patientVisits.get(i).getAppetite();	
            rowData[4] = patientVisits.get(i).getThirst();	
            rowData[5] = patientVisits.get(i).getDesire();	
            rowData[6] = patientVisits.get(i).getAversion();	
            rowData[7] = patientVisits.get(i).getStool();	
            rowData[8] = patientVisits.get(i).getUrine();	
            rowData[9] = patientVisits.get(i).getPerspiration();	
            rowData[10] = patientVisits.get(i).getSleep();	
            rowData[11] = patientVisits.get(i).getDreams();	
            rowData[12] = patientVisits.get(i).getThermally();	
            rowData[13] = patientVisits.get(i).getGynac_history();	
            rowData[14] = patientVisits.get(i).getMind();	
            rowData[15] = patientVisits.get(i).getTemp();	
            rowData[16] = patientVisits.get(i).getPulse();	
            rowData[17] = patientVisits.get(i).getBlood_pressure();	
            rowData[18] = patientVisits.get(i).getResp_rate();	
            rowData[19] = patientVisits.get(i).getOthers();	
            rowData[20] = patientVisits.get(i).getCsv();	
            rowData[21] = patientVisits.get(i).getRs();	
            rowData[22] = patientVisits.get(i).getCns();	
            rowData[23] = patientVisits.get(i).getPa();	
            rowData[24] = patientVisits.get(i).getInvg_advised();	
            rowData[25] = patientVisits.get(i).getMiasm();		
            rowData[26] = patientVisits.get(i).getFinal_diagnosis();	
            rowData[27] = patientVisits.get(i).getProbable_remedies();	

            rowData[28] = patientVisits.get(i).getLink();
            
            model.addRow(rowData);
        }

        visitTable.setModel(model);               
        System.out.println("model");
        visitTable.setShowGrid(true);
        visitTable.setAutoscrolls(true);
        setVisible(true);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        patientDetails = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        visitTable = new javax.swing.JTable();
        registerNewComplaintButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        patientDetails.setEditable(false);
        patientDetails.setColumns(20);
        patientDetails.setRows(5);
        jScrollPane1.setViewportView(patientDetails);

        visitTable.setAutoCreateRowSorter(true);
        visitTable.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        visitTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        visitTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        visitTable.setPreferredSize(new java.awt.Dimension(2500, 400));
        visitTable.setRowHeight(100);
        visitTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visitTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(visitTable);

        registerNewComplaintButton.setText("Register New Complaint");
        registerNewComplaintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerNewComplaintButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(registerNewComplaintButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(registerNewComplaintButton)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visitTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visitTableMouseClicked
        // TODO add your handling code here:
        int row = visitTable.getSelectedRow();
        int col = visitTable.getSelectedColumn();
        if(col == 29)
        {
            Object o = (Object) visitTable.getValueAt(row,col);
            String path = String.valueOf(o);
           try
           {
           Runtime.getRuntime().exec("explorer.exe /select," + path);
           }
           catch(Exception e)
           {}
            System.out.println("clicked");
            
        }
                visitTable.getColumnModel().getColumn(col).setCellRenderer(new WordWrapCellRenderer());

        
    }//GEN-LAST:event_visitTableMouseClicked

    private void registerNewComplaintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerNewComplaintButtonActionPerformed
        // TODO add your handling code here:
        VisitDialog vd = new VisitDialog(this,false,pat_id);
        //Visits v = new Visits(pat_id);
        //this.dispose();
    }//GEN-LAST:event_registerNewComplaintButtonActionPerformed

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
            java.util.logging.Logger.getLogger(VisitList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisitList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisitList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisitList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisitList("1","n","ph").setVisible(true);
                //new VisitList("1"."n","ph").setVisible(true);
            }
        });
    }
    
    static String pathtemp;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea patientDetails;
    private javax.swing.JButton registerNewComplaintButton;
    private javax.swing.JTable visitTable;
    // End of variables declaration//GEN-END:variables
}
