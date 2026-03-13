package T0;

import M4.Z;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import l1.C1141d;
import l4.C1145A;
import m1.C1268d;
import o1.C1452d;
import r0.C1558s;
import z1.C1989A;
import z1.C1992D;
import z1.C1997b;
import z1.C1999d;
import z1.C2000e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m implements r {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f7034e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: f, reason: collision with root package name */
    public static final Z9.C f7035f = new Z9.C(new R4.i(2));

    /* renamed from: g, reason: collision with root package name */
    public static final Z9.C f7036g = new Z9.C(new R4.i(3));

    /* renamed from: a, reason: collision with root package name */
    public Z f7037a;

    /* renamed from: d, reason: collision with root package name */
    public int f7040d;

    /* renamed from: c, reason: collision with root package name */
    public C1145A f7039c = new C1145A(22);

    /* renamed from: b, reason: collision with root package name */
    public boolean f7038b = true;

    @Override // T0.r
    public final synchronized o[] a() {
        return f(Uri.EMPTY, new HashMap());
    }

    public final void b(int i3, ArrayList arrayList) {
        switch (i3) {
            case 0:
                arrayList.add(new C1997b());
                break;
            case 1:
                arrayList.add(new C1999d());
                break;
            case 2:
                arrayList.add(new C2000e());
                break;
            case 3:
                arrayList.add(new U0.a());
                break;
            case 4:
                o d8 = f7035f.d(0);
                if (d8 == null) {
                    arrayList.add(new Y0.c());
                    break;
                } else {
                    arrayList.add(d8);
                    break;
                }
            case 5:
                arrayList.add(new Z0.b());
                break;
            case 6:
                arrayList.add(new C1141d(this.f7039c, this.f7038b ? 0 : 2));
                break;
            case 7:
                arrayList.add(new C1268d());
                break;
            case 8:
                C1145A c1145a = this.f7039c;
                int i10 = this.f7038b ? 0 : 32;
                M4.G g10 = M4.I.f4549b;
                arrayList.add(new n1.h(c1145a, i10, null, null, Z.f4578e, null));
                arrayList.add(new n1.k(this.f7039c, this.f7038b ? 0 : 16));
                break;
            case 9:
                arrayList.add(new C1452d());
                break;
            case 10:
                arrayList.add(new C1989A());
                break;
            case 11:
                if (this.f7037a == null) {
                    M4.G g11 = M4.I.f4549b;
                    this.f7037a = Z.f4578e;
                }
                arrayList.add(new C1992D(1, !this.f7038b ? 1 : 0, this.f7039c, new C1558s(0L), new K.i(0, this.f7037a)));
                break;
            case 12:
                arrayList.add(new A1.e());
                break;
            case 14:
                arrayList.add(new X0.a(this.f7040d));
                break;
            case 15:
                o d10 = f7036g.d(new Object[0]);
                if (d10 != null) {
                    arrayList.add(d10);
                    break;
                }
                break;
            case 16:
                arrayList.add(new V0.b(!this.f7038b ? 1 : 0, this.f7039c));
                break;
            case 17:
                arrayList.add(new X0.a(1, (byte) 0));
                break;
            case 18:
                arrayList.add(new B1.a(0));
                break;
            case 19:
                arrayList.add(new X0.a(0, (byte) 0));
                break;
            case 20:
                arrayList.add(new B1.a(2));
                break;
            case 21:
                arrayList.add(new B1.a(1));
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[Catch: all -> 0x004b, TryCatch #0 {all -> 0x004b, blocks: (B:3:0x0001, B:5:0x0019, B:8:0x0020, B:9:0x0028, B:11:0x002f, B:12:0x0032, B:15:0x003a, B:18:0x003f, B:21:0x0045, B:23:0x0048, B:27:0x004d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[Catch: all -> 0x004b, TryCatch #0 {all -> 0x004b, blocks: (B:3:0x0001, B:5:0x0019, B:8:0x0020, B:9:0x0028, B:11:0x002f, B:12:0x0032, B:15:0x003a, B:18:0x003f, B:21:0x0045, B:23:0x0048, B:27:0x004d), top: B:2:0x0001 }] */
    @Override // T0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized T0.o[] f(android.net.Uri r6, java.util.Map r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4b
            int[] r1 = T0.m.f7034e     // Catch: java.lang.Throwable -> L4b
            r2 = 21
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = "466"
            java.lang.String r3 = com.stub.StubApp.getString2(r3)     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r7 = r7.get(r3)     // Catch: java.lang.Throwable -> L4b
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L4b
            r3 = 0
            if (r7 == 0) goto L27
            boolean r4 = r7.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L20
            goto L27
        L20:
            java.lang.Object r7 = r7.get(r3)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L4b
            goto L28
        L27:
            r7 = 0
        L28:
            int r7 = q8.AbstractC1526a.y(r7)     // Catch: java.lang.Throwable -> L4b
            r4 = -1
            if (r7 == r4) goto L32
            r5.b(r7, r0)     // Catch: java.lang.Throwable -> L4b
        L32:
            int r6 = q8.AbstractC1526a.z(r6)     // Catch: java.lang.Throwable -> L4b
            if (r6 == r4) goto L3d
            if (r6 == r7) goto L3d
            r5.b(r6, r0)     // Catch: java.lang.Throwable -> L4b
        L3d:
            if (r3 >= r2) goto L4d
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L4b
            if (r4 == r7) goto L48
            if (r4 == r6) goto L48
            r5.b(r4, r0)     // Catch: java.lang.Throwable -> L4b
        L48:
            int r3 = r3 + 1
            goto L3d
        L4b:
            r6 = move-exception
            goto L5b
        L4d:
            int r6 = r0.size()     // Catch: java.lang.Throwable -> L4b
            T0.o[] r6 = new T0.o[r6]     // Catch: java.lang.Throwable -> L4b
            java.lang.Object[] r6 = r0.toArray(r6)     // Catch: java.lang.Throwable -> L4b
            T0.o[] r6 = (T0.o[]) r6     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r5)
            return r6
        L5b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4b
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.m.f(android.net.Uri, java.util.Map):T0.o[]");
    }
}
