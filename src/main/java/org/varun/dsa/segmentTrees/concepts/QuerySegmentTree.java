package org.varun.dsa.segmentTrees.concepts;

import java.util.Arrays;

public class QuerySegmentTree extends SegmentTree{
    public QuerySegmentTree(int n) {
        super(n);
    }

    public int query(int i, int l, int r, int start, int end) {
        // O(2 * log(n))
        if (r < start  || end < l) {
            // out of bound
            return 0;
        } else if (start <= l && r <= end) {
            // completely in bound
            return segmentTree[i];
        }
        int mid = l + (r - l) / 2;
        return query(2 * i + 1, l, mid, start, end) + query(2 * i + 2, mid + 1, r, start, end);
    }

    public static void main(String[] args) {
        int n = 5;
        QuerySegmentTree obj = new QuerySegmentTree(n);
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
        obj.buildSegmentTree(nums, 0, 0, n - 1);
        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("segment Tree = " + Arrays.toString(obj.segmentTree));
        System.out.println("query [0, 4] " + obj.query(0, 0, n - 1, 0, 4));
        System.out.println("query [2, 4] " + obj.query(0, 0, n - 1, 2, 4));
        System.out.println("query [2, 3] " + obj.query(0, 0, n - 1, 2, 3));
        System.out.println("query [3, 3] " + obj.query(0, 0, n - 1, 3, 3));
    }
}
