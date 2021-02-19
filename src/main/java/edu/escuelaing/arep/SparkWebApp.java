package edu.escuelaing.arep;

import static spark.Spark.*;

import edu.escuelaing.arep.calculator.TrigonometricRatios;

/**
 * 
 * @author Daniel
 *
 */
public class SparkWebApp {
	
	/**
	 * This main method uses SparkWeb static methods and lambda functions to create 
	 * a App that calculate the mean and estandar deviation of a number list entered 
	 * by a field on the web page
	 */
	public static void main(String[] args) {
		TrigonometricRatios RC = new TrigonometricRatios();
		port(getPort());
		get("/", (req, res) -> {
			Double num = Double.parseDouble(req.queryParams("value"));
			String oper = req.queryParams("operation");
			return RC.calculate(oper, num);
		});
	}
	
		/**
		 * This method reads the default port as specified by the PORT variable in
		 * the environment.
		 *
		 * Heroku provides the port automatically so you need this to run the
		 * project on Heroku.
		 */
		static int getPort() {
			if (System.getenv("PORT") != null) {
				return Integer.parseInt(System.getenv("PORT"));
			}
			return 4567; //returns default port if heroku-port isn't set	
		}
		

}