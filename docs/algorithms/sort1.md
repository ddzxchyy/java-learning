

# 排序算法

[极客时间-数据结构与算法之美](https://time.geekbang.org/column/article/41802)

## 如何分析一个排序算法

### 1. 排序算法的执行效率

对于排序算法执行效率的分析，我们一般会从这几个方面来衡量：

**(1) 最好情况、最坏情况、平均情况时间复杂度** 

在分析算法的时间复杂度时, 要分别给出最好情况、最坏情况平均情况下的时间复杂度。除此之外，你还要说出最好、最坏时间复杂度对应的要排序的原始数据是什么样的。

**(2) 时间复杂度的系数、常数 、低阶**

 我们知道，时间复杂度反应的是数据规模 n 很大的时候的一个增长趋势，所以它表示的时候会忽略系数、常数、低阶。但是实际的软件开发中，我们排序的可能是 10 个、100 个、1000 个这样规模很小的数据。所以，在对同一阶时间复杂度的排序算法性能对比的时候，我们就要把系数、常数、低阶也考虑进来。 

**(3)  比较次数和交换（或移动）次数** 

基于比较的排序算法, 会涉及二种操作, 一种是元素比较大小, 另一种是元素交换或移动。

### 2.  排序算法的内存消耗
算法的内存消耗可以通过空间复杂度来衡量，排序算法也不例外。不过，针对排序算法的空间复杂度，我们还引入了一个新的概念，原地排序（Sorted in place）。原地排序算法，就是特指空间复杂度是 O(1) 的排序算法。

## QA
**1. 为什么要说出三种不同的时间复杂度**

答: 因为数据的有序度不同, 会影响算法的执行时间. 所以我们要知道排序算法在不同数据下的性能表现。
