package com.test.n.cs281bodymatch;

/**
 * Created by varis on 23/11/2559.
 */

public class Data {

    public double age;
    public double height;
    public double height2;
    public double weight;
    public double bmi;
    public double female_bmr;
    public double male_bmr;

    public void CaLculate(){


        height2 = (height/100)*(height/100);
        bmi = weight/height2;
        female_bmr = (double) (665 + (9.6*weight) + (1.8*height) -(4.7*age));
        male_bmr = (double) (66 + (13.7*weight) + (5*height) - (6.8*age));
    }

    public  String Ratebmi() {

        String a = "  Very severely underweight";
        String b = "  Severely underweight";

        String c = "  Underweight";
        String d = "  Normal(healthy weight)";
        String e = "  Overweight";
        String f = "  Moderately obese";
        String g = "  Severely obese";
        String h = "  Very severely obese";


        if (bmi < 16.00) {
            return a;
        } else if ((bmi >= 16.00) && (bmi <= 16.99)) {
            return b;
        } else if ((bmi >= 17.00) && (bmi <= 18.49)) {
            return c;
        } else if ((bmi >= 18.50) && (bmi <= 24.99)) {
            return d;
        } else if ((bmi >= 25.00) && (bmi <= 29.99)) {
            return e;
        } else if ((bmi >= 30.00) && (bmi <= 34.99)) {
            return f;
        } else if ((bmi >= 35.00) && (bmi <= 39.99)) {
            return g;
        }

        return h;

    }

    }