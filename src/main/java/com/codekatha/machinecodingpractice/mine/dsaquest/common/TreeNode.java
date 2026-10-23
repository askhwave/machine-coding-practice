package com.codekatha.machinecodingpractice.mine.dsaquest.common;

import java.util.*;

/** Binary tree node (LeetCode style). Helper: TreeNode.of(3,9,20,null,null,15,7) builds from level-order. */
public class TreeNode {
    public int val;
    public TreeNode left, right;

    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; }

    /** Level-order input, null = missing child (same format as LeetCode examples). */
    public static TreeNode of(Integer... vals) {
        if (vals.length == 0 || vals[0] == null) return null;
        TreeNode root = new TreeNode(vals[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (!q.isEmpty() && i < vals.length) {
            TreeNode cur = q.poll();
            if (i < vals.length && vals[i] != null) { cur.left = new TreeNode(vals[i]); q.add(cur.left); }
            i++;
            if (i < vals.length && vals[i] != null) { cur.right = new TreeNode(vals[i]); q.add(cur.right); }
            i++;
        }
        return root;
    }

    /** Level-order print (with nulls), for quick debugging. */
    @Override
    public String toString() {
        List<String> out = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(this);
        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            if (cur == null) { out.add("null"); continue; }
            out.add(String.valueOf(cur.val));
            q.add(cur.left);
            q.add(cur.right);
        }
        int end = out.size();
        while (end > 0 && out.get(end - 1).equals("null")) end--;
        return out.subList(0, end).toString();
    }
}
