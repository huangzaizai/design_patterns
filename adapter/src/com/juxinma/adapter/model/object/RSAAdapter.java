package com.juxinma.adapter.model.object;

/**
 * RSA 适配器
 */
public class RSAAdapter implements RSAEncryption{

    private RSAOrgEncryption rsaOrgEncryption;

    public RSAAdapter(RSAOrgEncryption rsaOrgEncryption) {
        this.rsaOrgEncryption = rsaOrgEncryption;
    }

    @Override
    public void encrypt(String str) {
        System.out.println("适配器操作");
        rsaOrgEncryption.encryptValue(str);
    }

}
