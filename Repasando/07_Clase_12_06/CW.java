class MinMax {

	public static void main(String args[]) {

	}

	public static int[] minMax(int[] arr) {
		int i, max = 0, min = 0;
		for(i = 0; i < arr.length; i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			if(max<arr[i])
			{
				max=arr[i];
			}
		}

		return arr;

	}
}