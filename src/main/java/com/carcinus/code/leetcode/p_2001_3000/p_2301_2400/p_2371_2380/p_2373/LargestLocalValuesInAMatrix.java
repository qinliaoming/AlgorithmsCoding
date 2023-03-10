package com.carcinus.code.leetcode.p_2001_3000.p_2301_2400.p_2371_2380.p_2373;

/**
 * 2373. 矩阵中的局部最大值
 *
 * @link <a href="https://leetcode.cn/problems/largest-local-values-in-a-matrix/">...</a>
 *
 * 枚举每个3x3矩阵的起点(i, j), 0 <= i < n - 2, 0 <= j < n - 2，去搜索局部的3x3矩阵最大值。
 */
public class LargestLocalValuesInAMatrix {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] res = new int[n-2][n-2];
        for(int i = 0; i < n - 2; i++){
            for(int j = 0; j < n - 2; j++){
                // 枚举每个3x3矩阵的起点，搜索局部的3x3矩阵最大值
                res[i][j] = localMax(grid, i, j);
            }
        }
        return res;
    }

    private int localMax(int[][] grid, int left, int top){
        int max = 0;
        for(int i = left; i < left + 3; i++){
            for(int j = top; j < top + 3; j++){
                max = Math.max(max, grid[i][j]);
            }
        }
        return max;
    }


}
