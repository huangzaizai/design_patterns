package com.juxinma.adapter.model.classes;

/**
 * 第三方适配器
 */
public class ThirdAdapter extends UsbPlug implements TypeCSlot{

    @Override
    public void runApplet() {
        System.out.println("适配器操作");
        super.specialRun();
    }

}
