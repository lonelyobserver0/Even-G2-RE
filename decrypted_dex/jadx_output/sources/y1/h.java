package y1;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.mapbox.common.logger.LogPriority;
import com.stub.StubApp;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f23484a = Pattern.compile(StubApp.getString2(24585));

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f23485b = Pattern.compile(StubApp.getString2(24586));

    /* renamed from: c, reason: collision with root package name */
    public static final Map f23486c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f23487d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(StubApp.getString2(22527), Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put(StubApp.getString2(22465), Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put(StubApp.getString2(22403), Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put(StubApp.getString2(22503), Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put(StubApp.getString2(22529), Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put(StubApp.getString2(22468), Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put(StubApp.getString2(22392), Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put(StubApp.getString2(22390), Integer.valueOf(Color.rgb(0, 0, 0)));
        f23486c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(StubApp.getString2(24587), Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put(StubApp.getString2(24588), Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put(StubApp.getString2(24589), Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put(StubApp.getString2(24590), Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put(StubApp.getString2(24591), Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put(StubApp.getString2(24592), Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put(StubApp.getString2(24593), Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put(StubApp.getString2(24594), Integer.valueOf(Color.rgb(0, 0, 0)));
        f23487d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static void a(String str, e eVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c10;
        ?? r42;
        int i3;
        int i10;
        int i11 = eVar.f23469b;
        int length = spannableStringBuilder.length();
        String str2 = eVar.f23468a;
        str2.getClass();
        int i12 = -1;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 98:
                if (str2.equals(StubApp.getString2(2377))) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case LogPriority.NONE /* 99 */:
                if (str2.equals(StubApp.getString2(2376))) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 105:
                if (str2.equals(StubApp.getString2(2368))) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 117:
                if (str2.equals(StubApp.getString2(2371))) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 118:
                if (str2.equals(StubApp.getString2(1316))) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 3314158:
                if (str2.equals(StubApp.getString2(24595))) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 3511770:
                if (str2.equals(StubApp.getString2(23810))) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i11, length, 33);
                break;
            case 2:
                for (String str3 : eVar.f23471d) {
                    Map map = f23486c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i11, length, 33);
                    } else {
                        Map map2 = f23487d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i11, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
                break;
            case 5:
                spannableStringBuilder.setSpan(new q0.h(eVar.f23470c), i11, length, 33);
                break;
            case 7:
                int c11 = c(list2, str, eVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, d.f23465c);
                int i13 = eVar.f23469b;
                int i14 = 0;
                int i15 = 0;
                while (i14 < arrayList.size()) {
                    if (StubApp.getString2(24596).equals(((d) arrayList.get(i14)).f23466a.f23468a)) {
                        d dVar = (d) arrayList.get(i14);
                        int c12 = c(list2, str, dVar.f23466a);
                        if (c12 == i12) {
                            c12 = c11 != i12 ? c11 : 1;
                        }
                        int i16 = dVar.f23466a.f23469b - i15;
                        int i17 = dVar.f23467b - i15;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i16, i17);
                        spannableStringBuilder.delete(i16, i17);
                        spannableStringBuilder.setSpan(new q0.f(subSequence.toString(), c12), i13, i16, 33);
                        i15 = subSequence.length() + i15;
                        i13 = i16;
                    }
                    i14++;
                    i12 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b2 = b(list2, str, eVar);
        for (int i18 = 0; i18 < b2.size(); i18++) {
            b bVar = ((f) b2.get(i18)).f23473b;
            int i19 = bVar.f23456l;
            if (i19 == -1 && bVar.f23457m == -1) {
                r42 = -1;
            } else {
                r42 = (bVar.f23457m == 1 ? 2 : false) | (i19 == 1);
            }
            if (r42 != -1) {
                int i20 = bVar.f23456l;
                if (i20 == -1 && bVar.f23457m == -1) {
                    i10 = -1;
                    i3 = 1;
                } else {
                    i3 = 1;
                    i10 = (i20 == 1 ? 1 : 0) | (bVar.f23457m == 1 ? 2 : 0);
                }
                Y3.a.a(spannableStringBuilder, new StyleSpan(i10), i11, length);
            } else {
                i3 = 1;
            }
            if (bVar.j == i3) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i11, length, 33);
            }
            if (bVar.f23455k == i3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
            }
            if (bVar.f23452g) {
                if (!bVar.f23452g) {
                    throw new IllegalStateException(StubApp.getString2(24597));
                }
                Y3.a.a(spannableStringBuilder, new ForegroundColorSpan(bVar.f23451f), i11, length);
            }
            if (bVar.f23454i) {
                if (!bVar.f23454i) {
                    throw new IllegalStateException(StubApp.getString2(24598));
                }
                Y3.a.a(spannableStringBuilder, new BackgroundColorSpan(bVar.f23453h), i11, length);
            }
            if (bVar.f23450e != null) {
                Y3.a.a(spannableStringBuilder, new TypefaceSpan(bVar.f23450e), i11, length);
            }
            int i21 = bVar.f23458n;
            if (i21 == 1) {
                Y3.a.a(spannableStringBuilder, new AbsoluteSizeSpan((int) bVar.f23459o, true), i11, length);
            } else if (i21 == 2) {
                Y3.a.a(spannableStringBuilder, new RelativeSizeSpan(bVar.f23459o), i11, length);
            } else if (i21 == 3) {
                Y3.a.a(spannableStringBuilder, new RelativeSizeSpan(bVar.f23459o / 100.0f), i11, length);
            }
            if (bVar.f23461q) {
                spannableStringBuilder.setSpan(new q0.e(), i11, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, e eVar) {
        int i3;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            b bVar = (b) list.get(i10);
            String str2 = eVar.f23468a;
            if (bVar.f23446a.isEmpty() && bVar.f23447b.isEmpty() && bVar.f23448c.isEmpty() && bVar.f23449d.isEmpty()) {
                i3 = TextUtils.isEmpty(str2);
            } else {
                int a3 = b.a(bVar.f23449d, b.a(bVar.f23447b, b.a(bVar.f23446a, 0, 1073741824, str), 2, str2), 4, eVar.f23470c);
                if (a3 != -1) {
                    if (eVar.f23471d.containsAll(bVar.f23448c)) {
                        i3 = a3 + (bVar.f23448c.size() * 4);
                    }
                }
                i3 = 0;
            }
            if (i3 > 0) {
                arrayList.add(new f(i3, bVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, e eVar) {
        ArrayList b2 = b(list, str, eVar);
        for (int i3 = 0; i3 < b2.size(); i3++) {
            int i10 = ((f) b2.get(i3)).f23473b.f23460p;
            if (i10 != -1) {
                return i10;
            }
        }
        return -1;
    }

    public static c d(String str, Matcher matcher, C1553n c1553n, ArrayList arrayList) {
        g gVar = new g();
        try {
            String group = matcher.group(1);
            group.getClass();
            gVar.f23474a = i.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            gVar.f23475b = i.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, gVar);
            StringBuilder sb2 = new StringBuilder();
            c1553n.getClass();
            String i3 = c1553n.i(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(i3)) {
                if (sb2.length() > 0) {
                    sb2.append(StubApp.getString2(3692));
                }
                sb2.append(i3.trim());
                i3 = c1553n.i(StandardCharsets.UTF_8);
            }
            gVar.f23476c = f(str, sb2.toString(), arrayList);
            return new c(gVar.a().a(), gVar.f23474a, gVar.f23475b);
        } catch (NumberFormatException unused) {
            AbstractC1550k.w(StubApp.getString2(24584), StubApp.getString2(24599) + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, g gVar) {
        char c10;
        int i3;
        char c11;
        int i10;
        int i11;
        String string2 = StubApp.getString2(22724);
        String string22 = StubApp.getString2(6550);
        String string23 = StubApp.getString2(12974);
        String string24 = StubApp.getString2(6013);
        String string25 = StubApp.getString2(24584);
        Matcher matcher = f23485b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if (StubApp.getString2("5281").equals(group)) {
                    g(group2, gVar);
                } else if (StubApp.getString2("24600").equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals(string24)) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1074341483:
                            if (group2.equals(string23)) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 100571:
                            if (group2.equals(string22)) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3317767:
                            if (group2.equals(StubApp.getString2(1538))) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 108511772:
                            if (group2.equals(StubApp.getString2(1539))) {
                                c10 = 4;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 109757538:
                            if (group2.equals(string2)) {
                                c10 = 5;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    switch (c10) {
                        case 0:
                        case 1:
                            i3 = 2;
                            break;
                        case 2:
                            i3 = 3;
                            break;
                        case 3:
                            i3 = 4;
                            break;
                        case 4:
                            i3 = 5;
                            break;
                        case 5:
                            i3 = 1;
                            break;
                        default:
                            AbstractC1550k.w(string25, StubApp.getString2("24601").concat(group2));
                            i3 = 2;
                            break;
                    }
                    gVar.f23477d = i3;
                } else if (StubApp.getString2("665").equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        substring.getClass();
                        switch (substring.hashCode()) {
                            case -1842484672:
                                if (substring.equals(StubApp.getString2(24603))) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1364013995:
                                if (substring.equals(string24)) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1276788989:
                                if (substring.equals(StubApp.getString2(24602))) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1074341483:
                                if (substring.equals(string23)) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 100571:
                                if (substring.equals(string22)) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 109757538:
                                if (substring.equals(string2)) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                            case 5:
                                i10 = 0;
                                break;
                            case 1:
                            case 3:
                                i10 = 1;
                                break;
                            case 2:
                            case 4:
                                i10 = 2;
                                break;
                            default:
                                AbstractC1550k.w(string25, StubApp.getString2("24604").concat(substring));
                                i10 = Integer.MIN_VALUE;
                                break;
                        }
                        gVar.f23482i = i10;
                        group2 = group2.substring(0, indexOf);
                    }
                    gVar.f23481h = i.b(group2);
                } else if (StubApp.getString2("4473").equals(group)) {
                    gVar.j = i.b(group2);
                } else if (StubApp.getString2("24605").equals(group)) {
                    if (group2.equals(StubApp.getString2(24606))) {
                        i11 = 2;
                    } else if (group2.equals(StubApp.getString2(24607))) {
                        i11 = 1;
                    } else {
                        AbstractC1550k.w(string25, StubApp.getString2("24608").concat(group2));
                        i11 = Integer.MIN_VALUE;
                    }
                    gVar.f23483k = i11;
                } else {
                    AbstractC1550k.w(string25, StubApp.getString2("24609") + group + StubApp.getString2("478") + group2);
                }
            } catch (NumberFormatException unused) {
                AbstractC1550k.w(string25, StubApp.getString2(24610) + matcher.group());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0138. Please report as an issue. */
    public static SpannedString f(String str, String str2, List list) {
        char c10;
        int i3;
        char c11;
        int i10 = 2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (true) {
            String str3 = "";
            if (i11 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (e) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new e("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char charAt = str2.charAt(i11);
            String string2 = StubApp.getString2(397);
            if (charAt == '&') {
                i11++;
                int indexOf = str2.indexOf(59, i11);
                int indexOf2 = str2.indexOf(32, i11);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    String substring = str2.substring(i11, indexOf);
                    substring.getClass();
                    switch (substring.hashCode()) {
                        case 3309:
                            if (substring.equals(StubApp.getString2(24615))) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3464:
                            if (substring.equals(StubApp.getString2(24614))) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 96708:
                            if (substring.equals(StubApp.getString2(24613))) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3374865:
                            if (substring.equals(StubApp.getString2(24612))) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    switch (c10) {
                        case 0:
                            spannableStringBuilder.append(Typography.greater);
                            break;
                        case 1:
                            spannableStringBuilder.append(Typography.less);
                            break;
                        case 2:
                            spannableStringBuilder.append(Typography.amp);
                            break;
                        case 3:
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            AbstractC1550k.w(StubApp.getString2(24584), StubApp.getString2(24616) + substring + StubApp.getString2(24617));
                            break;
                    }
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) string2);
                    }
                    i11 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i11++;
            } else {
                int i12 = i11 + 1;
                if (i12 < str2.length()) {
                    boolean z2 = str2.charAt(i12) == '/';
                    int indexOf3 = str2.indexOf(62, i12);
                    i12 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                    int i13 = i12 - 2;
                    boolean z10 = str2.charAt(i13) == '/';
                    int i14 = i11 + (z2 ? i10 : 1);
                    if (!z10) {
                        i13 = i12 - 1;
                    }
                    String substring2 = str2.substring(i14, i13);
                    if (!substring2.trim().isEmpty()) {
                        String trim = substring2.trim();
                        AbstractC1550k.c(!trim.isEmpty());
                        int i15 = AbstractC1560u.f20190a;
                        String str4 = trim.split(StubApp.getString2(24611), i10)[0];
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case 98:
                                if (str4.equals(StubApp.getString2(2377))) {
                                    i3 = 0;
                                    break;
                                }
                                i3 = -1;
                                break;
                            case LogPriority.NONE /* 99 */:
                                if (str4.equals(StubApp.getString2(2376))) {
                                    i3 = 1;
                                    break;
                                }
                                i3 = -1;
                                break;
                            case 105:
                                if (str4.equals(StubApp.getString2(2368))) {
                                    i3 = i10;
                                    break;
                                }
                                i3 = -1;
                                break;
                            case 117:
                                if (str4.equals(StubApp.getString2(2371))) {
                                    i3 = 3;
                                    break;
                                }
                                i3 = -1;
                                break;
                            case 118:
                                if (str4.equals(StubApp.getString2(1316))) {
                                    i3 = 4;
                                    break;
                                }
                                i3 = -1;
                                break;
                            case 3650:
                                if (str4.equals(StubApp.getString2(24596))) {
                                    i3 = 5;
                                    break;
                                }
                                i3 = -1;
                                break;
                            case 3314158:
                                if (str4.equals(StubApp.getString2(24595))) {
                                    i3 = 6;
                                    break;
                                }
                                i3 = -1;
                                break;
                            case 3511770:
                                if (str4.equals(StubApp.getString2(23810))) {
                                    i3 = 7;
                                    break;
                                }
                                i3 = -1;
                                break;
                            default:
                                i3 = -1;
                                break;
                        }
                        switch (i3) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                if (z2) {
                                    while (!arrayDeque.isEmpty()) {
                                        e eVar = (e) arrayDeque.pop();
                                        a(str, eVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new d(eVar, spannableStringBuilder.length()));
                                        }
                                        if (eVar.f23468a.equals(str4)) {
                                            break;
                                        }
                                    }
                                    break;
                                } else if (!z10) {
                                    int length = spannableStringBuilder.length();
                                    String trim2 = substring2.trim();
                                    AbstractC1550k.c(!trim2.isEmpty());
                                    int indexOf4 = trim2.indexOf(string2);
                                    if (indexOf4 == -1) {
                                        c11 = 0;
                                    } else {
                                        str3 = trim2.substring(indexOf4).trim();
                                        c11 = 0;
                                        trim2 = trim2.substring(0, indexOf4);
                                    }
                                    String[] split = trim2.split(StubApp.getString2(1612), -1);
                                    String str5 = split[c11];
                                    HashSet hashSet = new HashSet();
                                    for (int i16 = 1; i16 < split.length; i16++) {
                                        hashSet.add(split[i16]);
                                    }
                                    arrayDeque.push(new e(str5, length, str3, hashSet));
                                    break;
                                }
                                break;
                        }
                    }
                    i11 = i12;
                }
                i11 = i12;
            }
            i10 = 2;
        }
    }

    public static void g(String str, g gVar) {
        int i3 = 2;
        int indexOf = str.indexOf(44);
        char c10 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals(StubApp.getString2(6013))) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals(StubApp.getString2(12974))) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals(StubApp.getString2(6550))) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals(StubApp.getString2(22724))) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                    i3 = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i3 = 0;
                    break;
                default:
                    AbstractC1550k.w(StubApp.getString2(24584), StubApp.getString2(24604).concat(substring));
                    i3 = Integer.MIN_VALUE;
                    break;
            }
            gVar.f23480g = i3;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith(StubApp.getString2(4964))) {
            gVar.f23478e = i.b(str);
            gVar.f23479f = 0;
        } else {
            gVar.f23478e = Integer.parseInt(str);
            gVar.f23479f = 1;
        }
    }
}
