package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: com.google.android.gms.internal.measurement.q, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0666q implements Iterable, InterfaceC0651n {

    /* renamed from: a, reason: collision with root package name */
    public final String f11647a;

    public C0666q(String str) {
        if (str == null) {
            throw new IllegalArgumentException(StubApp.getString2(12191));
        }
        this.f11647a = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Boolean a() {
        return Boolean.valueOf(!this.f11647a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final String b() {
        return this.f11647a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Iterator c() {
        return new C0661p(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Double d() {
        String str = this.f11647a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0666q) {
            return this.f11647a.equals(((C0666q) obj).f11647a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11647a.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final InterfaceC0651n i(String str, p2.h hVar, ArrayList arrayList) {
        String str2;
        String str3;
        String str4;
        String str5;
        char c10;
        int i3;
        int i10;
        int i11;
        int i12;
        p2.h hVar2;
        int i13;
        String string2 = StubApp.getString2(12192);
        boolean equals = string2.equals(str);
        String string22 = StubApp.getString2(12193);
        String string23 = StubApp.getString2(11906);
        String string24 = StubApp.getString2(12194);
        String string25 = StubApp.getString2(11908);
        String string26 = StubApp.getString2(12195);
        String string27 = StubApp.getString2(12196);
        String string28 = StubApp.getString2(12197);
        String string29 = StubApp.getString2(12198);
        String string210 = StubApp.getString2(11912);
        String string211 = StubApp.getString2(12199);
        String string212 = StubApp.getString2(12200);
        String string213 = StubApp.getString2(12201);
        String string214 = StubApp.getString2(11916);
        String string215 = StubApp.getString2(11918);
        String string216 = StubApp.getString2(12202);
        String string217 = StubApp.getString2(12203);
        if (equals || string23.equals(str) || string216.equals(str) || string215.equals(str) || string214.equals(str) || string213.equals(str) || string212.equals(str) || string211.equals(str) || string210.equals(str) || string29.equals(str) || string28.equals(str) || string27.equals(str) || string26.equals(str) || string25.equals(str) || string217.equals(str) || string24.equals(str)) {
            str2 = string216;
            str3 = string22;
        } else {
            str2 = string216;
            str3 = string22;
            if (!str3.equals(str)) {
                throw new IllegalArgumentException(str.concat(StubApp.getString2(12204)));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str4 = str2;
                str5 = string2;
                if (str.equals(str4)) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1776922004:
                str5 = string2;
                if (str.equals(string25)) {
                    c10 = 14;
                    str4 = str2;
                    break;
                }
                str4 = str2;
                c10 = 65535;
                break;
            case -1464939364:
                str5 = string2;
                if (str.equals(string26)) {
                    c10 = '\f';
                    str4 = str2;
                    break;
                }
                str4 = str2;
                c10 = 65535;
                break;
            case -1361633751:
                str5 = string2;
                if (str.equals(str5)) {
                    str4 = str2;
                    c10 = 0;
                    break;
                }
                str4 = str2;
                c10 = 65535;
                break;
            case -1354795244:
                if (str.equals(string23)) {
                    str4 = str2;
                    str5 = string2;
                    c10 = 1;
                    break;
                }
                str4 = str2;
                str5 = string2;
                c10 = 65535;
                break;
            case -1137582698:
                if (str.equals(string27)) {
                    c10 = '\r';
                    str4 = str2;
                    str5 = string2;
                    break;
                }
                str4 = str2;
                str5 = string2;
                c10 = 65535;
                break;
            case -906336856:
                if (str.equals(string211)) {
                    c10 = 7;
                    str4 = str2;
                    str5 = string2;
                    break;
                }
                str4 = str2;
                str5 = string2;
                c10 = 65535;
                break;
            case -726908483:
                if (str.equals(string24)) {
                    c10 = 11;
                    str4 = str2;
                    str5 = string2;
                    break;
                }
                str4 = str2;
                str5 = string2;
                c10 = 65535;
                break;
            case -467511597:
                if (str.equals(string214)) {
                    c10 = 4;
                    str4 = str2;
                    str5 = string2;
                    break;
                }
                str4 = str2;
                str5 = string2;
                c10 = 65535;
                break;
            case -399551817:
                if (str.equals(string217)) {
                    c10 = 15;
                    str4 = str2;
                    str5 = string2;
                    break;
                }
                str4 = str2;
                str5 = string2;
                c10 = 65535;
                break;
            case 3568674:
                if (str.equals(str3)) {
                    c10 = 16;
                    str4 = str2;
                    str5 = string2;
                    break;
                }
                str4 = str2;
                str5 = string2;
                c10 = 65535;
                break;
            case 103668165:
                if (str.equals(string213)) {
                    c10 = 5;
                    str4 = str2;
                    str5 = string2;
                    break;
                }
                str4 = str2;
                str5 = string2;
                c10 = 65535;
                break;
            case 109526418:
                if (str.equals(string210)) {
                    c10 = '\b';
                    str4 = str2;
                    str5 = string2;
                    break;
                }
                str4 = str2;
                str5 = string2;
                c10 = 65535;
                break;
            case 109648666:
                if (str.equals(string29)) {
                    c10 = '\t';
                    str4 = str2;
                    str5 = string2;
                    break;
                }
                str4 = str2;
                str5 = string2;
                c10 = 65535;
                break;
            case 530542161:
                if (str.equals(string28)) {
                    c10 = '\n';
                    str4 = str2;
                    str5 = string2;
                    break;
                }
                str4 = str2;
                str5 = string2;
                c10 = 65535;
                break;
            case 1094496948:
                if (str.equals(string212)) {
                    c10 = 6;
                    str4 = str2;
                    str5 = string2;
                    break;
                }
                str4 = str2;
                str5 = string2;
                c10 = 65535;
                break;
            case 1943291465:
                if (str.equals(string215)) {
                    str4 = str2;
                    str5 = string2;
                    c10 = 3;
                    break;
                }
                str4 = str2;
                str5 = string2;
                c10 = 65535;
                break;
            default:
                str4 = str2;
                str5 = string2;
                c10 = 65535;
                break;
        }
        String string218 = StubApp.getString2(1146);
        char c11 = c10;
        String str6 = this.f11647a;
        switch (c11) {
            case 0:
                a4.f.Q(str5, 1, arrayList);
                int X10 = !arrayList.isEmpty() ? (int) a4.f.X(((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(0)).d().doubleValue()) : 0;
                return (X10 < 0 || X10 >= str6.length()) ? InterfaceC0651n.f11626e0 : new C0666q(String.valueOf(str6.charAt(X10)));
            case 1:
                if (!arrayList.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder(str6);
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        sb2.append(((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(i14)).b());
                    }
                    return new C0666q(sb2.toString());
                }
                return this;
            case 2:
                a4.f.L(1, str4, arrayList);
                InterfaceC0651n c12 = ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(0));
                boolean equals2 = StubApp.getString2(11905).equals(c12.b());
                C0606e c0606e = InterfaceC0651n.f11624c0;
                if (equals2) {
                    return c0606e;
                }
                double doubleValue = c12.d().doubleValue();
                return (doubleValue != Math.floor(doubleValue) || (i3 = (int) doubleValue) < 0 || i3 >= str6.length()) ? InterfaceC0651n.f11625d0 : c0606e;
            case 3:
                a4.f.Q(string215, 2, arrayList);
                if (arrayList.size() > 0) {
                    string218 = ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(0)).b();
                }
                return new C0616g(Double.valueOf(str6.indexOf(string218, (int) a4.f.X(arrayList.size() < 2 ? 0.0d : ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(1)).d().doubleValue()))));
            case 4:
                a4.f.Q(string214, 2, arrayList);
                if (arrayList.size() > 0) {
                    string218 = ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(0)).b();
                }
                String str7 = string218;
                return new C0616g(Double.valueOf(str6.lastIndexOf(str7, (int) (Double.isNaN(arrayList.size() < 2 ? Double.NaN : ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(1)).d().doubleValue()) ? Double.POSITIVE_INFINITY : a4.f.X(r3)))));
            case 5:
                a4.f.Q(string213, 1, arrayList);
                Matcher matcher = Pattern.compile(arrayList.size() <= 0 ? "" : ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(0)).b()).matcher(str6);
                return matcher.find() ? new C0601d(Arrays.asList(new C0666q(matcher.group()))) : InterfaceC0651n.f11620V;
            case 6:
                a4.f.Q(string212, 2, arrayList);
                InterfaceC0651n interfaceC0651n = InterfaceC0651n.f11619U;
                if (!arrayList.isEmpty()) {
                    string218 = ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(0)).b();
                    if (arrayList.size() > 1) {
                        interfaceC0651n = ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(1));
                    }
                }
                String str8 = string218;
                int indexOf = str6.indexOf(str8);
                if (indexOf >= 0) {
                    if (interfaceC0651n instanceof AbstractC0621h) {
                        i10 = 0;
                        interfaceC0651n = ((AbstractC0621h) interfaceC0651n).e(hVar, Arrays.asList(new C0666q(str8), new C0616g(Double.valueOf(indexOf)), this));
                    } else {
                        i10 = 0;
                    }
                    String substring = str6.substring(i10, indexOf);
                    String b2 = interfaceC0651n.b();
                    String substring2 = str6.substring(str8.length() + indexOf);
                    return new C0666q(E1.a.n(new StringBuilder(String.valueOf(substring).length() + String.valueOf(b2).length() + String.valueOf(substring2).length()), substring, b2, substring2));
                }
                return this;
            case 7:
                a4.f.Q(string211, 1, arrayList);
                if (!arrayList.isEmpty()) {
                    string218 = ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(0)).b();
                }
                return Pattern.compile(string218).matcher(str6).find() ? new C0616g(Double.valueOf(r1.start())) : new C0616g(Double.valueOf(-1.0d));
            case '\b':
                a4.f.Q(string210, 2, arrayList);
                double X11 = a4.f.X(!arrayList.isEmpty() ? ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(0)).d().doubleValue() : 0.0d);
                double max = X11 < 0.0d ? Math.max(str6.length() + X11, 0.0d) : Math.min(X11, str6.length());
                double X12 = a4.f.X(arrayList.size() > 1 ? ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(1)).d().doubleValue() : str6.length());
                int i15 = (int) max;
                return new C0666q(str6.substring(i15, Math.max(0, ((int) (X12 < 0.0d ? Math.max(str6.length() + X12, 0.0d) : Math.min(X12, str6.length()))) - i15) + i15));
            case '\t':
                a4.f.Q(string29, 2, arrayList);
                if (str6.length() == 0) {
                    return new C0601d(Arrays.asList(this));
                }
                ArrayList arrayList2 = new ArrayList();
                if (arrayList.isEmpty()) {
                    arrayList2.add(this);
                } else {
                    String b10 = ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(0)).b();
                    long W10 = arrayList.size() > 1 ? a4.f.W(((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(1)).d().doubleValue()) & BodyPartID.bodyIdMax : 2147483647L;
                    if (W10 == 0) {
                        return new C0601d();
                    }
                    String[] split = str6.split(Pattern.quote(b10), ((int) W10) + 1);
                    int length = split.length;
                    if (!b10.isEmpty() || length <= 0) {
                        i11 = length;
                        i12 = 0;
                    } else {
                        boolean isEmpty = split[0].isEmpty();
                        i11 = length - 1;
                        i12 = isEmpty;
                        if (!split[i11].isEmpty()) {
                            i11 = length;
                            i12 = isEmpty;
                        }
                    }
                    if (length > W10) {
                        i11--;
                    }
                    while (i12 < i11) {
                        arrayList2.add(new C0666q(split[i12]));
                        i12++;
                    }
                }
                return new C0601d(arrayList2);
            case '\n':
                a4.f.Q(string28, 2, arrayList);
                if (arrayList.isEmpty()) {
                    hVar2 = hVar;
                    i13 = 0;
                } else {
                    hVar2 = hVar;
                    i13 = (int) a4.f.X(((C0680t) hVar2.f19672b).c(hVar2, (InterfaceC0651n) arrayList.get(0)).d().doubleValue());
                }
                int X13 = arrayList.size() > 1 ? (int) a4.f.X(((C0680t) hVar2.f19672b).c(hVar2, (InterfaceC0651n) arrayList.get(1)).d().doubleValue()) : str6.length();
                int min = Math.min(Math.max(i13, 0), str6.length());
                int min2 = Math.min(Math.max(X13, 0), str6.length());
                return new C0666q(str6.substring(Math.min(min, min2), Math.max(min, min2)));
            case 11:
                a4.f.L(0, string24, arrayList);
                return new C0666q(str6.toUpperCase());
            case '\f':
                a4.f.L(0, string26, arrayList);
                return new C0666q(str6.toLowerCase());
            case '\r':
                a4.f.L(0, string27, arrayList);
                return new C0666q(str6.toLowerCase(Locale.ENGLISH));
            case 14:
                a4.f.L(0, string25, arrayList);
                return this;
            case 15:
                a4.f.L(0, string217, arrayList);
                return new C0666q(str6.toUpperCase(Locale.ENGLISH));
            case 16:
                a4.f.L(0, string217, arrayList);
                return new C0666q(str6.trim());
            default:
                throw new IllegalArgumentException(StubApp.getString2(11922));
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0661p(this, 1);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final InterfaceC0651n m() {
        return new C0666q(this.f11647a);
    }

    public final String toString() {
        String str = this.f11647a;
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        String string2 = StubApp.getString2(2123);
        return E1.a.n(sb2, string2, str, string2);
    }
}
