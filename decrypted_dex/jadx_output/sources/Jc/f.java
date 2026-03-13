package Jc;

import Ac.j;
import Ac.n;
import Dc.p;
import Kc.C0101h;
import Kc.C0104k;
import Kc.r;
import com.stub.StubApp;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import wc.C1881F;
import wc.I;
import wc.J;
import wc.y;
import wc.z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class f implements I {

    /* renamed from: w, reason: collision with root package name */
    public static final List f3485w = CollectionsKt.listOf(y.f22486c);

    /* renamed from: a, reason: collision with root package name */
    public final J f3486a;

    /* renamed from: b, reason: collision with root package name */
    public final Random f3487b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3488c;

    /* renamed from: d, reason: collision with root package name */
    public g f3489d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3490e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3491f;

    /* renamed from: g, reason: collision with root package name */
    public j f3492g;

    /* renamed from: h, reason: collision with root package name */
    public e f3493h;

    /* renamed from: i, reason: collision with root package name */
    public h f3494i;
    public i j;

    /* renamed from: k, reason: collision with root package name */
    public final zc.b f3495k;

    /* renamed from: l, reason: collision with root package name */
    public String f3496l;

    /* renamed from: m, reason: collision with root package name */
    public n f3497m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayDeque f3498n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayDeque f3499o;

    /* renamed from: p, reason: collision with root package name */
    public long f3500p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3501q;

    /* renamed from: r, reason: collision with root package name */
    public int f3502r;

    /* renamed from: s, reason: collision with root package name */
    public String f3503s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3504t;

    /* renamed from: u, reason: collision with root package name */
    public int f3505u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3506v;

    public f(zc.c taskRunner, z originalRequest, J listener, Random random, long j, long j3) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f3486a = listener;
        this.f3487b = random;
        this.f3488c = j;
        this.f3489d = null;
        this.f3490e = j3;
        this.f3495k = taskRunner.e();
        this.f3498n = new ArrayDeque();
        this.f3499o = new ArrayDeque();
        this.f3502r = -1;
        String string2 = StubApp.getString2(595);
        String str = originalRequest.f22494b;
        if (!Intrinsics.areEqual(string2, str)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("Request must be GET: ", str).toString());
        }
        C0104k c0104k = C0104k.f3820d;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        Unit unit = Unit.INSTANCE;
        this.f3491f = u5.d.t(bArr).a();
    }

    public final void a(C1881F response, Ac.e eVar) {
        boolean equals;
        boolean equals2;
        Intrinsics.checkNotNullParameter(response, "response");
        int i3 = response.f22328d;
        if (i3 != 101) {
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(25298));
            sb2.append(i3);
            sb2.append(' ');
            throw new ProtocolException(Xa.h.s(sb2, response.f22327c, '\''));
        }
        String a3 = C1881F.a(StubApp.getString2(2411), response);
        String string2 = StubApp.getString2(13809);
        equals = StringsKt__StringsJVMKt.equals(string2, a3, true);
        if (!equals) {
            throw new ProtocolException(StubApp.getString2(25297) + ((Object) a3) + '\'');
        }
        String a9 = C1881F.a(string2, response);
        equals2 = StringsKt__StringsJVMKt.equals(StubApp.getString2(13810), a9, true);
        if (!equals2) {
            throw new ProtocolException(StubApp.getString2(25296) + ((Object) a9) + '\'');
        }
        String a10 = C1881F.a(StubApp.getString2(25292), response);
        C0104k c0104k = C0104k.f3820d;
        String a11 = u5.d.r(Intrinsics.stringPlus(this.f3491f, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")).d(StubApp.getString2(5778)).a();
        if (Intrinsics.areEqual(a11, a10)) {
            if (eVar == null) {
                throw new ProtocolException(StubApp.getString2(25293));
            }
            return;
        }
        throw new ProtocolException(StubApp.getString2(25294) + a11 + StubApp.getString2(25295) + ((Object) a10) + '\'');
    }

    public final boolean b(int i3, String str) {
        String stringPlus;
        synchronized (this) {
            C0104k c0104k = null;
            try {
                if (i3 < 1000 || i3 >= 5000) {
                    stringPlus = Intrinsics.stringPlus("Code must be in range [1000,5000): ", Integer.valueOf(i3));
                } else if ((1004 > i3 || i3 >= 1007) && (1015 > i3 || i3 >= 3000)) {
                    stringPlus = null;
                } else {
                    stringPlus = StubApp.getString2("25299") + i3 + StubApp.getString2("25300");
                }
                if (stringPlus != null) {
                    Intrinsics.checkNotNull(stringPlus);
                    throw new IllegalArgumentException(stringPlus.toString());
                }
                if (str != null) {
                    C0104k c0104k2 = C0104k.f3820d;
                    c0104k = u5.d.r(str);
                    if (c0104k.f3821a.length > 123) {
                        throw new IllegalArgumentException(Intrinsics.stringPlus("reason.size() > 123: ", str).toString());
                    }
                }
                if (!this.f3504t && !this.f3501q) {
                    this.f3501q = true;
                    this.f3499o.add(new c(i3, c0104k));
                    f();
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public final void c(Exception e10, C1881F c1881f) {
        Intrinsics.checkNotNullParameter(e10, "e");
        synchronized (this) {
            if (this.f3504t) {
                return;
            }
            this.f3504t = true;
            n nVar = this.f3497m;
            this.f3497m = null;
            h hVar = this.f3494i;
            this.f3494i = null;
            i iVar = this.j;
            this.j = null;
            this.f3495k.e();
            Unit unit = Unit.INSTANCE;
            try {
                this.f3486a.onFailure(this, e10, c1881f);
                if (nVar != null) {
                    xc.b.c(nVar);
                }
                if (hVar != null) {
                    xc.b.c(hVar);
                }
                if (iVar == null) {
                    return;
                }
                xc.b.c(iVar);
            } catch (Throwable th) {
                if (nVar != null) {
                    xc.b.c(nVar);
                }
                if (hVar != null) {
                    xc.b.c(hVar);
                }
                if (iVar != null) {
                    xc.b.c(iVar);
                }
                throw th;
            }
        }
    }

    public final void d(String name, n streams) {
        f fVar;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(streams, "streams");
        g gVar = this.f3489d;
        Intrinsics.checkNotNull(gVar);
        synchronized (this) {
            try {
                this.f3496l = name;
                this.f3497m = streams;
                this.j = new i(streams.f359b, this.f3487b, gVar.f3507a, gVar.f3509c, this.f3490e);
                this.f3493h = new e(this);
                long j = this.f3488c;
                if (j != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                    fVar = this;
                    try {
                        this.f3495k.c(new p(Intrinsics.stringPlus(name, " ping"), fVar, nanos, 1), nanos);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } else {
                    fVar = this;
                }
                if (!fVar.f3499o.isEmpty()) {
                    f();
                }
                Unit unit = Unit.INSTANCE;
                fVar.f3494i = new h(streams.f358a, this, gVar.f3507a, gVar.f3511e);
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void e() {
        while (this.f3502r == -1) {
            h hVar = this.f3494i;
            Intrinsics.checkNotNull(hVar);
            hVar.d();
            if (!hVar.j) {
                int i3 = hVar.f3518f;
                String string2 = StubApp.getString2(25301);
                if (i3 != 1 && i3 != 2) {
                    byte[] bArr = xc.b.f23179a;
                    String hexString = Integer.toHexString(i3);
                    Intrinsics.checkNotNullExpressionValue(hexString, string2);
                    throw new ProtocolException(Intrinsics.stringPlus("Unknown opcode: ", hexString));
                }
                while (!hVar.f3517e) {
                    long j = hVar.f3519g;
                    C0101h buffer = hVar.f3523m;
                    if (j > 0) {
                        hVar.f3513a.e(j, buffer);
                    }
                    if (hVar.f3520h) {
                        if (hVar.f3521k) {
                            a aVar = hVar.f3524n;
                            if (aVar == null) {
                                aVar = new a(hVar.f3516d, 1);
                                hVar.f3524n = aVar;
                            }
                            Intrinsics.checkNotNullParameter(buffer, "buffer");
                            C0101h c0101h = aVar.f3475c;
                            if (c0101h.f3819b != 0) {
                                throw new IllegalArgumentException(StubApp.getString2(353));
                            }
                            Inflater inflater = (Inflater) aVar.f3476d;
                            if (aVar.f3474b) {
                                inflater.reset();
                            }
                            c0101h.t(buffer);
                            c0101h.S(Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                            long bytesRead = inflater.getBytesRead() + c0101h.f3819b;
                            do {
                                ((r) aVar.f3477e).a(LongCompanionObject.MAX_VALUE, buffer);
                            } while (inflater.getBytesRead() < bytesRead);
                        }
                        f fVar = hVar.f3514b;
                        J j3 = fVar.f3486a;
                        if (i3 == 1) {
                            String text = buffer.K();
                            Intrinsics.checkNotNullParameter(text, "text");
                            j3.onMessage(fVar, text);
                        } else {
                            C0104k bytes = buffer.f(buffer.f3819b);
                            Intrinsics.checkNotNullParameter(bytes, "bytes");
                            j3.onMessage(fVar, bytes);
                        }
                    } else {
                        while (!hVar.f3517e) {
                            hVar.d();
                            if (!hVar.j) {
                                break;
                            } else {
                                hVar.a();
                            }
                        }
                        if (hVar.f3518f != 0) {
                            int i10 = hVar.f3518f;
                            byte[] bArr2 = xc.b.f23179a;
                            String hexString2 = Integer.toHexString(i10);
                            Intrinsics.checkNotNullExpressionValue(hexString2, string2);
                            throw new ProtocolException(Intrinsics.stringPlus("Expected continuation opcode. Got: ", hexString2));
                        }
                    }
                }
                throw new IOException(StubApp.getString2(1551));
            }
            hVar.a();
        }
    }

    public final void f() {
        byte[] bArr = xc.b.f23179a;
        e eVar = this.f3493h;
        if (eVar != null) {
            this.f3495k.c(eVar, 0L);
        }
    }

    public final synchronized boolean g(int i3, C0104k c0104k) {
        if (!this.f3504t && !this.f3501q) {
            long j = this.f3500p;
            byte[] bArr = c0104k.f3821a;
            if (bArr.length + j > 16777216) {
                b(1001, null);
                return false;
            }
            this.f3500p = j + bArr.length;
            this.f3499o.add(new d(i3, c0104k));
            f();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00da, code lost:
    
        if (r2 < 3000) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0085, TRY_ENTER, TryCatch #0 {all -> 0x0085, blocks: (B:21:0x0071, B:30:0x0088, B:32:0x008c, B:33:0x0098, B:36:0x00a4, B:40:0x00a8, B:41:0x00a9, B:42:0x00aa, B:44:0x00ae, B:50:0x012a, B:52:0x012e, B:55:0x014a, B:56:0x014c, B:68:0x00dc, B:71:0x0105, B:72:0x0111, B:77:0x00f8, B:78:0x0112, B:80:0x011c, B:81:0x011f, B:82:0x014d, B:83:0x0152, B:35:0x0099, B:49:0x0127), top: B:19:0x006f, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0144 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:21:0x0071, B:30:0x0088, B:32:0x008c, B:33:0x0098, B:36:0x00a4, B:40:0x00a8, B:41:0x00a9, B:42:0x00aa, B:44:0x00ae, B:50:0x012a, B:52:0x012e, B:55:0x014a, B:56:0x014c, B:68:0x00dc, B:71:0x0105, B:72:0x0111, B:77:0x00f8, B:78:0x0112, B:80:0x011c, B:81:0x011f, B:82:0x014d, B:83:0x0152, B:35:0x0099, B:49:0x0127), top: B:19:0x006f, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:21:0x0071, B:30:0x0088, B:32:0x008c, B:33:0x0098, B:36:0x00a4, B:40:0x00a8, B:41:0x00a9, B:42:0x00aa, B:44:0x00ae, B:50:0x012a, B:52:0x012e, B:55:0x014a, B:56:0x014c, B:68:0x00dc, B:71:0x0105, B:72:0x0111, B:77:0x00f8, B:78:0x0112, B:80:0x011c, B:81:0x011f, B:82:0x014d, B:83:0x0152, B:35:0x0099, B:49:0x0127), top: B:19:0x006f, inners: #2, #3 }] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [Jc.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Jc.f.h():boolean");
    }
}
