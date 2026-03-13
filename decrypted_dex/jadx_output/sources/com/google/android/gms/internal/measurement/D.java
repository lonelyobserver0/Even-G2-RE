package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final D5.B f11242a;

    /* renamed from: b, reason: collision with root package name */
    public p2.h f11243b;

    /* renamed from: c, reason: collision with root package name */
    public final a5.c f11244c;

    /* renamed from: d, reason: collision with root package name */
    public final C0680t f11245d;

    public D() {
        D5.B b2 = new D5.B(7);
        this.f11242a = b2;
        this.f11243b = ((p2.h) b2.f1341b).m();
        this.f11244c = new a5.c(2);
        this.f11245d = new C0680t(3);
        final int i3 = 1;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ D f11440b;

            {
                this.f11440b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i3) {
                    case 0:
                        return new N1(this.f11440b.f11244c);
                    default:
                        return new N1(this.f11440b.f11245d);
                }
            }
        };
        C0708y2 c0708y2 = (C0708y2) b2.f1343d;
        ((HashMap) c0708y2.f11771a).put(StubApp.getString2(11626), callable);
        final int i10 = 0;
        ((HashMap) c0708y2.f11771a).put(StubApp.getString2(11627), new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ D f11440b;

            {
                this.f11440b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i10) {
                    case 0:
                        return new N1(this.f11440b.f11244c);
                    default:
                        return new N1(this.f11440b.f11245d);
                }
            }
        });
    }

    public final boolean a(C0591b c0591b) {
        a5.c cVar = this.f11244c;
        try {
            cVar.f9282b = c0591b;
            cVar.f9283c = c0591b.clone();
            ((ArrayList) cVar.f9284d).clear();
            ((p2.h) this.f11242a.f1342c).o(StubApp.getString2("1302"), new C0616g(Double.valueOf(0.0d)));
            this.f11245d.d(this.f11243b.m(), cVar);
            if (((C0591b) cVar.f9283c).equals((C0591b) cVar.f9282b)) {
                return !((ArrayList) cVar.f9284d).isEmpty();
            }
            return true;
        } catch (Throwable th) {
            throw new P(th);
        }
    }

    public final void b(C0712z1 c0712z1) {
        AbstractC0621h abstractC0621h;
        try {
            D5.B b2 = this.f11242a;
            this.f11243b = ((p2.h) b2.f1341b).m();
            if (b2.N(this.f11243b, (A1[]) c0712z1.p().toArray(new A1[0])) instanceof C0611f) {
                throw new IllegalStateException(StubApp.getString2("11631"));
            }
            for (C0707y1 c0707y1 : c0712z1.q().p()) {
                List q10 = c0707y1.q();
                String p8 = c0707y1.p();
                Iterator it = q10.iterator();
                while (it.hasNext()) {
                    InterfaceC0651n N3 = b2.N(this.f11243b, (A1) it.next());
                    if (!(N3 instanceof C0636k)) {
                        throw new IllegalArgumentException(StubApp.getString2("11630"));
                    }
                    String string2 = StubApp.getString2("11628");
                    p2.h hVar = this.f11243b;
                    String string22 = StubApp.getString2("11629");
                    if (hVar.n(p8)) {
                        InterfaceC0651n q11 = hVar.q(p8);
                        if (!(q11 instanceof AbstractC0621h)) {
                            throw new IllegalStateException(string22.concat(String.valueOf(p8)));
                        }
                        abstractC0621h = (AbstractC0621h) q11;
                    } else {
                        abstractC0621h = null;
                    }
                    if (abstractC0621h == null) {
                        throw new IllegalStateException(string2.concat(String.valueOf(p8)));
                    }
                    abstractC0621h.e(this.f11243b, Collections.singletonList(N3));
                }
            }
        } catch (Throwable th) {
            throw new P(th);
        }
    }
}
