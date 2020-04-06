# 插入排序
 插入排序和冒泡排序的时间复杂度相同，都是 O(n<sup>2</sup>)，在实际的软件开发里，为什么我们更倾向于使用插入排序算法而不是冒泡排序算法呢？



## 方法

插入排序将数组分为二个部分：**已排序区间**（循环不变式）和**未排序区间**。每次要插入的 key 与循环不变式作比较，满足条件就将与 key 比较的元素后移一位。最后找到要插入的位置，插入 key。



## 实现

```java
public static void insertSort(int[] arr) {
    int lastIndex = arr.length - 1;
    // 刚开始循环不变式为 [a[0]], 待排序区间为 [a[1], a[lastIndex]]
    for (int i = 1; i <= lastIndex; i++) {
        int j = i - 1;
        int key = arr[i];
        // 循环不变式 b[0] 到 b[j], 待排序区间 c[i] 到 c[arr.length - 1]
        while (j >= 0 && key < arr[j]) {
            // 如果要插入的 key 小于与之比较的循环不变式 b[j], 则将 b[j] 后移一位
            // 第一次移动时，a[j+1] 的值等同于 key，已经被记录下来了
            // 最后把 key 插入到应在在的位置就可以了
            arr[j + 1] = arr[j];
            // j-- key 与 循环不变式的前一个值做比较
            j--;
        }
        // 插入 key
        arr[j + 1] = key;
    }
}
```



## 时间复杂度

插入排序有二个主要步骤：元素的**比较**和**移动**。插入算法的移动次数是固定的，为逆序度。
冒泡排序移动的次数和拆入排序相同，但是冒泡排序的 swap 方法有三个赋值语句，所以排序一个逆序度为 K的数组，交换操作的耗时是 3 * K。所以插入排序排序要比冒泡排序块。



**最好情况时间复杂度**

序列有序，逆序度为 0，那么比较次数为 n - 1 ，赋值次数为 k* n，所以最好情况时间复杂度为 O(n)。

**最坏情况时间复杂度**

序列是满逆序度序列，那么此时需要进行的比较次数为 C<sub>n</sub><sup>2</sup> = n ( n - 1 ) / 2 。插入排序的赋值操作次数是比较操作的次数加上 (n - 1）次。所以最坏时间复杂度为 O(n^2)。

**平均时间复杂度**

取  n (n - 1) / 4 平均情况，既时间复杂度为 O(n^2)。

## 稳定性

插入排序算法的运行并不需要额外的存储空间，所以空间复杂度是 O(1)，也就是说，这是一个原地排序算法。

对于值相同的元素，我们可以选择将后面出现的元素，插入到前面出现元素的后面，这样就可以保持原有的前后顺序不变，所以插入排序是稳定的排序算法。