package com.juxinma.observer.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 证券公司
 * @Author 黄名富
 * @Date 2022/8/2 23:59
 * @Version 1.0
 **/
public class SecuritiesCompany implements Subject{

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(String title) {
        for(Observer observer : observerList) {
            observer.update(title);
        }
    }

    /**
     * 完成报告
     */
    public void finishReport() {
        notifyObserver("第一篇报告");
    }

}
