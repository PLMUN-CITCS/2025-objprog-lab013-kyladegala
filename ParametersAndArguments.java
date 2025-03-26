public class ParametersAndArguments {
    public static void main(String[] args) {
        // Declare variables
        int roomWidth = 10;
        int roomHeight = 15;

        // Call the method to calculate the area
        int area = calculateArea(roomWidth, roomHeight);

        // Print the calculated area
        System.out.println("The calculated area is: " + area);
    }

    // Method to calculate area
    public static int calculateArea(int width, int height) {
        int area = width * height;
        return area;
    }
}
