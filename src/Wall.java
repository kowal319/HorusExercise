import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure {

    private List<CompositeBlock> blocks=new ArrayList<>();

    public Wall() {
    }

    public Wall(List<CompositeBlock> blocks) {
        this.blocks = blocks;
    }

    @Override
    public Optional<CompositeBlock> findBlockByColor(String color) {
        Optional<CompositeBlock> blockOptional=blocks.stream().filter(b->b.getColor().equals(color)).findAny();

        return blockOptional;
    }

    @Override
    public List<CompositeBlock> findBlocksByMaterial(String material) {

        List<CompositeBlock> selectedBlocksList = blocks.stream().filter(b -> b.getMaterial().equals(material)).collect(Collectors.toList());
        return selectedBlocksList;
    }

    @Override
    public int count() {
        return blocks.size();
    }


}