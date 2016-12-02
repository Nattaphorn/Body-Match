package com.test.n.cs281bodymatch;


import org.junit.Test;

import static org.junit.Assert.*;

/*   test output bmi,bmr,bmirate for female,male
     input age=20,height=170, weight=30,47,50,55,75,90,110,150 */

public class DataTest {
    @Test
    public void bmi() {
        Data a = new Data();
        a.age = 20;
        a.height = 170;
        a.weight = 30;
        a.CaLculate();
        double result = a.bmi;
        assertEquals(10.38, result, 0.009);

        a.age = 20;
        a.height = 170;
        a.weight = 47;
        a.CaLculate();
        result = a.bmi;
        assertEquals(16.26, result, 0.009);

        a.age = 20;
        a.height = 170;
        a.weight = 50;
        a.CaLculate();
        result = a.bmi;
        assertEquals(17.30, result, 0.009);

        a.age = 20;
        a.height = 170;
        a.weight = 55;
        a.CaLculate();
        result = a.bmi;
        assertEquals(19.03, result, 0.009);

        a.age = 20;
        a.height = 170;
        a.weight = 75;
        a.CaLculate();
        result = a.bmi;
        assertEquals(25.95, result, 0.009);

        a.age = 20;
        a.height = 170;
        a.weight = 90;
        a.CaLculate();
        result = a.bmi;
        assertEquals(31.14, result, 0.009);

        a.age = 20;
        a.height = 170;
        a.weight = 110;
        a.CaLculate();
        result = a.bmi;
        assertEquals(38.06, result, 0.009);

        a.age = 20;
        a.height = 170;
        a.weight = 150;
        a.CaLculate();
        result = a.bmi;
        assertEquals(51.90, result, 0.009);


    }

    @Test
    public void bmr() {
        ////  bmr for female
        Data a = new Data();
        a.age = 20;
        a.height = 170;
        a.weight = 30;
        a.CaLculate();
        double result = a.female_bmr;
        assertEquals(1165.00, result, 0.009);

        a.age = 20;
        a.height = 170;
        a.weight = 47;
        a.CaLculate();
        result = a.female_bmr;
        assertEquals(1328.20, result, 0.009);

        a.age = 20;
        a.height = 170;
        a.weight = 50;
        a.CaLculate();
        result = a.female_bmr;
        assertEquals(1357.00, result, 0.009);

        a.age = 20;
        a.height = 170;
        a.weight = 55;
        a.CaLculate();
        result = a.female_bmr;
        assertEquals(1405.00, result, 0.009);

        a.age = 20;
        a.height = 170;
        a.weight = 75;
        a.CaLculate();
        result = a.female_bmr;
        assertEquals(1597.00, result, 0.009);

        a.age = 20;
        a.height = 170;
        a.weight = 90;
        a.CaLculate();
        result = a.female_bmr;
        assertEquals(1741.00, result, 0.009);

        a.age = 20;
        a.height = 170;
        a.weight = 110;
        a.CaLculate();
        result = a.female_bmr;
        assertEquals(1933.00, result, 0.009);

        a.age = 20;
        a.height = 170;
        a.weight = 150;
        a.CaLculate();
        result = a.female_bmr;
        assertEquals(2317.00, result, 0.009);

        // bmr for male

        a.age = 20;
        a.height = 170;
        a.weight = 30;
        a.CaLculate();
        result = a.male_bmr;
        assertEquals(1191.00, result, 0.009);

        a.age = 20;
        a.height = 170;
        a.weight = 47;
        a.CaLculate();
        result = a.male_bmr;
        assertEquals(1423.90, result, 0.009);

        a.age = 20;
        a.height = 170;
        a.weight = 50;
        a.CaLculate();
        result = a.male_bmr;
        assertEquals(1465.00, result, 0.009);

        a.age = 20;
        a.height = 170;
        a.weight = 55;
        a.CaLculate();
        result = a.male_bmr;
        assertEquals(1533.50, result, 0.009);

        a.age = 20;
        a.height = 170;
        a.weight = 75;
        a.CaLculate();
        result = a.male_bmr;
        assertEquals(1807.50, result, 0.009);

        a.age = 20;
        a.height = 170;
        a.weight = 90;
        a.CaLculate();
        result = a.male_bmr;
        assertEquals(2013.00, result, 0.009);

        a.age = 20;
        a.height = 170;
        a.weight = 110;
        a.CaLculate();
        result = a.male_bmr;
        assertEquals(2287.00, result, 0.009);

        a.age = 20;
        a.height = 170;
        a.weight = 150;
        a.CaLculate();
        result = a.male_bmr;
        assertEquals(2835.00, result, 0.009);


    }

    @Test
    public void bmrrate() {

        ////  bmirate for female and male

        Data a = new Data();
        a.age = 20;
        a.height = 170;
        a.weight = 30;
        a.CaLculate();
        String result = a.Ratebmi();
        assertEquals("  Very severely underweight", result);

        a.age = 20;
        a.height = 170;
        a.weight = 47;
        a.CaLculate();
        result = a.Ratebmi();
        assertEquals("  Severely underweight", result);

        a.age = 20;
        a.height = 170;
        a.weight = 50;
        a.CaLculate();
        result = a.Ratebmi();
        assertEquals("  Underweight", result);

        a.age = 20;
        a.height = 170;
        a.weight = 55;
        a.CaLculate();
        result = a.Ratebmi();
        assertEquals("  Normal(healthy weight)", result);

        a.age = 20;
        a.height = 170;
        a.weight = 75;
        a.CaLculate();
        result = a.Ratebmi();
        assertEquals("  Overweight", result);

        a.age = 20;
        a.height = 170;
        a.weight = 90;
        a.CaLculate();
        result = a.Ratebmi();
        assertEquals("  Moderately obese", result);

        a.age = 20;
        a.height = 170;
        a.weight = 110;
        a.CaLculate();
        result = a.Ratebmi();
        assertEquals("  Severely obese", result);

        a.age = 20;
        a.height = 170;
        a.weight = 150;
        a.CaLculate();
        result = a.Ratebmi();
        assertEquals("  Very severely obese", result);


    }

}
