package com.java.myrotiuk.patterns.behaviour.strategy;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

import static com.java.myrotiuk.patterns.behaviour.strategy.Type.PPT;
import static com.java.myrotiuk.patterns.behaviour.strategy.Type.TXT;

/**
 * Created by Ivan on 03.03.2021. All rights reserved.
 */
@Getter
public class AESEncryption implements Encryption {

    private List<Type> types = Arrays.asList(TXT, PPT);

    @Override
    public String encrypt(File file) {
        return String.format("Encrypting file with extension %s by AES algorithm", file.getType());
    }

}
