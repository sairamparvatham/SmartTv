package com.edubridge.Smart_Tv.service;

import java.util.List;

import com.edubridge.Smart_Tv.model.SmartTv;

public interface SmartTvServicesI {
	void addSmartTv(SmartTv smartTv);
	List<SmartTv> getAllSmartTvs();	
	SmartTv getSmartTvById(Integer id);
	void updateSmartTv(SmartTv smartTv);
	void deleteSmartTv(Integer id);
	void deleteAllSmartTvs();
}
