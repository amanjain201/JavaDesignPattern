package builder;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Computer computer1 = new Computer.ComputerBuilder("500 GB","2 GB")
                .setGraphicsCardEnabled(true)
                .build();

        Computer computer2 = new Computer.ComputerBuilder("250 GB","2 GB")
                .setBluetoothEnabled(true)
                .build();

        Computer computer3 = new Computer.ComputerBuilder("500 GB","4 GB")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        System.out.println("Computer1 : " + computer1.toString());
        System.out.println("Computer2 : " + computer2.toString());
        System.out.println("Computer3 : " + computer3.toString());
    }
}
