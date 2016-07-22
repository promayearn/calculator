package com.augmentis.ayp.calculator;

/**
 * Created by Chayanit on 7/22/2016.
 */
public class Calculator {

    String temp = "";
    float mainNumber = 0;
    String currenOperator;
    float result;
    public void pressNumber(String s) {
        temp += s;
    }

    public void pressOperator(String s) {
        mainNumber = Float.parseFloat(temp);
        temp = "";
        currenOperator = s;
    }

    public void pressEqual() {

        float temp = Float.parseFloat(this.temp);

        if(currenOperator.equals("+")){
            result = mainNumber + temp;
        } else if (currenOperator.equals("-")){
            result = mainNumber - temp;
        } else if (currenOperator.equals("*")){
            result = mainNumber * temp;
        } else if (currenOperator.equals("/")){
            result = mainNumber / temp;
        }
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }
}
