package com.mapbox.navigator.match.openlr;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class GridLocationReference implements Serializable {
    private final Point lowerLeft;
    private final int nCols;
    private final int nRows;
    private final Point upperRight;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public GridLocationReference(Point point, Point point2, int i3, int i10) {
        this.lowerLeft = point;
        this.upperRight = point2;
        this.nCols = i3;
        this.nRows = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GridLocationReference gridLocationReference = (GridLocationReference) obj;
        return Objects.equals(this.lowerLeft, gridLocationReference.lowerLeft) && Objects.equals(this.upperRight, gridLocationReference.upperRight) && this.nCols == gridLocationReference.nCols && this.nRows == gridLocationReference.nRows;
    }

    public Point getLowerLeft() {
        return this.lowerLeft;
    }

    public int getNCols() {
        return this.nCols;
    }

    public int getNRows() {
        return this.nRows;
    }

    public Point getUpperRight() {
        return this.upperRight;
    }

    public int hashCode() {
        return Objects.hash(this.lowerLeft, this.upperRight, Integer.valueOf(this.nCols), Integer.valueOf(this.nRows));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[lowerLeft: ");
        b.q(this.lowerLeft, sb2, ", upperRight: ");
        b.q(this.upperRight, sb2, ", nCols: ");
        b.o(this.nCols, ", nRows: ", sb2);
        return b.g(this.nRows, "]", sb2);
    }
}
