import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;

public class Class {

	String line;
	String newL;
	String oldL = "";

	public Class() {

		Change();
	}

	public static void main(String[] args) {
		Class cl = new Class();

	}

	void Change() {
		readFile();

		String[] lines = oldL.split("\n");

		for (String eachLine : lines) {

       oldL=eachLine.replace("0x81", "0x99");
       System.out.println(oldL);

		}
	}

	void readFile() {

		try (BufferedReader bf = new BufferedReader(new FileReader("C:\\File.txt"))) {

			while (true) {
				line = bf.readLine();

				if (line == null)

					break;
				oldL += line;

			}
			bf.close();
		} catch (IOException ex) {

		}

	}

	void writeFile() {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\NewFile.txt"))) {

		} catch (IOException ex) {

			System.out.println(ex.getMessage());
		}
	}
}
