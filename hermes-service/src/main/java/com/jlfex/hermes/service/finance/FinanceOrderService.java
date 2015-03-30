package com.jlfex.hermes.service.finance;

import com.jlfex.hermes.model.yltx.FinanceOrder;

/**
 * 理财产品 业务
 * @author Administrator
 *
 */
public interface FinanceOrderService {
	
	
	/**
	 * 保存
	 * @param financeOrder
	 * @return
	 * @throws Exception
	 */
	public FinanceOrder  save(FinanceOrder financeOrder) throws Exception  ;
	/**
	 * 根据理财产品编号  获取理财产品
	 * @param uniqId
	 * @return
	 * @throws Exception
	 */
	public FinanceOrder  queryByUniqId(String uniqId) throws Exception ;
	/**
	 * 根据ID获取 理财产品
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public FinanceOrder  queryById(String id) throws Exception ;
	

}
