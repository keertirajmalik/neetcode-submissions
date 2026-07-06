func hasDuplicate(nums []int) bool {
    	countMap := make(map[int]bool)

        for _, num := range nums {
            if countMap[num] {
                return true
            }

            countMap[num] = true
        }

        return false
}
