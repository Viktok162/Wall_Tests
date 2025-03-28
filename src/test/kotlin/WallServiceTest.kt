import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add_Test_True() {
        val result: Boolean = WallService.add()
        assertTrue(result)
    }

    @Test
    fun update_True() {
        WallService.setNumber()
        WallService.add()
        WallService.add()
        WallService.add()
        val sample = Post(3, copyright = "Super", likes = Post.Like(500, canLike = true))
        val result: Boolean = WallService.update(sample)
        assertTrue(result)
    }

    @Test
    fun update_False() {
        WallService.setNumber()
        WallService.add()
        WallService.add()
        val sample = Post(3, copyright = "Super", likes = Post.Like(500, canLike = true))
        val result: Boolean = WallService.update(sample)
        assertFalse(result)
    }
}