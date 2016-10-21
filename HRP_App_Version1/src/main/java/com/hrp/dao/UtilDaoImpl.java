package com.hrp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.hrp.model.Services;

@Repository("utilDao")
public class UtilDaoImpl extends AbstractDao implements UtilDao {

	@Override
	public List<Services> getAllActiveServices() {
		Criteria criteria = getSession().createCriteria(Services.class);
		return (List<Services>) criteria.add(Restrictions.eq("deletedYn", false)).list();
	}

}
