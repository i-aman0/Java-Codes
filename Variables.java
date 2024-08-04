// If we dont assing value to class level variable, it will take the default values which is 0 for int and null for string
// this is true irrespective of whether the var is static or not 
// if we define a variable at class level, we can a variable with same name at function level as well
// this is because in the scope of that function there is no variable with that name
public class Variables {
    String name = "Aman";
    static String classes;
    int num;
    static char ch;


    public void func(){
        System.out.println("My name is : " + name);
        System.out.println("Unassigned static int is : " + num);
    }


    public static void main(String[] args) {
        int age = 10;
        age = 21;
        char ch = 'k'; // although char ch is defined earlier, this will give no error 
        System.out.println("I am " + age + " years old.");
        System.out.println("Unassigned static string is : " + classes);
        // System.out.println("Unassigned static int is : " + num);
        System.out.println("Unassigned static char is : " + ch);
        System.out.println();


        Variables n = new Variables();
        n.func();
    }

    
}
