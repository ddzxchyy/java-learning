# 动态规划 

动态规划（dynamic programming）通过组合子问题的解来求解原问题。（programming 指的是一种表格法）。我们把问题分解为多个阶段，每个阶段对应一个决策。我们记录每一个阶段可达的状态集合（去掉重复的），然后通过当前阶段的状态集合，来推导下一个阶段的状态集合，动态地往前推进。这也是动态规划这个名字的由来。

分治算法将问题划分为互不相交的子问题，递归地求解子问题，再将它们的解组合起来，求出原问题的解。与子相反，动态规划应用于子问题重复的情形，即不同的子问题具有公共的子子问题。在这种情况下，分治算法会做许多不必要的工作，它会反复求解那些公共子问题（可以通过备忘录优化）。而动态规划对每个子子问题只求解一次，将其保存在一个表格中，从而无需每次求解子子问题。

动态规划一般用于求解最优化问题（optimization problem）。

状态转移方程是解决动态规划的关键，比如求解矩阵最短路径`min_dist(i, j) = w[i][j] + min(min_dist(i, j-1), min_dist(i-1, j))`

## 自底向上

恰当的定义子问题规模，使得任何子问题的求解都只依赖于“更小的”子问题的求解。因而我们可以将子问题按规模排序，按有小到大的顺序进行求解。当求解某个子问题时，它所依赖的那些更小的子问题都以求解完毕，结果以保存。每个子问题只需求解一次，当我们求解它（也是第一次遇见它）时，它的所有前提子问题都以求解完成。

自底向上实现斐波那契函数（一般通过动态规划实现）

```java
 public static int f1(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int[] array = new int[n + 1];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i <= n; i++){
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
}
```



## 自顶向下

为了计算规模为 n 的问题，要计算规模比 n 更小规模的问题，直到子问题的规模足够小，直接得出解。

自顶向下实现斐波那契函数

```java
public int f2(int n) {
    if (n == 0 || n == 1) {
        return 1;
    }
    return f2(n -1) + f2(n - 2);
}
```

