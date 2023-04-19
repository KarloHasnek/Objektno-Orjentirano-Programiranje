package zadatak10;
    
import java.util.Arrays;

public class CliMutImut {

	public static void main(String[] args) {
		String somStr = "Neki ne poseban string";
		int[] nums = {23, 3, 55, 789, 123, 100};
		/*
		 * to print each character in the string
		 * please see String JAVA API
		 */

		for (int k = 0; k < somStr.length(); k++) {
			System.out.println(somStr.charAt(k));
		}
		System.out.println("******************** Analysing String ********************");
		System.out.print("Before some changes in the string - ");
		System.out.println(somStr.getClass().getCanonicalName() + "@" + Integer.toHexString(somStr.hashCode()));
		System.out.println(somStr);
		String newStr = somStr.replace("g", "G");
		System.out.print("After some changes in the string - ");
		System.out.println(newStr.getClass().getCanonicalName() + "@" + Integer.toHexString(newStr.hashCode()));
		System.out.println(newStr);
		System.out.println("****************** Analysing int Arrays ******************");
		System.out.print("Before some changes in an array - ");
		System.out.println(nums.getClass().getCanonicalName() + "@" + Integer.toHexString(nums.hashCode()));
		System.out.println(Arrays.toString(nums));
		nums[nums.length-2] = 100000;
		System.out.print("After some changes in an array - ");
		System.out.println(nums.getClass().getCanonicalName() + "@" + Integer.toHexString(nums.hashCode()));
		System.out.println(Arrays.toString(nums));
	}

}


/*
 Kroz ovaj program smo dokazali da kod mjenjanja vrijednosti unutar Stringa mijenja se i njegov hash code, sto znaci 
 da prilikom promjene stringa stari se brise i stvara se novi na novoj memorijskoj lokaciji, dok kod int array promjenom neke
 vrijednosti mijenja se vec postojeci Array bez kreiranja novog na novoj memorijskoj lokaciji.
 */
