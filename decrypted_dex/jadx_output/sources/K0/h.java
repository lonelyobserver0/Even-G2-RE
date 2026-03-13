package K0;

import com.stub.StubApp;
import java.math.RoundingMode;
import java.util.LinkedList;
import o0.C1406C;
import o0.C1434i;
import o0.C1435j;
import o0.C1437l;
import o0.C1438m;
import org.xmlpull.v1.XmlPullParser;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h extends d {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedList f3608e;

    /* renamed from: f, reason: collision with root package name */
    public int f3609f;

    /* renamed from: g, reason: collision with root package name */
    public int f3610g;

    /* renamed from: h, reason: collision with root package name */
    public long f3611h;

    /* renamed from: i, reason: collision with root package name */
    public long f3612i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public int f3613k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3614l;

    /* renamed from: m, reason: collision with root package name */
    public a f3615m;

    public h(String str) {
        super(null, str, StubApp.getString2(3225));
        this.f3613k = -1;
        this.f3615m = null;
        this.f3608e = new LinkedList();
    }

    @Override // K0.d
    public final void a(Object obj) {
        if (obj instanceof b) {
            this.f3608e.add((b) obj);
        } else if (obj instanceof a) {
            AbstractC1550k.g(this.f3615m == null);
            this.f3615m = (a) obj;
        }
    }

    @Override // K0.d
    public final Object b() {
        a aVar;
        long R10;
        LinkedList linkedList = this.f3608e;
        int size = linkedList.size();
        b[] bVarArr = new b[size];
        linkedList.toArray(bVarArr);
        a aVar2 = this.f3615m;
        if (aVar2 != null) {
            C1435j c1435j = new C1435j(new C1434i(aVar2.f3574a, null, StubApp.getString2(880), aVar2.f3575b));
            for (int i3 = 0; i3 < size; i3++) {
                b bVar = bVarArr[i3];
                int i10 = bVar.f3577a;
                if (i10 == 2 || i10 == 1) {
                    int i11 = 0;
                    while (true) {
                        C1438m[] c1438mArr = bVar.j;
                        if (i11 < c1438mArr.length) {
                            C1437l a3 = c1438mArr[i11].a();
                            a3.f18181q = c1435j;
                            c1438mArr[i11] = new C1438m(a3);
                            i11++;
                        }
                    }
                }
            }
        }
        int i12 = this.f3609f;
        int i13 = this.f3610g;
        long j = this.f3611h;
        long j3 = this.f3612i;
        long j10 = this.j;
        int i14 = this.f3613k;
        boolean z2 = this.f3614l;
        a aVar3 = this.f3615m;
        long j11 = -9223372036854775807L;
        if (j3 == 0) {
            aVar = aVar3;
            R10 = -9223372036854775807L;
        } else {
            int i15 = AbstractC1560u.f20190a;
            aVar = aVar3;
            R10 = AbstractC1560u.R(j3, 1000000L, j, RoundingMode.DOWN);
        }
        if (j10 != 0) {
            int i16 = AbstractC1560u.f20190a;
            j11 = AbstractC1560u.R(j10, 1000000L, j, RoundingMode.DOWN);
        }
        return new c(i12, i13, R10, j11, i14, z2, aVar, bVarArr);
    }

    @Override // K0.d
    public final void j(XmlPullParser xmlPullParser) {
        this.f3609f = d.i(xmlPullParser, StubApp.getString2(3226));
        this.f3610g = d.i(xmlPullParser, StubApp.getString2(3227));
        String string2 = StubApp.getString2(3228);
        this.f3611h = d.h(xmlPullParser, string2, 10000000L);
        String string22 = StubApp.getString2(3229);
        String attributeValue = xmlPullParser.getAttributeValue(null, string22);
        if (attributeValue == null) {
            throw new e(string22, 0);
        }
        try {
            this.f3612i = Long.parseLong(attributeValue);
            this.j = d.h(xmlPullParser, StubApp.getString2(3230), 0L);
            this.f3613k = d.g(xmlPullParser, StubApp.getString2(3231));
            String attributeValue2 = xmlPullParser.getAttributeValue(null, StubApp.getString2(3232));
            this.f3614l = attributeValue2 != null ? Boolean.parseBoolean(attributeValue2) : false;
            l(Long.valueOf(this.f3611h), string2);
        } catch (NumberFormatException e10) {
            throw C1406C.b(null, e10);
        }
    }
}
