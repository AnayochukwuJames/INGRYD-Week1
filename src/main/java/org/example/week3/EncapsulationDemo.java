package org.example.week3;

public class EncapsulationDemo {

    private String encapsulatedName;
    private int encapsulatedAge;
    protected String protectedName;
    String defaultAccess;
    public String publicString;

    public EncapsulationDemo(String encapsulatedName, int encapsulatedAge, String protectedName, String defaultAccess, String publicString) {
        this.encapsulatedName = encapsulatedName;
        this.encapsulatedAge = encapsulatedAge;
        this.protectedName = protectedName;
        this.defaultAccess = defaultAccess;
        this.publicString = publicString;
    }

    public int getEncapsulatedAge() {
        return encapsulatedAge;
    }

    public String getEncapsulatedName(){
        return this.encapsulatedName;
    }

    @Override
    public String toString() {
        return "EncapsulationDemo{" +
                "encapsulatedName='" + encapsulatedName + '\'' +
                ", encapsulatedAge=" + encapsulatedAge +
                ", protectedName='" + protectedName + '\'' +
                ", defaultAccess='" + defaultAccess + '\'' +
                ", publicString='" + publicString + '\'' +
                '}';
    }
    //    public void setEncapsulatedAge(int encapsulatedAge) {
//        this.encapsulatedAge = encapsulatedAge;
//    }

}