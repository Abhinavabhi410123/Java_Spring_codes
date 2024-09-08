package Jarraysums;

class MyClass {
    public static void main(String args[]) {
 recursion obj = new recursion() ;
 System.out.print(obj.func(5));  
    }
}
class recursion
{
     int result=1;
  int func (int n)
{
 
  if (n == 1)
  return result;
else
 result = result*n;
  return func(n-1);
  }
  } 