package JavaPrograms;

public class FinDupElm {
	public static void main(String[] args) {
		int arr[]= {33,44,66,76,89,80,90,32,45,56,66,78,44,90,80,33,76};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]+"");
				}
			}
		}
	}

}
