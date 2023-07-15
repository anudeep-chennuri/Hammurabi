package hammurabi.docs;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
 public class Hammurabi {

     private Hammurabi hammur;

     @Before
     public void setup() {
         hammur = new Hammurabi();
     }

     @Test
     public void askHowManyAcresToSellTest() {
         Integer input = 5;
         Integer expected = 5;
         Integer actual = hammur.askHowManyAcresToSell(input);
         Assert.assertEquals(expected, actual);
     }
 }


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