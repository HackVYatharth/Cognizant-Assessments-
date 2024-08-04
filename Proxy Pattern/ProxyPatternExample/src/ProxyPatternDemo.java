public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("test_image_1.jpg");
        Image image2 = new ProxyImage("test_image_2.jpg");

        
        System.out.println("First call to display image1:");
        image1.display();

        
        System.out.println("\nSecond call to display image1:");
        image1.display();

       
        System.out.println("\nFirst call to display image2:");
        image2.display();

        
        System.out.println("\nSecond call to display image2:");
        image2.display();
    }
}
