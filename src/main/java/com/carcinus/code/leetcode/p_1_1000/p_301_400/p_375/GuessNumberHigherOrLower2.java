package com.carcinus.code.leetcode.p_1_1000.p_301_400.p_375;

/**
 * 375. 猜数字大小 II
 *
 * @link <a href="https://leetcode.cn/problems/guess-number-higher-or-lower-ii/">...</a>
 */
public class GuessNumberHigherOrLower2 {

    public int getMoneyAmount(int n) {

        return 1;
    }
    public int guessNumber(int n) {
        if ( guess(n) == 0) {
            return n;
        }
        if ( guess(1) == 0) {
            return 1;
        }
        int l = 1, r = n, mid = (l + r) / 2 + 1;
        while (l < r) {
            int t = guess(mid);
            if (t == -1) {
                r = mid - 1;
            }else if (t == 1){
                l = mid + 1;
            }else {
                break;
            }
            mid = l + (r - l) / 2;
        }
        return mid;
    }


    public int pick = 1702766719;

    public int guess(int num) {
        if (pick > num) {
            return 1;
        } else if (pick < num) {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new GuessNumberHigherOrLower2().guessNumber(2126753390));
    }

}
