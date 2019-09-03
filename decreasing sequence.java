/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int count=0,max1=0,flag =0,index=0;
		for(int i =0;i<input2-1;i++)
		{
				if(flag==0)
				{
					index = i;
				}
				if(input1[i]>input1[i+1])
				{
					flag = 1;
					continue;
				}
				if(flag==1)
				{
					flag = 0;
					count+=1;
					if((i+1-index)>max1)
					{
						max1 = (i+1)-index;
					}
				}
			}
			if(flag==1)
			{
					count+=1;
					if((input2-index)>max1)
					{
						max1 = (input2)-index;
					}
			}
		return new Result(count,max1);
    }
}
	}
}
/*i/p: ip1= 11,3,1,4,7,8,12,2,3,7(integer )
      ip2=10(length of array)
o/p: op1=2(no of decreasing sequence-{11,3,1},{12,2})
     op2=3(max length of decreasing sequence */
