public class Strings {
    public static void main(String[] args) {

        // Strings in java are not primitive type, they are object type

        // in literal decalaration of string in java, if the string already exists in string pool, 
        // the JVM simply uses the previously present string value instead of creating the string again.
        String literalString1 = "Aman Khan";
        String literalString2 = "Aman Khan";
        int age = 21;

        // in object decalaration, irrespective of whethere the string is already present in string pool or not,
        // the JVM always creates a new string 
        String objectString1 = new String("abc");
        String objectString2 = new String("abc");

        System.out.println(literalString1 == literalString2); // true, becasue both are using the same values from string pool
        System.out.println(objectString1 == objectString2); // false
        System.out.println();
        System.out.println();

        // We can use format specifiers to format strings just as we do in c
        String formattedString = String.format("My name is %s and I am %d years old", literalString1, age);
        System.out.println(formattedString);
        System.out.println();
        System.out.println();



        // String length and empty
        String name = "Aman";
        System.out.println(name.length());
        System.out.println(name.isEmpty());
        System.out.println(name.toUpperCase()); // this method returns a new string in uppercase, it does not change the original string 
        System.out.println(name.toLowerCase());
        System.out.println();
        System.out.println();



        // checking the equality of two strings 
        // the == wont work in case of object strings declared using new keyword
        // so for this, we need to use equals method
        String name1 = new String("Aman");
        String name2 = new String("Aman");
        String name3 = new String("AMAN");
        System.out.println(name1 == name2); //false
        System.out.println(name1.equals(name2)); //true
        System.out.println(name1.equals(name3)); //false, because different cases 
        System.out.println(name1.equalsIgnoreCase(name3)); // true, because it ignores the cases 
        System.out.println();
        System.out.println();



        // replace a word in string, use replacae keyword
        // the replace method does not change the original string,
        // instead it returns a new string 
        String text = "My name is Aman";
        System.out.println(text.replace("Aman", "Slim Shady"));
        System.out.println(text);
    }
}

// Format specifiers
// Strings -- %s
// Chars -- %c
// int -- %d
// boolean -- %b
// double/float -- %f