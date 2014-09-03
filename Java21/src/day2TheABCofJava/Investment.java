package day2TheABCofJava;

public class Investment {

	public static void main(String[] args) {
	      float investment = 14000;
	        System.out.println("Original investment: $" + investment);
	        // Inceases by 40 percent the first year
	        investment = investment + (investment * .4F);
	        System.out.println("After one year: $" + investment);
	        // Loses $1,500 the second year
	        investment = investment - 1500F;
	        System.out.println("After two years: $" + investment);
	        // Increases by 12 percent the third year
	        investment = investment + (investment * .12F);
	        System.out.println("After three years: $" + investment);
	}

}
