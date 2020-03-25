package com.company.JavaAssignment5.singleton;

import java.util.logging.Logger;

public class StaticAndNonStatic {
    String string_Var;
    public static StaticAndNonStatic initializeMember(String str) {
       // string_Var = str;    //non-static fields cannot be accessed by static context(intializeMember is a static method and string_var is a non static variable)
        StaticAndNonStatic obj = new StaticAndNonStatic();
        return obj;
    }
    public void print() {
        Logger LOGGER = Logger.getAnonymousLogger();
        LOGGER.info("String:" + string_Var);
    }
}
