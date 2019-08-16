package com.sys1yagi.mastodon4j.api.entity

import com.google.gson.annotations.SerializedName

/**
 * see more https://github.com/tootsuite/documentation/blob/master/Using-the-API/API.md#card
 */
class PollOption(
        @SerializedName("title")
        val title: String = "",

        @SerializedName("votes_count")
        val votesCount: Int = 0)
{
}
