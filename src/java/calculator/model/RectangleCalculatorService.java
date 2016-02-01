/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.model;

import java.math.BigDecimal;

/**
 *
 * @author Scott
 */
public class RectangleCalculatorService {
    
    public RectangleCalculatorService()
    {
        
    }
    
    public BigDecimal calculateArea(String width, String height)
    {
        //initialize return value and declare local variables
        BigDecimal result = BigDecimal.ZERO;
        BigDecimal bigWidth, bigHeight;
        //attempt to parse values
        try
        {
            bigWidth = new BigDecimal(width);
            bigHeight = new BigDecimal(height);
        }
        catch(Exception e)
        {
            throw new IllegalArgumentException("Non-numeric value entered!");
        }
        if(bigWidth.compareTo(result) <= 0 || bigHeight.compareTo(result) <= 0)
        {
            throw new IllegalArgumentException("Value must be greater than zero!");
        }
        result = bigWidth.multiply(bigHeight);
        return result;
    }
}
