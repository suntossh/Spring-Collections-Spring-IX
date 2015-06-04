package com.suntossh.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class BeanA{
	
	private List<BeanB> myList;
	private Set<String> mySet;
	private Map<String, String> myMap;
	private Properties myProp;

	public List<BeanB> getMyList() {
		return myList;
	}
	public void setMyList(List<BeanB> myList) {
		this.myList = myList;
	}
	public Set<String> getMySet() {
		return mySet;
	}
	public void setMySet(Set<String> mySet) {
		this.mySet = mySet;
	}
	public Map<String, String> getMyMap() {
		return myMap;
	}
	public void setMyMap(Map<String, String> myMap) {
		this.myMap = myMap;
	}
	public Properties getMyProp() {
		return myProp;
	}
	public void setMyProp(Properties myProp) {
		this.myProp = myProp;
	}
	
}
