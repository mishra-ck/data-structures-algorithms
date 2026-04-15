// FInd missing numbe and Duplicates in an array 

void findMissingNumber()
{
	// Using brute force by comparing each element with other : bad approach

	for (int i = 0; i < names.length; i++)
	{
     for (int j = i + 1 ; j < names.length; j++) 
     {
         if (names[i].equals(names[j])) 
          {
                // got the duplicate element
          }
     	}
	 }

	//case1: only one is missing in continous array of integers,
	// we can use sum of n integers n*(n+1)/2 to find the missing number

	for(int i = 1 ; i < arr.length-1 ; i++ )
	{
		sum = sum +1 ;
	}
	if( sum != (100*(101)/2))
	{
		int missing_number = (100*(101)/2) - sum  ;
		System.out.println(missing_number) ;
	}

	// --------------Case2 : When we have multiple duplicates in an array ----------

	//------------- Approach 1 : Using HashSet(Does not allow duplicates)------------
	// but in this case we will time and space complexity as O(n).

	Set set = new HashSet() ;

	for(String name : names)
	{
		if(set.add(name) == false)
		{
			// System.out.println("Duplicate string :" + name) ;
		}
	}


	// ----------- Approach 2: Using Hashtable()  : we can store name and count also in hashmap 

	 String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
	 Map<String, Integer> nameAndCount = new HashMap<>();

        // build hash table with count
        for (String name : names) {
            Integer count = nameAndCount.get(name);  // will get null at first occurence of String 
            if (count == null) {
                nameAndCount.put(name, 1);		// when count is null , count will be updated as 1
            } else {
                nameAndCount.put(name, ++count);   // at next occurence will put previous count + 1  
            }
        }

         // Print duplicate elements from array in Java
        Set<Entry<String, Integer>> entrySet = nameAndCount.entrySet();   // individual key:value pair of hashmap is called as entry 
        for (Entry<String, Integer> entry : entrySet) {

            if (entry.getValue() > 1) {
                System.out.println("Duplicate element from array : "
                        + entry.getKey());
            }
        }
}