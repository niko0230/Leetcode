import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class Solution88Test {

    /**
     * 普通场景
     */
    @Test
    fun merge_normal_success() {
        // prepare
        val solution = Solution88()
        val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
        val nums2 = intArrayOf(2, 5, 6)

        // operate
        solution.merge(nums1, 3, nums2, 3)

        // assert
        assertArrayEquals(nums1, intArrayOf(1, 2, 2, 3, 5, 6))
    }

    /**
     * nums1为空的场景，结果为nums2
     */
    @Test
    fun merge_nums1IsEmpty_nums2() {
        // prepare
        val solution = Solution88()
        val nums1 = intArrayOf(0)
        val nums2 = intArrayOf(1)

        // operate
        solution.merge(nums1, 0, nums2, 1)

        // assert
        assertArrayEquals(nums1, intArrayOf(1))
    }

    /**
     * nums2为空的场景，结果为nums1
     */
    @Test
    fun merge_nums2IsEmpty_nums1() {
        // prepare
        val solution = Solution88()
        val nums1 = intArrayOf(1)
        val nums2 = intArrayOf()

        // operate
        solution.merge(nums1, 1, nums2, 0)

        // assert
        assertArrayEquals(nums1, intArrayOf(1))
    }
}