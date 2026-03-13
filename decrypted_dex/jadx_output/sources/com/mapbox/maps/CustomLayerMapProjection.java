package com.mapbox.maps;

import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface CustomLayerMapProjection {
    List<Double> convertMercatorModelMatrix(List<Double> list, boolean z2);

    List<Double> getModelMatrix();

    List<Double> getTransitionMatrix();

    float getTransitionPhase();
}
