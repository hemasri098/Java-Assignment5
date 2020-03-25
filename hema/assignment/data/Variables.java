package com.company.JavaAssignment5.data;

import java.util.logging.Logger;

public class Variables {
    int int_variable;
    char char_variable;
    Logger LOGGER = Logger.getAnonymousLogger();
    public void printVariables()
    {
        LOGGER.info("integer: " + int_variable + "\n" + "character: " + char_variable);
    }
    public void printLocalVariables() {
        //int variable_1;
        //char variable_2;
        //LOGGER.info("integer: " + variable_1 + "\n" + "character: " + variable_2); //Cannot access local variables that are not intialized

    }
}
