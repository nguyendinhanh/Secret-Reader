import java.awt.Color;
import java.util.Scanner;

public class SecretReader 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner ( System.in );
		System.out.print("What file would you like to read a secret from? ");
		String file = in.next();

		Picture picture = new Picture ( file );

		int total = 0; 
		int count = 0;

		for ( int i = 0; i < picture.width(); i++)
			for ( int j = 0; j < picture.height(); j++)
			{

				Color c = picture.get(i, j);
				int red = c.getRed();
				int green = c.getGreen();
				int blue = c.getBlue();

				total += total;
				total += red%2;
				total += total;

				total += green%2;
				total += total;

				total += blue%2;
				count = count + 1;


				if (count % 2 == 0)
				{
					if ( total < 26)
					{
						total =( total + 'a');
						System.out.print((char)total);
					}
					else if ( total == 26 )
					{
						System.out.print(" ");
					}
					total = 0;
				}
			}
	}
}
