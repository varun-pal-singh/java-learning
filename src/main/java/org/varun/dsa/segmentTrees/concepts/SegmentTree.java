package org.varun.dsa.segmentTrees.concepts;

import java.util.Arrays;

public class SegmentTree {
    int n;
    int[] segmentTree;

    public SegmentTree(int n) {
        this.n = n;
        this.segmentTree = new int[4 * n];  // to make element as close as to 2's power, to make perfect segment tree
                                            //  try with odd and even no of elements for better understanding.
    }

    public void buildSegmentTree(int[] nums, int i, int l, int r) {
        // O(2*n)
        if (l == r) {
            segmentTree[i] = nums[l];
            return;
        }
        int mid = l + (r - l) / 2;
        buildSegmentTree(nums, 2 * i + 1, l, mid);
        buildSegmentTree(nums, 2 * i + 2, mid + 1, r);
        segmentTree[i] = segmentTree[2 * i + 1] + segmentTree[2 * i + 2];
    }

    public static void main(String[] args) {
        int n = 5;
        SegmentTree obj = new SegmentTree(n);
//        int[] nums = {2, 1, 7, 3};      // [2, 3, 10, 13
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
        obj.buildSegmentTree(nums, 0, 0, n - 1);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(obj.segmentTree));
    }
}
