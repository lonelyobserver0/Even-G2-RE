package vb;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* renamed from: vb.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum EnumC1846c {
    f21912b(0),
    f21913c(1),
    f21914d(2),
    f21915e(3),
    f21916f(4),
    f21917g(5),
    f21918h(6),
    j(7),
    f21919k(8),
    f21920l(9),
    f21921m(10),
    f21922n(11),
    f21923p(256);


    /* renamed from: a, reason: collision with root package name */
    public final int f21925a;

    EnumC1846c(int i3) {
        this.f21925a = i3;
    }

    public static EnumC1846c a(int i3) {
        if (i3 == 0) {
            return f21912b;
        }
        if (i3 == 256) {
            return f21923p;
        }
        switch (i3) {
            case 2:
                return f21914d;
            case 3:
                return f21915e;
            case 4:
                return f21916f;
            case 5:
                return f21917g;
            case 6:
                return f21918h;
            case 7:
                return j;
            case 8:
                return f21919k;
            case 9:
                return f21920l;
            case 10:
                return f21921m;
            case 11:
                return f21922n;
            default:
                return f21913c;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(StubApp.getString2(1561));
        return AbstractC1482f.f(this.f21925a, StubApp.getString2(74), sb2);
    }
}
