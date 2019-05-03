package fileHandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class jpsEmployee {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File afile = new File("sqlinset.txt");
		FileWriter fw = new FileWriter(afile, false);
		
		for(int i = 1; i<101; i++) {
			fw.write("insert into jpaEmployee values("
					+ i

					+ ", \'FirstName" + i + "\'"

					+ ", \'LastName" + i + "\'"

					+ ", \'555121212" + i + "\'"

					+ ");\n"

					);

					}

					fw.close();

					}

					}