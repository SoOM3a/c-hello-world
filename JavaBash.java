
		
/* simple java application to list dir for V1CS testing  */

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Runtime r = Runtime.getRuntime();
		Process p = r.exec("/bin/bash -c 'ls -lh'");
		p.waitFor();
	}
}
