package com.sh.taotao.rest.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.sh.taotao.common.utils.JsonUtils;
import com.sh.taotao.mapper.TbContentMapper;
import com.sh.taotao.pojo.TbContent;
import com.sh.taotao.pojo.TbContentExample;
import com.sh.taotao.pojo.TbContentExample.Criteria;
import com.sh.taotao.rest.service.ContentService;

/**
 * 内容管理
 */
@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	private TbContentMapper contentMapper;
	@Override
	public List<TbContent> getContentList(long contentCid) {
		//根据内容分类id查询内容列表
		TbContentExample example = new TbContentExample();
		Criteria criteria = example.createCriteria();
		criteria.andCategoryIdEqualTo(contentCid);
		//执行查询
		List<TbContent> list = contentMapper.selectByExample(example);
		return list;
	}

}
