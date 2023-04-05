import enums.Size;
import org.example.Coffee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CoffeeTest {
    Coffee coffee;

    @BeforeEach
    public void setUp(){
        coffee = new Coffee("cappuccino", Size.SMALL, 0.50, 2.79);
    }

    //    TESTING GETTERS AND SETTERS
    @Test
    public void canGetName(){
        assertThat(coffee.getName()).isEqualTo("cappuccino");
    }
    @Test
    public void canSetName(){
        coffee.setName("latte");
        assertThat(coffee.getName()).isEqualTo("latte");
    }
    @Test
    public void canGetSize(){
        assertThat(coffee.getSize()).isEqualTo(Size.SMALL);
    }
    @Test
    public void canSetSize(){
        coffee.setSize(Size.MEDIUM);
        assertThat(coffee.getSize()).isEqualTo(Size.MEDIUM);
    }
    @Test
    public void canGetCost(){
        assertThat(coffee.getCost()).isEqualTo(0.5);
    }
    @Test
    public void canSetCost(){
        coffee.setCost(0.6);
        assertThat(coffee.getCost()).isEqualTo(0.6);
    }
    @Test
    public void canGetSellPrice(){
        assertThat(coffee.getSellPrice()).isEqualTo(2.79);
    }
    @Test
    public void canSetSellPrice(){
        coffee.setSellPrice(2.99);
        assertThat(coffee.getSellPrice()).isEqualTo(2.99);
    }


    //    CUSTOM METHODS TEST
    @Test
    public void canCalculateMargin(){
        assertThat(coffee.calculateMargin()).isEqualTo(2.29);
    }
}
