package Ab;

import A3.s;
import W4.n;
import W4.o;
import android.content.Context;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import c5.l;
import c5.r;
import com.stub.StubApp;
import d5.C0805e;
import e5.C0846e;
import i5.C1059c;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugins.firebase.crashlytics.FlutterError;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import transcribe.TranscribeEventOuterClass;
import w5.InterfaceC1865a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f258c;

    public /* synthetic */ b(int i3, Object obj, Object obj2) {
        this.f256a = i3;
        this.f257b = obj;
        this.f258c = obj2;
    }

    private final void a() {
        TranscribeEventOuterClass.TranscribeEvent transcribeEvent = (TranscribeEventOuterClass.TranscribeEvent) this.f258c;
        String string2 = StubApp.getString2(380);
        W2.c cVar = (W2.c) ((W2.b) this.f257b).f8074a.get();
        if (cVar != null) {
            boolean z2 = cVar.f8079e;
            String string22 = StubApp.getString2(381);
            if (z2) {
                R2.c.f(string22, StubApp.getString2(KyberEngine.KyberPolyBytes));
                return;
            }
            try {
                byte[] byteArray = transcribeEvent.toByteArray();
                R2.c.b(string22, string2 + transcribeEvent.getType() + StubApp.getString2("382") + byteArray.length);
                EventChannel.EventSink eventSink = cVar.f8078d;
                if (eventSink != null) {
                    eventSink.success(byteArray);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Exception e10) {
                E1.a.u(StubApp.getString2(383), e10.getMessage(), string22);
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    private final void b() {
        InterfaceC1865a interfaceC1865a;
        o oVar = (o) this.f257b;
        w5.b bVar = (w5.b) this.f258c;
        if (oVar.f8151b != o.f8149d) {
            throw new IllegalStateException(StubApp.getString2(385));
        }
        synchronized (oVar) {
            interfaceC1865a = oVar.f8150a;
            oVar.f8150a = null;
            oVar.f8151b = bVar;
        }
        interfaceC1865a.c(bVar);
    }

    private final void c() {
        n nVar = (n) this.f257b;
        w5.b bVar = (w5.b) this.f258c;
        synchronized (nVar) {
            try {
                if (nVar.f8147b == null) {
                    nVar.f8146a.add(bVar);
                } else {
                    nVar.f8147b.add(bVar.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d() {
        X4.a aVar = (X4.a) this.f257b;
        Process.setThreadPriority(aVar.f8378c);
        StrictMode.ThreadPolicy threadPolicy = aVar.f8379d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        ((Runnable) this.f258c).run();
    }

    private final void e() {
        Callable callable = (Callable) this.f257b;
        X4.h hVar = (X4.h) ((A0.c) this.f258c).f29a;
        try {
            hVar.j(callable.call());
        } catch (Exception e10) {
            hVar.k(e10);
        }
    }

    private final void f() {
        Z8.f navigator = (Z8.f) this.f257b;
        Intrinsics.checkNotNullParameter(navigator, "$navigator");
        Context context = (Context) this.f258c;
        Intrinsics.checkNotNullParameter(context, "$context");
        navigator.e(I4.e.m(context));
    }

    private final void g() {
        ((l) this.f257b).c((String) this.f258c, Boolean.FALSE);
    }

    private final void h() {
        r rVar = (r) this.f257b;
        l lVar = rVar.f10932h;
        V6.b bVar = rVar.f10927c;
        lVar.i(StubApp.getString2(386), Integer.toString(((AtomicInteger) bVar.f7761b).get()));
        rVar.f10932h.i(StubApp.getString2(387), Integer.toString(((AtomicInteger) bVar.f7762c).get()));
        l lVar2 = rVar.f10932h;
        Thread currentThread = Thread.currentThread();
        s sVar = lVar2.f10906o;
        if (sVar != null) {
            lVar2.g(sVar, currentThread, (FlutterError) this.f258c, true);
        } else {
            Log.w(StubApp.getString2(280), StubApp.getString2(388), null);
        }
    }

    private final void i() {
        r rVar = (r) this.f257b;
        String str = (String) this.f258c;
        C1059c c1059c = rVar.f10932h.f10896d;
        c1059c.getClass();
        String a3 = C0846e.a(1024, str);
        synchronized (((AtomicMarkableReference) c1059c.f14848g)) {
            try {
                String str2 = (String) ((AtomicMarkableReference) c1059c.f14848g).getReference();
                if (a3 == null ? str2 == null : a3.equals(str2)) {
                    return;
                }
                ((AtomicMarkableReference) c1059c.f14848g).set(a3, true);
                ((C0805e) c1059c.f14844c).f13423b.a(new B0.o(c1059c, 22));
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x0462 A[Catch: IllegalArgumentException -> 0x02d4, C -> 0x02d7, TryCatch #0 {C -> 0x02d7, blocks: (B:119:0x02b4, B:121:0x02da, B:123:0x02df, B:124:0x02e2, B:126:0x02ee, B:128:0x02fa, B:130:0x0326, B:132:0x0349, B:134:0x0355, B:135:0x0360, B:137:0x035b, B:138:0x0365, B:140:0x0369, B:142:0x036d, B:145:0x0384, B:147:0x038a, B:149:0x039c, B:152:0x03a1, B:155:0x03a9, B:156:0x03b4, B:157:0x03b5, B:159:0x03d5, B:160:0x03d8, B:161:0x03dd, B:162:0x03de, B:165:0x03f0, B:168:0x03fc, B:171:0x0411, B:172:0x041c, B:173:0x041d, B:175:0x0429, B:180:0x0448, B:186:0x0459, B:188:0x0462, B:191:0x0473, B:192:0x047b, B:197:0x0444, B:198:0x042c, B:199:0x048f, B:201:0x0494, B:205:0x04ac, B:207:0x04b2, B:210:0x04bf, B:212:0x04cb, B:214:0x04e6), top: B:110:0x029f }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 2000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ab.b.run():void");
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i3) {
        this.f256a = i3;
        this.f257b = obj;
        this.f258c = obj2;
    }
}
