package H5;

import android.content.Context;

/* renamed from: H5.m, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0080m implements K5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2902a;

    /* renamed from: b, reason: collision with root package name */
    public final K5.c f2903b;

    public /* synthetic */ C0080m(K5.c cVar, int i3) {
        this.f2902a = i3;
        this.f2903b = cVar;
    }

    @Override // Pb.a
    public final Object get() {
        switch (this.f2902a) {
            case 0:
                return new C0079l((w5.b) this.f2903b.f3721a);
            default:
                return new c0((Context) this.f2903b.f3721a);
        }
    }
}
