package com.google.protobuf;

import com.stub.StubApp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class O0 {

    /* renamed from: a, reason: collision with root package name */
    public static final M0 f12107a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ O0[] f12108b;

    /* JADX INFO: Fake field, exist only in values array */
    O0 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    O0 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    O0 EF12;

    static {
        O0 o02 = new O0(StubApp.getString2(8643), 0, P0.f12112e, 1);
        O0 o03 = new O0(StubApp.getString2(10282), 1, P0.f12111d, 5);
        P0 p02 = P0.f12110c;
        O0 o04 = new O0(StubApp.getString2(11860), 2, p02, 0);
        O0 o05 = new O0(StubApp.getString2(11861), 3, p02, 0);
        P0 p03 = P0.f12109b;
        O0 o06 = new O0(StubApp.getString2(11862), 4, p03, 0);
        O0 o07 = new O0(StubApp.getString2(6031), 5, p02, 1);
        O0 o08 = new O0(StubApp.getString2(6033), 6, p03, 5);
        O0 o09 = new O0(StubApp.getString2(11863), 7, P0.f12113f, 0);
        K0 k02 = new K0(StubApp.getString2(3793), 8, P0.f12114g, 2);
        P0 p04 = P0.f12116k;
        L0 l02 = new L0(StubApp.getString2(11864), 9, p04, 3);
        M0 m02 = new M0(StubApp.getString2(11865), 10, p04, 2);
        f12107a = m02;
        f12108b = new O0[]{o02, o03, o04, o05, o06, o07, o08, o09, k02, l02, m02, new N0(StubApp.getString2(11866), 11, P0.f12115h, 2), new O0(StubApp.getString2(11867), 12, p03, 0), new O0(StubApp.getString2(11868), 13, P0.j, 0), new O0(StubApp.getString2(11869), 14, p03, 5), new O0(StubApp.getString2(11870), 15, p02, 1), new O0(StubApp.getString2(11871), 16, p03, 0), new O0(StubApp.getString2(11872), 17, p02, 0)};
    }

    public O0(String str, int i3, P0 p02, int i10) {
    }

    public static O0 valueOf(String str) {
        return (O0) Enum.valueOf(O0.class, str);
    }

    public static O0[] values() {
        return (O0[]) f12108b.clone();
    }
}
