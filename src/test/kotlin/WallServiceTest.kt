import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addPosts() {

        val post = WallService.addPosts(
            Post(
                id = 0,
                ownerId = null,
                fromId = null,
                createdBy = 1,
                date = 10052022,
                text = "Text",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = true,
                comments = Comments(),
                copyright = Copyright(),
                likes = Likes(),
                reposts = Reposts(),
                views = Views(),
                postType = "postType",
                postSource = PostSource(),
                attachments = emptyArray(),
                geo = Geo(),
                signerId = 1,
                copyHistory = "copyHistory",
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = true,
                markedAsAds = true,
                isFavorite = true,
                donut = Donut(true, 1, "donut", true, "don", "all", 1),
                postponedId = 1
            )
        )

        val result = post.id

        val expected = 1

        assertEquals(result, expected)
    }

    @Test
    fun updateFalse() {

        WallService.addPosts(
            Post(
                id = 1,
                ownerId = null,
                fromId = null,
                createdBy = 1,
                date = 10052022,
                text = "Text",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = true,
                comments = Comments(),
                copyright = Copyright(),
                likes = Likes(),
                reposts = Reposts(),
                views = Views(),
                postType = "postType",
                postSource = PostSource(),
                attachments = emptyArray(),
                geo = Geo(),
                signerId = 1,
                copyHistory = "copyHistory",
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = true,
                markedAsAds = true,
                isFavorite = true,
                donut = Donut(true, 1, "donut", true, "don", "all", 1),
                postponedId = 1
            )
        )

        WallService.addPosts(
            Post(
                id = 2,
                ownerId = null,
                fromId = null,
                createdBy = 1,
                date = 10052022,
                text = "Text",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = true,
                comments = Comments(),
                copyright = Copyright(),
                likes = Likes(),
                reposts = Reposts(),
                views = Views(),
                postType = "postType",
                postSource = PostSource(),
                attachments = emptyArray(),
                geo = Geo(),
                signerId = 1,
                copyHistory = "copyHistory",
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = true,
                markedAsAds = true,
                isFavorite = true,
                donut = Donut(true, 1, "donut", true, "don", "all", 1),
                postponedId = 1
            )
        )

        WallService.addPosts(
            Post(
                id = 3,
                ownerId = null,
                fromId = null,
                createdBy = 1,
                date = 10052022,
                text = "Text",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = true,
                comments = Comments(),
                copyright = Copyright(),
                likes = Likes(),
                reposts = Reposts(),
                views = Views(),
                postType = "postType",
                postSource = PostSource(),
                attachments = emptyArray(),
                geo = Geo(),
                signerId = 1,
                copyHistory = "copyHistory",
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = true,
                markedAsAds = true,
                isFavorite = true,
                donut = Donut(true, 1, "donut", true, "don", "all", 1),
                postponedId = 1
            )
        )

        val updatePost = Post(
            id = 6,
            ownerId = null,
            fromId = null,
            createdBy = 1,
            date = 10052022,
            text = "Text",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = true,
            comments = Comments(),
            copyright = Copyright(),
            likes = Likes(),
            reposts = Reposts(),
            views = Views(),
            postType = "postType",
            postSource = PostSource(),
            attachments = emptyArray(),
            geo = Geo(),
            signerId = 1,
            copyHistory = "copyHistory",
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            donut = Donut(true, 1, "donut", true, "don", "all", 1),
            postponedId = 1
        )

        val result = WallService.update(updatePost)

        assertFalse(result)
    }

    @Test
    fun updateTrue() {

        WallService.addPosts(
            Post(
                id = 3,
                ownerId = null,
                fromId = null,
                createdBy = 1,
                date = 10052022,
                text = "Text",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = true,
                comments = Comments(),
                copyright = Copyright(),
                likes = Likes(),
                reposts = Reposts(),
                views = Views(),
                postType = "postType",
                postSource = PostSource(),
                attachments = emptyArray(),
                geo = Geo(),
                signerId = 1,
                copyHistory = "copyHistory",
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = true,
                markedAsAds = true,
                isFavorite = true,
                donut = Donut(true, 1, "donut", true, "don", "all", 1),
                postponedId = 1
            )
        )


        WallService.addPosts(
            Post(
                id = 5,
                ownerId = null,
                fromId = null,
                createdBy = 1,
                date = 10052022,
                text = "Text",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = true,
                comments = Comments(),
                copyright = Copyright(),
                likes = Likes(),
                reposts = Reposts(),
                views = Views(),
                postType = "postType",
                postSource = PostSource(),
                attachments = emptyArray(),
                geo = Geo(),
                signerId = 1,
                copyHistory = "copyHistory",
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = true,
                markedAsAds = true,
                isFavorite = true,
                donut = Donut(true, 1, "donut", true, "don", "all", 1),
                postponedId = 1
            )
        )

        WallService.addPosts(
            Post(
                id = 2,
                ownerId = null,
                fromId = null,
                createdBy = 1,
                date = 10052022,
                text = "Text",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = true,
                comments = Comments(),
                copyright = Copyright(),
                likes = Likes(),
                reposts = Reposts(),
                views = Views(),
                postType = "postType",
                postSource = PostSource(),
                attachments = emptyArray(),
                geo = Geo(),
                signerId = 1,
                copyHistory = "copyHistory",
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = true,
                markedAsAds = true,
                isFavorite = true,
                donut = Donut(true, 1, "donut", true, "don", "all", 1),
                postponedId = 1
            )
        )


        val updatePost = Post(
            id = 2,
            ownerId = null,
            fromId = null,
            createdBy = 1,
            date = 10052022,
            text = "Text",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = true,
            comments = Comments(),
            copyright = Copyright(),
            likes = Likes(),
            reposts = Reposts(),
            views = Views(),
            postType = "postType",
            postSource = PostSource(),
            attachments = emptyArray(),
            geo = Geo(),
            signerId = 1,
            copyHistory = "copyHistory",
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            donut = Donut(true, 1, "donut", true, "don", "all", 1),
            postponedId = 1
        )

        val result = WallService.update(updatePost)

        assertTrue(result)
    }

    @Test
    fun nullProp() {

        val nullProp = WallService.nullProp(
            Post(
                id = 1,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 10052022,
                text = "Text",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = true,
                comments = Comments(),
                copyright = Copyright(),
                likes = Likes(),
                reposts = Reposts(),
                views = Views(),
                postType = "postType",
                postSource = PostSource(),
                attachments = emptyArray(),
                geo = Geo(),
                signerId = 1,
                copyHistory = "copyHistory",
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = true,
                markedAsAds = true,
                isFavorite = true,
                donut = Donut(true, 1, "donut", true, "don", "all", 1),
                postponedId = 1
            )
        )

        val result = nullProp.ownerId
        val result2 = nullProp.fromId

        val expected = 1

        assertEquals(result, expected)
        assertEquals(result2, expected)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {

        val createComments = WallService.createComments(
            Comments(
                postId = 0,
                fromGroup = 3,
                message = "message",
                replyToComment = 3,
                stickerId = 4,
                guid = "guid"
            )
        )

        val result = createComments.postId
        val expected = 1
        assertEquals(result, expected)
    }
}