package ra;

import com.stub.StubApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import oa.AbstractC1469b;
import oa.C1468a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f20537a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f20538b;

    /* renamed from: c, reason: collision with root package name */
    public int f20539c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f20540d;

    /* renamed from: e, reason: collision with root package name */
    public long f20541e;

    /* renamed from: f, reason: collision with root package name */
    public final long f20542f;

    public g(C1468a c1468a) {
        this.f20540d = 0L;
        this.f20541e = 0L;
        this.f20542f = 0L;
        ArrayList arrayList = c1468a.f18393a;
        int size = arrayList.size() / 2;
        this.f20537a = new long[size];
        this.f20538b = new long[size];
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            AbstractC1469b abstractC1469b = (AbstractC1469b) it.next();
            boolean z2 = abstractC1469b instanceof oa.i;
            String string2 = StubApp.getString2(22961);
            if (!z2) {
                throw new IOException(string2);
            }
            long j = ((oa.i) abstractC1469b).f18416a;
            if (!it.hasNext()) {
                break;
            }
            AbstractC1469b abstractC1469b2 = (AbstractC1469b) it.next();
            if (!(abstractC1469b2 instanceof oa.i)) {
                throw new IOException(string2);
            }
            long j3 = ((oa.i) abstractC1469b2).f18416a;
            this.f20537a[i3] = j;
            this.f20538b[i3] = j + j3;
            i3++;
        }
        this.f20541e = this.f20537a[0];
        long[] jArr = this.f20538b;
        this.f20540d = jArr[0];
        this.f20542f = jArr[i3 - 1];
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Long next() {
        long j = this.f20541e;
        if (j >= this.f20542f) {
            throw new NoSuchElementException();
        }
        if (j < this.f20540d) {
            this.f20541e = 1 + j;
            return Long.valueOf(j);
        }
        int i3 = this.f20539c + 1;
        this.f20539c = i3;
        long j3 = this.f20537a[i3];
        this.f20541e = j3;
        this.f20540d = this.f20538b[i3];
        this.f20541e = 1 + j3;
        return Long.valueOf(j3);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20541e < this.f20542f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
