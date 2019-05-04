package com.usa.federal.gov.service;

import java.util.List;

import com.usa.federal.gov.model.SsaModel;

public interface SsaService {
	public Long saveSsaNO(SsaModel model)throws Exception;

	public List<SsaModel> findAllEntity()throws Exception;

	public List<SsaModel> findAllEntity(int pagNo, int pageSize)throws Exception;

	public List<String> states()throws Exception;
}
