package Dc;

import com.stub.StubApp;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class r implements Closeable {

    /* renamed from: D, reason: collision with root package name */
    public static final E f1614D;

    /* renamed from: A, reason: collision with root package name */
    public final A f1615A;

    /* renamed from: B, reason: collision with root package name */
    public final l f1616B;

    /* renamed from: C, reason: collision with root package name */
    public final LinkedHashSet f1617C;

    /* renamed from: a, reason: collision with root package name */
    public final i f1618a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1619b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1620c;

    /* renamed from: d, reason: collision with root package name */
    public int f1621d;

    /* renamed from: e, reason: collision with root package name */
    public int f1622e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1623f;

    /* renamed from: g, reason: collision with root package name */
    public final zc.c f1624g;

    /* renamed from: h, reason: collision with root package name */
    public final zc.b f1625h;
    public final zc.b j;

    /* renamed from: k, reason: collision with root package name */
    public final zc.b f1626k;

    /* renamed from: l, reason: collision with root package name */
    public final D f1627l;

    /* renamed from: m, reason: collision with root package name */
    public long f1628m;

    /* renamed from: n, reason: collision with root package name */
    public long f1629n;

    /* renamed from: p, reason: collision with root package name */
    public long f1630p;

    /* renamed from: q, reason: collision with root package name */
    public long f1631q;

    /* renamed from: r, reason: collision with root package name */
    public long f1632r;

    /* renamed from: s, reason: collision with root package name */
    public final E f1633s;

    /* renamed from: t, reason: collision with root package name */
    public E f1634t;

    /* renamed from: v, reason: collision with root package name */
    public long f1635v;

    /* renamed from: w, reason: collision with root package name */
    public long f1636w;

    /* renamed from: x, reason: collision with root package name */
    public long f1637x;

    /* renamed from: y, reason: collision with root package name */
    public long f1638y;

    /* renamed from: z, reason: collision with root package name */
    public final Socket f1639z;

    static {
        E e10 = new E();
        e10.c(7, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        e10.c(5, 16384);
        f1614D = e10;
    }

    public r(Cc.h builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f1618a = (i) builder.f1213g;
        this.f1619b = new LinkedHashMap();
        String str = (String) builder.f1212f;
        Kc.B b2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            str = null;
        }
        this.f1620c = str;
        this.f1622e = 3;
        zc.c cVar = (zc.c) builder.f1210d;
        this.f1624g = cVar;
        zc.b e10 = cVar.e();
        this.f1625h = e10;
        this.j = cVar.e();
        this.f1626k = cVar.e();
        this.f1627l = D.f1545a;
        E e11 = new E();
        e11.c(7, 16777216);
        this.f1633s = e11;
        this.f1634t = f1614D;
        this.f1638y = r2.a();
        Socket socket = (Socket) builder.f1211e;
        if (socket == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            socket = null;
        }
        this.f1639z = socket;
        Kc.A a3 = (Kc.A) builder.f1208b;
        if (a3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sink");
            a3 = null;
        }
        this.f1615A = new A(a3);
        Kc.B b10 = (Kc.B) builder.f1207a;
        if (b10 != null) {
            b2 = b10;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("source");
        }
        this.f1616B = new l(this, new v(b2));
        this.f1617C = new LinkedHashSet();
        int i3 = builder.f1209c;
        if (i3 != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i3);
            e10.c(new p(Intrinsics.stringPlus(str, " ping"), this, nanos, 0), nanos);
        }
    }

    public final void A(int i3, EnumC0053b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f1625h.c(new o(this.f1620c + '[' + i3 + StubApp.getString2(25163), this, i3, errorCode, 1), 0L);
    }

    public final void C(int i3, long j) {
        this.f1625h.c(new q(this.f1620c + '[' + i3 + StubApp.getString2(25164), this, i3, j), 0L);
    }

    public final void a(EnumC0053b connectionCode, EnumC0053b streamCode, IOException iOException) {
        int i3;
        Object[] objArr;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        byte[] bArr = xc.b.f23179a;
        try {
            k(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f1619b.isEmpty()) {
                    objArr = null;
                } else {
                    objArr = this.f1619b.values().toArray(new z[0]);
                    if (objArr == null) {
                        throw new NullPointerException(StubApp.getString2("11601"));
                    }
                    this.f1619b.clear();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        z[] zVarArr = (z[]) objArr;
        if (zVarArr != null) {
            for (z zVar : zVarArr) {
                try {
                    zVar.c(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f1615A.close();
        } catch (IOException unused3) {
        }
        try {
            this.f1639z.close();
        } catch (IOException unused4) {
        }
        this.f1625h.e();
        this.j.e();
        this.f1626k.e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(EnumC0053b.f1549b, EnumC0053b.f1554g, null);
    }

    public final void d(IOException iOException) {
        EnumC0053b enumC0053b = EnumC0053b.f1550c;
        a(enumC0053b, enumC0053b, iOException);
    }

    public final synchronized z e(int i3) {
        return (z) this.f1619b.get(Integer.valueOf(i3));
    }

    public final void flush() {
        this.f1615A.flush();
    }

    public final synchronized z h(int i3) {
        z zVar;
        zVar = (z) this.f1619b.remove(Integer.valueOf(i3));
        notifyAll();
        return zVar;
    }

    public final void k(EnumC0053b statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.f1615A) {
            Ref.IntRef intRef = new Ref.IntRef();
            synchronized (this) {
                if (this.f1623f) {
                    return;
                }
                this.f1623f = true;
                int i3 = this.f1621d;
                intRef.element = i3;
                Unit unit = Unit.INSTANCE;
                this.f1615A.h(i3, statusCode, xc.b.f23179a);
            }
        }
    }

    public final synchronized void p(long j) {
        long j3 = this.f1635v + j;
        this.f1635v = j3;
        long j10 = j3 - this.f1636w;
        if (j10 >= this.f1633s.a() / 2) {
            C(0, j10);
            this.f1636w += j10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f1615A.f1536c);
        r6 = r2;
        r8.f1637x += r6;
        r4 = kotlin.Unit.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(int r9, boolean r10, Kc.C0101h r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            Dc.A r12 = r8.f1615A
            r12.d(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6e
            monitor-enter(r8)
        L12:
            long r4 = r8.f1637x     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5f
            long r6 = r8.f1638y     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5f
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L38
            java.util.LinkedHashMap r2 = r8.f1619b     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5f
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5f
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5f
            goto L12
        L2a:
            r9 = move-exception
            goto L6c
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5f
            java.lang.String r10 = "25165"
            java.lang.String r10 = com.stub.StubApp.getString2(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5f
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5f
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5f
        L38:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            Dc.A r4 = r8.f1615A     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f1536c     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f1637x     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f1637x = r4     // Catch: java.lang.Throwable -> L2a
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            Dc.A r4 = r8.f1615A
            if (r10 == 0) goto L5a
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5a
            r5 = 1
            goto L5b
        L5a:
            r5 = r3
        L5b:
            r4.d(r5, r9, r11, r2)
            goto Ld
        L5f:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L6c:
            monitor-exit(r8)
            throw r9
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dc.r.v(int, boolean, Kc.h, long):void");
    }
}
