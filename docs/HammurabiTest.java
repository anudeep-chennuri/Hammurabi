package hammurabi.docs;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Hammurabi {

     private Hammurabi hammurabi;

     @Before
     public void setup() {
         hammurabi = new Hammurabi();
     }
     @Test
     public void askHowManyAcresToBuyTest() {
         Integer input = 10;
         Integer expected = 10;
         Integer actual = hammurabi.askHowManyAcresToBuy(input);
         Assert.assertEquals(expected, actual);
     }

     @Test
     public void askHowManyAcresToSellTest() {
         Integer input = 5;
         Integer expected = 5;
         Integer actual = hammurabi.askHowManyAcresToSell(input);
         Assert.assertEquals(expected, actual);
     }

    @Test
    public void askHowMuchGrainToFeedPeopleTest() {
        Integer input = 3;
        Integer expected = 3;
        Integer actual = hammurabi.askHowMuchGrainToFeedPeople(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void askHowManyAcresToPlantTest() {
        Integer input = 2;
        Integer expected = 2;
        Integer actual = hammurabi.askHowManyAcresToPlant(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void plagueDeathsTest() {
        Integer input = 65;
        Integer expected = 65;
        Integer actual = hammurabi.plagueDeaths();t(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void starvationDeathsTest() {
        Integer input = 65;
        Integer expected = 65;
        Integer actual = hammurabi.starvationDeaths(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void uprisingTest() {
        Integer input = 50;
        Integer expected = True;
        Integer actual = hammurabi.uprising(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void  immigrantsTest() {
        Integer input = 50;
        Integer expected = True;
        Integer actual = hammurabi. immigrants(input);
        Assert.assertEquals(expected, actual);
    }





        }


   /* int askHowManyAcresToBuy(int price, int bushels)/

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