package com.usa.federal.gov.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usa.federal.gov.entity.SsaMaster;
import com.usa.federal.gov.entity.USAStateEntity;
import com.usa.federal.gov.model.SsaModel;
import com.usa.federal.gov.model.UsaStateModel;
import com.usa.federal.gov.repository.SsaRepository;
import com.usa.federal.gov.repository.UsaStateRepository;

@Service
public class SsaServiceImpl implements SsaService {
	@Autowired
	private SsaRepository repository;
	@Autowired
	private UsaStateRepository usaRepository;

	@Override
	public Long saveSsaNO(SsaModel model) {
		SsaMaster entity = new SsaMaster();
		// int i=10/0;
		BeanUtils.copyProperties(model, entity);
		try {
			entity.setPhoto(model.getPhoto().getBytes());
		} // try
		catch (IOException e) {
			e.printStackTrace();
		} // catch
		entity = repository.save(entity);
		return entity.getSsnNo();
	}

	@Override
	public List<SsaModel> findAllEntity() {
		List<SsaMaster> listSsa = repository.findAll();
		List<SsaModel> models = new ArrayList<SsaModel>();
		if (!listSsa.isEmpty()) {
			for (SsaMaster master : listSsa) {
				SsaModel model = new SsaModel();
				BeanUtils.copyProperties(master, model);
				models.add(model);
			} // for
		} // if
		return models;
	}// method

	@Override
	public List<SsaModel> findAllEntity(int pagNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> states() {
		List<USAStateEntity> entities = usaRepository.findAll();
		List<String> stateList = new ArrayList();
		List<UsaStateModel> models = new ArrayList<UsaStateModel>();
		if (!entities.isEmpty()) {
			for (USAStateEntity entity : entities) {
				stateList.add(entity.getStateName());
			} // for
		} // if
		return stateList;
	}// method
}// class
