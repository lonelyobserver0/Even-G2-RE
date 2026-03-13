package b1;

import M4.F;
import M4.I;
import M4.Z;
import com.stub.StubApp;
import org.xmlpull.v1.XmlPullParser;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f10493a = {StubApp.getString2(8903), StubApp.getString2(8904), StubApp.getString2(8901), StubApp.getString2(8902)};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f10494b = {StubApp.getString2(8907), StubApp.getString2(8908), StubApp.getString2(8905), StubApp.getString2(8906)};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f10495c = {StubApp.getString2(8909), StubApp.getString2(8910)};

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r8 == (-1)) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        r8 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f6, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Cc.a a(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.d.a(java.lang.String):Cc.a");
    }

    public static Z b(XmlPullParser xmlPullParser, String str, String str2) {
        F l9 = I.l();
        String concat = str.concat(StubApp.getString2(8920));
        String concat2 = str.concat(StubApp.getString2(8921));
        do {
            xmlPullParser.next();
            if (AbstractC1550k.q(xmlPullParser, concat)) {
                String concat3 = str2.concat(StubApp.getString2(8922));
                String concat4 = str2.concat(StubApp.getString2(8923));
                String concat5 = str2.concat(StubApp.getString2(8924));
                String concat6 = str2.concat(StubApp.getString2(8925));
                String m4 = AbstractC1550k.m(xmlPullParser, concat3);
                String m10 = AbstractC1550k.m(xmlPullParser, concat4);
                String m11 = AbstractC1550k.m(xmlPullParser, concat5);
                String m12 = AbstractC1550k.m(xmlPullParser, concat6);
                if (m4 == null || m10 == null) {
                    return Z.f4578e;
                }
                l9.a(new b(m11 != null ? Long.parseLong(m11) : 0L, m4, m12 != null ? Long.parseLong(m12) : 0L));
            }
        } while (!AbstractC1550k.p(xmlPullParser, concat2));
        return l9.g();
    }
}
