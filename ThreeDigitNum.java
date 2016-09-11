/**
 * 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？ 
 * @author xudan
 *
 */
public class ThreeDigitNum {

	public static void main(String[] args) {
		
		int amount = 0;
		
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= 4; j++){
				for(int k = 1; k <= 4; k++){
					if(k != i && k != j && i != j){
						amount++;
						System.out.println(i + "" + j + "" + k);
					}
				}
			}
			
		}
		System.out.println("The number of the three-digit-number is " + amount);
	}
}
