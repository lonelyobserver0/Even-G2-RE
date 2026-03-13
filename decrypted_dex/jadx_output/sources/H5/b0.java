package H5;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b0 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2837a;

    /* renamed from: b, reason: collision with root package name */
    public long f2838b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2839c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Looper looper) {
        super(looper);
        Intrinsics.checkNotNullParameter(looper, "looper");
        this.f2839c = new ArrayList();
    }

    public final void a() {
        Log.d(StubApp.getString2(2604), StubApp.getString2(2605));
        S s10 = (S) ((C0076i) ((InterfaceC0086t) android.support.v4.media.session.b.q().c(InterfaceC0086t.class))).f2890k.get();
        O sessionDetails = ((W) ((C0076i) ((InterfaceC0086t) android.support.v4.media.session.b.q().c(InterfaceC0086t.class))).f2892m.get()).f2817e;
        if (sessionDetails == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentSession");
            sessionDetails = null;
        }
        V v2 = (V) s10;
        v2.getClass();
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        Qb.L.j(Qb.J.a(v2.f2812e), null, new T(v2, sessionDetails, null), 3);
        Iterator it = new ArrayList(this.f2839c).iterator();
        while (it.hasNext()) {
            Messenger it2 = (Messenger) it.next();
            Intrinsics.checkNotNullExpressionValue(it2, "it");
            b(it2);
        }
    }

    public final void b(Messenger messenger) {
        String string2 = StubApp.getString2(2604);
        try {
            O o5 = null;
            if (this.f2837a) {
                O o10 = ((W) ((C0076i) ((InterfaceC0086t) android.support.v4.media.session.b.q().c(InterfaceC0086t.class))).f2892m.get()).f2817e;
                if (o10 != null) {
                    o5 = o10;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("currentSession");
                }
                d(messenger, o5.f2786a);
                return;
            }
            C0090x c0090x = (C0090x) ((N) ((C0076i) ((InterfaceC0086t) android.support.v4.media.session.b.q().c(InterfaceC0086t.class))).j.get()).f2784c.get();
            String str = c0090x != null ? c0090x.f2923a : null;
            Log.d(string2, StubApp.getString2("2606"));
            if (str != null) {
                d(messenger, str);
            }
        } catch (IllegalStateException e10) {
            Log.w(string2, StubApp.getString2(2607), e10);
        }
    }

    public final void c() {
        String string2 = StubApp.getString2(2604);
        try {
            W w10 = (W) ((C0076i) ((InterfaceC0086t) android.support.v4.media.session.b.q().c(InterfaceC0086t.class))).f2892m.get();
            int i3 = w10.f2816d + 1;
            w10.f2816d = i3;
            String a3 = i3 == 0 ? w10.f2815c : w10.a();
            int i10 = w10.f2816d;
            ((f0) w10.f2813a).getClass();
            w10.f2817e = new O(System.currentTimeMillis() * 1000, a3, w10.f2815c, i10);
            Log.d(string2, StubApp.getString2("2608"));
            a();
            N n10 = (N) ((C0076i) ((InterfaceC0086t) android.support.v4.media.session.b.q().c(InterfaceC0086t.class))).j.get();
            O o5 = ((W) ((C0076i) ((InterfaceC0086t) android.support.v4.media.session.b.q().c(InterfaceC0086t.class))).f2892m.get()).f2817e;
            if (o5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentSession");
                o5 = null;
            }
            String sessionId = o5.f2786a;
            n10.getClass();
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            Qb.L.j(Qb.J.a(n10.f2782a), null, new M(n10, sessionId, null), 3);
        } catch (IllegalStateException e10) {
            Log.w(string2, StubApp.getString2(2609), e10);
        }
    }

    public final void d(Messenger messenger, String str) {
        String string2 = StubApp.getString2(2604);
        try {
            Bundle bundle = new Bundle();
            bundle.putString(StubApp.getString2("1593"), str);
            Message obtain = Message.obtain(null, 3, 0, 0);
            obtain.setData(bundle);
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
            Log.d(string2, StubApp.getString2(2611) + messenger);
            this.f2839c.remove(messenger);
        } catch (Exception e10) {
            Log.w(string2, StubApp.getString2(2610) + messenger + '.', e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x013b, code lost:
    
        if (kotlin.time.Duration.m1390isFiniteimpl(r4) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0154, code lost:
    
        if (kotlin.time.Duration.m1390isFiniteimpl(r4) != false) goto L36;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r8) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.b0.handleMessage(android.os.Message):void");
    }
}
