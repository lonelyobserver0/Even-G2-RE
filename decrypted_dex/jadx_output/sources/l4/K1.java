package l4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class K1 extends AbstractC1214u0 {
    public static final String[] j = {StubApp.getString2(19951), StubApp.getString2(19949), StubApp.getString2(19950)};

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f16125k = {StubApp.getString2(11891)};

    /* renamed from: c, reason: collision with root package name */
    public SecureRandom f16126c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f16127d;

    /* renamed from: e, reason: collision with root package name */
    public int f16128e;

    /* renamed from: f, reason: collision with root package name */
    public F1.h f16129f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f16130g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f16131h;

    public K1(C1200n0 c1200n0) {
        super(c1200n0);
        this.f16131h = null;
        this.f16127d = new AtomicLong(0L);
    }

    public static void A(J1 j12, String str, int i3, String str2, String str3, int i10) {
        Bundle bundle = new Bundle();
        d0(i3, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i3 == 6 || i3 == 7 || i3 == 2) {
            bundle.putLong(StubApp.getString2(11892), i10);
        }
        j12.a(str, StubApp.getString2(11891), bundle);
    }

    public static MessageDigest B() {
        MessageDigest messageDigest;
        for (int i3 = 0; i3 < 2; i3++) {
            try {
                messageDigest = MessageDigest.getInstance(StubApp.getString2("4894"));
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static long C(byte[] bArr) {
        S3.D.h(bArr);
        int length = bArr.length;
        if (length <= 0) {
            throw new IllegalStateException();
        }
        int i3 = 0;
        long j3 = 0;
        for (int i10 = length - 1; i10 >= 0 && i10 >= bArr.length - 8; i10--) {
            j3 += (bArr[i10] & 255) << i3;
            i3 += 8;
        }
        return j3;
    }

    public static boolean D(Context context) {
        ServiceInfo serviceInfo;
        String string2 = StubApp.getString2(19738);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, string2), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean G(String str) {
        String str2 = (String) AbstractC1148D.f16015r0.a(null);
        return str2.equals(StubApp.getString2(602)) || Arrays.asList(str2.split(StubApp.getString2(321))).contains(str);
    }

    public static boolean I(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(StubApp.getString2(4956));
    }

    public static boolean J(String str, String[] strArr) {
        S3.D.h(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] O(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static ArrayList Z(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1172e c1172e = (C1172e) it.next();
            Bundle bundle = new Bundle();
            bundle.putString(StubApp.getString2(3132), c1172e.f16410a);
            bundle.putString(StubApp.getString2(3353), c1172e.f16411b);
            bundle.putLong(StubApp.getString2(3138), c1172e.f16413d);
            bundle.putString(StubApp.getString2(ModuleDescriptor.MODULE_VERSION), c1172e.f16412c.f16100b);
            Object d8 = c1172e.f16412c.d();
            S3.D.h(d8);
            A0.c(bundle, d8);
            bundle.putBoolean(StubApp.getString2(12365), c1172e.f16414e);
            String str = c1172e.f16415f;
            if (str != null) {
                bundle.putString(StubApp.getString2(12356), str);
            }
            C1215v c1215v = c1172e.f16416g;
            if (c1215v != null) {
                bundle.putString(StubApp.getString2(12358), c1215v.f16638a);
                C1213u c1213u = c1215v.f16639b;
                if (c1213u != null) {
                    bundle.putBundle(StubApp.getString2(12359), c1213u.i());
                }
            }
            bundle.putLong(StubApp.getString2(12357), c1172e.f16417h);
            C1215v c1215v2 = c1172e.j;
            if (c1215v2 != null) {
                bundle.putString(StubApp.getString2(12360), c1215v2.f16638a);
                C1213u c1213u2 = c1215v2.f16639b;
                if (c1213u2 != null) {
                    bundle.putBundle(StubApp.getString2(12361), c1213u2.i());
                }
            }
            bundle.putLong(StubApp.getString2(12366), c1172e.f16412c.f16101c);
            bundle.putLong(StubApp.getString2(12362), c1172e.f16418k);
            C1215v c1215v3 = c1172e.f16419l;
            if (c1215v3 != null) {
                bundle.putString(StubApp.getString2(12363), c1215v3.f16638a);
                C1213u c1213u3 = c1215v3.f16639b;
                if (c1213u3 != null) {
                    bundle.putBundle(StubApp.getString2(12364), c1213u3.i());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean a0(Context context) {
        ActivityInfo receiverInfo;
        S3.D.h(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, StubApp.getString2("19952")), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static void b0(X0 x02, Bundle bundle, boolean z2) {
        String string2 = StubApp.getString2(19492);
        String string22 = StubApp.getString2(19490);
        String string23 = StubApp.getString2(19491);
        if (bundle != null && x02 != null) {
            if (!bundle.containsKey(string23) || z2) {
                String str = x02.f16317a;
                if (str != null) {
                    bundle.putString(string22, str);
                } else {
                    bundle.remove(string22);
                }
                String str2 = x02.f16318b;
                if (str2 != null) {
                    bundle.putString(string23, str2);
                } else {
                    bundle.remove(string23);
                }
                bundle.putLong(string2, x02.f16319c);
                return;
            }
            z2 = false;
        }
        if (bundle != null && x02 == null && z2) {
            bundle.remove(string22);
            bundle.remove(string23);
            bundle.remove(string2);
        }
    }

    public static final boolean d0(int i3, Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        String string2 = StubApp.getString2(11891);
        if (bundle.getLong(string2) != 0) {
            return false;
        }
        bundle.putLong(string2, i3);
        return true;
    }

    public static boolean i0(String str) {
        S3.D.e(str);
        return str.charAt(0) != '_' || str.equals(StubApp.getString2(19410));
    }

    public static String p(int i3, String str, boolean z2) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i3) {
            return str;
        }
        if (z2) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i3))).concat(StubApp.getString2(10450));
        }
        return null;
    }

    public static boolean s0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final F1.h E() {
        G1.e eVar;
        Object obj;
        if (this.f16129f == null) {
            Context context = ((C1200n0) this.f4728a).f16536a;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(19953));
            int i3 = Build.VERSION.SDK_INT;
            D1.c cVar = D1.c.f1267a;
            sb2.append(i3 >= 33 ? cVar.a() : 0);
            String sb3 = sb2.toString();
            String tag = StubApp.getString2(19954);
            Log.d(tag, sb3);
            if ((i3 >= 33 ? cVar.a() : 0) >= 5) {
                Intrinsics.checkNotNullParameter(context, "context");
                Object systemService = context.getSystemService((Class<Object>) C2.l.l());
                Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…ementManager::class.java)");
                eVar = new G1.b(C2.l.g(systemService));
            } else {
                D1.b bVar = D1.b.f1266a;
                if (((i3 == 31 || i3 == 32) ? bVar.a() : 0) >= 9) {
                    A8.a manager = new A8.a(context, 4);
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(tag, "tag");
                    Intrinsics.checkNotNullParameter(manager, "manager");
                    try {
                        obj = manager.invoke(context);
                    } catch (NoClassDefFoundError unused) {
                        StringBuilder sb4 = new StringBuilder(StubApp.getString2(19955));
                        int i10 = Build.VERSION.SDK_INT;
                        sb4.append((i10 == 31 || i10 == 32) ? bVar.a() : 0);
                        Log.d(tag, sb4.toString());
                        obj = null;
                    }
                    eVar = (G1.e) obj;
                } else {
                    eVar = null;
                }
            }
            this.f16129f = eVar != null ? new F1.h(eVar) : null;
        }
        return this.f16129f;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long F() {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.K1.F():long");
    }

    public final boolean H(String str) {
        k();
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (Y3.c.a(c1200n0.f16536a).f8739a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        T t3 = c1200n0.f16541f;
        C1200n0.l(t3);
        t3.f16248n.c(str, StubApp.getString2(19959));
        return false;
    }

    public final boolean K(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((C1200n0) this.f4728a).f16539d.o(StubApp.getString2(19729)).equals(str);
    }

    public final Bundle L(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object r8 = r(bundle.get(str), str);
                if (r8 == null) {
                    C1200n0 c1200n0 = (C1200n0) this.f4728a;
                    T t3 = c1200n0.f16541f;
                    C1200n0.l(t3);
                    t3.f16246l.c(c1200n0.f16544k.b(str), StubApp.getString2(19960));
                } else {
                    z(bundle2, str, r8);
                }
            }
        }
        return bundle2;
    }

    public final C1215v M(String str, Bundle bundle, String str2, long j3, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (o0(str) != 0) {
            C1200n0 c1200n0 = (C1200n0) this.f4728a;
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16242f.c(c1200n0.f16544k.c(str), StubApp.getString2(19961));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        String string2 = StubApp.getString2(6519);
        bundle2.putString(string2, str2);
        Bundle s10 = s(str, bundle2, Collections.singletonList(string2), true);
        if (z2) {
            s10 = L(s10);
        }
        S3.D.h(s10);
        return new C1215v(str, new C1213u(s10), str2, j3);
    }

    public final boolean N(Context context, String str) {
        Signature[] signatureArr;
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        X500Principal x500Principal = new X500Principal(StubApp.getString2(19962));
        try {
            PackageInfo b2 = Y3.c.a(context).b(64, str);
            if (b2 == null || (signatureArr = b2.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance(StubApp.getString2("19963")).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e10) {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16242f.c(e10, StubApp.getString2(3998));
            return true;
        } catch (CertificateException e11) {
            T t10 = c1200n0.f16541f;
            C1200n0.l(t10);
            t10.f16242f.c(e11, StubApp.getString2(19964));
            return true;
        }
    }

    public final boolean P(int i3) {
        Boolean bool = ((C1200n0) this.f4728a).o().f16481e;
        if (Q() < i3 / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int Q() {
        if (this.f16131h == null) {
            this.f16131h = Integer.valueOf(com.google.android.gms.common.e.getInstance().getApkVersion(((C1200n0) this.f4728a).f16536a) / 1000);
        }
        return this.f16131h.intValue();
    }

    public final void R(Bundle bundle, long j3) {
        String string2 = StubApp.getString2(3304);
        long j10 = bundle.getLong(string2);
        if (j10 != 0) {
            T t3 = ((C1200n0) this.f4728a).f16541f;
            C1200n0.l(t3);
            t3.j.c(Long.valueOf(j10), StubApp.getString2(19965));
        } else {
            j10 = 0;
        }
        bundle.putLong(string2, j3 + j10);
    }

    public final void S(String str, com.google.android.gms.internal.measurement.L l9) {
        Bundle bundle = new Bundle();
        bundle.putString(StubApp.getString2(1269), str);
        try {
            l9.y(bundle);
        } catch (RemoteException e10) {
            T t3 = ((C1200n0) this.f4728a).f16541f;
            C1200n0.l(t3);
            t3.j.c(e10, StubApp.getString2(19966));
        }
    }

    public final void T(com.google.android.gms.internal.measurement.L l9, long j3) {
        Bundle bundle = new Bundle();
        bundle.putLong(StubApp.getString2(1269), j3);
        try {
            l9.y(bundle);
        } catch (RemoteException e10) {
            T t3 = ((C1200n0) this.f4728a).f16541f;
            C1200n0.l(t3);
            t3.j.c(e10, StubApp.getString2(19967));
        }
    }

    public final void U(com.google.android.gms.internal.measurement.L l9, int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt(StubApp.getString2(1269), i3);
        try {
            l9.y(bundle);
        } catch (RemoteException e10) {
            T t3 = ((C1200n0) this.f4728a).f16541f;
            C1200n0.l(t3);
            t3.j.c(e10, StubApp.getString2(19968));
        }
    }

    public final void V(com.google.android.gms.internal.measurement.L l9, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(StubApp.getString2(1269), bArr);
        try {
            l9.y(bundle);
        } catch (RemoteException e10) {
            T t3 = ((C1200n0) this.f4728a).f16541f;
            C1200n0.l(t3);
            t3.j.c(e10, StubApp.getString2(19969));
        }
    }

    public final void W(com.google.android.gms.internal.measurement.L l9, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(StubApp.getString2(1269), z2);
        try {
            l9.y(bundle);
        } catch (RemoteException e10) {
            T t3 = ((C1200n0) this.f4728a).f16541f;
            C1200n0.l(t3);
            t3.j.c(e10, StubApp.getString2(19970));
        }
    }

    public final void X(com.google.android.gms.internal.measurement.L l9, Bundle bundle) {
        try {
            l9.y(bundle);
        } catch (RemoteException e10) {
            T t3 = ((C1200n0) this.f4728a).f16541f;
            C1200n0.l(t3);
            t3.j.c(e10, StubApp.getString2(12401));
        }
    }

    public final void Y(com.google.android.gms.internal.measurement.L l9, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(StubApp.getString2(1269), arrayList);
        try {
            l9.y(bundle);
        } catch (RemoteException e10) {
            T t3 = ((C1200n0) this.f4728a).f16541f;
            C1200n0.l(t3);
            t3.j.c(e10, StubApp.getString2(19971));
        }
    }

    public final String c0() {
        byte[] bArr = new byte[16];
        h0().nextBytes(bArr);
        return String.format(Locale.US, StubApp.getString2(19866), new BigInteger(1, bArr));
    }

    public final Object e0(int i3, Object obj, boolean z2, boolean z10) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return p(i3, obj.toString(), z2);
        }
        if (!z10) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle L10 = L((Bundle) parcelable);
                if (!L10.isEmpty()) {
                    arrayList.add(L10);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int f0(String str) {
        boolean equals = StubApp.getString2(19566).equals(str);
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (equals) {
            c1200n0.getClass();
            return 2048;
        }
        if (StubApp.getString2(2829).equals(str)) {
            c1200n0.getClass();
            return 256;
        }
        if (StubApp.getString2(19572).equals(str)) {
            c1200n0.getClass();
            return 100;
        }
        c1200n0.getClass();
        return 36;
    }

    public final long g0() {
        long andIncrement;
        long j3;
        AtomicLong atomicLong = this.f16127d;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f16127d;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long nanoTime = System.nanoTime();
            ((C1200n0) this.f4728a).f16545l.getClass();
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i3 = this.f16128e + 1;
            this.f16128e = i3;
            j3 = nextLong + i3;
        }
        return j3;
    }

    public final SecureRandom h0() {
        k();
        if (this.f16126c == null) {
            this.f16126c = new SecureRandom();
        }
        return this.f16126c;
    }

    public final Bundle j0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            boolean isHierarchical = uri.isHierarchical();
            String string2 = StubApp.getString2(19935);
            String string22 = StubApp.getString2(19934);
            String string23 = StubApp.getString2(19862);
            String string24 = StubApp.getString2(19810);
            if (isHierarchical) {
                str = uri.getQueryParameter(StubApp.getString2("19932"));
                str2 = uri.getQueryParameter(StubApp.getString2("19931"));
                str3 = uri.getQueryParameter(StubApp.getString2("19930"));
                str4 = uri.getQueryParameter(string24);
                str5 = uri.getQueryParameter(string23);
                str6 = uri.getQueryParameter(StubApp.getString2("19933"));
                str7 = uri.getQueryParameter(string22);
                str8 = uri.getQueryParameter(string2);
                str9 = uri.getQueryParameter("sfmc_id");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
            } else {
                str10 = "sfmc_id";
                bundle.putString(StubApp.getString2(1190), str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString(StubApp.getString2(376), str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString(StubApp.getString2(1189), str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString(string24, str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString(string23, str5);
            }
            String string25 = StubApp.getString2(19863);
            String queryParameter = uri.getQueryParameter(string25);
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString(string25, queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter(StubApp.getString2(19939));
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString(StubApp.getString2(19972), queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter(StubApp.getString2(19940));
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(StubApp.getString2(1248), queryParameter3);
            }
            String string26 = StubApp.getString2(19973);
            String queryParameter4 = uri.getQueryParameter(string26);
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString(string26, queryParameter4);
            }
            String string27 = StubApp.getString2(19974);
            String queryParameter5 = uri.getQueryParameter(string27);
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString(string27, queryParameter5);
            }
            String string28 = StubApp.getString2(19975);
            String queryParameter6 = uri.getQueryParameter(string28);
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString(string28, queryParameter6);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString(StubApp.getString2(19976), str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString(string22, str7);
            }
            String queryParameter7 = uri.getQueryParameter(StubApp.getString2(19977));
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString(StubApp.getString2(19978), queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter(StubApp.getString2(19979));
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString(StubApp.getString2(19980), queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter(StubApp.getString2(19981));
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(StubApp.getString2(19982), queryParameter9);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString(string2, str8);
            }
            if (!TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            for (String str11 : uri.getQueryParameterNames()) {
                if (str11.startsWith(StubApp.getString2(19690))) {
                    String queryParameter10 = uri.getQueryParameter(str11);
                    if (!TextUtils.isEmpty(queryParameter10)) {
                        bundle.putString(str11, queryParameter10);
                    }
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e10) {
            T t3 = ((C1200n0) this.f4728a).f16541f;
            C1200n0.l(t3);
            t3.j.c(e10, StubApp.getString2(19983));
            return null;
        }
    }

    public final boolean k0(String str, String str2) {
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (str2 == null) {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16244h.c(str, StubApp.getString2(19984));
            return false;
        }
        if (str2.length() == 0) {
            T t10 = c1200n0.f16541f;
            C1200n0.l(t10);
            t10.f16244h.c(str, StubApp.getString2(19985));
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            T t11 = c1200n0.f16541f;
            C1200n0.l(t11);
            t11.f16244h.d(StubApp.getString2(19986), str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                T t12 = c1200n0.f16541f;
                C1200n0.l(t12);
                t12.f16244h.d(StubApp.getString2(19987), str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    @Override // l4.AbstractC1214u0
    public final boolean l() {
        return true;
    }

    public final boolean l0(String str, String str2) {
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (str2 == null) {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16244h.c(str, StubApp.getString2(19984));
            return false;
        }
        if (str2.length() == 0) {
            T t10 = c1200n0.f16541f;
            C1200n0.l(t10);
            t10.f16244h.c(str, StubApp.getString2(19985));
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                T t11 = c1200n0.f16541f;
                C1200n0.l(t11);
                t11.f16244h.d(StubApp.getString2(19988), str, str2);
                return false;
            }
            codePointAt = 95;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                T t12 = c1200n0.f16541f;
                C1200n0.l(t12);
                t12.f16244h.d(StubApp.getString2(19987), str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean m0(String str, String[] strArr, String[] strArr2, String str2) {
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (str2 == null) {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16244h.c(str, StubApp.getString2(19984));
            return false;
        }
        String[] strArr3 = j;
        for (int i3 = 0; i3 < 3; i3++) {
            if (str2.startsWith(strArr3[i3])) {
                T t10 = c1200n0.f16541f;
                C1200n0.l(t10);
                t10.f16244h.d(StubApp.getString2(19989), str, str2);
                return false;
            }
        }
        if (strArr == null || !J(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && J(str2, strArr2)) {
            return true;
        }
        T t11 = c1200n0.f16541f;
        C1200n0.l(t11);
        t11.f16244h.d(StubApp.getString2(19990), str, str2);
        return false;
    }

    public final boolean n0(int i3, String str, String str2) {
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (str2 == null) {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16244h.c(str, StubApp.getString2(19984));
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i3) {
            return true;
        }
        T t10 = c1200n0.f16541f;
        C1200n0.l(t10);
        Integer valueOf = Integer.valueOf(i3);
        t10.f16244h.e(StubApp.getString2(19991), str, valueOf, str2);
        return false;
    }

    public final boolean o(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (isEmpty) {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16244h.b(StubApp.getString2(19994));
            return false;
        }
        S3.D.h(str);
        if (str.matches(StubApp.getString2(19992))) {
            return true;
        }
        T t10 = c1200n0.f16541f;
        C1200n0.l(t10);
        t10.f16244h.c(T.s(str), StubApp.getString2(19993));
        return false;
    }

    public final int o0(String str) {
        String string2 = StubApp.getString2(1420);
        if (!l0(string2, str)) {
            return 2;
        }
        if (!m0(string2, A0.f15899a, A0.f15900b, str)) {
            return 13;
        }
        ((C1200n0) this.f4728a).getClass();
        return !n0(40, string2, str) ? 2 : 0;
    }

    public final int p0(String str) {
        String string2 = StubApp.getString2(19995);
        if (!l0(string2, str)) {
            return 6;
        }
        if (!m0(string2, A0.f15907i, null, str)) {
            return 15;
        }
        ((C1200n0) this.f4728a).getClass();
        return !n0(24, string2, str) ? 6 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int q(java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.K1.q(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final int q0(String str) {
        String string2 = StubApp.getString2(19999);
        if (!k0(string2, str)) {
            return 3;
        }
        if (!m0(string2, null, null, str)) {
            return 14;
        }
        ((C1200n0) this.f4728a).getClass();
        return !n0(40, string2, str) ? 3 : 0;
    }

    public final Object r(Object obj, String str) {
        boolean equals = StubApp.getString2(19489).equals(str);
        int i3 = 500;
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (equals) {
            c1200n0.f16539d.getClass();
            return e0(Math.max(500, 256), obj, true, true);
        }
        if (I(str)) {
            c1200n0.f16539d.getClass();
            i3 = Math.max(500, 256);
        } else {
            c1200n0.f16539d.getClass();
        }
        return e0(i3, obj, false, true);
    }

    public final int r0(String str) {
        String string2 = StubApp.getString2(19999);
        if (!l0(string2, str)) {
            return 3;
        }
        if (!m0(string2, null, null, str)) {
            return 14;
        }
        ((C1200n0) this.f4728a).getClass();
        return !n0(40, string2, str) ? 3 : 0;
    }

    public final Bundle s(String str, Bundle bundle, List list, boolean z2) {
        int q02;
        List list2 = list;
        boolean J10 = J(str, A0.f15902d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        K1 k12 = ((C1200n0) c1200n0.f16539d.f4728a).j;
        C1200n0.j(k12);
        int i3 = k12.P(201500000) ? 100 : 25;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i10 = 0;
        boolean z10 = false;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (list2 == null || !list2.contains(str2)) {
                q02 = !z2 ? q0(str2) : 0;
                if (q02 == 0) {
                    q02 = r0(str2);
                }
            } else {
                q02 = 0;
            }
            if (q02 != 0) {
                w(bundle2, q02, str2, q02 == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int q10 = q(str, str2, bundle.get(str2), bundle2, list2, z2, J10);
                if (q10 == 17) {
                    w(bundle2, 17, str2, Boolean.FALSE);
                } else if (q10 != 0 && !StubApp.getString2(19489).equals(str2)) {
                    w(bundle2, q10, q10 == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (i0(str2) && (i10 = i10 + 1) > i3) {
                    if (!c1200n0.f16539d.u(null, AbstractC1148D.f15989f1) || !z10) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 37);
                        sb2.append(StubApp.getString2(20000));
                        sb2.append(i3);
                        sb2.append(StubApp.getString2(20001));
                        String sb3 = sb2.toString();
                        T t3 = c1200n0.f16541f;
                        C1200n0.l(t3);
                        C1159O c1159o = c1200n0.f16544k;
                        t3.f16244h.d(sb3, c1159o.a(str), c1159o.e(bundle));
                    }
                    d0(5, bundle2);
                    bundle2.remove(str2);
                    z10 = true;
                }
            }
            list2 = list;
        }
        return bundle2;
    }

    public final void t(Ac.q qVar, int i3) {
        Bundle bundle = (Bundle) qVar.f384e;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i10 = 0;
        boolean z2 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (i0(str) && (i10 = i10 + 1) > i3) {
                C1200n0 c1200n0 = (C1200n0) this.f4728a;
                if (!c1200n0.f16539d.u(null, AbstractC1148D.f15989f1) || !z2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 37);
                    sb2.append(StubApp.getString2(20000));
                    sb2.append(i3);
                    sb2.append(StubApp.getString2(20001));
                    String sb3 = sb2.toString();
                    T t3 = c1200n0.f16541f;
                    C1200n0.l(t3);
                    C1159O c1159o = c1200n0.f16544k;
                    t3.f16244h.d(sb3, c1159o.a((String) qVar.f382c), c1159o.e(bundle));
                    d0(5, bundle);
                }
                bundle.remove(str);
                z2 = true;
            }
        }
    }

    public final boolean t0(String str, String str2, int i3, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String obj2 = obj.toString();
        if (obj2.codePointCount(0, obj2.length()) > i3) {
            T t3 = ((C1200n0) this.f4728a).f16541f;
            C1200n0.l(t3);
            Integer valueOf = Integer.valueOf(obj2.length());
            t3.f16246l.e(StubApp.getString2(20002), str, str2, valueOf);
            return false;
        }
        return true;
    }

    public final void u(Parcelable[] parcelableArr, int i3) {
        S3.D.h(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i10 = 0;
            boolean z2 = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (i0(str) && !J(str, A0.f15906h) && (i10 = i10 + 1) > i3) {
                    C1200n0 c1200n0 = (C1200n0) this.f4728a;
                    if (!c1200n0.f16539d.u(null, AbstractC1148D.f15989f1) || !z2) {
                        T t3 = c1200n0.f16541f;
                        C1200n0.l(t3);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 60);
                        sb2.append(StubApp.getString2(20003));
                        sb2.append(i3);
                        sb2.append(StubApp.getString2(20004));
                        String sb3 = sb2.toString();
                        C1159O c1159o = c1200n0.f16544k;
                        t3.f16244h.d(sb3, c1159o.b(str), c1159o.e(bundle));
                    }
                    d0(28, bundle);
                    bundle.remove(str);
                    z2 = true;
                }
            }
        }
    }

    public final void u0(String str, String str2, Bundle bundle, List list, boolean z2) {
        int q02;
        T t3;
        String str3;
        int q10;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        K1 k12 = ((C1200n0) c1200n0.f16539d.f4728a).j;
        C1200n0.j(k12);
        int i3 = true != k12.P(231100000) ? 0 : 35;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i10 = 0;
        boolean z10 = false;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (list2 == null || !list2.contains(str4)) {
                q02 = !z2 ? q0(str4) : 0;
                if (q02 == 0) {
                    q02 = r0(str4);
                }
            } else {
                q02 = 0;
            }
            if (q02 != 0) {
                w(bundle, q02, str4, q02 == 3 ? str4 : null);
                bundle.remove(str4);
            } else {
                boolean s02 = s0(bundle.get(str4));
                T t10 = c1200n0.f16541f;
                if (s02) {
                    C1200n0.l(t10);
                    t10.f16246l.e(StubApp.getString2(20005), str, str2, str4);
                    q10 = 22;
                    t3 = t10;
                    str3 = null;
                } else {
                    t3 = t10;
                    str3 = null;
                    q10 = q(str, str4, bundle.get(str4), bundle, list2, z2, false);
                }
                if (q10 != 0 && !StubApp.getString2(19489).equals(str4)) {
                    w(bundle, q10, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (i0(str4) && !J(str4, A0.f15906h)) {
                    i10++;
                    boolean P10 = P(231100000);
                    C1159O c1159o = c1200n0.f16544k;
                    if (P10) {
                        T t11 = t3;
                        if (i10 > i3) {
                            if (!c1200n0.f16539d.u(str3, AbstractC1148D.f15989f1) || !z10) {
                                C1200n0.l(t11);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 55);
                                sb2.append(StubApp.getString2(20007));
                                sb2.append(i3);
                                sb2.append(StubApp.getString2(20008));
                                t11.f16244h.d(sb2.toString(), c1159o.a(str), c1159o.e(bundle));
                            }
                            d0(28, bundle);
                            bundle.remove(str4);
                            list2 = list;
                            z10 = true;
                        }
                    } else {
                        C1200n0.l(t3);
                        t3.f16244h.d(StubApp.getString2(20006), c1159o.a(str), c1159o.e(bundle));
                        d0(23, bundle);
                        bundle.remove(str4);
                    }
                }
            }
            list2 = list;
        }
    }

    public final void v(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                K1 k12 = ((C1200n0) this.f4728a).j;
                C1200n0.j(k12);
                k12.z(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void w(Bundle bundle, int i3, String str, Object obj) {
        if (d0(i3, bundle)) {
            ((C1200n0) this.f4728a).getClass();
            bundle.putString(StubApp.getString2(19489), p(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong(StubApp.getString2(11892), obj.toString().length());
                }
            }
        }
    }

    public final int x(Object obj, String str) {
        return StubApp.getString2(19566).equals(str) ? t0(StubApp.getString2(20009), str, f0(str), obj) : t0(StubApp.getString2(19995), str, f0(str), obj) ? 0 : 7;
    }

    public final Object y(Object obj, String str) {
        return StubApp.getString2(19566).equals(str) ? e0(f0(str), obj, true, false) : e0(f0(str), obj, false, false);
    }

    public final void z(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            C1200n0 c1200n0 = (C1200n0) this.f4728a;
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16246l.d(StubApp.getString2(20010), c1200n0.f16544k.b(str), simpleName);
        }
    }
}
