package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class X2 {

    /* renamed from: c, reason: collision with root package name */
    public static final X2 f11408c;

    /* renamed from: d, reason: collision with root package name */
    public static final X2 f11409d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ X2[] f11410e;

    /* renamed from: a, reason: collision with root package name */
    public final Y2 f11411a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11412b;

    /* JADX INFO: Fake field, exist only in values array */
    X2 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    X2 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    X2 EF0;

    static {
        X2 x22 = new X2(StubApp.getString2(8643), 0, Y2.f11424d, 1);
        X2 x23 = new X2(StubApp.getString2(10282), 1, Y2.f11423c, 5);
        Y2 y22 = Y2.f11422b;
        X2 x24 = new X2(StubApp.getString2(11860), 2, y22, 0);
        X2 x25 = new X2(StubApp.getString2(11861), 3, y22, 0);
        Y2 y23 = Y2.f11421a;
        X2 x26 = new X2(StubApp.getString2(11862), 4, y23, 0);
        X2 x27 = new X2(StubApp.getString2(6031), 5, y22, 1);
        X2 x28 = new X2(StubApp.getString2(6033), 6, y23, 5);
        X2 x29 = new X2(StubApp.getString2(11863), 7, Y2.f11425e, 0);
        X2 x210 = new X2(StubApp.getString2(3793), 8, Y2.f11426f, 2);
        f11408c = x210;
        Y2 y24 = Y2.j;
        X2 x211 = new X2(StubApp.getString2(11864), 9, y24, 3);
        f11409d = x211;
        f11410e = new X2[]{x22, x23, x24, x25, x26, x27, x28, x29, x210, x211, new X2(StubApp.getString2(11865), 10, y24, 2), new X2(StubApp.getString2(11866), 11, Y2.f11427g, 2), new X2(StubApp.getString2(11867), 12, y23, 0), new X2(StubApp.getString2(11868), 13, Y2.f11428h, 0), new X2(StubApp.getString2(11869), 14, y23, 5), new X2(StubApp.getString2(11870), 15, y22, 1), new X2(StubApp.getString2(11871), 16, y23, 0), new X2(StubApp.getString2(11872), 17, y22, 0)};
    }

    public X2(String str, int i3, Y2 y22, int i10) {
        this.f11411a = y22;
        this.f11412b = i10;
    }

    public static X2[] values() {
        return (X2[]) f11410e.clone();
    }
}
