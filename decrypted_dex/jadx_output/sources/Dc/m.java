package Dc;

import Kc.C0101h;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class m extends zc.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f1596e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1597f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0101h f1598g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1599h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, r rVar, int i3, C0101h c0101h, int i10, boolean z2) {
        super(str, true);
        this.f1596e = rVar;
        this.f1597f = i3;
        this.f1598g = c0101h;
        this.f1599h = i10;
    }

    @Override // zc.a
    public final long a() {
        try {
            D d8 = this.f1596e.f1627l;
            C0101h source = this.f1598g;
            int i3 = this.f1599h;
            d8.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            source.skip(i3);
            this.f1596e.f1615A.v(this.f1597f, EnumC0053b.f1554g);
            synchronized (this.f1596e) {
                this.f1596e.f1617C.remove(Integer.valueOf(this.f1597f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
