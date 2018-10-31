/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical.pkgcase.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Vishant
 */
public class InsertPatientDetails 
{

    public InsertPatientDetails(String name,String address,String  dob,String  blood,String  email,String  phone,String  pastMedical,String  occupation,String  marital,String gender) {
        String url = "jdbc:mysql://localhost:3306/medical_case_mgmt?autoReconnect=true&useSSL=false";
        String user = "vjtidev";
        String password = "vjti@123";
        
        String query = "insert into patient_det (name,dob,gender,phone_num,address,marital_status,occupation,email_id,blood_group,past_med_history) values(?,?,?,?,?,?,?,?,?,?)" ;

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement st = con.prepareStatement(query);

            
            st.setString(1, name);
            st.setString(2, dob);
            st.setString(3, gender);
            st.setString(4, phone);
            st.setString(5, address);
            st.setString(6, marital);
            st.setString(7, occupation);
            st.setString(8, email);
            st.setString(9, blood);
            st.setString(10, pastMedical);

            //rs = st.executeQuery("SELECT name FROM patient_det");
            
            st.executeUpdate();
            System.out.println("Data inserted!");
            
            query = new String("select id from patient_det order by id desc LIMIT 1");
            
            st = con.prepareStatement(query);
            
            ResultSet rs = st.executeQuery();
            String pat_id = new String();
            while(rs.next())
            {
                System.out.println(rs.getString("id")); 
                pat_id = rs.getString("id");
            }
            Visits visit = new Visits(pat_id);
            
        } catch (SQLException ex) {
            System.out.println(ex);
        } 
    
    }
    
    
        
}
