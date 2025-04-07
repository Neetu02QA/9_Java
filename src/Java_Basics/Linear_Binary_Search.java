package Java_Basics;

public class Linear_Binary_Search {

	public static void main(String[] args) {
		int arr[]= {23,34,67,12};
		
		System.out.println("linear number------->"+liner(arr,12));
		}
		public static int liner(int arr[], int x)
		{
		for (int i = 0; i < arr.length; i++) {
		if (arr[i] == x)
		return i;
		}
		return -1;
		}

}


class GFG {
    public static int liner(int arr[], int x)
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
          int arr[] = { 12, 114, 0, 4, 9 };
   
        int search = liner(
            arr,
            4); // Here we are searching for 10 element in
                 // the array which is not present in the
                 // array so, it will print -1
        System.out.println(search);
    }
}

/*
public class GFG {
    public static int binary(int arr[], int x)
    {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (x == arr[mid]) {
                return mid;
            }
            else if (x > arr[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = { 2, 4, 5, 7, 14, 17, 19, 22};
        int search = binary(arr, 22);
        System.out.println(search);
    }
}*/