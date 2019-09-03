import java.io..*;
import java.util;
class usermaincode
{
public int sumofpowerofdigit(int input1)
{
String str=Integer.toString(input1);
		int sum=0;
		for(int i=0;i<str.length()-1;i++)
		{
			int a=(int)Math.pow((int)str.charAt(i)-'0',(int)str.charAt(i+1)-'0');
			sum+=a;
		}
		return sum+1;
 }
}
//ip:582109
//op:390693(5^8+8^2+2^1+1^0+0^9+9^0)
