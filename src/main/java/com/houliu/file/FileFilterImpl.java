package com.houliu.file;

import java.io.File;
import java.io.FileFilter;

/**
 * @author houliu
 * @create 2020-01-12 17:13
 */
public class FileFilterImpl implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()){
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
