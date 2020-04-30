/**  ~~~~~
 * Created with the AppyBuilder Code Editor.
 * This is a template for basic Extension.
 * Modify this template to customize your extension.
 *
 * **** NOTE: DO NOT use a package name. 
 * **** The package name will be created for you automatically.
 * **** Adding a package name will cause a compile error
 */
import android.content.Context;
import android.util.Log;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.common.ComponentCategory;

@DesignerComponent(version = 1,  description = "This extention helps you to find the number is odd/even, remainder and quotient, calculate sinple intrest, power of number, area of square, triangle, rectangle, circle and circumference of circle.<br>" + "Developed by: <a href='https://t.me/Gopi_killer' target='_blank'>@Gopi_killer</a><br> " ,
        category = ComponentCategory.EXTENSION,
        nonVisible = true,   iconName = "https://i.ibb.co/BjczrPq/science-1.png")

@SimpleObject(external = true)
public class Gmath extends AndroidNonvisibleComponent {
    private ComponentContainer container;
    /**
     * @param container container, component will be placed in
     */
    public Gmath(ComponentContainer container) {
        super(container.$form());
        this.container = container;
    }
  @SimpleFunction(description = "Find the number is even")
    public boolean isEven(int number) {
    	if(number % 2 == 0){
    		return true;
    	}else{
    		return false;
    	}
    }
  
  @SimpleFunction(description = "Find the number is odd")
    public boolean isOdd(int number) {
    	if(number % 2 != 0){
    		return true;
    	}else{
    		return false;
    	}
    }
    
    @SimpleFunction(description = "Get remainder from the given dividend and divisor")
    public int getRemainder(int dividend, int divisor) {
    	int remainder = dividend % divisor;
    	return remainder;
    }
    
    @SimpleFunction(description = "Get quotient from the given dividend and divisor")
    public int getQuotient(int dividend, int divisor) {
    	int quotient = dividend / divisor;
    	return quotient;
    }
    
    @SimpleFunction(description = "Simple interest calculator")
    public float SimpleInterest(float principalAmount, float ratePerAnnum, float timeInYears) {
    	float sinterest = (principalAmount * ratePerAnnum * timeInYears) / 100;
    	return sinterest;
    }
    
    @SimpleFunction(description = "calculate power of a number")
    public double PowerOfNumber(int number, int power) {
    	double result = Math.pow(number, power);
    	return result;
    }
    
    @SimpleFunction(description = "Find the square root of number")
    public static double SquareRoot(int number) {
			double temp;
			double sr = number / 2;
			do {
				temp = sr;
				sr = (temp + (number / temp)) / 2;
			} while ((temp - sr) != 0);
				return sr;
		 }
		 
		 @SimpleFunction(description = "calculate area of rectangle")
    public double AreaOfRectangle(double length, double width) {
    	double area = length*width;
    	return area;
    }
    
    @SimpleFunction(description = "calculate area of square")
    public double AreaOfSquare(double side) {
    	double area = side*side;
    	return area;
    }
    
    @SimpleFunction(description = "calculate area of triangle")
    public double AreaOfTriangle(double baseWidth, double height) {
    	double area = (baseWidth * height)/2;
    	return area;
    }
    
    @SimpleFunction(description = "calculate area of circle")
    public double AreaOfCircle(int radius) {
    	double area = Math.PI * (radius * radius);
    	return area;
    }
    
    @SimpleFunction(description = "calculate circumference of circle")
    public double CircumferenceOfCircle(int radius) {
    	double circumference= Math.PI * 2*radius;
    	return circumference;
    }
}