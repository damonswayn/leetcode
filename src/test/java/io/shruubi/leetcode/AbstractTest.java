package io.shruubi.leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class AbstractTest {

    protected Logger logger;

    public AbstractTest() {
        this.logger = LogManager.getLogger(this.getClass());
    }
}