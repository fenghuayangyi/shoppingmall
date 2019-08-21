package com.sh.taotao.rest.service;

import java.util.List;

import com.sh.taotao.pojo.TbContent;

public interface ContentService {

	List<TbContent> getContentList(long contentCid);
}
