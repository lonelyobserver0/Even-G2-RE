package oa;

import Kc.z;
import android.util.Log;
import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import qa.C1532c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class p extends C1471d implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public qa.f f18636b;

    /* renamed from: c, reason: collision with root package name */
    public final qa.e f18637c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18638d;

    public p(qa.e eVar) {
        U(j.f18495R1, 0);
        if (eVar == null) {
            try {
                eVar = new qa.e(new R4.b());
            } catch (IOException e10) {
                Log.e(StubApp.getString2(948), StubApp.getString2(22051) + e10.getMessage());
                eVar = null;
            }
        }
        this.f18637c = eVar;
    }

    public final h Z() {
        ArrayList arrayList;
        qa.f fVar = this.f18636b;
        if (fVar != null && fVar.f20121b == null) {
            throw new IOException(StubApp.getString2(22052));
        }
        if (this.f18638d) {
            throw new IllegalStateException(StubApp.getString2(22055));
        }
        qa.e eVar = this.f18637c;
        if (fVar == null) {
            eVar.getClass();
            this.f18636b = new qa.f(eVar);
        }
        InputStream c1532c = new C1532c(this.f18636b);
        AbstractC1469b J10 = J(j.f18532d1);
        if (J10 instanceof j) {
            arrayList = new ArrayList(1);
            arrayList.add(pa.g.f19755b.a((j) J10));
        } else if (J10 instanceof C1468a) {
            C1468a c1468a = (C1468a) J10;
            arrayList = new ArrayList(c1468a.f18393a.size());
            for (int i3 = 0; i3 < c1468a.f18393a.size(); i3++) {
                AbstractC1469b d8 = c1468a.d(i3);
                if (!(d8 instanceof j)) {
                    throw new IOException(StubApp.getString2(22053).concat(d8 == null ? StubApp.getString2(1116) : d8.getClass().getName()));
                }
                arrayList.add(pa.g.f19755b.a((j) d8));
            }
        } else {
            arrayList = new ArrayList();
        }
        int i10 = h.f18409b;
        if (arrayList.isEmpty()) {
            return new h(c1532c, Collections.EMPTY_LIST);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (arrayList.size() > 1 && new HashSet(arrayList).size() != arrayList.size()) {
            throw new IOException(StubApp.getString2(22054));
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (eVar != null) {
                qa.f fVar2 = new qa.f(eVar);
                arrayList2.add(((pa.f) arrayList.get(i11)).b(c1532c, new z(fVar2), this, i11));
                c1532c = new g(fVar2, fVar2);
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                arrayList2.add(((pa.f) arrayList.get(i11)).b(c1532c, byteArrayOutputStream, this, i11));
                c1532c = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            }
        }
        return new h(c1532c, arrayList2);
    }

    public final C1532c a0() {
        qa.f fVar = this.f18636b;
        if (fVar != null && fVar.f20121b == null) {
            throw new IOException(StubApp.getString2(22052));
        }
        if (this.f18638d) {
            throw new IllegalStateException(StubApp.getString2(22055));
        }
        if (fVar == null) {
            qa.e eVar = this.f18637c;
            eVar.getClass();
            this.f18636b = new qa.f(eVar);
        }
        return new C1532c(this.f18636b);
    }

    public final o b0() {
        qa.f fVar = this.f18636b;
        if (fVar != null && fVar.f20121b == null) {
            throw new IOException(StubApp.getString2(22052));
        }
        if (this.f18638d) {
            throw new IllegalStateException(StubApp.getString2(22056));
        }
        F1.h(fVar);
        qa.e eVar = this.f18637c;
        eVar.getClass();
        this.f18636b = new qa.f(eVar);
        z zVar = new z(this.f18636b);
        this.f18638d = true;
        return new o(this, zVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        qa.f fVar = this.f18636b;
        if (fVar != null) {
            fVar.close();
        }
    }
}
