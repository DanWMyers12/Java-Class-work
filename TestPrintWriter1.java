import java.io.*;

class TestPrintWriter1
{
public static void main (String[] args) throws IOException
{ 
File				outFile			= new File("sample4.data");
FileOutputStream	outFileStream	= new FileOutputStream(outFile);
PrintWriter			outStream		= new PrintWriter(outFileStream);

outStream.print(987654321);
outStream.print(11111111L);
outStream.print(22222222F);
outStream.print(33333333D);
outStream.print('A');
outStream.print(true);

outStream.close();
}
}