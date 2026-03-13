package com.mapbox.navigator;

import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface RoadObjectMatcherInterface {
    void cancel(List<String> list);

    void cancelAll();

    void matchGantries(List<MatchableGeometry> list, MatchingOptions matchingOptions);

    void matchOpenLRs(List<MatchableOpenLr> list, MatchingOptions matchingOptions);

    void matchPoints(List<MatchablePoint> list, MatchingOptions matchingOptions);

    void matchPolygons(List<MatchableGeometry> list, MatchingOptions matchingOptions);

    void matchPolylines(List<MatchableGeometry> list, MatchingOptions matchingOptions);

    void setListener(RoadObjectMatcherListener roadObjectMatcherListener);
}
