package com.it.app.generator;


import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class AppGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix = "AR0";
		String suffix = "";
		
		try {
			Connection con = session.connection();
			Statement st = con.createStatement();
			
			String sql = "SELECT APP_ID_SEQ.NEXTVAL FROM DUAL";
			
			ResultSet rs = st.executeQuery(sql);
			
			if(rs.next()) {
				
				int seqval = rs.getInt(1);
				
				suffix = String.valueOf(seqval);
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
			return prefix + suffix;	
				
		
	}

}
