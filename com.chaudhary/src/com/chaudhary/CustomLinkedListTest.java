package com.chaudhary;


public class CustomLinkedListTest {

	public static void main(String[] args) {

		// Pre define Linked List
		// LinkedList< Integer> linkedList = new LinkedList<>();
		// linkedList.add(6);

		// CustomeLinkedList
		CustomeLinkedList linkList = new CustomeLinkedList();

		
		linkList.insertFirst(20);
		linkList.insertFirst(0);
		linkList.insertFirst(70);
		linkList.insertFirst(90);
		linkList.insertFirst(40);
		linkList.insertFirst(80);
		
		

		System.out.println(" Show Original LL ");
		linkList.display();
		System.out.println("    ");
		
		
		System.out.println(" Insert 100 At Last ");
		linkList.insertAtLast(100);
		linkList.display();
		System.out.println("    ");
		
		System.out.println(" At element 898 At 4th index ");
		linkList.insertAtIndex(898, 4);//0 ,1,2,3 --> 80-40-90-70-898-0-20
		linkList.display();
		System.out.println("    ");
		
		
		System.out.println(" Delete First ");
		System.out.println(linkList.deleteFirst());// it should delete 80 
		System.out.println("Renaming LL ");
		linkList.display();//40-90-70-898-0-20
		System.out.println("    ");   
		
		//System.out.println(""+linkList.get(3));
		
		System.out.println("delete Last");  
		System.out.println(linkList.deleteLast());
		linkList.display();
		
		System.out.println("delete At some index");  
		System.out.println(linkList.deleteAtIndex(4));// Time complexity is On
		linkList.display();
		
		System.out.println("Search Node");  
		linkList.findNode(898);
	}

}
