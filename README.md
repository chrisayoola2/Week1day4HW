# Week1day4HWCreate a calculator app to perform all the standard calculator operations like addition, subtraction, multiplication, divide etc. 
 -No edittexts
 -Changing the orientation to landscape(layout qualifier) will display now functionality (Scientific calculator)
 Hint: Create all buttons using Relative/Grid Layout and append the values to the TextView. Show the result in a separate TextView.
 
 ![calculator1](https://user-images.githubusercontent.com/51377425/59155539-ab2baf00-8a59-11e9-9b67-186d9a185948.png)
![calculator2](https://user-images.githubusercontent.com/51377425/59155541-acf57280-8a59-11e9-85db-154763159f50.png)
![calculator3](https://user-images.githubusercontent.com/51377425/59155543-aebf3600-8a59-11e9-8873-5f222e0cc70e.png)




 
 
 public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int count = 0;  // 0 if Enter button has not been used, 1 if Enter button has been used
    String operator;

    TextView tvCalculate;
    TextView tvResult;
    Button btn0;
    Button btn9;
    Button btn8;
    Button btn7;
    Button btn6;
    Button btn5;
    Button btn4;
    Button btn3;
    Button btn2;
    Button btn1;
    Button btnAdd;
    Button btnDecimal;
    Button btnDiv;
    Button btnClear;
    Button btnMin;
    Button btnMul;
    Button btnEnter;


    StringBuilder strBeforeOperator = new StringBuilder();
    String num1;
    String num2;
    String[] equation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {  // On create method
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn0 = findViewById(R.id.btn0);
        btn9 = findViewById(R.id.btn9);
        btn8 = findViewById(R.id.btn8);
        btn7 = findViewById(R.id.btn7);
        btn6 = findViewById(R.id.btn6);
        btn5 = findViewById(R.id.btn5);
        btn4 = findViewById(R.id.btn4);
        btn3 = findViewById(R.id.btn3);
        btn2 = findViewById(R.id.btn2);
        btn1 = findViewById(R.id.btn1);
        btnAdd = findViewById(R.id.btnAdd);
        btnDecimal = findViewById(R.id.btnDecimal);
        btnDiv = findViewById(R.id.btnDiv);
        btnClear = findViewById(R.id.btnClear);
        btnMin = findViewById(R.id.btnMin);
        btnMul = findViewById(R.id.btnMul);
        tvCalculate = findViewById(R.id.tvCalculate);
        btnEnter = findViewById(R.id.btnEnter);
        tvResult = findViewById(R.id.tvResult);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnMin.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnDecimal.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnEnter.setOnClickListener(this);

    }


    private String addNumbers(String num1, String num2) {  // method that completes addition
        final double numOne = Double.parseDouble(num1);
        final double numTwo = Double.parseDouble(num2);
        return String.valueOf(numOne + numTwo);
    }

    private String subNumbers(String num1, String num2) {  // method that completes addition
        final double numOne = Double.parseDouble(num1);
        final double numTwo = Double.parseDouble(num2);
        return String.valueOf(numOne - numTwo);
    }

    private String divNumbers(String num1, String num2) {  // method that completes addition
        final double numOne = Double.parseDouble(num1);
        final double numTwo = Double.parseDouble(num2);
        return String.valueOf(numOne / numTwo);
    }

    private String mulNumbers(String num1, String num2) {  // method that completes addition
        final double numOne = Double.parseDouble(num1);
        final double numTwo = Double.parseDouble(num2);
        return String.valueOf(numOne * numTwo);
    }





    @Override
    public void onClick(View v) {    // what happens on each click


        switch (v.getId()) {
            case R.id.btn0:
                strBeforeOperator.append(0);                //On click add 0 to string builder
                tvCalculate.setText(strBeforeOperator);
                break;

            case R.id.btn1:

                strBeforeOperator.append(1);
                tvCalculate.setText(strBeforeOperator);   //On click add 1  to string builder
                break;

            case R.id.btn2:
                strBeforeOperator.append(2);
                tvCalculate.setText(strBeforeOperator);  //On click add 2 to string builder
                break;

            case R.id.btn3:
                strBeforeOperator.append(3);
                tvCalculate.setText(strBeforeOperator);  //On click add 3 to string builder
                break;

            case R.id.btn4:
                strBeforeOperator.append(4);
                tvCalculate.setText(strBeforeOperator);  //On click add 4 to string builder
                break;

            case R.id.btn5:
                strBeforeOperator.append(5);
                tvCalculate.setText(strBeforeOperator);  //On click add 5 to string builder
                break;

            case R.id.btn6:
                strBeforeOperator.append(6);
                tvCalculate.setText(strBeforeOperator);  //On click add 6 to string builder
                break;

            case R.id.btn7:
                strBeforeOperator.append(7);
                tvCalculate.setText(strBeforeOperator);  //On click add 7 to string builder
                break;

            case R.id.btn8:
                strBeforeOperator.append(8);
                tvCalculate.setText(strBeforeOperator);  //On click add 8 to string builder
                break;

            case R.id.btn9:
                strBeforeOperator.append(9);
                tvCalculate.setText(strBeforeOperator);  //On click add 9 to string builder
                break;

            case R.id.btnClear:
                strBeforeOperator.setLength(0);    //On click Clear
                tvCalculate.setText("Calculate");
                if (count == 1){
                    strBeforeOperator.setLength(0); // if enter has been pressed once, clear cleans both views
                    tvResult.setText("");
                    tvCalculate.setText("");
                }
                count = 0;
                break;

            case R.id.btnDecimal:
                strBeforeOperator.append(".");
                tvCalculate.setText(strBeforeOperator);  // On Click Clear
                break;

            case R.id.btnAdd:  //on Click for add
                operator = "add";
                strBeforeOperator.append("+");
                tvCalculate.setText(strBeforeOperator);
                //if enter has been pressed, clear stringbuiler and save from result text view into the calculate  view and add operator
                if (count == 1) {
                    strBeforeOperator.setLength(0);
                    strBeforeOperator.append(tvResult.getText() + "+");
                    tvCalculate.setText(strBeforeOperator);

                }
                break;

            case R.id.btnMin:
                operator = "min";
                strBeforeOperator.append("-");
                tvCalculate.setText(strBeforeOperator);
                if (count == 1) {  //if enter has been pressed, clear stringbuiler and save from result text view into the calculate  view and add operator
                    strBeforeOperator.setLength(0);
                    strBeforeOperator.append(tvResult.getText() + "-");
                    tvCalculate.setText(strBeforeOperator);
                }
                break;

            case R.id.btnMul:
                operator = "mul";
                strBeforeOperator.append("*");
                tvCalculate.setText(strBeforeOperator);

                if (count == 1) {//if enter has been pressed, clear stringbuiler and save from result text view into the calculate  view and add operator
                    strBeforeOperator.setLength(0);
                    strBeforeOperator.append(tvResult.getText() + "*");
                    tvCalculate.setText(strBeforeOperator);
                }
                break;

            case R.id.btnDiv:
                operator = "div";
                strBeforeOperator.append("/");
                tvCalculate.setText(strBeforeOperator);

                if (count == 1) {//if enter has been pressed, clear stringbuiler and save from result text view into the calculate  view and add operator
                    strBeforeOperator.setLength(0);
                    strBeforeOperator.append(tvResult.getText() + "/");
                    tvCalculate.setText(strBeforeOperator);
                }
                break;

            case R.id.btnEnter:  // on Click enter

                count = 1;
                if (operator.equals("add")) {        // if Operator is add
                    equation = strBeforeOperator.toString().split("\\+", 2); // split method by operator and add numbers into array
                    num1 = equation[0];
                    num2 = equation[1];
                    String result = addNumbers(num1, num2);
                    tvResult.setText(result);
                    num1 = result;

                } else if (operator.equals("min")) {
                    equation = strBeforeOperator.toString().split("-", 2); // split method by operator and add numbers into array

                    num1 = equation[0];
                    num2 = equation[1];
                    String result = subNumbers(num1, num2);
                    tvResult.setText(result);
                    num1 = result;

                } else if (operator.equals("mul")) {
                    equation = strBeforeOperator.toString().split("\\*", 2);// split method by operator and add numbers into array

                    num1 = equation[0];
                    num2 = equation[1];
                    String result = mulNumbers(num1, num2);
                    tvResult.setText(result);
                    num1 = result;

                } else if (operator.equals("div")) {
                    equation = strBeforeOperator.toString().split("/", 2); // split method by operator and add numbers into array

                    num1 = equation[0];
                    num2 = equation[1];
                    String result = divNumbers(num1, num2);
                    tvResult.setText(result);
                    num1 = result;

                }

        }
    }
}

<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <TextView
        android:background="drawable/shape"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/tvResult"
        android:text="helllooo"
        />


    <GridLayout
        android:id="@+id/gridLayout"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:columnCount="4"
        android:orientation="horizontal"
        android:rowCount="5"
        android:layout_alignParentBottom="true"
        android:useDefaultMargins="true">

        <Button
            android:id="@+id/btn7"
            android:background="drawable/shape"
            android:text="7" />
        <Button
            android:id="@+id/btn8"
            android:background="drawable/shape"
            android:text="8" />
        <Button
            android:id="@+id/btn9"
            android:background="drawable/shape"
            android:text="9" />
        <Button
            android:id="@+id/btnAdd"
            android:background="drawable/shape"
            android:text="+" />
        <Button
            android:id="@+id/btn4"
            android:background="drawable/shape"
            android:text="4" />
        <Button
            android:id="@+id/btn5"
            android:background="drawable/shape"
            android:text="5" />
        <Button
            android:id="@+id/btn6"
            android:background="drawable/shape"
            android:text="6" />
        <Button
            android:id="@+id/btnMin"
            android:background="drawable/shape"
            android:text="-" />
        <Button
            android:id="@+id/btn1"
            android:background="drawable/shape"
            android:text="1" />
        <Button
            android:id="@+id/btn2"
            android:background="drawable/shape"
            android:text="2" />
        <Button
            android:id="@+id/btn3"
            android:background="drawable/shape"
            android:text="3" />
        <Button
            android:id="@+id/btnMul"
            android:background="drawable/shape"
            android:text="*" />
        <Button
            android:id="@+id/btnDecimal"
            android:background="drawable/shape"
            android:text="." />
        <Button
            android:id="@+id/btn0"
            android:background="drawable/shape"
            android:text="0" />
        <Button
            android:id="@+id/btnDiv"
            android:background="drawable/shape"
            android:text="/" />
        <Button
            android:id="@+id/btnEquals"
            android:background="drawable/shape"
            android:text="=" />


    </GridLayout>




</RelativeLayout>
