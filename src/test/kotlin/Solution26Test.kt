import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution26Test {


    /**
     * 场景：普通数组
     * 结果：移除成功
     */
    @Test
    fun removeDuplicates_normal_success() {
        // prepare
        val nums = intArrayOf(1, 1, 2)

        val solution = Solution26()

        // operate
        val result = solution.removeDuplicates(nums)

        // assert
        assertEquals(2, result)
    }

    /**
     * 场景：空数组
     * 结果：不移除
     */
    @Test
    fun removeDuplicates_empty_empty() {
        // prepare
        val nums = intArrayOf()

        val solution = Solution26()

        // operate
        val result = solution.removeDuplicates(nums)

        // assert
        assertEquals(0, result)
    }


}