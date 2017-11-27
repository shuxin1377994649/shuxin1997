package com.guanlixitong.dao;
/**
 * ÊæöÎ
 * 2017-11-27
 */
import java.util.List;

import com.guanlixitong.entity.JiBenXinXiBiao;



public interface JiBenXinXiBiaoDao {
	//Ìí¼Ó
	public int addJiBenXinXiBiao(JiBenXinXiBiao obj);
	
	//ÐÞ¸Ä
	public int updJiBenXinXiBiao(JiBenXinXiBiao obj);
	public JiBenXinXiBiao findJiBenXinXiBiao(int rybh );
	//„h³ý
	public int delJiBenXinXiBiao(int rybh);
	//²éÔƒ
	public List<JiBenXinXiBiao> findJiBenXinXiBiao();
}
