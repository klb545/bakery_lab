import org.example.Sponge;
import org.example.TieredCake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TieredCakeTest {
    TieredCake tieredCake;

    @BeforeEach
    public void setUp(){
        tieredCake = new TieredCake("cheesecake", "lime", 5.99, 11.99, "green", "square", "yellow", new String[]{"nuts", "strawberries"}, 3);
    }

    @Test
    public void canGetShape(){
        assertThat(tieredCake.getShape()).isEqualTo("square");
    }
    @Test
    public void canSetShape(){
        tieredCake.setShape("circular");
        assertThat(tieredCake.getShape()).isEqualTo("circular");
    }
    @Test
    public void canGetSecondaryIcingColour(){
        assertThat(tieredCake.getSecondaryIcingColour()).isEqualTo("yellow");
    }
    @Test
    public void canSetSecondaryIcingColour(){
        tieredCake.setSecondaryIcingColour("red");
        assertThat(tieredCake.getSecondaryIcingColour()).isEqualTo("red");
    }
    @Test
    public void canGetToppings(){
        assertThat(tieredCake.getToppings()).isEqualTo(new String[]{"nuts", "strawberries"});
    }
    @Test
    public void canSetToppings(){
        tieredCake.setToppings(new String[]{"nuts", "strawberries", "raspberries"});
        assertThat(tieredCake.getToppings()).isEqualTo(new String[]{"nuts", "strawberries", "raspberries"});
    }
    @Test
    public void canGetTiers(){
        assertThat(tieredCake.getTiers()).isEqualTo(3);
    }
    @Test
    public void canSetTiers(){
        tieredCake.setTiers(2);
        assertThat(tieredCake.getTiers()).isEqualTo(2);
    }

//    CUSTOM METHODS
    @Test
    public void canAddHappyBirthdayMessage_test1(){
        tieredCake.addHappyBirthdayMessage();
        assertThat(tieredCake.getHappyBirthdayMessage()).isEqualTo("Happy Birthday!");
    }
    @Test
    public void canAddHappyBirthdayMessage_test2(){
        tieredCake.addHappyBirthdayMessage("Lucy");
        assertThat(tieredCake.getHappyBirthdayMessage()).isEqualTo("Happy Birthday, Lucy!");
    }


}
