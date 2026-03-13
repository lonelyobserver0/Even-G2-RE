package S9;

import Kc.C0101h;
import Kc.C0104k;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class f implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final transient i f6623a;

    /* renamed from: b, reason: collision with root package name */
    public final transient C0104k f6624b;

    /* renamed from: c, reason: collision with root package name */
    public transient int f6625c;

    public f(i adapter, C0104k unknownFields) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.f6623a = adapter;
        this.f6624b = unknownFields;
    }

    public final byte[] a() {
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type M of com.squareup.wire.Message");
        i iVar = this.f6623a;
        iVar.getClass();
        C0101h sink = new C0101h();
        Intrinsics.checkNotNullParameter(sink, "sink");
        r rVar = new r();
        iVar.d(rVar, this);
        Intrinsics.checkNotNullParameter(sink, "sink");
        rVar.a();
        sink.t(rVar.f6658a);
        return sink.A(sink.f3819b);
    }

    public final C0104k b() {
        C0104k c0104k = this.f6624b;
        return c0104k == null ? C0104k.f3820d : c0104k;
    }
}
