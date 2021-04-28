import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.text.DecimalFormat;


public class FinanceCalculator extends Application {

    Stage window;
    Scene scene1,scene2;
    BorderPane layout2,bpMor,bpAl,bpAlMp,bpFc,bpFcSs,bpFcRp;
    GridPane grid;

    //  Keyboard input method
      public void getKeyInput(TextField textField,BorderPane borderPane){  // Text field and border pane are parameters

          final int[] set = {0};

        grid = new GridPane(); // Create a Grid Pane
        grid.setPadding(new Insets(10,160,10,10));
        grid.setHgap(10);  // Set horizontal gap inside keys
        grid.setVgap(10);  // Set vertical gap inside keys

        Button btnKey1 = new Button("1"); // Create keyboard button 1
        btnKey1.setOnAction(e -> {
            textField.insertText(set[0],"1");  //  When button clicked index 0 value will be overwrite to value 1
            set [0] = set[0] + 1;  // Add last value to after previous value

        });
        grid.setConstraints(btnKey1,1,1);

        Button btnKey2 = new Button("2");  // Create keyboard button 2
        btnKey2.setOnAction(e -> {
            textField.insertText(set[0],"2"); //  When button clicked index 0 value will be overwrite to value 2
            set [0] = set[0] + 1;
        });
        grid.setConstraints(btnKey2,2,1);

        Button btnKey3 = new Button("3");   // Create keyboard button 3
        btnKey3.setOnAction(e -> {
            textField.insertText(set[0],"3");  //  When button clicked index 0 value will be overwrite to value 3
            set [0] = set[0] + 1;
        });
        grid.setConstraints(btnKey3,3,1);

        Button btnKey4 = new Button("4");   // Create keyboard button 4
        btnKey4.setOnAction(e -> {
            textField.insertText(set[0],"4");  //  When button clicked index 0 value will be overwrite to value 4
            set [0] = set[0] + 1;
        });
        grid.setConstraints(btnKey4,1,2);

        Button btnKey5 = new Button("5");   // Create keyboard button 5
        btnKey5.setOnAction(e -> {
            textField.insertText(set[0],"5");  //  When button clicked index 0 value will be overwrite to value 5
            set [0] = set[0] + 1;
        });
        grid.setConstraints(btnKey5,2,2);

        Button btnKey6 = new Button("6");   // Create keyboard button 6
        btnKey6.setOnAction(e -> {
            textField.insertText(set[0],"6");  //  When button clicked index 0 value will be overwrite to value 6
            set [0] = set[0] + 1;
        });
        grid.setConstraints(btnKey6,3,2);

        Button btnKey7 = new Button("7");   // Create keyboard button 7
        btnKey7.setOnAction(e -> {
            textField.insertText(set[0],"7");  //  When button clicked index 0 value will be overwrite to value 7
            set [0] = set[0] + 1;
        });
        grid.setConstraints(btnKey7,1,3);

        Button btnKey8 = new Button("8");   // Create keyboard button 8
        btnKey8.setOnAction(e -> {
            textField.insertText(set[0],"8");  //  When button clicked index 0 value will be overwrite to value 8
            set [0] = set[0] + 1;
        });
        grid.setConstraints(btnKey8,2,3);

        Button btnKey9 = new Button("9");   // Create keyboard button 9
        btnKey9.setOnAction(e -> {
            textField.insertText(set[0],"9");  //  When button clicked index 0 value will be overwrite to value 9
            set [0] = set[0] + 1;
        });
        grid.setConstraints(btnKey9,3,3);

        Button btnKey0 = new Button("0");   // Create keyboard button 0
        btnKey0.setOnAction(e -> {
            textField.insertText(set[0],"0");  //  When button clicked index 0 value will be overwrite to value 0
            set [0] = set[0] + 1;
        });
        grid.setConstraints(btnKey0,1,4);

        Button btnKeyDot = new Button(".");   // Create keyboard button .(period)
        btnKeyDot.setOnAction(e -> {
            textField.insertText(set[0],".");
            set [0] = set[0] + 1;
        });
        grid.setConstraints(btnKeyDot,2,4);

        Button btnKeyC = new Button("C");   // Create keyboard button C  (for clear all digits)
        btnKeyC.setOnAction(e -> {
            textField.setText("");  // To set null value
        });
        grid.setConstraints(btnKeyC,3,4);


        grid.getChildren().addAll(btnKey1,btnKey2,btnKey3,btnKey4,btnKey5,btnKey6,btnKey7,btnKey8,btnKey9,
                btnKeyDot,btnKeyC,btnKey0); //  add all buttons inside the grid

          borderPane.setRight(grid);    // Set keyboard right hand side of border pane

    }

