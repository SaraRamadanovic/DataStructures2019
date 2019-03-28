package lab2StacksQueues;

import java.util.Iterator;

public interface StackOfStrings<Item> {

public void push(String item);
public String pop();
public boolean isEmpty();
public int size();
Iterator<Item> iterator();


		
}
