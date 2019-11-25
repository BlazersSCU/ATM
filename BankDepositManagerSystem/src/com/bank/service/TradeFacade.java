package com.bank.service;

import java.sql.SQLException;
import java.util.List;

import com.bank.domain.TradeInfo;


public interface TradeFacade {
	/**
	 * ���ҵ��
	 */
	void saveMoney(TradeInfo tradeInfo) throws SQLException;

	/**
	 * ȡ��ҵ��
	 */
	void fetchMoney(TradeInfo tradeInfo) throws SQLException;

	/**
	 * ��ѯ�ʻ����
	 * 
	 * @param userNO
	 *            ��ǰ��¼�û��ʺ�
	 * @return �����ʻ����
	 */
	Integer selectBalance(String userNO) throws SQLException;

	/**
	 * ��ѯ��ǰ��¼�û����н�����Ϣ
	 * 
	 * @param userNO
	 *            ��ǰ��¼�û��ʺ�
	 * @return ���ؽ�����Ϣ
	 */
	List selectTradeInfo(String userNO) throws SQLException;

	int findUserflag(String userNO) throws SQLException;

	boolean confirmTransfer(TradeInfo tradeInfo1, TradeInfo tradeInfo) throws SQLException;
}
