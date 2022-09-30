package org.la.test.code.immutable;

public class ImmutableCloneTwo {
    public static void main(String[] args) throws CloneNotSupportedException {
        AddressOne address = new AddressOne().setStreet("paridedap").setDoor(1);
        ImmutableUserOne original = new ImmutableUserOne("asif", address);
        ImmutableUserOne clone = (ImmutableUserOne)original.clone();
        AddressOne address1 = clone.getAddress();
        System.out.println(address1);
        address1.setDoor(11);
        System.out.println(address1);
        System.out.println("clone: "+clone);    //no change in clone object of immutable class
    }
}

class AddressOne {
    private String street;
    private int door;
    public AddressOne setStreet(String s) {
        street = s;
        return this;
    }
    public AddressOne setDoor(int d) {
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
class ImmutableUserOne implements Cloneable{
    private final String name;
    private final AddressOne address;
    public ImmutableUserOne(String n, AddressOne a) {
        name = n;
        address = a;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public AddressOne getAddress(){
        return new AddressOne().setDoor(address.getDoor()).setStreet(address.getStreet());
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString() {
        return "{ name: "+name+", address: "+address+" }";
    }
}

