package com.hrp.dao;

import java.util.List;

import com.hrp.model.Services;

public interface UtilDao extends Dao{

	List<Services> getAllActiveServices();
}
