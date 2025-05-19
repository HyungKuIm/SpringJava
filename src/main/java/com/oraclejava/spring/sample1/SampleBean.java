package com.oraclejava.spring.sample1;

public class SampleBean {
	
	private FirstBean firstBean;
	private SecondBean secondBean;
	
	
	public SampleBean() {
		
	}
	
	public SampleBean(FirstBean firstBean, SecondBean secondBean) {
		this.firstBean = firstBean;
		this.secondBean = secondBean;
	}
	
	
	public FirstBean getFirstBean() {
		return firstBean;
	}



	public void setFirstBean(FirstBean firstBean) {
		this.firstBean = firstBean;
	}



	public SecondBean getSecondBean() {
		return secondBean;
	}



	public void setSecondBean(SecondBean secondBean) {
		this.secondBean = secondBean;
	}



	@Override
	public String toString() {
		return "안녕하세요!";
	}
}
