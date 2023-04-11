package com.chaudhary;

import java.util.Iterator;

// seems like outer LINKED LIST INNERE class NODE which is model means multiple nodes 
public class CustomeLinkedList {

	Node head;
	Node tail;
	int size;

	// CONST
	public CustomeLinkedList() {
		this.size = 0;
	}

	public void insertFirst(int val) {

		// step 1 assign to Node const , new NODE
		Node node = new Node(val);// [4,null]
		// assign my node next var to head, herer head is pointing to iold node also
		// after my line of code to my node as well
		node.next = head;// head pointing to my node [4,null] also to my old nodes in link list
		// node.next=head : in this my current node [20, null]: next is null abhi we
		// have to point to next NODE how ,current next node we can identify by head
		// only or we can say next node name is HEAD
		// isliye we have written myNode.next=head;// now head is pointing both
		// myNewNode whihc is first and the second node which was first node before my
		// node is addede

		// corret head which is still pointing to old node more explamet in my nodes
		head = node;// here head is fully pointing to my node only left old mapping

		// check this condotion as well
		if (tail == null) {
			tail = head;
		}

		// incress size as well
		size++;

	}

// for display we will take temp node in step1 
	// step 2 assign temp to head
	// step 3 temp.value print
	// step4 and print temp.value in if condition
	// step 5 temp .value print kiya curremt node ki then move temp to next node how
	// somethig is der on current node which take my temp variable to next NODE that
	// is temp.next
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print("->" + temp.value);
			temp = temp.next;// temp ke andar put next value by doing tem.next which bring next node value
		}

		// work like this temp is nulll no the print
		// temp.next (gives next node ) check temp is not equal to null then print it
		// temp is null for last node becz by default value is NULL
		System.out.println("-->END");
	}

	public void insertAtLast(int val) {

		if (tail == null) {
			// if tail is null
			insertFirst(val);

		} else { // only perform this task when tail is pinting something
			// first create new node with some val whihc is comng
			Node node = new Node(val);

			// second
			tail.next = node;// tail should poin to my new nOde

			// third
			tail = node;// before this line tail is point both last and seconf last now after this line
						// tail will point to only my new node

			size++;
			// time complexity is constan only
		}
	}

	// insertAtSomeindex
	public void insertAtIndex(int val, int index) {

		if (index == 0) {
			insertFirst(val);
			return;// no need to run below code
		} else if (index == size) {
			insertAtLast(val);
			return; // no need to run below code
		} else {
			// ->130->40->90->70->0->20->100
			Node temp = head;// becz head pointer never move temp can move
			// run temp til index
			for (int i = 1; i < index; i++) {// start from 1 becz condition 0 is handled
				// temp1 first node
				// temp 2 == temp1.next
				// temp 3 == temp2.next

				// generally temp we cant put numbers that we have to assume

				// NOW RUM FOR LOOP ->130->40->90->70->0->20->100
				// i==1
				temp = temp.next;// temp jump one num ahaed
				// System.out.println("last value for temp is " + "i=" + "" + i + "-->" +
				// temp.value);
				// System.out.println("Last temp is"+temp);
				// i==2 // for loop run for i==2 same line of code
				// temp=temp.next;// temp jump one num ahaed

				// i==3
				// for loop quit

			}

			// Now we found the Index in temp val in LL, from above we know we have to add
			// myNew Node at 3 rd index

			// pahle pichawada connect karte hai dono nodes ka my new node and my previous
			// node ka
			// agar pahle hi hum old node ka next my new node assign kar diya then furuer
			// node will be lost and we will end up to my new node and which node will be
			// next to my new node i mean we are inserting my new node in between some nodes
			// na
			// hence sequence would be pahle break node in between my node will insert my
			// node in such a way that my node next will be indicate first to my node next
			// node , at this point 2 pointer will be der on next node to my node pone is my
			// node assigning to next node other one is my node previous node is also
			// assigning to node whihc isnext to me hence now nreak that connectivity

			// step 1 // pahle store my new Node next to be pointing to which next node by
			// doing below line of code// we have construc made for this purpose
			Node node = new Node(val, temp.next);// by this line we did connectivty to node which will
			// node== myNewNodeAtindexMiddle // be myNewNode next pointing Node , first we
			// connect pichwada ., hense no data loss

			temp.next = node; // corected tem.next to my myNew Node ie variable (node) in this case
			size++;

		}

	}
	//ENGLISH
//would not this be overriden
//preety simple	
	//literlly what we drew

	public int deleteFirst() {

		int val = head.value;
		head = head.next; // bus yehi karna hai

		// let suppose one condition in case of one element what is head.next definitaly
		// it is null
		// and tail is also indication to one condition hencse make tail and head should
		// be null
		if (head == null) {
			tail = null;
		}
		size--;

		return val;
	}

	private class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

	}

	//give me reference(value) of that NODE of that index like 4th
	public Node get(int index) {
		//Run loop till index . iterate over index time
		//run head till index
		Node temp = head;// start from head setp1 assign first node , head pointing to some  Node  
		for (int i = 0; i < index; i++) {
			//System.out.println("current index value"+"  "+temp.value);
			temp=temp.next;
		} //move a head index time
		//now if you pass any num in get(index) get index this methos will return refrence pointer to that num 
		return temp;
	}

	
	public int deleteLast() {
		
		
		if(size<= 1) { //it means size 1 means only one element mean only i=0// hensce delete only one element //and that element is first ans last 
			
		return  deleteFirst();
		}
		Node secondLastNode = get(size-2); //size will count from 1,2,,3,4,5/// 5-2 =3 // index will count from 0.1.2.3. //temp will go from der
		
		//secondLastNode = previousRefrencePointerNode;
		int val= tail.value;
		tail=secondLastNode;
		tail.next=null;
		size--;

		return val;
	}
	
    public int deleteAtIndex(int index) {
    	if(index==0) {
    	return deleteFirst();
    	}
    	
    	else if(index==size)
    	{
    		return deleteLast();
    	}
    	else {
			Node preIndexNode = get(index-1);
			int val = preIndexNode.next.value;// prev node ko chodne se pahle take out value from that node then leave the refrence
			preIndexNode.next=preIndexNode.next.next;
			System.out.println("which is to be deleted  -->"+val +"==" +"Value is no more part of LL");
			return val;
		}
    }

	public Node findNode(int nodeVal) {
		//Traversing required hence take temp var
		Node temp = head;
		while (temp!=null) {
			if(temp.value == nodeVal) {

				System.out.println("Node found"+"  "+ nodeVal +"is equal to "+temp.value);
				
			}
			temp=temp.next;
		}
		return null;//no temp return default value of node is null if not found else sys out above 
	}
}
