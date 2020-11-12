// Louis Kruysse 19-123-041
// Andreas Dobler 19-105-238
// P1 Übungsserie 2 Aufgabe 2-1

package aufgabe2_1;

import java.text.DecimalFormat;
import java.util.Random;

public class RandomISBN
{

	public static void main( String args[] )
	{
		System.out.println("1st ISBN: " + makeISBN());
		System.out.println("2st ISBN: " + makeISBN());
		System.out.println("3st ISBN: " + makeISBN());
	}

	/** generates and returns a random ISBN in the format XX-XXX-XX-C */
	public static String makeISBN()
	{
		// Do NOT change the declaration of the following variables!
		String laendercode;
		String bandnr;
		String verlagsnr;
		String checksum;

		Random random = new Random();
		laendercode = Integer.toString(101 + random.nextInt(99));
		bandnr = Integer.toString(1000 + random.nextInt(1000));
		verlagsnr = Integer.toString(101 + random.nextInt(99));
		
		laendercode = laendercode.substring(1);
		bandnr = bandnr.substring(1);
		verlagsnr = verlagsnr.substring(1);
		
		int L1 = Character.getNumericValue(laendercode.charAt(0));
		int L2 = Character.getNumericValue(laendercode.charAt(1));
		int B1 = Character.getNumericValue(bandnr.charAt(0));
		int B2 = Character.getNumericValue(bandnr.charAt(1));
		int B3 = Character.getNumericValue(bandnr.charAt(2));
		int V1 = Character.getNumericValue(verlagsnr.charAt(0));
		int V2 = Character.getNumericValue(verlagsnr.charAt(1));

		checksum = Integer.toString ((hashOp(L1) + L2 + hashOp(B1) + B2 + hashOp(B3) + V1 + hashOp(V2)) % 10);

		// Do not change the following line
		return laendercode + "-" + bandnr + "-" + verlagsnr + "-" + checksum;
	}

	/** multiplies i with 2 and subtracts 9 if result is >= 10 */
	public static int hashOp(int i)
	{
		// Do NOT change this method!
		int doubled = 2 * i;
		if (doubled >= 10) {
			doubled = doubled - 9;
		}
		return doubled;
	}
}
