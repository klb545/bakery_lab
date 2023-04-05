import enums.Size;
import org.example.BakedGood;
import org.example.Cupcake;
import org.example.Sponge;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupcakeTest {
    Cupcake cupcake1;

    @BeforeEach
    public void setUp(){
        cupcake1 = new Cupcake("name", "baseFlavour", 2.99, 3.99, "icingColour", Size.SMALL);
    }

    @Test
    public void canGetSize(){
        assertThat(cupcake1.getSize()).isEqualTo(Size.SMALL);
    }
    @Test
    public void canSetSize(){
        cupcake1.setSize(Size.MEDIUM);
        assertThat(cupcake1.getSize()).isEqualTo(Size.MEDIUM);
    }


    @Test
    public void hasChocolateChips(){
        assertThat(cupcake1.hasChocolateChips()).isEqualTo(false);
    }

    @Test
    public void hasCherry(){
        assertThat(cupcake1.hasCherry()).isEqualTo(false);
    }

    @Test
    public void hasSprinkles(){
        assertThat(cupcake1.hasSprinkles()).isEqualTo(false);
    }


//    TEST CUSTOM METHODS
    @Test
    public void canAddChocolateChips(){
        cupcake1.addChocolateChips();
        assertThat(cupcake1.hasChocolateChips()).isEqualTo(true);
    }
    @Test
    public void canRemoveChocolateChips(){
        cupcake1.addChocolateChips();
        cupcake1.removeChocolateChips();
        assertThat(cupcake1.hasChocolateChips()).isEqualTo(false);
    }
    @Test
    public void canAddCherry(){
        cupcake1.addCherry();
        assertThat(cupcake1.hasCherry()).isEqualTo(true);
    }
    @Test
    public void canRemoveCherry(){
        cupcake1.addCherry();
        cupcake1.removeCherry();
        assertThat(cupcake1.hasCherry()).isEqualTo(false);
    }
    @Test
    public void canAddSprinkles(){
        cupcake1.addSprinkles();
        assertThat(cupcake1.hasSprinkles()).isEqualTo(true);
    }
    @Test
    public void canRemoveSprinkles(){
        cupcake1.addSprinkles();
        cupcake1.removeSprinkles();
        assertThat(cupcake1.hasSprinkles()).isEqualTo(false);
    }
}
