import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        CompositeBlockImplementation blockA= new CompositeBlockImplementation();
        blockA.addBlock("white", "steel");
        blockA.addBlock("red", "steel");
        blockA.addBlock("black", "steel");
        blockA.addBlock("green", "wood");
        blockA.addBlock("brown", "wood");
        blockA.addBlock("yellow", "wood");
        blockA.addBlock("white", "wood");
        blockA.addBlock("white", "sandstone");
        blockA.addBlock("black", "sandstone");


        List list=blockA.getBlocks();
        Wall wall= new Wall(list);

        System.out.println("Number of blocks: " + wall.count());
        System.out.println("");
        System.out.println("First found material of colour provided: ");
        wall.findBlockByColor("white").ifPresentOrElse(System.out::println, ()-> System.out.println("Sorry, we don't have that colour"));
        System.out.println("");
        System.out.println("Colours of material provided: ");
        wall.findBlocksByMaterial("steel").stream().map(Objects::toString).forEach(System.out::println);
    }

}
