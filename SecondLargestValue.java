package StringsPackage;

class SecondLargestValue {
    public static void main(String[] args) {
        int arr[]={1,9,2,7,10,88,16,3};
        int first=Integer.MIN_VALUE, second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(first<arr[i]){
                second=first;
                first=arr[i];
                
            }
            else if(second < arr[i] && arr[i]!=first)
            {
                second=arr[i];
            }
        }
        System.out.println(second);
    }
}
