import java.io.*;
import javax.swing.*;

public class testFileChooser
{
	public static void main (String[] args)
	{
		JFileChooser chooser;
		File file, directory;
		int status;
		
		// Select a file to open
		
		chooser = new JFileChooser();
		status = chooser.showOpenDialog(null);
		
		if (status == JFileChooser.APPROVE_OPTION)
		{
			file = chooser.getSelectedFile();
			directory = chooser.getCurrentDirectory();
			System.out.println("Directory:\t\t\t" + directory.getName());
			System.out.println("File Selected to Open:\t" + file.getName());
			System.out.println("Full path name:\t\t\t" + file.getAbsolutePath());
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Open File dialog canceled!");
		}
		
		// Select a file to save to
		
		System.out.println("\n\n");
		status = chooser.showSaveDialog(null);
		
		if (status == JFileChooser.APPROVE_OPTION)
		{
			file = chooser.getSelectedFile();
			directory = chooser.getCurrentDirectory();
			System.out.println("Directory:\t\t\t" + directory.getName());
			System.out.println("File Selected for saving dara:\t" + file.getName());
			System.out.println("Full path name:\t\t\t" + file.getAbsolutePath());
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Save File dialog canceled!");
		}
		System.exit(0);
	}
}