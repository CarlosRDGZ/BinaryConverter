int num = 0, bits = 0;
double exponent = 0;
while(exponent <= decimal)
{
    exponent = pow(2, num);
    bits++;
    num++;
}
System.out.println(bits);
String binaryDigits = "";

for (int i = bits; i > 0; i--)
{
    if(decimal % 2 == 0)
    {
        binaryDigits += "0";
    }
    else
    {
        binaryDigits += "1";
    }
    decimal /= 2;
}
