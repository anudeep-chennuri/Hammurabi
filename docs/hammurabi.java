package hammurabi.docs;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;




public class Hammurabi {
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();


	public static void main(String[] args) {
		new Hammurabi.playGame();
	}



		void playgame(){

		//starting variables:
		int year = 1;
		int population = 100;
		int bushels = 2800;
		int acresOfLand = 1000;
		int landValue = 19;
		int immigrants = 0;
		int starved = 0;
		int plagueDeath = 0;
		int bushelsAteByRats = 0;
		int harvest = 2800;
		int bushelsUsedAsSeed=0;

	}


String message(){
		String message = "Congratulations, you are the newest ruler of ancient Sumer, elected for a ten year term of office. Your duties are to dispense food, direct farming, and buy and sell land as needed to support your people. Watch out for rat infestiations and the plague! Grain is the general currency, measured in bushels. The following will help you in your decisions:**\n" +
				" \n" +
				" Each person needs at least 20 bushels of grain per year to survive**\n" +
				" Each person can farm at most 10 acres of land**\n" +
				" It takes 2 bushels of grain to farm an acre of land**\n" +
				" The market price for land fluctuates yearly**\n" +
				" \n" +
				" Rule wisely and you will be showered with appreciation at the end of your term. Rule poorly and you will be kicked out of office!";

		return message;
	}

String Summary(int year, int starved, int immigrants, int population, int harvest, int bushelsUsedAsSeed, int bushelsAteByRats, int bushels, int acresOfLand, int landValue){
		String summary = "O great Hammurabi!\n\n"
				+ "You are in year " + year + " of your ten rule\n"
				+ "In the previous year " + starved + " people starved to death.\n"
				+ "In the previous year " + immigrants + " people entered the kingdom.\n"
				+ "The population is now " + population + ".\n"
				+ "We harvested " + harvest + " bushels at " + bushelsUsedAsSeed + " bushels per acre.\n"
				+ "Rats destroyed " + bushelsAteByRats + " bushels, leaving " + bushels + " bushels in storage.\n"
				+ "The city owns " + acresOfLand + " acres of land.\n"
				+ "Land is currently worth " + landValue + " bushels per acre.\n";

	return summary;


}



	public int askHowManyAcresToBuy(int price, int bushels){



	}

	public  int askHowManyAcresToSell(int acresOwned){

	}

	public int askHowMuchGrainToFeedPeople(int bushels){

	}
	public int askHowManyAcresToPlant(int acresOwned, int population, int bushels){

	}

	public int  plagueDeaths(int population){

	}

	public int starvationDeaths(int population, int bushelsFedToPeople){


	}

	public boolean uprising(int population, int howManyPeopleStarved){
		if (howManyPeopleStarved > (population * .45)){return true;}
		else return false;
	}

	 public int  immigrants(int population, int acresOwned, int grainsInStorage){

	}

	 public int harvest(int acres, int bushelsUsedAsSeed){


	}

	public int grainsEatenByRats(int bushels){

	}

