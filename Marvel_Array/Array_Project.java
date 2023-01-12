import java.util.*;

public class Array_Project{
	
	/* The difference between Collections(class) and Collection(interface) one of control. 
	 Collections is a class that has subclasses that offer specific containment of data sets.
	 Examples of these would be List, Queue, Set. Collection is an interface that performs an 
	 operation like Add, Remove, and Clear 
	 
	  Citation:
	  Differences between Collection and Collections in Java?, 
	  https://www.tutorialspoint.com/differences-between-collection-and-collections-in-java.
	   
	  */
	
	
public static void main(String[] args) {
	
	//Create a list of strings(names of The Avengers) 
	
	ArrayList<String> MarvelList = new ArrayList<String>();
	 
	 MarvelList.add("Captain America");
	 MarvelList.add("Iron Man");
	 MarvelList.add("AntMan");
	 MarvelList.add("Hulk");
	 MarvelList.add("Thor");
	 MarvelList.add("Spiderman");
	 MarvelList.add("Dr. Strange");
	 MarvelList.add("Star Lord");
	 
	 //Output list in its current order
	 
	 System.out.println("Avengers, Assemble!: \n");
	 System.out.println("\n"
	 		+ "                 @@@@@@                                                                           \n"
	 		+ "           @@@@ @@@@@@@ @@@@                                                                            \n"
	 		+ "       @@      @@@@@@@@      @@                                                                        \n"
	 		+ "     @@       @@@@ @@@@        @@\n"
	 		+ "   @@        @@@@  @@@@          @@\n"
	 		+ "  @@        @@@@   @@@@           @@\n"
	 		+ " @@        @@@@@   @@@@            @@\n"
	 		+ "@@        @@@@@    @@@@            @@\n"
	 		+ "@@       @@@@@     @@@@          @ @@ \n"
	 		+ "@@      @@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
	 		+ " @@    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
	 		+ "  @@   @@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
	 		+ "   @@ @@@@@@        @@@@        @ \n"
	 		+ "     @@@@@@         @@@@       @@                                                                      \n"
	 		+ "    @@@@@@ @@       @@@@     @@                                                                    \n"
	 		+ "   @@@@@@    @@     @@@@   @@\n"
	 		+ "         ");

	 
	
    
	 MarvelList.forEach((n)  -> print(n));
     
     System.out.println("\n");
     

	    
     //Output list in a sorted order
	      
	      Collections.sort(MarvelList);
	      
	        System.out.println("Avengers, Sorted! "+ "\n" + MarvelList);
	        
	        System.out.println("\n");
	        
	      //Output List in a shuffled order
	        
	      Collections.shuffle(MarvelList);
	       
	        System.out.println("Avengers, Shuffled! " + "\n" + MarvelList);
	        
	        {
	        	
	        //Attempt to locate entries in the list and show their position in the index	
			String findMe = "Iron Man";
			String cannotFindMe = "BatMan";
			
			System.out.println("\n");
			System.out.println("Positon of "+ findMe +": "+ MarvelList.indexOf(findMe));
			System.out.println("Positon of "+ cannotFindMe +": "+ MarvelList.indexOf(cannotFindMe));
			
			System.out.println("\n");
			
			//Convert the list to an array and output the data
			
			String[] MarvelArray = new String[MarvelList.size()];
	        MarvelArray = MarvelList.toArray(MarvelArray);

	        System.out.println("Marvel, Converted!");
	        
	        for(String s : MarvelArray)
	            System.out.println(s);
	        
	        
	        System.out.println("\n");
			
	      //Convert the array back to an list and output the data
			
	        ArrayList<String> MarvelAfter = new ArrayList<String>();  
	        
	        MarvelAfter.addAll(Arrays.asList(MarvelArray));
	        
	        System.out.println("Marvel, Converted Back!");
	        
	        for(String s : MarvelAfter)
	            System.out.println(s);
	        
	        }
	        }


	public static void print(String n)
		{
		    System.out.println(n);
		}
	}
		

	  







 
  

