package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AdasisConfigPathOptions implements Serializable {
    private final Profilelong profilelong;
    private final Profileshort profileshort;
    private final Segment segment;
    private final Stub stub;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AdasisConfigPathOptions(Stub stub, Segment segment, Profileshort profileshort, Profilelong profilelong) {
        this.stub = stub;
        this.segment = segment;
        this.profileshort = profileshort;
        this.profilelong = profilelong;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdasisConfigPathOptions adasisConfigPathOptions = (AdasisConfigPathOptions) obj;
        return Objects.equals(this.stub, adasisConfigPathOptions.stub) && Objects.equals(this.segment, adasisConfigPathOptions.segment) && Objects.equals(this.profileshort, adasisConfigPathOptions.profileshort) && Objects.equals(this.profilelong, adasisConfigPathOptions.profilelong);
    }

    public Profilelong getProfilelong() {
        return this.profilelong;
    }

    public Profileshort getProfileshort() {
        return this.profileshort;
    }

    public Segment getSegment() {
        return this.segment;
    }

    public Stub getStub() {
        return this.stub;
    }

    public int hashCode() {
        return Objects.hash(this.stub, this.segment, this.profileshort, this.profilelong);
    }

    public String toString() {
        return "[stub: " + RecordUtils.fieldToString(this.stub) + ", segment: " + RecordUtils.fieldToString(this.segment) + ", profileshort: " + RecordUtils.fieldToString(this.profileshort) + ", profilelong: " + RecordUtils.fieldToString(this.profilelong) + "]";
    }
}
