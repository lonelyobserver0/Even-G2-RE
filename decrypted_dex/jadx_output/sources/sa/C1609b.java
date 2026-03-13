package sa;

import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import da.J;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import oa.AbstractC1469b;
import oa.C1471d;
import oa.C1472e;
import oa.j;
import oa.l;
import qa.C1531b;

/* renamed from: sa.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1609b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final C1472e f20823a;

    /* renamed from: b, reason: collision with root package name */
    public C1610c f20824b;

    /* renamed from: c, reason: collision with root package name */
    public final C1531b f20825c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f20826d;

    /* renamed from: e, reason: collision with root package name */
    public final C1608a f20827e;

    static {
        Aa.d dVar = Aa.d.f251b;
        dVar.getClass();
        Aa.a aVar = dVar.f252a;
        float[] fArr = aVar.f247a;
        Aa.b bVar = aVar.f248b;
        if (bVar == null) {
            fArr.clone();
        } else {
            Arrays.copyOf(fArr, bVar.b());
        }
        try {
            l.d(StubApp.getString2("824"));
            l.d(StubApp.getString2("878"));
        } catch (IOException unused) {
        }
    }

    public C1609b(C1472e c1472e, C1531b c1531b) {
        new HashSet();
        this.f20826d = new HashSet();
        this.f20827e = new C1608a(0);
        this.f20823a = c1472e;
        this.f20825c = c1531b;
    }

    public static C1609b d(File file) {
        R4.b bVar = new R4.b();
        C1531b c1531b = new C1531b(file);
        try {
            qa.e eVar = new qa.e(bVar);
            try {
                ra.e eVar2 = new ra.e(c1531b, eVar);
                eVar2.I();
                return eVar2.C();
            } catch (IOException e10) {
                F1.h(eVar);
                throw e10;
            }
        } catch (IOException e11) {
            F1.h(c1531b);
            throw e11;
        }
    }

    public final C1610c a() {
        if (this.f20824b == null) {
            AbstractC1469b J10 = this.f20823a.f18401d.J(j.f18503T2);
            if (J10 instanceof C1471d) {
                this.f20824b = new C1610c((C1471d) J10, this);
            } else {
                this.f20824b = new C1610c(this);
            }
        }
        return this.f20824b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1472e c1472e = this.f20823a;
        if (c1472e.f18403f) {
            return;
        }
        IOException g10 = F1.g(c1472e, StubApp.getString2(23152), null);
        C1531b c1531b = this.f20825c;
        if (c1531b != null) {
            g10 = F1.g(c1531b, StubApp.getString2(23153), g10);
        }
        Iterator it = this.f20826d.iterator();
        while (it.hasNext()) {
            g10 = F1.g((J) it.next(), StubApp.getString2(23154), g10);
        }
        if (g10 != null) {
            throw g10;
        }
    }
}
