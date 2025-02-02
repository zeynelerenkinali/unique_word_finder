# Ancient Manuscript Word Processor

This Java program processes an ancient manuscript text file, cleans the words from punctuation marks, and counts the frequency of each word. The results are then written to a new text file.

## Features

- **Text File Processing.**
  - Reads a text file from a specified path.
  - Cleans words by removing punctuation marks and converting them to lowercase.
  - Counts the frequency of each word in the text.

- **Output File Generation.**
  - Writes the word frequencies to a new text file in a structured format.

## How It Works

1. **Reading the Input File.**
   - The program reads the input text file line by line using a `Scanner`.
   - Each line is split into individual words.

2. **Cleaning Words.**
   - Words are cleaned by removing punctuation marks (except apostrophes and hyphens) and converting them to lowercase.
   - The cleaned words are stored in an `ArrayList` for further processing.

3. **Counting Word Frequencies.**
   - A `HashMap` is used to store each word and its frequency.
   - The program iterates through the cleaned words and updates their counts in the `HashMap`.

4. **Writing to the Output File.**
   - The word frequencies are written to a new text file using a `BufferedWriter`.
   - Each line in the output file contains a word followed by its frequency count.

## Code Structure

- **Main Class: `ancient_manuscript`.**
  - Contains the `main` method, which specifies the input and output file paths.
  - Calls the `ProcessAncientM` method to process the text file.

- **Methods:**
  - `ProcessAncientM(String rPath, String wPath)`: Processes the input file, cleans the words, counts their frequencies, and writes the results to the output file.
  - `openFile(String rPath)`: Opens the input file for reading.
  - `closeFile()`: Closes the input file after processing.

## Usage

1. **Set File Paths.**
   - Modify the `readPath` and `writePath` variables in the `main` method to specify the input and output file paths.

2. **Run the Program.**
   - Compile and run the `ancient_manuscript` class.
   - The program will read the input file, process the text, and generate the output file with word frequencies.

## Example

### Input File (`Ancient_Manuscript.txt`): The quick brown fox jumps over the lazy dog. The dog was not amused.
### Output File (`words.txt`):
the: 3
quick: 1
brown: 1
fox: 1
jumps: 1
over: 1
lazy: 1
dog: 2
was: 1
not: 1
amused: 1

## Dependencies

- **Java Standard Library.**
  - The program uses standard Java classes such as `Scanner`, `HashMap`, `ArrayList`, `File`, `FileWriter`, and `BufferedWriter`.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
