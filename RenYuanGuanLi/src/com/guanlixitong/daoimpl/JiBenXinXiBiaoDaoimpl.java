package com.guanlixitong.daoimpl;
/**
 * ÊæöÎ
 * 2017-11-27
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.guanlixitong.dao.BaseDao;
import com.guanlixitong.dao.JiBenXinXiBiaoDao;
import com.guanlixitong.entity.JiBenXinXiBiao;

public class JiBenXinXiBiaoDaoimpl extends BaseDao implements JiBenXinXiBiaoDao {
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	List<JiBenXinXiBiao> list=new ArrayList<JiBenXinXiBiao>();
	//Ìí¼Ó
	public int addJiBenXinXiBiao(JiBenXinXiBiao obj) {
		
		return 0;
	}
	//ÐÞ¸Ä
	public int updJiBenXinXiBiao(JiBenXinXiBiao obj) {
		
		return 0;
	}
	
	public JiBenXinXiBiao findJiBenXinXiBiao(int rybh) {
		// TODO Auto-generated method stub
		return null;
	}
	//É¾³ý
	public int delJiBenXinXiBiao(int rybh) {
		// TODO Auto-generated method stub
		return 0;
	}
	//²éÑ¯
	public List<JiBenXinXiBiao> findJiBenXinXiBiao() {
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
