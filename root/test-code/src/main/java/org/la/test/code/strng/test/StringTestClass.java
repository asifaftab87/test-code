package org.la.test.code.strng.test;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;

public class StringTestClass {
    @Test
    public void givenUsingString_whenInstantiatingString_thenWrong() {
        CharSequence firstString = "baeldung";
        String secondString = "baeldung";
        assertNotEquals(firstString, secondString);
    }

    @Test
    public void givenString_whenAppended_thenUnmodified() {
        String test = "a";
        int firstAddressOfTest = System.identityHashCode(test);
        test += "b";
        int secondAddressOfTest = System.identityHashCode(test);

        assertNotEquals(firstAddressOfTest, secondAddressOfTest);
    }

    /*
        as every time new string created if any changes happened then hashcode also changing
     */
    @Test
    public void givenString_whenAppended_thenUnmodified_hashcode() {
        String test = "a";
        int firstAddressOfTest = test.hashCode();
        test += "b";
        int secondAddressOfTest = test.hashCode();

        assertNotEquals(firstAddressOfTest, secondAddressOfTest);
//        assertEquals(firstAddressOfTest, secondAddressOfTest);
    }

    /*
        address not changing then hashcode also not changing event content changing
     */
    @Test
    public void givenStringBuilder_whenAppended_thenModified() {
        StringBuilder test = new StringBuilder();
        test.append("a");
        int firstAddressOfTest = System.identityHashCode(test);
        test.append("b");
        int secondAddressOfTest = System.identityHashCode(test);

        assertEquals(firstAddressOfTest, secondAddressOfTest);
    }

    @Test
    public void givenStringBuilder_whenAppended_thenModified_hashcode() {
        StringBuilder test = new StringBuilder();
        test.append("a");
        System.out.println(test);
        int firstAddressOfTest = test.hashCode();
        test.append("b");
        System.out.println(test);
        int secondAddressOfTest = test.hashCode();
        System.out.println(firstAddressOfTest+"  "+secondAddressOfTest);

        assertEquals(firstAddressOfTest, secondAddressOfTest);
    }
}
