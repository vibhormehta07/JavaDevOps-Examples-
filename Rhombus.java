package My_pack;

public class Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int space,j,i;
for(i=1;i<=4;i++)
{
	for(space=4-i;space>0;space--)
		System.out.print(' ');
	for(j=2*i-1;j>0;j--)
		System.out.print("x");
	System.out.println();
}
for(i=3;i>=0;i--)
{
	for(space=0;space<4-i;space++)
		System.out.print(' ');
	for(j=0;j<2*i-1;j++)
		System.out.print("x");
	System.out.println();
}
	}

}
