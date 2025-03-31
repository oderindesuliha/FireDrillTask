import java.util.Scanner;
public class WorldPopulation{

	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the number of year(s)");
	int years = input.nextInt();
		System.out.print("Enter growth rate per year");
		int growthRate = input.nextInt();
	 int currentPopulation = 82000000;
		
	int populationGrowth =  ((1 + growthRate)*years*years)*currentPopulation ;
	System.out.print(populationGrowth);
}
	

}
    

