package com.chainsys.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
 
public class ListExample {
	public static void main(String[] args) {
//		Arraylist
		System.out.println("ArrayList");
		//Size of the 
		//ArrayList
		int n = 5;
		
		//Declaring the ArrayList with
		//inital size n
		ArrayList<Integer> arr1 = new ArrayList<Integer>(n);
		
		//Declaring the ArrayList
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		
		//Printing the ArrayList
		System.out.println("Array 1:" + arr1);
		System.out.println("Array 2:" + arr2);
		
		//Appending new elements at
		//the end of the list
		for(int i =1;i<=n;i++) {
			//add()
			arr1.add(i);//Appends the specified element to the end of this list (optional operation).
			arr2.add(i);
		}
		
		//Printing the ArrayList
		System.out.println("Array 1:" + arr1);
		System.out.println("Array 2:" + arr2);
		arr1.remove(3);
		System.out.println(arr1);
		
		//add(int index, Object element)
		arr1.add(3, 4);//This method is used to insert a specific element at a specific position index in a list.
		System.out.println(arr1);
		
		//clear()
		arr1.clear();//Removes all of the elements from this list (optional operation).
		System.out.println(arr1);
		
		//isEmpty()
		ArrayList<Boolean> arr=new ArrayList<Boolean>();
		arr.isEmpty();//Returns true if this list contains no elements.
		System.out.println(arr);
		boolean arr3 = arr.isEmpty(); 
		if (arr3 == true) {
			System.out.println("The ArrayList is empty"); 
		}  else {
	            System.out.println("The ArrayList is not empty"); 
		}
	          
		for(int i =1;i<=n;i++) {
			//add()
			arr1.add(i);//Appends the specified element to the end of this list (optional operation).
			arr2.add(i);
		}
	
		
		//clone()
		arr1.clone();//This method is used to return a shallow copy of an ArrayList in Java.
		System.out.println("clone() :- "+arr1);
		
		
		//size()
           System.out.println(arr1);
           
           int size =arr1.size();//Returns the number of elements in this list.
           System.out.println("Size of an array"+size);
		
         
         //LinkedList
         System.out.println("Linked List:-");
         
         // Creating an empty LinkedList 
         LinkedList<String> list = new LinkedList<String>(); 
     
         // Use add() method to add elements in the list 
         list.add("Vidhya"); 
         list.add("Santhini"); 
         list.add("Swetha"); 
         list.add("Swarna"); 
         list.add("Sangeetha"); 
         
         System.out.println(list);
         // Fetching the specific element from the list 
         System.out.println("The Element is "+list.get(2));
         
         list.add("Vaishnavi");
         System.out.println(list);
         list.add(2, "Sudha");
         //contains()
         System.out.println("Does the List contains : " +list.contains("Swetha"));
         System.out.println(list.set(1, "Vijay"));
         System.out.println(list);
         //clear()
//         list.clear();
//         System.out.println(list);
         
         //Iterator
//         syntax
//         ListIterator new_list = LinkedList.listIterator(int index);

         ListIterator listIterator = list.listIterator(1); 
         while(listIterator.hasNext()){ 
             System.out.println(listIterator.next()); 
          } 

         //Vector
         System.out.println("Vector");
         Vector<String> vector = new Vector<String>();
         //         boolean add(Object element)
         vector.add("kayal");
         vector.add("Ashlin");
         vector.add("Angelin");
         vector.add("Abirami");
         vector.add("Vidhu");
         
         System.out.println(vector);
         
         //void add(int index, Object element)
         vector.add(4, "Vidhya");
         System.out.println(vector);
         
         //clear()
         //Vector.clear()

         //set()
        System.out.println(vector.set(4, "Sudha"));
        //isEmpty()
        System.out.println("Is Empty : "+vector.isEmpty());
       
       //We will be using two methods:
       //Using For Loop
       // creating a vector of String type 
        Vector<String> numbers = new Vector<String>(); 
        
        // adding elements to vector 
        numbers.add("One"); 
        numbers.add("Two"); 
        numbers.add("Three"); 
        numbers.add("Four"); 
        for (int index = numbers.size() - 1; index >= 0; index--) {// Iterating from index equal to numbers.size()-1 to 0 and decrement index by 1 using the for loop 
        	System.out.println("Iterating in reverse order");
            System.out.println(numbers.get(index)); 
        } 
        
       //Using ListIterator
       //listIterator method will return the list of String of type ListIterator. 
        ListIterator<String> listIterator1 = numbers.listIterator(numbers.size()); 
  
        // Iterate the ListIterator using the hasPrevious()method 
        while (listIterator1.hasPrevious()) { 
            // if element exist at previous index,then print that element 
            System.out.println(listIterator1.previous()); 
        } 
        
        
       //Copy Elements of One Java Vector to Another Vector in Java
       //Syntax=> Vector<Integer> gfg=new Vector<>();
       //Ways To copy elements of one vector to another:
       //Passing in the constructor
        Vector<Integer> vectors = new Vector<>();
        
        vectors.add(11);
        vectors.add(22);
        vectors.add(24);
        vectors.add(39);
        Vector<Integer> vectorv=new Vector<>(vectors);
        //Adding one by one using add() method
//        syntax for each loop
//        for (type var : array) 
//        { 
//            statements using var;
//        }
        for(Integer value: vectorv){
            System.out.println(value);
        }
        // here we changed the third element to 23
        // we changed in the second vector and you can 
        // here we will not see the same change in the first
        vectorv.set(2,23);
        System.out.println("third element of first vector = "+vectors.get(2));
        System.out.println("third element of second vector ="+vectorv.get(2)); 
        
//        Method 2: Adding one by one using add() method 
     // creation of Vector of Integers
        Vector<Integer> vector1=new Vector<>();
         
        // adding elements to  first Vector
        vector1.add(50);
        vector1.add(24);
        vector1.add(95);
        vector1.add(31);
         
        Vector<Integer> vector2=new Vector<>();
         
        // adding element to the second Vector
        // by iterating over one by one 
        for(Integer value: vector1){
        vector2.add(value);
        }
        // Iterating over  second Vector
        System.out.println("-----Iterating over the second Vector----");
         
        for(Integer value :vector2)
        {
          System.out.println(value);
        }
           
        // here we changed the third element to 23
        // we changed in second Vector
        // here we will not see the same change in the first
        vector2.set(2,23);
           
        System.out.println("Third Element Of First Vector = "+vector1.get(2));
        System.out.println("Third Element Of Second Vector = "+vector2.get(2));  
                              
        //Maximum and Minimum Element From Vector
        //1. Creating(defining) a  Vector
        Vector<Integer> vectorMinMax = new Vector<Integer>();
 
        // Add elements in Vector
        // Custom inouts
        vectorMinMax.add(1);
        vectorMinMax.add(2);
        vectorMinMax.add(3);
        vectorMinMax.add(4);
        vectorMinMax.add(5);
 
        // Printing all elements of vector
        System.out.println("Vector elements : " + vectorMinMax);
        // Using inbuilt function to
 
        // find minimum number
        // using Collection.min() method
        int minNumber = Collections.min(vectorMinMax);
 
        // find maximum number
        // using Collection.max() method
        int maxNumber = Collections.max(vectorMinMax);
        
        // Print max element of the vector
        System.out.println("Maximum Number in Vector is : "
                           + maxNumber);
 
        // Print min element of the vector
        System.out.println("Minimum Number in Vector is : "
                           + minNumber);
        
       //Stack
      //Check Whether the Stack is Empty or Not
      //1.empty()
        //push()
        Stack<String> stack = new Stack<String>();
        stack.push("Vidhya");//insert values
        stack.push("Santhini");
        stack.push("Swetha");
        System.out.println(stack);
        Iterator<String> itr=stack.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
        }  
     
