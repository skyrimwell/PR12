package task3;

public class RunShirt {
    public static void main(String[] args) {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,2XL";
        shirts[2] = "S003,Purple T-Shirt,Purple,S";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,L";
        shirts[5] = "S006,Black T-Shirt,Black,L";
        shirts[6] = "S007,Purple T-Shirt,purple,L";
        shirts[7] = "S008,White T-Shirt,White,M";
        shirts[8] = "S009,Green T-Shirt,Green,XL";
        shirts[9] = "S010,Orange T-Shirt,Orange,XS";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,L";

        Shirt[] shirtsConverted = new Shirt[11];
        for(int i = 0; i < 11; i++) {
            shirtsConverted[i] = new Shirt(shirts[i]);
            System.out.println(shirtsConverted[i] + "\n");
        }
    }
}
