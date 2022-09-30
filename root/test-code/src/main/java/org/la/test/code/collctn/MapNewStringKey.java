package org.la.test.code.collctn;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapNewStringKey {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        String s1 = new String("hello");
        String s2 = new String("hello");
//        System.out.println(System.identityHashCode(s1));
//        System.out.println(System.identityHashCode(s2));
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1==s2);
//        map.put(new String("hello"), "array1");
//        map.put(new String("hello"), "array2");
        map.put(s1, "array2");
        map.put(s2, "array2");
        System.out.println(map);
        for (String key: map.keySet()){
//            System.out.println(key+ " = " + map.get(key));
        }
        TestHashcodeAddress t1 = new TestHashcodeAddress().setName("asif")
                .setAge(36).setPassport("s7673247");
        TestHashcodeAddress t2 = new TestHashcodeAddress().setName("asif")
                .setAge(36).setPassport("s7673247");
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        System.out.println(t1);
        System.out.println(t2);
        if(t1.hashCode()==t2.hashCode())
            System.out.println("hashcode equal");
        if(t1==t2)
            System.out.println("address equal");
        else
            System.out.println("address not equal");
    }
}
class TestHashcodeAddress {
    private String name;
    private int age;
    private String passport;
    public TestHashcodeAddress setName(String n) {
        name = n;
        return this;
    }
    public TestHashcodeAddress setAge(int n) {
        age = n;
        return this;
    }
    public TestHashcodeAddress setPassport(String n) {
        passport = n;
        return this;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TestHashcodeAddress)) {
            return false;
        }
        TestHashcodeAddress user = (TestHashcodeAddress) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, passport);
    }
}
