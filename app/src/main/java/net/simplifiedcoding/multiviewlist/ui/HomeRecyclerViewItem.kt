package net.simplifiedcoding.multiviewlist.ui

sealed class HomeRecyclerViewItem {

    data class Title(
        val id: Int?,
        val title: String?
    ) : HomeRecyclerViewItem()

    data class Movie(
        val id: Int,
        val title: String?,
        val thumbnail: String?,
        val release_date: String?
    ) : HomeRecyclerViewItem()

    data class Director(
        val id: Int,
        val name: String?,
        val avatar: String?,
        val movie_count: Int?
    ) : HomeRecyclerViewItem()

}