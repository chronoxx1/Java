package com.week4;

/**
 *
 * @author Pepe
 */
public class ejemplos {
    
    public static void main(String[] args) {
        int arr1[]={10,30};
        int arr2[]={10,31};
        isEarlier(arr1, arr2);
    }
    
    static boolean isEarlier(int[] time1, int[] time2){
        boolean s = false;
        if ((time1[0]*60)+(time1[1])<(time2[0]*60+time2[1])) {
            s = true;
        }else{
            s = false;
        }
        
        
        System.out.println(s);
        return s;
        //return false;
        
        
    }
 
    
    
}
