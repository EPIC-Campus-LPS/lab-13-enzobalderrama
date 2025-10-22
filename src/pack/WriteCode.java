package pack;

public class WriteCode {
	 public static int gcd(int a, int b) {
		 int gcd = -1;
		 while (gcd == -1) {
			 if (a > b) {
				 int test = b;
				 b = a;
				 a = test;
			 }
			 if (b%a == 0) {
				 gcd = a;
			 }
		     b = b%a;
		 }
		 return gcd;
	 }
	 
	 public static int sumDigits(int a) {
		 int digits = 0;
		 while(a >= 1) {
			 digits += a%10;
			 a/=10;
		 }
		 return digits;
	 }
	 
	 public static int binarySearch(int[] a, int b) {
		 int high = a.length;
		 int low = 0;
		 int count = 0;
		 boolean foundTarget = false;
		 while(foundTarget == false) {
			 count++;
			 int mid = low + (high - low) / 2;
			 if (a[mid] == b) {
				 foundTarget = true;
				 b = mid;
				 return b;
			 }
			 if (a[mid] > b) {
				 mid--;
			 }
			 if (a[mid] < b) {
				 mid++;
			 }
			 if (count > a.length) {
				 break;
			 }
		 }
		 return -1;
		 
	 }
	 
	 public static int toBinary(int a) {
		 while (a>0) {
			 
		 }
		 return a;
	 }
}
