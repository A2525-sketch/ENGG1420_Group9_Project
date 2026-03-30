import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class TestMongo {

    public static void main(String[] args) {
        try {
            // Get the collection
            MongoCollection<Document> collection = MongoConnection.getCollection();

            // Create a sample user
            Document userDoc = new Document("id", "001")
                    .append("name", "test")
                    .append("email", "testone@email.com")
                    .append("usertype", "Student");

            // Insert the user into MongoDB
            collection.insertOne(userDoc);

            System.out.println("User inserted successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}