class FirstOccur{
  public static void main(String[]args){
   int a[]={10,20,30,40,20};
   int target=20;
   int first=-1,last=-1;
   for(int i=0;i<a.length;i++){
    if(a[i]==target){
     if(first==-1){
       first=i;
     }
     last=i;
    }
   }
   System.out.println("First Occurence="+first);
   System.out.println("Last Occurence="+last);
   }
}