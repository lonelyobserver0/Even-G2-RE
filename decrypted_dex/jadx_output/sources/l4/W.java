package l4;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.google.android.gms.internal.measurement.AbstractC0634j2;
import com.google.android.gms.internal.measurement.C0588a1;
import com.google.android.gms.internal.measurement.C0591b;
import com.google.android.gms.internal.measurement.C0593b1;
import com.google.android.gms.internal.measurement.C0603d1;
import com.google.android.gms.internal.measurement.C0604d2;
import com.google.android.gms.internal.measurement.C0608e1;
import com.google.android.gms.internal.measurement.C0613f1;
import com.google.android.gms.internal.measurement.C0623h1;
import com.google.android.gms.internal.measurement.C0628i1;
import com.google.android.gms.internal.measurement.C0643l1;
import com.google.android.gms.internal.measurement.C0648m1;
import com.google.android.gms.internal.measurement.C0653n1;
import com.google.android.gms.internal.measurement.C0668q1;
import com.google.android.gms.internal.measurement.C0677s1;
import com.google.android.gms.internal.measurement.C0686u0;
import com.google.android.gms.internal.measurement.C0687u1;
import com.google.android.gms.internal.measurement.C0692v1;
import com.google.android.gms.internal.measurement.C0697w1;
import com.google.android.gms.internal.measurement.C0698w2;
import com.google.android.gms.internal.measurement.C0701x0;
import com.google.android.gms.internal.measurement.C0711z0;
import com.google.android.gms.internal.measurement.I2;
import com.google.android.gms.internal.measurement.InterfaceC0664p2;
import com.google.android.gms.internal.measurement.InterfaceC0669q2;
import com.google.android.gms.internal.measurement.P3;
import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class W extends A1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16264d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(F1 f12, int i3) {
        super(f12);
        this.f16264d = i3;
    }

    public static final void A(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] split = str.split(StubApp.getString2(321));
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                x(builder, str3, string, set);
            }
        }
    }

    public static final void B(StringBuilder sb2, String str, C0668q1 c0668q1) {
        if (c0668q1 == null) {
            return;
        }
        w(sb2, 3);
        sb2.append(str);
        sb2.append(StubApp.getString2(20167));
        int s10 = c0668q1.s();
        String string2 = StubApp.getString2(81);
        if (s10 != 0) {
            w(sb2, 4);
            sb2.append(StubApp.getString2(20168));
            int i3 = 0;
            for (Long l9 : c0668q1.r()) {
                int i10 = i3 + 1;
                if (i3 != 0) {
                    sb2.append(string2);
                }
                sb2.append(l9);
                i3 = i10;
            }
            sb2.append('\n');
        }
        if (c0668q1.q() != 0) {
            w(sb2, 4);
            sb2.append(StubApp.getString2(20169));
            int i11 = 0;
            for (Long l10 : c0668q1.p()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(string2);
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        int u2 = c0668q1.u();
        String string22 = StubApp.getString2(20170);
        if (u2 != 0) {
            w(sb2, 4);
            sb2.append(StubApp.getString2(20171));
            int i13 = 0;
            for (C0603d1 c0603d1 : c0668q1.t()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(string2);
                }
                sb2.append(c0603d1.p() ? Integer.valueOf(c0603d1.q()) : null);
                sb2.append(StubApp.getString2(478));
                sb2.append(c0603d1.r() ? Long.valueOf(c0603d1.s()) : null);
                i13 = i14;
            }
            sb2.append(string22);
        }
        if (c0668q1.w() != 0) {
            w(sb2, 4);
            sb2.append(StubApp.getString2(20172));
            int i15 = 0;
            for (C0677s1 c0677s1 : c0668q1.v()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(string2);
                }
                sb2.append(c0677s1.p() ? Integer.valueOf(c0677s1.q()) : null);
                sb2.append(StubApp.getString2(20173));
                Iterator it = c0677s1.r().iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb2.append(string2);
                    }
                    sb2.append(longValue);
                    i17 = i18;
                }
                sb2.append(StubApp.getString2(511));
                i15 = i16;
            }
            sb2.append(string22);
        }
        w(sb2, 3);
        sb2.append(string22);
    }

    public static final void C(StringBuilder sb2, int i3, String str, Object obj) {
        if (obj == null) {
            return;
        }
        w(sb2, i3 + 1);
        sb2.append(str);
        sb2.append(StubApp.getString2(994));
        sb2.append(obj);
        sb2.append('\n');
    }

    public static final void D(StringBuilder sb2, int i3, String str, C0701x0 c0701x0) {
        if (c0701x0 == null) {
            return;
        }
        w(sb2, i3);
        sb2.append(str);
        sb2.append(StubApp.getString2(20167));
        if (c0701x0.p()) {
            int z2 = c0701x0.z();
            C(sb2, i3, StubApp.getString2(20177), z2 != 1 ? z2 != 2 ? z2 != 3 ? z2 != 4 ? StubApp.getString2(20174) : StubApp.getString2(20175) : StubApp.getString2(12306) : StubApp.getString2(12310) : StubApp.getString2(20176));
        }
        if (c0701x0.q()) {
            C(sb2, i3, StubApp.getString2(20178), Boolean.valueOf(c0701x0.r()));
        }
        if (c0701x0.s()) {
            C(sb2, i3, StubApp.getString2(20179), c0701x0.t());
        }
        if (c0701x0.u()) {
            C(sb2, i3, StubApp.getString2(20180), c0701x0.v());
        }
        if (c0701x0.w()) {
            C(sb2, i3, StubApp.getString2(20181), c0701x0.x());
        }
        w(sb2, i3);
        sb2.append(StubApp.getString2(20170));
    }

    private final void F() {
    }

    private final void G() {
    }

    private final void H() {
    }

    public static boolean Q(String str) {
        return str != null && str.matches(StubApp.getString2(20182)) && str.length() <= 310;
    }

    public static boolean R(InterfaceC0664p2 interfaceC0664p2, int i3) {
        if (i3 < ((C0698w2) interfaceC0664p2).f11762c * 64) {
            return ((1 << (i3 % 64)) & ((Long) ((C0698w2) interfaceC0664p2).get(i3 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList S(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i3 = 0; i3 < length; i3++) {
            long j = 0;
            for (int i10 = 0; i10 < 64; i10++) {
                int i11 = (i3 * 64) + i10;
                if (i11 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i11)) {
                    j |= 1 << i10;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static AbstractC0634j2 X(AbstractC0634j2 abstractC0634j2, byte[] bArr) {
        C0604d2 c0604d2;
        C0604d2 c0604d22 = C0604d2.f11473b;
        if (c0604d22 == null) {
            synchronized (C0604d2.class) {
                try {
                    c0604d2 = C0604d2.f11473b;
                    if (c0604d2 == null) {
                        I2 i22 = I2.f11287c;
                        c0604d2 = AbstractC0624h2.D();
                        C0604d2.f11473b = c0604d2;
                    }
                } finally {
                }
            }
            c0604d22 = c0604d2;
        }
        if (c0604d22 != null) {
            abstractC0634j2.getClass();
            abstractC0634j2.g(bArr, bArr.length, c0604d22);
            return abstractC0634j2;
        }
        abstractC0634j2.getClass();
        int length = bArr.length;
        C0604d2 c0604d23 = C0604d2.f11473b;
        I2 i23 = I2.f11287c;
        abstractC0634j2.g(bArr, length, C0604d2.f11474c);
        return abstractC0634j2;
    }

    public static int Y(C0648m1 c0648m1, String str) {
        for (int i3 = 0; i3 < ((C0653n1) c0648m1.f11593b).V1(); i3++) {
            if (str.equals(((C0653n1) c0648m1.f11593b).W1(i3).r())) {
                return i3;
            }
        }
        return -1;
    }

    public static Bundle[] Z(InterfaceC0669q2 interfaceC0669q2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = interfaceC0669q2.iterator();
        while (it.hasNext()) {
            C0628i1 c0628i1 = (C0628i1) it.next();
            if (c0628i1 != null) {
                Bundle bundle = new Bundle();
                for (C0628i1 c0628i12 : c0628i1.z()) {
                    if (c0628i12.r()) {
                        bundle.putString(c0628i12.q(), c0628i12.s());
                    } else if (c0628i12.t()) {
                        bundle.putLong(c0628i12.q(), c0628i12.u());
                    } else if (c0628i12.x()) {
                        bundle.putDouble(c0628i12.q(), c0628i12.y());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(a0((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(a0((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(a0((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap a0(android.os.Bundle r10, boolean r11) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r10.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r11 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = r6
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.HashMap r8 = a0(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = r6
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.HashMap r8 = a0(r8, r6)
            r5.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.HashMap r3 = a0(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.W.a0(android.os.Bundle, boolean):java.util.HashMap");
    }

    public static C1215v o(C0591b c0591b) {
        Object obj;
        Bundle p8 = p(c0591b.f11449c, true);
        String string2 = StubApp.getString2(6519);
        String string22 = (!p8.containsKey(string2) || (obj = p8.get(string2)) == null) ? StubApp.getString2(4849) : obj.toString();
        String g10 = A0.g(A0.f15899a, c0591b.f11447a, A0.f15901c);
        if (g10 == null) {
            g10 = c0591b.f11447a;
        }
        return new C1215v(g10, new C1213u(p8), string22, c0591b.f11448b);
    }

    public static Bundle p(Map map, boolean z2) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z2) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add(p((Map) arrayList.get(i3), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void q(C0608e1 c0608e1, String str, Long l9) {
        List h2 = c0608e1.h();
        int i3 = 0;
        while (true) {
            if (i3 >= h2.size()) {
                i3 = -1;
                break;
            } else if (str.equals(((C0628i1) h2.get(i3)).q())) {
                break;
            } else {
                i3++;
            }
        }
        C0623h1 B7 = C0628i1.B();
        B7.h(str);
        B7.j(l9.longValue());
        if (i3 < 0) {
            c0608e1.k(B7);
        } else {
            c0608e1.b();
            ((C0613f1) c0608e1.f11593b).A(i3, (C0628i1) B7.e());
        }
    }

    public static final Bundle r(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0628i1 c0628i1 = (C0628i1) it.next();
            String q10 = c0628i1.q();
            if (c0628i1.x()) {
                bundle.putDouble(q10, c0628i1.y());
            } else if (c0628i1.v()) {
                bundle.putFloat(q10, c0628i1.w());
            } else if (c0628i1.r()) {
                bundle.putString(q10, c0628i1.s());
            } else if (c0628i1.t()) {
                bundle.putLong(q10, c0628i1.u());
            }
        }
        return bundle;
    }

    public static final C0628i1 s(C0613f1 c0613f1, String str) {
        for (C0628i1 c0628i1 : c0613f1.p()) {
            if (c0628i1.q().equals(str)) {
                return c0628i1;
            }
        }
        return null;
    }

    public static final Serializable t(C0613f1 c0613f1, String str) {
        C0628i1 s10 = s(c0613f1, str);
        if (s10 == null) {
            return null;
        }
        return z(s10);
    }

    public static final void w(StringBuilder sb2, int i3) {
        for (int i10 = 0; i10 < i3; i10++) {
            sb2.append(StubApp.getString2(6127));
        }
    }

    public static final void x(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String y(boolean z2, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        if (z2) {
            sb2.append(StubApp.getString2(20183));
        }
        if (z10) {
            sb2.append(StubApp.getString2(20184));
        }
        if (z11) {
            sb2.append(StubApp.getString2(20185));
        }
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable z(C0628i1 c0628i1) {
        if (c0628i1.r()) {
            return c0628i1.s();
        }
        if (c0628i1.t()) {
            return Long.valueOf(c0628i1.u());
        }
        if (c0628i1.x()) {
            return Double.valueOf(c0628i1.y());
        }
        if (c0628i1.A() > 0) {
            return Z((InterfaceC0669q2) c0628i1.z());
        }
        return null;
    }

    public boolean E() {
        l();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((C1200n0) this.f4728a).f16536a.getSystemService(StubApp.getString2(1008));
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    public void I(C0692v1 c0692v1, Object obj) {
        S3.D.h(obj);
        c0692v1.b();
        ((C0697w1) c0692v1.f11593b).E();
        c0692v1.b();
        ((C0697w1) c0692v1.f11593b).G();
        c0692v1.b();
        ((C0697w1) c0692v1.f11593b).I();
        if (obj instanceof String) {
            c0692v1.b();
            ((C0697w1) c0692v1.f11593b).D((String) obj);
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            c0692v1.b();
            ((C0697w1) c0692v1.f11593b).F(longValue);
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            c0692v1.b();
            ((C0697w1) c0692v1.f11593b).H(doubleValue);
        } else {
            T t3 = ((C1200n0) this.f4728a).f16541f;
            C1200n0.l(t3);
            t3.f16242f.c(obj, StubApp.getString2(20186));
        }
    }

    public void J(String str, B1 b12, C0643l1 c0643l1, U u2) {
        String str2;
        URL url;
        byte[] a3;
        C1191k0 c1191k0;
        Map map;
        String str3 = b12.f15910a;
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        k();
        l();
        try {
            url = new URI(str3).toURL();
            this.f16651b.i0();
            a3 = c0643l1.a();
            c1191k0 = c1200n0.f16542g;
            C1200n0.l(c1191k0);
            map = b12.f15911b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            str2 = str;
        }
        try {
            c1191k0.w(new V(this, str2, url, a3, map, u2));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            S s10 = T.s(str2);
            t3.f16242f.d(StubApp.getString2(20187), s10, str3);
        }
    }

    public void K(C0623h1 c0623h1, Object obj) {
        c0623h1.b();
        ((C0628i1) c0623h1.f11593b).E();
        c0623h1.b();
        ((C0628i1) c0623h1.f11593b).G();
        c0623h1.b();
        ((C0628i1) c0623h1.f11593b).I();
        c0623h1.b();
        ((C0628i1) c0623h1.f11593b).L();
        if (obj instanceof String) {
            c0623h1.i((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c0623h1.j(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            c0623h1.b();
            ((C0628i1) c0623h1.f11593b).H(doubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            T t3 = ((C1200n0) this.f4728a).f16541f;
            C1200n0.l(t3);
            t3.f16242f.c(obj, StubApp.getString2(20188));
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                C0623h1 B7 = C0628i1.B();
                for (String str : bundle.keySet()) {
                    C0623h1 B9 = C0628i1.B();
                    B9.h(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        B9.j(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        B9.i((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double doubleValue2 = ((Double) obj2).doubleValue();
                        B9.b();
                        ((C0628i1) B9.f11593b).H(doubleValue2);
                    }
                    B7.b();
                    ((C0628i1) B7.f11593b).J((C0628i1) B9.e());
                }
                if (((C0628i1) B7.f11593b).A() > 0) {
                    arrayList.add((C0628i1) B7.e());
                }
            }
        }
        c0623h1.b();
        ((C0628i1) c0623h1.f11593b).K(arrayList);
    }

    public u1 L(String str, C0648m1 c0648m1, C0608e1 c0608e1, String str2) {
        int indexOf;
        P3.a();
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (!c1200n0.f16539d.u(str, AbstractC1148D.f15953P0)) {
            return null;
        }
        c1200n0.f16545l.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        C1147C c1147c = AbstractC1148D.f16021u0;
        C1178g c1178g = c1200n0.f16539d;
        String[] split = c1178g.q(str, c1147c).split(StubApp.getString2(321));
        HashSet hashSet = new HashSet(split.length);
        for (String str3 : split) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException(StubApp.getString2(20189) + ((Object) str3));
            }
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        F1 f12 = this.f16651b;
        C1 c12 = f12.f16067k;
        C1179g0 c1179g0 = c12.f16651b.f16059a;
        F1.S(c1179g0);
        String x7 = c1179g0.x(str);
        Uri.Builder builder = new Uri.Builder();
        C1200n0 c1200n02 = (C1200n0) c12.f4728a;
        builder.scheme(c1200n02.f16539d.q(str, AbstractC1148D.f16007n0));
        boolean isEmpty = TextUtils.isEmpty(x7);
        String string2 = StubApp.getString2(1);
        C1178g c1178g2 = c1200n02.f16539d;
        if (isEmpty) {
            builder.authority(c1178g2.q(str, AbstractC1148D.f16009o0));
        } else {
            String q10 = c1178g2.q(str, AbstractC1148D.f16009o0);
            StringBuilder sb2 = new StringBuilder(String.valueOf(x7).length() + 1 + String.valueOf(q10).length());
            sb2.append(x7);
            sb2.append(string2);
            sb2.append(q10);
            builder.authority(sb2.toString());
        }
        builder.path(c1178g2.q(str, AbstractC1148D.f16011p0));
        x(builder, StubApp.getString2(5221), ((C0653n1) c0648m1.f11593b).E(), unmodifiableSet);
        c1178g.p();
        x(builder, StubApp.getString2(19915), String.valueOf(130000L), unmodifiableSet);
        String y10 = ((C0653n1) c0648m1.f11593b).y();
        C1147C c1147c2 = AbstractC1148D.f15959S0;
        boolean u2 = c1178g.u(str, c1147c2);
        C1179g0 c1179g02 = f12.f16059a;
        if (u2) {
            F1.S(c1179g02);
            if (c1179g02.D(str)) {
                y10 = "";
            }
        }
        x(builder, StubApp.getString2(20190), y10, unmodifiableSet);
        x(builder, StubApp.getString2(20191), ((C0653n1) c0648m1.f11593b).v(), unmodifiableSet);
        x(builder, StubApp.getString2(20192), c0648m1.o(), unmodifiableSet);
        String l9 = c0608e1.l();
        String g10 = A0.g(A0.f15901c, l9, A0.f15899a);
        if (true != TextUtils.isEmpty(g10)) {
            l9 = g10;
        }
        x(builder, StubApp.getString2(20193), l9, unmodifiableSet);
        x(builder, StubApp.getString2(20029), String.valueOf(((C0653n1) c0648m1.f11593b).K()), unmodifiableSet);
        String i22 = ((C0653n1) c0648m1.f11593b).i2();
        if (c1178g.u(str, c1147c2)) {
            F1.S(c1179g02);
            if (c1179g02.C(str) && !TextUtils.isEmpty(i22) && (indexOf = i22.indexOf(string2)) != -1) {
                i22 = i22.substring(0, indexOf);
            }
        }
        x(builder, StubApp.getString2(20194), i22, unmodifiableSet);
        x(builder, StubApp.getString2(1350), String.valueOf(c0608e1.m()), unmodifiableSet);
        boolean x10 = ((C0653n1) c0648m1.f11593b).x();
        String string22 = StubApp.getString2(878);
        if (x10) {
            x(builder, StubApp.getString2(2176), string22, unmodifiableSet);
        }
        x(builder, StubApp.getString2(20195), String.valueOf(((C0653n1) c0648m1.f11593b).G0()), unmodifiableSet);
        x(builder, StubApp.getString2(20196), string22, unmodifiableSet);
        x(builder, StubApp.getString2(20197), String.valueOf(currentTimeMillis), unmodifiableSet);
        x(builder, StubApp.getString2(20198), str2, unmodifiableSet);
        List<C0628i1> h2 = c0608e1.h();
        Bundle bundle = new Bundle();
        for (C0628i1 c0628i1 : h2) {
            String q11 = c0628i1.q();
            if (c0628i1.x()) {
                bundle.putString(q11, String.valueOf(c0628i1.y()));
            } else if (c0628i1.v()) {
                bundle.putString(q11, String.valueOf(c0628i1.w()));
            } else if (c0628i1.r()) {
                bundle.putString(q11, c0628i1.s());
            } else if (c0628i1.t()) {
                bundle.putString(q11, String.valueOf(c0628i1.u()));
            }
        }
        String q12 = c1178g.q(str, AbstractC1148D.f16019t0);
        String string23 = StubApp.getString2(3048);
        A(builder, q12.split(string23), bundle, unmodifiableSet);
        List<C0697w1> unmodifiableList = Collections.unmodifiableList(((C0653n1) c0648m1.f11593b).U1());
        Bundle bundle2 = new Bundle();
        for (C0697w1 c0697w1 : unmodifiableList) {
            String r8 = c0697w1.r();
            if (c0697w1.y()) {
                bundle2.putString(r8, String.valueOf(c0697w1.z()));
            } else if (c0697w1.w()) {
                bundle2.putString(r8, String.valueOf(c0697w1.x()));
            } else if (c0697w1.s()) {
                bundle2.putString(r8, c0697w1.t());
            } else if (c0697w1.u()) {
                bundle2.putString(r8, String.valueOf(c0697w1.v()));
            }
        }
        A(builder, c1178g.q(str, AbstractC1148D.f16017s0).split(string23), bundle2, unmodifiableSet);
        if (true != ((C0653n1) c0648m1.f11593b).D0()) {
            string22 = StubApp.getString2(824);
        }
        x(builder, StubApp.getString2(20199), string22, unmodifiableSet);
        if (!((C0653n1) c0648m1.f11593b).F0().isEmpty()) {
            x(builder, StubApp.getString2(20200), ((C0653n1) c0648m1.f11593b).F0(), unmodifiableSet);
        }
        if (((C0653n1) c0648m1.f11593b).L0()) {
            com.google.android.gms.internal.measurement.S0 M02 = ((C0653n1) c0648m1.f11593b).M0();
            if (!M02.z().isEmpty()) {
                x(builder, StubApp.getString2(20201), M02.z(), unmodifiableSet);
            }
            if (!M02.B().isEmpty()) {
                x(builder, StubApp.getString2(20202), M02.B(), unmodifiableSet);
            }
            if (!M02.D().isEmpty()) {
                x(builder, StubApp.getString2(20203), M02.D(), unmodifiableSet);
            }
            if (M02.F() > 0) {
                x(builder, StubApp.getString2(20204), String.valueOf(M02.F()), unmodifiableSet);
            }
            if (!M02.H().isEmpty()) {
                x(builder, StubApp.getString2(20205), M02.H(), unmodifiableSet);
            }
            if (!M02.J().isEmpty()) {
                x(builder, StubApp.getString2(20206), M02.J(), unmodifiableSet);
            }
            if (!M02.L().isEmpty()) {
                x(builder, StubApp.getString2(20207), M02.L(), unmodifiableSet);
            }
            if (M02.N() > 0) {
                x(builder, StubApp.getString2(20208), String.valueOf(M02.N()), unmodifiableSet);
            }
        }
        return new u1(currentTimeMillis, builder.build().toString(), 1);
    }

    public C0613f1 M(r rVar) {
        C0608e1 z2 = C0613f1.z();
        z2.b();
        ((C0613f1) z2.f11593b).H(rVar.f16599c);
        C1213u c1213u = (C1213u) rVar.f16603g;
        Objects.requireNonNull(c1213u);
        Bundle bundle = c1213u.f16633a;
        for (String str : bundle.keySet()) {
            C0623h1 B7 = C0628i1.B();
            B7.h(str);
            Object obj = bundle.get(str);
            S3.D.h(obj);
            K(B7, obj);
            z2.k(B7);
        }
        String str2 = (String) rVar.f16602f;
        if (!TextUtils.isEmpty(str2)) {
            String string2 = StubApp.getString2(6519);
            if (bundle.get(string2) == null) {
                C0623h1 B9 = C0628i1.B();
                B9.h(string2);
                B9.i(str2);
                z2.j((C0628i1) B9.e());
            }
        }
        return (C0613f1) z2.e();
    }

    public String N(C0643l1 c0643l1) {
        com.google.android.gms.internal.measurement.V0 I02;
        StringBuilder b2 = AbstractC1856e.b(StubApp.getString2(20209));
        if (c0643l1.u()) {
            C(b2, 0, StubApp.getString2(20210), c0643l1.v());
        }
        if (c0643l1.s()) {
            C(b2, 0, StubApp.getString2(20211), c0643l1.t());
        }
        for (C0653n1 c0653n1 : c0643l1.p()) {
            if (c0653n1 != null) {
                w(b2, 1);
                b2.append(StubApp.getString2(20212));
                if (c0653n1.P()) {
                    C(b2, 1, StubApp.getString2(20213), Integer.valueOf(c0653n1.P0()));
                }
                C1200n0 c1200n0 = (C1200n0) this.f4728a;
                if (c1200n0.f16539d.u(c0653n1.p(), AbstractC1148D.f15947M0) && c0653n1.v0()) {
                    C(b2, 1, StubApp.getString2(20214), c0653n1.w0());
                }
                C(b2, 1, StubApp.getString2(17625), c0653n1.h2());
                if (c0653n1.r()) {
                    C(b2, 1, StubApp.getString2(19915), Long.valueOf(c0653n1.s()));
                }
                if (c0653n1.t()) {
                    C(b2, 1, StubApp.getString2(20215), Long.valueOf(c0653n1.u()));
                }
                if (c0653n1.r0()) {
                    C(b2, 1, StubApp.getString2(20216), Long.valueOf(c0653n1.s0()));
                }
                if (c0653n1.L()) {
                    C(b2, 1, StubApp.getString2(20217), Long.valueOf(c0653n1.M()));
                }
                C(b2, 1, StubApp.getString2(5221), c0653n1.E());
                C(b2, 1, StubApp.getString2(3132), c0653n1.p());
                C(b2, 1, StubApp.getString2(20029), c0653n1.q());
                if (c0653n1.J()) {
                    C(b2, 1, StubApp.getString2(20218), Integer.valueOf(c0653n1.K()));
                }
                C(b2, 1, StubApp.getString2(20219), c0653n1.I());
                if (c0653n1.z()) {
                    C(b2, 1, StubApp.getString2(20220), Long.valueOf(c0653n1.A()));
                }
                C(b2, 1, StubApp.getString2(20221), c0653n1.n2());
                if (c0653n1.X1()) {
                    C(b2, 1, StubApp.getString2(20222), Long.valueOf(c0653n1.Y1()));
                }
                if (c0653n1.Z1()) {
                    C(b2, 1, StubApp.getString2(20223), Long.valueOf(c0653n1.a2()));
                }
                if (c0653n1.b2()) {
                    C(b2, 1, StubApp.getString2(20224), Long.valueOf(c0653n1.c2()));
                }
                if (c0653n1.d2()) {
                    C(b2, 1, StubApp.getString2(20225), Long.valueOf(c0653n1.e2()));
                }
                if (c0653n1.f2()) {
                    C(b2, 1, StubApp.getString2(20226), Long.valueOf(c0653n1.g2()));
                }
                C(b2, 1, StubApp.getString2(20190), c0653n1.y());
                C(b2, 1, StubApp.getString2(20227), c0653n1.v());
                C(b2, 1, StubApp.getString2(20228), c0653n1.O());
                if (c0653n1.w()) {
                    C(b2, 1, StubApp.getString2(20229), Boolean.valueOf(c0653n1.x()));
                }
                C(b2, 1, StubApp.getString2(20194), c0653n1.i2());
                C(b2, 1, StubApp.getString2(19899), c0653n1.j2());
                C(b2, 1, StubApp.getString2(20230), c0653n1.k2());
                if (c0653n1.l2()) {
                    C(b2, 1, StubApp.getString2(20231), Integer.valueOf(c0653n1.m2()));
                }
                if (c0653n1.B()) {
                    C(b2, 1, StubApp.getString2(20232), Integer.valueOf(c0653n1.C()));
                }
                if (c0653n1.J0()) {
                    C(b2, 1, StubApp.getString2(20233), Integer.valueOf(c0653n1.K0()));
                }
                if (c0653n1.F()) {
                    C(b2, 1, StubApp.getString2(20234), Boolean.valueOf(c0653n1.G()));
                }
                C(b2, 1, StubApp.getString2(5170), c0653n1.D());
                if (c0653n1.p0()) {
                    C(b2, 1, StubApp.getString2(20235), Integer.valueOf(c0653n1.q0()));
                }
                if (c0653n1.t0()) {
                    C(b2, 1, StubApp.getString2(20236), c0653n1.u0());
                }
                if (c0653n1.C0()) {
                    C(b2, 1, StubApp.getString2(19867), Boolean.valueOf(c0653n1.D0()));
                }
                if (c0653n1.E0()) {
                    C(b2, 1, StubApp.getString2(20237), c0653n1.F0());
                }
                if (c0653n1.A0()) {
                    C(b2, 1, StubApp.getString2(20238), c0653n1.B0());
                }
                if (c0653n1.x0()) {
                    C(b2, 1, StubApp.getString2(20239), Long.valueOf(c0653n1.y0()));
                }
                P3.a();
                boolean u2 = c1200n0.f16539d.u(c0653n1.p(), AbstractC1148D.f15953P0);
                String string2 = StubApp.getString2(20170);
                if (u2) {
                    C(b2, 1, StubApp.getString2(20240), Integer.valueOf(c0653n1.G0()));
                    if (c0653n1.H0() && (I02 = c0653n1.I0()) != null) {
                        w(b2, 2);
                        b2.append(StubApp.getString2(20241));
                        C(b2, 2, StubApp.getString2(20242), Boolean.valueOf(I02.p()));
                        C(b2, 2, StubApp.getString2(20243), Boolean.valueOf(I02.q()));
                        C(b2, 2, StubApp.getString2(20244), Boolean.valueOf(I02.r()));
                        C(b2, 2, StubApp.getString2(20245), Boolean.valueOf(I02.s()));
                        C(b2, 2, StubApp.getString2(20246), Boolean.valueOf(I02.t()));
                        C(b2, 2, StubApp.getString2(20247), Boolean.valueOf(I02.u()));
                        C(b2, 2, StubApp.getString2(20248), Boolean.valueOf(I02.v()));
                        w(b2, 2);
                        b2.append(string2);
                    }
                }
                if (c0653n1.L0()) {
                    com.google.android.gms.internal.measurement.S0 M02 = c0653n1.M0();
                    w(b2, 2);
                    b2.append(StubApp.getString2(20249));
                    if (M02.y()) {
                        C(b2, 2, StubApp.getString2(20250), M02.z());
                    }
                    if (M02.A()) {
                        C(b2, 2, StubApp.getString2(20251), M02.B());
                    }
                    if (M02.C()) {
                        C(b2, 2, StubApp.getString2(20252), M02.D());
                    }
                    if (M02.E()) {
                        C(b2, 2, StubApp.getString2(20253), Long.valueOf(M02.F()));
                    }
                    if (M02.G()) {
                        C(b2, 2, StubApp.getString2(20254), M02.H());
                    }
                    if (M02.I()) {
                        C(b2, 2, StubApp.getString2(20255), M02.J());
                    }
                    if (M02.K()) {
                        C(b2, 2, StubApp.getString2(20256), M02.L());
                    }
                    if (M02.M()) {
                        C(b2, 2, StubApp.getString2(20257), Long.valueOf(M02.N()));
                    }
                    w(b2, 2);
                    b2.append(string2);
                }
                if (c0653n1.Q()) {
                    C(b2, 1, StubApp.getString2(20258), Long.valueOf(c0653n1.R()));
                }
                if (c0653n1.N0()) {
                    C0687u1 O02 = c0653n1.O0();
                    w(b2, 2);
                    b2.append(StubApp.getString2(20259));
                    int t3 = O02.t();
                    C(b2, 2, StubApp.getString2(3136), t3 != 1 ? t3 != 2 ? t3 != 3 ? t3 != 4 ? StubApp.getString2(20260) : StubApp.getString2(20261) : StubApp.getString2(20262) : StubApp.getString2(20263) : StubApp.getString2(20264));
                    C(b2, 2, StubApp.getString2(20265), Xa.h.C(O02.p()));
                    int u10 = O02.u();
                    C(b2, 2, StubApp.getString2(20272), u10 != 1 ? u10 != 2 ? u10 != 3 ? u10 != 4 ? u10 != 5 ? StubApp.getString2(20266) : StubApp.getString2(20267) : StubApp.getString2(20268) : StubApp.getString2(20269) : StubApp.getString2(20270) : StubApp.getString2(20271));
                    w(b2, 2);
                    b2.append(string2);
                }
                if (c0653n1.S()) {
                    C0593b1 T7 = c0653n1.T();
                    w(b2, 2);
                    b2.append(StubApp.getString2(20273));
                    for (C0588a1 c0588a1 : T7.p()) {
                        w(b2, 3);
                        b2.append(StubApp.getString2(20274));
                        int q10 = c0588a1.q();
                        C(b2, 3, StubApp.getString2(660), q10 != 1 ? q10 != 2 ? q10 != 3 ? q10 != 4 ? StubApp.getString2(6012) : StubApp.getString2(6011) : StubApp.getString2(6010) : StubApp.getString2(6009) : StubApp.getString2(20275));
                        int r8 = c0588a1.r();
                        C(b2, 3, StubApp.getString2(2774), r8 != 1 ? r8 != 2 ? StubApp.getString2(20276) : StubApp.getString2(20277) : StubApp.getString2(20278));
                        w(b2, 3);
                        b2.append(string2);
                    }
                    w(b2, 2);
                    b2.append(string2);
                }
                InterfaceC0669q2<C0697w1> U12 = c0653n1.U1();
                String string22 = StubApp.getString2(ModuleDescriptor.MODULE_VERSION);
                C1159O c1159o = c1200n0.f16544k;
                if (U12 != null) {
                    for (C0697w1 c0697w1 : U12) {
                        if (c0697w1 != null) {
                            w(b2, 2);
                            b2.append(StubApp.getString2(20279));
                            C(b2, 2, StubApp.getString2(20280), c0697w1.p() ? Long.valueOf(c0697w1.q()) : null);
                            C(b2, 2, string22, c1159o.c(c0697w1.r()));
                            C(b2, 2, StubApp.getString2(20281), c0697w1.t());
                            C(b2, 2, StubApp.getString2(20282), c0697w1.u() ? Long.valueOf(c0697w1.v()) : null);
                            C(b2, 2, StubApp.getString2(20283), c0697w1.y() ? Double.valueOf(c0697w1.z()) : null);
                            w(b2, 2);
                            b2.append(string2);
                        }
                    }
                }
                InterfaceC0669q2<com.google.android.gms.internal.measurement.X0> H2 = c0653n1.H();
                if (H2 != null) {
                    for (com.google.android.gms.internal.measurement.X0 x02 : H2) {
                        if (x02 != null) {
                            w(b2, 2);
                            b2.append(StubApp.getString2(20284));
                            if (x02.p()) {
                                C(b2, 2, StubApp.getString2(20285), Integer.valueOf(x02.q()));
                            }
                            if (x02.u()) {
                                C(b2, 2, StubApp.getString2(20286), Boolean.valueOf(x02.v()));
                            }
                            B(b2, StubApp.getString2(20287), x02.r());
                            if (x02.s()) {
                                B(b2, StubApp.getString2(20288), x02.t());
                            }
                            w(b2, 2);
                            b2.append(string2);
                        }
                    }
                }
                List<C0613f1> P12 = c0653n1.P1();
                if (P12 != null) {
                    for (C0613f1 c0613f1 : P12) {
                        if (c0613f1 != null) {
                            w(b2, 2);
                            b2.append(StubApp.getString2(20289));
                            C(b2, 2, string22, c1159o.a(c0613f1.s()));
                            if (c0613f1.t()) {
                                C(b2, 2, StubApp.getString2(19798), Long.valueOf(c0613f1.u()));
                            }
                            if (c0613f1.v()) {
                                C(b2, 2, StubApp.getString2(20290), Long.valueOf(c0613f1.w()));
                            }
                            if (c0613f1.x()) {
                                C(b2, 2, StubApp.getString2(20291), Integer.valueOf(c0613f1.y()));
                            }
                            if (c0613f1.q() != 0) {
                                u(b2, 2, (InterfaceC0669q2) c0613f1.p());
                            }
                            w(b2, 2);
                            b2.append(string2);
                        }
                    }
                }
                w(b2, 1);
                b2.append(string2);
            }
        }
        b2.append(StubApp.getString2(20292));
        return b2.toString();
    }

    public String O(C0711z0 c0711z0) {
        StringBuilder b2 = AbstractC1856e.b(StubApp.getString2(20293));
        if (c0711z0.p()) {
            C(b2, 0, StubApp.getString2(20294), Integer.valueOf(c0711z0.q()));
        }
        C(b2, 0, StubApp.getString2(20295), ((C1200n0) this.f4728a).f16544k.c(c0711z0.r()));
        String y10 = y(c0711z0.t(), c0711z0.u(), c0711z0.w());
        if (!y10.isEmpty()) {
            C(b2, 0, StubApp.getString2(20296), y10);
        }
        v(b2, 1, c0711z0.s());
        b2.append(StubApp.getString2(20170));
        return b2.toString();
    }

    public Parcelable P(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            } catch (T3.b unused) {
                T t3 = ((C1200n0) this.f4728a).f16541f;
                C1200n0.l(t3);
                t3.f16242f.b(StubApp.getString2("20297"));
            }
            return parcelable;
        } finally {
            obtain.recycle();
        }
    }

    public List T(InterfaceC0664p2 interfaceC0664p2, List list) {
        int i3;
        ArrayList arrayList = new ArrayList(interfaceC0664p2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            C1200n0 c1200n0 = (C1200n0) this.f4728a;
            if (intValue < 0) {
                T t3 = c1200n0.f16541f;
                C1200n0.l(t3);
                t3.j.c(num, StubApp.getString2(20298));
            } else {
                int intValue2 = num.intValue() / 64;
                if (intValue2 >= arrayList.size()) {
                    T t10 = c1200n0.f16541f;
                    C1200n0.l(t10);
                    t10.j.d(StubApp.getString2(20299), num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue2, Long.valueOf(((Long) arrayList.get(intValue2)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i10 = size2;
            i3 = size;
            size = i10;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i3);
    }

    public boolean U(long j, long j3) {
        if (j == 0 || j3 <= 0) {
            return true;
        }
        ((C1200n0) this.f4728a).f16545l.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j3;
    }

    public long V(byte[] bArr) {
        S3.D.h(bArr);
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        K1 k12 = c1200n0.j;
        C1200n0.j(k12);
        k12.k();
        MessageDigest B7 = K1.B();
        if (B7 != null) {
            return K1.C(B7.digest(bArr));
        }
        T t3 = c1200n0.f16541f;
        C1200n0.l(t3);
        t3.f16242f.b(StubApp.getString2(20300));
        return 0L;
    }

    public byte[] W(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            T t3 = ((C1200n0) this.f4728a).f16541f;
            C1200n0.l(t3);
            t3.f16242f.c(e10, StubApp.getString2(20301));
            throw e10;
        }
    }

    @Override // l4.A1
    public final void n() {
        int i3 = this.f16264d;
    }

    public void u(StringBuilder sb2, int i3, InterfaceC0669q2 interfaceC0669q2) {
        if (interfaceC0669q2 == null) {
            return;
        }
        int i10 = i3 + 1;
        Iterator it = interfaceC0669q2.iterator();
        while (it.hasNext()) {
            C0628i1 c0628i1 = (C0628i1) it.next();
            if (c0628i1 != null) {
                w(sb2, i10);
                sb2.append(StubApp.getString2(20302));
                C(sb2, i10, StubApp.getString2(ModuleDescriptor.MODULE_VERSION), c0628i1.p() ? ((C1200n0) this.f4728a).f16544k.b(c0628i1.q()) : null);
                C(sb2, i10, StubApp.getString2(20281), c0628i1.r() ? c0628i1.s() : null);
                C(sb2, i10, StubApp.getString2(20282), c0628i1.t() ? Long.valueOf(c0628i1.u()) : null);
                C(sb2, i10, StubApp.getString2(20283), c0628i1.x() ? Double.valueOf(c0628i1.y()) : null);
                if (c0628i1.A() > 0) {
                    u(sb2, i10, (InterfaceC0669q2) c0628i1.z());
                }
                w(sb2, i10);
                sb2.append(StubApp.getString2(20170));
            }
        }
    }

    public void v(StringBuilder sb2, int i3, C0686u0 c0686u0) {
        String string2;
        if (c0686u0 == null) {
            return;
        }
        w(sb2, i3);
        sb2.append(StubApp.getString2(20303));
        if (c0686u0.t()) {
            C(sb2, i3, StubApp.getString2(20304), Boolean.valueOf(c0686u0.u()));
        }
        if (c0686u0.v()) {
            C(sb2, i3, StubApp.getString2(20305), ((C1200n0) this.f4728a).f16544k.b(c0686u0.w()));
        }
        boolean p8 = c0686u0.p();
        String string22 = StubApp.getString2(20170);
        if (p8) {
            int i10 = i3 + 1;
            com.google.android.gms.internal.measurement.A0 q10 = c0686u0.q();
            if (q10 != null) {
                w(sb2, i10);
                sb2.append(StubApp.getString2(20306));
                if (q10.p()) {
                    switch (q10.x()) {
                        case 1:
                            string2 = StubApp.getString2(20311);
                            break;
                        case 2:
                            string2 = StubApp.getString2(20310);
                            break;
                        case 3:
                            string2 = StubApp.getString2(20309);
                            break;
                        case 4:
                            string2 = StubApp.getString2(20308);
                            break;
                        case 5:
                            string2 = StubApp.getString2(3417);
                            break;
                        case 6:
                            string2 = StubApp.getString2(13595);
                            break;
                        default:
                            string2 = StubApp.getString2(20307);
                            break;
                    }
                    C(sb2, i10, StubApp.getString2(20312), string2);
                }
                if (q10.q()) {
                    C(sb2, i10, StubApp.getString2(20313), q10.r());
                }
                if (q10.s()) {
                    C(sb2, i10, StubApp.getString2(20314), Boolean.valueOf(q10.t()));
                }
                if (q10.v() > 0) {
                    w(sb2, i3 + 2);
                    sb2.append(StubApp.getString2(20315));
                    for (String str : q10.u()) {
                        w(sb2, i3 + 3);
                        sb2.append(str);
                        sb2.append(StubApp.getString2(3692));
                    }
                    sb2.append(string22);
                }
                w(sb2, i10);
                sb2.append(string22);
            }
        }
        if (c0686u0.r()) {
            D(sb2, i3 + 1, StubApp.getString2(20316), c0686u0.s());
        }
        w(sb2, i3);
        sb2.append(string22);
    }
}
