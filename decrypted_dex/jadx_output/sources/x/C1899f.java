package x;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: x.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1899f {

    /* renamed from: a, reason: collision with root package name */
    public final List f22605a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22606b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f22607c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f22608d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f22609e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f22610f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f22611g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f22612h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f22613i;

    public C1899f(List list) {
        this.f22606b = false;
        this.f22607c = new int[]{-1, -1};
        this.f22608d = new ArrayList();
        this.f22609e = new ArrayList();
        this.f22610f = new HashSet();
        this.f22611g = new HashSet();
        this.f22612h = new ArrayList();
        this.f22613i = new ArrayList();
        this.f22605a = list;
    }

    public static void b(ArrayList arrayList, C1897d c1897d) {
        if (c1897d.f22558b0) {
            return;
        }
        arrayList.add(c1897d);
        c1897d.f22558b0 = true;
        if (c1897d.n()) {
            return;
        }
        if (c1897d instanceof C1894a) {
            C1894a c1894a = (C1894a) c1897d;
            int i3 = c1894a.f22500j0;
            for (int i10 = 0; i10 < i3; i10++) {
                b(arrayList, c1894a.f22499i0[i10]);
            }
        }
        for (C1896c c1896c : c1897d.f22529A) {
            C1896c c1896c2 = c1896c.f22523d;
            if (c1896c2 != null) {
                C1897d c1897d2 = c1897d.f22531C;
                C1897d c1897d3 = c1896c2.f22521b;
                if (c1897d3 != c1897d2) {
                    b(arrayList, c1897d3);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(x.C1897d r8) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C1899f.c(x.d):void");
    }

    public final void a(C1897d c1897d, int i3) {
        if (i3 == 0) {
            this.f22610f.add(c1897d);
        } else if (i3 == 1) {
            this.f22611g.add(c1897d);
        }
    }

    public C1899f(ArrayList arrayList) {
        this.f22606b = false;
        this.f22607c = new int[]{-1, -1};
        this.f22608d = new ArrayList();
        this.f22609e = new ArrayList();
        this.f22610f = new HashSet();
        this.f22611g = new HashSet();
        this.f22612h = new ArrayList();
        this.f22613i = new ArrayList();
        this.f22605a = arrayList;
        this.f22606b = true;
    }
}
