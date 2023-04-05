import enums.PipingTip;
import org.example.Sponge;
import org.example.TieredCake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SpongeTest {

    Sponge sponge;

    @BeforeEach
    public void setUp(){
        sponge = new TieredCake("cheesecake", "lime", 5.99, 11.99, "green", "square", "yellow", new String[]{"nuts", "strawberries"}, 3);
    }

    @Test
    public void canGetIcingColour(){
        assertThat(sponge.getIcingColour()).isEqualTo("green");
    }
    @Test
    public void canSetIcingColour(){
        sponge.setIcingColour("white");
        assertThat(sponge.getIcingColour()).isEqualTo("white");
    }
    @Test
    public void canGetPipingTip(){
        assertThat(sponge.getPipingTip()).isEqualTo("plain");
    }
    @Test
    public void canSetPipingTip(){
        sponge.setPipingTip(PipingTip.STAR);
        assertThat(sponge.getPipingTip()).isEqualTo("star");
    }
}
