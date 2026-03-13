package z0;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.stub.StubApp;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.LongCompanionObject;
import o0.C1406C;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import sa.C1608a;
import t0.C1710j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e extends DefaultHandler implements P0.q {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f23666b = Pattern.compile(StubApp.getString2(24748));

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f23667c = Pattern.compile(StubApp.getString2(24749));

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f23668d = Pattern.compile(StubApp.getString2(24750));

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f23669e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f23670a;

    public e() {
        try {
            this.f23670a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException(StubApp.getString2(23055), e10);
        }
    }

    public static long a(ArrayList arrayList, long j, long j3, int i3, long j10) {
        int i10;
        if (i3 >= 0) {
            i10 = i3 + 1;
        } else {
            int i11 = AbstractC1560u.f20190a;
            i10 = (int) ((((j10 - j) + j3) - 1) / j3);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            arrayList.add(new q(j, j3));
            j += j3;
        }
        return j;
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i3 = 1;
            while (i3 != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i3++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i3--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b0, code lost:
    
        if (r0 == 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ef, code lost:
    
        if (r8.equals(com.stub.StubApp.getString2(24759)) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015b, code lost:
    
        if (r0 < 33) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(org.xmlpull.v1.XmlPullParser r12) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.e.c(org.xmlpull.v1.XmlPullParser):int");
    }

    public static long e(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, StubApp.getString2(24765));
        return attributeValue == null ? j : StubApp.getString2(24766).equals(attributeValue) ? LongCompanionObject.MAX_VALUE : (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList f(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, StubApp.getString2(24767));
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z2 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, StubApp.getString2(24768));
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, StubApp.getString2(24769));
        String str = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC1550k.p(xmlPullParser, StubApp.getString2(24770)));
        if (str != null && AbstractC1550k.n(str)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str;
            }
            return M4.r.n(new C1986b(str, parseInt, parseInt2, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C1986b c1986b = (C1986b) arrayList.get(i3);
            String t3 = AbstractC1550k.t(c1986b.f23642a, str);
            String str2 = attributeValue3 == null ? t3 : attributeValue3;
            if (z2) {
                parseInt = c1986b.f23644c;
                parseInt2 = c1986b.f23645d;
                str2 = c1986b.f23643b;
            }
            arrayList2.add(new C1986b(t3, parseInt, parseInt2, str2));
        }
        return arrayList2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01cb  */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v32, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v4, types: [byte[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair g(org.xmlpull.v1.XmlPullParser r15) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.e.g(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int h(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, StubApp.getString2(677));
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (StubApp.getString2(643).equals(attributeValue)) {
            return 1;
        }
        if (StubApp.getString2(3235).equals(attributeValue)) {
            return 2;
        }
        if (StubApp.getString2(613).equals(attributeValue)) {
            return 3;
        }
        return StubApp.getString2(1483).equals(attributeValue) ? 4 : -1;
    }

    public static f i(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, StubApp.getString2(24751));
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, StubApp.getString2(1061));
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, StubApp.getString2(290));
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!AbstractC1550k.p(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long j(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = AbstractC1560u.f20198i.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return !isEmpty ? -parseDouble6 : parseDouble6;
    }

    public static float k(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, StubApp.getString2(23786));
        if (attributeValue != null) {
            Matcher matcher = f23666b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
            }
        }
        return f10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0b0e, code lost:
    
        if (r9.equals(r3) != false) goto L345;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0347 A[LOOP:3: B:97:0x0275->B:112:0x0347, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x031c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x11b8 A[LOOP:5: B:184:0x052d->B:192:0x11b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0ff9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0e58 A[LOOP:11: B:347:0x0804->B:355:0x0e58, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0a1c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0b27  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0b63 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x160f A[LOOP:1: B:34:0x0111->B:42:0x160f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x15d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0b14  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static z0.C1987c l(org.xmlpull.v1.XmlPullParser r156, android.net.Uri r157) {
        /*
            Method dump skipped, instructions count: 5724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.e.l(org.xmlpull.v1.XmlPullParser, android.net.Uri):z0.c");
    }

    public static j m(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j3 = -1;
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split(StubApp.getString2(999));
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j3 = (Long.parseLong(split[1]) - j) + 1;
            }
        } else {
            j = 0;
        }
        return new j(j, attributeValue, j3);
    }

    public static int n(String str) {
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -2060497896:
                    if (str.equals(StubApp.getString2(3711))) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1724546052:
                    if (str.equals(StubApp.getString2(659))) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1580883024:
                    if (str.equals(StubApp.getString2(24841))) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1574842690:
                    if (str.equals(StubApp.getString2(24821))) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1408024454:
                    if (str.equals(StubApp.getString2(24840))) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -1396432756:
                    if (str.equals(StubApp.getString2(24822))) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 99825:
                    if (str.equals(StubApp.getString2(21580))) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 3343801:
                    if (str.equals(StubApp.getString2(470))) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 3530173:
                    if (str.equals(StubApp.getString2(21583))) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 552573414:
                    if (str.equals(StubApp.getString2(21582))) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 899152809:
                    if (str.equals(StubApp.getString2(21579))) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case 1629013393:
                    if (str.equals(StubApp.getString2(21581))) {
                        c10 = 11;
                        break;
                    }
                    break;
                case 1855372047:
                    if (str.equals(StubApp.getString2(21578))) {
                        c10 = '\f';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 3:
                case 5:
                    return 128;
                case 1:
                    return 512;
                case 2:
                    return 2048;
                case 4:
                    return 2;
                case 6:
                    return 16;
                case 7:
                    return 1;
                case '\b':
                    return 256;
                case '\t':
                    return 64;
                case '\n':
                    return 8;
                case 11:
                    return 32;
                case '\f':
                    return 4;
            }
        }
        return 0;
    }

    public static int o(ArrayList arrayList) {
        int i3 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (AbstractC0624h2.i(StubApp.getString2(24564), ((f) arrayList.get(i10)).f23671a)) {
                i3 = 16384;
            }
        }
        return i3;
    }

    public static r p(XmlPullParser xmlPullParser, r rVar) {
        long j = rVar != null ? rVar.f23712b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, StubApp.getString2(24831));
        if (attributeValue != null) {
            j = Long.parseLong(attributeValue);
        }
        long j3 = j;
        long j10 = rVar != null ? rVar.f23713c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, StubApp.getString2(24832));
        if (attributeValue2 != null) {
            j10 = Long.parseLong(attributeValue2);
        }
        long j11 = j10;
        long j12 = rVar != null ? rVar.f23709d : 0L;
        long j13 = rVar != null ? rVar.f23710e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, StubApp.getString2(24842));
        if (attributeValue3 != null) {
            String[] split = attributeValue3.split(StubApp.getString2(999));
            j12 = Long.parseLong(split[0]);
            j13 = (Long.parseLong(split[1]) - j12) + 1;
        }
        long j14 = j13;
        long j15 = j12;
        j jVar = rVar != null ? rVar.f23711a : null;
        while (true) {
            xmlPullParser.next();
            if (AbstractC1550k.q(xmlPullParser, StubApp.getString2(14938))) {
                jVar = m(xmlPullParser, StubApp.getString2(24843), StubApp.getString2(7704));
            } else {
                b(xmlPullParser);
            }
            j jVar2 = jVar;
            if (AbstractC1550k.p(xmlPullParser, StubApp.getString2(24805))) {
                return new r(jVar2, j3, j11, j15, j14);
            }
            jVar = jVar2;
        }
    }

    public static o q(XmlPullParser xmlPullParser, o oVar, long j, long j3, long j10, long j11, long j12) {
        long j13 = oVar != null ? oVar.f23712b : 1L;
        List list = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, StubApp.getString2(24831));
        if (attributeValue != null) {
            j13 = Long.parseLong(attributeValue);
        }
        long j14 = j13;
        long j15 = oVar != null ? oVar.f23713c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, StubApp.getString2(24832));
        if (attributeValue2 != null) {
            j15 = Long.parseLong(attributeValue2);
        }
        long j16 = j15;
        long j17 = oVar != null ? oVar.f23700e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, StubApp.getString2(2091));
        if (attributeValue3 != null) {
            j17 = Long.parseLong(attributeValue3);
        }
        long j18 = j17;
        long j19 = oVar != null ? oVar.f23699d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, StubApp.getString2(24844));
        if (attributeValue4 != null) {
            j19 = Long.parseLong(attributeValue4);
        }
        long j20 = j19;
        long j21 = j11 == -9223372036854775807L ? j10 : j11;
        long j22 = j21 == LongCompanionObject.MAX_VALUE ? -9223372036854775807L : j21;
        j jVar = null;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (AbstractC1550k.q(xmlPullParser, StubApp.getString2(14938))) {
                jVar = m(xmlPullParser, StubApp.getString2(24843), StubApp.getString2(7704));
            } else if (AbstractC1550k.q(xmlPullParser, StubApp.getString2(24845))) {
                list2 = s(xmlPullParser, j14, j3);
            } else if (AbstractC1550k.q(xmlPullParser, StubApp.getString2(24846))) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(m(xmlPullParser, StubApp.getString2(4483), StubApp.getString2(24847)));
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC1550k.p(xmlPullParser, StubApp.getString2(24806)));
        if (oVar != null) {
            if (jVar == null) {
                jVar = oVar.f23711a;
            }
            if (list2 == null) {
                list2 = oVar.f23701f;
            }
            if (list == null) {
                list = oVar.j;
            }
        }
        return new o(jVar, j14, j16, j20, j18, list2, j22, list, AbstractC1560u.J(j12), AbstractC1560u.J(j));
    }

    public static p r(XmlPullParser xmlPullParser, p pVar, List list, long j, long j3, long j10, long j11, long j12) {
        long j13;
        long j14 = pVar != null ? pVar.f23712b : 1L;
        j jVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, StubApp.getString2(24831));
        if (attributeValue != null) {
            j14 = Long.parseLong(attributeValue);
        }
        long j15 = j14;
        long j16 = pVar != null ? pVar.f23713c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, StubApp.getString2(24832));
        if (attributeValue2 != null) {
            j16 = Long.parseLong(attributeValue2);
        }
        long j17 = j16;
        long j18 = pVar != null ? pVar.f23700e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, StubApp.getString2(2091));
        if (attributeValue3 != null) {
            j18 = Long.parseLong(attributeValue3);
        }
        long j19 = j18;
        long j20 = pVar != null ? pVar.f23699d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, StubApp.getString2(24844));
        if (attributeValue4 != null) {
            j20 = Long.parseLong(attributeValue4);
        }
        long j21 = j20;
        int i3 = 0;
        while (true) {
            if (i3 >= list.size()) {
                j13 = -1;
                break;
            }
            f fVar = (f) list.get(i3);
            if (AbstractC0624h2.i(StubApp.getString2(24848), fVar.f23671a)) {
                j13 = Long.parseLong(fVar.f23672b);
                break;
            }
            i3++;
        }
        long j22 = j13;
        long j23 = j11 == -9223372036854775807L ? j10 : j11;
        long j24 = j23 == LongCompanionObject.MAX_VALUE ? -9223372036854775807L : j23;
        C1608a t3 = t(xmlPullParser, StubApp.getString2(4483), pVar != null ? pVar.f23705k : null);
        C1608a t10 = t(xmlPullParser, StubApp.getString2(24849), pVar != null ? pVar.j : null);
        List list2 = null;
        do {
            xmlPullParser.next();
            if (AbstractC1550k.q(xmlPullParser, StubApp.getString2(14938))) {
                jVar = m(xmlPullParser, StubApp.getString2(24843), StubApp.getString2(7704));
            } else if (AbstractC1550k.q(xmlPullParser, StubApp.getString2(24845))) {
                list2 = s(xmlPullParser, j15, j3);
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC1550k.p(xmlPullParser, StubApp.getString2(24807)));
        if (pVar != null) {
            if (jVar == null) {
                jVar = pVar.f23711a;
            }
            if (list2 == null) {
                list2 = pVar.f23701f;
            }
        }
        return new p(jVar, j15, j17, j21, j22, j19, list2, j24, t10, t3, AbstractC1560u.J(j12), AbstractC1560u.J(j));
    }

    public static ArrayList s(XmlPullParser xmlPullParser, long j, long j3) {
        long j10;
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        long j12 = -9223372036854775807L;
        boolean z2 = false;
        int i3 = 0;
        do {
            xmlPullParser.next();
            if (AbstractC1550k.q(xmlPullParser, StubApp.getString2(1384))) {
                String attributeValue = xmlPullParser.getAttributeValue(null, StubApp.getString2(1310));
                long parseLong = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z2) {
                    int i10 = i3;
                    j10 = parseLong;
                    j11 = a(arrayList, j11, j12, i10, j10);
                } else {
                    j10 = parseLong;
                }
                if (j10 != -9223372036854775807L) {
                    j11 = j10;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, StubApp.getString2(1315));
                j12 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, StubApp.getString2(1269));
                i3 = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z2 = true;
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC1550k.p(xmlPullParser, StubApp.getString2(24845)));
        if (z2) {
            int i11 = AbstractC1560u.f20190a;
            a(arrayList, j11, j12, i3, AbstractC1560u.R(j3, j, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    public static C1608a t(XmlPullParser xmlPullParser, String str, C1608a c1608a) {
        String string2;
        boolean z2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return c1608a;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add("");
        int i3 = 0;
        while (i3 < attributeValue.length()) {
            String string22 = StubApp.getString2(4963);
            int indexOf = attributeValue.indexOf(string22, i3);
            if (indexOf == -1) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i3));
                i3 = attributeValue.length();
            } else if (indexOf != i3) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i3, indexOf));
                i3 = indexOf;
            } else if (attributeValue.startsWith(StubApp.getString2(24850), i3)) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + string22);
                i3 += 2;
            } else {
                arrayList3.add("");
                int i10 = i3 + 1;
                int indexOf2 = attributeValue.indexOf(string22, i10);
                String substring = attributeValue.substring(i10, indexOf2);
                if (substring.equals(StubApp.getString2(24851))) {
                    arrayList2.add(1);
                } else {
                    int indexOf3 = substring.indexOf(StubApp.getString2(24852));
                    if (indexOf3 != -1) {
                        string2 = substring.substring(indexOf3);
                        String string23 = StubApp.getString2(1315);
                        if (!string2.endsWith(string23) && !string2.endsWith(StubApp.getString2(925)) && !string2.endsWith(StubApp.getString2(4926))) {
                            string2 = string2.concat(string23);
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        string2 = StubApp.getString2(24853);
                    }
                    substring.getClass();
                    switch (substring.hashCode()) {
                        case -1950496919:
                            if (substring.equals(StubApp.getString2(24854))) {
                                z2 = false;
                                break;
                            }
                            break;
                        case 2606829:
                            if (substring.equals(StubApp.getString2(9909))) {
                                z2 = true;
                                break;
                            }
                            break;
                        case 38199441:
                            if (substring.equals(StubApp.getString2(2408))) {
                                z2 = 2;
                                break;
                            }
                            break;
                    }
                    z2 = -1;
                    switch (z2) {
                        case false:
                            arrayList2.add(2);
                            break;
                        case true:
                            arrayList2.add(4);
                            break;
                        case true:
                            arrayList2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException(StubApp.getString2(24855).concat(attributeValue));
                    }
                    arrayList3.set(arrayList2.size() - 1, string2);
                }
                arrayList.add("");
                i3 = indexOf2 + 1;
            }
        }
        return new C1608a(arrayList, arrayList2, arrayList3);
    }

    @Override // P0.q
    public final Object d(Uri uri, C1710j c1710j) {
        try {
            XmlPullParser newPullParser = this.f23670a.newPullParser();
            newPullParser.setInput(c1710j, null);
            if (newPullParser.next() == 2 && StubApp.getString2("24837").equals(newPullParser.getName())) {
                return l(newPullParser, uri);
            }
            throw C1406C.b(StubApp.getString2("24856"), null);
        } catch (XmlPullParserException e10) {
            throw C1406C.b(null, e10);
        }
    }
}
