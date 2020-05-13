package com;

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

/***
 *  Created by shao.guangze on 2020/3/19
 */
public class MongoDBTest {

    public static void main(String[] args) {

        try{

//            ServerAddress serverAddress = new ServerAddress("localhost",27017);
//            MongoCredential credential = MongoCredential.createScramSha1Credential("root","admin","root".toCharArray());
//            MongoClient mongoClient = new MongoClient(Arrays.asList(serverAddress),Arrays.asList(credential));
//            com.mongodb.client.MongoClient mongoClient = MongoClients.create();
//            MongoDatabase mongoDatabase = mongoClient.getDatabase("test");

//            create(mongoDatabase);
//            find(mongoDatabase);
//            add(mongoDatabase);
//              update(mongoDatabase);
//            delete(mongoDatabase);


        }catch (Exception e){

            System.err.println("！！MongoDB数据库连接异常：" + e.getMessage() );

        }

    }




    public static void create(MongoDatabase a) {


        try {

            a.createCollection("user");
            System.out.printf("集合创建成功");


        } catch (Exception e) {

            System.out.printf("集合创建异常" + e.getMessage());

        }
    }


    public static void find(MongoDatabase a){

        try {

            MongoCollection<Document> mongoCollection = a.getCollection("user");
            FindIterable<Document> findIterable = mongoCollection.find();
            MongoCursor<Document> mongoCursor = findIterable.iterator();
            while(mongoCursor.hasNext()){
                System.out.printf("查询的数据"+mongoCursor.next());

            }


        } catch (Exception e) {

            System.err.println( "！！数据查询异常：" + e.getMessage() );

        }

    }


    public static void add(MongoDatabase a){

        try {

            MongoCollection<Document> mongoCollection = a.getCollection("user");
            Document document1 = new Document("name","sida").
                    append("age",18).
                    append("type","学生").
                    append("likesport", "打乒乓球");
            Document document2 = new Document("name", "学生").
                    append("age", 19).
                    append("type", "学生").
                    append("likesport", "打羽毛球");
            Document document3 = new Document("name", "老师").
                    append("age", 33).
                    append("type", "教师").
                    append("likeTv", "湖南Tv");
            Document document4 = new Document("name", "老师").
                    append("age", 30).
                    append("type", "教师").
                    append("likeTv", "星空卫视");
            List<Document> documentList = new ArrayList<Document>();
            documentList.add(document1);
            documentList.add(document2);
            documentList.add(document3);
            documentList.add(document4);
            mongoCollection.insertMany(documentList);
            System.out.printf("数据插入成功！");


        } catch (Exception e) {

            System.err.println( "！！数据新增异常：" + e.getMessage() );

        }

    }

    private static void update(MongoDatabase mongoDatabase) {
        try{
            MongoCollection mongoCollection = mongoDatabase.getCollection("user");
            mongoCollection.updateMany(Filters.eq("name","sida"),new Document("$set",new Document("name","学生")));
           // mongoCollection.updateMany(Filters.eq("name","老师"),new Document("$set",new Document("likeTv","CCTV-1")));
            FindIterable<Document> findIterable = mongoCollection.find();
            MongoCursor<Document> mongoCursor = findIterable.iterator();
            while(mongoCursor.hasNext()){
                System.out.printf("更新后的数据:"+mongoCursor.next());
            }


        }catch (Exception e){
            System.err.println( "！！数据更新异常：" + e.getMessage() );

        }
    }

    private static void delete(MongoDatabase mongoDatabase) {

        try {

            MongoCollection<Document> c = mongoDatabase.getCollection("user");
            c.deleteOne(Filters.eq("name","老师"));
            c.deleteMany(Filters.eq("name","学生"));

            FindIterable<Document> findIterable = c.find();

            MongoCursor<Document> mongoCursor = findIterable.iterator();
            while(mongoCursor.hasNext()){
                System.out.printf("删除后的数据："+mongoCursor.next());
            }
        }catch (Exception e){

            System.err.println( "！！数据删除异常：" + e.getMessage() );
        }

    }
}
