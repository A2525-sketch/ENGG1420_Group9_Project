/*import com.mongodb.client.MongoCollection;
import org.bson.Document;
import java.util.List;

public class CSVtoMongo {
    public static void insertData(List<String[]> rows) {
        MongoCollection<Document> collection = MongoConnection.getCollection();

        for (String[] row : rows) {
            Document doc = new Document()
                    .append("name", row[0])
                    .append("age", Integer.parseInt(row[1]))
                    .append("grade", row[2]);

            collection.insertOne(doc);
        }
    }
}
*/


