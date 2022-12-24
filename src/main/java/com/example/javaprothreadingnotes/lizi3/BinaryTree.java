//package com.example.javaprothreadingnotes.lizi3;
//
//import lombok.var;
//
//public class BinaryTree {
//  /**
//   * 计算整个树的最大深度
//   */
//  public int maxDepth() {
//    return maxDepth(root);
//  }
//  /**
//   * 计算指定树x的最大深度
//   */
//  private int maxDepth(Node<K, V> x) {
//    if (x == null) {
//      return 0;
//    }
//    var maxL = 0;
//    var maxR = 0;
//    // 计算左子树的最大深度
//    if (x.left != null) {
//      maxL = maxDepth(x.left);
//    }
//    // 计算右子树的最大深度
//    if (x.right != null) {
//      maxR = maxDepth(x.right);
//    }
//    // 比较左右子数的最大深度
//    return Math.max(maxL, maxR) + 1;
//  }
//
//}
