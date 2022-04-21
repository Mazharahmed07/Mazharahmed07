package org.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
//@RunWith(what need to run, which level)
@RunWith(Suite.class)
@SuiteClasses({TestA.class,TestB.class,TestC.class})

public class TestRunner {

}
