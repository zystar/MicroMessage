package com.zyx.service;

import java.util.List;

import com.zyx.bean.Message;
import com.zyx.dao.MessageDao;

/**
 * @author STAR
 * 列表相关的业务功能
 */
public class ListService {
	public List<Message> queryMessageList(String command,String description){
		MessageDao messageDao = new MessageDao();
		return messageDao.queryMessageList(command, description);
	}
}
