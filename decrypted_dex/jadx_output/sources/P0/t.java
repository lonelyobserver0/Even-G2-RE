package P0;

import H0.C0067j;
import i2.u;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class t {

    /* renamed from: h, reason: collision with root package name */
    public static final C0067j f5444h = new C0067j(10);

    /* renamed from: i, reason: collision with root package name */
    public static final C0067j f5445i = new C0067j(11);

    /* renamed from: a, reason: collision with root package name */
    public final int f5446a;

    /* renamed from: e, reason: collision with root package name */
    public int f5450e;

    /* renamed from: f, reason: collision with root package name */
    public int f5451f;

    /* renamed from: g, reason: collision with root package name */
    public int f5452g;

    /* renamed from: c, reason: collision with root package name */
    public final s[] f5448c = new s[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5447b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f5449d = -1;

    public t(int i3) {
        this.f5446a = i3;
    }

    public final void a(float f10, int i3) {
        s sVar;
        int i10 = this.f5449d;
        ArrayList arrayList = this.f5447b;
        if (i10 != 1) {
            Collections.sort(arrayList, f5444h);
            this.f5449d = 1;
        }
        int i11 = this.f5452g;
        s[] sVarArr = this.f5448c;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f5452g = i12;
            sVar = sVarArr[i12];
        } else {
            sVar = new s();
        }
        int i13 = this.f5450e;
        this.f5450e = i13 + 1;
        sVar.f5441a = i13;
        sVar.f5442b = i3;
        sVar.f5443c = f10;
        arrayList.add(sVar);
        this.f5451f += i3;
        while (true) {
            int i14 = this.f5451f;
            int i15 = this.f5446a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            s sVar2 = (s) arrayList.get(0);
            int i17 = sVar2.f5442b;
            if (i17 <= i16) {
                this.f5451f -= i17;
                arrayList.remove(0);
                int i18 = this.f5452g;
                if (i18 < 5) {
                    this.f5452g = i18 + 1;
                    sVarArr[i18] = sVar2;
                }
            } else {
                sVar2.f5442b = i17 - i16;
                this.f5451f -= i16;
            }
        }
    }

    public final float b() {
        int i3 = this.f5449d;
        ArrayList arrayList = this.f5447b;
        if (i3 != 0) {
            Collections.sort(arrayList, f5445i);
            this.f5449d = 0;
        }
        float f10 = 0.5f * this.f5451f;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            s sVar = (s) arrayList.get(i11);
            i10 += sVar.f5442b;
            if (i10 >= f10) {
                return sVar.f5443c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((s) u.j(1, arrayList)).f5443c;
    }
}
