package w1;

import B3.s;
import Z9.n;
import a.AbstractC0378a;
import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.eac.EACTags;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p0.AbstractC1482f;
import q1.k;
import q1.l;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.InterfaceC1542c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f22068b = Pattern.compile(StubApp.getString2(23766));

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f22069c = Pattern.compile(StubApp.getString2(23767));

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f22070d = Pattern.compile(StubApp.getString2(23768));

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f22071e = Pattern.compile(StubApp.getString2(23769));

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f22072f = Pattern.compile(StubApp.getString2(23770));

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f22073g = Pattern.compile(StubApp.getString2(23771));

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f22074h = Pattern.compile(StubApp.getString2(23772));
    public static final d j = new d(30.0f, 1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f22075a;

    public e() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f22075a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException(StubApp.getString2(23055), e10);
        }
    }

    public static g a(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    public static boolean b(String str) {
        return str.equals(StubApp.getString2(23773)) || str.equals(StubApp.getString2(17134)) || str.equals(StubApp.getString2(9806)) || str.equals(StubApp.getString2(8089)) || str.equals(StubApp.getString2(2372)) || str.equals(StubApp.getString2(23774)) || str.equals(StubApp.getString2(23765)) || str.equals(StubApp.getString2(9982)) || str.equals(StubApp.getString2(23775)) || str.equals(StubApp.getString2(23776)) || str.equals(StubApp.getString2(2051)) || str.equals(StubApp.getString2(2127)) || str.equals(StubApp.getString2(1483)) || str.equals(StubApp.getString2(1485)) || str.equals(StubApp.getString2(19074));
    }

    public static int c(XmlPullParser xmlPullParser) {
        String string2 = StubApp.getString2(23777);
        String attributeValue = xmlPullParser.getAttributeValue(StubApp.getString2(23778), StubApp.getString2(23779));
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f22074h.matcher(attributeValue);
        boolean matches = matcher.matches();
        String string22 = StubApp.getString2(23780);
        String string23 = StubApp.getString2(23781);
        if (!matches) {
            AbstractC1550k.w(string23, string22.concat(attributeValue));
            return 15;
        }
        boolean z2 = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z2 = false;
            }
            AbstractC1550k.b(string2 + parseInt + StubApp.getString2("397") + parseInt2, z2);
            return parseInt2;
        } catch (NumberFormatException unused) {
            AbstractC1550k.w(string23, string22.concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, g gVar) {
        Matcher matcher;
        char c10 = 65535;
        int i3 = AbstractC1560u.f20190a;
        String[] split = str.split(StubApp.getString2(23751), -1);
        int length = split.length;
        Pattern pattern = f22070d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new q1.f(AbstractC1482f.f(split.length, StubApp.getString2(1), new StringBuilder(StubApp.getString2(23785))));
            }
            matcher = pattern.matcher(split[1]);
            AbstractC1550k.w(StubApp.getString2(23781), StubApp.getString2(23782));
        }
        boolean matches = matcher.matches();
        String string2 = StubApp.getString2(11644);
        if (!matches) {
            throw new q1.f(E1.a.k(StubApp.getString2(23784), str, string2));
        }
        String group = matcher.group(3);
        group.getClass();
        switch (group.hashCode()) {
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                if (group.equals(StubApp.getString2(4964))) {
                    c10 = 0;
                    break;
                }
                break;
            case 3240:
                if (group.equals(StubApp.getString2(23014))) {
                    c10 = 1;
                    break;
                }
                break;
            case 3592:
                if (group.equals(StubApp.getString2(23013))) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                gVar.j = 3;
                break;
            case 1:
                gVar.j = 2;
                break;
            case 2:
                gVar.j = 1;
                break;
            default:
                throw new q1.f(E1.a.k(StubApp.getString2(23783), group, string2));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        gVar.f22094k = Float.parseFloat(group2);
    }

    public static d e(XmlPullParser xmlPullParser) {
        float f10;
        String string2 = StubApp.getString2(23778);
        String attributeValue = xmlPullParser.getAttributeValue(string2, StubApp.getString2(23786));
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue(string2, StubApp.getString2(23787));
        if (attributeValue2 != null) {
            int i3 = AbstractC1560u.f20190a;
            AbstractC1550k.b(StubApp.getString2(23788), attributeValue2.split(StubApp.getString2(397), -1).length == 2);
            f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f10 = 1.0f;
        }
        d dVar = j;
        int i10 = dVar.f22066b;
        String attributeValue3 = xmlPullParser.getAttributeValue(string2, StubApp.getString2(23789));
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue(string2, StubApp.getString2(23790));
        return new d(parseInt * f10, i10, attributeValue4 != null ? Integer.parseInt(attributeValue4) : dVar.f22067c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02cc A[LOOP:0: B:2:0x000a->B:21:0x02cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, Z9.n r23, java.util.HashMap r24, java.util.HashMap r25) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.e.f(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, Z9.n, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static c h(XmlPullParser xmlPullParser, c cVar, HashMap hashMap, d dVar) {
        char c10;
        char c11;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String str = null;
        g i3 = i(xmlPullParser, null);
        long j3 = -9223372036854775807L;
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        String[] strArr = null;
        String str2 = "";
        int i10 = 0;
        while (i10 < attributeCount) {
            long j13 = j3;
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals(StubApp.getString2(2051))) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals(StubApp.getString2(23804))) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals(StubApp.getString2(6550))) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals(StubApp.getString2(6523))) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals(StubApp.getString2(9982))) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals(StubApp.getString2(23803))) {
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
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        break;
                    }
                case 1:
                    j12 = j(attributeValue, dVar);
                    break;
                case 2:
                    j11 = j(attributeValue, dVar);
                    break;
                case 3:
                    j10 = j(attributeValue, dVar);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                        c11 = 65535;
                    } else {
                        int i11 = AbstractC1560u.f20190a;
                        c11 = 65535;
                        split = trim.split(StubApp.getString2(23751), -1);
                    }
                    if (split.length <= 0) {
                        break;
                    } else {
                        strArr = split;
                        break;
                    }
                case 5:
                    if (attributeValue.startsWith(StubApp.getString2(919))) {
                        str = attributeValue.substring(1);
                        break;
                    }
            }
            i10++;
            j3 = j13;
        }
        long j14 = j3;
        if (cVar != null) {
            long j15 = cVar.f22056d;
            if (j15 != j14) {
                if (j10 != j14) {
                    j10 += j15;
                }
                if (j11 != j14) {
                    j11 += j15;
                }
            }
        }
        long j16 = j10;
        if (j11 == j14) {
            if (j12 != j14) {
                j11 = j16 + j12;
            } else if (cVar != null) {
                long j17 = cVar.f22057e;
                if (j17 != j14) {
                    j11 = j17;
                }
            }
        }
        return new c(xmlPullParser.getName(), null, j16, j11, i3, strArr, str2, str, cVar);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:202)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static w1.g i(org.xmlpull.v1.XmlPullParser r21, w1.g r22) {
        /*
            Method dump skipped, instructions count: 1838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.e.i(org.xmlpull.v1.XmlPullParser, w1.g):w1.g");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ae, code lost:
    
        if (r13.equals(com.stub.StubApp.getString2(6642)) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long j(java.lang.String r13, w1.d r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.e.j(java.lang.String, w1.d):long");
    }

    public static n k(XmlPullParser xmlPullParser) {
        String m4 = AbstractC1550k.m(xmlPullParser, StubApp.getString2(18934));
        if (m4 == null) {
            return null;
        }
        Matcher matcher = f22073g.matcher(m4);
        boolean matches = matcher.matches();
        String string2 = StubApp.getString2(23781);
        if (!matches) {
            AbstractC1550k.w(string2, StubApp.getString2(23829).concat(m4));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new n(parseInt, Integer.parseInt(group2), 7);
        } catch (NumberFormatException unused) {
            AbstractC1550k.w(string2, StubApp.getString2(23830).concat(m4));
            return null;
        }
    }

    @Override // q1.l
    public final q1.d g(int i3, int i10, byte[] bArr) {
        try {
            XmlPullParser newPullParser = this.f22075a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            n nVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i3, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            d dVar = j;
            int i11 = 0;
            int i12 = 15;
            s sVar = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            dVar = e(newPullParser);
                            i12 = c(newPullParser);
                            nVar = k(newPullParser);
                        }
                        d dVar2 = dVar;
                        n nVar2 = nVar;
                        int i13 = i12;
                        if (b(name)) {
                            if (StubApp.getString2("17134").equals(name)) {
                                f(newPullParser, hashMap, i13, nVar2, hashMap2, hashMap3);
                            } else {
                                try {
                                    c h2 = h(newPullParser, cVar, hashMap2, dVar2);
                                    arrayDeque.push(h2);
                                    if (cVar != null) {
                                        if (cVar.f22064m == null) {
                                            cVar.f22064m = new ArrayList();
                                        }
                                        cVar.f22064m.add(h2);
                                    }
                                } catch (q1.f e10) {
                                    AbstractC1550k.x("TtmlParser", StubApp.getString2("23832"), e10);
                                }
                            }
                            i12 = i13;
                            nVar = nVar2;
                            dVar = dVar2;
                        } else {
                            AbstractC1550k.o("TtmlParser", StubApp.getString2("23831") + newPullParser.getName());
                        }
                        i11++;
                        i12 = i13;
                        nVar = nVar2;
                        dVar = dVar2;
                    } else if (eventType == 4) {
                        cVar.getClass();
                        c a3 = c.a(newPullParser.getText());
                        if (cVar.f22064m == null) {
                            cVar.f22064m = new ArrayList();
                        }
                        cVar.f22064m.add(a3);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            c cVar2 = (c) arrayDeque.peek();
                            cVar2.getClass();
                            sVar = new s(cVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                newPullParser.next();
            }
            sVar.getClass();
            return sVar;
        } catch (IOException e11) {
            throw new IllegalStateException(StubApp.getString2(23833), e11);
        } catch (XmlPullParserException e12) {
            throw new IllegalStateException(StubApp.getString2(23834), e12);
        }
    }

    @Override // q1.l
    public final void n(byte[] bArr, int i3, int i10, k kVar, InterfaceC1542c interfaceC1542c) {
        AbstractC0378a.D(g(i3, i10, bArr), kVar, interfaceC1542c);
    }

    @Override // q1.l
    public final int p() {
        return 1;
    }
}
