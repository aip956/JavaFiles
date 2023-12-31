import java.util.*;
public class excelSheetColumn {
    public static String column(int n) {
        String output = "";
        while (n > 0) {
            System.out.println("n: " + n);
            int mod = (n - 1) % 26;
            System.out.println("mod: " + mod);
            output = Character.toString(mod+65) + output;
            System.out.println("output: " + output);
            n = (int)Math.floor((n - 1) / 26);
        }
        return output;
    }

    public static void main(String[] args) {
        int n1 = 703;
        column(n1);
        // System.out.println("Column1: ", column(n1));
    }
}


/*

n = 1, ascii = 65, result = 'A'
mod = n % 26 = 1
letter = mod - 1 + 65 => A


n = 28, n%26 = 2, 65 + (2 - 1); ascii 66 = B
mod = n % 26 = 2
letter = (mod - 1) + 65 = 66 => B
n = 28 / 26 = 1

mod = 1 % 26 = 1
letter = (mod - 1) + 65 = 65 => A

n = 701; 

n = 701, n%26 = 25, 65 + (25 - 1); ascii 89 = Y
n = 701 / 26 = 26
mod 26%26 = 0
letter = (mod - 1) + 65 = 65 => B
n = 28 / 26 = 1

mod = 1 % 26 = 1
letter = (mod - 1) + 65 = 65 => A

 * Topic: Excel Sheet Column Title

Given a positive integer, return its corresponding column title as it appears in an Excel sheet.

For example:
 1 -> A 2 -> B 3 -> C ... 26 -> Z 27 -> AA 28 -> AB ... 


Example 0:
Input: 1
Output: "A" 

	Example 1:
Input: 28
Output: "AB" 

Example 2:
Input: 701
Output: ZY


Function Prototype in JS (you can do this in any language)
function excel_sheet_column_title(param_1)
{

}

 * 
 */