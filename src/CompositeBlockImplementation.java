import java.util.ArrayList;
import java.util.List;

public class CompositeBlockImplementation implements CompositeBlock{


    private String color;
    private String material;
    private List<Block> blocks= new ArrayList<>();

    public CompositeBlockImplementation(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public CompositeBlockImplementation() {
    }

    public void addBlock(String color, String material){
        blocks.add(new CompositeBlockImplementation(color,material));
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public List getBlocks() {
        return blocks;
    }

    @Override
    public String toString() {
        return "Block{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}