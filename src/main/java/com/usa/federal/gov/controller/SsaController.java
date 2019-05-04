package com.usa.federal.gov.controller;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.usa.federal.gov.constant.AppConstant;
import com.usa.federal.gov.exception.HandleException;
import com.usa.federal.gov.model.SsaModel;
import com.usa.federal.gov.properties.AppProperties;
import com.usa.federal.gov.service.SsaService;

@Controller
public class SsaController {
	@Autowired
	private SsaService service;
	@Autowired
	private AppProperties props;

	/*
	 * This method will display the form page.
	 */
	@RequestMapping(value = { "/", "/form" }, method = RequestMethod.GET)
	public String displayForm(Model model) {
		SsaModel ssaModel = new SsaModel();
		model.addAttribute("ssaModel", ssaModel);
		formValue(model);
		return "form";
	}// method

	/*
	 * this method save data in data base and send suceess or failure message
	 */
	@RequestMapping(value = { "/enrollSsn" }, method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("ssaModel") SsaModel sModel, Model model) {
		try {
			Map<String, String> map = props.getSsaprops();
			// use service method
			Long ssnNo = service.saveSsaNO(sModel);
			System.out.println("ssnNo::" + ssnNo);
			if (ssnNo > 0 && ssnNo != null) {
				model.addAttribute(AppConstant.SUCCESS, map.get(AppConstant.SSASUCCESS));
			} // if
			else {
				model.addAttribute(AppConstant.FAILURE, map.get(AppConstant.SSAFAILURE));
			} // else
			formValue(model);
		} // try
		catch (Exception e) {
			throw new HandleException(e.getMessage());
		} // catch
		return "form";
	}// submit form

	/*
	 * in this method display person details who had register already
	 */
	@RequestMapping(value = { "/displayAll" }, method = RequestMethod.GET)
	public String findAllSsn(Model model) {
		// use service method
		List<SsaModel> models = null;
		String str=null;
		try {
			str.length();
			models = service.findAllEntity();
		} catch (Exception e) {
			throw new NullPointerException();	}
		model.addAttribute("models", models);
		return "displayData";
	}// findAll ssn method

	/*
	 * use this method and all states of usa in the collection and add them
	 * modelattribute
	 */
	public void formValue(Model model) {
		List<String> genderList = new ArrayList();
		genderList.add("male");
		genderList.add("female");
		model.addAttribute("genderList", genderList);
		List<String> stateList = null;
		try {
			stateList = service.states();
		} catch (Exception e) {
		   throw new NullPointerException();
		}
		model.addAttribute("stateList", stateList);
	}// formValue Method

	/*
	 * @ExceptionHandler(value= {RuntimeException.class}) public String
	 * handleException(Model model) { //add attribute to model model.addAttribute(
	 * "ExceptionDetail","internal problem . Try after sometime....!"); return
	 * "exception"; }//handleException
	 */ 
@ExceptionHandler({NullPointerException.class,FileNotFoundException.class,Exception.class})
public String throwException(Model model) {
	model.addAttribute("errMsg", "some error occured please try again");
	return "errors";
}
}