package K0;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.LinkedList;
import o0.C1406C;
import o0.C1438m;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i extends d {

    /* renamed from: e, reason: collision with root package name */
    public final String f3616e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedList f3617f;

    /* renamed from: g, reason: collision with root package name */
    public int f3618g;

    /* renamed from: h, reason: collision with root package name */
    public String f3619h;

    /* renamed from: i, reason: collision with root package name */
    public long f3620i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public String f3621k;

    /* renamed from: l, reason: collision with root package name */
    public int f3622l;

    /* renamed from: m, reason: collision with root package name */
    public int f3623m;

    /* renamed from: n, reason: collision with root package name */
    public int f3624n;

    /* renamed from: o, reason: collision with root package name */
    public int f3625o;

    /* renamed from: p, reason: collision with root package name */
    public String f3626p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f3627q;

    /* renamed from: r, reason: collision with root package name */
    public long f3628r;

    public i(d dVar, String str) {
        super(dVar, str, StubApp.getString2(3181));
        this.f3616e = str;
        this.f3617f = new LinkedList();
    }

    @Override // K0.d
    public final void a(Object obj) {
        if (obj instanceof C1438m) {
            this.f3617f.add((C1438m) obj);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v0 K0.b, still in use, count: 2, list:
          (r3v0 K0.b) from 0x0082: MOVE (r26v0 K0.b) = (r3v0 K0.b)
          (r3v0 K0.b) from 0x004e: MOVE (r26v4 K0.b) = (r3v0 K0.b)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // K0.d
    public final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.i.b():java.lang.Object");
    }

    @Override // K0.d
    public final boolean d(String str) {
        return StubApp.getString2(2376).equals(str);
    }

    @Override // K0.d
    public final void j(XmlPullParser xmlPullParser) {
        int i3 = 1;
        if (!StubApp.getString2(2376).equals(xmlPullParser.getName())) {
            String string2 = StubApp.getString2(3210);
            String attributeValue = xmlPullParser.getAttributeValue(null, string2);
            if (attributeValue == null) {
                throw new e(string2, 0);
            }
            if (!StubApp.getString2(643).equalsIgnoreCase(attributeValue)) {
                if (StubApp.getString2(3235).equalsIgnoreCase(attributeValue)) {
                    i3 = 2;
                } else {
                    if (!StubApp.getString2(613).equalsIgnoreCase(attributeValue)) {
                        throw C1406C.b(StubApp.getString2(3239) + attributeValue + StubApp.getString2(511), null);
                    }
                    i3 = 3;
                }
            }
            this.f3618g = i3;
            l(Integer.valueOf(i3), string2);
            int i10 = this.f3618g;
            String string22 = StubApp.getString2(3218);
            if (i10 == 3) {
                String attributeValue2 = xmlPullParser.getAttributeValue(null, string22);
                if (attributeValue2 == null) {
                    throw new e(string22, 0);
                }
                this.f3619h = attributeValue2;
            } else {
                this.f3619h = xmlPullParser.getAttributeValue(null, string22);
            }
            l(this.f3619h, string22);
            String string23 = StubApp.getString2(3222);
            String attributeValue3 = xmlPullParser.getAttributeValue(null, string23);
            this.j = attributeValue3;
            l(attributeValue3, string23);
            String string24 = StubApp.getString2(3236);
            String attributeValue4 = xmlPullParser.getAttributeValue(null, string24);
            if (attributeValue4 == null) {
                throw new e(string24, 0);
            }
            this.f3621k = attributeValue4;
            this.f3622l = d.g(xmlPullParser, StubApp.getString2(3212));
            this.f3623m = d.g(xmlPullParser, StubApp.getString2(3213));
            this.f3624n = d.g(xmlPullParser, StubApp.getString2(3237));
            this.f3625o = d.g(xmlPullParser, StubApp.getString2(3238));
            String string25 = StubApp.getString2(3224);
            String attributeValue5 = xmlPullParser.getAttributeValue(null, string25);
            this.f3626p = attributeValue5;
            l(attributeValue5, string25);
            String string26 = StubApp.getString2(3228);
            long g10 = d.g(xmlPullParser, string26);
            this.f3620i = g10;
            if (g10 == -1) {
                this.f3620i = ((Long) c(string26)).longValue();
            }
            this.f3627q = new ArrayList();
            return;
        }
        int size = this.f3627q.size();
        long h2 = d.h(xmlPullParser, StubApp.getString2(1310), -9223372036854775807L);
        if (h2 == -9223372036854775807L) {
            if (size == 0) {
                h2 = 0;
            } else {
                if (this.f3628r == -1) {
                    throw C1406C.b(StubApp.getString2(3233), null);
                }
                h2 = this.f3628r + ((Long) this.f3627q.get(size - 1)).longValue();
            }
        }
        this.f3627q.add(Long.valueOf(h2));
        this.f3628r = d.h(xmlPullParser, StubApp.getString2(1315), -9223372036854775807L);
        long h4 = d.h(xmlPullParser, StubApp.getString2(1269), 1L);
        if (h4 > 1 && this.f3628r == -9223372036854775807L) {
            throw C1406C.b(StubApp.getString2(3234), null);
        }
        while (true) {
            long j = i3;
            if (j >= h4) {
                return;
            }
            this.f3627q.add(Long.valueOf((this.f3628r * j) + h2));
            i3++;
        }
    }
}
