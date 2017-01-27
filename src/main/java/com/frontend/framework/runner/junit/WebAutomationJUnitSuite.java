package com.frontend.framework.runner.junit;

import com.frontend.framework.runner.GenericWebAutomationTest;
import com.frontend.framework.web.Browser;
import com.frontend.framework.web.PageObjectBase;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

/**
 * Created by GonzaMoreno on 31/12/16.
 */

@RunWith(Parallelism.class)
public abstract class WebAutomationJUnitSuite<T extends PageObjectBase> extends GenericWebAutomationTest<T> {

    @Parameter
    public Browser currentBrowser;

    @Parameters(name = "Browser {0}")
    public static Set<Browser> getBrowsers(){
        return Arrays.stream(Browser.values()).collect(toSet());
    }

    @Before
    public void setUp(){ super.setUp(currentBrowser); }

    @After
    public void tearDown(){ super.tearDown(); }
}