	public int newCostOfLandTest(){

	}




}
//	static int totalDeaths = 0, percentDied = 0, year = 0, population = 95, stores = 2800, immigrants = 5, deaths,
//		harvest = 3000, yeild = 3, acres = harvest / yeild, eaten = harvest - stores, landPrice, fullPeople, temp;
//	static boolean plague = false;
//	final static String FINK = "DUE TO THIS EXTREME MISMANAGEMENT YOU HAVE NOT ONLY\n" +
//		"BEEN IMPEACHED AND THROWN OUT OF OFFICE BUT YOU HAVE\n" +
//		"ALSO BEEN DECLARED PERSONA NON GRATA!!\n";
//	Scanner input = new Scanner(System.in);
//
//	private void newYear() {
//		year += 1;
//		population += immigrants;
//		landPrice = (int) (10 * Math.random() + 17);
//		System.out.println(report());
//		do {
//			System.out.print("HOW MANY ACRES DO YOU WISH TO BUY?  ");
//			temp = input.nextInt();
//			if (temp < 0)
//				epicFail(0);
//			if (temp * landPrice > stores)
//				System.out.println("HAMURABI:  THINK AGAIN. YOU HAVE ONLY\n" +
//						stores + " BUSHELS OF GRAIN. NOW THEN,");
//		} while (temp * landPrice > stores);
//		acres += temp;
//		stores -= temp * landPrice;
//		do {
//			System.out.print("HOW MANY ACRES DO YOU WISH TO SELL?  ");
//			temp = input.nextInt();
//			if (temp < 0)
//				epicFail(0);
//			if (temp > acres)
//				System.out.println("HAMURABI:  THINK AGAIN. YOU OWN ONLY " + acres + " ACRES. NOW THEN,");
//		} while (temp > acres);
//		stores += temp * landPrice;
//		acres -= temp;
//		do {
//			System.out.print("\nHOW MANY BUSHELS DO YOU WISH TO FEED YOUR PEOPLE?  ");
//			temp = input.nextInt();
//			if (temp < 0)
//				epicFail(0);
//			if (temp > stores)
//				System.out.println("HAMURABI:  THINK AGAIN. YOU HAVE ONLY\n" +
//						stores + " BUSHELS OF GRAIN. NOW THEN,");
//		} while (temp > stores);
//		fullPeople = temp / 20;
//		stores -= temp;
//		do {
//			System.out.print("\nHOW MANY ACRES DO YOU WISH TO PLANT WITH SEED?  ");
//			temp = input.nextInt();
//			if (temp < 0)
//				epicFail(0);
//			if (temp > acres)
//				System.out.println("HAMURABI:  THINK AGAIN. YOU OWN ONLY " + acres + " ACRES. NOW THEN,");
//			if (temp / 2 > stores)
//				System.out.println("HAMURABI:  THINK AGAIN. YOU HAVE ONLY\n" +
//						stores + " BUSHELS OF GRAIN. NOW THEN,");
//			if (temp > population * 10)
//				System.out.println("BUT YOU HAVE ONLY" + population + "PEOPLE TO TEND THE FIELDS. NOW THEN,");
//		} while (temp > acres || temp / 2 > stores || temp > population * 10);
//		stores -= temp / 2;
//		yeild = (int) (Math.random() * 5 + 1);
//		harvest = temp * yeild;
//		temp = (int) (Math.random() * 5 + 1);
//		if (temp % 2 != 1)
//			eaten = (stores / temp);
//		else
//			eaten = 0;
//		stores += (harvest - eaten);
//		immigrants = (int) (Math.random() * 5 + 1) *
//					(20 * acres + stores) / population / 100 + 1;
//		if (population > fullPeople) {
//			deaths = population - fullPeople;
//			if (deaths > .45 * population)
//				epicFail(1);
//			percentDied = ((year - 1) * percentDied + deaths * 100 / population) / year;
//			population = fullPeople;
//			totalDeaths += deaths;
//		}
//		if (20 * Math.random() >= 17)
//			plague = true;
//		plague = false;
//	}
//
//	private static String report() {
//		String answer = "\nHAMURABI:  I BEG TO REPORT TO YOU,\n" +
//				"IN YEAR " + year + ", " + deaths + " PEOPLE STARVED, " + immigrants + " CAME TO THE CITY.\n";
//		if (plague) {
//			population = population / 2;
//			answer += "A HORRIBLE PLAGUE STRUCK!  HALF THE PEOPLE DIED.\n";
//		}
//		answer += "POPULATION IS NOW " + population + ".\n" +
//				"THE CITY NOW OWNS " + acres + " ACRES.\n" +
//				"YOU HARVESTED " + yeild + " BUSHELS PER ACRE.\n" +
//				"RATS ATE " + eaten + " BUSHELS.\n" +
//				"YOU NOW HAVE " + stores + " BUSHELS IN STORE\n\n" +
//				"LAND IS TRADING AT " + landPrice + " BUSHELS PER ACRE.";
//		return answer;
//	}
//
//
//	private static void epicFail(int x) {
//		String reason = "";
//		switch (x) {
//		case 0: reason = "HAMURABI:  I CANNOT DO WHAT YOU WISH.\n" +
//			"GET YOURSELF ANOTHER STEWARD!!!!!"; break;
//		case 1: reason = "YOU STARVED " + deaths + " PEOPLE IN ONE YEAR!!!\n" +
//			FINK; break;
//		}
//		System.out.println(reason);
//		System.exit(0);
//	}
//
//	private void finished() {
//		String answer = "IN YOUR 10-YEAR TERM OF OFFICE, " + percentDied + " PERCENT OF THE\n" +
//			"POPULATION STARVED PER YEAR ON AVERAGE, I.E., A TOTAL OF\n" +
//			totalDeaths + " PEOPLE DIED!!\n" +
//			"YOU STARTED WITH 10 ACRES PER PERSON AND ENDED WITH\n" +
//			acres / population + " ACRES PER PERSON\n\n";
//		if (percentDied > 33 || acres / population < 7)
//			answer += FINK;
//		else if (percentDied > 10 || acres / population < 9)
//			answer += "YOUR HEAVY-HANDED PERFORMANCE SMACKS OF NERO AND IVAN IV.\n" +
//					"THE PEOPLE (REMAINING) FIND YOU AN UNPLEASANT RULER, AND,\n" +
//					"FRANKLY, HATE YOUR GUTS!";
//		else if (percentDied > 3 || acres / population < 10)
//			answer += "YOUR PERFORMANCE COULD HAVE BEEN SOMEWHAT BETTER, BUT\n" +
//					"REALLY WASN'T TOO BAD AT ALL.\n" +
//					Math.random() * population * .8 + " PEOPLE WOULD" +
//					"DEARLY LIKE TO SEE YOU ASSASSINATED BUT WE ALL HAVE OUR" +
//					"TRIVIAL PROBLEMS";
//		else
//			answer += "A FANTASTIC PERFORMANCE!!!  CHARLEMANGE, DISRAELI, AND\n" +
//					"JEFFERSON COMBINED COULD NOT HAVE DONE BETTER!";
//		answer += "\n\n\n\n\n\n\n\n\n\nSo long for now.";
//		System.out.println(answer);
//	}
//
//	public static void main(String[] args) throws IOException {
//		HAMURABI a = new HAMURABI();
//		System.out.println("\t\t\t\tHAMURABI\n\t       CREATIVE COMPUTING MORRISTOWN, NEW JERSEY\n\n" +
//				"TRY YOUR HAND AT GOVERNING ANCIENT SUMERIA\nSUCCESSFULLY FOR A TEN-YEAR TERM OF OFFICE.");
//		while (year < 10)
//			a.newYear();
//		a.finished();
//	}