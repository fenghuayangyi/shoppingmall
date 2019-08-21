package com.sh.taotao.service;

import java.util.List;

import com.sh.taotao.common.pojo.EUTreeNode;
import com.sh.taotao.common.pojo.TaotaoResult;

public interface ContentCategoryService {

	List<EUTreeNode> getCategoryList(long parentId);
	TaotaoResult insertContentCategory(long parentId, String name);
}
