package com.edubridge.Smart_Tv.service;

import java.util.List;

import com.edubridge.Smart_Tv.dao.SmartTvdao;
import com.edubridge.Smart_Tv.model.SmartTv;



public class SmartTvServices implements SmartTvServicesI {
	private SmartTvdao dao;
	
	public SmartTvServices() {
		dao = new SmartTvdao();
	}
	
	@Override
	public void addSmartTv(SmartTv smartTV) {
		dao.addSmartTv(smartTV);
	}

	@Override
	public List<SmartTv> getAllSmartTvs() {
		return dao.getAllSmartTv();
	}

	@Override
	public SmartTv getSmartTvById(Integer id) {
		return dao.getSmartTvById(id);
	}

	@Override
	public void updateSmartTv(SmartTv smartTv) {
		dao.updateSmartTv(smartTv);
	}

	@Override
	public void deleteSmartTv(Integer id) {
		dao.deleteSmartTv(id);
	}

	@Override
	public void deleteAllSmartTvs() {
		dao.deleteAllSmartTvs();
	}
}
