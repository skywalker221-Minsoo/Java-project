package com.mega.mvc40;

public class ComputerVO {
	String comi;
	String comp;
	String moui;
	String moup;
	public String getComi() {
		return comi;
	}
	public void setComi(String comi) {
		this.comi = comi;
	}
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public String getMoui() {
		return moui;
	}
	public void setMoui(String moui) {
		this.moui = moui;
	}
	public String getMoup() {
		return moup;
	}
	public void setMoup(String moup) {
		this.moup = moup;
	}
	@Override
	public String toString() {
		return "ComputerVO [comi=" + comi + ", comp=" + comp + ", moui=" + moui + ", moup=" + moup + "]";
	}
}
