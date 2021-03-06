package org.bbs.dao;

import java.util.List;
import java.util.Map;

import org.bbs.pojo.BbsTopic;
import org.bbs.pojo.Pager;

public interface BbsTopicMapper {
    
	void addTopic(BbsTopic topic);
	
	void delTopic(Integer id);
	
	BbsTopic findById(Integer id);
	
	List<BbsTopic> list(Map<String, Integer> conditionMap);
	
	Integer getCount();		
}