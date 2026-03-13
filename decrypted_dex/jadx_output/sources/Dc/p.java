package Dc;

import Kc.C0104k;
import com.stub.StubApp;
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class p extends zc.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f1609f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1610g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(String str, Object obj, long j, int i3) {
        super(str, true);
        this.f1608e = i3;
        this.f1610g = obj;
        this.f1609f = j;
    }

    @Override // zc.a
    public final long a() {
        r rVar;
        boolean z2;
        switch (this.f1608e) {
            case 0:
                synchronized (((r) this.f1610g)) {
                    rVar = (r) this.f1610g;
                    long j = rVar.f1629n;
                    long j3 = rVar.f1628m;
                    if (j < j3) {
                        z2 = true;
                    } else {
                        rVar.f1628m = j3 + 1;
                        z2 = false;
                    }
                }
                if (z2) {
                    rVar.d(null);
                    return -1L;
                }
                try {
                    rVar.f1615A.p(1, 0, false);
                } catch (IOException e10) {
                    rVar.d(e10);
                }
                return this.f1609f;
            default:
                Jc.f fVar = (Jc.f) this.f1610g;
                synchronized (fVar) {
                    try {
                        if (!fVar.f3504t) {
                            Jc.i iVar = fVar.j;
                            if (iVar != null) {
                                int i3 = fVar.f3506v ? fVar.f3505u : -1;
                                fVar.f3505u++;
                                fVar.f3506v = true;
                                Unit unit = Unit.INSTANCE;
                                if (i3 != -1) {
                                    StringBuilder sb2 = new StringBuilder(StubApp.getString2(25160));
                                    sb2.append(fVar.f3488c);
                                    sb2.append(StubApp.getString2(25161));
                                    fVar.c(new SocketTimeoutException(AbstractC1482f.f(i3 - 1, StubApp.getString2(25162), sb2)), null);
                                } else {
                                    try {
                                        C0104k payload = C0104k.f3820d;
                                        Intrinsics.checkNotNullParameter(payload, "payload");
                                        iVar.a(9, payload);
                                    } catch (IOException e11) {
                                        fVar.c(e11, null);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return this.f1609f;
        }
    }
}
