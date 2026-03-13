package z0;

import M4.I;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final C1438m f23694a;

    /* renamed from: b, reason: collision with root package name */
    public final I f23695b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23696c;

    /* renamed from: d, reason: collision with root package name */
    public final List f23697d;

    /* renamed from: e, reason: collision with root package name */
    public final j f23698e;

    public m(C1438m c1438m, I i3, s sVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        AbstractC1550k.c(!i3.isEmpty());
        this.f23694a = c1438m;
        this.f23695b = I.m(i3);
        this.f23697d = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.f23698e = sVar.a(this);
        int i10 = AbstractC1560u.f20190a;
        this.f23696c = AbstractC1560u.R(sVar.f23713c, 1000000L, sVar.f23712b, RoundingMode.DOWN);
    }

    public abstract String b();

    public abstract y0.h c();

    public abstract j e();
}
