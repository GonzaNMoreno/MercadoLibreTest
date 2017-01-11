package com.bootcamp.framework.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by GonzaMoreno on 31/12/16.
 */
public interface Logging {
    default Logger getLogger(){
        return LoggerFactory.getLogger(getClass());
    }
}
