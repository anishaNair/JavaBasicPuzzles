package com.puzzle1.forloop1;

public class ForLoopPattern {

    public static  void main(String []args){
        int n=1;
        for(int i =0;i<n;i++){
            System.out.println();
            for(int j=0;j<n;j++){
                if((i<1 || i>n-2)||(j<1 || j>n-2)){
                    System.out.print("$");
                }else{
                    System.out.print(" ");
                }
            }
        }
    }
}
