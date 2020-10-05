import acm.program.*;

public class FibonacciFun extends ConsoleProgram {
	 private static final int MAX_TERM_VALUE = 10000;
	 public void run() {
		 println("This program lists the Fibonacci sequence.");
		 int x = 0;
		 int y = 1;
		 while (x <= MAX_TERM_VALUE)
		 {
			 println(x);
			 int z = x+y;
			 x = y;
			 y = z;
		 }
		 
	 }

}
