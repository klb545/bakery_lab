import enums.Size;
import org.example.Traybake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TraybakeTest {
    Traybake traybake;

    @BeforeEach
    public void setUp(){
        traybake = new Traybake("cheesecake", "lime", 5.99, 11.99, "square", Size.SMALL);
    }
    @Test
    public void canGetShape(){
        assertThat(traybake.getShape()).isEqualTo("square");
    }
    @Test
    public void canSetShape(){
        traybake.setShape("triangular");
        assertThat(traybake.getShape()).isEqualTo("triangular");
    }
    @Test
    public void canGetSize(){
        assertThat(traybake.getSize()).isEqualTo(Size.SMALL);
    }
    @Test
    public void canSetSize(){
        traybake.setSize(Size.MEDIUM);
        assertThat(traybake.getSize()).isEqualTo(Size.MEDIUM);
    }
    @Test
    public void canGetHealthierStatus(){
        assertThat(traybake.isHealthier()).isEqualTo(false);
    }
    @Test
    public void canSetHealthierStatus(){
        traybake.setHealthier(true);
        assertThat(traybake.isHealthier()).isEqualTo(true);
    }
}
