package com.importNew.service;

import java.util.List;

import com.importNew.config.NotifyMsg;

public interface NotifyMsgService {

	/**
	 * 保存数据
	 * @author 作者：oKong
	 */
	NotifyMsg saveNotifyMsg(NotifyMsg msg);

	/**
	 * 根据消息号查找
	 * @author 作者：oKong
	 */
	NotifyMsg findNotifyMsgByNo(String notifyNo);

	/**
	 * 根据消息日期查找
	 * @author 作者：oKong
	 */
	List<NotifyMsg> findNotifyMsgByDate(String notifyDate);

	/**
	 * 根据id进行删除 返回删除的对象
	 * @author 作者：oKong
	 */
	NotifyMsg delNotifyMsgById(String id);

}