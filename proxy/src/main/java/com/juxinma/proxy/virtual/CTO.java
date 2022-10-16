package com.juxinma.proxy.virtual;

import java.util.List;

/**
 * 技术总监
 */
public class CTO implements InterviewAble{

    List<Integer> intervieweeList;

    public CTO() {
        System.out.println("技术总监很忙，需要统一安排面试");
    }

    @Override
    public void interview() {
        for (int i = 0; i < intervieweeList.size(); i++) {
            if(intervieweeList.get(i).equals(6)) {
                System.out.println("好，就招聘：" + intervieweeList.get(i) + "了");
                break;
            }
        }
        intervieweeList.clear();
    }

    public void setIntervieweeList(List<Integer> intervieweeList) {
        this.intervieweeList = intervieweeList;
    }
}
