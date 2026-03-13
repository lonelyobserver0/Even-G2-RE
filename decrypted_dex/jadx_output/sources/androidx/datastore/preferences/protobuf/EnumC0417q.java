package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Type;
import w.AbstractC1856e;

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
/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class EnumC0417q {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0417q f9832b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0417q f9833c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0417q[] f9834d;

    /* renamed from: e, reason: collision with root package name */
    public static final Type[] f9835e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0417q[] f9836f;

    /* renamed from: a, reason: collision with root package name */
    public final int f9837a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0417q EF0;

    static {
        EnumC0425z enumC0425z = EnumC0425z.DOUBLE;
        EnumC0417q enumC0417q = new EnumC0417q("DOUBLE", 0, 0, 1, enumC0425z);
        EnumC0425z enumC0425z2 = EnumC0425z.FLOAT;
        EnumC0417q enumC0417q2 = new EnumC0417q("FLOAT", 1, 1, 1, enumC0425z2);
        EnumC0425z enumC0425z3 = EnumC0425z.LONG;
        EnumC0417q enumC0417q3 = new EnumC0417q("INT64", 2, 2, 1, enumC0425z3);
        EnumC0417q enumC0417q4 = new EnumC0417q("UINT64", 3, 3, 1, enumC0425z3);
        EnumC0425z enumC0425z4 = EnumC0425z.INT;
        EnumC0417q enumC0417q5 = new EnumC0417q("INT32", 4, 4, 1, enumC0425z4);
        EnumC0417q enumC0417q6 = new EnumC0417q("FIXED64", 5, 5, 1, enumC0425z3);
        EnumC0417q enumC0417q7 = new EnumC0417q("FIXED32", 6, 6, 1, enumC0425z4);
        EnumC0425z enumC0425z5 = EnumC0425z.BOOLEAN;
        EnumC0417q enumC0417q8 = new EnumC0417q("BOOL", 7, 7, 1, enumC0425z5);
        EnumC0425z enumC0425z6 = EnumC0425z.STRING;
        EnumC0417q enumC0417q9 = new EnumC0417q("STRING", 8, 8, 1, enumC0425z6);
        EnumC0425z enumC0425z7 = EnumC0425z.MESSAGE;
        EnumC0417q enumC0417q10 = new EnumC0417q("MESSAGE", 9, 9, 1, enumC0425z7);
        EnumC0425z enumC0425z8 = EnumC0425z.BYTE_STRING;
        EnumC0417q enumC0417q11 = new EnumC0417q("BYTES", 10, 10, 1, enumC0425z8);
        EnumC0417q enumC0417q12 = new EnumC0417q("UINT32", 11, 11, 1, enumC0425z4);
        EnumC0425z enumC0425z9 = EnumC0425z.ENUM;
        EnumC0417q enumC0417q13 = new EnumC0417q("ENUM", 12, 12, 1, enumC0425z9);
        EnumC0417q enumC0417q14 = new EnumC0417q("SFIXED32", 13, 13, 1, enumC0425z4);
        EnumC0417q enumC0417q15 = new EnumC0417q("SFIXED64", 14, 14, 1, enumC0425z3);
        EnumC0417q enumC0417q16 = new EnumC0417q("SINT32", 15, 15, 1, enumC0425z4);
        EnumC0417q enumC0417q17 = new EnumC0417q("SINT64", 16, 16, 1, enumC0425z3);
        EnumC0417q enumC0417q18 = new EnumC0417q("GROUP", 17, 17, 1, enumC0425z7);
        EnumC0417q enumC0417q19 = new EnumC0417q("DOUBLE_LIST", 18, 18, 2, enumC0425z);
        EnumC0417q enumC0417q20 = new EnumC0417q("FLOAT_LIST", 19, 19, 2, enumC0425z2);
        EnumC0417q enumC0417q21 = new EnumC0417q("INT64_LIST", 20, 20, 2, enumC0425z3);
        EnumC0417q enumC0417q22 = new EnumC0417q("UINT64_LIST", 21, 21, 2, enumC0425z3);
        EnumC0417q enumC0417q23 = new EnumC0417q("INT32_LIST", 22, 22, 2, enumC0425z4);
        EnumC0417q enumC0417q24 = new EnumC0417q("FIXED64_LIST", 23, 23, 2, enumC0425z3);
        EnumC0417q enumC0417q25 = new EnumC0417q("FIXED32_LIST", 24, 24, 2, enumC0425z4);
        EnumC0417q enumC0417q26 = new EnumC0417q("BOOL_LIST", 25, 25, 2, enumC0425z5);
        EnumC0417q enumC0417q27 = new EnumC0417q("STRING_LIST", 26, 26, 2, enumC0425z6);
        EnumC0417q enumC0417q28 = new EnumC0417q("MESSAGE_LIST", 27, 27, 2, enumC0425z7);
        EnumC0417q enumC0417q29 = new EnumC0417q("BYTES_LIST", 28, 28, 2, enumC0425z8);
        EnumC0417q enumC0417q30 = new EnumC0417q("UINT32_LIST", 29, 29, 2, enumC0425z4);
        EnumC0417q enumC0417q31 = new EnumC0417q("ENUM_LIST", 30, 30, 2, enumC0425z9);
        EnumC0417q enumC0417q32 = new EnumC0417q("SFIXED32_LIST", 31, 31, 2, enumC0425z4);
        EnumC0417q enumC0417q33 = new EnumC0417q("SFIXED64_LIST", 32, 32, 2, enumC0425z3);
        EnumC0417q enumC0417q34 = new EnumC0417q("SINT32_LIST", 33, 33, 2, enumC0425z4);
        EnumC0417q enumC0417q35 = new EnumC0417q("SINT64_LIST", 34, 34, 2, enumC0425z3);
        EnumC0417q enumC0417q36 = new EnumC0417q("DOUBLE_LIST_PACKED", 35, 35, 3, enumC0425z);
        f9832b = enumC0417q36;
        EnumC0417q enumC0417q37 = new EnumC0417q("FLOAT_LIST_PACKED", 36, 36, 3, enumC0425z2);
        EnumC0417q enumC0417q38 = new EnumC0417q("INT64_LIST_PACKED", 37, 37, 3, enumC0425z3);
        EnumC0417q enumC0417q39 = new EnumC0417q("UINT64_LIST_PACKED", 38, 38, 3, enumC0425z3);
        EnumC0417q enumC0417q40 = new EnumC0417q("INT32_LIST_PACKED", 39, 39, 3, enumC0425z4);
        EnumC0417q enumC0417q41 = new EnumC0417q("FIXED64_LIST_PACKED", 40, 40, 3, enumC0425z3);
        EnumC0417q enumC0417q42 = new EnumC0417q("FIXED32_LIST_PACKED", 41, 41, 3, enumC0425z4);
        EnumC0417q enumC0417q43 = new EnumC0417q("BOOL_LIST_PACKED", 42, 42, 3, enumC0425z5);
        EnumC0417q enumC0417q44 = new EnumC0417q("UINT32_LIST_PACKED", 43, 43, 3, enumC0425z4);
        EnumC0417q enumC0417q45 = new EnumC0417q("ENUM_LIST_PACKED", 44, 44, 3, enumC0425z9);
        EnumC0417q enumC0417q46 = new EnumC0417q("SFIXED32_LIST_PACKED", 45, 45, 3, enumC0425z4);
        EnumC0417q enumC0417q47 = new EnumC0417q("SFIXED64_LIST_PACKED", 46, 46, 3, enumC0425z3);
        EnumC0417q enumC0417q48 = new EnumC0417q("SINT32_LIST_PACKED", 47, 47, 3, enumC0425z4);
        EnumC0417q enumC0417q49 = new EnumC0417q("SINT64_LIST_PACKED", 48, 48, 3, enumC0425z3);
        f9833c = enumC0417q49;
        f9836f = new EnumC0417q[]{enumC0417q, enumC0417q2, enumC0417q3, enumC0417q4, enumC0417q5, enumC0417q6, enumC0417q7, enumC0417q8, enumC0417q9, enumC0417q10, enumC0417q11, enumC0417q12, enumC0417q13, enumC0417q14, enumC0417q15, enumC0417q16, enumC0417q17, enumC0417q18, enumC0417q19, enumC0417q20, enumC0417q21, enumC0417q22, enumC0417q23, enumC0417q24, enumC0417q25, enumC0417q26, enumC0417q27, enumC0417q28, enumC0417q29, enumC0417q30, enumC0417q31, enumC0417q32, enumC0417q33, enumC0417q34, enumC0417q35, enumC0417q36, enumC0417q37, enumC0417q38, enumC0417q39, enumC0417q40, enumC0417q41, enumC0417q42, enumC0417q43, enumC0417q44, enumC0417q45, enumC0417q46, enumC0417q47, enumC0417q48, enumC0417q49, new EnumC0417q("GROUP_LIST", 49, 49, 2, enumC0425z7), new EnumC0417q("MAP", 50, 50, 4, EnumC0425z.VOID)};
        f9835e = new Type[0];
        EnumC0417q[] values = values();
        f9834d = new EnumC0417q[values.length];
        for (EnumC0417q enumC0417q50 : values) {
            f9834d[enumC0417q50.f9837a] = enumC0417q50;
        }
    }

    public EnumC0417q(String str, int i3, int i10, int i11, EnumC0425z enumC0425z) {
        this.f9837a = i10;
        int c10 = AbstractC1856e.c(i11);
        if (c10 == 1) {
            enumC0425z.getClass();
        } else if (c10 == 3) {
            enumC0425z.getClass();
        }
        if (i11 == 1) {
            enumC0425z.ordinal();
        }
    }

    public static EnumC0417q valueOf(String str) {
        return (EnumC0417q) Enum.valueOf(EnumC0417q.class, str);
    }

    public static EnumC0417q[] values() {
        return (EnumC0417q[]) f9836f.clone();
    }
}
