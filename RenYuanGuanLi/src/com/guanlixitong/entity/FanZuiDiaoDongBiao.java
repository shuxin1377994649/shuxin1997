package com.guanlixitong.entity;
/**
 * 犯罪调动表
 * 舒鑫
 * 2017-11-27
 * @author asus
 *
 */
public class FanZuiDiaoDongBiao {
					private int rybh;//人员编码pk/fk
					private String ddsj;//调动时间pk
					private int ybmbm;//原部门编码
					private int xbmbm;//现部门编码
					public int getRybh() {
						return rybh;
					}
					public void setRybh(int rybh) {
						this.rybh = rybh;
					}
					public String getDdsj() {
						return ddsj;
					}
					public void setDdsj(String ddsj) {
						this.ddsj = ddsj;
					}
					public int getYbmbm() {
						return ybmbm;
					}
					public void setYbmbm(int ybmbm) {
						this.ybmbm = ybmbm;
					}
					public int getXbmbm() {
						return xbmbm;
					}
					public void setXbmbm(int xbmbm) {
						this.xbmbm = xbmbm;
					}
					
}
