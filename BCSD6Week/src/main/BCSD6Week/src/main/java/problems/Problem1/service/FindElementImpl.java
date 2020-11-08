package problems.Problem1.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class FindElementImpl implements FindElement {
    ArrayList<Integer> arrList = new ArrayList<Integer>();

    public FindElementImpl(){
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
    }
    @Override
    public void linearSearch(int key){
        System.out.println("선형 검색 실행 : " + arrList.indexOf(key));
    }
    @Override
    public void binarySearch(int key){
        System.out.println("이진 검색 실행 : " + Collections.binarySearch(arrList, key));
    }
}
