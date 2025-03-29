import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add_Test_True() {
        val postTest1 = Post(0, likes = Post.Like())
        val postAdded = WallService.add(postTest1)
        var result = false
        if (postAdded.id != 0) result = true
        assertTrue(result)
    }

    @Test
    fun update_True() {
        WallService.resetNumber()
        WallService.resetPosts()
        val postTest2 = Post(0, likes = Post.Like())
        WallService.add(postTest2)
        WallService.add(postTest2)
        WallService.add(postTest2)
        val sampleTest = Post(2, copyright = "Super", likes = Post.Like(500, canLike = true))
        val result: Boolean = WallService.update(sampleTest)
        assertTrue(result)
    }

    @Test
    fun update_False() {
        WallService.resetNumber()
        WallService.resetPosts()
        val postTest3 = Post(0, likes = Post.Like())
        WallService.add(postTest3)
        WallService.add(postTest3)
        WallService.add(postTest3)
        val sample = Post(4, copyright = "Super", likes = Post.Like(500, canLike = true))
        val result: Boolean = WallService.update(sample)
        assertFalse(result)
    }
}