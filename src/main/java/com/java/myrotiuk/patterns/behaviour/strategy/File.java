package com.java.myrotiuk.patterns.behaviour.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Ivan on 03.03.2021. All rights reserved.
 */
@Getter
@AllArgsConstructor
public class File {
    //may contain different additional properties which we may need to check...
    private Type type;
}
