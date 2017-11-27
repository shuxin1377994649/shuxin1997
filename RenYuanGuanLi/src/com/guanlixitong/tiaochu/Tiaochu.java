package com.guanlixitong.tiaochu;

public class Tiaochu {
					public static String ereps(String obj,String url){
						
						String ss=" <script type='text/javascript'>"+"alert('"+obj+"');"+"location.href='"+url+"';</script> ";
						return ss;
					}
}
