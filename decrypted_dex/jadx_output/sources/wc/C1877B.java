package wc;

import Kc.InterfaceC0102i;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wc.B, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1877B extends AbstractC1879D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f22309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f22311c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22312d;

    public C1877B(v vVar, byte[] bArr, int i3, int i10) {
        this.f22309a = vVar;
        this.f22310b = i3;
        this.f22311c = bArr;
        this.f22312d = i10;
    }

    @Override // wc.AbstractC1879D
    public final long contentLength() {
        return this.f22310b;
    }

    @Override // wc.AbstractC1879D
    public final v contentType() {
        return this.f22309a;
    }

    @Override // wc.AbstractC1879D
    public final void writeTo(InterfaceC0102i sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Kc.A a3 = (Kc.A) sink;
        String string2 = StubApp.getString2(376);
        byte[] bArr = this.f22311c;
        Intrinsics.checkNotNullParameter(bArr, string2);
        if (a3.f3772c) {
            throw new IllegalStateException(StubApp.getString2(1551));
        }
        a3.f3771b.P(bArr, this.f22312d, this.f22310b);
        a3.a();
    }
}
