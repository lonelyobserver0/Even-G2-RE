package u1;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.o0;
import com.stub.StubApp;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p0.AbstractC1482f;
import q0.C1504b;
import q1.C1505a;
import q1.k;
import q1.l;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;
import r0.InterfaceC1542c;

/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1771a implements l {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f21402g = Pattern.compile(StubApp.getString2(23515));

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21403a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f21404b;

    /* renamed from: d, reason: collision with root package name */
    public LinkedHashMap f21406d;

    /* renamed from: e, reason: collision with root package name */
    public float f21407e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    public float f21408f = -3.4028235E38f;

    /* renamed from: c, reason: collision with root package name */
    public final C1553n f21405c = new C1553n();

    public C1771a(List list) {
        if (list == null || list.isEmpty()) {
            this.f21403a = false;
            this.f21404b = null;
            return;
        }
        this.f21403a = true;
        String n10 = AbstractC1560u.n((byte[]) list.get(0));
        AbstractC1550k.c(n10.startsWith(StubApp.getString2(23516)));
        o0 b2 = o0.b(n10);
        b2.getClass();
        this.f21404b = b2;
        b(new C1553n((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    public static int a(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i3;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i3 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i3 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i3, Long.valueOf(j));
        arrayList2.add(i3, i3 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i3 - 1)));
        return i3;
    }

    public static long c(String str) {
        Matcher matcher = f21402g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i3 = AbstractC1560u.f20190a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0320, code lost:
    
        if (r4 != 3) goto L159;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0360  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(r0.C1553n r38, java.nio.charset.Charset r39) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.C1771a.b(r0.n, java.nio.charset.Charset):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // q1.l
    public final void n(byte[] bArr, int i3, int i10, k kVar, InterfaceC1542c interfaceC1542c) {
        Charset charset;
        o0 o0Var;
        C1553n c1553n;
        int i11;
        float f10;
        int i12;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i13;
        PointF pointF;
        int i14;
        int i15;
        float f11;
        float f12;
        float f13;
        float f14;
        int i16;
        float f15;
        int i17;
        int i18;
        Integer num;
        int i19;
        int i20;
        C1771a c1771a = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C1553n c1553n2 = c1771a.f21405c;
        c1553n2.E(i3 + i10, bArr);
        c1553n2.G(i3);
        Charset C10 = c1553n2.C();
        if (C10 == null) {
            C10 = StandardCharsets.UTF_8;
        }
        boolean z2 = c1771a.f21403a;
        if (!z2) {
            c1771a.b(c1553n2, C10);
        }
        o0 o0Var2 = z2 ? c1771a.f21404b : null;
        while (true) {
            String i21 = c1553n2.i(C10);
            if (i21 == null) {
                long j = kVar.f19904a;
                ArrayList arrayList3 = (j == -9223372036854775807L || !kVar.f19905b) ? null : new ArrayList();
                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                    List list = (List) arrayList.get(i22);
                    if (!list.isEmpty() || i22 == 0) {
                        if (i22 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long longValue = ((Long) arrayList2.get(i22)).longValue();
                        long longValue2 = ((Long) arrayList2.get(i22 + 1)).longValue() - ((Long) arrayList2.get(i22)).longValue();
                        if (j == -9223372036854775807L || longValue >= j) {
                            interfaceC1542c.accept(new C1505a(list, longValue, longValue2));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new C1505a(list, longValue, longValue2));
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        interfaceC1542c.accept((C1505a) it.next());
                    }
                    return;
                }
                return;
            }
            if (i21.startsWith(StubApp.getString2(23516))) {
                o0Var2 = o0.b(i21);
            } else {
                String string2 = StubApp.getString2(23540);
                if (i21.startsWith(string2)) {
                    String string22 = StubApp.getString2(23521);
                    if (o0Var2 == null) {
                        AbstractC1550k.w(string22, StubApp.getString2(23541).concat(i21));
                    } else {
                        AbstractC1550k.c(i21.startsWith(string2));
                        String substring = i21.substring(9);
                        String string23 = StubApp.getString2(321);
                        int i23 = o0Var2.f10267f;
                        String[] split = substring.split(string23, i23);
                        if (split.length != i23) {
                            AbstractC1550k.w(string22, StubApp.getString2(23542).concat(i21));
                        } else {
                            long c10 = c(split[o0Var2.f10263b]);
                            String string24 = StubApp.getString2(23543);
                            if (c10 == -9223372036854775807L) {
                                AbstractC1550k.w(string22, string24.concat(i21));
                            } else {
                                long c11 = c(split[o0Var2.f10264c]);
                                if (c11 == -9223372036854775807L) {
                                    AbstractC1550k.w(string22, string24.concat(i21));
                                } else {
                                    LinkedHashMap linkedHashMap = c1771a.f21406d;
                                    d dVar = (linkedHashMap == null || (i20 = o0Var2.f10265d) == -1) ? null : (d) linkedHashMap.get(split[i20].trim());
                                    String str = split[o0Var2.f10266e];
                                    Matcher matcher = c.f21419a.matcher(str);
                                    int i24 = -1;
                                    PointF pointF2 = null;
                                    while (matcher.find()) {
                                        Charset charset2 = C10;
                                        String group = matcher.group(1);
                                        group.getClass();
                                        try {
                                            PointF a3 = c.a(group);
                                            if (a3 != null) {
                                                pointF2 = a3;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            Matcher matcher2 = c.f21422d.matcher(group);
                                            if (matcher2.find()) {
                                                String group2 = matcher2.group(1);
                                                group2.getClass();
                                                i19 = d.a(group2);
                                            } else {
                                                i19 = -1;
                                            }
                                            if (i19 != -1) {
                                                i24 = i19;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        C10 = charset2;
                                    }
                                    charset = C10;
                                    String replaceAll = c.f21419a.matcher(str).replaceAll("");
                                    String string25 = StubApp.getString2(23544);
                                    String string26 = StubApp.getString2(3692);
                                    String replace = replaceAll.replace(string25, string26).replace(StubApp.getString2(11652), string26).replace(StubApp.getString2(23545), StubApp.getString2(23546));
                                    float f16 = c1771a.f21407e;
                                    float f17 = c1771a.f21408f;
                                    SpannableString spannableString = new SpannableString(replace);
                                    if (dVar != null) {
                                        Integer num2 = dVar.f21425c;
                                        if (num2 != null) {
                                            o0Var = o0Var2;
                                            c1553n = c1553n2;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            o0Var = o0Var2;
                                            c1553n = c1553n2;
                                        }
                                        if (dVar.j == 3 && (num = dVar.f21426d) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f18 = dVar.f21427e;
                                        if (f18 == -3.4028235E38f || f17 == -3.4028235E38f) {
                                            f14 = -3.4028235E38f;
                                            i16 = Integer.MIN_VALUE;
                                        } else {
                                            f14 = f18 / f17;
                                            i16 = 1;
                                        }
                                        boolean z10 = dVar.f21429g;
                                        boolean z11 = dVar.f21428f;
                                        if (z11 && z10) {
                                            f15 = f14;
                                            i17 = i16;
                                            i11 = 0;
                                            i18 = 33;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            f15 = f14;
                                            i17 = i16;
                                            i11 = 0;
                                            i18 = 33;
                                            if (z11) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z10) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (dVar.f21430h) {
                                            spannableString.setSpan(new UnderlineSpan(), i11, spannableString.length(), i18);
                                        }
                                        if (dVar.f21431i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i11, spannableString.length(), i18);
                                        }
                                        i12 = i17;
                                        f10 = f15;
                                    } else {
                                        o0Var = o0Var2;
                                        c1553n = c1553n2;
                                        i11 = 0;
                                        f10 = -3.4028235E38f;
                                        i12 = Integer.MIN_VALUE;
                                    }
                                    int i25 = -1;
                                    if (i24 != -1) {
                                        i25 = i24;
                                    } else if (dVar != null) {
                                        i25 = dVar.f21424b;
                                    }
                                    String string27 = StubApp.getString2(23547);
                                    switch (i25) {
                                        case 0:
                                        default:
                                            AbstractC1482f.p(i25, string27, string22);
                                        case -1:
                                            alignment2 = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            alignment2 = alignment;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            alignment2 = alignment;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            alignment2 = alignment;
                                            break;
                                    }
                                    int i26 = Integer.MIN_VALUE;
                                    switch (i25) {
                                        case 0:
                                        default:
                                            AbstractC1482f.p(i25, string27, string22);
                                        case -1:
                                            i13 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i13 = i11;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i13 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i13 = 2;
                                            break;
                                    }
                                    switch (i25) {
                                        case -1:
                                            pointF = pointF2;
                                            break;
                                        case 0:
                                        default:
                                            AbstractC1482f.p(i25, string27, string22);
                                            pointF = pointF2;
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            pointF = pointF2;
                                            i26 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            pointF = pointF2;
                                            i26 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i26 = i11;
                                            pointF = pointF2;
                                            break;
                                    }
                                    if (pointF == null || f17 == -3.4028235E38f || f16 == -3.4028235E38f) {
                                        if (i13 != 0) {
                                            i14 = 1;
                                            if (i13 != 1) {
                                                i15 = 2;
                                                f11 = i13 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i15 = 2;
                                                f11 = 0.5f;
                                            }
                                        } else {
                                            i14 = 1;
                                            i15 = 2;
                                            f11 = 0.05f;
                                        }
                                        f12 = i26 != 0 ? i26 != i14 ? i26 != i15 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f;
                                        f13 = f11;
                                    } else {
                                        float f19 = pointF.x / f16;
                                        f12 = pointF.y / f17;
                                        f13 = f19;
                                    }
                                    C1504b c1504b = new C1504b(spannableString, alignment2, null, null, f12, i11, i26, f13, i13, i12, f10, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                    int a9 = a(c11, arrayList2, arrayList);
                                    for (int a10 = a(c10, arrayList2, arrayList); a10 < a9; a10++) {
                                        ((List) arrayList.get(a10)).add(c1504b);
                                    }
                                    c1771a = this;
                                    C10 = charset;
                                    o0Var2 = o0Var;
                                    c1553n2 = c1553n;
                                }
                            }
                        }
                    }
                }
                charset = C10;
                o0Var = o0Var2;
                c1553n = c1553n2;
                c1771a = this;
                C10 = charset;
                o0Var2 = o0Var;
                c1553n2 = c1553n;
            }
        }
    }

    @Override // q1.l
    public final int p() {
        return 1;
    }
}
