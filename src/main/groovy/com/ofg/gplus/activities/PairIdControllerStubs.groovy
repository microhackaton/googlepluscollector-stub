package com.ofg.gplus.activities

import com.ofg.infrastructure.Stub
import groovy.transform.TypeChecked

import static com.github.tomakehurst.wiremock.client.WireMock.*
import static com.ofg.infrastructure.TwitterPlacesAnalyzerMediaType.APPLICATION_TYPE
import static com.ofg.infrastructure.TwitterPlacesAnalyzerMediaType.CONTENT_TYPE

@TypeChecked
class PairIdControllerStubs {

    @Stub
    public static void getPlacesFromTweets() {
        stubFor(
                get(urlMatching('/activities/\\w+/[0-9]+'))
                        .withHeader(CONTENT_TYPE, equalTo(APPLICATION_TYPE))
                        .willReturn(aResponse()
                        .withStatus(200)
                ))

    }

}
