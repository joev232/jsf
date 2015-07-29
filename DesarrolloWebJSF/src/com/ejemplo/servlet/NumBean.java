package com.ejemplo.servlet;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class NumBean {

	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public void  mostar(){
		
		System.out.println(this.num);
		//return vista2;
		
	}

}
