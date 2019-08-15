package com.sh.taotao.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sh.taotao.mapper.TbItemMapper;
import com.sh.taotao.pojo.TbItem;
import com.sh.taotao.pojo.TbItemExample;
import com.sh.taotao.pojo.TbItemExample.Criteria;
import com.sh.taotao.service.ItemService;

/***
 * 商品管理 service
 * @author Administrator
 * @date 2019/08/15
 */
@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private TbItemMapper itemMapper;
	@Override
	public TbItem getItemById(long itemId) {
		// TbItem item = itemMapper.selectByPrimaryKey(itemId);
		
		TbItemExample example= new TbItemExample();
		//添加查询条件
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(itemId);
		List<TbItem> list = itemMapper.selectByExample(example);
		if(list!=null && list.size()>0){
			TbItem item = list.get(0);
			return item;
		}
		return null;
	}

}
