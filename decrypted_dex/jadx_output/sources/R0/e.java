package R0;

import Z9.C;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import kotlin.jvm.internal.LongCompanionObject;
import o0.C1425W;
import org.bouncycastle.asn1.cmc.BodyPartID;
import r0.AbstractC1560u;
import v0.C1817l;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f5938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f5939b;

    public e(f fVar, E0.m mVar) {
        this.f5939b = fVar;
        Handler m4 = AbstractC1560u.m(this);
        this.f5938a = m4;
        mVar.l(this, m4);
    }

    public final void a(long j) {
        Surface surface;
        f fVar = this.f5939b;
        if (this != fVar.f5944B1 || fVar.f1826R == null) {
            return;
        }
        if (j == LongCompanionObject.MAX_VALUE) {
            fVar.f1824P0 = true;
            return;
        }
        try {
            fVar.w0(j);
            C1425W c1425w = fVar.f5972w1;
            boolean equals = c1425w.equals(C1425W.f18113d);
            C c10 = fVar.f5950Y0;
            if (!equals && !c1425w.equals(fVar.f5973x1)) {
                fVar.f5973x1 = c1425w;
                c10.J(c1425w);
            }
            fVar.f1827R0.f21736e++;
            n nVar = fVar.f5952b1;
            boolean z2 = nVar.f6019d != 3;
            nVar.f6019d = 3;
            nVar.f6025k.getClass();
            nVar.f6021f = AbstractC1560u.J(SystemClock.elapsedRealtime());
            if (z2 && (surface = fVar.f5960j1) != null) {
                Handler handler = (Handler) c10.f9077b;
                if (handler != null) {
                    handler.post(new t(c10, surface, SystemClock.elapsedRealtime()));
                }
                fVar.f5963m1 = true;
            }
            fVar.d0(j);
        } catch (C1817l e10) {
            fVar.f1825Q0 = e10;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i3 = message.arg1;
        int i10 = message.arg2;
        int i11 = AbstractC1560u.f20190a;
        a(((i3 & BodyPartID.bodyIdMax) << 32) | (BodyPartID.bodyIdMax & i10));
        return true;
    }
}
