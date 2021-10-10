package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	// write your code here
    int[] arr = {234,230,228,227,225,224};
    int ans = floorNumber(arr,224);
        System.out.println(ans);
    }
    static int floorNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target<arr[mid]){
                start = mid+1;
            }
            else if(target>arr[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
    return start;
    }

}
