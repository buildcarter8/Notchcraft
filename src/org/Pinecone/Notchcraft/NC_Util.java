package org.pinecone.Notchcraft;

import java.util.List;

public class NC_Util 
{
	public static String implodeStringList(String glue, List<String> pieces)
	   {
	       StringBuilder output = new StringBuilder();
	       for (int i = 0; i < pieces.size(); i++)
	       {
	           if (i != 0)
	           {
	               output.append(glue);
	           }
	           output.append(pieces.get(i));
	       }
	       return output.toString();
	   }
}
