package com.example.matchessimulator.data;


import java.util.List;

import com.example.matchessimulator.domain.Match;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GithubMatchesApi {

    @GET("matches.json")
    Call<List<Match>> getMatches();
}