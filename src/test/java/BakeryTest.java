import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BakeryTest {

    Bakery bakery;
    Traybake traybake;
    TieredCake tieredCake;
    Cupcake cupcake;

    @BeforeEach
    public void setUp(){
        bakery = new Bakery("bakeryName", new ArrayList(), 0.00);
    }

    @Test
    public void canGetName(){
        assertThat(bakery.getName()).isEqualTo("bakeryName");
    }
    @Test
    public void canSetName(){
        bakery.setName("bakeryName2");
        assertThat(bakery.getName()).isEqualTo("bakeryName2");
    }
//    @Test
//    public void canGetStock(){
//        bakeryName.addItemToStock(Coffee);
//        assertThat(bakeryName.getStock().size()).isEqualTo(1);
//    }
//    @Test
//    public void canSetStock(){
//        bakeryName.setStock(4.99);
//        assertThat(bakeryName.getStock()).isEqualTo(4.99);
//    }
    @Test
    public void canGetTill(){
        assertThat(bakery.getTill()).isEqualTo(0.00);
    }
    @Test
    public void canSetTill(){
        bakery.setTill(4.99);
        assertThat(bakery.getTill()).isEqualTo(4.99);
    }

//
////    CUSTOM METHODS

//    @Test
//    public void canAddTieredCakeToStock_test1(){
//        tieredCake = new TieredCake("cheesecake", "lime", 5.99, 11.99, "green", "square", "yellow", new String[]{"nuts", "strawberries"}, 3);
//        bakery.addTieredCakeToStock(tieredCake);
//        assertThat(bakery.getStock().size()).isEqualTo(1);
//        assertThat(tieredCake.getStockCountOfItem()).isEqualTo(1);
//    }
//
//    @Test
//    public void canAddTieredCakeToStock_test2(){
//        tieredCake = new TieredCake("cheesecake", "lime", 5.99, 11.99, "green", "square", "yellow", new String[]{"nuts", "strawberries"}, 3);
//        bakery.addTieredCakeToStock(tieredCake, 5);
//        assertThat(bakery.getStock().size()).isEqualTo(1);
//        assertThat(tieredCake.getStockCountOfItem()).isEqualTo(5);
//    }
//
//    @Test
//    public void canAddTieredCakeToStock_test3(){
//        tieredCake = new TieredCake("cheesecake", "lime", 5.99, 11.99, "green", "square", "yellow", new String[]{"nuts", "strawberries"}, 3);
//        bakeryName.addTieredCakeToStock(tieredCake, 5);
//        bakeryName.addTieredCakeToStock(tieredCake, 5);
//        assertThat(bakeryName.getStock().size()).isEqualTo(1);
//        assertThat(tieredCake.getStockCountOfItem()).isEqualTo(10);
//    }
//
//    @Test
//    public void canAddTieredCakeToStock_test4(){
//        tieredCake = new TieredCake("cheesecake", "lime", 5.99, 11.99, "green", "square", "yellow", new String[]{"nuts", "strawberries"}, 3);
//        bakeryName.addTieredCakeToStock(tieredCake, 5);
//        bakeryName.addTieredCakeToStock(tieredCake, 5);
//
//        TieredCake tieredCake2 = new TieredCake("raspberry", "lime", 5.99, 11.99, "green", "square", "yellow", new String[]{"nuts", "strawberries"}, 3);
//        bakeryName.addTieredCakeToStock(tieredCake2, 5);
//        bakeryName.addTieredCakeToStock(tieredCake2, 5);
//
//        assertThat(bakeryName.getStock().size()).isEqualTo(1); // failing test because of this line - stockCountOfItem is a property of TieredCake - tieredCake and tieredCake2 are considered different only because of their different stockCountOfItem integer (I think?)
//        assertThat(tieredCake.getStockCountOfItem()).isEqualTo(10);
//        assertThat(tieredCake2.getStockCountOfItem()).isEqualTo(10);
//    }
//
//
//    @Test
//    public void canAddTraybakeToStock_test1(){
//        traybake = new Traybake("cheesecake", "lime", 5.99, 11.99, "square", "small");
//        bakeryName.addTraybakeToStock(traybake);
//        assertThat(bakeryName.getStock().size()).isEqualTo(1);
//        assertThat(traybake.getStockCountOfItem()).isEqualTo(1);
//    }
//    @Test
//    public void canAddTraybakeToStock_test4(){
//        traybake = new Traybake("cheesecake", "lime", 5.99, 11.99, "square", "small");
//        bakeryName.addTraybakeToStock(traybake, 5);
//        bakeryName.addTraybakeToStock(traybake, 5);
//
//        assertThat(bakeryName.getStock().size()).isEqualTo(1);
//        assertThat(traybake.getStockCountOfItem()).isEqualTo(10);
//    }
//
//    @Test
//    public void canAddCupcakeToStock_test1(){
//        cupcake = new Cupcake("cheesecake", "lime", 5.99, 11.99, "square", "small");
//        bakeryName.addCupcakeToStock(cupcake);
//        assertThat(bakeryName.getStock().size()).isEqualTo(1);
//        assertThat(cupcake.getStockCountOfItem()).isEqualTo(1);
//    }
//    @Test
//    public void canAddCupcakeToStock_test4(){
//        cupcake = new Cupcake("cheesecake", "lime", 5.99, 11.99, "square", "small");
//        bakeryName.addCupcakeToStock(cupcake, 5);
//        bakeryName.addCupcakeToStock(cupcake, 5);
//
//        assertThat(bakeryName.getStock().size()).isEqualTo(1);
//        assertThat(cupcake.getStockCountOfItem()).isEqualTo(10);
//    }
//
//    @Test
//    public void canAddItemsToStock(){
//        traybake = new Traybake("cheesecake", "lime", 5.99, 11.99, "square", "small");
//        bakeryName.addTraybakeToStock(traybake, 5);
//        bakeryName.addTraybakeToStock(traybake, 5);
//        bakeryName.addTraybakeToStock(traybake);
//        assertThat(traybake.getStockCountOfItem()).isEqualTo(11);
//
//        cupcake = new Cupcake("muffin", "lime", 5.99, 11.99, "square", "small");
//        bakeryName.addCupcakeToStock(cupcake, 5);
//        bakeryName.addCupcakeToStock(cupcake, 5);
//        bakeryName.addCupcakeToStock(cupcake);
//        assertThat(cupcake.getStockCountOfItem()).isEqualTo(11);
//
//
//        assertThat(bakeryName.getStock().size()).isEqualTo(2);
//    }

    @Test
    public void canCalculateProfit(){
        assertThat(bakery.calculateProfit()).isEqualTo(0);
    }
}
