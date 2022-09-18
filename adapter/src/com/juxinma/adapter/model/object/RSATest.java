package com.juxinma.adapter.model.object;

public class RSATest {

    public static void main(String[] args) {
        RSAOrgEncryption orgEncryption = new RSAOrgEncryption();
        RSAAdapter rsaAdapter = new RSAAdapter(orgEncryption);
        rsaAdapter.encrypt("123456");
    }

}
