package com.guanlixitong.dao;
/**
 * ����
 * 2017-11-27
 */
import java.util.List;

import com.guanlixitong.entity.JiBenXinXiBiao;



public interface JiBenXinXiBiaoDao {
	//���
	public int addJiBenXinXiBiao(JiBenXinXiBiao obj);
	
	//�޸�
	public int updJiBenXinXiBiao(JiBenXinXiBiao obj);
	public JiBenXinXiBiao findJiBenXinXiBiao(int rybh );
	//�h��
	public int delJiBenXinXiBiao(int rybh);
	//��ԃ
	public List<JiBenXinXiBiao> findJiBenXinXiBiao();
}
