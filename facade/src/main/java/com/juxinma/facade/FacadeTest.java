package com.juxinma.facade;

import java.util.Random;

public class FacadeTest {

    /** 合规系统 */
    static class CheckService {
        /** 合规检查 */
        public boolean check(String report) {
            if (report == null) return false;
            return report.length() % 2 == 0;
        }
    }

    /** 审批流系统 */
    static class FlowService {
        public void createFlow(String report) {
            System.out.println("《" + report + "》进入审批流程");
        }
    }

    static class SmsService {
        public void sendSms(String report, boolean isOk) {
            if(isOk) System.out.println("恭喜您，您的报告《" + report + "》提交成功");
            else System.out.println("您的报告《" + report + "》合规检查不通过");
        }
    }

    static class ReportService {
        private CheckService checkService = new CheckService();
        private FlowService flowService = new FlowService();
        private SmsService smsService = new SmsService();

        public void submitReport(String report) {
            boolean check = checkService.check(report);
            if (check) {
                flowService.createFlow(report);
            }
            smsService.sendSms(report,check);
        }
    }

    public static void main(String[] args) {
        ReportService reportService = new ReportService();
        reportService.submitReport("炒股不能实现财富自由");
        System.out.println("----------------");
        reportService.submitReport("撸起袖子加油干！");
        System.out.println("----------------");
        reportService.submitReport("美股疯长！");
        //运行结果
        //《炒股不能实现财富自由》进入审批流程
        //恭喜您，您的报告《炒股不能实现财富自由》提交成功
        //----------------
        //《撸起袖子加油干！》进入审批流程
        //恭喜您，您的报告《撸起袖子加油干！》提交成功
        //----------------
        //您的报告《美股疯长！》合规检查不通过
    }

}
