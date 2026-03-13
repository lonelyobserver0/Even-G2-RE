package K0;

import T0.AbstractC0311b;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collections;
import o0.AbstractC1405B;
import o0.C1437l;
import o0.C1438m;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends d {

    /* renamed from: e, reason: collision with root package name */
    public C1438m f3607e;

    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList m(java.lang.String r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L98
            byte[] r10 = r0.AbstractC1560u.r(r10)
            byte[] r1 = r0.AbstractC1540a.f20137a
            int r1 = r10.length
            r2 = 4
            if (r1 > r2) goto L16
            goto L22
        L16:
            r1 = 0
            r3 = r1
        L18:
            if (r3 >= r2) goto L28
            r4 = r10[r3]
            byte[] r5 = r0.AbstractC1540a.f20137a
            r5 = r5[r3]
            if (r4 == r5) goto L25
        L22:
            r1 = 0
            goto L8f
        L25:
            int r3 = r3 + 1
            goto L18
        L28:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = r1
        L2e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.add(r5)
            int r4 = r4 + r2
            int r5 = r10.length
            int r5 = r5 - r2
        L38:
            r6 = -1
            if (r4 > r5) goto L53
            int r7 = r10.length
            int r7 = r7 - r4
            if (r7 > r2) goto L40
            goto L4d
        L40:
            r7 = r1
        L41:
            if (r7 >= r2) goto L54
            int r8 = r4 + r7
            r8 = r10[r8]
            byte[] r9 = r0.AbstractC1540a.f20137a
            r9 = r9[r7]
            if (r8 == r9) goto L50
        L4d:
            int r4 = r4 + 1
            goto L38
        L50:
            int r7 = r7 + 1
            goto L41
        L53:
            r4 = r6
        L54:
            if (r4 != r6) goto L2e
            int r2 = r3.size()
            byte[][] r2 = new byte[r2][]
            r4 = r1
        L5d:
            int r5 = r3.size()
            if (r4 >= r5) goto L8e
            java.lang.Object r5 = r3.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r6 = r3.size()
            int r6 = r6 + (-1)
            if (r4 >= r6) goto L82
            int r6 = r4 + 1
            java.lang.Object r6 = r3.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            goto L83
        L82:
            int r6 = r10.length
        L83:
            int r6 = r6 - r5
            byte[] r7 = new byte[r6]
            java.lang.System.arraycopy(r10, r5, r7, r1, r6)
            r2[r4] = r7
            int r4 = r4 + 1
            goto L5d
        L8e:
            r1 = r2
        L8f:
            if (r1 != 0) goto L95
            r0.add(r10)
            return r0
        L95:
            java.util.Collections.addAll(r0, r1)
        L98:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.g.m(java.lang.String):java.util.ArrayList");
    }

    @Override // K0.d
    public final Object b() {
        return this.f3607e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List] */
    @Override // K0.d
    public final void j(XmlPullParser xmlPullParser) {
        int i3 = 0;
        C1437l c1437l = new C1437l();
        String string2 = StubApp.getString2(3187);
        String attributeValue = xmlPullParser.getAttributeValue(null, string2);
        if (attributeValue == null) {
            throw new e(string2, 0);
        }
        boolean equalsIgnoreCase = attributeValue.equalsIgnoreCase(StubApp.getString2(2440));
        String string22 = StubApp.getString2(468);
        String string23 = (equalsIgnoreCase || attributeValue.equalsIgnoreCase(StubApp.getString2(3188)) || attributeValue.equalsIgnoreCase(StubApp.getString2(3189)) || attributeValue.equalsIgnoreCase(StubApp.getString2(3190))) ? StubApp.getString2(469) : (attributeValue.equalsIgnoreCase(StubApp.getString2(3191)) || attributeValue.equalsIgnoreCase(StubApp.getString2(3192)) || attributeValue.equalsIgnoreCase(StubApp.getString2(3193)) || attributeValue.equalsIgnoreCase(StubApp.getString2(3194))) ? string22 : (attributeValue.equalsIgnoreCase(StubApp.getString2(3195)) || attributeValue.equalsIgnoreCase(StubApp.getString2(3196))) ? StubApp.getString2(3209) : (attributeValue.equalsIgnoreCase(StubApp.getString2(3197)) || attributeValue.equalsIgnoreCase(StubApp.getString2(3198))) ? StubApp.getString2(1629) : (attributeValue.equalsIgnoreCase(StubApp.getString2(3199)) || attributeValue.equalsIgnoreCase(StubApp.getString2(3200))) ? StubApp.getString2(935) : attributeValue.equalsIgnoreCase(StubApp.getString2(3201)) ? StubApp.getString2(3202) : (attributeValue.equalsIgnoreCase(StubApp.getString2(3203)) || attributeValue.equalsIgnoreCase(StubApp.getString2(3204))) ? StubApp.getString2(3208) : attributeValue.equalsIgnoreCase(StubApp.getString2(3205)) ? StubApp.getString2(3206) : attributeValue.equalsIgnoreCase(StubApp.getString2(3207)) ? StubApp.getString2(1609) : null;
        int intValue = ((Integer) c(StubApp.getString2(3210))).intValue();
        String string24 = StubApp.getString2(3211);
        if (intValue == 2) {
            ArrayList m4 = m(xmlPullParser.getAttributeValue(null, string24));
            c1437l.f18176l = AbstractC1405B.m(StubApp.getString2(880));
            c1437l.f18184t = d.i(xmlPullParser, StubApp.getString2(3212));
            c1437l.f18185u = d.i(xmlPullParser, StubApp.getString2(3213));
            c1437l.f18180p = m4;
        } else if (intValue == 1) {
            if (string23 == null) {
                string23 = string22;
            }
            int i10 = d.i(xmlPullParser, StubApp.getString2(3214));
            int i11 = d.i(xmlPullParser, StubApp.getString2(3215));
            ArrayList m10 = m(xmlPullParser.getAttributeValue(null, string24));
            boolean isEmpty = m10.isEmpty();
            ArrayList arrayList = m10;
            if (isEmpty) {
                arrayList = m10;
                if (string22.equals(string23)) {
                    arrayList = Collections.singletonList(AbstractC0311b.a(i11, i10));
                }
            }
            c1437l.f18176l = AbstractC1405B.m(StubApp.getString2(3216));
            c1437l.f18156B = i10;
            c1437l.f18157C = i11;
            c1437l.f18180p = arrayList;
        } else {
            String string25 = StubApp.getString2(3217);
            if (intValue == 3) {
                String str = (String) c(StubApp.getString2(3218));
                if (str != null) {
                    if (str.equals(StubApp.getString2(3219))) {
                        i3 = 64;
                    } else if (str.equals(StubApp.getString2(3220))) {
                        i3 = 1024;
                    }
                }
                c1437l.f18176l = AbstractC1405B.m(string25);
                c1437l.f18171f = i3;
            } else {
                c1437l.f18176l = AbstractC1405B.m(string25);
            }
        }
        c1437l.f18166a = xmlPullParser.getAttributeValue(null, StubApp.getString2(3221));
        c1437l.f18167b = (String) c(StubApp.getString2(3222));
        c1437l.f18177m = AbstractC1405B.m(string23);
        c1437l.f18173h = d.i(xmlPullParser, StubApp.getString2(3223));
        c1437l.f18169d = (String) c(StubApp.getString2(3224));
        this.f3607e = new C1438m(c1437l);
    }
}
