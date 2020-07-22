package net.khoroshev.sbs.controller;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
    static Map<String, String> map = new HashMap<>();
    static
    {
        map.put("Виктор", "Витька-титька");
        map.put("Егор", "Егор-помидор");
        map.put("Дмитрий", "Димас-матрас");
        map.put("Наталья", "Наташка-какашка");
    }

    public static Map<String, String> getMap() {
        return map;
    }
}
