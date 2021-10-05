package com.nitincodes;

public class CeilingImpThing {
    public static void main(String[] args) {
        // the question is same as the previous one we will find the ceiling of a number
       // but what if the target element is the greatest in an array then
       int[] arr = {12,13,15,17,19,21,32};
       int target = 33;
       int ans = ceiling(arr,target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr, int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
