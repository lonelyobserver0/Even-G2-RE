package Dc;

import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class k extends zc.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f1591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1592f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1593g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, r rVar, int i3, int i10) {
        super(str, true);
        this.f1591e = rVar;
        this.f1592f = i3;
        this.f1593g = i10;
    }

    @Override // zc.a
    public final long a() {
        int i3 = this.f1592f;
        int i10 = this.f1593g;
        r rVar = this.f1591e;
        rVar.getClass();
        try {
            rVar.f1615A.p(i3, i10, true);
            return -1L;
        } catch (IOException e10) {
            rVar.d(e10);
            return -1L;
        }
    }
}
