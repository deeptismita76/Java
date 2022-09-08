package com.xworkz.javadao.dao;

public interface LakeDAO {

	boolean save(String lakeName);
    void printAllLakes();
    boolean updateByIndex(int index,String newlake);
    boolean deleteByIndex(int index);
    boolean updateByName(String name,String newName);
    boolean deleteByName(String name);

}
