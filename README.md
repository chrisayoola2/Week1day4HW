# Week1day4HWCreate a calculator app to perform all the standard calculator operations like addition, subtraction, multiplication, divide etc. 
 -No edittexts
 -Changing the orientation to landscape(layout qualifier) will display now functionality (Scientific calculator)
 Hint: Create all buttons using Relative/Grid Layout and append the values to the TextView. Show the result in a separate TextView.
 
 ![calculator1](https://user-images.githubusercontent.com/51377425/59155539-ab2baf00-8a59-11e9-9b67-186d9a185948.png)
![calculator2](https://user-images.githubusercontent.com/51377425/59155541-acf57280-8a59-11e9-85db-154763159f50.png)
![calculator3](https://user-images.githubusercontent.com/51377425/59155543-aebf3600-8a59-11e9-8873-5f222e0cc70e.png)




 
 
 public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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
    Button btnEquals;
    Button btnMin;
    Button btnMul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
        btnEquals = findViewById(R.id.btnEquals);
        btnMin = findViewById(R.id.btnMin);
        btnMul = findViewById(R.id.btnMul);
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
        btnEquals.setOnClickListener(this);
    }


    private  addNumbers(String num1, String num2) {
    }

    private  subtractNumbers(String num1, String num2) {
    }
    private  divideNumbers(String num1, String num2) {
    }
    private  addNumbers(String num1, String num2) {
    }


    @Override
    public void onClick(View v) {
       String string = " ";
        switch (v.getId()) {
            case R.id.btn0:
                string += 0;
                break;

            case R.id.btn1:
                string += 1;
                break;

            case R.id.btn2:
                string += 2;
                break;

            case R.id.btn3:
                string += 3;
                break;

            case R.id.btn4:
                string += 4;
                break;

            case R.id.btn5:
                string += 5;
                break;

            case R.id.btn6:
                string += 6;
                break;

            case R.id.btn7:
                string += 7;
                break;

            case R.id.btn8:
                string += 8;
                break;

            case R.id.btn9:
                string += 9;
                break;

            case R.id.btnAdd:
                addNumbers();
                break;



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
