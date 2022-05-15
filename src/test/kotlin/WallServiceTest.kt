import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addPosts() {

        val post = WallService.addPosts(
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

        val result = post.id
        val expected = 1

        assertEquals(expected, result)
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

        WallService.addPosts(
            Post(
                1,
                null,
                null,
                1,
                10052022,
                "Text", 1,
                1,
                true,
                Comments(),
                Copyright(),
                Likes(),
                Reposts(),
                Views(),
                "postType",
                PostSource(),
                emptyArray(),
                Geo(),
                1,
                "copyHistory",
                true,
                true,
                true,
                true,
                true,
                true,
                Donut(true, 1, "donut", true, "don", "all", 1),
                1
            )
        )

        WallService.createComments(
            Comments(
                ownerId = 1,
                postId = 2,
                fromGroup = 3,
                message = "message",
                replyToComment = 3,
                attachment = emptyArray(),
                stickerId = 4,
                guid = "guid",
            )
        )
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow2() {

        WallService.addPosts(
            Post(
                1,
                null,
                null,
                1,
                10052022,
                "Text", 1,
                1,
                true,
                Comments(),
                Copyright(),
                Likes(),
                Reposts(),
                Views(),
                "postType",
                PostSource(),
                emptyArray(),
                Geo(),
                1,
                "copyHistory",
                true,
                true,
                true,
                true,
                true,
                true,
                Donut(true, 1, "donut", true, "don", "all", 1),
                1
            )
        )

        WallService.createComments(
            Comments(
                ownerId = 123,
                postId = 2,
                fromGroup = 3,
                message = "message",
                replyToComment = 3,
                attachment = emptyArray(),
                stickerId = 4,
                guid = "guid",
            )
        )
    }
}


