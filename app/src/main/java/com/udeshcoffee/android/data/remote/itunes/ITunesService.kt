package com.udeshcoffee.android.data.remote.itunes
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Udathari on 12/5/2017.
 */
interface ITunesService {
    @GET("search")
    fun search(@Query("term") song: String, @Query("media") media: String = "music",
               @Query("entity") entity: String = "song", @Query("attribute") attribute: String = "songTerm"): Observable<SearchResponse>
}