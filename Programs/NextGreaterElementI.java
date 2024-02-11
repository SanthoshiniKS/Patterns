class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length];
        int index=0,temp=0;
        for(int i=0;i<nums1.length;i++){
            index=indexOf(nums1[i],nums2);
            temp=-1;
            while(index<nums2.length){
                if(nums2[index]>nums1[i]){
                    temp=nums2[index];
                    break;
                }
                index+=1;
            }
            arr[i]=temp;
        }
        return arr;
    }
    static int indexOf(int num,int nums2[]){
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]==num)
               return i;
        }
        return -1;
    }
}
