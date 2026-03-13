package Dc;

import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class q extends zc.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f1611e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1612f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f1613g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, r rVar, int i3, long j) {
        super(str, true);
        this.f1611e = rVar;
        this.f1612f = i3;
        this.f1613g = j;
    }

    @Override // zc.a
    public final long a() {
        r rVar = this.f1611e;
        try {
            rVar.f1615A.A(this.f1612f, this.f1613g);
            return -1L;
        } catch (IOException e10) {
            rVar.d(e10);
            return -1L;
        }
    }
}
