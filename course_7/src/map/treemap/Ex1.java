package map.treemap;

import map.hashmap.Ex2;

import java.util.TreeMap;

/**
 * @author cvoinea
 *
 * implementation which uses a red-black binary tree to sort the keys
 */
public class Ex1 {

	public static void main(String[] args) {

		// use the same map from previous exercise
		TreeMap<String, Integer> treeMap = new TreeMap<>(Ex2.createMap());
		// map content is displayed sorted by keys
		System.out.println(treeMap);
	}
}
