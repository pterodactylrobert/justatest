package test3;

import spark.*;
import spark.servlet.SparkApplication;

public class HelloWorld implements SparkApplication {

	public HelloWorld() {
	
	}
	
   public static void main(String[] args) {
	   
   }

	public void init() {
		// TODO Auto-generated method stub
		Spark.get(new Route("/hello") {
         @Override
         public Object handle(Request request, Response response) {
            return "Hello World!";
         }
      });
	}
}