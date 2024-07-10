public class Strings {
    public static void main(String[] args) {
        //Strings are immutable always
        //concatenate ; add strings
        String name = "Anuradha";
        String surName = "Paul";
        int age = 20;
        String fullName = name +" "+ surName + age ;
        System.out.println(fullName);

        //charAt
        System.out.println(name.charAt(5));

        //length
        System.out.println(fullName.length());

        //replace
        String replaceName = name.replace('A','d');
        System.out.println(replaceName);
        System.out.println(name);

        //substring
        System.out.println(name.substring(0,8));
    }
    // int arr = arr[1,2,3]
    // int[] marks = new int[3]
}