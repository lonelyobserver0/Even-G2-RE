package z0;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import o0.C1412I;
import o0.C1442q;
import r0.AbstractC1560u;

/* renamed from: z0.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1987c implements G0.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f23646a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23647b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23648c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23649d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23650e;

    /* renamed from: f, reason: collision with root package name */
    public final long f23651f;

    /* renamed from: g, reason: collision with root package name */
    public final long f23652g;

    /* renamed from: h, reason: collision with root package name */
    public final long f23653h;

    /* renamed from: i, reason: collision with root package name */
    public final Z4.b f23654i;
    public final C1442q j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f23655k;

    /* renamed from: l, reason: collision with root package name */
    public final i f23656l;

    /* renamed from: m, reason: collision with root package name */
    public final List f23657m;

    public C1987c(long j, long j3, long j10, boolean z2, long j11, long j12, long j13, long j14, i iVar, Z4.b bVar, C1442q c1442q, Uri uri, ArrayList arrayList) {
        this.f23646a = j;
        this.f23647b = j3;
        this.f23648c = j10;
        this.f23649d = z2;
        this.f23650e = j11;
        this.f23651f = j12;
        this.f23652g = j13;
        this.f23653h = j14;
        this.f23656l = iVar;
        this.f23654i = bVar;
        this.f23655k = uri;
        this.j = c1442q;
        this.f23657m = arrayList;
    }

    @Override // G0.a
    public final Object a(List list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new C1412I());
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= this.f23657m.size()) {
                break;
            }
            if (((C1412I) linkedList.peek()).f18039a != i3) {
                long c10 = c(i3);
                if (c10 != -9223372036854775807L) {
                    j3 += c10;
                }
            } else {
                h b2 = b(i3);
                List list2 = b2.f23680c;
                C1412I c1412i = (C1412I) linkedList.poll();
                int i10 = c1412i.f18039a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i11 = c1412i.f18040b;
                    C1985a c1985a = (C1985a) list2.get(i11);
                    List list3 = c1985a.f23638c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(c1412i.f18041c));
                        c1412i = (C1412I) linkedList.poll();
                        if (c1412i.f18039a != i10) {
                            break;
                        }
                    } while (c1412i.f18040b == i11);
                    j = j3;
                    arrayList2.add(new C1985a(c1985a.f23636a, c1985a.f23637b, arrayList3, c1985a.f23639d, c1985a.f23640e, c1985a.f23641f));
                    if (c1412i.f18039a != i10) {
                        break;
                    }
                    j3 = j;
                }
                linkedList.addFirst(c1412i);
                arrayList.add(new h(b2.f23678a, b2.f23679b - j, arrayList2, b2.f23681d));
                j3 = j;
            }
            i3++;
        }
        long j10 = j3;
        long j11 = this.f23647b;
        return new C1987c(this.f23646a, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, this.f23648c, this.f23649d, this.f23650e, this.f23651f, this.f23652g, this.f23653h, this.f23656l, this.f23654i, this.j, this.f23655k, arrayList);
    }

    public final h b(int i3) {
        return (h) this.f23657m.get(i3);
    }

    public final long c(int i3) {
        long j;
        long j3;
        List list = this.f23657m;
        if (i3 == list.size() - 1) {
            j = this.f23647b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j3 = ((h) list.get(i3)).f23679b;
        } else {
            j = ((h) list.get(i3 + 1)).f23679b;
            j3 = ((h) list.get(i3)).f23679b;
        }
        return j - j3;
    }

    public final long d(int i3) {
        return AbstractC1560u.J(c(i3));
    }
}
