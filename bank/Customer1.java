package com.bank;
import java.io.Serializable;

public class Customer1 implements Serializable{

	String name;
	double ball;
	int acctNo;
	String []trans=new String[20];
	String trns;
	int i=0;
	
	public String getTrns() {
		return trns;
	}
	public void setTrns(String trns) {
		this.trns = trns;
		
		trans[i]=trns;
		i++;
	}
	public String[] getTrans() {
		return trans;
	}
	public void setTrans(String[] trans) {
		this.trans = trans;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBall() {
		return ball;
	}
	public void setBall(double ball) {
		this.ball = ball;
	}
	public int getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(int i) {
		this.acctNo = i;
	}
	public void setTrans(String string) {
		
		
	}
	
}
