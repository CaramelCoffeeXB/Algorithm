package com.mouse;

/**
 * @author 咖啡不加糖
 * @Date: 2019/8/24 8:58
 * 快速排序
 */
public class QuickSort {
    public static int getMiddle(int[] list,int low,int high){
    int tmp = list[low];//数组的第一个作为中轴
    while(low < high){
        while(low < high && list[high] >= tmp){
        high--;
        }
        list[low] = list[high];//比中轴小的记录移到低端
        while(low < high && list[low] <= tmp){
        low++;
        }
        list[high] = list[low];//比中轴大的记录移到高端
    }
    list[low] = tmp;//中轴记录到尾
    return low;//返回中轴的位置
    }


    public static void quickSort(int[] list,int low,int high){
        if(low < high){
            int middle = getMiddle(list, low, high);//将list数组进行一分为二
            quickSort(list, low, middle -1);//对低字表进行递归排序
            quickSort(list, middle +1, high);//对高字表进行递归排序
        }
    }
}
