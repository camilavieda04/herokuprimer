package edu.escuelaing.arep;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedL implements List  {
	
	Nodo n;
	Nodo primero;
	Nodo ultimo;
	Double len;
	

	public LinkedL() {
		len = 0.0;
		n = null;
	}
	
	/**
	 * Metodo que inserta un nodo en la LinkedList
	 * @param datos valor del elemento que se insertara
	 */
	public void insertNodo(Double datos) {
		Nodo nuevoNodo = new Nodo(datos);
		if (len == 0.0) {
			primero=nuevoNodo;
			ultimo=nuevoNodo;
			n=nuevoNodo;
			nuevoNodo.setNext(nuevoNodo);
		}
		else {
			ultimo.setNext(nuevoNodo);
			ultimo = nuevoNodo;
			nuevoNodo.setNext(primero);
		}
		len+=1;
	}

	/**
	 * Metodo que retorna el nodo actual 
	 * @return n
	 */
	public Nodo getActual() {
		return n;
	}

	/**
	 * Metodo que cambia el nodo actual por el nuevo nodo que entra a la LinkedList 
	 * @param n Nodo actual
	 */
	public void setNodoActual(Nodo n) {
		this.n=n;
	}
	
	/**
	 * Metodo que retorna el nodo que se encuentra en la primera posicion de la LinkedList
	 * @return primero
	 */
	public Nodo getPrimero() {
		return primero;
	}
	
	/**
	 * Metodo que retorna el nodo que se encuentra en la ultima posicion de la LinkedList
	 * @return ultimo
	 */
	public Nodo getUltimo() {
		return ultimo;
	}
	
	/**
	 * Metodo que retorna la longitud de la LinkedList
	 * @return len
	 */
	public Double getLen() {
		return len;
	}
	
	/**
	 * Metodo para eliminar un Nodo de la LinkedList
	 * @param datos Variable que representa el valor del nodo en la LinkedList
	 */
	
	public void deleteNodo(Double datos) {
		Nodo nuevoNodo = new Nodo(datos);
		if (len == 0.0) {
			primero=nuevoNodo;
			ultimo=nuevoNodo;
			n=nuevoNodo;
			nuevoNodo.setNext(nuevoNodo);
		}
		else {
			ultimo.setNext(nuevoNodo);
			ultimo = nuevoNodo;
			nuevoNodo.setNext(primero);
		}
		len-=1;
	}


	
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

}
