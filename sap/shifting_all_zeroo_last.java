class shifting_all_zeroo_last{
    public static void main(String[] args) {
      
        int arr[]={4,2,1,0,0,0,5,0,1,3,5,0};
        int res[]=new int[arr.length],j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                res[j++]=arr[i];
            }
        }
        for(int ele:res)
        System.out.println(ele);
    }
}