package pack;

public class Test {

	public static void main(String[] args) {
		System.out.println(WriteCode.gcd(5,10)); // 5
		System.out.println(WriteCode.gcd(35,7)); // 7
		System.out.println(WriteCode.gcd(1071,462)); // 21
		System.out.println(WriteCode.gcd(1386,3213)); // 63
		
		System.out.println(WriteCode.sumDigits(123)); // 6
		System.out.println(WriteCode.sumDigits(12345)); // 15
		System.out.println(WriteCode.sumDigits(954736163)); // 44
		
		System.out.println(WriteCode.binarySearch(new int[]{1, 3, 5, 7, 9, 11, 13}, 7)); // 3
		System.out.println(WriteCode.binarySearch(new int[]{2, 4, 6, 8, 10}, 6)); // 2
		System.out.println(WriteCode.binarySearch(new int[]{42}, 42)); // 0
		System.out.println(WriteCode.binarySearch(new int[]{10, 100, 1000, 10000, 100000}, 500)); // -1
		
		System.out.println(WriteCode.toBinary(0)); // 0
		System.out.println(WriteCode.toBinary(1)); // 1
		System.out.println(WriteCode.toBinary(5)); // 101
		System.out.println(WriteCode.toBinary(10)); // 1010
		System.out.println(WriteCode.toBinary(42)); // 101010


	}

}
