package com.houliu.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author houliu
 * @create 2020-01-12 22:49
 */
public class FilenameFilterImpl implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        return false;
    }
}
