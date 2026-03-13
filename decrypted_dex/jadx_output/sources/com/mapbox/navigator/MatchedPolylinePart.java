package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MatchedPolylinePart implements Serializable {
    private final int amountOfKeypoints;
    private final int beginIndex;
    private final int endIndex;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public MatchedPolylinePart(int i3, int i10, int i11) {
        this.beginIndex = i3;
        this.endIndex = i10;
        this.amountOfKeypoints = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MatchedPolylinePart matchedPolylinePart = (MatchedPolylinePart) obj;
        return this.beginIndex == matchedPolylinePart.beginIndex && this.endIndex == matchedPolylinePart.endIndex && this.amountOfKeypoints == matchedPolylinePart.amountOfKeypoints;
    }

    public int getAmountOfKeypoints() {
        return this.amountOfKeypoints;
    }

    public int getBeginIndex() {
        return this.beginIndex;
    }

    public int getEndIndex() {
        return this.endIndex;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.beginIndex), Integer.valueOf(this.endIndex), Integer.valueOf(this.amountOfKeypoints));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[beginIndex: ");
        b.o(this.beginIndex, ", endIndex: ", sb2);
        b.o(this.endIndex, ", amountOfKeypoints: ", sb2);
        return b.g(this.amountOfKeypoints, "]", sb2);
    }
}
