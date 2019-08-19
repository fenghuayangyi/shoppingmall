package com.sh.taotao.service;

import java.util.List;

import com.sh.taotao.common.pojo.EUTreeNode;

public interface ItemCatService {

	List<EUTreeNode> getCatList(long parentId);
}
