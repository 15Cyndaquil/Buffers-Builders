import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.util.Optional;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;


/**
 * @author John Tyler Gafford
 * September 29th 2016
 * jtg2246@email.vccs.edu
 * Using String methods
 * and buffer/builder methods
 */	

public class buffer_builder extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		int l =5;
		double w;
		double w2;
		double h;
		double h2;
		String Str;
		String in;
	
	GraphicsDevice res = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
	w = res.getDisplayMode().getWidth();
	h = res.getDisplayMode().getHeight();
	
	h2 = 250;
	h = (h/2) - (h2/2 + h2/5);
	w2 = 1000;
	w = (w/2) - (w2/2 +w2/5);
	
	      Str = new String("We are the best at Java! We are Awesome!");
	      StringBuilder Str2 = new StringBuilder("Are we Awesome? ");
	      StringBuffer Str3 = new StringBuffer("We are so Awesome! ");
	      
	      Alert out = new Alert(AlertType.INFORMATION);
	      out.getDialogPane().setStyle("-fx-font-size: 20;");
	      out.setTitle("STRING");
	      out.setHeaderText(Str);
	      //Giving me the character at 5
	      out.setContentText("The character at  " + l + " is: " + Str.charAt(l));
	      out.getDialogPane().setPrefWidth(w2);
	      out.getDialogPane().setPrefHeight(h2);
	      out.setX(w);
	      out.setY(h);
	      out.showAndWait();
	      
	      Alert out1 = new Alert(AlertType.INFORMATION);
	      out1.getDialogPane().setStyle("-fx-font-size: 20;");
	      out1.setTitle("STRING");
	      out1.setHeaderText(Str);
	      //Adding Goodbye to the end of the string Str
	      out1.setContentText(Str.concat(" Goodbye!"));
	      out1.getDialogPane().setPrefWidth(w2);
	      out1.getDialogPane().setPrefHeight(h2);
	      out1.setX(w);
	      out1.setY(h);
	      out1.showAndWait();
	      
	      TextInputDialog out11 = new TextInputDialog("We are the best at Java! We are Awesome!");
	      out11.getDialogPane().setStyle("-fx-font-size: 20;");
	      out11.setTitle("String");
	      out11.setHeaderText(null);
	      out11.setContentText("Input: We are the best at Java! We are Awesome");
	      out11.getDialogPane().setPrefWidth(w2);
	      out11.getDialogPane().setPrefHeight(h2);
	      out11.setX(w);
	      out11.setY(h);
	      Optional<String> input = out11.showAndWait();
	      in = input.get();
	      //Seeing if the user input is equal to
	      //the String Str
	      if(Str.equals(in)){
	    	  Alert out111 = new Alert(AlertType.INFORMATION);
		      out111.getDialogPane().setStyle("-fx-font-size: 20;");
		      out111.setTitle("STRING");
		      out111.setHeaderText(null);
		      out111.setContentText("You can follow instructions!");
		      out111.getDialogPane().setPrefWidth(w2);
		      out111.getDialogPane().setPrefHeight(h2);
		      out111.setX(w);
		      out111.setY(h);
		      out111.showAndWait();
	      }
	      else{
	    	  Alert out111 = new Alert(AlertType.INFORMATION);
		      out111.getDialogPane().setStyle("-fx-font-size: 20;");
		      out111.setTitle("STRING");
		      out111.setHeaderText(null);
		      out111.setContentText("Why can't your follow instructions?!");
		      out111.getDialogPane().setPrefWidth(w2);
		      out111.getDialogPane().setPrefHeight(h2);
		      out111.setX(w);
		      out111.setY(h);
		      out111.showAndWait();
	      }
	      TextInputDialog out111 = new TextInputDialog("we ArE The bEst aT jaVa! we aRe AWesoMe!");
	      out111.getDialogPane().setStyle("-fx-font-size: 20;");
	      out111.setTitle("String");
	      out111.setHeaderText(null);
	      out111.setContentText("Input: 'We are the best at Java! We are Awesome!' in any case");
	      out111.getDialogPane().setPrefWidth(w2);
	      out111.getDialogPane().setPrefHeight(h2);
	      out111.setX(w);
	      out111.setY(h);
	      Optional<String> input1 = out111.showAndWait();
	      in = input1.get();
	      //Seeing if the user input is equal
	      //to Str with any case
	      if(Str.equalsIgnoreCase(in)){
	    	  Alert out1111 = new Alert(AlertType.INFORMATION);
		      out1111.getDialogPane().setStyle("-fx-font-size: 20;");
		      out1111.setTitle("STRING");
		      out1111.setHeaderText(null);
		      out1111.setContentText("You can follow instructions!");
		      out1111.getDialogPane().setPrefWidth(w2);
		      out1111.getDialogPane().setPrefHeight(h2);
		      out1111.setX(w);
		      out1111.setY(h);
		      out1111.showAndWait();
	      }
	      else{
	    	  Alert out1111 = new Alert(AlertType.INFORMATION);
		      out1111.getDialogPane().setStyle("-fx-font-size: 20;");
		      out1111.setTitle("STRING");
		      out1111.setHeaderText(null);
		      out1111.setContentText("Why can't your follow instructions?!");
		      out1111.getDialogPane().setPrefWidth(w2);
		      out1111.getDialogPane().setPrefHeight(h2);
		      out1111.setX(w);
		      out1111.setY(h);
		      out1111.showAndWait();
	      }
	      Alert out1111 = new Alert(AlertType.INFORMATION);
	      out1111.getDialogPane().setStyle("-fx-font-size: 20;");
	      out1111.setTitle("STRING");
	      out1111.setHeaderText(Str);
	      //Show the location of the first char J
	      out1111.setContentText("The location of the first J is: " + Str.indexOf('J'));
	      out1111.getDialogPane().setPrefWidth(w2);
	      out1111.getDialogPane().setPrefHeight(h2);
	      out1111.setX(w);
	      out1111.setY(h);
	      out1111.showAndWait();
	      
	      Alert out11111 = new Alert(AlertType.INFORMATION);
	      out11111.getDialogPane().setStyle("-fx-font-size: 20;");
	      out11111.setTitle("STRING");
	      out11111.setHeaderText(Str);
	      //Show the location of the last char a
	      out11111.setContentText("The location of the last a is: " + Str.lastIndexOf('a'));
	      out11111.getDialogPane().setPrefWidth(w2);
	      out11111.getDialogPane().setPrefHeight(h2);
	      out11111.setX(w);
	      out11111.setY(h);
	      out11111.showAndWait();
	      
	      Alert out111111 = new Alert(AlertType.INFORMATION);
	      out111111.getDialogPane().setStyle("-fx-font-size: 20;");
	      out111111.setTitle("STRING");
	      out111111.setHeaderText(Str);
	      //Showing my string Str in lower case
	      out111111.setContentText("My string in lower case: " + Str.toLowerCase());
	      out111111.getDialogPane().setPrefWidth(w2);
	      out111111.getDialogPane().setPrefHeight(h2);
	      out111111.setX(w);
	      out111111.setY(h);
	      out111111.showAndWait();
	      
	      Alert out1111111 = new Alert(AlertType.INFORMATION);
	      out1111111.getDialogPane().setStyle("-fx-font-size: 20;");
	      out1111111.setTitle("STRING");
	      out1111111.setHeaderText(Str);
	      //Show my string Str in upper case
	      out1111111.setContentText("My string in upper case: " + Str.toUpperCase());
	      out1111111.getDialogPane().setPrefWidth(w2);
	      out1111111.getDialogPane().setPrefHeight(h2);
	      out1111111.setX(w);
	      out1111111.setY(h);
	      out1111111.showAndWait();
	      
	      Alert out11111111 = new Alert(AlertType.INFORMATION);
	      out11111111.getDialogPane().setStyle("-fx-font-size: 20;");
	      out11111111.setTitle("STRING");
	      out11111111.setHeaderText(Str);
	      //Replacing the text Java in String Str
	      //with Games
	      out11111111.setContentText("Replace Java with Games: " + Str.replace("Java", "Games"));
	      out11111111.getDialogPane().setPrefWidth(w2);
	      out11111111.getDialogPane().setPrefHeight(h2);
	      out11111111.setX(w);
	      out11111111.setY(h);
	      out11111111.showAndWait();
	      
	      Alert out111111111 = new Alert(AlertType.INFORMATION);
	      out111111111.getDialogPane().setStyle("-fx-font-size: 20;");
	      out111111111.setTitle("STRING");
	      out111111111.setHeaderText(Str);
	      //Showing everything from String Str
	      //from location 24 on
	      out111111111.setContentText(Str.substring(24));
	      out111111111.getDialogPane().setPrefWidth(w2);
	      out111111111.getDialogPane().setPrefHeight(h2);
	      out111111111.setX(w);
	      out111111111.setY(h);
	      out111111111.showAndWait();
	      
	      Alert out1111111111 = new Alert(AlertType.INFORMATION);
	      out1111111111.getDialogPane().setStyle("-fx-font-size: 20;");
	      out1111111111.setTitle("STRING");
	      out1111111111.setHeaderText(Str);
	      //Showing everything from String Str
	      //between locations 24 and 31
	      out1111111111.setContentText(Str.substring(24, 31));
	      out1111111111.getDialogPane().setPrefWidth(w2);
	      out1111111111.getDialogPane().setPrefHeight(h2);
	      out1111111111.setX(w);
	      out1111111111.setY(h);
	      out1111111111.showAndWait();
	      
	      TextInputDialog out3 = new TextInputDialog("   We are the best at Java! We are Awesome!   ");
	      out3.getDialogPane().setStyle("-fx-font-size: 20;");
	      out3.setTitle("String");
	      out3.setHeaderText(null);
	      out3.setContentText("Input: 'We are the best at Java! We are Awesome!' with spaces in front and behind");
	      out3.getDialogPane().setPrefWidth(w2);
	      out3.getDialogPane().setPrefHeight(h2);
	      out3.setX(w);
	      out3.setY(h);
	      Optional<String> input2 = out3.showAndWait();
	      //Taking the user input and triming out all the white space
	      //at the begining and end of the string
	      in = input2.get().trim();
	      
	      if(Str.equals(in)){
	    	  Alert out2 = new Alert(AlertType.INFORMATION);
		      out2.getDialogPane().setStyle("-fx-font-size: 20;");
		      out2.setTitle("STRING");
		      out2.setHeaderText(null);
		      out2.setContentText("You can follow instructions!");
		      out2.getDialogPane().setPrefWidth(w2);
		      out2.getDialogPane().setPrefHeight(h2);
		      out2.setX(w);
		      out2.setY(h);
		      out2.showAndWait();
	      }
	      else{
	    	  Alert out2 = new Alert(AlertType.INFORMATION);
		      out2.getDialogPane().setStyle("-fx-font-size: 20;");
		      out2.setTitle("STRING");
		      out2.setHeaderText(null);
		      out2.setContentText("Why can't your follow instructions?!");
		      out2.getDialogPane().setPrefWidth(w2);
		      out2.getDialogPane().setPrefHeight(h2);
		      out2.setX(w);
		      out2.setY(h);
		      out2.showAndWait();
	      }
	      Alert out2 = new Alert(AlertType.INFORMATION);
	      out2.getDialogPane().setStyle("-fx-font-size: 20;");
	      out2.setTitle("Builder");
	      out2.setHeaderText("Are we Awesome?");
	      //Showing the capacity of the Builder Str2
	      out2.setContentText("Capacity of my builder: " + Str2.capacity());
	      out2.getDialogPane().setPrefWidth(w2);
	      out2.getDialogPane().setPrefHeight(h2);
	      out2.setX(w);
	      out2.setY(h);
	      out2.showAndWait();
	      
	      Alert out4 = new Alert(AlertType.INFORMATION);
	      out4.getDialogPane().setStyle("-fx-font-size: 20;");
	      out4.setTitle("Builder");
	      out4.setHeaderText("Are we Awesome?");
	      //Showing the length of the Builder Str2
	      out4.setContentText("Length of my builder: " + Str2.length());
	      out4.getDialogPane().setPrefWidth(w2);
	      out4.getDialogPane().setPrefHeight(h2);
	      out4.setX(w);
	      out4.setY(h);
	      out4.showAndWait();
	      
	      Alert out5 = new Alert(AlertType.INFORMATION);
	      out5.getDialogPane().setStyle("-fx-font-size: 20;");
	      out5.setTitle("Builder");
	      out5.setHeaderText("Are we Awesome?");
	      //Replacing the characters from 0-6
	      //with WE are in the builder Str2
	      out5.setContentText("Replace 'Are we' with 'WE are': " + Str2.replace(0,6, "WE are"));
	      out5.getDialogPane().setPrefWidth(w2);
	      out5.getDialogPane().setPrefHeight(h2);
	      out5.setX(w);
	      out5.setY(h);
	      out5.showAndWait();
	      
	      Alert out6 = new Alert(AlertType.INFORMATION);
	      out6.getDialogPane().setStyle("-fx-font-size: 20;");
	      out6.setTitle("Builder");
	      out6.setHeaderText("Are we Awesome?");
	      //Adding YES WE ARE! to the end of 
	      //builder Str2
	      out6.setContentText("Append 'YES WE ARE!': " + Str2.append("YES WE ARE!"));
	      out6.getDialogPane().setPrefWidth(w2);
	      out6.getDialogPane().setPrefHeight(h2);
	      out6.setX(w);
	      out6.setY(h);
	      out6.showAndWait();
	      
	      Alert out7 = new Alert(AlertType.INFORMATION);
	      out7.getDialogPane().setStyle("-fx-font-size: 20;");
	      out7.setTitle("Buffer");
	      out7.setHeaderText("We are so Awesome! ");
	      //Showing the capacity of buffer Str3
	      out7.setContentText("Capacity of my buffer: " + Str3.capacity());
	      out7.getDialogPane().setPrefWidth(w2);
	      out7.getDialogPane().setPrefHeight(h2);
	      out7.setX(w);
	      out7.setY(h);
	      out7.showAndWait();
	      
	      Alert out8 = new Alert(AlertType.INFORMATION);
	      out8.getDialogPane().setStyle("-fx-font-size: 20;");
	      out8.setTitle("Buffer");
	      out8.setHeaderText("We are so Awesome! ");
	      //Showing the lenght of buffer Str3
	      out8.setContentText("Length of my buffer: " + Str3.length());
	      out8.getDialogPane().setPrefWidth(w2);
	      out8.getDialogPane().setPrefHeight(h2);
	      out8.setX(w);
	      out8.setY(h);
	      out8.showAndWait();
	      
	      Alert out9 = new Alert(AlertType.INFORMATION);
	      out9.getDialogPane().setStyle("-fx-font-size: 20;");
	      out9.setTitle("Buffer");
	      out9.setHeaderText("We are so Awesome! ");
	      //Replacing 10-17 of buffer Str3
	      //with GREAT
	      out9.setContentText("Replace 'Awesome' with 'GREAT': " + Str3.replace(10,17, "GREAT"));
	      out9.getDialogPane().setPrefWidth(w2);
	      out9.getDialogPane().setPrefHeight(h2);
	      out9.setX(w);
	      out9.setY(h);
	      out9.showAndWait();
	      
	      Alert out10 = new Alert(AlertType.INFORMATION);
	      out10.getDialogPane().setStyle("-fx-font-size: 20;");
	      out10.setTitle("Buffer");
	      out10.setHeaderText("We are so Awesome! ");
	      //Adding YEAH to the end of buffer Str3
	      out10.setContentText("Append 'YEAH!': " + Str3.append("YEAH!"));
	      out10.getDialogPane().setPrefWidth(w2);
	      out10.getDialogPane().setPrefHeight(h2);
	      out10.setX(w);
	      out10.setY(h);
	      out10.showAndWait();
	}
}
