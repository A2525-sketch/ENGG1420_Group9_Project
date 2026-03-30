using MongoDB.Bson;
using MongoDB.Driver;

var builder = WebApplication.CreateBuilder(args);

// ---- MongoDB connection ----

// Hardcode for now to avoid configuration issues
var connectionString = "mongodb+srv://vampirebytestudios_db_user:GDBFFWMWsQsoFVpL@vb.d1aylkq.mongodb.net/?retryWrites=true&w=majority";
var databaseName = "vb";

// Create MongoClient and get database
var client = new MongoClient(connectionString);
var database = client.GetDatabase(databaseName);

// Get collection
var reviewsCollection = database.GetCollection<BsonDocument>("reviews");

var app = builder.Build();

// ---- Test route ----
app.MapGet("/", () => "API is running");

// ---- Add a review ----
app.MapPost("/reviews", async (string username, string text) =>
{
    var doc = new BsonDocument
    {
        { "Username", username },
        { "Text", text },
        { "CreatedAt", DateTime.UtcNow }
    };

    await reviewsCollection.InsertOneAsync(doc);
    return Results.Ok("Review added");
});

// ---- Get all reviews ----
app.MapGet("/reviews", async () =>
{
    var reviews = await reviewsCollection.Find(_ => true).ToListAsync();
    return Results.Ok(reviews);
});

app.Run();