package org.la.test.code.immutable;

class Address {
    private String street;
    private int door;
    public Address setStreet(String s) {
        street = s;
        return this;
    }
    public Address setDoor(int d) {
        door = d;
        return this;
    }
    public String getStreet(){
        return street;
    }
    public int getDoor(){
        return door;
    }
    @Override
    public String toString() {
        return "{ street: "+street+", door: "+door+" }";
    }
}
class ImmutableUser {
    private final String name;
    private final Address address;
    public ImmutableUser(String n, Address a) {
        name = n;
        address = a;
    }
    public Address getAddress(){
        return new Address().setDoor(address.getDoor()).setStreet(address.getStreet());
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString() {
        return "{ name: "+name+", address: "+address+" }";
    }
}
public class ImmutableCloneOne {
    public static void main(String[] args) {
        Address address = new Address().setStreet("paridedap").setDoor(1);
        ImmutableUser immutableUser = new ImmutableUser("asif", address);
        System.out.println("immutableUser: "+immutableUser);
        Address address1 = immutableUser.getAddress();
        System.out.println(address1);
        address1.setDoor(11);
        System.out.println(address1);
        System.out.println("immutableUser: "+immutableUser);
    }
}
