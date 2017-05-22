import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static java.nio.charset.StandardCharsets.*;


public class runMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Character> myMap = new HashMap<Integer, Character>();
		ArrayList<String> strs = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader (new FileReader("list-of-players.csv"));
			String line;

			while ((line = reader.readLine()) != null) {
				
				byte ptext[] = line.getBytes(ISO_8859_1);
				String newline = new String(ptext, UTF_8);
				System.out.println(newline);
				
				System.out.println(simplify.simplifyName(line));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//find all possible special chars in file
		Iterator it = myMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
		}

	}
	
	
}
