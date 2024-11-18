package com.edubridge.Smart_Tv.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SmartTv {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String TvName;
	private String DisplaySize;
	private String DisplayResolution;
	private String DisplayTechnology;
	private String ConnectivityOptions;
	private String AudioQuality;
	private String Warranty;
	private String RefreshRate;
	private Integer price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTvName() {
		return TvName;
	}
	public void setTvName(String tvName) {
		TvName = tvName;
	}
	public String getDisplaySize() {
		return DisplaySize;
	}
	public void setDisplaySize(String displaySize) {
		DisplaySize = displaySize;
	}
	public String getDisplayResolution() {
		return DisplayResolution;
	}
	public void setDisplayResolution(String displayResolution) {
		DisplayResolution = displayResolution;
	}
	public String getDisplayTechnology() {
		return DisplayTechnology;
	}
	public void setDisplayTechnology(String displayTechnology) {
		DisplayTechnology = displayTechnology;
	}
	public String getConnectivityOptions() {
		return ConnectivityOptions;
	}
	public void setConnectivityOptions(String connectivityOptions) {
		ConnectivityOptions = connectivityOptions;
	}
	public String getAudioQuality() {
		return AudioQuality;
	}
	public void setAudioQuality(String audioQuality) {
		AudioQuality = audioQuality;
	}
	public String getWarranty() {
		return Warranty;
	}
	public void setWarranty(String warranty) {
		Warranty = warranty;
	}
	public String getRefreshRate() {
		return RefreshRate;
	}
	public void setRefreshRate(String refreshRate) {
		RefreshRate = refreshRate;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "SmartTv [id=" + id + ", TvName=" + TvName + ", DisplaySize=" + DisplaySize + ", DisplayResolution="
				+ DisplayResolution + ", DisplayTechnology=" + DisplayTechnology + ", ConnectivityOptions="
				+ ConnectivityOptions + ", AudioQuality=" + AudioQuality + ", Warranty=" + Warranty + ", RefreshRate="
				+ RefreshRate + ", price=" + price + "]";
	}
	
	
	
}
