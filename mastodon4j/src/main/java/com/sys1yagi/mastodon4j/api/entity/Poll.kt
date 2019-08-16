package com.sys1yagi.mastodon4j.api.entity

import com.google.gson.annotations.SerializedName

/**
 * see more https://github.com/tootsuite/documentation/blob/master/Using-the-API/API.md#card
 */
class Poll(
        @SerializedName("id")
        val id: String = "",

        @SerializedName("expires_at")
        val expiresAt: String? = null,

        @SerializedName("expired")
        val expired: Boolean = false,

        @SerializedName("multiple")
        val multiple: Boolean = false,

        @SerializedName("votes_count")
        val votesCount: Int = 0,

        @SerializedName("voted")
        val voted: Boolean? = null,

        @SerializedName("options")
        val options: List<PollOption> = emptyList()
)

{
}
