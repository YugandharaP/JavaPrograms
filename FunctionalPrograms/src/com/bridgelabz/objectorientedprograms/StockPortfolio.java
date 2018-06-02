package com.bridgelabz.objectorientedprograms;

import java.io.Serializable;
import java.util.ArrayList;

/**this is POJO(plain old java object)class which provide an array to store the stock details
 * @author yuga
 */
@SuppressWarnings("serial")
public class StockPortfolio implements Serializable{
	private ArrayList<Stock>stockList=new ArrayList<Stock>();

	public ArrayList<Stock> getStockList() {
		return stockList;
	}

	public void setStockList(ArrayList<Stock> stockList) {
		this.stockList = stockList;
	}

}
