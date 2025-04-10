package org.varun.dsa.graphs.concepts;

import java.util.Arrays;

public class DSU {
    public static int find(int[] parent, int p) {
        if (parent[p] == p) {
            return p;
        }
        return parent[p] = find(parent, parent[p]); // path compression
    }

    public static void union(int[] parent, int[] rank, int a, int b) {
        int parent_a = find(parent, a);
        int parent_b = find(parent, b);

        if (parent_a == parent_b) {
            return;
        } else if (rank[parent_a] < rank[parent_b]) {
            parent[parent_a] = parent_b;
        } else if (rank[parent_a] > rank[parent_b]) {
            parent[parent_b] = parent_a;
        } else {
            rank[parent_a] += 1;
            parent[parent_b] = parent_a;
        }
    }

    public static void main(String[] args) {
        int[] parent = new int[6];
        int[] rank   = new int[6];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }

        System.out.println(Arrays.toString(parent) + " " + Arrays.toString(rank));
        union(parent, rank, 0, 1);
        union(parent, rank, 1, 3);
        union(parent, rank, 4, 5);
        System.out.println(Arrays.toString(parent) + " " + Arrays.toString(rank));
        union(parent, rank, 1, 2);
        union(parent, rank, 3, 5);
        System.out.println(Arrays.toString(parent) + " " + Arrays.toString(rank));
        union(parent, rank, 2, 5);
        System.out.println(Arrays.toString(parent) + " " + Arrays.toString(rank));
    }
}
