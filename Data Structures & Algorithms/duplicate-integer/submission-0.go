func hasDuplicate(nums []int) bool {
    	countMap := make(map[int]int)

        for _, num := range nums {
            _, ok := countMap[num]

            if ok {
                return true
            }

            countMap[num] = 1
        }

        return false
}
