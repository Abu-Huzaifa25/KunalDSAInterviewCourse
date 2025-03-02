### **Ceiling of a Number using Binary Search**

#### **Definition**
The **ceiling** of a number in a sorted array is the **smallest element that is greater than or equal to the target**. If no such element exists, return `-1`.

---

### **Example**
#### **Input:**
```txt
nums = [2, 5, 8, 10, 14, 18]  
target = 9  
```
#### **Output:**
```txt
Ceiling = 10
```
#### **Explanation:**
- The smallest number **≥ 9** in `[2, 5, 8, 10, 14, 18]` is **10**.

---

### **Binary Search Approach**
1. **Initialize `left = 0` and `right = n - 1`**.
2. **If the target is greater than the last element, return `-1` (No ceiling exists).**
3. Use **Binary Search**:
    - If `nums[mid] == target`, return `nums[mid]` (exact match).
    - If `nums[mid] < target`, move **right** (`left = mid + 1`).
    - If `nums[mid] > target`, update `ceiling` and move **left** (`right = mid - 1`).
4. The variable `ceiling` stores the answer.

---

### **Java Code Implementation**
```java
class CeilingBinarySearch {
    static int findCeiling(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int ceiling = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return nums[mid]; // Exact match
            else if (nums[mid] < target) left = mid + 1;
            else {
                ceiling = nums[mid]; // Possible answer
                right = mid - 1;
            }
        }
        return ceiling;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 8, 10, 14, 18};
        int target = 9;
        System.out.println("Ceiling: " + findCeiling(nums, target)); // Output: 10
    }
}
```

---

### **Time Complexity Analysis**
- **Best Case:** `O(1)` (Direct match).
- **Worst Case:** `O(log n)` (Binary search).
- **Space Complexity:** `O(1)` (No extra space).

This method efficiently finds the ceiling of a number in a sorted array. Let me know if you need modifications!