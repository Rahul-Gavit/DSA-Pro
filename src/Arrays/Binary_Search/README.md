# Binary Search Algorithm

## Approach

1. **Initialize Pointers**:

   - Start with two pointers: `start` at the beginning of the array and `end` at the last element of the array.

2. **Compute Middle**:

   - Calculate the middle index of the array: `mid = (start + end) / 2`.

3. **Compare**:

   - If `key` is equal to `arr[mid]`, return `mid`.
   - If `key` is greater than `arr[mid]`, update `start` to `mid + 1`.
   - If `key` is less than `arr[mid]`, update `end` to `mid - 1`.

4. **Repeat**:

   - Continue the process until `start` is greater than `end`.

5. **Return**:
   - If the `key` is not found, return `-1`.

## Time Complexity (TC)

- **Best Case**: \(O(1)\) – The key is found at the middle of the array in the first comparison.
- **Average Case**: \(O(\log n)\) – Each comparison reduces the search interval by half.
- **Worst Case**: \(O(\log n)\) – The search interval is halved at each step until the key is found or the interval is empty.

## Space Complexity (SC)

- **Space Complexity**: \(O(1)\) – The algorithm uses a few extra variables (`start`, `end`, `mid`), regardless of the input size.

## Dry Run Example

**Array**: `[2, 4, 6, 8, 10, 12, 14, 16, 18, 20]`  
**Key**: `10`

**Step-by-Step Execution**:

1. **Initialization**:

   - `start = 0`
   - `end = 9` (length of array - 1)

2. **First Iteration**:
   - `mid = (start + end) / 2 = (0 + 9) / 2 = 4`
   - `arr[mid] = arr[4] = 10`
   - `key (10) == arr[mid] (10)` – Key found at index `4`.
   - Return `4`.

**Result**: The index of the key `10` in the array is `4`.
