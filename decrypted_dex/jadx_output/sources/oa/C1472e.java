package oa;

import android.util.Log;
import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: oa.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1472e extends AbstractC1469b implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public C1471d f18401d;

    /* renamed from: g, reason: collision with root package name */
    public final qa.e f18404g;

    /* renamed from: h, reason: collision with root package name */
    public long f18405h;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f18398a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18399b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18400c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18402e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18403f = false;

    public C1472e(qa.e eVar) {
        this.f18404g = eVar;
    }

    public final m a(n nVar) {
        HashMap hashMap = this.f18398a;
        m mVar = nVar != null ? (m) hashMap.get(nVar) : null;
        if (mVar == null) {
            mVar = new m(null);
            if (nVar != null) {
                mVar.f18630b = nVar.f18633a;
                mVar.f18631c = nVar.f18634b;
                hashMap.put(nVar, mVar);
            }
        }
        return mVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        String string2;
        if (this.f18403f) {
            return;
        }
        Iterator it = new ArrayList(this.f18398a.values()).iterator();
        IOException iOException = null;
        while (true) {
            boolean hasNext = it.hasNext();
            string2 = StubApp.getString2(21627);
            if (!hasNext) {
                break;
            }
            AbstractC1469b abstractC1469b = ((m) it.next()).f18629a;
            if (abstractC1469b instanceof p) {
                iOException = F1.g((p) abstractC1469b, string2, iOException);
            }
        }
        Iterator it2 = this.f18400c.iterator();
        while (it2.hasNext()) {
            iOException = F1.g((p) it2.next(), string2, iOException);
        }
        qa.e eVar = this.f18404g;
        if (eVar != null) {
            iOException = F1.g(eVar, StubApp.getString2(21628), iOException);
        }
        this.f18403f = true;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void finalize() {
        if (this.f18403f) {
            return;
        }
        if (this.f18402e) {
            Log.w(StubApp.getString2(948), StubApp.getString2(21629));
        }
        close();
    }
}
