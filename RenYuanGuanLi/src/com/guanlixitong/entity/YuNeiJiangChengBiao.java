package com.guanlixitong.entity;
/**
 * 狱内奖惩表
 * 舒鑫
 * 2017-11-27
 * @author asus
 *
 */
public class YuNeiJiangChengBiao {
							private int rybh;//人员编码FK/PK
							private String jlsj;//记录时间
							private String jcbz;//奖惩标志
							private String jclx;//奖惩类型
							private String qkgs;//情况概述
							public int getRybh() {
								return rybh;
							}
							public void setRybh(int rybh) {
								this.rybh = rybh;
							}
							public String getJlsj() {
								return jlsj;
							}
							public void setJlsj(String jlsj) {
								this.jlsj = jlsj;
							}
							public String getJcbz() {
								return jcbz;
							}
							public void setJcbz(String jcbz) {
								this.jcbz = jcbz;
							}
							public String getJclx() {
								return jclx;
							}
							public void setJclx(String jclx) {
								this.jclx = jclx;
							}
							public String getQkgs() {
								return qkgs;
							}
							public void setQkgs(String qkgs) {
								this.qkgs = qkgs;
							}
							
}
