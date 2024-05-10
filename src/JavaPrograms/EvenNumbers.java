package JavaPrograms;

public class EvenNumbers {
	public static void main(String[] args) {
		int arr[]= {44,33,6,88,90,78,65,43,21,97,62,25};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
	}

}
