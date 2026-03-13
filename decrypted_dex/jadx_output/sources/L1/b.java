package L1;

import com.stub.StubApp;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f4151a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4152b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4153c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4154d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4155e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4156f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4157g;

    public b(String name, int i3, int i10, String type, boolean z2, String str) {
        boolean contains$default;
        boolean contains$default2;
        boolean contains$default3;
        boolean contains$default4;
        boolean contains$default5;
        boolean contains$default6;
        boolean contains$default7;
        boolean contains$default8;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f4151a = name;
        this.f4152b = type;
        this.f4153c = z2;
        this.f4154d = i3;
        this.f4155e = str;
        this.f4156f = i10;
        int i11 = 5;
        if (type != null) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = type.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            contains$default = StringsKt__StringsKt.contains$default(upperCase, (CharSequence) StubApp.getString2(3318), false, 2, (Object) null);
            if (contains$default) {
                i11 = 3;
            } else {
                contains$default2 = StringsKt__StringsKt.contains$default(upperCase, (CharSequence) StubApp.getString2(3319), false, 2, (Object) null);
                if (!contains$default2) {
                    contains$default3 = StringsKt__StringsKt.contains$default(upperCase, (CharSequence) StubApp.getString2(3320), false, 2, (Object) null);
                    if (!contains$default3) {
                        contains$default4 = StringsKt__StringsKt.contains$default(upperCase, (CharSequence) StubApp.getString2(3321), false, 2, (Object) null);
                        if (!contains$default4) {
                            contains$default5 = StringsKt__StringsKt.contains$default(upperCase, (CharSequence) StubApp.getString2(3322), false, 2, (Object) null);
                            if (!contains$default5) {
                                contains$default6 = StringsKt__StringsKt.contains$default(upperCase, (CharSequence) StubApp.getString2(3323), false, 2, (Object) null);
                                if (!contains$default6) {
                                    contains$default7 = StringsKt__StringsKt.contains$default(upperCase, (CharSequence) StubApp.getString2(3324), false, 2, (Object) null);
                                    if (!contains$default7) {
                                        contains$default8 = StringsKt__StringsKt.contains$default(upperCase, (CharSequence) StubApp.getString2(3325), false, 2, (Object) null);
                                        if (!contains$default8) {
                                            i11 = 1;
                                        }
                                    }
                                }
                                i11 = 4;
                            }
                        }
                    }
                }
                i11 = 2;
            }
        }
        this.f4157g = i11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f4154d != bVar.f4154d) {
                return false;
            }
            if (!Intrinsics.areEqual(this.f4151a, bVar.f4151a) || this.f4153c != bVar.f4153c) {
                return false;
            }
            int i3 = bVar.f4156f;
            String str = bVar.f4155e;
            String str2 = this.f4155e;
            int i10 = this.f4156f;
            if (i10 == 1 && i3 == 2 && str2 != null && !a.a(str2, str)) {
                return false;
            }
            if (i10 == 2 && i3 == 1 && str != null && !a.a(str, str2)) {
                return false;
            }
            if (i10 != 0 && i10 == i3) {
                if (str2 != null) {
                    if (!a.a(str2, str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
            }
            if (this.f4157g != bVar.f4157g) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f4151a.hashCode() * 31) + this.f4157g) * 31) + (this.f4153c ? 1231 : 1237)) * 31) + this.f4154d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(3326));
        sb2.append(this.f4151a);
        sb2.append(StubApp.getString2(3327));
        sb2.append(this.f4152b);
        sb2.append(StubApp.getString2(3328));
        sb2.append(this.f4157g);
        sb2.append(StubApp.getString2(KyberEngine.KyberQ));
        sb2.append(this.f4153c);
        sb2.append(StubApp.getString2(3330));
        sb2.append(this.f4154d);
        sb2.append(StubApp.getString2(3331));
        String str = this.f4155e;
        if (str == null) {
            str = StubApp.getString2(1146);
        }
        return AbstractC1482f.k(sb2, str, StubApp.getString2(3254));
    }
}
