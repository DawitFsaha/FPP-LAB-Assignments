package lab6.prob1;

import java.util.ArrayList;
import java.util.Arrays;

public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

    public int indexOf(String s){
        int index = -1;
        if(s==null) return index;

        for(int i=0;i<size;i++){
            if(s.equals(strArray[i])){
                index = i;
                break;
            }
        }
        return index;
    }

    public String removeAt(int index){


        if(index <0 || index >= size || size==0){
            return null;
        }
        String[] temp =new String[strArray.length];
        String toBeRemoved = strArray[index];

        for(int i=0; i<index;i++){
            temp[i] = strArray[i];
        }
        for(int i=index+1; i<size-1;i++){
            temp[i-1] = strArray[i];
        }

        strArray = temp;
        size--;

        return toBeRemoved;

    }

    public String set(int index, String s){
        if(index < 0 || index >= size) return null;
        String toBeReturned = strArray[index];
        strArray[index] = s;
        return toBeReturned;
    }

    public boolean containsAll(MyStringList other){
        if(other == null || other.isEmpty()){
            return false;
        }
        int count = 0;
        for(int i=0; i<other.size;i++){
            for(int j=0;j<size;j++){
                if(other.strArray[i].equals(strArray[j])){
                    count++;
                    break;
                }
            }
        }
        if(count == other.size)
            return true;
        else return false;
    }

    public MyStringList subList(int start, int end){
        end = end -1;
        if(start > end || start < 0 || start >= size || end >= size)
            return null;
        int subSize = end - start + 1;

        MyStringList myStringList = new MyStringList();
        myStringList.size = subSize;
        myStringList.strArray = new String[strArray.length];

        for(int i=start, j=0; i<=end;i++,j++){
            myStringList.strArray[j] = strArray[i];
        }
        return myStringList;
    }

    public void clear(){

        for(int i=0; i<size;i++){
            strArray[i] = null;
        }
        size = 0;

    }

	// Add an element in last
	public void add(String s) {
		 if(s==null) return;// throw new NullPointerException();
		 //Check for Array is Full
		 if (size == strArray.length)
			resize(); // Array is full
		// Add at the end of the list.
		strArray[size] = s;
		size++; // Increment index to insert the new elements
		// strArray[size++] = s;
	}

	public String get(int i) {
		if (i < 0 || i > size - 1) {
			// throw new IndexOutOfBoundsException("Invalid index i" + i);
			return null;
		}
		return strArray[i];
	}

	public boolean find(String s) {
		if (s == null)
			return false;
		for (int i = 0; i < size; i++)// for (String test: strArray)
		{
			if (s.equals(strArray[i]))
				return true;

		}
		return false; // The element is not in the list
	}

	/* 1. Using System.arrayopy()
	  public void insert(String s, int pos){
	     if(pos > size-1 || pos<0 )
	         return;//allowed to add 0 to size-1
	  if(s==null) return;
	  if(pos == strArray.length) {
	      resize();
	   }
	  String[] temp = new String[strArray.length];
	   System.arraycopy(strArray,0,temp,0,pos); // src, spos,des,dspos,number of elements temp[pos] = s;
	    temp[pos] = s;
	  System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);// count =size - pos

	  strArray = temp;
	  ++size;
	   }
	 */
	/* 2. Without Temp array
	// Shift elements to the right to make space for the new element
        for (int i = size; i > pos; i--) {
            array[i] = array[i - 1];
        }
        // Insert the new element
        array[pos] = s;
        size++;
    }

	 */
	// can insert the elements 0 to size position
	public void insert(String s, int pos) {
		if (pos < 0 || pos > size)
			return;
		// If the array gets full
		if (size == strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length];

		for (int i = 0; i < pos; i++)
			temp[i] = strArray[i];
		temp[pos] = s;

		for (int i = pos + 1; i < size; i++)
			temp[i] = strArray[i - 1];

		strArray = temp;
		++size;
	}

	public boolean remove(String s) {
		if (size == 0)
			return false; // the list is empty
		if (s == null)
			return false;
		int index = -1;
		for (int i = 0; i < size; ++i) {
			if (strArray[i].equals(s)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return false; // s is not found in the list
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray, 0, temp, 0, index);
		System.arraycopy(strArray, index + 1, temp, index,
				strArray.length - (index + 1));
		strArray = temp;
		--size;
		return true;
	}

	private void resize() {
		System.out.println("resizing");
		int len = strArray.length;// Original array length
		int newlen = 2 * len; // Twice the original length
		// String[] temp = new String[newlen];
		// System.arraycopy(strArray,0,temp,0,len);
		// strArray = temp;
		strArray = Arrays.copyOf(strArray, newlen);

	}

	public String toString() {
        if(size == 0) return "[]";
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(strArray[i] + ", ");
		}
		sb.append(strArray[size - 1] + "]");
		return sb.toString();
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		/*
		 * if(size==0) return false; else return true;
		 */
		return (size == 0);
	}
	
	public static void main(String[] args) {
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.insert("Renuka", 4); // Position reached the length
		l.insert("Mohanraj", 5); // Position reached the length
		System.out.println(l);
		l.add("Dave");

		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.insert("Richard", 3);
        l.insert("Susan",3);
		System.out.println("The list of size " + l.size() + " after inserting Richard into pos 3 is " + l);
		l.insert("Tonya", 0);
		System.out.println("The list of size " + l.size() + " after inserting Tonya into pos 0 is " + l);
		System.out.println(l.find("Susan"));
		// String[] x = (String[]) l.clone();
		// System.out.println(Arrays.toString(x));
        //Method 1 test
        System.out.println("\n========== Newly Added Functions ==========");

        System.out.println("\n------- Method 1 -------");
        System.out.println("Index: " + l.indexOf("Susan"));

        //Method 2 test
        System.out.println("\n------- Method 2 -------");
        System.out.println("Removed Value : " + l.removeAt(6));
        System.out.println("List after Removal : " + l);

        //Method 3 test
        System.out.println("\n------- Method 3 -------");
        l.clear();
        System.out.println(l);
        System.out.println("Size : " + l.size());

        //Method 4 test
        System.out.println("\n------- Method 4 -------");
        l.add("Bob");l.add("Steve");l.add("Susan");l.add("Mark");
        l.insert("Richard", 3);
        l.insert("Susan",3);
        System.out.println("Array befere Replacement : " + l);
        System.out.println(l.set(2,"Dawit"));
        System.out.println("Array after Replacement : "+ l);


        //Method 5 test
        System.out.println("\n------- Method 5 -------");
        MyStringList l2 = new MyStringList();
        l2.add("Bob");
        l2.add("Dawit");
        System.out.println("Old List : " + l);
        System.out.println("New List : " + l2);
        System.out.println("Old list contains new List : " + l.containsAll(l2));

        //Method 6 test
        System.out.println("\n------- Method 6 -------");
        System.out.println("List : " + l);
        System.out.println("Sub list : "+l.subList(2,4));


	}
}
