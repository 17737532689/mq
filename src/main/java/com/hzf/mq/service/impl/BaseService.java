package com.hzf.mq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BaseService {
	@Autowired
	private DaoFactoy daoFactory;
	public DaoFactoy getDaoFactory() {
		return daoFactory;
	}

	public void setDaoFactory(DaoFactoy daoFactory) {
		this.daoFactory = daoFactory;
	}
}