        System.out.println("The stack is: " + stack);

        //peek()
        // Displaying the Stack 
        System.out.println("Initial Stack: " + stack); 
  
        // Fetching the element at the head of the Stack 
        System.out.println("The element at the top of the"
                           + " stack is: " + stack.peek()); 
  
        // Displaying the Stack after the Operation 
        System.out.println("Final Stack: " + stack); 
        
        //search()
        //syntax - STACK.search(element)
        System.out.println(stack.search("Santhini"));
        
        //empty
        // Checking for the emptiness of stack
        System.out.println("Is the stack empty? " + stack.empty());
        
        
        
        //pop()
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("The stack is:"+stack);
        System.out.println("Is the stack empty? " + stack.empty());
        
        //empty() - Tests if this stack is empty.
        //peek() - Looks at the object at the top of this stack without removing it from the stack.
        //pop() - Removes the object at the top of this stack and returns that object as the value of this function.
        //push(E item) - Pushes an item onto the top of this stack.
        //search(Object o) - Returns the 1-based position where an object is on this stack. 
        
        Set hs = new HashSet(); 
        for(int i=1;i<=5;i++) {
        	hs.add(i);
        }
    
        System.out.println("HashSet : "+hs);
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());
        System.out.println(hs.iterator());
        System.out.println(hs.hashCode());
        System.out.println(hs.contains(2));
        System.out.println(hs.addAll(stack));        
        
        TreeSet ts = new TreeSet();
        for(int i=5; i<=1;i++) {
        	ts.add(i);
        }
        System.out.println(ts.clone());
        System.out.println(ts.contains(3));
        System.out.println(ts.hashCode());
        System.out.println(ts.isEmpty()); 
        
}
}
