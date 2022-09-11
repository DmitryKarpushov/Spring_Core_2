package org.example.Spring_Core;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Дмитрий Карпушов 04.09.2022
 */

public class RockMusic implements Music{

    @Override
    public  String getSong() {
        return "RockMusic";
    }
}
