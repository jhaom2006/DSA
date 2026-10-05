class Solution {
    public int maxArea(int[] height) {
        int hei,width,max=0,area;
        int i=0;
        int j = height.length-1;
        while(i<j){
            width=j-i;
            hei= Math.min(height[i],height[j]);
            area=width*hei;
            if(max< area){
                max= area;
            }
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return max;
    }
}