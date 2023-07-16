
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestHammurabi {

     Hammurabi hamm;

    boolean about(double expected, double actual) {
        return actual > 0.90 * expected && actual < 1.10 * expected;

     @Before
     @Before
        public void setUp() throws Exception {
            hamm = new Hammurabi();
     }
     @Test
     public final void askHowManyAcresToBuyTest() {
         Integer input = 10;
         Integer expected = 10;
         Integer actual = hamm.askHowManyAcresToBuy(input);
         Assert.assertEquals(expected, actual);
     }

     @Test
     public final void askHowManyAcresToSellTest() {
         Integer input = 5;
         Integer expected = 5;
         Integer actual = hamm.askHowManyAcresToSell(input);
         Assert.assertEquals(expected, actual);
     }

    @Test
    publicc final void askHowMuchGrainToFeedPeopleTest() {
        Integer input = 3;
        Integer expected = 3;
        Integer actual = hamm.askHowMuchGrainToFeedPeople(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public final void askHowManyAcresToPlantTest() {
        Integer input = 2;
        Integer expected = 2;
        Integer actual = hamm.askHowManyAcresToPlant(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public final void plagueDeathsTest() {
        Integer input = 65;
        Integer expected = 65;
        Integer actual = hamm.plagueDeaths();t(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public final void starvationDeathsTest() {
        Integer input = 65;
        Integer expected = 65;
        Integer actual = hamm.starvationDeaths(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public final void uprisingTest() {
        Integer input = 50;
        Integer expected = True;
        Integer actual = hamm.uprising(input);
        Assert.assertEquals(expected, actual);
    }

   // @Test
    //public void  immigrantsTest() {
        //Integer input = 50;
       // Integer expected = True;
       // Integer actual = hammurabi.immigrants(input);
        //Assert.assertEquals(expected, actual);
    //}
   @Test
   public final void harvestTest() {
       Integer input = 50;
       Integer expected =150;
       Integer actual = hamm.harvest(input);
       Assert.assertEquals(expected, actual);
   }
    @Test
    public final void grainEatenByRatsTest() {
        Integer input =0;
        Integer expected = 0;
        Integer actual = hamm.harvest(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public final void newCostOfLandTest() {
        Integer input =0;
        Integer expected = 0;
        Integer actual = hamm.newCostOfLand(input);
        Assert.assertEquals(expected, actual);
    }
}}


   /* int askHowManyAcresToBuy(int price, int bushels)

    int askHowManyAcresToSell(int acresOwned)

    int askHowMuchGrainToFeedPeople(int bushels)

    int askHowManyAcresToPlant(int acresOwned, int population, int bushels)

    int plagueDeaths(int population)

    int starvationDeaths(int population, int bushelsFedToPeople)

    boolean uprising(int population, int howManyPeopleStarved)

    int immigrants(int population, int acresOwned, int grainInStorage)

    int harvest(int acres, int bushelsUsedAsSeed)

    int grainEatenByRats(int bushels)

    int newCostOfLand()