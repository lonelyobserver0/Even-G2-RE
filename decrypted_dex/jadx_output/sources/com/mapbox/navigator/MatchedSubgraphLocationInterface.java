package com.mapbox.navigator;

import com.mapbox.geojson.Geometry;
import java.util.HashMap;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface MatchedSubgraphLocationInterface {
    HashMap<Long, SubgraphEdge> getEdges();

    List<Position> getEnters();

    List<Position> getExits();

    Geometry getShape();
}
