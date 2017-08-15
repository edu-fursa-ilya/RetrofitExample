package dev.android.fursa.googleplacesapitest.network;


import java.util.List;

import dev.android.fursa.googleplacesapitest.list.GitHubRepo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubClient {

    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> reposForUser(@Path("user") String user);
}