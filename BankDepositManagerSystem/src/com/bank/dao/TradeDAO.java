package com.bank.dao;

import java.sql.SQLException;
import java.util.List;

import com.bank.domain.TradeInfo;


public interface TradeDAO {
	/**
	 * ���ҵ��
	 */
	void saveMoney(TradeInfo tradeInfo)
			throws SQLException;
	/**
	 * ȡ��ҵ��
	 * @param userNO ��ǰ��¼�û��ʺ�
	 * @param money ȡ����
	 * @param s �������ͣ�ȡ��
	 * @param balance ��ǰ�ʻ����
	 */
	void fetchMoney(TradeInfo tradeInfo)
			throws SQLException;
	/**
	 * ��ѯ�ʻ����
	 * @param userNO ��ǰ��¼�û��ʺ�
	 * @return �����ʻ����
	 */
	Integer selectBalance(String userNO) throws SQLException;
	/**
	 * ��ѯ��ǰ��¼�û����н�����Ϣ
	 * @param userNO ��ǰ��¼�û��ʺ�
	 * @return ���ؽ�����Ϣ
	 */
	List selectTradeInfo(String userNO) throws SQLException;
	/**
	 * ��ѯ�ʺ��Ƿ�ע��
	 * @param userNO �Է��û��ʺ�
	 * @return �Է��ʺ��Ƿ�ע����־
	 * @throws SQLException
	 */
	int findUserflag(String userNO) throws SQLException;
	/**
	 * ����ת�˲���
	 * @param tradeInfo1 �Է��ʺ������Ϣ
	 * @param tradeInfo �Լ��ʺŵ������Ϣ
	 * @return	����ɹ��ύ��־
	 * @throws SQLException
	 */
	boolean confirmTransfer(TradeInfo tradeInfo1, TradeInfo tradeInfo) throws SQLException;
}
