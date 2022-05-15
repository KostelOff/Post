class PostNotFoundException(message: String) : Exception(message)

fun main() {

}

data class Post(
    val id: Int = 2,
    val ownerId: Int? = null,
    val fromId: Int? = null,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Comments = Comments(),
    val copyright: Copyright = Copyright(),
    val likes: Likes = Likes(),
    val reposts: Reposts = Reposts(),
    val views: Views = Views(),
    val postType: String,
    val postSource: PostSource = PostSource(),
    var attachments: Array<Attachments> = emptyArray(),
    val geo: Geo = Geo(),
    val signerId: Int,
    val copyHistory: String,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Donut = Donut(),
    val postponedId: Int
)

object WallService {
    private var allPosts = emptyArray<Post>()
    private var commentsArray = emptyArray<Comments>()
    private var idPost = 0


    fun addPosts(post: Post): Post {
        allPosts += post.copy(id = ++idPost)
//      allPosts += post.copy(id = idPost.size)
        return allPosts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, postIndex) in allPosts.withIndex()) {
            if (postIndex.id == post.id) {
                allPosts[index] = postIndex.copy(
                    id = post.id,
                    ownerId = post.ownerId,
                    fromId = post.fromId,
                    createdBy = post.createdBy,
                    date = post.date,
                    text = post.text,
                    replyOwnerId = post.replyOwnerId,
                    replyPostId = post.replyPostId,
                    friendsOnly = post.friendsOnly,
                    comments = post.comments,
                    copyright = post.copyright,
                    likes = post.likes,
                    reposts = post.reposts,
                    views = post.views,
                    postType = post.postType,
                    postSource = post.postSource,
                    attachments = post.attachments,
                    geo = post.geo,
                    signerId = post.signerId,
                    copyHistory = post.copyHistory,
                    canPin = post.canPin,
                    canDelete = post.canDelete,
                    canEdit = post.canEdit,
                    isPinned = post.isPinned,
                    markedAsAds = post.markedAsAds,
                    isFavorite = post.isFavorite,
                    donut = post.donut,
                    postponedId = post.postponedId
                )
                return true
            }
        }
        return false
    }

    fun nullProp(post: Post): Post {
        val original = post.ownerId ?: post
        val original2 = post.fromId ?: post
        return post
    }

    fun createComments(comment: Comments) {
        for (post in allPosts) {
            if (post.id == comment.postId)
                commentsArray += comment
        }
        throw PostNotFoundException("Пост ${comment.postId} не найден")
    }
}

class Comments(
    val ownerId: Int = 1,
    val postId: Int = 2,
    val fromGroup: Int = 3,
    val message: String = "message",
    val replyToComment: Int = 3,
    val attachment: Array<Attachments> = emptyArray(),
    val stickerId: Int = 4,
    val guid: String = "guid",
)

class Copyright(
    val id: Int = 1,
    val link: String = "link",
    val name: String = "name",
)

class Likes(
    val count: Int = 1,
    val userLikes: Boolean = true,
    val canLike: Boolean = true,
    val canPublish: Boolean = true
)

class Reposts(
    val count: Int = 1,
    val userReposted: Boolean = true
)

class Views(
    val count: Int = 1
)

class PostSource

class Geo(
    val type: String = "",
    val coordinates: String = "",
    val place: Place = Place(),
) {

    class Place(
        val countryId: Int = 1
    )
}

class Donut(
    val isDonut: Boolean = true,
    val paidDuration: Int = 1,
    val Placeholder: String = "",
    val canPublishFreeCopy: Boolean = true,
    val editMode: String = "",
    val all: String = "",
    val duration: Int = 1
)

interface Attachments {
    val type: String
}

class Audio(
    val id: Int = 1,
    val ownerId: Int = 1,
    val artist: String = "",
    val title: String = "",
    val duration: Int = 1,
    val url: String = "url",
    val lyricsId: Int = 2,
    val albumId: Int = 3,
    val genreId: Int = 4,
    val date: Int = 5,
    val noSearch: Boolean = true,
    val isHq: Boolean = true
)

class AudioAttachment(
    val audio: Audio = Audio(),
) : Attachments {
    override val type: String = "Audio"
}

class Gift(
    val id: Int = 1,
    val thumb256: String = "thumb256",
    val thumb96: String = "thumb96",
    val thumb48: String = "thumb48",
)

class GiftAttachment(
    val gift: Gift,
) : Attachments {
    override val type: String = "Gift"
}

class Graffiti(
    val id: Int = 1,
    val ownerId: Int = 2,
    val url: String = "url",
    val width: Int = 3,
    val height: Int = 4,
)

class GraffitiAttachment(
    val graffiti: Graffiti,
) : Attachments {
    override val type: String = "Graffiti"
}

class Photo(
    val id: Int = 1,
    val albumId: Int = 2,
    val ownerId: Int = 3,
    val userId: Int = 4,
    val text: String = "text",
    val date: Int = 6,
    val sizes: Array<Photo> = emptyArray(),
    val width: Int = 7,
    val height: Int = 8,
)

class PhotoAttachment(
    val photo: Photo,
) : Attachments {
    override val type: String = "Phote"
}

