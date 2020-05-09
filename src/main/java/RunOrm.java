import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class RunOrm {
    private static final String EXCEL_PATH = "./src/main/resources/example.xls";
    public static void main(String[] args) throws IOException {
        Workbook workbook = WorkbookFactory.create(new File(EXCEL_PATH));
        Sheet peopleSheet = workbook.getSheet("People");
        List<Person> people = peopleSheet.getModelFrom(1, Person.class);
        workbook.close();
        System.out.println(Arrays.toString(people.toArray()));
    }
}
