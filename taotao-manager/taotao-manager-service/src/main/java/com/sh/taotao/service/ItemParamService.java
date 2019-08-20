package com.sh.taotao.service;

import com.sh.taotao.common.pojo.TaotaoResult;
import com.sh.taotao.pojo.TbItemParam;

public interface ItemParamService {

	TaotaoResult getItemParamByCid(long cid);
	TaotaoResult insertItemParam(TbItemParam itemParam);
}
