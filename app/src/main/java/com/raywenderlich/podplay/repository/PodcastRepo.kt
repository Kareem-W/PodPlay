package com.raywenderlich.podplay.repository

import com.raywenderlich.podplay.model.Podcast
import com.raywenderlich.podplay.service.RssFeedService

class PodcastRepo {


    fun getPodcast(feedUrl: String): Podcast? {

        val rssFeedService = RssFeedService.instance

        rssFeedService.getFeed(feedUrl) {
        }

        return Podcast(feedUrl, "No Name","No description", "No image")
    }
}