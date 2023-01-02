package org.la.test.code.ps.pck.genr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class PersonLoader {

    final RandomAccessFile file;

    public PersonLoader(final File file) throws FileNotFoundException {
        this.file = new RandomAccessFile(file, "rw");
    }

    public Person load() throws ClassNotFoundException {
        Person person = new Person("asif", 11);

        return person;
    }
}
