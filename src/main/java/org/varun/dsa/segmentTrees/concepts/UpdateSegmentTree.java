package org.varun.dsa.segmentTrees.concepts;

import java.util.Arrays;

public class UpdateSegmentTree extends SegmentTree{

    public UpdateSegmentTree(int n) {
        super(n);
    }

    public void updateSegmentTree(int val, int updateIdx, int i, int l, int r) {
        // O(log(n))
        if (l == r) {
            segmentTree[i] = val;
            return;
        }
        int mid = l + (r - l) / 2;
        if (updateIdx <= mid) {
            // go left
            updateSegmentTree(val, updateIdx, 2 * i + 1, l, mid);
        } else {
            // go right
            updateSegmentTree(val, updateIdx, 2 * i + 2, mid + 1, r);
        }
        segmentTree[i] = segmentTree[2 * i + 1] + segmentTree[2 * i + 2];
    }

    public static void main(String[] args) {
        int n = 4;
        UpdateSegmentTree obj = new UpdateSegmentTree(n);

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
        obj.buildSegmentTree(nums, 0, 0, n - 1);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(obj.segmentTree));

        // updating

        obj.updateSegmentTree(5, 2, 0,0,n - 1);        // O(log(n))
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(obj.segmentTree));

        nums[2] = 5;
        obj.buildSegmentTree(nums, 0, 0, n - 1);                    // O(2*n)
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(obj.segmentTree));
    }
}
