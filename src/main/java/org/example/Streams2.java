//package org.example;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Streams2 {
//    public static void main(String[] args) {
//        List<Integer> newList = List.of(1,2,3,4,5,6,7,8,9,10);
//        List<Integer> newList2 = List.of(2,6,9,3,1,0,5);
////        newList.stream()
////                .filter(n -> (n & 2) == 0)
////                .forEach(System.out::println);
////        newList.stream()
////                .filter(n -> n> 5).forEach(System.out::println);
//        listConverter(newList2);
//
//    }
//
//
//    static ArrayList<Integer> listConverter(ArrayList<Integer> someList){
//        ArrayList<Integer> evenList = new ArrayList<>();
//        ArrayList<Integer> oddList = new ArrayList<>();
//            for (int i = 0; i < someList.size(); i++) {
//                if(i % 2 == 0){
//                    evenList.add(someList.get(i));
//                } else {
//                    oddList.add(someList.get(i));
//                }
//                evenList.addAll(oddList);
//                return evenList;
//            }
//
//
//        return null;
//
//    }
//
//
//}
