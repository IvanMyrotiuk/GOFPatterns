package com.java.myrotiuk.patterns.behaviour.strategy;

import lombok.AllArgsConstructor;

import java.util.List;

/**
 * Created by Ivan on 03.03.2021. All rights reserved.
 */
@AllArgsConstructor
public class EncryptionServiceImpl implements EncryptionService {

    private List<Encryption> encryptionList;

    @Override
    public String encryptFile(File file) {
        return encryptionList.stream()
                .filter(e -> e.apply(file.getType()))
                .map(e -> e.encrypt(file))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("There are no appropriate encryption processor"));
    }
}