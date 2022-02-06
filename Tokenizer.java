/**
 * 
 */
package StringTokenizer;

import java.util.StringTokenizer;
public class Tokenizer {
public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("my name is nowrin"," "); // this code is about the space between last two semicolon. 
		// if you did not give any space, the line would be a straight line without breaking down.
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		} 
		
/*StringTokenizer st = new StringTokenizer ("my,name,is,nowrin");
//printing next token
System.out.print("Next token is: " + st.nextToken(",")); */
		

	}

}
