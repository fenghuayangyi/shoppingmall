package com.sh.taotao.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sh.taotao.common.utils.JsonUtils;
import com.sh.taotao.rest.pojo.CatResult;
import com.sh.taotao.rest.service.ItemCatService;

/**
 * 商品分类列表
 */
@Controller
public class ItemCatController {
	
	@Autowired
	private ItemCatService itemCatService;
	//produces=MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8"   解决乱码问题
	/*@RequestMapping(value="/itemcat/list", 
			produces=MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
	@ResponseBody
	public String getItemCatList(String callback) {
		CatResult catResult = itemCatService.getItemCatList();
		//把pojo转换成字符串
		String json = JsonUtils.objectToJson(catResult);
		//拼装返回值
		String result = callback + "(" + json + ");";
		return result;
	}*/
	@RequestMapping("/itemcat/list")
	@ResponseBody
	public Object getItemCatList(String callback) {
		CatResult catResult = itemCatService.getItemCatList();
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(catResult);
		mappingJacksonValue.setJsonpFunction(callback);
		return mappingJacksonValue;
	}
}
