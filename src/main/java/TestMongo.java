import com.mongodb.client.*;
import org.bson.Document;

public class TestMongo {
    public static void main(String[] args) {
        MongoClient client = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase db = client.getDatabase("testdb");
        MongoCollection<Document> users = db.getCollection("users");

        users.insertOne(new Document("name", "..").append("age", 22));

        for (Document doc : users.find()) {
            System.out.println(doc.toJson());
        }

    }
}