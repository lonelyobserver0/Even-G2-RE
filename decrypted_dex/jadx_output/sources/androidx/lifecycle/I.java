package androidx.lifecycle;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final B3.s f9876a;

    public I(Map initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        new LinkedHashMap();
        this.f9876a = new B3.s(initialState);
    }

    public I() {
        new LinkedHashMap();
        this.f9876a = new B3.s(MapsKt.emptyMap());
    }
}
