package r1;

import a0.C0379a;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.math.Primes;
import q0.C1504b;
import r0.AbstractC1550k;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c extends h {

    /* renamed from: i, reason: collision with root package name */
    public final int f20225i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f20226k;

    /* renamed from: o, reason: collision with root package name */
    public List f20230o;

    /* renamed from: p, reason: collision with root package name */
    public List f20231p;

    /* renamed from: q, reason: collision with root package name */
    public int f20232q;

    /* renamed from: r, reason: collision with root package name */
    public int f20233r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f20234s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f20235t;

    /* renamed from: u, reason: collision with root package name */
    public byte f20236u;

    /* renamed from: v, reason: collision with root package name */
    public byte f20237v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20239x;

    /* renamed from: y, reason: collision with root package name */
    public long f20240y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f20223z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f20216A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f20217B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f20218C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f20219D = {174, 176, 189, 191, 8482, 162, 163, 9834, BERTags.FLAGS, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f20220E = {193, 201, Primes.SMALL_FACTOR_LIMIT, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f20221F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: G, reason: collision with root package name */
    public static final boolean[] f20222G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: h, reason: collision with root package name */
    public final C1553n f20224h = new C1553n();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f20228m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public C1562b f20229n = new C1562b(0, 4);

    /* renamed from: w, reason: collision with root package name */
    public int f20238w = 0;

    /* renamed from: l, reason: collision with root package name */
    public final long f20227l = 16000000;

    public c(String str, int i3) {
        this.f20225i = StubApp.getString2(3654).equals(str) ? 2 : 3;
        if (i3 == 1) {
            this.f20226k = 0;
            this.j = 0;
        } else if (i3 == 2) {
            this.f20226k = 1;
            this.j = 0;
        } else if (i3 == 3) {
            this.f20226k = 0;
            this.j = 1;
        } else if (i3 != 4) {
            AbstractC1550k.w(StubApp.getString2(22656), StubApp.getString2(22657));
            this.f20226k = 0;
            this.j = 0;
        } else {
            this.f20226k = 1;
            this.j = 1;
        }
        l(0);
        k();
        this.f20239x = true;
        this.f20240y = -9223372036854775807L;
    }

    @Override // r1.h
    public final C0379a f() {
        List list = this.f20230o;
        this.f20231p = list;
        list.getClass();
        return new C0379a(list, 23);
    }

    @Override // r1.h, u0.c
    public final void flush() {
        super.flush();
        this.f20230o = null;
        this.f20231p = null;
        l(0);
        this.f20233r = 4;
        this.f20229n.f20215h = 4;
        k();
        this.f20234s = false;
        this.f20235t = false;
        this.f20236u = (byte) 0;
        this.f20237v = (byte) 0;
        this.f20238w = 0;
        this.f20239x = true;
        this.f20240y = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[SYNTHETIC] */
    @Override // r1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(r1.g r15) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.c.g(r1.g):void");
    }

    @Override // r1.h, u0.c
    /* renamed from: h */
    public final q1.c d() {
        q1.c cVar;
        q1.c d8 = super.d();
        if (d8 != null) {
            return d8;
        }
        long j = this.f20227l;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j3 = this.f20240y;
        if (j3 == -9223372036854775807L || this.f20288e - j3 < j || (cVar = (q1.c) this.f20285b.pollFirst()) == null) {
            return null;
        }
        this.f20230o = Collections.EMPTY_LIST;
        this.f20240y = -9223372036854775807L;
        C0379a f10 = f();
        long j10 = this.f20288e;
        cVar.f21400c = j10;
        cVar.f19886e = f10;
        cVar.f19887f = j10;
        return cVar;
    }

    @Override // r1.h
    public final boolean i() {
        return this.f20230o != this.f20231p;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.f20228m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i3 = 2;
        for (int i10 = 0; i10 < size; i10++) {
            C1504b c10 = ((C1562b) arrayList.get(i10)).c(Integer.MIN_VALUE);
            arrayList2.add(c10);
            if (c10 != null) {
                i3 = Math.min(i3, c10.f19852i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            C1504b c1504b = (C1504b) arrayList2.get(i11);
            if (c1504b != null) {
                if (c1504b.f19852i != i3) {
                    c1504b = ((C1562b) arrayList.get(i11)).c(i3);
                    c1504b.getClass();
                }
                arrayList3.add(c1504b);
            }
        }
        return arrayList3;
    }

    public final void k() {
        C1562b c1562b = this.f20229n;
        c1562b.f20214g = this.f20232q;
        c1562b.f20208a.clear();
        c1562b.f20209b.clear();
        c1562b.f20210c.setLength(0);
        c1562b.f20211d = 15;
        c1562b.f20212e = 0;
        c1562b.f20213f = 0;
        ArrayList arrayList = this.f20228m;
        arrayList.clear();
        arrayList.add(this.f20229n);
    }

    public final void l(int i3) {
        int i10 = this.f20232q;
        if (i10 == i3) {
            return;
        }
        this.f20232q = i3;
        if (i3 != 3) {
            k();
            if (i10 == 3 || i3 == 1 || i3 == 0) {
                this.f20230o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f20228m;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((C1562b) arrayList.get(i11)).f20214g = i3;
            i11++;
        }
    }

    @Override // r1.h, u0.c
    public final void release() {
    }
}
