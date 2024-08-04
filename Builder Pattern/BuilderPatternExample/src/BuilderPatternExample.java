public class BuilderPatternExample {
    public static void main(String[] args) {
        
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .build();

        Computer officeComputer = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .build();

        
        System.out.println(gamingComputer);
        System.out.println(officeComputer);
    }
}
