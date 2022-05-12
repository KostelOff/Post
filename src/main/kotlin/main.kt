fun main() {
    
}


data class Post(
    val id: Int = 0,
    val ownerId: Int? = null,
    val fromId: Int? = null,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Comments = Comments(1, true, true, true, true),
    val copyright: Copyright = Copyright(1, "copyright", "copyright"),
    val likes: Likes = Likes(1, true, true, true),
    val reposts: Reposts = Reposts(1, true),
    val views: Views = Views(1),
    val postType: String,
    val postSource: PostSource = PostSource(),
    var attachments: Array<Attachments> = emptyArray(),
    val geo: Geo = Geo("Geo", "Navi", Geo.Place(1)),
    val signerId: Int,
    val copyHistory: String,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Donut = Donut(true, 1, "donut", true, "don", "all", 1),
    val postponedId: Int
)

object WallService {
    private var allPosts = emptyArray<Post>()
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
}

class Comments(
    val count: Int,
    val canPost: Boolean,
    val groupsCanPost: Boolean,
    val canClose: Boolean,
    val canOpen: Boolean
)

class Copyright(
    val id: Int,
    val link: String,
    val name: String,
)

class Likes(
    val count: Int,
    val userLikes: Boolean,
    val canLike: Boolean,
    val canPublish: Boolean
)

class Reposts(
    val count: Int,
    val userReposted: Boolean
)

class Views(
    val count: Int
)

class PostSource

class Geo(
    val type: String,
    val coordinates: String,
    val place: Place,
) {

    class Place(
        val countryId: Int
    )
}

class Donut(
    val isDonut: Boolean,
    val paidDuration: Int,
    val Placeholder: String,
    val canPublishFreeCopy: Boolean,
    val editMode: String,
    val all: String,
    val duration: Int
)

interface Attachments {
    val type: String
}

class Audio(
    val id: Int,
    val ownerId: Int,
    val artist: String,
    val title: String,
    val duration: Int,
    val url: String,
    val lyricsId: Int,
    val albumId: Int,
    val genreId: Int,
    val date: Int,
    val noSearch: Boolean,
    val isHq: Boolean
)

class AudioAttachment(
    val audio: Audio,
) : Attachments {
    override val type: String = "Audio"
}

class Gift(
    val id: Int,
    val thumb256: String,
    val thumb96: String,
    val thumb48: String,
)

class GiftAttachment(
    val gift: Gift,
) : Attachments {
    override val type: String = "Gift"
}

class Graffiti(
    val id: Int,
    val ownerId: Int,
    val url: String,
    val width: Int,
    val height: Int,
)

class GraffitiAttachment(
    val graffiti: Graffiti,
) : Attachments {
    override val type: String = "Graffiti"
}

class Photo(
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
    val text: String,
    val date: Int,
    val sizes: Array<Photo>,
    val width: Int,
    val height: Int,
)

class PhotoAttachment(
    val photo: Photo,
) : Attachments {
    override val type: String = "Phote"
}

