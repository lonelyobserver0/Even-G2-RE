package com.mapbox.navigator.route_data;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RdManeuver implements Serializable {
    private final short bearingAfter;
    private final short bearingBefore;
    private final String instruction;
    private final Point location;
    private final RdManeuverModifier modifier;
    private final RdManeuverType type;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RdManeuver(short s10, short s11, String str, Point point, RdManeuverModifier rdManeuverModifier, RdManeuverType rdManeuverType) {
        this.bearingBefore = s10;
        this.bearingAfter = s11;
        this.instruction = str;
        this.location = point;
        this.modifier = rdManeuverModifier;
        this.type = rdManeuverType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RdManeuver rdManeuver = (RdManeuver) obj;
        return this.bearingBefore == rdManeuver.bearingBefore && this.bearingAfter == rdManeuver.bearingAfter && Objects.equals(this.instruction, rdManeuver.instruction) && Objects.equals(this.location, rdManeuver.location) && Objects.equals(this.modifier, rdManeuver.modifier) && Objects.equals(this.type, rdManeuver.type);
    }

    public short getBearingAfter() {
        return this.bearingAfter;
    }

    public short getBearingBefore() {
        return this.bearingBefore;
    }

    public String getInstruction() {
        return this.instruction;
    }

    public Point getLocation() {
        return this.location;
    }

    public RdManeuverModifier getModifier() {
        return this.modifier;
    }

    public RdManeuverType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(Short.valueOf(this.bearingBefore), Short.valueOf(this.bearingAfter), this.instruction, this.location, this.modifier, this.type);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[bearingBefore: ");
        sb2.append(RecordUtils.fieldToString(Short.valueOf(this.bearingBefore)));
        sb2.append(", bearingAfter: ");
        sb2.append(RecordUtils.fieldToString(Short.valueOf(this.bearingAfter)));
        sb2.append(", instruction: ");
        h.z(sb2, this.instruction, ", location: ");
        b.q(this.location, sb2, ", modifier: ");
        sb2.append(RecordUtils.fieldToString(this.modifier));
        sb2.append(", type: ");
        sb2.append(RecordUtils.fieldToString(this.type));
        sb2.append("]");
        return sb2.toString();
    }

    public RdManeuver(short s10, short s11, String str, Point point, RdManeuverModifier rdManeuverModifier) {
        this.bearingBefore = s10;
        this.bearingAfter = s11;
        this.instruction = str;
        this.location = point;
        this.modifier = rdManeuverModifier;
        this.type = RdManeuverType.TURN;
    }
}
