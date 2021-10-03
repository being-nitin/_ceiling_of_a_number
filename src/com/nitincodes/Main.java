package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	// ceiling of a number using binary search:
    int[] arr1 = {12,13,14,15,16,17};
    int ans = ceilingOf(arr1,15);
        System.out.println("the index of the ceiling number is " +ans);

    }
    static int ceilingOf(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
