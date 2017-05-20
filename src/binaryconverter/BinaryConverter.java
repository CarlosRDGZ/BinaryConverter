package binaryconverter;

import static java.lang.Math.pow;

public class BinaryConverter
{
    public static String toBinary(int decimal)
    {
        int bits = 0;
        double exponent = 1;
        String binaryDigits = "";
        if(decimal != 0)
        {
            while(decimal >= exponent)
            {
                bits++;
                exponent = pow(2, bits);
            }

            //for (int i = bits; i > 0; i--)
            for (int i = 7; i >= 0; i--)
            {

                if(decimal % 2 == 0)
                {
                    binaryDigits = "0" + binaryDigits;
                }
                else
                {
                    binaryDigits = "1" + binaryDigits;
                }
                decimal /= 2;
            }

        }

        return binaryDigits;
    }

    public static String toDecimal(String binary)
    {
        int decimal = 0;
        int exponent = (binary.length() - 1);

        for (int i = 0; i < binary.length(); i++)
        {
            if (binary.charAt(i) == '1')
            {
                decimal += pow(2, exponent);
            }
            exponent--;
        }
        return Integer.toString(decimal);
    }
}
