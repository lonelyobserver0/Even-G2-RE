package com.mapbox.common;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ResourceLoadOptions implements Serializable {
    private final Value extraOptions;
    private final ResourceLoadFlags flags;
    private final NetworkRestriction networkRestriction;
    private final String tag;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ResourceLoadOptions(String str, ResourceLoadFlags resourceLoadFlags, NetworkRestriction networkRestriction, Value value) {
        this.tag = str;
        this.flags = resourceLoadFlags;
        this.networkRestriction = networkRestriction;
        this.extraOptions = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceLoadOptions resourceLoadOptions = (ResourceLoadOptions) obj;
        return Objects.equals(this.tag, resourceLoadOptions.tag) && Objects.equals(this.flags, resourceLoadOptions.flags) && Objects.equals(this.networkRestriction, resourceLoadOptions.networkRestriction) && Objects.equals(this.extraOptions, resourceLoadOptions.extraOptions);
    }

    public Value getExtraOptions() {
        return this.extraOptions;
    }

    public ResourceLoadFlags getFlags() {
        return this.flags;
    }

    public NetworkRestriction getNetworkRestriction() {
        return this.networkRestriction;
    }

    public String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return Objects.hash(this.tag, this.flags, this.networkRestriction, this.extraOptions);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[tag: ");
        h.z(sb2, this.tag, ", flags: ");
        sb2.append(RecordUtils.fieldToString(this.flags));
        sb2.append(", networkRestriction: ");
        sb2.append(RecordUtils.fieldToString(this.networkRestriction));
        sb2.append(", extraOptions: ");
        sb2.append(RecordUtils.fieldToString(this.extraOptions));
        sb2.append("]");
        return sb2.toString();
    }

    public ResourceLoadOptions(String str, Value value) {
        this.tag = str;
        this.extraOptions = value;
        this.flags = ResourceLoadFlags.NONE;
        this.networkRestriction = NetworkRestriction.NONE;
    }
}
