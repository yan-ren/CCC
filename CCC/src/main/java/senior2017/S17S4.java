package senior2017;

/*
 * This question is basing on MST (Minimum Spanning Tree)
 * 
 * facts:
 * - first N-1 edges give a spanning tree, MST also has N-1 edges
 * - apply D to largest weight edges in MST, otherwise wasted
 * 
 * notes:
 * - finding MST usually involves sorting edges, in this question edges may have same weight,
 *   for edge with same weight, put edge in current plan at first, then follow by edge not used. 
 *   Otherwise may use additional unnecessary edge, which in current plan already has same weighted edge 
 *
 * sub problems:
 * - Kruskal's algorithm
 * - DFS or Disjoint Sets
 */
public class S17S4 {

}
