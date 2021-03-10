package it.polito.tdp.parole.model;

import java.util.Collections;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_ADDPeer;

import java.util.*;


public class ParoleLinkedList {
	List <String> elencoparole;
	
	public ParoleLinkedList() {
		elencoparole=new LinkedList <String>();
	}
	
	public void addParola(String p) {
	elencoparole.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(elencoparole);
		return elencoparole;
	}
	
	public void reset() {
	elencoparole=new LinkedList <String>();
	}

	
	public void cancella(String s)
	{for(Iterator <String>i=elencoparole.iterator(); i.hasNext();) 
		{String ss=i.next();
		if(ss.compareTo(s)==0) i.remove();	 
		}
	}
	
	
	@Override
	public String toString() {
	String s="";
	for(String st: this.getElenco()) s=s+st+"\n";
	return s;
	}
	
	

}
