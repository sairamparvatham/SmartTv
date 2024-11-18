package com.edubridge.Smart_Tv.dao;

import java.util.List;

import com.edubridge.Smart_Tv.model.SmartTv;

public interface SmartTvDaoI {
	void addSmartTv(SmartTv smartTv);
	List<SmartTv> getAllSmartTv();	
	SmartTv getSmartTvById(Integer id);
	void updateSmartTv(SmartTv smartTv);
	void deleteSmartTv(Integer id);
	void deleteAllSmartTvs();
}
