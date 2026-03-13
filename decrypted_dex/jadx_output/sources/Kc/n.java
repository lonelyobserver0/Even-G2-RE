package Kc;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3830a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3831b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f3832c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f3833d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f3834e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f3835f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f3836g;

    public n(boolean z2, boolean z10, Long l9, Long l10, Long l11, Long l12) {
        Map extras = MapsKt.emptyMap();
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f3830a = z2;
        this.f3831b = z10;
        this.f3832c = l9;
        this.f3833d = l10;
        this.f3834e = l11;
        this.f3835f = l12;
        this.f3836g = MapsKt.toMap(extras);
    }

    public final String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList();
        if (this.f3830a) {
            arrayList.add(StubApp.getString2(25366));
        }
        if (this.f3831b) {
            arrayList.add(StubApp.getString2(25367));
        }
        Long l9 = this.f3832c;
        if (l9 != null) {
            arrayList.add(StubApp.getString2(25368) + l9);
        }
        Long l10 = this.f3833d;
        if (l10 != null) {
            arrayList.add(StubApp.getString2(25369) + l10);
        }
        Long l11 = this.f3834e;
        if (l11 != null) {
            arrayList.add(StubApp.getString2(25370) + l11);
        }
        Long l12 = this.f3835f;
        if (l12 != null) {
            arrayList.add(StubApp.getString2(25371) + l12);
        }
        Map map = this.f3836g;
        if (!map.isEmpty()) {
            arrayList.add(StubApp.getString2(25372) + map);
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, StubApp.getString2(81), StubApp.getString2(25373), StubApp.getString2(74), 0, null, null, 56, null);
        return joinToString$default;
    }
}