    public static void main(String[] args) {
	launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {


        DecimalFormat df = new DecimalFormat(".00");     //  Create decimal format for two decimal points

        window = primaryStage;   // Set window as primary stage

        // Main window button
        Button btnMain = new Button();
        btnMain.setText("Get start");
        btnMain.setStyle("-fx-background-color: #ffbb76");
        btnMain.setLayoutX(200);
        btnMain.setLayoutY(250);

        // Main window label
        Label lbMain = new Label();
        lbMain.setText("Financial Calculator");
        lbMain.setLayoutX(70);
        lbMain.setLayoutY(50);
        lbMain.setFont(Font.font("verdana", FontWeight.BOLD,15));

        // Move to calculator window
        btnMain.setOnAction(e -> window.setScene(scene2));

        // Main window of the pain
        Pane layout1 = new Pane();
        layout1.setStyle("-fx-background-color: #00faff");

        layout1.getChildren().addAll(btnMain, lbMain);
        scene1 = new Scene(layout1, 300, 300);

        // Move to first window
        Button btnHome = new Button();
        btnHome.setText("Home");
        btnHome.setStyle("-fx-background-color: #ffa500");
        btnHome.setOnAction(e -> window.setScene(scene1));

        //------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------


        // Start Principal in Loan Term (in years)
        Label lbMorT1 = new Label(); //  Create label
        lbMorT1.setText("Start Principal");
        lbMorT1.setLayoutX(20);
        lbMorT1.setLayoutY(30);

        // TextField of Start Principal
        TextField tfMorT1 = new TextField();  //  Create text field
        tfMorT1.setLayoutX(150);
        tfMorT1.setLayoutY(30);
        tfMorT1.setOnMousePressed(e -> getKeyInput(tfMorT1,bpMor));  // Call method getKeyInput and add arguments to it

        // Interest Rate (I/Y) in Loan Term (in years)
        Label lbMorT2 = new Label();
        lbMorT2.setText("Interest Rate (I/Y)");
        lbMorT2.setLayoutX(20);
        lbMorT2.setLayoutY(60);


        // TextField of Interest Rate (I/Y)
        TextField tfMorT2 = new TextField();
        tfMorT2.setLayoutX(150);
        tfMorT2.setLayoutY(60);
        tfMorT2.setOnMousePressed(e ->  getKeyInput(tfMorT2,bpMor));

        // Payment in Loan Term (in years)
        Label lbMorT3 = new Label();
        lbMorT3.setText("Payment");
        lbMorT3.setLayoutX(20);
        lbMorT3.setLayoutY(90);

        // TextField of Payment
        TextField tfMorT3 = new TextField();
        tfMorT3.setLayoutX(150);
        tfMorT3.setLayoutY(90);
        tfMorT3.setOnMousePressed(e -> getKeyInput(tfMorT3,bpMor));

        Label lbMorTCaCalculate1 = new Label();  // Answer label
        lbMorTCaCalculate1.setLayoutX(70);
        lbMorTCaCalculate1.setLayoutY(220);

        Button btnMorTCalculate1 = new Button();  // Calculate button
        btnMorTCalculate1.setText("Calculate");
        btnMorTCalculate1.setLayoutX(80);
        btnMorTCalculate1.setLayoutY(140);
        btnMorTCalculate1.setOnAction(e -> {

            // Get inputs and calculate relevant variable by formula

            try {
                double tfMorT1Val = Double.parseDouble(tfMorT1.getText());  // Convert to double value
                double tfMorT2Val = Double.parseDouble(tfMorT2.getText());
                double tfMorT3Val = Double.parseDouble(tfMorT3.getText());
                // Add inputs to formula
                double morT = (Math.log(1 - (((tfMorT2Val/100) * tfMorT1Val) / tfMorT3Val))) /
                        (Math.log(1 + (tfMorT2Val/100)) * 12);
                lbMorTCaCalculate1.setText(String.valueOf( "Loan Term: " + df.format(morT)));  // Set answer to label
            }

            catch (NumberFormatException e1){

                // This is a alert box. If any thing went wrong run this exception
                AlertBox.display("Enter valid input.");

            }
        });
        TextField t1 = new TextField();
        // Add text fields and labels to the pane
        Pane paneMorT = new Pane();
        paneMorT.getChildren().addAll(lbMorT1, tfMorT1, lbMorT2, tfMorT2, lbMorT3, tfMorT3, btnMorTCalculate1,
                lbMorTCaCalculate1);

        Button btnMorT = new Button();   // Loan Term (in years) button
        btnMorT.setText("Loan Term (in years)");
        btnMorT.setStyle("-fx-background-color: #d03fff");
        btnMorT.setOnAction(e -> {

            bpMor.setCenter(paneMorT);// When button clicked paneMorT(pane) come to bpMor(border pane) center

        });

        //-----------------------------------------------------------------------------------------------------------------

        // Start Principal in Payment
        Label lbMorPmt1 = new Label();  //  Create label
        lbMorPmt1.setText("Start Principal");
        lbMorPmt1.setLayoutX(20);
        lbMorPmt1.setLayoutY(30);

        // TextField of Start Principal
        TextField tfMorPmt1 = new TextField();  //  Create text field
        tfMorPmt1.setLayoutX(150);
        tfMorPmt1.setLayoutY(30);
        tfMorPmt1.setOnMousePressed(e -> getKeyInput(tfMorPmt1,bpMor)); // Call method getKeyInput and add arguments
        // to it

        // Loan Term  in Payment
        Label lbMorPmt2 = new Label();
        lbMorPmt2.setText("Loan Term (in years)");
        lbMorPmt2.setLayoutX(20);
        lbMorPmt2.setLayoutY(60);

        // TextField of Loan Term
        TextField tfMorPmt2 = new TextField();
        tfMorPmt2.setLayoutX(150);
        tfMorPmt2.setLayoutY(60);
        tfMorPmt2.setOnMousePressed(e -> getKeyInput(tfMorPmt2,bpMor));

        // Interest Rate in Payment
        Label lbMorPmt3 = new Label();
        lbMorPmt3.setText("Interest Rate (I/Y)");
        lbMorPmt3.setLayoutX(20);
        lbMorPmt3.setLayoutY(90);

        // TextField of Interest Rate
        TextField tfMorPmt3 = new TextField();
        tfMorPmt3.setLayoutX(150);
        tfMorPmt3.setLayoutY(90);
        tfMorPmt3.setOnMousePressed(e -> getKeyInput(tfMorPmt3,bpMor));

        Label lbMorPmtCaCalculate2 = new Label();   // Answer label
        lbMorPmtCaCalculate2.setLayoutX(70);
        lbMorPmtCaCalculate2.setLayoutY(220);
        lbMorPmtCaCalculate2.setText("");

        Button btnMorPmtCalculate2 = new Button();  // Calculate button
        btnMorPmtCalculate2.setText("Calculate");
        btnMorPmtCalculate2.setLayoutX(80);
        btnMorPmtCalculate2.setLayoutY(140);
        btnMorPmtCalculate2.setOnAction(e -> {

            // Get inputs and calculate relevant variable by formula

try {
    double tfMorPmt1Val = Double.parseDouble(tfMorPmt1.getText());  // Convert to double value
    double tfMorPmt2Val = Double.parseDouble(tfMorPmt2.getText());
    double tfMorPmt3Val = Double.parseDouble(tfMorPmt3.getText());
    // Add inputs to formula
    double morPmt = (((tfMorPmt1Val * (tfMorPmt3Val / 100)) / 12) *
            (Math.pow(1 + (tfMorPmt3Val / (12 * 100)), 12 * tfMorPmt2Val)) /
            (Math.pow(1 + (tfMorPmt3Val / (12 * 100)), 12 * tfMorPmt2Val) - 1));
     lbMorPmtCaCalculate2.setText(String.valueOf("Payment: " + df.format(morPmt)));  // Set answer to label
    
}

catch (NumberFormatException e1){
// This is a alert box. If any thing went wrong run this exception
    AlertBox.display("Enter valid input.");

}

        });

        // Add text fields and labels to the pane
        Pane paneMorPmt = new Pane();
        paneMorPmt.getChildren().addAll(lbMorPmt1, tfMorPmt1, lbMorPmt2, tfMorPmt2, lbMorPmt3, tfMorPmt3,
                btnMorPmtCalculate2, lbMorPmtCaCalculate2);

        Button btnMorPmt = new Button();   // Payment button
        btnMorPmt.setText("Payment");
        btnMorPmt.setStyle("-fx-background-color: #00bb76");
        btnMorPmt.setOnAction(e -> bpMor.setCenter(paneMorPmt));  // When button clicked paneMorPmt(pane) come to bpMor(border pane) center

        // -----------------------------------------------------------------------------------------------------------

        // Loan Term in Start Principal
        Label lbMorSp1 = new Label();
        lbMorSp1.setText("Loan Term (in years)");
        lbMorSp1.setLayoutX(20);
        lbMorSp1.setLayoutY(30);

        // TextField of Loan Term
        TextField tfMorSp1 = new TextField();
        tfMorSp1.setLayoutX(150);
        tfMorSp1.setLayoutY(30);
        tfMorSp1.setOnMousePressed(e -> getKeyInput(tfMorSp1,bpMor));  // Call method getKeyInput and add arguments

        // Interest Rate in Start Principal
        Label lbMorSp2 = new Label();
        lbMorSp2.setText("Interest Rate (I/Y)");
        lbMorSp2.setLayoutX(20);
        lbMorSp2.setLayoutY(60);

        // TextField of Interest Rate
        TextField tfMorSp2 = new TextField();
        tfMorSp2.setLayoutX(150);
        tfMorSp2.setLayoutY(60);
        tfMorSp2.setOnMousePressed(e -> getKeyInput(tfMorSp2,bpMor));

        // Payment in Start Principal
        Label lbMorSp3 = new Label();
        lbMorSp3.setText("Payment");
        lbMorSp3.setLayoutX(20);
        lbMorSp3.setLayoutY(90);

        // TextField of Payment
        TextField tfMorSp3 = new TextField();
        tfMorSp3.setLayoutX(150);
        tfMorSp3.setLayoutY(90);
        tfMorSp3.setOnMousePressed(e -> getKeyInput(tfMorSp3,bpMor));

        Label lbMorSpCaCalculate4 = new Label();   // Answer label
        lbMorSpCaCalculate4.setLayoutX(70);
        lbMorSpCaCalculate4.setLayoutY(220);
        lbMorSpCaCalculate4.setText("");

        Button btnMorSpCalculate4 = new Button();  // Calculate button
        btnMorSpCalculate4.setText("Calculate");
        btnMorSpCalculate4.setLayoutX(80);
        btnMorSpCalculate4.setLayoutY(140);
        btnMorSpCalculate4.setOnAction(e -> {

            // Get inputs and calculate relevant variable by formula

            try {
                double tfMorSp1Val = Double.parseDouble(tfMorSp1.getText()); // Convert to double value
                double tfMorSp2Val = Double.parseDouble(tfMorSp2.getText());
                double tfMorSp3Val = Double.parseDouble(tfMorSp3.getText());
                // Add inputs to formula
                double morSp = (tfMorSp3Val * (Math.pow(1 + (tfMorSp2Val/(12 * 100)),12 * tfMorSp1Val) - 1)) /
                        ((tfMorSp2Val/(12 * 100)) * (Math.pow(1 + (tfMorSp2Val/(12 * 100)),12 * tfMorSp1Val)));
                lbMorSpCaCalculate4.setText(String.valueOf("Start Principal: " + df.format(morSp)));  // Set answer to label
            }

            catch (NumberFormatException e1){
                // This is a alert box. If any thing went wrong run this exception
                AlertBox.display("Enter valid input.");

            }
        });


        // Add text fields and labels to the pane
        Pane paneMorSp = new Pane();
        paneMorSp.getChildren().addAll(lbMorSp1, tfMorSp1, lbMorSp2, tfMorSp2, lbMorSp3, tfMorSp3, lbMorSpCaCalculate4,
                btnMorSpCalculate4);

        Button btnMorSp = new Button();   // Start Principal button
        btnMorSp.setText("Start Principal");
        btnMorSp.setStyle("-fx-background-color: #008bff");
        btnMorSp.setOnAction(e -> bpMor.setCenter(paneMorSp));  // When button clicked paneMorSp(pane) come to bpMor(border pane) center


        HBox hbMor = new HBox(); // Add buttons to horizontal box
        hbMor.getChildren().addAll(btnMorT, btnMorPmt, btnMorSp);

        bpMor = new BorderPane();  // Mortgage calculator border pane
        bpMor.setTop(hbMor);  // Add previous h box  to mortgage calculator border pane

        //  Mortgage Calculator button and move to Mortgage Calculator window
        Button btnMor = new Button();
        btnMor.setText("Mortgage Calculator");
        btnMor.setStyle("-fx-background-color: #0000ff");
        btnMor.setOnAction(e -> {
            layout2.setCenter(bpMor); // When button clicked bpMor(border pane) come to layout2 center

        });
        // ---------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------
        // ------------------------------------------------------------------------------------------------------------

        // Start Principal in Future Value
        Label lbFcSsFv1 = new Label();
        lbFcSsFv1.setText("Start Principal");
        lbFcSsFv1.setLayoutX(20);
        lbFcSsFv1.setLayoutY(30);

        // Text field of Start Principal
        TextField tfFcSsFv1 = new TextField();
        tfFcSsFv1.setLayoutX(150);
        tfFcSsFv1.setLayoutY(30);
        tfFcSsFv1.setOnMousePressed(e -> getKeyInput(tfFcSsFv1,bpFcSs));  // Call method getKeyInput and add arguments

        // Time in Future Value
        Label lbFcSsFv2 = new Label();
        lbFcSsFv2.setText("Time (in years)");
        lbFcSsFv2.setLayoutX(20);
        lbFcSsFv2.setLayoutY(60);

        // Text field of Time
        TextField tfFcSsFv2 = new TextField();
        tfFcSsFv2.setLayoutX(150);
        tfFcSsFv2.setLayoutY(60);
        tfFcSsFv2.setOnMousePressed(e -> getKeyInput(tfFcSsFv2,bpFcSs));

        // Interest Rate in Future Value
        Label lbFcSsFv3 = new Label();
        lbFcSsFv3.setText("Interest Rate (I/Y)");
        lbFcSsFv3.setLayoutX(20);
        lbFcSsFv3.setLayoutY(90);

        // Text field of Interest Rate
        TextField tfFcSsFv3 = new TextField();
        tfFcSsFv3.setLayoutX(150);
        tfFcSsFv3.setLayoutY(90);
        tfFcSsFv3.setOnMousePressed(e -> getKeyInput(tfFcSsFv3,bpFcSs));

        Label lbFcSsFvCaCalculate1 = new Label();   // Answer label
        lbFcSsFvCaCalculate1.setLayoutX(70);
        lbFcSsFvCaCalculate1.setLayoutY(220);
        lbFcSsFvCaCalculate1.setText("");

        Button btnFcSsFvCalculate1 = new Button();  // Calculate button
        btnFcSsFvCalculate1.setText("Calculate");
        btnFcSsFvCalculate1.setLayoutX(80);
        btnFcSsFvCalculate1.setLayoutY(140);
        btnFcSsFvCalculate1.setOnAction(e -> {

            // Get inputs and calculate relevant variable by formula

            try {
                double tfFcSsFv1Val = Double.parseDouble(tfFcSsFv1.getText()); // Convert to double value
                double tfFcSsFv2Val = Double.parseDouble(tfFcSsFv2.getText());
                double tfFcSsFv3Val = Double.parseDouble(tfFcSsFv3.getText());
                // Add inputs to formula
                double FcSsFv = tfFcSsFv1Val* Math.pow(1 + (tfFcSsFv3Val/(12 * 100)),12 * tfFcSsFv2Val);
                        lbFcSsFvCaCalculate1.setText(String.valueOf( "Future Value: " + df.format(FcSsFv)));  // Set answer to label
            }

            catch (NumberFormatException e1){
                // This is a alert box. If any thing went wrong run this exception
                AlertBox.display("Enter valid input.");

            }
        });

        // Add text fields and labels to the pane
        Pane paneFcSsFv = new Pane();
        paneFcSsFv.getChildren().addAll(lbFcSsFv1, tfFcSsFv1, lbFcSsFv2, tfFcSsFv2, lbFcSsFv3, tfFcSsFv3,
                lbFcSsFvCaCalculate1, btnFcSsFvCalculate1);

        Button btnFcSsFv = new Button();
        btnFcSsFv.setText("Future Value");    // Future Value button
        btnFcSsFv.setStyle("-fx-background-color: #0068ff");
        btnFcSsFv.setOnAction(e -> bpFcSs.setCenter(paneFcSsFv));   // When button clicked paneFcSsFv(pane) come to bpFcSs(border pane) center

        //-------------------------------------------------------------------------------------------------------------

        // Future Value in Start Principal
        Label lbFcSsPmt1 = new Label();
        lbFcSsPmt1.setText("Future Value");
        lbFcSsPmt1.setLayoutX(20);
        lbFcSsPmt1.setLayoutY(30);

         // Text field of Future Value
        TextField tfFcSsPmt1 = new TextField();
        tfFcSsPmt1.setLayoutX(150);
        tfFcSsPmt1.setLayoutY(30);
        tfFcSsPmt1.setOnMousePressed(e -> getKeyInput(tfFcSsPmt1,bpFcSs));  // Call method getKeyInput and add arguments

        // Interest Rate in Start Principal
        Label lbFcSsPmt2 = new Label();
        lbFcSsPmt2.setText("Interest Rate (I/Y)");
        lbFcSsPmt2.setLayoutX(20);
        lbFcSsPmt2.setLayoutY(60);

        // Text field of Interest Rate
        TextField tfFcSsPmt2 = new TextField();
        tfFcSsPmt2.setLayoutX(150);
        tfFcSsPmt2.setLayoutY(60);
        tfFcSsPmt2.setOnMousePressed(e -> getKeyInput(tfFcSsPmt2,bpFcSs));

        // Time  in Future Start Principal
        Label lbFcSsPmt3 = new Label();
        lbFcSsPmt3.setText("Time (in years)");
        lbFcSsPmt3.setLayoutX(20);
        lbFcSsPmt3.setLayoutY(90);

        // Text field of Time
        TextField tfFcSsPmt3 = new TextField();
        tfFcSsPmt3.setLayoutX(150);
        tfFcSsPmt3.setLayoutY(90);
        tfFcSsPmt3.setOnMousePressed(e -> getKeyInput(tfFcSsPmt3,bpFcSs));


        Label lbFcSsPmtCaCalculate2 = new Label();   // Answer label
        lbFcSsPmtCaCalculate2.setLayoutX(70);
        lbFcSsPmtCaCalculate2.setLayoutY(220);
        lbFcSsPmtCaCalculate2.setText("");

        Button btnFcSsPmtCalculate2 = new Button();  // Calculate button
        btnFcSsPmtCalculate2.setText("Calculate");
        btnFcSsPmtCalculate2.setLayoutX(80);
        btnFcSsPmtCalculate2.setLayoutY(140);
        btnFcSsPmtCalculate2.setOnAction(e -> {

            // Get inputs and calculate relevant variable by formula

            try {
                double tfFcSsPmt1Val = Double.parseDouble(tfFcSsPmt1.getText()); // Convert to double value
                double tfFcSsPmt2Val = Double.parseDouble(tfFcSsPmt2.getText());
                double tfFcSsPmt3Val = Double.parseDouble(tfFcSsPmt3.getText());
                // Add inputs to formula
                double FcSsPmt = tfFcSsPmt1Val/(Math.pow((1 + (tfFcSsPmt2Val/(12 * 100))),12 * tfFcSsPmt3Val));

                        lbFcSsPmtCaCalculate2.setText(String.valueOf( "Start Principal: " + df.format(FcSsPmt))); // Set answer to label
            }

            catch (NumberFormatException e1){
             // This is a alert box. If any thing went wrong run this exception
                AlertBox.display("Enter valid input.");

            }
        });

        // Add text fields and labels to the pane
        Pane paneFcSsPmt = new Pane();
        paneFcSsPmt.getChildren().addAll(lbFcSsPmt1, tfFcSsPmt1, lbFcSsPmt2, tfFcSsPmt2, lbFcSsPmt3, tfFcSsPmt3,
                lbFcSsPmtCaCalculate2, btnFcSsPmtCalculate2);


        Button btnFcSsPMT = new Button();
        btnFcSsPMT.setText("Start Principal");    // Start Principal button
        btnFcSsPMT.setStyle("-fx-background-color: #00ff00");
        btnFcSsPMT.setOnAction(e -> bpFcSs.setCenter(paneFcSsPmt));   // When button clicked paneFcSsPmt(pane) come to bpFcSs(border pane) center


        //-------------------------------------------------------------------------------------------------------------

        // Future Value in Interest Rate
        Label lbFcSsIy1 = new Label();
        lbFcSsIy1.setText("Future Value");
        lbFcSsIy1.setLayoutX(20);
        lbFcSsIy1.setLayoutY(30);

        // Text field of Future Value
        TextField tfFcSsIy1 = new TextField();
        tfFcSsIy1.setLayoutX(150);
        tfFcSsIy1.setLayoutY(30);
        tfFcSsIy1.setOnMousePressed(e -> getKeyInput(tfFcSsIy1,bpFcSs));  // Call method getKeyInput and add arguments

        // Time in Start Interest Rate
        Label lbFcSsIy2 = new Label();
        lbFcSsIy2.setText("Time (in years)");
        lbFcSsIy2.setLayoutX(20);
        lbFcSsIy2.setLayoutY(60);

        // Text field of Time
        TextField tfFcSsIy2 = new TextField();
        tfFcSsIy2.setLayoutX(150);
        tfFcSsIy2.setLayoutY(60);
        tfFcSsIy2.setOnMousePressed(e -> getKeyInput(tfFcSsIy2,bpFcSs));

        // Start Principal in Interest Rate
        Label lbFcSsIy3 = new Label();
        lbFcSsIy3.setText("Start Principal");
        lbFcSsIy3.setLayoutX(20);
        lbFcSsIy3.setLayoutY(90);

        // Text field of Start Principal
        TextField tfFcSsIy3 = new TextField();
        tfFcSsIy3.setLayoutX(150);
        tfFcSsIy3.setLayoutY(90);
        tfFcSsIy3.setOnMousePressed(e -> getKeyInput(tfFcSsIy3,bpFcSs));


        Label lbFcSsIyCaCalculate3 = new Label();   // Answer label
        lbFcSsIyCaCalculate3.setLayoutX(70);
        lbFcSsIyCaCalculate3.setLayoutY(220);
        lbFcSsIyCaCalculate3.setText("");

        Button btnFcSsIyCalculate3 = new Button();  // Calculate button
        btnFcSsIyCalculate3.setText("Calculate");
        btnFcSsIyCalculate3.setLayoutX(80);
        btnFcSsIyCalculate3.setLayoutY(140);
        btnFcSsIyCalculate3.setOnAction(e -> {

            // Get inputs and calculate relevant variable by formula

            try {
                double tfFcSsIy1Val = Double.parseDouble(tfFcSsIy1.getText()); // Convert to double value
                double tfFcSsIy2Val = Double.parseDouble(tfFcSsIy2.getText());
                double tfFcSsIy3Val = Double.parseDouble(tfFcSsIy3.getText());
                // Add inputs to formula
                double FcSsIy = 12 * (Math.pow((tfFcSsIy1Val/tfFcSsIy3Val),1/(12 * tfFcSsIy2Val)) - 1);
                        lbFcSsIyCaCalculate3.setText(String.valueOf( "Interest Rate: " + df.format(FcSsIy))); // Set answer to label
            }
            catch (NumberFormatException e1){
               // This is a alert box. If any thing went wrong run this exception
                AlertBox.display("Enter valid input.");

            }
        });

        // Add text fields and labels to the pane
        Pane paneFcSsIy = new Pane();
        paneFcSsIy.getChildren().addAll(lbFcSsIy1, tfFcSsIy1, lbFcSsIy2, tfFcSsIy2, lbFcSsIy3, tfFcSsIy3,
                lbFcSsIyCaCalculate3, btnFcSsIyCalculate3);

        Button btnFcSsIY = new Button();
        btnFcSsIY.setText("Interest Rate (I/Y)");    // Interest Rate button
        btnFcSsIY.setStyle("-fx-background-color: #696800");
        btnFcSsIY.setOnAction(e -> bpFcSs.setCenter(paneFcSsIy));  // When button clicked paneFcSsIy(pane) come to bpFcSs(border pane) center

        //-------------------------------------------------------------------------------------------------------------

        // Future Value in Time
        Label lbFcSsSp1 = new Label();
        lbFcSsSp1.setText("Future Value");
        lbFcSsSp1.setLayoutX(20);
        lbFcSsSp1.setLayoutY(30);

        // Text field of Future Value
        TextField tfFcSsSp1 = new TextField();
        tfFcSsSp1.setLayoutX(150);
        tfFcSsSp1.setLayoutY(30);
        tfFcSsSp1.setOnMousePressed(e -> getKeyInput(tfFcSsSp1,bpFcSs));  // Call method getKeyInput and add arguments

        // Start Principal in Time
        Label lbFcSsSp2 = new Label();
        lbFcSsSp2.setText("Start Principal");
        lbFcSsSp2.setLayoutX(20);
        lbFcSsSp2.setLayoutY(60);

        // Text field of Start Principal
        TextField tfFcSsSp2 = new TextField();
        tfFcSsSp2.setLayoutX(150);
        tfFcSsSp2.setLayoutY(60);
        tfFcSsSp2.setOnMousePressed(e -> getKeyInput(tfFcSsSp2,bpFcSs));

        // Interest Rate in Time
        Label lbFcSsSp3 = new Label();
        lbFcSsSp3.setText("Interest Rate (I/Y)");
        lbFcSsSp3.setLayoutX(20);
        lbFcSsSp3.setLayoutY(90);

      // Text field of Interest Rate
        TextField tfFcSsSp3 = new TextField();
        tfFcSsSp3.setLayoutX(150);
        tfFcSsSp3.setLayoutY(90);
        tfFcSsSp3.setOnMousePressed(e -> getKeyInput(tfFcSsSp3,bpFcSs));


        Label lbFcSsSpCaCalculate4 = new Label();   // Answer label
        lbFcSsSpCaCalculate4.setLayoutX(70);
        lbFcSsSpCaCalculate4.setLayoutY(220);
        lbFcSsSpCaCalculate4.setText("");

        Button btnFcSsSpCalculate4 = new Button();  // Calculate button
        btnFcSsSpCalculate4.setText("Calculate");
        btnFcSsSpCalculate4.setLayoutX(80);
        btnFcSsSpCalculate4.setLayoutY(140);
        btnFcSsSpCalculate4.setOnAction(e -> {

            // Get inputs and calculate relevant variable by formula

            try {
                double tfFcSsSp1Val = Double.parseDouble(tfFcSsSp1.getText()); // Convert to double value
                double tfFcSsSp2Val = Double.parseDouble(tfFcSsSp2.getText());
                double tfFcSsSp3Val = Double.parseDouble(tfFcSsSp3.getText());
                // Add inputs to formula
                double FcSsSp = (Math.log(tfFcSsSp1Val / tfFcSsSp2Val)) /
                        (12 * ( Math.log(1 + (tfFcSsSp3Val / (12 * 100)))));
                        lbFcSsSpCaCalculate4.setText(String.valueOf( "Time: " + df.format(FcSsSp))); // Set answer to label
            }

            catch (NumberFormatException e1){

             // This is a alert box. If any thing went wrong run this exception
                AlertBox.display("Enter valid input.");

            }
        });

        // Add text fields and labels to the pane
        Pane paneFcSsSp = new Pane();
        paneFcSsSp.getChildren().addAll(lbFcSsSp1, tfFcSsSp1, lbFcSsSp2, tfFcSsSp2, lbFcSsSp3, tfFcSsSp3,
                lbFcSsSpCaCalculate4, btnFcSsSpCalculate4);

        Button btnFcSsSP = new Button();
        btnFcSsSP.setStyle("-fx-background-color: #ffe3a3");
        btnFcSsSP.setText("Time (in years)");    // Time button
        btnFcSsSP.setOnAction(e -> bpFcSs.setCenter(paneFcSsSp)); // When button clicked paneFcSsSp(pane) come to bpFcSs(border pane) center

        HBox hbFcSs = new HBox(); // Add fixed deposit buttons
        hbFcSs.getChildren().addAll(btnFcSsFv, btnFcSsPMT, btnFcSsIY, btnFcSsSP);

        bpFcSs = new BorderPane();
        bpFcSs.setTop(hbFcSs);

        //-------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------------------

        // Time in Future Value
        Label lbFcRpFv1 = new Label();
        lbFcRpFv1.setText("Time (in years)");
        lbFcRpFv1.setLayoutX(20);
        lbFcRpFv1.setLayoutY(30);

        // Text field of Time
        TextField tfFcRpFv1 = new TextField();
        tfFcRpFv1.setLayoutX(150);
        tfFcRpFv1.setLayoutY(30);
        tfFcRpFv1.setOnMousePressed(e -> getKeyInput(tfFcRpFv1,bpFcRp));  // Call method getKeyInput and add arguments

        // Start Principal in Future Value
        Label lbFcRpFv2 = new Label();
        lbFcRpFv2.setText("Start Principal");
        lbFcRpFv2.setLayoutX(20);
        lbFcRpFv2.setLayoutY(60);

        // Text field of Start Principal
        TextField tfFcRpFv2 = new TextField();
        tfFcRpFv2.setLayoutX(150);
        tfFcRpFv2.setLayoutY(60);
        tfFcRpFv2.setOnMousePressed(e -> getKeyInput(tfFcRpFv2,bpFcRp));

        // Interest Rate in Future Value
        Label lbFcRpFv3 = new Label();
        lbFcRpFv3.setText("Interest Rate (I/Y)");
        lbFcRpFv3.setLayoutX(20);
        lbFcRpFv3.setLayoutY(90);

        // Text field of Interest Rate
        TextField tfFcRpFv3 = new TextField();
        tfFcRpFv3.setLayoutX(150);
        tfFcRpFv3.setLayoutY(90);
        tfFcRpFv3.setOnMousePressed(e -> getKeyInput(tfFcRpFv3,bpFcRp));

        // Annuity Payment in Future Value
        Label lbFcRpFv4 = new Label();
        lbFcRpFv4.setText("Annuity Payment");
        lbFcRpFv4.setLayoutX(20);
        lbFcRpFv4.setLayoutY(120);

        // Text field of Annuity Payment
        TextField tfFcRpFv4 = new TextField();
        tfFcRpFv4.setLayoutX(150);
        tfFcRpFv4.setLayoutY(120);
        tfFcRpFv4.setOnMousePressed(e -> getKeyInput(tfFcRpFv4,bpFcRp));


        Label lbFcRpFvCaCalculate1 = new Label();   // Answer label
        lbFcRpFvCaCalculate1.setLayoutX(70);
        lbFcRpFvCaCalculate1.setLayoutY(250);
        lbFcRpFvCaCalculate1.setText("");

        Button btnFcRpFvCalculate1 = new Button();  // Calculate button
        btnFcRpFvCalculate1.setText("Calculate");
        btnFcRpFvCalculate1.setLayoutX(80);
        btnFcRpFvCalculate1.setLayoutY(170);
        btnFcRpFvCalculate1.setOnAction(e -> {

            // Get inputs and calculate relevant variable by formula

            try {
                double tfFcRpFv1Val = Double.parseDouble(tfFcRpFv1.getText()); // Convert to double value
                double tfFcRpFv2Val = Double.parseDouble(tfFcRpFv2.getText());
                double tfFcRpFv3Val = Double.parseDouble(tfFcRpFv3.getText());
                double tfFcRpFv4Val = Double.parseDouble(tfFcRpFv4.getText());
                // Add inputs to formula
                double FcRpFv = tfFcRpFv2Val * (Math.pow((1 + (tfFcRpFv3Val/(12 * 100))),12 * tfFcRpFv1Val)) +
                        tfFcRpFv4Val * ((Math.pow(1 + (tfFcRpFv3Val/(12 * 100)),12 * tfFcRpFv1Val) - 1)/ (tfFcRpFv1Val/12));
                        lbFcRpFvCaCalculate1.setText(String.valueOf(df.format(FcRpFv)));    // Set answer to label
            }

            catch (NumberFormatException e1){
               // This is a alert box. If any thing went wrong run this exception
                AlertBox.display("Enter valid input.");

            }
        });

        // Add text fields and labels to the pane
        Pane paneFcRpFv = new Pane();
        paneFcRpFv.getChildren().addAll(lbFcRpFv1, tfFcRpFv1, lbFcRpFv2, tfFcRpFv2, lbFcRpFv3, tfFcRpFv3, lbFcRpFv4,
                tfFcRpFv4, lbFcRpFvCaCalculate1, btnFcRpFvCalculate1);

        Button btnFcRpFv = new Button();    // Future Value button
        btnFcRpFv.setText("Future Value");
        btnFcRpFv.setStyle("-fx-background-color: #FF3399");
        btnFcRpFv.setOnAction(e -> bpFcRp.setCenter(paneFcRpFv));  // When button clicked paneFcRpFv(pane) come to bpFcRp(border pane) center

        //-------------------------------------------------------------------------------------------------------------

        // Future Value in Annuity Payment
        Label lbFcRpPmt1 = new Label();
        lbFcRpPmt1.setText("Future Value");
        lbFcRpPmt1.setLayoutX(20);
        lbFcRpPmt1.setLayoutY(30);

        // Text field of Future Value
        TextField tfFcRpPmt1 = new TextField();
        tfFcRpPmt1.setLayoutX(150);
        tfFcRpPmt1.setLayoutY(30);
        tfFcRpPmt1.setOnMousePressed(e -> getKeyInput(tfFcRpPmt1,bpFcRp));  // Call method getKeyInput and add arguments

        // Time in Annuity Payment
        Label lbFcRpPmt2 = new Label();
        lbFcRpPmt2.setText("Time (in years)");
        lbFcRpPmt2.setLayoutX(20);
        lbFcRpPmt2.setLayoutY(60);

        // Text field of Time
        TextField tfFcRpPmt2 = new TextField();
        tfFcRpPmt2.setLayoutX(150);
        tfFcRpPmt2.setLayoutY(60);
        tfFcRpPmt2.setOnMousePressed(e -> getKeyInput(tfFcRpPmt2,bpFcRp));

        // Start Principal in Annuity Payment
        Label lbFcRpPmt3 = new Label();
        lbFcRpPmt3.setText("Start Principal");
        lbFcRpPmt3.setLayoutX(20);
        lbFcRpPmt3.setLayoutY(90);

        // Text field of Start Principal
        TextField tfFcRpPmt3 = new TextField();
        tfFcRpPmt3.setLayoutX(150);
        tfFcRpPmt3.setLayoutY(90);
        tfFcRpPmt3.setOnMousePressed(e -> getKeyInput(tfFcRpPmt3,bpFcRp));

        // Interest Rate in Annuity Payment
        Label lbFcRpPmt4 = new Label();
        lbFcRpPmt4.setText("Interest Rate (I/Y)");
        lbFcRpPmt4.setLayoutX(20);
        lbFcRpPmt4.setLayoutY(120);

        // Text field of Interest Rate
        TextField tfFcRpPmt4 = new TextField();
        tfFcRpPmt4.setLayoutX(150);
        tfFcRpPmt4.setLayoutY(120);
        tfFcRpPmt4.setOnMousePressed(e -> getKeyInput(tfFcRpPmt4,bpFcRp));


        Label lbFcRpPmtCaCalculate2 = new Label();   // Answer label
        lbFcRpPmtCaCalculate2.setLayoutX(70);
        lbFcRpPmtCaCalculate2.setLayoutY(250);
        lbFcRpPmtCaCalculate2.setText("");

        Button btnFcRpPmtCalculate2 = new Button();  // Calculate button
        btnFcRpPmtCalculate2.setText("Calculate");
        btnFcRpPmtCalculate2.setLayoutX(80);
        btnFcRpPmtCalculate2.setLayoutY(170);
        btnFcRpPmtCalculate2.setOnAction(e -> {

            // Get inputs and calculate relevant variable by formula

            try {
                double tfFcRpPmt1Val = Double.parseDouble(tfFcRpPmt1.getText()); // Convert to double value
                double tfFcRpPmt2Val = Double.parseDouble(tfFcRpPmt2.getText());
                double tfFcRpPmt3Val = Double.parseDouble(tfFcRpPmt3.getText());
                double tfFcRpPmt4Val = Double.parseDouble(tfFcRpPmt4.getText());
                // Add inputs to formula
                double FcRpPmt =  ((tfFcRpPmt1Val - tfFcRpPmt3Val *
                        (Math.pow(1+ (tfFcRpPmt4Val/(12 * 100)),12 * tfFcRpPmt2Val)))
                        * tfFcRpPmt4Val / (12 * 100)) / (((Math.pow(1+ (tfFcRpPmt4Val/(12 * 100)),12 * tfFcRpPmt2Val))) - 1) ;
                // Set answer to label
            }

            catch (NumberFormatException e1){
                // This is a alert box. If any thing went wrong run this exception
                AlertBox.display("Enter valid input.");

            }
        });

        // Add text fields and labels to the pane
        Pane paneFcRpPmt = new Pane();
        paneFcRpPmt.getChildren().addAll(lbFcRpPmt1, tfFcRpPmt1, lbFcRpPmt2, tfFcRpPmt2, lbFcRpPmt3, tfFcRpPmt3,
                lbFcRpPmt4, tfFcRpPmt4, lbFcRpPmtCaCalculate2, btnFcRpPmtCalculate2);


        Button btnFcRpPMT = new Button();
        btnFcRpPMT.setText("Annuity Payment");    // Annuity Payment button
        btnFcRpPMT.setStyle("-fx-background-color: #F1C40F");
        btnFcRpPMT.setOnAction(e -> bpFcRp.setCenter(paneFcRpPmt));  // When button clicked paneFcRpPmt(pane) come to bpFcRp(border pane) center

        //-------------------------------------------------------------------------------------------------------------

        // Future Value in Interest Rate
        Label lbFcRpSp1 = new Label();
        lbFcRpSp1.setText("Future Value");
        lbFcRpSp1.setLayoutX(20);
        lbFcRpSp1.setLayoutY(30);

        // Text field of Future Value
        TextField tfFcRpSp1 = new TextField();
        tfFcRpSp1.setLayoutX(150);
        tfFcRpSp1.setLayoutY(30);
        tfFcRpSp1.setOnMousePressed(e -> getKeyInput(tfFcRpSp1,bpFcRp));  // Call method getKeyInput and add arguments

        // Time in Interest Rate
        Label lbFcRpSp2 = new Label();
        lbFcRpSp2.setText("Time (in years)");
        lbFcRpSp2.setLayoutX(20);
        lbFcRpSp2.setLayoutY(60);

        // Text field of Time
        TextField tfFcRpSp2 = new TextField();
        tfFcRpSp2.setLayoutX(150);
        tfFcRpSp2.setLayoutY(60);
        tfFcRpSp2.setOnMousePressed(e -> getKeyInput(tfFcRpSp2,bpFcRp));

        // Interest Rate in Interest Rate
        Label lbFcRpSp3 = new Label();
        lbFcRpSp3.setText("Interest Rate (I/Y)");
        lbFcRpSp3.setLayoutX(20);
        lbFcRpSp3.setLayoutY(90);

        // Text field of Interest Rate
        TextField tfFcRpSp3 = new TextField();
        tfFcRpSp3.setLayoutX(150);
        tfFcRpSp3.setLayoutY(90);
        tfFcRpSp3.setOnMousePressed(e -> getKeyInput(tfFcRpSp3,bpFcRp));

        // Annuity Payment in Interest Rate
        Label lbFcRpSp4 = new Label();
        lbFcRpSp4.setText("Annuity Payment");
        lbFcRpSp4.setLayoutX(20);
        lbFcRpSp4.setLayoutY(120);

        // Text field of Annuity Payment
        TextField tfFcRpSp4 = new TextField();
        tfFcRpSp4.setLayoutX(150);
        tfFcRpSp4.setLayoutY(120);
        tfFcRpSp4.setOnMousePressed(e -> getKeyInput(tfFcRpSp4,bpFcRp));


        Label lbFcRpSpCaCalculate4 = new Label();   // Answer label
        lbFcRpSpCaCalculate4.setLayoutX(70);
        lbFcRpSpCaCalculate4.setLayoutY(250);
        lbFcRpSpCaCalculate4.setText("");

        Button btnFcRpSpCalculate4 = new Button();  // Calculate button
        btnFcRpSpCalculate4.setText("Calculate");
        btnFcRpSpCalculate4.setLayoutX(80);
        btnFcRpSpCalculate4.setLayoutY(170);
        btnFcRpSpCalculate4.setOnAction(e -> {

            // Get inputs and calculate relevant variable by formula

            try {
                double tfFcRpSp1Val = Double.parseDouble(tfFcRpSp1.getText());     // Convert to double value
                double tfFcRpSp2Val = Double.parseDouble(tfFcRpSp2.getText());
                double tfFcRpSp3Val = Double.parseDouble(tfFcRpSp3.getText());
                double tfFcRpSp4Val = Double.parseDouble(tfFcRpSp4.getText());
                // Add inputs to formula
                double FcRpSp =  (tfFcRpSp1Val - tfFcRpSp4Val *
                        (((Math.pow( 1 + (tfFcRpSp3Val/(12 * 100)),12 * tfFcRpSp2Val)) - 1)/ (tfFcRpSp3Val/ (12 * 100))))
                        / (Math.pow( 1 + (tfFcRpSp3Val/(12 * 100)),12 * tfFcRpSp2Val));
                lbFcRpSpCaCalculate4.setText(String.valueOf("Start Principal: " + df.format(FcRpSp))) ;    // Set answer to label
            }

            catch (NumberFormatException e1){
                // This is a alert box. If any thing went wrong run this exception
                AlertBox.display("Enter valid input.");

            }
        });

        // Add text fields and labels to the pane
        Pane paneFcRpSp = new Pane();
        paneFcRpSp.getChildren().addAll(lbFcRpSp1, tfFcRpSp1, lbFcRpSp2, tfFcRpSp2, lbFcRpSp3, tfFcRpSp3, lbFcRpSp4,
                tfFcRpSp4, lbFcRpSpCaCalculate4, btnFcRpSpCalculate4);

        Button btnFcRpSP = new Button();    // Start Principal button
        btnFcRpSP.setText("Start Principal");
        btnFcRpSP.setStyle("-fx-background-color: #D35400 ");
        btnFcRpSP.setOnAction(e -> bpFcRp.setCenter(paneFcRpSp)); // When button clicked paneFcRpSp(pane) come to bpFcRp(border pane) center

        //------------------------------------------------------------------------------------------------------------

        // Future Value in Time
        Label lbFcRpT1 = new Label();
        lbFcRpT1.setText("Future Value");
        lbFcRpT1.setLayoutX(20);
        lbFcRpT1.setLayoutY(30);

         // Text field of Future Value
        TextField tfFcRpT1 = new TextField();
        tfFcRpT1.setLayoutX(150);
        tfFcRpT1.setLayoutY(30);
        tfFcRpT1.setOnMousePressed(e -> getKeyInput(tfFcRpT1,bpFcRp));  // Call method getKeyInput and add arguments

        // Start Principal in Time
        Label lbFcRpT2 = new Label();
        lbFcRpT2.setText("Start Principal");
        lbFcRpT2.setLayoutX(20);
        lbFcRpT2.setLayoutY(60);

       // Text field of Start Principal
        TextField tfFcRpT2 = new TextField();
        tfFcRpT2.setLayoutX(150);
        tfFcRpT2.setLayoutY(60);
        tfFcRpT2.setOnMousePressed(e -> getKeyInput(tfFcRpT2,bpFcRp));

        // Interest Rate in Time
        Label lbFcRpT3 = new Label();
        lbFcRpT3.setText("Interest Rate (I/Y)");
        lbFcRpT3.setLayoutX(20);
        lbFcRpT3.setLayoutY(90);

        // Text field of Interest Rate
        TextField tfFcRpT3 = new TextField();
        tfFcRpT3.setLayoutX(150);
        tfFcRpT3.setLayoutY(90);
        tfFcRpT3.setOnMousePressed(e -> getKeyInput(tfFcRpT3,bpFcRp));

        // Annuity Payment in Time
        Label lbFcRpT4 = new Label();
        lbFcRpT4.setText("Annuity Payment");
        lbFcRpT4.setLayoutX(20);
        lbFcRpT4.setLayoutY(120);

        // Text field of Annuity Payment
        TextField tfFcRpT4 = new TextField();
        tfFcRpT4.setLayoutX(150);
        tfFcRpT4.setLayoutY(120);
        tfFcRpT4.setOnMousePressed(e -> getKeyInput(tfFcRpT4,bpFcRp));

        Label lbFcRpTCaCalculate4 = new Label();   // Answer label
        lbFcRpTCaCalculate4.setLayoutX(70);
        lbFcRpTCaCalculate4.setLayoutY(250);
        lbFcRpTCaCalculate4.setText("");

        Button btnFcRpTCalculate4 = new Button();  // Calculate button
        btnFcRpTCalculate4.setText("Calculate");
        btnFcRpTCalculate4.setLayoutX(80);
        btnFcRpTCalculate4.setLayoutY(170);
        btnFcRpTCalculate4.setOnAction(e -> {

            // Get inputs and calculate relevant variable by formula

            try {
                double tfFcRpT1Val = Double.parseDouble(tfFcRpT1.getText());    // Convert to double value
                double tfFcRpT2Val = Double.parseDouble(tfFcRpT2.getText());
                double tfFcRpT3Val = Double.parseDouble(tfFcRpT3.getText());
                double tfFcRpT4Val = Double.parseDouble(tfFcRpT4.getText());
                // Add inputs to formula
                 double FcRpT = Math.log((((tfFcRpT1Val * tfFcRpT3Val) / (12 * 100)) + tfFcRpT4Val) /
                         (((tfFcRpT2Val * tfFcRpT3Val) / (12 * 100)) + tfFcRpT4Val)) /
                         (12 * (Math.log(1 + (tfFcRpT3Val / (12 * 100)))));
                         lbFcRpTCaCalculate4.setText(String.valueOf("Time: " + df.format(FcRpT)));    // Set answer to label
            }

            catch (NumberFormatException e1){
                // This is a alert box. If any thing went wrong run this exception
                AlertBox.display("Enter valid input.");

            }
        });

        // Add text fields and labels to the pane
        Pane paneFcRpT = new Pane();
        paneFcRpT.getChildren().addAll(lbFcRpT1, tfFcRpT1, lbFcRpT2, tfFcRpT2, lbFcRpT3, tfFcRpT3, lbFcRpT4,
                tfFcRpT4, lbFcRpTCaCalculate4, btnFcRpTCalculate4);

        Button btnFcRpT = new Button();    // Time button
        btnFcRpT.setText("Time (in years)");
        btnFcRpT.setStyle("-fx-background-color: #17A589 ");
        btnFcRpT.setOnAction(e -> bpFcRp.setCenter(paneFcRpT));  // When button clicked paneFcRpT(pane) come to bpFcRp(border pane) center


        HBox hbFcRp = new HBox();  // Add buttons to hbFcRp
        hbFcRp.getChildren().addAll(btnFcRpFv, btnFcRpPMT, btnFcRpSP, btnFcRpT);

        bpFcRp = new BorderPane();
        bpFcRp.setTop(hbFcRp);

        Button btnFcSs = new Button();
        btnFcSs.setText("Fixed Deposit");
        btnFcSs.setStyle("-fx-background-color: #B3B6B7");
        btnFcSs.setOnAction(e -> bpFc.setCenter(bpFcSs));  // When button clicked bpFcSs(border pane) come to bpFc(border pane) center

        Button btnFcRp = new Button();
        btnFcRp.setStyle("-fx-background-color: #E74C3C  ");
        btnFcRp.setText("Savings (with regular payments or contribution)");
        btnFcRp.setOnAction(e -> bpFc.setCenter(bpFcRp));  // When button clicked bpFcRp(border pane) come to bpFc(border pane) center

        HBox hbFc = new HBox(); //  Add main two parts of savings
        hbFc.getChildren().addAll(btnFcSs, btnFcRp);

        bpFc = new BorderPane();
        bpFc.setTop(hbFc);

        // Savings Calculator button and move to Savings Calculator window
        Button btnSav = new Button();
        btnSav.setText("Savings Calculator");
        btnSav.setStyle("-fx-background-color: #28B463");
        btnSav.setOnAction(e -> layout2.setCenter(bpFc));  // When button clicked paneFcRpT(pane) come to bpFcRp(border pane) center

        //-------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------------------

        // Monthly Pay in Loan Term
        Label lbAlMpT1 = new Label();
        lbAlMpT1.setText("Monthly Pay");
        lbAlMpT1.setLayoutX(20);
        lbAlMpT1.setLayoutY(30);

        // Text field of Monthly Pay
        TextField tfAlMpT1 = new TextField();
        tfAlMpT1.setLayoutX(160);
        tfAlMpT1.setLayoutY(30);
        tfAlMpT1.setOnMousePressed(e -> getKeyInput(tfAlMpT1,bpAlMp));  // Call method getKeyInput and add arguments

        // Start Principal in Loan Term
        Label lbAlMpT2 = new Label();
        lbAlMpT2.setText("Start Principal");
        lbAlMpT2.setLayoutX(20);
        lbAlMpT2.setLayoutY(60);

        // Text field of Start Principal
        TextField tfAlMpT2 = new TextField();
        tfAlMpT2.setLayoutX(160);
        tfAlMpT2.setLayoutY(60);
        tfAlMpT2.setOnMousePressed(e -> getKeyInput(tfAlMpT2,bpAlMp));

        // Interest Rate in Loan Term
        Label lbAlMpT3 = new Label();
        lbAlMpT3.setText("Interest Rate (per month)");
        lbAlMpT3.setLayoutX(20);
        lbAlMpT3.setLayoutY(90);

        // Text field of Interest Rate
        TextField tfAlMpT3 = new TextField();
        tfAlMpT3.setLayoutX(160);
        tfAlMpT3.setLayoutY(90);
        tfAlMpT3.setOnMousePressed(e -> getKeyInput(tfAlMpT3,bpAlMp));

        Label lbAlMpTCaCalculate1 = new Label();   // Answer label
        lbAlMpTCaCalculate1.setLayoutX(70);
        lbAlMpTCaCalculate1.setLayoutY(220);
        lbAlMpTCaCalculate1.setText("");

        Button btnAlMpTCalculate1 = new Button();  // Calculate button
        btnAlMpTCalculate1.setText("Calculate");
        btnAlMpTCalculate1.setLayoutX(80);
        btnAlMpTCalculate1.setLayoutY(140);
        btnAlMpTCalculate1.setOnAction(e -> {

            // Get inputs and calculate relevant variable by formula

            try {
                double tfAlMpT1Val = Double.parseDouble(tfAlMpT1.getText());    // Convert to double value
                double tfAlMpT2Val = Double.parseDouble(tfAlMpT2.getText());
                double tfAlMpT3Val = Double.parseDouble(tfAlMpT3.getText());
                // Add inputs to formula
                double AlMpT =  Math.log((tfAlMpT1Val /(tfAlMpT3Val / 100)/ (tfAlMpT1Val /(tfAlMpT3Val / 100)) -
                        tfAlMpT2Val)) / Math.log(1 + (tfAlMpT3Val / 100));
                        lbAlMpTCaCalculate1.setText(String.valueOf("Loan Term: " + df.format(AlMpT)));    // Set answer to label
            }

            catch (NumberFormatException e1){
                // This is a alert box. If any thing went wrong run this exception
                AlertBox.display("Enter valid input.");

            }
        });


        // Add text fields and labels to the pane
        Pane paneAlMpT = new Pane();
        paneAlMpT.getChildren().addAll(lbAlMpT1, tfAlMpT1, lbAlMpT2, tfAlMpT2, lbAlMpT3, tfAlMpT3, lbAlMpTCaCalculate1,
                btnAlMpTCalculate1);

        Button btnAlMpT = new Button();
        btnAlMpT.setText("Loan Term (in month)");// Loan Term button
        btnAlMpT.setStyle("-fx-background-color: #F4D03F");
        btnAlMpT.setOnAction(e -> bpAlMp.setCenter(paneAlMpT));  // When button clicked paneAlMpT(pane) come to bpAlMp(border pane) center

        //-------------------------------------------------------------------------------------------------------------


        // Start Principal in Monthly Pay
        Label lbAlMpPmt1 = new Label();
        lbAlMpPmt1.setText("Start Principal");
        lbAlMpPmt1.setLayoutX(20);
        lbAlMpPmt1.setLayoutY(30);

        // Text field of Start Principal
        TextField tfAlMpPmt1 = new TextField();
        tfAlMpPmt1.setLayoutX(160);
        tfAlMpPmt1.setLayoutY(30);
        tfAlMpPmt1.setOnMousePressed(e -> getKeyInput(tfAlMpPmt1,bpAlMp));  // Call method getKeyInput and add arguments


        // Loan Term in Monthly Pay
        Label lbAlMpPmt2 = new Label();
        lbAlMpPmt2.setText("Loan Term (in month)");
        lbAlMpPmt2.setLayoutX(20);
        lbAlMpPmt2.setLayoutY(60);

        // Text field of Loan Term
        TextField tfAlMpPmt2 = new TextField();
        tfAlMpPmt2.setLayoutX(160);
        tfAlMpPmt2.setLayoutY(60);
        tfAlMpPmt2.setOnMousePressed(e -> getKeyInput(tfAlMpPmt2,bpAlMp));


        // Interest Rate in Monthly Pay
        Label lbAlMpPmt3 = new Label();
        lbAlMpPmt3.setText("Interest Rate (per month)");
        lbAlMpPmt3.setLayoutX(20);
        lbAlMpPmt3.setLayoutY(90);

        // Text field of Interest Rate
        TextField tfAlMpPmt3 = new TextField();
        tfAlMpPmt3.setLayoutX(160);
        tfAlMpPmt3.setLayoutY(90);
        tfAlMpPmt3.setOnMousePressed(e -> getKeyInput(tfAlMpPmt3,bpAlMp));


        Label lbAlMpPmtCaCalculate2 = new Label();   // Answer label
        lbAlMpPmtCaCalculate2.setLayoutX(70);
        lbAlMpPmtCaCalculate2.setLayoutY(220);
        lbAlMpPmtCaCalculate2.setText("");

        Button btnAlMpPmtCalculate2 = new Button();  // Calculate button
        btnAlMpPmtCalculate2.setText("Calculate");
        btnAlMpPmtCalculate2.setLayoutX(80);
        btnAlMpPmtCalculate2.setLayoutY(140);
        btnAlMpPmtCalculate2.setOnAction(e -> {

            // Get inputs and calculate relevant variable by formula

            try {
                double tfAlMpPmt1Val = Double.parseDouble(tfAlMpPmt1.getText());   // Convert to double value
                double tfAlMpPmt2Val = Double.parseDouble(tfAlMpPmt2.getText());
                double tfAlMpPmt3Val = Double.parseDouble(tfAlMpPmt3.getText());
                // Add inputs to formula
                double AlMpPmt = tfAlMpPmt1Val * (tfAlMpPmt3Val / 100) * (Math.pow(1 + (tfAlMpPmt3Val / 100),
                        tfAlMpPmt2Val)) / ((Math.pow(1 + (tfAlMpPmt3Val / 100),tfAlMpPmt2Val)) - 1);
                        lbAlMpPmtCaCalculate2.setText(String.valueOf("Monthly Pay: " + df.format(AlMpPmt)));    // Set answer to label
            }

            catch (NumberFormatException e1){
               // This is a alert box. If any thing went wrong run this exception
                AlertBox.display("Enter valid input.");

            }
        });

        // Add text fields and labels to the pane
        Pane paneAlMpPmt = new Pane();
        paneAlMpPmt.getChildren().addAll(lbAlMpPmt1, tfAlMpPmt1, lbAlMpPmt2, tfAlMpPmt2, lbAlMpPmt3, tfAlMpPmt3,
                lbAlMpPmtCaCalculate2, btnAlMpPmtCalculate2);

        Button btnAlMpPmt = new Button();   // Monthly Pay button
        btnAlMpPmt.setText("Monthly Pay");
        btnAlMpPmt.setStyle("-fx-background-color:#F5CBA7");
        btnAlMpPmt.setOnAction(e -> bpAlMp.setCenter(paneAlMpPmt));// When button clicked paneAlMpPmt(pane) come to bpAlMp(border pane) center



        //-------------------------------------------------------------------------------------------------------------

        // Monthly Pay in Start Principal
        Label lbAlMpSp1 = new Label();
        lbAlMpSp1.setText("Monthly Pay");
        lbAlMpSp1.setLayoutX(20);
        lbAlMpSp1.setLayoutY(30);

        // Text field of Monthly Pay
        TextField tfAlMpSp1 = new TextField();
        tfAlMpSp1.setLayoutX(160);
        tfAlMpSp1.setLayoutY(30);
        tfAlMpSp1.setOnMousePressed(e -> getKeyInput(tfAlMpSp1,bpAlMp));  // Call method getKeyInput and add arguments

        // Loan Term in Start Principal
        Label lbAlMpSp2 = new Label();
        lbAlMpSp2.setText("Loan Term (in month)");
        lbAlMpSp2.setLayoutX(20);
        lbAlMpSp2.setLayoutY(60);

        // Text field of Loan Term
        TextField tfAlMpSp2 = new TextField();
        tfAlMpSp2.setLayoutX(160);
        tfAlMpSp2.setLayoutY(60);
        tfAlMpSp2.setOnMousePressed(e -> getKeyInput(tfAlMpSp2,bpAlMp));

        // Interest Rate in Start Principal
        Label lbAlMpSp3 = new Label();
        lbAlMpSp3.setText("Interest Rate (per month)");
        lbAlMpSp3.setLayoutX(20);
        lbAlMpSp3.setLayoutY(90);

        // Text field of Interest Rate
        TextField tfAlMpSp3 = new TextField();
        tfAlMpSp3.setLayoutX(160);
        tfAlMpSp3.setLayoutY(90);
        tfAlMpSp3.setOnMousePressed(e -> getKeyInput(tfAlMpSp3,bpAlMp));

        Label lbAlMpSpCaCalculate3 = new Label();   // Answer label
        lbAlMpSpCaCalculate3.setLayoutX(70);
        lbAlMpSpCaCalculate3.setLayoutY(220);
        lbAlMpSpCaCalculate3.setText("");

        Button btnAlMpSpCalculate3 = new Button();  // Calculate button
        btnAlMpSpCalculate3.setText("Calculate");
        btnAlMpSpCalculate3.setLayoutX(80);
        btnAlMpSpCalculate3.setLayoutY(140);
        btnAlMpSpCalculate3.setOnAction(e -> {

            // Get inputs and calculate relevant variable by formula

            try {
                double tfAlMpSp1Val = Double.parseDouble(tfAlMpSp1.getText());   // Convert to double value
                double tfAlMpSp2Val = Double.parseDouble(tfAlMpSp2.getText());
                double tfAlMpSp3Val = Double.parseDouble(tfAlMpSp3.getText());
                // Add inputs to formula
                double AlMpSp = (tfAlMpSp1Val / (tfAlMpSp3Val / 100)) * (1 - 1 / (Math.pow((1 + (tfAlMpSp3Val / 100)),
                        tfAlMpSp2Val)));
                        lbAlMpSpCaCalculate3.setText(String.valueOf( "Start Principal: " + df.format(AlMpSp)));    // Set answer to label
            }

            catch (NumberFormatException e1){
                // This is a alert box. If any thing went wrong run this exception
                AlertBox.display("Enter valid input.");

            }
        });


        // Add text fields and labels to the pane
        Pane paneAlMpSp = new Pane();
        paneAlMpSp.getChildren().addAll(lbAlMpSp1, tfAlMpSp1, lbAlMpSp2, tfAlMpSp2, lbAlMpSp3, tfAlMpSp3,
                lbAlMpSpCaCalculate3, btnAlMpSpCalculate3);

        Button btnAlMpSp = new Button();   // Start Principal button
        btnAlMpSp.setText("Start Principal");
        btnAlMpSp.setStyle("-fx-background-color:#BB8FCE");
        btnAlMpSp.setOnAction(e -> bpAlMp.setCenter(paneAlMpSp)); // When button clicked paneAlMpSp(pane) come to bpAlMp(border pane) center

        HBox hbAlMp = new HBox();    // Add buttons to hbAlMp
        hbAlMp.getChildren().addAll(btnAlMpT,btnAlMpPmt, btnAlMpSp);

        bpAlMp = new BorderPane();
        bpAlMp.setTop(hbAlMp);  // Add hbAlMp to top of the bpAlMp(border pane)

        Button btnAlMp = new Button();
        btnAlMp.setText("Monthly Payment");
        btnAlMp.setOnAction(e -> bpAl.setCenter(bpAlMp));  // When button clicked bpAlMp(border pane) come to bpAl(border pane) center

        HBox hbAL = new HBox();
        hbAL.getChildren().add(btnAlMp);

        bpAl = new BorderPane();
        bpAl.setTop(hbAL);  // Add hbAL to top of the bpAl(border pane)

        Button btnLoan = new Button();
        btnLoan.setText("Auto Loan Calculator");
        btnLoan.setStyle("-fx-background-color:#AEB6BF ");
        btnLoan.setOnAction(e -> {
            layout2.setCenter(bpAl); // When button clicked bpAl(border pane) come to layout2 center

        });

        //--------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------------------


        Button btnHis = new Button();  // History button
        btnHis.setText("History");
        btnHis.setStyle("-fx-background-color:#73C6B");


        Button btnHelp = new Button();   //  Help button
        btnHelp.setText("Help");
        btnHelp.setStyle("-fx-background-color:#E74C3C");
        btnHelp.setOnAction(e -> {

            Label lbHelp1 = new Label();
            lbHelp1.setText(
                    "1.  Selecting a calculator \n" +
                            "\n" +
                            "There are three main calculators. Choose a calculator what you want to calculate. \n" +
                            "Only savings calculator has two other calculators. If you go to it you can choose \n one." +
                            " There are sub buttons. Select what you want to calculate. Then you can enter your \ninputs." +
                            "\n" +
                            "\n");

            Label lbHelp2 = new Label();
            lbHelp2.setText("2.  Inserting values \n" +
                    "\n" +
                    "Enter correct values for each text field. Click on text field which you want to insert values \n " +
                    "If you enter wrong input error message display on alert box." +
                    "\n" +
                    "\n");

            Label lbHelp3 = new Label();
            lbHelp3.setText("3.  Using key board \n" +
                    "\n" +
                    "You can enter inputs on your own key board or app key board. First you need to select any text \n" +
                    "field in window. Then keyboard will come automatically. You can use it as normal key board." +
                    "\n" +
                    "\n");

            Label lbHelp4 = new Label();
            lbHelp4.setText("4.  Calculating \n" +
                    "\n" +
                    "After insert all inputs then you can click calculate button. Then you can get answer." +
                    "\n" +
                    "\n");

            VBox vbHelp = new VBox();
            vbHelp.setPadding(new Insets(20,20,20,20));
            vbHelp.getChildren().addAll(lbHelp1,lbHelp2,lbHelp3,lbHelp4);

            Pane paneHelp = new Pane();
            paneHelp.getChildren().add(vbHelp);

            Stage stageHelp = new Stage();
            stageHelp.setTitle("Help");

            stageHelp.setScene(new Scene(paneHelp,550,400));
            stageHelp.show();

        });



        HBox hbtop = new HBox();   //  hbtop is inside layout2(border pane)
        hbtop.getChildren().addAll(btnHome, btnMor, btnSav, btnLoan, btnHis, btnHelp);

        layout2 = new BorderPane();
        layout2.setTop(hbtop);
        scene2 = new Scene(layout2, 600, 400);  //  Layout2(border pane) is inside scene2

        window.setTitle("Financial Calculator App");
        window.setScene(scene1);
        window.show(); // Show the stage

    }
}



