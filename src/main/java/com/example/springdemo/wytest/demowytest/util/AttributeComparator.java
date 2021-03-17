package com.example.springdemo.wytest.demowytest.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

public class AttributeComparator implements Comparator<Map> {
	private String[] attribute;
	private boolean[] desc;

	public AttributeComparator(String[] attribute) {
		this.attribute = attribute;
		this.desc = new boolean[attribute.length];
	}

	public AttributeComparator(String[] attribute, boolean[] desc) {
		this.attribute = attribute;
		this.desc = desc;
	}

	// 去重融合时如果修改了数组attribute所对应key的value，将出现诡异情况
	public List<Map> removeDuplication(List<Map> mapList, BinaryOperator<Map> merge) {
		mapList.sort(this);
		List<Map> tempList = new ArrayList<>();
		for (Map tempMap : mapList) {
			if (tempList.isEmpty()) {
				tempList.add(tempMap);
			} else {
				Map tailMap = tempList.get(tempList.size() - 1);
				if (this.compare(tailMap, tempMap) == 0) {
					tempList.set(tempList.size() - 1, merge.apply(tailMap, tempMap));
				} else {
					tempList.add(tempMap);
				}
			}
		}
		return tempList;
	}

	@Override
	public int compare(Map o1, Map o2) {
		for (int i = 0; i < attribute.length; i++) {
			String att = attribute[i];
			Object o1_att = o1.get(att);
			Object o2_att = o2.get(att);
			int compare = o1_att == null ? (o2_att == null ? 0 : -1) : (o2_att == null ? 1 : o1_att.toString().compareTo(o2_att.toString()));
			if (compare != 0) return desc[i] ? -compare : compare;
		}
		return 0;
	}
}
