package test;

import java.util.ArrayList;

public class Pile<T> {
	private ArrayList<T> list;
	
	public Pile(){
		list = new ArrayList<T>();
	}
	
	boolean estVide(){
		if (list.size() == 0){
			return true;
		} else {
			return false;
		}
	}
	
	T sommet(T s){
		return list.get(0);
	}
	
	void empiler(T s){
		list.add(s);
	}
	
	T depiler(){
		T s = list.get(0);
		list.remove(0);
		return s;
	}
	
	int taille(){
		return list.size();
	}
	
}
