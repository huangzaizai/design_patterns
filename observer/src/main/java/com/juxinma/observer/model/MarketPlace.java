package com.juxinma.observer.model;

/**
 * @Description 交易市场
 * @Author 黄名富
 * @Date 2022/8/3 00:11
 * @Version 1.0
 **/
public class MarketPlace {

    public static void main(String[] args) {

        SecuritiesCompany zhongxin = new SecuritiesCompany();

        Bank rmBank = new Bank(zhongxin);
        FundCompany dapeng = new FundCompany(zhongxin);
        People xiaoming = new People(zhongxin);

        zhongxin.finishReport();

    }

}
