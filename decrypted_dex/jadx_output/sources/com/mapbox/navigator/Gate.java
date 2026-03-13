package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class Gate implements Serializable {
    private final double distance;
    private final int id;
    private final Position position;
    private final double probability;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public Gate(int i3, Position position, double d8, double d10) {
        this.id = i3;
        this.position = position;
        this.probability = d8;
        this.distance = d10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Gate gate = (Gate) obj;
        return this.id == gate.id && Objects.equals(this.position, gate.position) && PartialEq.compare(this.probability, gate.probability) && PartialEq.compare(this.distance, gate.distance);
    }

    public double getDistance() {
        return this.distance;
    }

    public int getId() {
        return this.id;
    }

    public Position getPosition() {
        return this.position;
    }

    public double getProbability() {
        return this.probability;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.id), this.position, Double.valueOf(this.probability), Double.valueOf(this.distance));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        b.o(this.id, ", position: ", sb2);
        sb2.append(RecordUtils.fieldToString(this.position));
        sb2.append(", probability: ");
        b.m(this.probability, sb2, ", distance: ");
        return b.f(this.distance, sb2, "]");
    }
}
