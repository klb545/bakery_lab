import org.example.BakedGood;
import org.example.TieredCake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class BakedGoodTest {

    TieredCake tieredCake;

    @BeforeEach
    public void setUp(){
        tieredCake = new TieredCake("sponge cake", "red velvet", 5.99, 11.99, "green", "square", "yellow", new String[]{"nuts", "strawberries"}, 3);
    }

//    TESTING GETTERS AND SETTERS
    @Test
    public void canGetName(){
        assertThat(tieredCake.getName()).isEqualTo("sponge cake");
    }
    @Test
    public void canSetName(){
        tieredCake.setName("muffin");
        assertThat(tieredCake.getName()).isEqualTo("muffin");
    }
    @Test
    public void canGetBaseFlavour(){
        assertThat(tieredCake.getBaseFlavour()).isEqualTo("red velvet");
    }
    @Test
    public void canSetBaseFlavour(){
        tieredCake.setBaseFlavour("lemon");
        assertThat(tieredCake.getBaseFlavour()).isEqualTo("lemon");
    }
    @Test
    public void canGetCost(){
        assertThat(tieredCake.getCost()).isEqualTo(5.99);
    }
    @Test
    public void canSetCost(){
        tieredCake.setCost(6.12);
        assertThat(tieredCake.getCost()).isEqualTo(6.12);
    }
    @Test
    public void canGetSellPrice(){
        assertThat(tieredCake.getSellPrice()).isEqualTo(11.99);
    }
    @Test
    public void canSetSellPrice(){
        tieredCake.setSellPrice(12.99);
        assertThat(tieredCake.getSellPrice()).isEqualTo(12.99);
    }


//    CUSTOM METHODS TEST
    @Test
    public void canCalculateMargin(){
        assertThat(tieredCake.calculateMargin()).isEqualTo(6);
    }
}
