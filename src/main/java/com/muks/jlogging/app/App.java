package com.muks.jlogging.app;

import com.muks.jlogging.lib.LibApp;
import com.sun.tools.javac.tree.JCTree;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Hello world!
 *
 */
public class App {
    private static Log log = LogFactory.getLog(App.class);
    private static String TAG = "# [MainApp]: ";

    public static void main( String[] args ) {
        log.error(TAG + "Error World -=-=-=-=-=-=-=-=-=-");
        log.warn(TAG + "Warn World");
        log.info(TAG + "Info World");
        log.debug(TAG + "Debug World");
        log.trace(TAG + "Trace World");

        LibApp.Printer();

    }
}
