package i5;

import A3.s;
import H0.C0067j;
import android.util.Log;
import c5.g;
import c5.i;
import com.stub.StubApp;
import f5.K0;
import i2.o;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: i5.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1057a {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f14832e = Charset.forName(StubApp.getString2(640));

    /* renamed from: f, reason: collision with root package name */
    public static final int f14833f = 15;

    /* renamed from: g, reason: collision with root package name */
    public static final g5.c f14834g = new g5.c();

    /* renamed from: h, reason: collision with root package name */
    public static final C0067j f14835h = new C0067j(14);

    /* renamed from: i, reason: collision with root package name */
    public static final g f14836i = new g(2);

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f14837a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final C1059c f14838b;

    /* renamed from: c, reason: collision with root package name */
    public final s f14839c;

    /* renamed from: d, reason: collision with root package name */
    public final i f14840d;

    public C1057a(C1059c c1059c, s sVar, i iVar) {
        this.f14838b = c1059c;
        this.f14839c = sVar;
        this.f14840d = iVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f14832e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f14832e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        C1059c c1059c = this.f14838b;
        arrayList.addAll(C1059c.p(((File) c1059c.f14847f).listFiles()));
        arrayList.addAll(C1059c.p(((File) c1059c.f14848g).listFiles()));
        C0067j c0067j = f14835h;
        Collections.sort(arrayList, c0067j);
        List p8 = C1059c.p(((File) c1059c.f14846e).listFiles());
        Collections.sort(p8, c0067j);
        arrayList.addAll(p8);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(C1059c.p(((File) this.f14838b.f14845d).list())).descendingSet();
    }

    public final void d(K0 k02, String str, boolean z2) {
        C1059c c1059c = this.f14838b;
        o oVar = this.f14839c.h().f15437a;
        f14834g.getClass();
        try {
            f(c1059c.k(str, E1.a.k(StubApp.getString2(1420), String.format(Locale.US, StubApp.getString2(18552), Integer.valueOf(this.f14837a.getAndIncrement())), z2 ? StubApp.getString2(4956) : "")), g5.c.f14217a.r(k02));
        } catch (IOException e10) {
            Log.w(StubApp.getString2(280), StubApp.getString2(18553) + str, e10);
        }
        g gVar = new g(3);
        c1059c.getClass();
        File file = new File((File) c1059c.f14845d, str);
        file.mkdirs();
        List<File> p8 = C1059c.p(file.listFiles(gVar));
        Collections.sort(p8, new C0067j(15));
        int size = p8.size();
        for (File file2 : p8) {
            if (size <= oVar.f14746a) {
                return;
            }
            C1059c.o(file2);
            size--;
        }
    }
}
