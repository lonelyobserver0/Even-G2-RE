package com.mapbox.maps.viewannotation;

import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;", "", "mode", "", "(Ljava/lang/String;)V", "equals", "", "other", "hashCode", "", "toString", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ViewAnnotationUpdateMode {

    @JvmField
    public static final ViewAnnotationUpdateMode MAP_FIXED_DELAY = new ViewAnnotationUpdateMode(StubApp.getString2(14608));

    @JvmField
    public static final ViewAnnotationUpdateMode MAP_SYNCHRONIZED = new ViewAnnotationUpdateMode(StubApp.getString2(14609));
    private final String mode;

    private ViewAnnotationUpdateMode(String str) {
        this.mode = str;
    }

    public boolean equals(Object other) {
        return (other instanceof ViewAnnotationUpdateMode) && Intrinsics.areEqual(this.mode, ((ViewAnnotationUpdateMode) other).mode);
    }

    public int hashCode() {
        return this.mode.hashCode();
    }

    /* renamed from: toString, reason: from getter */
    public String getMode() {
        return this.mode;
    }
}
