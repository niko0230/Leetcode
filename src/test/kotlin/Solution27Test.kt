import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution27Test {


    /**
     * 场景：数组为空
     * 结果：长度为0
     */
    @Test
    fun removeElement_emptyArray_lengthIsZero() {
        // prepare
        val array = intArrayOf()
        val theVal = 3
        val solution = Solution27()

        // operate
        val result = solution.removeElement(array, theVal)

        // assert
        assertEquals(0, result)
        assertArrayEquals(intArrayOf(), array)
    }

    /**
     * 场景：全部元素都移除
     * 结果：移除成功
     */
    @Test
    fun removeElement_removeAll_lengthIsZero() {
        // prepare
        val array = intArrayOf(3, 3, 3, 3)
        val theVal = 3
        val solution = Solution27()

        // operate
        val result = solution.removeElement(array, theVal)

        // assert
        assertEquals(0, result)
        assertArrayEquals(intArrayOf(3, 3, 3, 3), array)
    }

    /**
     * 场景：普通数组
     * 结果：移除成功
     */
    @Test
    fun removeElement_normal_success() {
        // prepare
        val array = intArrayOf(3, 2, 2, 3)
        val theVal = 3
        val solution = Solution27()

        // operate
        val result = solution.removeElement(array, theVal)

        // assert
        assertEquals(2, result)
        assertArrayEquals(intArrayOf(2, 2, 3, 3), array)
    }

}