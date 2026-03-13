package c5;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.stub.StubApp;
import d5.AbstractC0801a;
import d5.C0805e;
import d5.ExecutorC0802b;
import e5.C0846e;
import e5.InterfaceC0845d;
import f5.C0883A;
import f5.C0884B;
import f5.C0904i0;
import f5.C0910l0;
import f5.C0912m0;
import f5.C0914n0;
import f5.C0916o0;
import f5.I;
import f5.J;
import f5.K;
import f5.M;
import f5.O0;
import i5.C1057a;
import i5.C1059c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.bouncycastle.math.ec.Tnaf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l {

    /* renamed from: t, reason: collision with root package name */
    public static final g f10891t = new g(1);

    /* renamed from: u, reason: collision with root package name */
    public static final Charset f10892u = Charset.forName(StubApp.getString2(640));

    /* renamed from: a, reason: collision with root package name */
    public final Context f10893a;

    /* renamed from: b, reason: collision with root package name */
    public final u f10894b;

    /* renamed from: c, reason: collision with root package name */
    public final Y.m f10895c;

    /* renamed from: d, reason: collision with root package name */
    public final C1059c f10896d;

    /* renamed from: e, reason: collision with root package name */
    public final C0805e f10897e;

    /* renamed from: f, reason: collision with root package name */
    public final y f10898f;

    /* renamed from: g, reason: collision with root package name */
    public final C1059c f10899g;

    /* renamed from: h, reason: collision with root package name */
    public final B6.a f10900h;

    /* renamed from: i, reason: collision with root package name */
    public final e5.f f10901i;
    public final Z4.a j;

    /* renamed from: k, reason: collision with root package name */
    public final Y4.a f10902k;

    /* renamed from: l, reason: collision with root package name */
    public final i f10903l;

    /* renamed from: m, reason: collision with root package name */
    public final C1059c f10904m;

    /* renamed from: n, reason: collision with root package name */
    public t f10905n;

    /* renamed from: o, reason: collision with root package name */
    public A3.s f10906o = null;

    /* renamed from: p, reason: collision with root package name */
    public final q4.k f10907p = new q4.k();

    /* renamed from: q, reason: collision with root package name */
    public final q4.k f10908q = new q4.k();

    /* renamed from: r, reason: collision with root package name */
    public final q4.k f10909r = new q4.k();

    /* renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f10910s = new AtomicBoolean(false);

    public l(Context context, y yVar, u uVar, C1059c c1059c, Y.m mVar, B6.a aVar, C1059c c1059c2, e5.f fVar, C1059c c1059c3, Z4.a aVar2, Y4.a aVar3, i iVar, C0805e c0805e) {
        this.f10893a = context;
        this.f10898f = yVar;
        this.f10894b = uVar;
        this.f10899g = c1059c;
        this.f10895c = mVar;
        this.f10900h = aVar;
        this.f10896d = c1059c2;
        this.f10901i = fVar;
        this.j = aVar2;
        this.f10902k = aVar3;
        this.f10903l = iVar;
        this.f10904m = c1059c3;
        this.f10897e = c0805e;
    }

    public static q4.s a(l lVar) {
        q4.s e10;
        lVar.getClass();
        String string2 = StubApp.getString2(280);
        ArrayList arrayList = new ArrayList();
        for (File file : C1059c.p(((File) lVar.f10899g.f14844c).listFiles(f10891t))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w(string2, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    e10 = a4.f.m(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable(string2, 3)) {
                        Log.d(string2, StubApp.getString2("9475"), null);
                    }
                    e10 = a4.f.e(new ScheduledThreadPoolExecutor(1), new k(lVar, parseLong));
                }
                arrayList.add(e10);
            } catch (NumberFormatException unused2) {
                Log.w(string2, StubApp.getString2(9476) + file.getName(), null);
            }
            file.delete();
        }
        return a4.f.A(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:236:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0184 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v10, types: [int] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r32, A3.s r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 2274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.l.b(boolean, A3.s, boolean):void");
    }

    public final void c(String str, Boolean bool) {
        String str2;
        String str3;
        String str4;
        int i3;
        Integer num;
        Map unmodifiableMap;
        List unmodifiableList;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String j = E1.a.j(StubApp.getString2(9517), str);
        if (Log.isLoggable(StubApp.getString2(280), 3)) {
            Log.d(StubApp.getString2(280), j, null);
        }
        Locale locale = Locale.US;
        y yVar = this.f10898f;
        B6.a aVar = this.f10900h;
        C0912m0 c0912m0 = new C0912m0(yVar.f10970c, (String) aVar.f672f, (String) aVar.f673g, yVar.c().f10862a, Xa.h.b(((String) aVar.f670d) != null ? 4 : 1), (Y.m) aVar.f674h);
        String str5 = Build.VERSION.RELEASE;
        String str6 = Build.VERSION.CODENAME;
        C0916o0 c0916o0 = new C0916o0(f.g());
        Context context = this.f10893a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        e eVar = e.f10871a;
        String str7 = Build.CPU_ABI;
        boolean isEmpty = TextUtils.isEmpty(str7);
        e eVar2 = e.f10871a;
        if (isEmpty) {
            String string2 = StubApp.getString2(280);
            if (Log.isLoggable(string2, 2)) {
                Log.v(string2, StubApp.getString2(9518), null);
            }
        } else {
            e eVar3 = (e) e.f10872b.get(str7.toLowerCase(locale));
            if (eVar3 != null) {
                eVar2 = eVar3;
            }
        }
        int ordinal = eVar2.ordinal();
        String str8 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long a3 = f.a(context);
        boolean f10 = f.f();
        int c10 = f.c();
        String str9 = Build.MANUFACTURER;
        String str10 = Build.PRODUCT;
        this.j.d(str, currentTimeMillis, new C0910l0(c0912m0, c0916o0, new C0914n0(ordinal, availableProcessors, a3, blockCount, f10, c10)));
        if (!bool.booleanValue() || str == null) {
            str2 = str6;
            str3 = str9;
            str4 = str10;
            i3 = 4;
        } else {
            C1059c c1059c = this.f10896d;
            synchronized (((String) c1059c.f14842a)) {
                c1059c.f14842a = str;
                C0846e c0846e = (C0846e) ((AtomicMarkableReference) ((O0.l) c1059c.f14845d).f5143b).getReference();
                synchronized (c0846e) {
                    unmodifiableMap = Collections.unmodifiableMap(new HashMap(c0846e.f13610a));
                }
                Ac.s sVar = (Ac.s) c1059c.f14847f;
                synchronized (sVar) {
                    unmodifiableList = Collections.unmodifiableList(new ArrayList(sVar.f387a));
                }
                str4 = str10;
                str2 = str6;
                str3 = str9;
                i3 = 4;
                ((C0805e) c1059c.f14844c).f13423b.a(new G3.a(3, c1059c, str, unmodifiableMap, unmodifiableList));
            }
        }
        e5.f fVar = this.f10901i;
        ((InterfaceC0845d) fVar.f13615b).b();
        fVar.f13615b = e5.f.f13613c;
        if (str != null) {
            fVar.f13615b = new e5.m(((C1059c) fVar.f13614a).k(str, StubApp.getString2(9478)));
        }
        this.f10903l.a(str);
        C1059c c1059c2 = this.f10904m;
        s sVar2 = (s) c1059c2.f14842a;
        Charset charset = O0.f13901a;
        C0883A c0883a = new C0883A();
        c0883a.f13797a = StubApp.getString2(3976);
        B6.a aVar2 = sVar2.f10944c;
        String str11 = (String) aVar2.f668b;
        if (str11 == null) {
            throw new NullPointerException(StubApp.getString2(9529));
        }
        c0883a.f13798b = str11;
        y yVar2 = sVar2.f10943b;
        String str12 = yVar2.c().f10862a;
        if (str12 == null) {
            throw new NullPointerException(StubApp.getString2(9528));
        }
        c0883a.f13800d = str12;
        c0883a.f13801e = yVar2.c().f10863b;
        c0883a.f13802f = yVar2.c().f10864c;
        String str13 = (String) aVar2.f672f;
        if (str13 == null) {
            throw new NullPointerException(StubApp.getString2(9524));
        }
        c0883a.f13804h = str13;
        String str14 = (String) aVar2.f673g;
        if (str14 == null) {
            throw new NullPointerException(StubApp.getString2(9527));
        }
        c0883a.f13805i = str14;
        c0883a.f13799c = i3;
        c0883a.f13808m = (byte) (c0883a.f13808m | 1);
        I i10 = new I();
        i10.f13852f = false;
        byte b2 = (byte) (i10.f13858m | 2);
        i10.f13850d = currentTimeMillis;
        i10.f13858m = (byte) (b2 | 1);
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(9525));
        }
        i10.f13848b = str;
        String str15 = s.f10941g;
        if (str15 == null) {
            throw new NullPointerException(StubApp.getString2(9526));
        }
        i10.f13847a = str15;
        String str16 = yVar2.f10970c;
        if (str16 == null) {
            throw new NullPointerException(StubApp.getString2(9525));
        }
        String str17 = yVar2.c().f10862a;
        Y.m mVar = (Y.m) aVar2.f674h;
        if (((Z4.b) mVar.f8675c) == null) {
            mVar.f8675c = new Z4.b(mVar);
        }
        Z4.b bVar = (Z4.b) mVar.f8675c;
        String str18 = bVar.f8978b;
        if (bVar == null) {
            mVar.f8675c = new Z4.b(mVar);
        }
        i10.f13853g = new K(str16, str13, str14, str17, str18, ((Z4.b) mVar.f8675c).f8979c);
        C0904i0 c0904i0 = new C0904i0();
        c0904i0.f14033a = 3;
        c0904i0.f14037e = (byte) (c0904i0.f14037e | 1);
        if (str5 == null) {
            throw new NullPointerException(StubApp.getString2(2012));
        }
        c0904i0.f14034b = str5;
        String str19 = str2;
        if (str19 == null) {
            throw new NullPointerException(StubApp.getString2(9524));
        }
        c0904i0.f14035c = str19;
        c0904i0.f14036d = f.g();
        c0904i0.f14037e = (byte) (c0904i0.f14037e | 2);
        i10.f13855i = c0904i0.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int i11 = 7;
        if (!TextUtils.isEmpty(str7) && (num = (Integer) s.f10940f.get(str7.toLowerCase(locale))) != null) {
            i11 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long a9 = f.a(sVar2.f10942a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean f11 = f.f();
        int c11 = f.c();
        M m4 = new M();
        m4.f13876a = i11;
        byte b10 = (byte) (m4.j | 1);
        m4.j = b10;
        if (str8 == null) {
            throw new NullPointerException(StubApp.getString2(9523));
        }
        m4.f13877b = str8;
        m4.f13878c = availableProcessors2;
        m4.f13879d = a9;
        m4.f13880e = blockCount2;
        m4.f13881f = f11;
        byte b11 = (byte) (((byte) (((byte) (((byte) (b10 | 2)) | 4)) | 8)) | Tnaf.POW_2_WIDTH);
        m4.f13882g = c11;
        m4.j = (byte) (b11 | 32);
        String str20 = str3;
        if (str20 == null) {
            throw new NullPointerException(StubApp.getString2(9522));
        }
        m4.f13883h = str20;
        String str21 = str4;
        if (str21 == null) {
            throw new NullPointerException(StubApp.getString2(9521));
        }
        m4.f13884i = str21;
        i10.j = m4.a();
        i10.f13857l = 3;
        i10.f13858m = (byte) (i10.f13858m | 4);
        c0883a.j = i10.a();
        C0884B a10 = c0883a.a();
        C1059c c1059c3 = ((C1057a) c1059c2.f14843b).f14838b;
        J j3 = a10.f13817k;
        String string22 = StubApp.getString2(280);
        if (j3 == null) {
            if (Log.isLoggable(string22, 3)) {
                Log.d(string22, StubApp.getString2(9519), null);
                return;
            }
            return;
        }
        String str22 = j3.f13860b;
        try {
            C1057a.f14834g.getClass();
            C1057a.f(c1059c3.k(str22, StubApp.getString2("9513")), g5.c.f14217a.r(a10));
            File k3 = c1059c3.k(str22, StubApp.getString2("9484"));
            long j10 = j3.f13862d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(k3), C1057a.f14832e);
            try {
                outputStreamWriter.write("");
                k3.setLastModified(j10 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e10) {
            String j11 = E1.a.j(StubApp.getString2(9520), str22);
            if (Log.isLoggable(string22, 3)) {
                Log.d(string22, j11, e10);
            }
        }
    }

    public final boolean d(A3.s sVar) {
        C0805e.a();
        t tVar = this.f10905n;
        boolean z2 = tVar != null && tVar.f10951e.get();
        String string2 = StubApp.getString2(280);
        if (z2) {
            Log.w(string2, StubApp.getString2(9530), null);
            return false;
        }
        if (Log.isLoggable(string2, 2)) {
            Log.v(string2, StubApp.getString2(9531), null);
        }
        try {
            b(true, sVar, true);
            if (Log.isLoggable(string2, 2)) {
                Log.v(string2, StubApp.getString2(9532), null);
            }
            return true;
        } catch (Exception e10) {
            Log.e(string2, StubApp.getString2(9533), e10);
            return false;
        }
    }

    public final String e() {
        NavigableSet c10 = ((C1057a) this.f10904m.f14843b).c();
        if (c10.isEmpty()) {
            return null;
        }
        return (String) c10.first();
    }

    public final String f() {
        InputStream resourceAsStream;
        String string2 = StubApp.getString2(9534);
        String string22 = StubApp.getString2(983);
        Context context = this.f10893a;
        int d8 = f.d(context, string2, string22);
        String string = d8 == 0 ? null : context.getResources().getString(d8);
        String string23 = StubApp.getString2(280);
        if (string != null) {
            if (Log.isLoggable(string23, 3)) {
                Log.d(string23, StubApp.getString2(9535), null);
            }
            return Base64.encodeToString(string.getBytes(f10892u), 0);
        }
        ClassLoader classLoader = l.class.getClassLoader();
        if (classLoader == null) {
            Log.w(string23, StubApp.getString2(9536), null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream(StubApp.getString2(9537));
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i(string23, StubApp.getString2(9539), null);
            return null;
        }
        try {
            String string24 = StubApp.getString2("9538");
            if (Log.isLoggable(string23, 3)) {
                Log.d(string23, string24, null);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = resourceAsStream.read(bArr);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String encodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return encodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                resourceAsStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final synchronized void g(A3.s sVar, Thread thread, Throwable th, boolean z2) {
        Throwable th2;
        long currentTimeMillis;
        ExecutorC0802b executorC0802b;
        q4.j continueWithTask;
        String string2 = StubApp.getString2(9540);
        synchronized (this) {
            try {
                String str = string2 + th + StubApp.getString2("9541") + thread.getName();
                if (Log.isLoggable(StubApp.getString2("280"), 3)) {
                    try {
                        Log.d(StubApp.getString2("280"), str, null);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                currentTimeMillis = System.currentTimeMillis();
                executorC0802b = this.f10897e.f13422a;
            } catch (Throwable th4) {
                th = th4;
            }
            try {
                j jVar = new j(this, currentTimeMillis, th, thread, sVar, z2);
                synchronized (executorC0802b.f13415b) {
                    continueWithTask = executorC0802b.f13416c.continueWithTask(executorC0802b.f13414a, new B(jVar, 14));
                    executorC0802b.f13416c = continueWithTask;
                }
                if (!z2) {
                    try {
                        D.a(continueWithTask);
                    } catch (TimeoutException unused) {
                        Log.e(StubApp.getString2("280"), StubApp.getString2("9543"), null);
                    } catch (Exception e10) {
                        Log.e(StubApp.getString2("280"), StubApp.getString2("9542"), e10);
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                throw th2;
            }
        }
    }

    public final void h() {
        String string2 = StubApp.getString2(280);
        try {
            String f10 = f();
            if (f10 != null) {
                i(StubApp.getString2("9544"), f10);
                Log.i(string2, StubApp.getString2("9545"), null);
            }
        } catch (IOException e10) {
            Log.w(string2, StubApp.getString2(9546), e10);
        }
    }

    public final void i(String str, String str2) {
        try {
            ((O0.l) this.f10896d.f14846e).j(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f10893a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e10;
            }
            Log.e(StubApp.getString2(280), StubApp.getString2(9547), null);
        }
    }

    public final void j(q4.s sVar) {
        q4.s sVar2;
        q4.s a3;
        C1059c c1059c = ((C1057a) this.f10904m.f14843b).f14838b;
        boolean isEmpty = C1059c.p(((File) c1059c.f14846e).listFiles()).isEmpty();
        q4.k kVar = this.f10907p;
        String string2 = StubApp.getString2(280);
        if (isEmpty && C1059c.p(((File) c1059c.f14847f).listFiles()).isEmpty() && C1059c.p(((File) c1059c.f14848g).listFiles()).isEmpty()) {
            if (Log.isLoggable(string2, 2)) {
                Log.v(string2, StubApp.getString2(9548), null);
            }
            kVar.d(Boolean.FALSE);
            return;
        }
        Z4.c cVar = Z4.c.f8980a;
        cVar.f(StubApp.getString2(9549));
        u uVar = this.f10894b;
        if (uVar.a()) {
            if (Log.isLoggable(string2, 3)) {
                Log.d(string2, StubApp.getString2(9550), null);
            }
            kVar.d(Boolean.FALSE);
            a3 = a4.f.m(Boolean.TRUE);
        } else {
            cVar.c(StubApp.getString2(9551));
            cVar.f(StubApp.getString2(9552));
            kVar.d(Boolean.TRUE);
            synchronized (uVar.f10954c) {
                sVar2 = uVar.f10955d.f20051a;
            }
            q4.j onSuccessTask = sVar2.onSuccessTask(new u5.d(29));
            cVar.c(StubApp.getString2(9553));
            a3 = AbstractC0801a.a(onSuccessTask, this.f10908q.f20051a);
        }
        a3.onSuccessTask(this.f10897e.f13422a, new V6.b(this, sVar, 8, false));
    }
}
