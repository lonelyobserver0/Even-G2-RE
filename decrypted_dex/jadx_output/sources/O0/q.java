package O0;

import H0.C0067j;
import L0.h0;
import M4.C0151w;
import M4.I;
import M4.Y;
import M4.Z;
import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.text.TextUtils;
import android.util.Pair;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import o0.C1417N;
import o0.C1428c;
import o0.C1438m;
import r0.AbstractC1560u;
import v0.C1802E;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class q extends v {

    /* renamed from: i, reason: collision with root package name */
    public static final Y f5172i = new C0151w(new C0067j(3));

    /* renamed from: c, reason: collision with root package name */
    public final Object f5173c;

    /* renamed from: d, reason: collision with root package name */
    public final C2.i f5174d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5175e;

    /* renamed from: f, reason: collision with root package name */
    public final j f5176f;

    /* renamed from: g, reason: collision with root package name */
    public final l f5177g;

    /* renamed from: h, reason: collision with root package name */
    public C1428c f5178h;

    public q(Context context) {
        Spatializer spatializer;
        int immersiveAudioLevel;
        l lVar;
        C2.i iVar = new C2.i();
        int i3 = j.f5131A;
        j jVar = new j(new i(context));
        this.f5173c = new Object();
        context.getApplicationContext();
        this.f5174d = iVar;
        this.f5176f = jVar;
        this.f5178h = C1428c.f18127c;
        boolean I10 = AbstractC1560u.I(context);
        this.f5175e = I10;
        if (I10 || AbstractC1560u.f20190a < 32) {
            return;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService(StubApp.getString2(643));
        if (audioManager == null) {
            lVar = null;
        } else {
            spatializer = audioManager.getSpatializer();
            l lVar2 = new l();
            lVar2.f5143b = spatializer;
            immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
            lVar2.f5142a = immersiveAudioLevel != 0;
            lVar = lVar2;
        }
        this.f5177g = lVar;
    }

    public static int b(C1438m c1438m, String str, boolean z2) {
        if (!TextUtils.isEmpty(str) && str.equals(c1438m.f18207d)) {
            return 4;
        }
        String d8 = d(str);
        String d10 = d(c1438m.f18207d);
        if (d10 == null || d8 == null) {
            return (z2 && d10 == null) ? 1 : 0;
        }
        if (d10.startsWith(d8) || d8.startsWith(d10)) {
            return 3;
        }
        int i3 = AbstractC1560u.f20190a;
        String string2 = StubApp.getString2(999);
        return d10.split(string2, 2)[0].equals(d8.split(string2, 2)[0]) ? 2 : 0;
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, StubApp.getString2(3969))) {
            return null;
        }
        return str;
    }

    public static Pair e(int i3, u uVar, int[][][] iArr, n nVar, Comparator comparator) {
        RandomAccess randomAccess;
        u uVar2 = uVar;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < uVar2.f5181a) {
            if (i3 == ((int[]) uVar2.f5182b)[i10]) {
                h0 h0Var = ((h0[]) uVar2.f5184d)[i10];
                for (int i11 = 0; i11 < h0Var.f4093a; i11++) {
                    C1417N a3 = h0Var.a(i11);
                    Z d8 = nVar.d(i10, a3, iArr[i10][i11]);
                    int i12 = a3.f18067a;
                    boolean[] zArr = new boolean[i12];
                    for (int i13 = 0; i13 < i12; i13++) {
                        o oVar = (o) d8.get(i13);
                        int a9 = oVar.a();
                        if (!zArr[i13] && a9 != 0) {
                            boolean z2 = true;
                            if (a9 == 1) {
                                randomAccess = I.q(oVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(oVar);
                                int i14 = i13 + 1;
                                while (i14 < i12) {
                                    boolean z10 = z2;
                                    o oVar2 = (o) d8.get(i14);
                                    if (oVar2.a() == 2 && oVar.b(oVar2)) {
                                        arrayList2.add(oVar2);
                                        zArr[i14] = z10;
                                    }
                                    i14++;
                                    z2 = z10;
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                    }
                }
            }
            i10++;
            uVar2 = uVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i15 = 0; i15 < list.size(); i15++) {
            iArr2[i15] = ((o) list.get(i15)).f5156c;
        }
        o oVar3 = (o) list.get(0);
        return Pair.create(new r(oVar3.f5155b, iArr2), Integer.valueOf(oVar3.f5154a));
    }

    @Override // O0.v
    public final void a(C1428c c1428c) {
        boolean equals;
        synchronized (this.f5173c) {
            equals = this.f5178h.equals(c1428c);
            this.f5178h = c1428c;
        }
        if (equals) {
            return;
        }
        c();
    }

    public final void c() {
        boolean z2;
        C1802E c1802e;
        l lVar;
        synchronized (this.f5173c) {
            try {
                z2 = this.f5176f.f5136v && !this.f5175e && AbstractC1560u.f20190a >= 32 && (lVar = this.f5177g) != null && lVar.f5142a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2 || (c1802e = this.f5187a) == null) {
            return;
        }
        c1802e.j.e(10);
    }
}
