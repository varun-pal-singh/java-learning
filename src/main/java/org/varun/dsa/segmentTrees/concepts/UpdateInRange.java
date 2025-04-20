package org.varun.dsa.segmentTrees.concepts;

import java.util.Arrays;

public class UpdateInRange extends SegmentTree{
    int[] lazyTree;

    public UpdateInRange(int n) {
        super(n);
        this.lazyTree = new int[4 * n];
    }

//    public void updateInRange(int i, int l, int r, int start, int end) {
//        if ()
//    }

//    public void updateInRange(int start, int end, int val) {
//        updateInRange(0, 0, n - 1, start, end);
//    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 2, 5, 3, 6, 3, 4};
        int n = nums.length;
        UpdateSegmentTree obj = new UpdateSegmentTree(n);
        obj.buildSegmentTree(nums, 0, 0, n - 1);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(obj.segmentTree));
    }
}
