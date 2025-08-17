class Solution:
    def searchMatrix(self, matrix, target):
        rows = len(matrix)
        cols = len(matrix[0])

        for i in range(rows):
            if matrix[i][0] <= target <= matrix[i][cols - 1]:
                return self.binarySearch(matrix[i], target)
        return False

    def binarySearch(self, arr, target):
        low, high = 0, len(arr) - 1
        while low <= high:
            mid = (low + high) // 2
            if arr[mid] == target:
                return True
            elif arr[mid] > target:
                high = mid - 1
            else:
                low = mid + 1
        return False


# Example usage
if __name__ == "__main__":
    s = Solution()
    arr = [
        [1, 3, 5, 7],
        [10, 11, 16, 20],
        [23, 30, 34, 60]
    ]
    result = s.searchMatrix(arr, 20)
    print("ele present" if result else "ele not present")
