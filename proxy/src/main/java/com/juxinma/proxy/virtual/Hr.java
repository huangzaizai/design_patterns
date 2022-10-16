package com.juxinma.proxy.virtual;

import java.util.ArrayList;
import java.util.List;

/**
 * Hr
 */
public class Hr implements InterviewAble{

    List<Integer> intervieweeList;

    private CTO cto;

    public Hr() {
    }

    /**
     * 简历筛选
     */
    public void filtrate(int id) {
        if (intervieweeList == null) {
            intervieweeList = new ArrayList<>();
        }
        if (id % 2 == 0) intervieweeList.add(id);
    }

    @Override
    public void interview() {
        if (cto == null) cto = new CTO(); //邀请技术总监来面试
        cto.setIntervieweeList(intervieweeList); //将筛选后的简历交付给总监
        cto.interview();
    }

}
