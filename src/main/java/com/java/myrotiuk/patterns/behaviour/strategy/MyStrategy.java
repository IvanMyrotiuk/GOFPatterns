package com.java.myrotiuk.patterns.behaviour.strategy;

import java.util.Arrays;

/**
 * Created by Ivan on 03.03.2021. All rights reserved.
 *
 * When we have got a group of algorithms and we want to choose which one to use dynamically at runtime.
 * Define a family of algorithms snd mske them interchangeable.
 * For example, if I want to encrypt files, but have different ways of encrypting them depending on the situation
 * or if you have different types of validation that you could use or different sorting alg that we want to use,
 * or want to save different files types, and so on.
 * The strategy pattern allows you to be flexible about which member of a family of algorithms is used.
 * You have got a group of algorithmms, and you want to choose which one to use dynamically at runtime.
 *
 */
public class MyStrategy {
    public static void main(String[] args) {
        Encryption aesEncryption = new AESEncryption();
        Encryption rsaEncryption = new RSAEncryption();
        EncryptionService encryptionService =
                new EncryptionServiceImpl(Arrays.asList(aesEncryption, rsaEncryption));

        File txtFile = new File(Type.TXT);
        File exeFile = new File(Type.EXE);
        File xlsFile = new File(Type.XLS);

        System.out.println(encryptionService.encryptFile(txtFile));
        System.out.println(encryptionService.encryptFile(exeFile));
        System.out.println(encryptionService.encryptFile(xlsFile));
    }
}
