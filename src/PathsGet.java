import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsGet {

    private static final String FILE_NAME = "b.bin";

    public static void main(String[] args)  {
        //Получить путь к файлу (path)
        Path path = Paths.get(System.getProperty("user.dir"), FILE_NAME);
        System.out.println(path);
    }
}

//OUTPUT:
//C:\Users\hasanshaih\IdeaProjects\ZhdatOstalnyhPotokov\b.bin