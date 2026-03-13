package n2;

import android.content.Context;
import com.stub.StubApp;
import i2.o;
import java.util.ArrayList;
import java.util.Collection;
import o2.AbstractC1455b;
import o2.C1454a;
import o2.C1456c;
import o2.d;
import p2.C1486a;
import p2.C1487b;
import p2.f;
import p2.g;
import p2.h;
import sa.C1608a;

/* renamed from: n2.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1382c {

    /* renamed from: d, reason: collision with root package name */
    public static final String f17799d = o.g(StubApp.getString2(21388));

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1381b f17800a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1455b[] f17801b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17802c;

    public C1382c(Context context, C1608a c1608a, InterfaceC1381b interfaceC1381b) {
        Context origApplicationContext = StubApp.getOrigApplicationContext(context.getApplicationContext());
        this.f17800a = interfaceC1381b;
        this.f17801b = new AbstractC1455b[]{new C1454a((C1486a) h.d(origApplicationContext, c1608a).f19671a, 0), new C1454a((C1487b) h.d(origApplicationContext, c1608a).f19672b, 1), new C1454a((g) h.d(origApplicationContext, c1608a).f19674d, 4), new C1454a((f) h.d(origApplicationContext, c1608a).f19673c, 2), new C1454a((f) h.d(origApplicationContext, c1608a).f19673c, 3), new d((f) h.d(origApplicationContext, c1608a).f19673c), new C1456c((f) h.d(origApplicationContext, c1608a).f19673c)};
        this.f17802c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.f17802c) {
            try {
                for (AbstractC1455b abstractC1455b : this.f17801b) {
                    Object obj = abstractC1455b.f18359b;
                    if (obj != null && abstractC1455b.b(obj) && abstractC1455b.f18358a.contains(str)) {
                        o.e().b(f17799d, StubApp.getString2("18963") + str + StubApp.getString2("21389") + abstractC1455b.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Collection collection) {
        synchronized (this.f17802c) {
            try {
                for (AbstractC1455b abstractC1455b : this.f17801b) {
                    if (abstractC1455b.f18361d != null) {
                        abstractC1455b.f18361d = null;
                        abstractC1455b.d(null, abstractC1455b.f18359b);
                    }
                }
                for (AbstractC1455b abstractC1455b2 : this.f17801b) {
                    abstractC1455b2.c(collection);
                }
                for (AbstractC1455b abstractC1455b3 : this.f17801b) {
                    if (abstractC1455b3.f18361d != this) {
                        abstractC1455b3.f18361d = this;
                        abstractC1455b3.d(this, abstractC1455b3.f18359b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f17802c) {
            try {
                for (AbstractC1455b abstractC1455b : this.f17801b) {
                    ArrayList arrayList = abstractC1455b.f18358a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        abstractC1455b.f18360c.b(abstractC1455b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
