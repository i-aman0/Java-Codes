public class DataType {
    public static void main(String[] args) {
        int num1 = 5;
        double num2 = num1; // implicit type conversion 
        System.out.println(num2);

        // the reverse however is not possible, because compiler cannot implicitly convert from larger to smaller type
        // it will give error
        // to achieve this, we need to do explicit conversion

        int num3 = (int)num2; // explicit conversion from double to int
        System.out.println(num3);
    }
}
