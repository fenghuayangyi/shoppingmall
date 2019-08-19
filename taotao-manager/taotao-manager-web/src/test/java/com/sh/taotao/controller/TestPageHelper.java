package com.sh.taotao.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sh.taotao.mapper.TbItemMapper;
import com.sh.taotao.pojo.TbItem;
import com.sh.taotao.pojo.TbItemExample;

public class TestPageHelper {
	@Test
	public void testPageHelper(){
		//1.创建spring容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");		
		//2.从容器中获取mapper的代理对象
		TbItemMapper mapper = applicationContext.getBean(TbItemMapper.class);
		//3.执行查询并分页
		TbItemExample example = new TbItemExample();
		//分页处理
		PageHelper.startPage(1, 10);
		List<TbItem> list = mapper.selectByExample(example);
		//取商品列表
		for (TbItem tbItem : list) {
			System.out.println(tbItem.getTitle());
		}
		//取分页信息
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		long total = pageInfo.getTotal();
		System.out.println("共有商品："+ total);
	}
	
}
