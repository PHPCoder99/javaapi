import org.json.JSONObject;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Sem2 {
    public static void main(String[] args) {
      task1();
    }

    public static void task1(){
      String filterJson = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        JSONObject filter = new JSONObject(filterJson);

        StringBuilder whereClause = new StringBuilder();
        for (String key : filter.keySet()) {
            if (!filter.isNull(key)) {
                Object value = filter.get(key);
                if (value instanceof String) {
                    whereClause.append(key).append(" = '").append(value).append("' AND ");
                } else {
                    whereClause.append(key).append(" = ").append(value).append(" AND ");
                }
            }
        }

        if (whereClause.length() > 0) {
            // Удаление последнего "AND "
            whereClause.setLength(whereClause.length() - 5);
        }

        System.out.println("WHERE clause: " + whereClause.toString());
    }

    public static void writeLogFile(){
        int[] array = {5, 2, 8, 12, 1};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("sort_log.txt"));
            bubbleSort(array, writer);

            writer.close();
            System.out.println("Сортировка завершена. Результаты сохранены в sort_log.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в лог-файл: " + e.getMessage());
        }
    }

    public static void bubbleSort(int[] array, BufferedWriter writer) throws IOException{
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

            writer.write("После итерации " + (i + 1) + ": " + Arrays.toString(array));
            writer.newLine();
        }
    }
}
