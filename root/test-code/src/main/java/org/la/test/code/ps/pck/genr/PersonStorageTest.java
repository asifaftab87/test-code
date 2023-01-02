package org.la.test.code.ps.pck.genr;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class PersonStorageTest {

    Partner donDraper = new Partner("Don Draper", 89);
    Partner bertCooper = new Partner("Bert Cooper", 100);
    Employee peggyOlson = new Employee("Peggy Olson", 65);

    private File file;
    private PersonSaver saver;
    private PersonLoader loader;

    @Test
    public void savesAndLoadPerson() throws Exception {
        Person person = new Person("Bob", 20);
        saver.save(person);
        assertEquals(person, loader.load());
    }
}
