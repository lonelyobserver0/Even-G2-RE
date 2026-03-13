package v1;

import M4.I;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.stub.StubApp;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q0.C1504b;
import q1.C1505a;
import q1.k;
import q1.l;
import r0.AbstractC1550k;
import r0.C1553n;
import r0.InterfaceC1542c;

/* renamed from: v1.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1831a implements l {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f21868d = Pattern.compile(StubApp.getString2(23656));

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f21869e = Pattern.compile(StubApp.getString2(23657));

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f21870a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21871b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final C1553n f21872c = new C1553n();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C1504b a(Spanned spanned, String str) {
        char c10;
        char c11;
        float f10;
        if (str == null) {
            return new C1504b(spanned, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        }
        int hashCode = str.hashCode();
        String string2 = StubApp.getString2(23658);
        String string22 = StubApp.getString2(23659);
        String string23 = StubApp.getString2(23660);
        String string24 = StubApp.getString2(23661);
        String string25 = StubApp.getString2(23662);
        String string26 = StubApp.getString2(23663);
        String string27 = StubApp.getString2(23664);
        String string28 = StubApp.getString2(23665);
        String string29 = StubApp.getString2(23666);
        switch (hashCode) {
            case -685620710:
                if (str.equals(string2)) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -685620679:
                if (str.equals(string22)) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -685620648:
                if (str.equals(string23)) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -685620617:
                if (str.equals(string24)) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -685620586:
                if (str.equals(string25)) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -685620555:
                if (str.equals(string26)) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -685620524:
                if (str.equals(string27)) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -685620493:
                if (str.equals(string28)) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -685620462:
                if (str.equals(string29)) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        int i3 = (c10 == 0 || c10 == 1 || c10 == 2) ? 0 : (c10 == 3 || c10 == 4 || c10 == 5) ? 2 : 1;
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals(string2)) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -685620679:
                if (str.equals(string22)) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -685620648:
                if (str.equals(string23)) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -685620617:
                if (str.equals(string24)) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -685620586:
                if (str.equals(string25)) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case -685620555:
                if (str.equals(string26)) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case -685620524:
                if (str.equals(string27)) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -685620493:
                if (str.equals(string28)) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -685620462:
                if (str.equals(string29)) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        int i10 = (c11 == 0 || c11 == 1 || c11 == 2) ? 2 : (c11 == 3 || c11 == 4 || c11 == 5) ? 0 : 1;
        float f11 = 0.92f;
        if (i3 == 0) {
            f10 = 0.08f;
        } else if (i3 == 1) {
            f10 = 0.5f;
        } else {
            if (i3 != 2) {
                throw new IllegalArgumentException();
            }
            f10 = 0.92f;
        }
        if (i10 == 0) {
            f11 = 0.08f;
        } else if (i10 == 1) {
            f11 = 0.5f;
        } else if (i10 != 2) {
            throw new IllegalArgumentException();
        }
        return new C1504b(spanned, null, null, null, f11, 0, i10, f10, i3, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public static long b(Matcher matcher, int i3) {
        String group = matcher.group(i3 + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i3 + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i3 + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i3 + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    @Override // q1.l
    public final void n(byte[] bArr, int i3, int i10, k kVar, InterfaceC1542c interfaceC1542c) {
        String i11;
        String str;
        C1831a c1831a = this;
        String string2 = StubApp.getString2(23667);
        C1553n c1553n = c1831a.f21872c;
        c1553n.E(i3 + i10, bArr);
        c1553n.G(i3);
        Charset C10 = c1553n.C();
        if (C10 == null) {
            C10 = StandardCharsets.UTF_8;
        }
        long j = kVar.f19904a;
        long j3 = -9223372036854775807L;
        ArrayList arrayList = (j == -9223372036854775807L || !kVar.f19905b) ? null : new ArrayList();
        while (true) {
            String i12 = c1553n.i(C10);
            if (i12 == null) {
                break;
            }
            if (i12.length() != 0) {
                try {
                    Integer.parseInt(i12);
                    i11 = c1553n.i(C10);
                } catch (NumberFormatException unused) {
                    AbstractC1550k.w(string2, StubApp.getString2(23671).concat(i12));
                }
                if (i11 == null) {
                    AbstractC1550k.w(string2, StubApp.getString2(23668));
                    break;
                }
                Matcher matcher = f21868d.matcher(i11);
                if (matcher.matches()) {
                    long b2 = b(matcher, 1);
                    long b10 = b(matcher, 6);
                    StringBuilder sb2 = c1831a.f21870a;
                    sb2.setLength(0);
                    long j10 = j3;
                    ArrayList arrayList2 = c1831a.f21871b;
                    arrayList2.clear();
                    String i13 = c1553n.i(C10);
                    while (!TextUtils.isEmpty(i13)) {
                        if (sb2.length() > 0) {
                            sb2.append(StubApp.getString2(23669));
                        }
                        String trim = i13.trim();
                        StringBuilder sb3 = new StringBuilder(trim);
                        Matcher matcher2 = f21869e.matcher(trim);
                        int i14 = 0;
                        while (matcher2.find()) {
                            String group = matcher2.group();
                            arrayList2.add(group);
                            int start = matcher2.start() - i14;
                            int length = group.length();
                            sb3.replace(start, start + length, "");
                            i14 += length;
                            j = j;
                        }
                        sb2.append(sb3.toString());
                        i13 = c1553n.i(C10);
                        j = j;
                    }
                    long j11 = j;
                    Spanned fromHtml = Html.fromHtml(sb2.toString());
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (String) arrayList2.get(i15);
                        if (str.matches(StubApp.getString2(23670))) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    if (j11 == j10 || b2 >= j11) {
                        interfaceC1542c.accept(new C1505a(I.q(a(fromHtml, str)), b2, b10 - b2));
                    } else if (arrayList != null) {
                        arrayList.add(new C1505a(I.q(a(fromHtml, str)), b2, b10 - b2));
                    }
                    c1831a = this;
                    j3 = j10;
                    j = j11;
                } else {
                    AbstractC1550k.w(string2, StubApp.getString2(23543).concat(i11));
                    c1831a = this;
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC1542c.accept((C1505a) it.next());
            }
        }
    }

    @Override // q1.l
    public final int p() {
        return 1;
    }
}
