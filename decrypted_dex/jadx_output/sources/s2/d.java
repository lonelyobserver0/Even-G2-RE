package s2;

import D5.B;
import H0.A;
import Kc.C0104k;
import Kc.InterfaceC0102i;
import N.InterfaceC0159e;
import P0.q;
import R8.C0251i;
import S3.C0282p;
import Z9.C;
import a0.C0386h;
import android.content.ClipData;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContentInfo;
import android.widget.TextView;
import androidx.work.impl.WorkDatabase;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.maps.MapboxMap;
import com.mapbox.navigator.RoadObject;
import com.mapbox.navigator.RoadObjectMatcherError;
import com.mapbox.navigator.RoadObjectMatcherListener;
import com.mapbox.navigator.RoadObjectType;
import com.stub.StubApp;
import d0.I;
import d0.M;
import f.InterfaceC0862b;
import java.io.IOException;
import java.security.DigestException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;
import o0.C1406C;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import r2.C1564b;
import t0.C1710j;
import vb.EnumC1846c;
import vb.InterfaceC1845b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d implements D0.c, InterfaceC1845b, P0.j, D3.b, q, InterfaceC0159e, R3.n, RoadObjectMatcherListener, InterfaceC0862b {

    /* renamed from: c, reason: collision with root package name */
    public static d f20710c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20711a;

    /* renamed from: b, reason: collision with root package name */
    public Object f20712b;

    public /* synthetic */ d(Object obj, int i3) {
        this.f20711a = i3;
        this.f20712b = obj;
    }

    public static String B(String str) {
        return str.startsWith(StubApp.getString2(5114)) ? str.substring(6) : str;
    }

    public static ArrayList j(NetworkCapabilities networkCapabilities) {
        ArrayList arrayList = new ArrayList();
        String string2 = StubApp.getString2(1337);
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
            arrayList.add(string2);
            return arrayList;
        }
        if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(5)) {
            arrayList.add(StubApp.getString2(5824));
        }
        if (networkCapabilities.hasTransport(3)) {
            arrayList.add(StubApp.getString2(23056));
        }
        if (networkCapabilities.hasTransport(4)) {
            arrayList.add(StubApp.getString2(5845));
        }
        if (networkCapabilities.hasTransport(0)) {
            arrayList.add(StubApp.getString2(23057));
        }
        if (networkCapabilities.hasTransport(2)) {
            arrayList.add(StubApp.getString2(1815));
        }
        if (arrayList.isEmpty() && networkCapabilities.hasCapability(12)) {
            arrayList.add(StubApp.getString2(23058));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(string2);
        }
        return arrayList;
    }

    public static boolean x(Bundle bundle) {
        String string2 = StubApp.getString2(23059);
        String string = bundle.getString(string2);
        String string22 = StubApp.getString2(878);
        if (string22.equals(string)) {
            return true;
        }
        return string22.equals(bundle.getString(string2.replace(StubApp.getString2(5114), StubApp.getString2(5115))));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
    
        if (r2 >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        if (r2 >= 34) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int A(o0.C1438m r7) {
        /*
            r6 = this;
            r0 = 4
            r1 = 1
            java.lang.String r2 = r7.f18216n
            r3 = 0
            if (r2 == 0) goto La7
            boolean r2 = o0.AbstractC1405B.j(r2)
            if (r2 != 0) goto Lf
            goto La7
        Lf:
            int r2 = r0.AbstractC1560u.f20190a
            java.lang.String r7 = r7.f18216n
            r7.getClass()
            int r2 = r0.AbstractC1560u.f20190a
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1487656890: goto L81;
                case -1487464693: goto L71;
                case -1487464690: goto L61;
                case -1487394660: goto L51;
                case -1487018032: goto L41;
                case -879272239: goto L31;
                case -879258763: goto L21;
                default: goto L20;
            }
        L20:
            goto L90
        L21:
            r5 = 6955(0x1b2b, float:9.746E-42)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L2f
            goto L90
        L2f:
            r4 = 6
            goto L90
        L31:
            r5 = 6954(0x1b2a, float:9.745E-42)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L3f
            goto L90
        L3f:
            r4 = 5
            goto L90
        L41:
            r5 = 523(0x20b, float:7.33E-43)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L4f
            goto L90
        L4f:
            r4 = r0
            goto L90
        L51:
            r5 = 6953(0x1b29, float:9.743E-42)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L5f
            goto L90
        L5f:
            r4 = 3
            goto L90
        L61:
            r5 = 524(0x20c, float:7.34E-43)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L6f
            goto L90
        L6f:
            r4 = 2
            goto L90
        L71:
            r5 = 22279(0x5707, float:3.122E-41)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L7f
            goto L90
        L7f:
            r4 = r1
            goto L90
        L81:
            r5 = 525(0x20d, float:7.36E-43)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L8f
            goto L90
        L8f:
            r4 = r3
        L90:
            switch(r4) {
                case 0: goto L99;
                case 1: goto L94;
                case 2: goto L94;
                case 3: goto L9d;
                case 4: goto L9d;
                case 5: goto L9d;
                case 6: goto L9d;
                default: goto L93;
            }
        L93:
            goto La2
        L94:
            r7 = 26
            if (r2 < r7) goto La2
            goto L9d
        L99:
            r7 = 34
            if (r2 < r7) goto La2
        L9d:
            int r7 = v0.AbstractC1810e.f(r0, r3, r3, r3)
            return r7
        La2:
            int r7 = v0.AbstractC1810e.f(r1, r3, r3, r3)
            return r7
        La7:
            int r7 = v0.AbstractC1810e.f(r3, r3, r3, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.d.A(o0.m):int");
    }

    public void C(C0104k value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((InterfaceC0102i) this.f20712b).q(value);
    }

    public void D(int i3, S9.d fieldEncoding) {
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        E((i3 << 3) | fieldEncoding.f6620a);
    }

    public void E(int i3) {
        while (true) {
            int i10 = i3 & (-128);
            InterfaceC0102i interfaceC0102i = (InterfaceC0102i) this.f20712b;
            if (i10 == 0) {
                interfaceC0102i.writeByte(i3);
                return;
            } else {
                interfaceC0102i.writeByte((i3 & CertificateBody.profileType) | 128);
                i3 >>>= 7;
            }
        }
    }

    public void F(long j) {
        while (true) {
            long j3 = (-128) & j;
            InterfaceC0102i interfaceC0102i = (InterfaceC0102i) this.f20712b;
            if (j3 == 0) {
                interfaceC0102i.writeByte((int) j);
                return;
            } else {
                interfaceC0102i.writeByte((((int) j) & CertificateBody.profileType) | 128);
                j >>>= 7;
            }
        }
    }

    @Override // N.InterfaceC0159e
    public ClipData a() {
        ClipData clip;
        clip = ((ContentInfo) this.f20712b).getClip();
        return clip;
    }

    @Override // R3.n
    public void accept(Object obj, Object obj2) {
        q4.k kVar = (q4.k) obj2;
        U3.a aVar = (U3.a) ((U3.d) obj).t();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(aVar.f10821g);
        int i3 = c4.c.f10823a;
        C0282p c0282p = (C0282p) this.f20712b;
        if (c0282p == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            c0282p.writeToParcel(obtain, 0);
        }
        try {
            aVar.f10820f.transact(1, obtain, null, 1);
            obtain.recycle();
            kVar.b(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public int b(int i3, int[] iArr) {
        int[] iArr2;
        V5.a aVar;
        int[] iArr3;
        E0 e02;
        int i10;
        E0 e03;
        E0 e04;
        int i11;
        int i12 = i3;
        int i13 = 1;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        int i14 = 0;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i15 = 1;
            while (i15 < length && iArr[i15] == 0) {
                i15++;
            }
            if (i15 == length) {
                iArr2 = new int[]{0};
            } else {
                int i16 = length - i15;
                int[] iArr4 = new int[i16];
                System.arraycopy(iArr, i15, iArr4, 0, i16);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i12];
        boolean z2 = true;
        int i17 = 0;
        while (true) {
            aVar = (V5.a) this.f20712b;
            if (i17 >= i12) {
                break;
            }
            int i18 = aVar.f7753a[aVar.f7759g + i17];
            if (i18 == 0) {
                i11 = iArr2[iArr2.length - 1];
            } else if (i18 == 1) {
                int i19 = 0;
                for (int i20 : iArr2) {
                    V5.a aVar2 = V5.a.f7746h;
                    i19 ^= i20;
                }
                i11 = i19;
            } else {
                int i21 = iArr2[0];
                int length2 = iArr2.length;
                for (int i22 = 1; i22 < length2; i22++) {
                    i21 = aVar.b(i18, i21) ^ iArr2[i22];
                }
                i11 = i21;
            }
            iArr5[(i12 - 1) - i17] = i11;
            if (i11 != 0) {
                z2 = false;
            }
            i17++;
        }
        if (z2) {
            return 0;
        }
        E0 e05 = new E0(aVar, iArr5);
        aVar.getClass();
        if (i12 < 0) {
            throw new IllegalArgumentException();
        }
        int[] iArr6 = new int[i12 + 1];
        iArr6[0] = 1;
        E0 e06 = new E0(aVar, iArr6);
        if (e06.A() >= e05.A()) {
            e06 = e05;
            e05 = e06;
        }
        E0 e07 = aVar.f7755c;
        E0 e08 = aVar.f7756d;
        E0 e09 = e06;
        E0 e010 = e05;
        E0 e011 = e09;
        E0 e012 = e07;
        while (e011.A() * 2 >= i12) {
            if (e011.F()) {
                throw new V5.b(StubApp.getString2(23062));
            }
            int a3 = aVar.a(e011.z(e011.A()));
            E0 e013 = e07;
            while (e010.A() >= e011.A() && !e010.F()) {
                int A4 = e010.A() - e011.A();
                int b2 = aVar.b(e010.z(e010.A()), a3);
                if (A4 < 0) {
                    throw new IllegalArgumentException();
                }
                if (b2 == 0) {
                    i10 = i13;
                    e03 = e07;
                } else {
                    int[] iArr7 = new int[A4 + 1];
                    iArr7[i14] = b2;
                    i10 = i13;
                    e03 = new E0(aVar, iArr7);
                }
                e013 = e013.u(e03);
                if (A4 < 0) {
                    throw new IllegalArgumentException();
                }
                V5.a aVar3 = (V5.a) e011.f16037b;
                if (b2 == 0) {
                    e04 = aVar3.f7755c;
                } else {
                    int[] iArr8 = (int[]) e011.f16038c;
                    int length3 = iArr8.length;
                    int[] iArr9 = new int[A4 + length3];
                    int i23 = 0;
                    while (i23 < length3) {
                        int i24 = i23;
                        iArr9[i24] = aVar3.b(iArr8[i24], b2);
                        i23 = i24 + 1;
                    }
                    e04 = new E0(aVar3, iArr9);
                }
                e010 = e010.u(e04);
                i13 = i10;
                i14 = 0;
            }
            int i25 = i13;
            e013.getClass();
            V5.a aVar4 = (V5.a) e08.f16037b;
            V5.a aVar5 = (V5.a) e013.f16037b;
            if (!aVar5.equals(aVar4)) {
                throw new IllegalArgumentException(StubApp.getString2(19664));
            }
            if (e013.F() || e08.F()) {
                e02 = aVar5.f7755c;
            } else {
                int[] iArr10 = (int[]) e013.f16038c;
                int length4 = iArr10.length;
                int[] iArr11 = (int[]) e08.f16038c;
                int length5 = iArr11.length;
                int[] iArr12 = new int[(length4 + length5) - 1];
                int i26 = 0;
                while (i26 < length4) {
                    int i27 = iArr10[i26];
                    int[] iArr13 = iArr10;
                    int i28 = 0;
                    while (i28 < length5) {
                        int i29 = i26 + i28;
                        int i30 = i28;
                        iArr12[i29] = iArr12[i29] ^ aVar5.b(i27, iArr11[i30]);
                        i28 = i30 + 1;
                    }
                    i26++;
                    iArr10 = iArr13;
                }
                e02 = new E0(aVar5, iArr12);
            }
            E0 u2 = e02.u(e012);
            if (e010.A() >= e011.A()) {
                throw new IllegalStateException(StubApp.getString2(23060) + e010 + StubApp.getString2(23061) + e011);
            }
            E0 e014 = e010;
            e010 = e011;
            e011 = e014;
            e012 = e08;
            i13 = i25;
            i14 = 0;
            e08 = u2;
            i12 = i3;
        }
        int i31 = i13;
        int i32 = i14;
        int z10 = e08.z(i32);
        if (z10 == 0) {
            throw new V5.b(StubApp.getString2(23065));
        }
        int a9 = aVar.a(z10);
        E0[] e0Arr = {e08.G(a9), e011.G(a9)};
        E0 e015 = e0Arr[i32];
        E0 e016 = e0Arr[i31];
        int A5 = e015.A();
        if (A5 == i31) {
            iArr3 = new int[]{e015.z(i31)};
        } else {
            int[] iArr14 = new int[A5];
            int i33 = i32;
            for (int i34 = 1; i34 < aVar.f7757e && i33 < A5; i34++) {
                if (e015.x(i34) == 0) {
                    iArr14[i33] = aVar.a(i34);
                    i33++;
                }
            }
            if (i33 != A5) {
                throw new V5.b(StubApp.getString2(23064));
            }
            iArr3 = iArr14;
        }
        int length6 = iArr3.length;
        int[] iArr15 = new int[length6];
        for (int i35 = i32; i35 < length6; i35++) {
            int a10 = aVar.a(iArr3[i35]);
            int i36 = 1;
            for (int i37 = i32; i37 < length6; i37++) {
                if (i35 != i37) {
                    int b10 = aVar.b(iArr3[i37], a10);
                    i36 = aVar.b(i36, (b10 & 1) == 0 ? b10 | 1 : b10 & (-2));
                }
            }
            int b11 = aVar.b(e016.x(a10), aVar.a(i36));
            iArr15[i35] = b11;
            if (aVar.f7759g != 0) {
                iArr15[i35] = aVar.b(b11, a10);
            }
        }
        for (int i38 = i32; i38 < iArr3.length; i38++) {
            int length7 = iArr.length - 1;
            int i39 = iArr3[i38];
            if (i39 == 0) {
                throw new IllegalArgumentException();
            }
            int i40 = length7 - aVar.f7754b[i39];
            if (i40 < 0) {
                throw new V5.b(StubApp.getString2(23063));
            }
            iArr[i40] = iArr[i40] ^ iArr15[i38];
        }
        return iArr3.length;
    }

    public boolean c(String str) {
        String v2 = v(str);
        return StubApp.getString2(878).equals(v2) || Boolean.parseBoolean(v2);
    }

    @Override // P0.q
    public Object d(Uri uri, C1710j c1710j) {
        try {
            XmlPullParser newPullParser = ((XmlPullParserFactory) this.f20712b).newPullParser();
            newPullParser.setInput(c1710j, null);
            return (K0.c) new K0.h(uri.toString()).e(newPullParser);
        } catch (XmlPullParserException e10) {
            throw C1406C.b(null, e10);
        }
    }

    @Override // N.InterfaceC0159e
    public int e() {
        int flags;
        flags = ((ContentInfo) this.f20712b).getFlags();
        return flags;
    }

    @Override // f.InterfaceC0862b
    public void f(Object obj) {
        Map map = (Map) obj;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            iArr[i3] = ((Boolean) arrayList.get(i3)).booleanValue() ? 0 : -1;
        }
        M m4 = (M) this.f20712b;
        I i10 = (I) m4.f13147F.pollFirst();
        String string2 = StubApp.getString2(49);
        if (i10 == null) {
            Log.w(string2, StubApp.getString2(23066) + this);
            return;
        }
        B b2 = m4.f13160c;
        String str = i10.f13137a;
        if (b2.z(str) == null) {
            Log.w(string2, StubApp.getString2(23067) + str);
        }
    }

    @Override // N.InterfaceC0159e
    public ContentInfo g() {
        return (ContentInfo) this.f20712b;
    }

    @Override // Pb.a
    public Object get() {
        return new I3.j((Context) ((F5.c) this.f20712b).f2238b, Integer.valueOf(I3.j.f3125d).intValue(), StubApp.getString2(23068));
    }

    @Override // N.InterfaceC0159e
    public int h() {
        int source;
        source = ((ContentInfo) this.f20712b).getSource();
        return source;
    }

    @Override // vb.InterfaceC1845b
    public void i(Db.c error) {
        switch (this.f20711a) {
            case 6:
                if (error instanceof Db.a) {
                    int i3 = ((Db.a) error).f1530a;
                    Gb.c cVar = (Gb.c) this.f20712b;
                    if (cVar.f21911c == i3) {
                        i3--;
                    }
                    if (cVar.c(i3)) {
                        synchronized (((Gb.c) this.f20712b)) {
                            Gb.c.f2460g.a(StubApp.getString2("23069"));
                        }
                        return;
                    }
                }
                Gb.c.d((Gb.c) this.f20712b);
                return;
            default:
                Intrinsics.checkNotNullParameter(error, "error");
                ((A8.a) this.f20712b).invoke(new Nb.i(error));
                return;
        }
    }

    public Integer k(String str) {
        String v2 = v(str);
        if (TextUtils.isEmpty(v2)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(v2));
        } catch (NumberFormatException unused) {
            Log.w(StubApp.getString2(5126), StubApp.getString2(23070) + B(str) + StubApp.getString2(2830) + v2 + StubApp.getString2(23071));
            return null;
        }
    }

    public JSONArray l(String str) {
        String v2 = v(str);
        if (TextUtils.isEmpty(v2)) {
            return null;
        }
        try {
            return new JSONArray(v2);
        } catch (JSONException unused) {
            Log.w(StubApp.getString2(5126), StubApp.getString2(23072) + B(str) + StubApp.getString2(994) + v2 + StubApp.getString2(23073));
            return null;
        }
    }

    @Override // vb.InterfaceC1845b
    public void m(Hb.b bVar) {
        switch (this.f20711a) {
            case 6:
                Kb.b bVar2 = (Kb.b) bVar;
                int i3 = bVar2.f3016rc;
                Gb.c cVar = (Gb.c) this.f20712b;
                if (i3 == 0) {
                    cVar.getClass();
                    throw null;
                }
                Gb.c.f2460g.l(Integer.valueOf(i3), StubApp.getString2(23075));
                new Db.b(EnumC1846c.a(bVar2.f3016rc));
                Gb.c.d(cVar);
                return;
            default:
                Kb.b response = (Kb.b) bVar;
                Intrinsics.checkNotNullParameter(response, "response");
                boolean areEqual = Intrinsics.areEqual(response.match, Boolean.FALSE);
                A8.a aVar = (A8.a) this.f20712b;
                if (areEqual) {
                    aVar.invoke(new Nb.i(new DigestException(StubApp.getString2(23074))));
                    return;
                }
                EnumC1846c a3 = EnumC1846c.a(response.f3016rc);
                Intrinsics.checkNotNullExpressionValue(a3, "getReturnCode(...)");
                aVar.invoke(new Nb.j(response, a3));
                return;
        }
    }

    public int[] n() {
        String string2 = StubApp.getString2(23076);
        String string22 = StubApp.getString2(23077);
        String string23 = StubApp.getString2(5126);
        JSONArray l9 = l(StubApp.getString2(23078));
        if (l9 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (l9.length() != 3) {
                throw new JSONException(StubApp.getString2("23080"));
            }
            int parseColor = Color.parseColor(l9.optString(0));
            if (parseColor == -16777216) {
                throw new IllegalArgumentException(StubApp.getString2("23079"));
            }
            iArr[0] = parseColor;
            iArr[1] = l9.optInt(1);
            iArr[2] = l9.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e10) {
            Log.w(string23, string22 + l9 + StubApp.getString2(2938) + e10.getMessage() + string2);
            return null;
        } catch (JSONException unused) {
            Log.w(string23, string22 + l9 + string2);
            return null;
        }
    }

    @Override // P0.j
    public /* bridge */ /* synthetic */ void o(P0.l lVar, long j, long j3, boolean z2) {
    }

    @Override // com.mapbox.navigator.RoadObjectMatcherListener
    public void onMatchingCancelled(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        RoadObjectType[] roadObjectTypeArr = C7.a.f1133a;
        RoadObjectMatcherError nativeError = new RoadObjectMatcherError(StubApp.getString2(23081), id);
        Intrinsics.checkNotNullParameter(nativeError, "nativeError");
        String roadObjectId = nativeError.getRoadObjectId();
        Intrinsics.checkNotNullExpressionValue(roadObjectId, "roadObjectId");
        String description = nativeError.getDescription();
        Intrinsics.checkNotNullExpressionValue(description, "description");
        Intrinsics.checkNotNullExpressionValue(ExpectedFactory.createError(new R7.d(roadObjectId, description)), "createError(\n           …     ),\n                )");
        Iterator it = ((CopyOnWriteArraySet) ((Q2.g) this.f20712b).f5712c).iterator();
        if (it.hasNext()) {
            throw com.mapbox.common.b.e(it);
        }
    }

    @Override // com.mapbox.navigator.RoadObjectMatcherListener
    public void onRoadObjectMatched(Expected roadObject) {
        Intrinsics.checkNotNullParameter(roadObject, "roadObject");
        boolean isValue = roadObject.isValue();
        String string2 = StubApp.getString2(23082);
        if (isValue) {
            RoadObjectType[] roadObjectTypeArr = C7.a.f1133a;
            Object value = roadObject.getValue();
            Intrinsics.checkNotNull(value);
            Intrinsics.checkNotNullExpressionValue(ExpectedFactory.createValue(C7.a.a((RoadObject) value)), string2);
        } else {
            RoadObjectType[] roadObjectTypeArr2 = C7.a.f1133a;
            Object error = roadObject.getError();
            Intrinsics.checkNotNull(error);
            RoadObjectMatcherError nativeError = (RoadObjectMatcherError) error;
            Intrinsics.checkNotNullParameter(nativeError, "nativeError");
            String roadObjectId = nativeError.getRoadObjectId();
            Intrinsics.checkNotNullExpressionValue(roadObjectId, "roadObjectId");
            String description = nativeError.getDescription();
            Intrinsics.checkNotNullExpressionValue(description, "description");
            Intrinsics.checkNotNullExpressionValue(ExpectedFactory.createError(new R7.d(roadObjectId, description)), string2);
        }
        Iterator it = ((CopyOnWriteArraySet) ((Q2.g) this.f20712b).f5712c).iterator();
        if (it.hasNext()) {
            throw com.mapbox.common.b.e(it);
        }
    }

    public Object[] p(String str) {
        JSONArray l9 = l(str.concat(StubApp.getString2(23083)));
        if (l9 == null) {
            return null;
        }
        int length = l9.length();
        String[] strArr = new String[length];
        for (int i3 = 0; i3 < length; i3++) {
            strArr[i3] = l9.optString(i3);
        }
        return strArr;
    }

    public String q(String str) {
        return v(str.concat(StubApp.getString2(23084)));
    }

    @Override // P0.j
    public /* bridge */ /* synthetic */ void r(P0.l lVar, long j, long j3) {
    }

    public Long s() {
        String string2 = StubApp.getString2(23085);
        String v2 = v(string2);
        if (TextUtils.isEmpty(v2)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(v2));
        } catch (NumberFormatException unused) {
            Log.w(StubApp.getString2(5126), StubApp.getString2(23070) + B(string2) + StubApp.getString2(2830) + v2 + StubApp.getString2(23086));
            return null;
        }
    }

    @Override // P0.j
    public A1.g t(P0.l lVar, long j, long j3, IOException iOException, int i3) {
        if (!((A) this.f20712b).f2469f) {
            C c10 = ((A) this.f20712b).f2464a;
        }
        return P0.o.f5430e;
    }

    public String toString() {
        switch (this.f20711a) {
            case 10:
                return StubApp.getString2(23088) + ((ContentInfo) this.f20712b) + StubApp.getString2(265);
            case 29:
                return String.format(StubApp.getString2(23087), Integer.valueOf(((int[]) this.f20712b).length));
            default:
                return super.toString();
        }
    }

    public String u(Resources resources, String str, String str2) {
        String v2 = v(str2);
        if (!TextUtils.isEmpty(v2)) {
            return v2;
        }
        String q10 = q(str2);
        if (!TextUtils.isEmpty(q10)) {
            int identifier = resources.getIdentifier(q10, StubApp.getString2(983), str);
            String string2 = StubApp.getString2(23089);
            String string22 = StubApp.getString2(5126);
            if (identifier == 0) {
                Log.w(string22, B(str2.concat(StubApp.getString2(23084))) + StubApp.getString2(23090) + str2 + string2);
                return null;
            }
            Object[] p8 = p(str2);
            if (p8 == null) {
                return resources.getString(identifier);
            }
            try {
                return resources.getString(identifier, p8);
            } catch (MissingFormatArgumentException e10) {
                Log.w(string22, StubApp.getString2(23091) + B(str2) + StubApp.getString2(994) + Arrays.toString(p8) + string2, e10);
            }
        }
        return null;
    }

    public String v(String str) {
        Bundle bundle = (Bundle) this.f20712b;
        if (!bundle.containsKey(str)) {
            String string2 = StubApp.getString2(5114);
            if (str.startsWith(string2)) {
                String replace = !str.startsWith(string2) ? str : str.replace(string2, StubApp.getString2(5115));
                if (bundle.containsKey(replace)) {
                    str = replace;
                }
            }
        }
        return bundle.getString(str);
    }

    public long[] w() {
        JSONArray l9 = l(StubApp.getString2(23092));
        if (l9 == null) {
            return null;
        }
        try {
            if (l9.length() <= 1) {
                throw new JSONException(StubApp.getString2("23093"));
            }
            int length = l9.length();
            long[] jArr = new long[length];
            for (int i3 = 0; i3 < length; i3++) {
                jArr[i3] = l9.optLong(i3);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w(StubApp.getString2(5126), StubApp.getString2(23094) + l9 + StubApp.getString2(23095));
            return null;
        }
    }

    public int y(int i3) {
        WorkDatabase workDatabase;
        int i10;
        synchronized (d.class) {
            try {
                String string2 = StubApp.getString2("18988");
                workDatabase = (WorkDatabase) this.f20712b;
                workDatabase.c();
                Long D6 = workDatabase.q().D(string2);
                int intValue = D6 != null ? D6.intValue() : 0;
                workDatabase.q().G(new C1564b(string2, intValue == Integer.MAX_VALUE ? 0 : intValue + 1));
                workDatabase.n();
                workDatabase.j();
                i10 = (intValue >= 0 && intValue <= i3) ? intValue : 0;
                ((WorkDatabase) this.f20712b).q().G(new C1564b(StubApp.getString2("18988"), 1));
            } catch (Throwable th) {
                workDatabase.j();
                throw th;
            } finally {
            }
        }
        return i10;
    }

    public Bundle z() {
        Bundle bundle = (Bundle) this.f20712b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith(StubApp.getString2(23096)) && !str.equals(StubApp.getString2(1518))) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public d(C0251i localDateProvider) {
        this.f20711a = 16;
        Intrinsics.checkNotNullParameter(localDateProvider, "localDateProvider");
        this.f20712b = localDateProvider;
    }

    public d(MapboxMap mapboxMap) {
        this.f20711a = 1;
        Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
        this.f20712b = mapboxMap;
    }

    public d(ClassLoader loader) {
        this.f20711a = 24;
        Intrinsics.checkNotNullParameter(loader, "loader");
        this.f20712b = loader;
    }

    public d(int i3) {
        this.f20711a = i3;
        switch (i3) {
            case 3:
                this.f20712b = new A1.a(4);
                return;
            case 9:
                try {
                    this.f20712b = XmlPullParserFactory.newInstance();
                    return;
                } catch (XmlPullParserException e10) {
                    throw new RuntimeException(StubApp.getString2(23055), e10);
                }
            case 25:
                this.f20712b = new HashMap();
                return;
            case 29:
                return;
            default:
                this.f20712b = new B0.d(5, 1.0f, false);
                return;
        }
    }

    public d(Bundle bundle) {
        this.f20711a = 4;
        if (bundle != null) {
            this.f20712b = new Bundle(bundle);
            return;
        }
        throw new NullPointerException(StubApp.getString2(1485));
    }

    public d(InterfaceC0102i sink) {
        this.f20711a = 17;
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f20712b = sink;
    }

    public d(TextView textView) {
        this.f20711a = 27;
        this.f20712b = new C0386h(textView);
    }

    public d(C9.e suggestRouteUpdate) {
        this.f20711a = 14;
        Intrinsics.checkNotNullParameter(suggestRouteUpdate, "suggestRouteUpdate");
        this.f20712b = suggestRouteUpdate;
    }

    public d(ContentInfo contentInfo) {
        this.f20711a = 10;
        contentInfo.getClass();
        this.f20712b = C.n.i(contentInfo);
    }
}
