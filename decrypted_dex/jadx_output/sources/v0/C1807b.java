package v0;

import L0.C0120p;
import android.content.Context;
import android.media.AudioManager;
import com.stub.StubApp;

/* renamed from: v0.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C1807b implements L4.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f21699b;

    public /* synthetic */ C1807b(Context context, int i3) {
        this.f21698a = i3;
        this.f21699b = context;
    }

    @Override // L4.k
    public final Object get() {
        P0.h hVar;
        switch (this.f21698a) {
            case 0:
                AudioManager audioManager = (AudioManager) StubApp.getOrigApplicationContext(this.f21699b.getApplicationContext()).getSystemService(StubApp.getString2(643));
                audioManager.getClass();
                return audioManager;
            case 1:
                return new C1816k(this.f21699b);
            case 2:
                return new C0120p(new Y.m(this.f21699b), new T0.m());
            case 3:
                return new O0.q(this.f21699b);
            default:
                Context context = this.f21699b;
                M4.Z z2 = P0.h.f5397n;
                synchronized (P0.h.class) {
                    try {
                        if (P0.h.f5403t == null) {
                            P0.g gVar = new P0.g(context);
                            P0.h.f5403t = new P0.h(gVar.f5392a, gVar.f5393b, gVar.f5394c, gVar.f5395d, gVar.f5396e);
                        }
                        hVar = P0.h.f5403t;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return hVar;
        }
    }
}
