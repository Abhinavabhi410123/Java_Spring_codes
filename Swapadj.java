class Jtest{
public static void main(String[] args){
int a[]={10,20,30,40,50,60,70};
int l = a.length,temp=0;
for(int i=0;i<a.length-1;i++){
if(
temp = a[i];
a[i]=a[i+1];
a[i+1]=temp;

}
temp = a[a.length-2];
a[a.length-2]=a[a.length-1];
a[a.length-1]=temp;
for(int j=0;j<a.length;j++){
System.out.println(a[j]);
}
}
}

