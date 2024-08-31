import java.io.*;
import java.util.*;
public class ancient_manuscript {
	static Scanner sc;
	public static void main(String[] args) throws IOException 
	{
		String readPath = "C:\\Users\\Eren\\Desktop\\Ancient_Manuscript.txt", writePath = "C:\\Users\\Eren\\Desktop\\words.txt";
		ProcessAncientM(readPath, writePath);
	}
	public static void ProcessAncientM(String rPath, String wPath) throws IOException
	{
		HashMap<String, Integer> map = new HashMap<>();
		openFile(rPath); // Opened the file for reading from file with scannner operation
		ArrayList<String[]> list = new ArrayList<>(); 
		File file = new File(wPath);
		FileWriter fileW = new FileWriter(file);
		BufferedWriter buffW = new BufferedWriter(fileW);
		while(sc.hasNextLine()) // Clean all the words from punctuation marks and add cleaned words to an array then to array list in order to use words later on.
		{
			String[] line = sc.nextLine().split(" "); // split the line
			String[] cleanLine = new String[line.length]; // initialize cleanLine Array in order to save words to array list as string array
			int counter = 0; 
			for(String word : line)
			{
				word = word.replaceAll("'s\\b", "").replaceAll("[^a-zA-Z'-]", "").toLowerCase();
				cleanLine[counter] = word; 
				counter++;
			}			
			for(String word : cleanLine) // add the words in the line to the map
			{
				if(!map.containsKey(word) && !word.isEmpty())
					map.put(word, 0);
			}
			list.add(cleanLine); // add line to the arraylist
 		}
		for(int i = 0; i < list.size(); i++) // increase the word numbers that contains in the folder
		{
			for(int j = 0; j < list.get(i).length; j++)
			{
				if(map.containsKey(list.get(i)[j])) 
					map.put(list.get(i)[j], map.get(list.get(i)[j]) + 1); // increase the value of hashmap for current keyword 
			}
		}
		for(String key : map.keySet()) // write them into the buffer in an appropriate structure.
		{
			buffW.write(key + ": " + map.get(key)); 
			buffW.newLine();
		}
		buffW.close();
		fileW.close();
		closeFile();
	}
	public static void openFile(String rPath) throws FileNotFoundException
	{
		File file = new File(rPath);
		sc = new Scanner(file);
	}
	public static void closeFile()
	{
		sc.close();
	}
}
