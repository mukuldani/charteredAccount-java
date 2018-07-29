/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charteredaccountant;

/**
 *
 * @author Mukul Dani
 */
public class Constants {
    public static final String EMAIL_REGEX= 
		"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    public static final String MOBILE_REGEX = 
		"(0/91)?[7-9][0-9]{9}";
    
    public static final String PAN_REGEX = "[A-Za-z]{5}[0-9]{4}[A-Za-z]{1}";    
    public static final String GSTIN_REGEX = "[0-9]{2}[A-Za-z]{5}[0-9]{4}[A-Za-z]{1}[0-9]{1}[Zz]{1}[A-Za-z0-9]{1}";
}
