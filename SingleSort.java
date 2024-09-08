class Jtest2{
public static void main(String []args){
int a[] = {10,9,2,5,1,6,3};
int temp =0;
for(int i=0;i<a.length-1;i++){
if(a[i]>a[i+1]){
temp = a[i];
a[i]=a[i+1];
a[i+1]=temp;
i=-1;
}
}
for(int j=0;j<a.length;j++){
System.out.println(a[j]);
}
}
}