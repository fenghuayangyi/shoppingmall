package com.sh.taotao.service;

import com.sh.taotao.common.pojo.EUDataGridResult;
import com.sh.taotao.common.pojo.TaotaoResult;
import com.sh.taotao.pojo.TbItem;

public interface ItemService {
	
	TbItem getItemById(long itemId);
	EUDataGridResult getItemList(int page, int rows);
	TaotaoResult createItem(TbItem item, String desc, String itemParam) throws Exception;
}
