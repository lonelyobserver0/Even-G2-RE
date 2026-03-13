package x0;

import M4.F;
import M4.I;
import M4.Z;
import M4.e0;
import Z9.C0366a;
import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseArray;
import com.stub.StubApp;
import java.util.Objects;
import o0.C1428c;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f22641c = new b(I.q(C1904a.f22637d));

    /* renamed from: d, reason: collision with root package name */
    public static final Z f22642d;

    /* renamed from: e, reason: collision with root package name */
    public static final e0 f22643e;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f22644a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final int f22645b;

    static {
        Object[] objArr = {2, 5, 6};
        M4.r.b(3, objArr);
        f22642d = I.j(3, objArr);
        Bc.i iVar = new Bc.i(4, 5);
        iVar.o(5, 6);
        iVar.o(17, 6);
        iVar.o(7, 6);
        iVar.o(30, 10);
        iVar.o(18, 6);
        iVar.o(6, 8);
        iVar.o(8, 8);
        iVar.o(14, 8);
        f22643e = iVar.h();
    }

    public b(Z z2) {
        for (int i3 = 0; i3 < z2.f4580d; i3++) {
            C1904a c1904a = (C1904a) z2.get(i3);
            this.f22644a.put(c1904a.f22638a, c1904a);
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f22644a.size(); i11++) {
            i10 = Math.max(i10, ((C1904a) this.f22644a.valueAt(i11)).f22639b);
        }
        this.f22645b = i10;
    }

    public static Z a(int i3, int[] iArr) {
        F l9 = I.l();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i10 : iArr) {
            l9.a(new C1904a(i10, i3));
        }
        return l9.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x025b, code lost:
    
        if (com.stub.StubApp.getString2(21084).equals(r5) == false) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static x0.b b(android.content.Context r16, android.content.Intent r17, o0.C1428c r18, Z9.C0366a r19) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.b.b(android.content.Context, android.content.Intent, o0.c, Z9.a):x0.b");
    }

    public static b c(Context context, C1428c c1428c, C0366a c0366a) {
        return b(context, context.registerReceiver(null, new IntentFilter(StubApp.getString2(24108))), c1428c, c0366a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0101, code lost:
    
        if (r15 != 5) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0121 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair d(o0.C1428c r17, o0.C1438m r18) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.b.d(o0.c, o0.m):android.util.Pair");
    }

    public final boolean e(int i3) {
        SparseArray sparseArray = this.f22644a;
        int i10 = AbstractC1560u.f20190a;
        return sparseArray.indexOfKey(i3) >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r3 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            goto L53
        L4:
            boolean r1 = r9 instanceof x0.b
            r2 = 0
            if (r1 != 0) goto La
            goto L54
        La:
            x0.b r9 = (x0.b) r9
            android.util.SparseArray r1 = r8.f22644a
            android.util.SparseArray r3 = r9.f22644a
            int r4 = r0.AbstractC1560u.f20190a
            if (r1 != 0) goto L1a
            if (r3 != 0) goto L18
        L16:
            r1 = r0
            goto L4b
        L18:
            r1 = r2
            goto L4b
        L1a:
            if (r3 != 0) goto L1d
            goto L18
        L1d:
            int r4 = r0.AbstractC1560u.f20190a
            r5 = 31
            if (r4 < r5) goto L28
            boolean r1 = io.flutter.view.a.w(r1, r3)
            goto L4b
        L28:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 == r5) goto L33
            goto L18
        L33:
            r5 = r2
        L34:
            if (r5 >= r4) goto L16
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 != 0) goto L49
            goto L18
        L49:
            int r5 = r5 + r0
            goto L34
        L4b:
            if (r1 == 0) goto L54
            int r1 = r8.f22645b
            int r9 = r9.f22645b
            if (r1 != r9) goto L54
        L53:
            return r0
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i3;
        SparseArray sparseArray = this.f22644a;
        if (AbstractC1560u.f20190a >= 31) {
            i3 = sparseArray.contentHashCode();
        } else {
            int i10 = 17;
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                i10 = Objects.hashCode(sparseArray.valueAt(i11)) + ((sparseArray.keyAt(i11) + (i10 * 31)) * 31);
            }
            i3 = i10;
        }
        return (i3 * 31) + this.f22645b;
    }

    public final String toString() {
        return StubApp.getString2(24109) + this.f22645b + StubApp.getString2(24110) + this.f22644a + StubApp.getString2(511);
    }
}
