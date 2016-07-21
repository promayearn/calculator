package com.augmentis.ayp.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    private static final String TAG = "ClaculatorActivity";

    private Button buttonZero;
    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;
    private Button buttonFour;
    private Button buttonFive;
    private Button buttonSix;
    private Button buttonSeven;
    private Button buttonEight;
    private Button buttonNine;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonMulti;
    private Button buttonDivide;
    private Button buttonResult;
    private Button buttonClear;

    private TextView textInput;
    private TextView textResult;

    private String firstString = "0";
    private String secondString = "0";
    private String resultString = "";
    private String operation = "";

    private boolean operator = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        buttonZero = (Button) findViewById(R.id.num_0);
        buttonOne = (Button) findViewById(R.id.num_1);
        buttonTwo = (Button) findViewById(R.id.num_2);
        buttonThree = (Button) findViewById(R.id.num_3);
        buttonFour = (Button) findViewById(R.id.num_4);
        buttonFive = (Button) findViewById(R.id.num_5);
        buttonSix = (Button) findViewById(R.id.num_6);
        buttonSeven = (Button) findViewById(R.id.num_7);
        buttonEight = (Button) findViewById(R.id.num_8);
        buttonNine = (Button) findViewById(R.id.num_9);
        buttonPlus = (Button) findViewById(R.id.plus);
        buttonMinus = (Button) findViewById(R.id.minus);
        buttonMulti = (Button) findViewById(R.id.multi);
        buttonDivide = (Button) findViewById(R.id.divide);
        buttonResult = (Button) findViewById(R.id.result);
        buttonClear = (Button) findViewById(R.id.clear);

        textInput = (TextView) findViewById(R.id.input);
        textResult = (TextView) findViewById(R.id.output);

        textInput.setText("0");
        textResult.setText("");

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Click : " + buttonZero.getText().toString());
                if (!operator) {
                    if (firstString.equals("0")) {
                        firstString = "0";
                        textInput.setText(firstString);
                    } else {
                        firstString += buttonZero.getText().toString();
                        textInput.setText(firstString);
                    }
                } else {
                    if (secondString.equals("0")) {
                        secondString = "0";
                        textInput.setText(firstString + " " + operation + " " + secondString);
                    } else {
                        secondString += buttonZero.getText().toString();
                        textInput.setText(firstString + " " + operation + " " + secondString);
                    }
                }
            }
        });

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Click : " + buttonOne.getText().toString());
                if (!operator) {
                    if (firstString.charAt(0) == '0') {
                        firstString = "1";
                        textInput.setText(firstString);
                    } else {
                        firstString += "1";
                        textInput.setText(firstString);
                    }
                } else {
                    if (secondString.charAt(0) == '0') {
                        secondString = "1";
                        textInput.setText(firstString + " " + operation + " " + secondString);
                    } else {
                        secondString += "1";
                        textInput.setText(firstString + " " + operation + " " + secondString);
                    }
                }
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Click : " + buttonTwo.getText().toString());
                if (!operator) {
                    if (firstString.charAt(0) == '0') {
                        firstString = "2";
                        textInput.setText(firstString);
                    } else {
                        firstString += "2";
                        textInput.setText(firstString);
                    }
                } else {
                    if (secondString.charAt(0) == '0') {
                        secondString = "2";
                        textInput.setText(firstString + " " + operation + " " + secondString);
                    } else {
                        secondString += "2";
                        textInput.setText(firstString + " " + operation + " " + secondString);
                    }
                }
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Click : " + buttonThree.getText().toString());
                if (!operator) {
                    if (firstString.charAt(0) == '0') {
                        firstString = "3";
                        textInput.setText(firstString);
                    } else {
                        firstString += "3";
                        textInput.setText(firstString);
                    }
                } else {
                    if (secondString.charAt(0) == '0') {
                        secondString = "3";
                        textInput.setText(firstString + " " + operation + " " + secondString);
                    } else {
                        secondString += "3";
                        textInput.setText(firstString + " " + operation + " " + secondString);
                    }
                }
            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Click : " + buttonFour.getText().toString());
                if (!operator) {
                    if (firstString.charAt(0) == '0') {
                        firstString = "4";
                        textInput.setText(firstString);
                    } else {
                        firstString += "4";
                        textInput.setText(firstString);
                    }
                } else {
                    if (secondString.charAt(0) == '0') {
                        secondString = "4";
                        textInput.setText(firstString + " " + operation + " " + secondString);
                    } else {
                        secondString += "4";
                        textInput.setText(firstString + " " + operation + " " + secondString);
                    }
                }
            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Click : " + buttonFive.getText().toString());
                if (!operator) {
                    if (firstString.charAt(0) == '0') {
                        firstString = "5";
                        textInput.setText(firstString);
                    } else {
                        firstString += "5";
                        textInput.setText(firstString);
                    }
                } else {
                    if (secondString.charAt(0) == '0') {
                        secondString = "5";
                        textInput.setText(firstString + " " + operation + " " + secondString);
                    } else {
                        secondString += "5";
                        textInput.setText(firstString + " " + operation + " " + secondString);
                    }
                }
            }
        });

        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Click : " + buttonSix.getText().toString());
                if (!operator) {
                    if (firstString.charAt(0) == '0') {
                        firstString = "6";
                        textInput.setText(firstString);
                    } else {
                        firstString += "6";
                        textInput.setText(firstString);
                    }
                } else {
                    if (secondString.charAt(0) == '0') {
                        secondString = "6";
                        textInput.setText(firstString + " " + operation + " " + secondString);
                    } else {
                        secondString += "6";
                        textInput.setText(firstString + " " + operation + " " + secondString);
                    }
                }
            }
        });

        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Click : " + buttonSeven.getText().toString());
                if (!operator) {
                    if (firstString.charAt(0) == '0') {
                        firstString = "7";
                        textInput.setText(firstString);
                    } else {
                        firstString += "7";
                        textInput.setText(firstString);
                    }
                } else {
                    if (secondString.charAt(0) == '0') {
                        secondString = "7";
                        textInput.setText(firstString + " " + operation + " " + secondString);
                    } else {
                        secondString += "7";
                        textInput.setText(firstString + " " + operation + " " + secondString);
                    }
                }
            }
        });

        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Click : " + buttonEight.getText().toString());
                if (!operator) {
                    if (firstString.charAt(0) == '0') {
                        firstString = "8";
                        textInput.setText(firstString);
                    } else {
                        firstString += "8";
                        textInput.setText(firstString);
                    }
                } else {
                    if (secondString.charAt(0) == '0') {
                        secondString = "8";
                        textInput.setText(firstString + " " + operation + " " + secondString);
                    } else {
                        secondString += "8";
                        textInput.setText(firstString + " " + operation + " " + secondString);
                    }
                }
            }
        });

        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Click : " + buttonNine.getText().toString());
                if (!operator) {
                    if (firstString.charAt(0) == '0') {
                        firstString = "9";
                        textInput.setText(firstString);
                    } else {
                        firstString += "9";
                        textInput.setText(firstString);
                    }
                } else {
                    if (secondString.charAt(0) == '0') {
                        secondString = "9";
                        textInput.setText(firstString + " " + operation + " " + secondString);
                    } else {
                        secondString += "9";
                        textInput.setText(firstString + " " + operation + " " + secondString);
                    }
                }
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Click : " + buttonPlus.getText().toString());
                textInput.setText(firstString + " +");
                operation = "+";
                operator = true;
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Click : " + buttonMinus.getText().toString());
                textInput.setText(firstString + " -");
                operation = "-";
                operator = true;
            }
        });

        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Click : " + buttonMulti.getText().toString());
                textInput.setText(firstString + "  *");
                operation = "*";
                operator = true;
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Click : " + buttonDivide.getText().toString());
                textInput.setText(firstString + "  /");
                operation = "/";
                operator = true;
            }
        });

        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Click : " + buttonResult.getText().toString());
                Calculate();
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Click : " + buttonClear.getText().toString());
                firstString = "0";
                secondString = "0";
                resultString = "";
                textInput.setText("");
                textResult.setText("");
                operator = false;
                Log.d(TAG, "Reset firstString");
                Log.d(TAG, "Reset secondString");
            }
        });

    }

    public void Calculate() {
        float numFirst = 0;
        float numSecond = 0;
        float numResult = 0;

        Log.d(TAG, "numFirst = " + firstString);
        Log.d(TAG, "numSecond = " + secondString);


        numFirst = Float.parseFloat(firstString);
        numSecond = Float.parseFloat(secondString);
        switch (operation) {
            case "+":
                numResult = numFirst + numSecond;
                break;
            case "-":
                numResult = numFirst - numSecond;
                break;
            case "*":
                numResult = numFirst * numSecond;
                break;
            case "/":
                numResult = numFirst / numSecond;
                break;
        }

        resultString = Float.toString(numResult);
        textResult.setText(resultString);
        Log.d(TAG, "Result = " + resultString);
    }
}
