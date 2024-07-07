class minarr{
    public static void main(String[] args) {
        int arr[]= {10,1,5,23,7,8,6,12,2,5,44,33};
        int n= arr.length;
        int ls=100,sum=0,k=2,e=0;

        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(i>=k){
                sum-=arr[e++] ;       
                if(ls>sum)
                    ls=sum; 
            
        }
        System.out.println(ls);
    }
}
}