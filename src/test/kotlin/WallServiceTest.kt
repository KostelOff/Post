import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addPosts() {

        val post = WallService.addPosts(
            Post(
                id = 1,
                ownerId = 4,
                fromId = 1,
                createdBy = 1,
                date = 10052022,
                text = "Text",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = true,
                comments = "CommentsObject",
                copyright = "CopyrightObject",
                likes = "LikesObject",
                reposts = "RepostsObject",
                views = "ViewsObject",
                postType = "Post",
                signerId = 1,
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = true,
                markedAsAds = true,
                isFavorite = true,
                donut = "DonutObject",
                postponedId = 1
            )
        )

        val result = post.id

        val expected = 0

        assertEquals(result, expected)
    }

    @Test
    fun updateFalse() {

        WallService.addPosts(
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
                comments = "CommentsObject",
                copyright = "CopyrightObject",
                likes = "LikesObject",
                reposts = "RepostsObject",
                views = "ViewsObject",
                postType = "Post",
                signerId = 1,
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = true,
                markedAsAds = true,
                isFavorite = true,
                donut = "DonutObject",
                postponedId = 1
            )
        )

        WallService.addPosts(
            Post(
                id = 2,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 10052022,
                text = "Text",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = true,
                comments = "CommentsObject",
                copyright = "CopyrightObject",
                likes = "LikesObject",
                reposts = "RepostsObject",
                views = "ViewsObject",
                postType = "Post",
                signerId = 1,
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = true,
                markedAsAds = true,
                isFavorite = true,
                donut = "DonutObject",
                postponedId = 1
            )
        )

        WallService.addPosts(
            Post(
                id = 3,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 10052022,
                text = "Text",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = true,
                comments = "CommentsObject",
                copyright = "CopyrightObject",
                likes = "LikesObject",
                reposts = "RepostsObject",
                views = "ViewsObject",
                postType = "Post",
                signerId = 1,
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = true,
                markedAsAds = true,
                isFavorite = true,
                donut = "DonutObject",
                postponedId = 1
            )
        )

        val updatePost = Post(
            id = 6,
            ownerId = 1,
            fromId = 1,
            createdBy = 1,
            date = 10052022,
            text = "Text",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = true,
            comments = "CommentsObject",
            copyright = "CopyrightObject",
            likes = "LikesObject",
            reposts = "RepostsObject",
            views = "ViewsObject",
            postType = "Post",
            signerId = 1,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            donut = "DonutObject",
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
                ownerId = 15,
                fromId = 15,
                createdBy = 15,
                date = 31032022,
                text = "postText",
                replyOwnerId = 16,
                replyPostId = 13,
                friendsOnly = true,
                comments = "CommentsObject",
                copyright = "CopyrightObject",
                likes = "LikesObject",
                reposts = "RepostsObject",
                views = "ViewsObject",
                postType = "Post",
                signerId = 15,
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = true,
                markedAsAds = true,
                isFavorite = true,
                donut = "DonutObject",
                postponedId = 1
            )
        )


        WallService.addPosts(
            Post(
                id = 5,
                ownerId = 15,
                fromId = 15,
                createdBy = 15,
                date = 31032022,
                text = "postText",
                replyOwnerId = 16,
                replyPostId = 13,
                friendsOnly = true,
                comments = "CommentsObject",
                copyright = "CopyrightObject",
                likes = "LikesObject",
                reposts = "RepostsObject",
                views = "ViewsObject",
                postType = "Post",
                signerId = 15,
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = true,
                markedAsAds = true,
                isFavorite = true,
                donut = "DonutObject",
                postponedId = 1
            )
        )

        WallService.addPosts(
            Post(
                id = 2,
                ownerId = 15,
                fromId = 15,
                createdBy = 15,
                date = 31032022,
                text = "postText",
                replyOwnerId = 16,
                replyPostId = 13,
                friendsOnly = true,
                comments = "CommentsObject",
                copyright = "CopyrightObject",
                likes = "LikesObject",
                reposts = "RepostsObject",
                views = "ViewsObject",
                postType = "Post",
                signerId = 15,
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = true,
                markedAsAds = true,
                isFavorite = true,
                donut = "DonutObject",
                postponedId = 1
            )
        )


        val updatePost = Post(
            id = 2,
            ownerId = 15,
            fromId = 15,
            createdBy = 15,
            date = 31032022,
            text = "postChangingText",
            replyOwnerId = 16,
            replyPostId = 13,
            friendsOnly = true,
            comments = "CommentsObject",
            copyright = "CopyrightObject",
            likes = "LikesObject",
            reposts = "RepostsObject",
            views = "ViewsObject",
            postType = "Post",
            signerId = 15,
            canPin = false,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = false,
            donut = "DonutObject",
            postponedId = 1
        )

        val result = WallService.update(updatePost)

        assertTrue(result)
    }
}