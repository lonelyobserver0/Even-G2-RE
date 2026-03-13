package Kc;

import com.stub.StubApp;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3776a;

    /* renamed from: b, reason: collision with root package name */
    public int f3777b;

    /* renamed from: c, reason: collision with root package name */
    public int f3778c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3779d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3780e;

    /* renamed from: f, reason: collision with root package name */
    public C f3781f;

    /* renamed from: g, reason: collision with root package name */
    public C f3782g;

    public C() {
        this.f3776a = new byte[8192];
        this.f3780e = true;
        this.f3779d = false;
    }

    public final C a() {
        C c10 = this.f3781f;
        if (c10 == this) {
            c10 = null;
        }
        C c11 = this.f3782g;
        Intrinsics.checkNotNull(c11);
        c11.f3781f = this.f3781f;
        C c12 = this.f3781f;
        Intrinsics.checkNotNull(c12);
        c12.f3782g = this.f3782g;
        this.f3781f = null;
        this.f3782g = null;
        return c10;
    }

    public final void b(C segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f3782g = this;
        segment.f3781f = this.f3781f;
        C c10 = this.f3781f;
        Intrinsics.checkNotNull(c10);
        c10.f3782g = segment;
        this.f3781f = segment;
    }

    public final C c() {
        this.f3779d = true;
        return new C(this.f3776a, this.f3777b, this.f3778c, true, false);
    }

    public final void d(C sink, int i3) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.f3780e) {
            throw new IllegalStateException(StubApp.getString2(25330));
        }
        int i10 = sink.f3778c;
        int i11 = i10 + i3;
        byte[] bArr = sink.f3776a;
        if (i11 > 8192) {
            if (sink.f3779d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f3777b;
            if (i11 - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr, 0, i12, i10, 2, (Object) null);
            sink.f3778c -= sink.f3777b;
            sink.f3777b = 0;
        }
        int i13 = sink.f3778c;
        int i14 = this.f3777b;
        ArraysKt.copyInto(this.f3776a, bArr, i13, i14, i14 + i3);
        sink.f3778c += i3;
        this.f3777b += i3;
    }

    public C(byte[] data, int i3, int i10, boolean z2, boolean z10) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f3776a = data;
        this.f3777b = i3;
        this.f3778c = i10;
        this.f3779d = z2;
        this.f3780e = z10;
    }
}
