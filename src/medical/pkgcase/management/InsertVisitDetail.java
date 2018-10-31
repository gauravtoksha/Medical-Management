/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical.pkgcase.management;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Vishant
 */
public class InsertVisitDetail 
{

    public InsertVisitDetail(String i, String cc, String  addiction,String  appetite,String  thirst,String  desire,String  aversion,String  stool,String  urine,String  perspiration,String  sleep,String  dreams,String  thermally,String  gynac_history,String  mind,String  temp,String  pulse,String  blood_pressure,String  resp_rate,String  others,String  cvs,String  rs,String  cns,String  pa,String  invg_advised,String  miasm,String  final_diagnosis,String  probable_remedies) {
        String url = "jdbc:mysql://localhost:3306/medical_case_mgmt?autoReconnect=true&useSSL=false";
        String user = "vjtidev";
        String password = "vjti@123";
        
        String query = "INSERT INTO patient_visit_det (patient_id, chief_complaint,  addiction, appetite, thirst, desire, aversion, stool, urine, perspiration, sleep, dreams, thermally, gynac_history, mind, temp, pulse, blood_pressure, resp_rate, others, cvs, rs, cns, pa, invg_advised, miasm, final_diagnosis, probable_remedies ) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)" ;

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement st = con.prepareStatement(query);                      

            //rs = st.executeQuery("SELECT name FROM patient_det");
            
            st.setString(1,i);	
            st.setString(2,cc);
            st.setString(3,addiction);	
            st.setString(4,appetite);	
            st.setString(5,thirst);	
            st.setString(6,desire);	
            st.setString(7,aversion);	
            st.setString(8,stool);	
            st.setString(9,urine);	
            st.setString(10,perspiration);	
            st.setString(11,sleep);	            
            st.setString(12,dreams);	            
            st.setString(13,thermally);	
            st.setString(14,gynac_history);
            st.setString(15,mind);	                       
            st.setString(16,temp);	
            st.setString(17,pulse);	
            st.setString(18,blood_pressure);	
            st.setString(19,resp_rate);
            st.setString(20,others);	
            st.setString(21,cvs);	            
            st.setString(22,rs);	
            st.setString(23,cns);	
            st.setString(24,pa);	
            st.setString(25,invg_advised);	
            st.setString(26,miasm);		
            st.setString(27,final_diagnosis);	
            st.setString(28,probable_remedies);
            
            st.executeUpdate();
            System.out.println("Data inserted!");            

            System.out.println(i);            
            query = new String("select id from patient_visit_det where patient_id = ? order by id desc LIMIT 1");
            st = con.prepareStatement(query);
                        st.setString(1, i);

            System.out.println("qwer");
            ResultSet rset = st.executeQuery();
            String visit_id = new String();            
            while(rset.next())
            {
                System.out.println(rset.getString("id")); 
                visit_id = rset.getString("id");
            }
            System.out.println("asdd");
            
            String patientID = i;
            String visitID = visit_id;
            patientID=patientID.replaceAll(":", "");
            patientID=patientID.replaceAll("-", "");
            visitID=visitID.replaceAll(":", "");
            visitID=visitID.replaceAll("-", "");
            File theDir = new File("Diagnosis Storage Folder/"+File.separator+patientID+File.separator+visitID);
            String path = theDir.getAbsolutePath();

            System.out.println(path.length());

            query = new String("update patient_visit_det set folder_link = ? where id = ? and patient_id = ?");
            st = con.prepareCall(query);
            st.setString(1, path);
            st.setString(2, visit_id);
            st.setString(3, i);
            st.executeUpdate();
            System.out.println("Updated!");
            
            
            SaveImages save = new SaveImages(i,visit_id);
            
            System.out.println("sjhsads");
        } catch (SQLException ex) {
            System.out.println(ex);
        } 
    }
    
    
}
