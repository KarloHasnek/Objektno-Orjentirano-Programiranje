package zadatak2;

import java.text.ParseException;

public class App {

	public static void main(String[] args) throws ParseException {

		Robot rob = new Robot("mr Roboto");
		Person prs = new Person("Roberta", 22);

		System.out.println("********** Robot **************");
		rob.talk("Sentences");
		rob.think("Life");
		rob.walk("South", 123);
		System.out.println(rob.calculate(9));
		System.out.println("********** Person **************");
		prs.talk("Sentences");
		prs.think("Life");
		prs.walk("North", 50);
		System.out.println(prs.calculate(9));


	}

}
