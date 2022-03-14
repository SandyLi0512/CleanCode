package com.epam.engx.cleancode.naming.task5;


import com.epam.engx.cleancode.naming.task5.thirdpartyjar.Predicate;

public class FileExtPared implements Predicate<String> {

    private final String[] stretch;

    FileExtPared(String[] stretch) {
        this.stretch = stretch;
    }

    @Override
    public boolean test(String fileName) {
        for (String extension : stretch) {
            if (fileName.toLowerCase().endsWith(extension)) {
                return true;
            }
        }
        return false;
    }
}
