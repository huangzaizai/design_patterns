package com.juxinma.observer.model;

/**
 * @Description 被观察者
 * @Author 黄名富
 * @Date 2022/8/2 23:56
 * @Version 1.0
 **/
public interface Subject {

    void registerObserver(Observer  observer);

    void removeObserver(Observer observer);

     void notifyObserver(String title);

}
