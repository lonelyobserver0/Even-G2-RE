package D5;

import a0.C0379a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.ConditionVariable;
import android.util.Log;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;
import com.stub.StubApp;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import sa.C1608a;
import vb.AbstractC1844a;
import vb.EnumC1846c;
import vb.EnumC1848e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public int f1457a;

    /* renamed from: b, reason: collision with root package name */
    public int f1458b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1459c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1460d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1461e;

    public static String b(R4.h hVar) {
        hVar.a();
        R4.j jVar = hVar.f6195c;
        String str = jVar.f6207e;
        if (str != null) {
            return str;
        }
        hVar.a();
        String str2 = jVar.f6204b;
        if (!str2.startsWith(StubApp.getString2(1475))) {
            return str2;
        }
        String[] split = str2.split(StubApp.getString2(478));
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public synchronized String a() {
        try {
            if (((String) this.f1460d) == null) {
                e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f1460d;
    }

    public PackageInfo c(String str) {
        try {
            return ((Context) this.f1459c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w(StubApp.getString2(493), StubApp.getString2(1476) + e10);
            return null;
        }
    }

    public boolean d() {
        int i3;
        synchronized (this) {
            i3 = this.f1458b;
            if (i3 == 0) {
                PackageManager packageManager = ((Context) this.f1459c).getPackageManager();
                if (packageManager.checkPermission(StubApp.getString2("1477"), StubApp.getString2("0")) == -1) {
                    Log.e(StubApp.getString2("493"), StubApp.getString2("1478"));
                    i3 = 0;
                } else {
                    Intent intent = new Intent(StubApp.getString2("1479"));
                    intent.setPackage(StubApp.getString2("0"));
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w(StubApp.getString2("493"), StubApp.getString2("1480"));
                        this.f1458b = 2;
                    } else {
                        this.f1458b = 2;
                    }
                    i3 = 2;
                }
            }
        }
        return i3 != 0;
    }

    public synchronized void e() {
        PackageInfo c10 = c(((Context) this.f1459c).getPackageName());
        if (c10 != null) {
            this.f1460d = Integer.toString(c10.versionCode);
            this.f1461e = c10.versionName;
        }
    }

    public void f() {
        int i3;
        int i10 = this.f1457a;
        byte[] bArr = (byte[]) this.f1459c;
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(1491));
        }
        Gb.c cVar = (Gb.c) this.f1461e;
        int i11 = this.f1458b;
        org.slf4j.a aVar = Gb.c.f2460g;
        String string2 = StubApp.getString2(1481);
        String string22 = StubApp.getString2(1482);
        String string23 = StubApp.getString2(1483);
        String string24 = StubApp.getString2(1484);
        String string25 = StubApp.getString2(1485);
        int i12 = cVar.f21911c;
        try {
            if (EnumC1848e.f21933a.a()) {
                HashMap hashMap = new HashMap();
                hashMap.put(string25, new byte[0]);
                hashMap.put(string24, Integer.valueOf(i10));
                if (i10 == 0) {
                    if (i11 > 0) {
                        hashMap.put(string23, Integer.valueOf(i11));
                    }
                    hashMap.put(string22, Integer.valueOf(bArr.length));
                    hashMap.put(string2, new byte[32]);
                }
                hashMap.put(StubApp.getString2("1486"), new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
                CBORFactory cBORFactory = Ob.a.f5373a;
                i3 = new ObjectMapper(Ob.a.f5373a).writeValueAsBytes(hashMap).length + 25;
            } else {
                int b2 = Ob.a.b(i10) + 4 + Ob.a.b(bArr.length) + 7;
                if (i10 == 0) {
                    if (i11 > 0) {
                        b2 += 7;
                    }
                    b2 += 47;
                }
                i3 = 8 + b2;
            }
        } catch (IOException e10) {
            aVar.b(StubApp.getString2(1487), e10);
            i3 = -1;
        }
        int min = Math.min(i12 - i3, bArr.length - i10);
        byte[] bArr2 = new byte[min];
        System.arraycopy(bArr, i10, bArr2, 0, min);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(string25, bArr2);
        hashMap2.put(string24, Integer.valueOf(i10));
        if (i10 == 0) {
            if (i11 > 0) {
                hashMap2.put(string23, Integer.valueOf(i11));
            }
            hashMap2.put(string22, Integer.valueOf(bArr.length));
            try {
                hashMap2.put(string2, MessageDigest.getInstance(StubApp.getString2("1488")).digest(bArr));
            } catch (NoSuchAlgorithmException e11) {
                aVar.b(StubApp.getString2(1489), e11);
            }
        }
        long j = i10 == 0 ? 40000L : 2500L;
        byte[] a3 = AbstractC1844a.a(2, cVar.f21909a, 1, hashMap2);
        wb.f fVar = cVar.f21910b;
        C1608a c1608a = new C1608a(12);
        fVar.d(a3, j, Kb.b.class, new C0379a(c1608a, 26));
        ((ConditionVariable) c1608a.f20822c).block();
        Db.c cVar2 = (Db.c) c1608a.f20821b;
        Hb.b bVar = (Hb.b) c1608a.f20820a;
        if (cVar2 != null) {
            throw cVar2;
        }
        if (bVar == null) {
            throw new IllegalStateException(StubApp.getString2(1490));
        }
        Kb.b bVar2 = (Kb.b) bVar;
        if (bVar2.f3016rc != 0) {
            throw new Db.b(EnumC1846c.a(bVar2.f3016rc));
        }
        this.f1457a = bVar2.off;
    }
}
