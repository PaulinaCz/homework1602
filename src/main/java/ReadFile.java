/*

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {

    public String readFileOfCode(String file){

        Path filePath = Paths.get(file);
        StringBuilder sb = new StringBuilder();
        try
        {
            String stringToCheck = Files.readString(filePath);
            sb.append(stringToCheck);

        }

        catch (IOException e)
        {
            e.printStackTrace();
        }

        return sb.toString();
    }
}

*/
