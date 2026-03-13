package t0;

import M4.e0;
import android.net.Uri;
import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import p0.AbstractC1482f;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import s.C1590a;

/* renamed from: t0.o, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1715o extends AbstractC1703c {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21097e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21098f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21099g;

    /* renamed from: h, reason: collision with root package name */
    public final String f21100h;
    public final C1590a j;

    /* renamed from: k, reason: collision with root package name */
    public final C1590a f21101k;

    /* renamed from: l, reason: collision with root package name */
    public C1711k f21102l;

    /* renamed from: m, reason: collision with root package name */
    public HttpURLConnection f21103m;

    /* renamed from: n, reason: collision with root package name */
    public InputStream f21104n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f21105p;

    /* renamed from: q, reason: collision with root package name */
    public int f21106q;

    /* renamed from: r, reason: collision with root package name */
    public long f21107r;

    /* renamed from: s, reason: collision with root package name */
    public long f21108s;

    public C1715o(String str, int i3, int i10, boolean z2, C1590a c1590a) {
        super(true);
        this.f21100h = str;
        this.f21098f = i3;
        this.f21099g = i10;
        this.f21097e = z2;
        this.j = c1590a;
        this.f21101k = new C1590a(3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t0.InterfaceC1708h
    public final void close() {
        try {
            InputStream inputStream = this.f21104n;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    int i3 = AbstractC1560u.f20190a;
                    throw new C1719s(e10, 2000, 3);
                }
            }
        } finally {
            this.f21104n = null;
            k();
            if (this.f21105p) {
                this.f21105p = false;
                d();
            }
            this.f21103m = null;
            this.f21102l = null;
        }
    }

    public final void k() {
        HttpURLConnection httpURLConnection = this.f21103m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                AbstractC1550k.l(StubApp.getString2(23400), StubApp.getString2(23401), e10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0156 A[Catch: IOException -> 0x0161, TRY_LEAVE, TryCatch #3 {IOException -> 0x0161, blocks: (B:19:0x014e, B:21:0x0156), top: B:18:0x014e }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0143  */
    @Override // t0.InterfaceC1708h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long n(t0.C1711k r28) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C1715o.n(t0.k):long");
    }

    public final URL p(String str, URL url) {
        if (str == null) {
            throw new C1719s(StubApp.getString2(23409), 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!StubApp.getString2(3396).equals(protocol) && !StubApp.getString2(3589).equals(protocol)) {
                throw new C1719s(E1.a.j(StubApp.getString2(23407), protocol), 2001);
            }
            if (this.f21097e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new C1719s(StubApp.getString2(23408) + url.getProtocol() + StubApp.getString2(1632) + protocol + StubApp.getString2(74), 2001);
        } catch (MalformedURLException e10) {
            throw new C1719s(e10, 2001, 1);
        }
    }

    public final HttpURLConnection q(URL url, int i3, byte[] bArr, long j, long j3, boolean z2, boolean z10, Map map) {
        String sb2;
        String string2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f21098f);
        httpURLConnection.setReadTimeout(this.f21099g);
        HashMap hashMap = new HashMap();
        C1590a c1590a = this.j;
        if (c1590a != null) {
            hashMap.putAll(c1590a.j());
        }
        hashMap.putAll(this.f21101k.j());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = AbstractC1722v.f21116a;
        if (j == 0 && j3 == -1) {
            sb2 = null;
        } else {
            StringBuilder m4 = AbstractC1482f.m(j, StubApp.getString2(23410), StubApp.getString2(999));
            if (j3 != -1) {
                m4.append((j + j3) - 1);
            }
            sb2 = m4.toString();
        }
        if (sb2 != null) {
            httpURLConnection.setRequestProperty(StubApp.getString2(405), sb2);
        }
        String str = this.f21100h;
        if (str != null) {
            httpURLConnection.setRequestProperty(StubApp.getString2(2015), str);
        }
        httpURLConnection.setRequestProperty(StubApp.getString2(23277), z2 ? StubApp.getString2(20159) : StubApp.getString2(902));
        httpURLConnection.setInstanceFollowRedirects(z10);
        httpURLConnection.setDoOutput(bArr != null);
        int i10 = C1711k.f21076i;
        if (i3 == 1) {
            string2 = StubApp.getString2(595);
        } else if (i3 == 2) {
            string2 = StubApp.getString2(13314);
        } else {
            if (i3 != 3) {
                throw new IllegalStateException();
            }
            string2 = StubApp.getString2(13312);
        }
        httpURLConnection.setRequestMethod(string2);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    @Override // o0.InterfaceC1432g
    public final int read(byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return 0;
        }
        try {
            long j = this.f21107r;
            if (j != -1) {
                long j3 = j - this.f21108s;
                if (j3 == 0) {
                    return -1;
                }
                i10 = (int) Math.min(i10, j3);
            }
            InputStream inputStream = this.f21104n;
            int i11 = AbstractC1560u.f20190a;
            int read = inputStream.read(bArr, i3, i10);
            if (read != -1) {
                this.f21108s += read;
                a(read);
                return read;
            }
            return -1;
        } catch (IOException e10) {
            int i12 = AbstractC1560u.f20190a;
            throw C1719s.a(e10, 2);
        }
    }

    @Override // t0.InterfaceC1708h
    public final Map s() {
        HttpURLConnection httpURLConnection = this.f21103m;
        return httpURLConnection == null ? e0.f4606g : new C1714n(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.HttpURLConnection v(t0.C1711k r18) {
        /*
            r17 = this;
            r0 = r17
            r11 = r18
            java.net.URL r1 = new java.net.URL
            android.net.Uri r2 = r11.f21077a
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            int r2 = r11.f21084h
            r12 = 1
            r2 = r2 & r12
            r3 = 0
            if (r2 != r12) goto L18
            r8 = r12
            goto L19
        L18:
            r8 = r3
        L19:
            boolean r2 = r0.f21097e
            r4 = r2
            int r2 = r11.f21078b
            r5 = r3
            byte[] r3 = r11.f21079c
            r7 = r4
            r6 = r5
            long r4 = r11.f21081e
            r9 = r6
            r10 = r7
            long r6 = r11.f21082f
            if (r10 != 0) goto L33
            r9 = 1
            java.util.Map r10 = r11.f21080d
            java.net.HttpURLConnection r1 = r0.q(r1, r2, r3, r4, r6, r8, r9, r10)
            return r1
        L33:
            r0 = r3
            r3 = r9
        L35:
            int r13 = r3 + 1
            r9 = 20
            if (r3 > r9) goto L9f
            r9 = 0
            java.util.Map r10 = r11.f21080d
            r3 = r0
            r0 = r17
            java.net.HttpURLConnection r9 = r0.q(r1, r2, r3, r4, r6, r8, r9, r10)
            int r10 = r9.getResponseCode()
            r14 = 398(0x18e, float:5.58E-43)
            java.lang.String r14 = com.stub.StubApp.getString2(r14)
            java.lang.String r14 = r9.getHeaderField(r14)
            r15 = 302(0x12e, float:4.23E-43)
            if (r2 == r12) goto L5b
            r12 = 3
            if (r2 != r12) goto L72
        L5b:
            r12 = 300(0x12c, float:4.2E-43)
            if (r10 == r12) goto L8e
            r12 = 301(0x12d, float:4.22E-43)
            if (r10 == r12) goto L8e
            if (r10 == r15) goto L8e
            r12 = 303(0x12f, float:4.25E-43)
            if (r10 == r12) goto L8e
            r12 = 307(0x133, float:4.3E-43)
            if (r10 == r12) goto L8e
            r12 = 308(0x134, float:4.32E-43)
            if (r10 != r12) goto L72
            goto L8e
        L72:
            r3 = 2
            if (r2 != r3) goto L8d
            r12 = 300(0x12c, float:4.2E-43)
            if (r10 == r12) goto L83
            r12 = 301(0x12d, float:4.22E-43)
            if (r10 == r12) goto L83
            if (r10 == r15) goto L83
            r12 = 303(0x12f, float:4.25E-43)
            if (r10 != r12) goto L8d
        L83:
            r9.disconnect()
            java.net.URL r1 = r0.p(r14, r1)
            r2 = 0
            r3 = 1
            goto L9a
        L8d:
            return r9
        L8e:
            r9.disconnect()
            java.net.URL r1 = r0.p(r14, r1)
            r16 = r3
            r3 = r2
            r2 = r16
        L9a:
            r0 = r2
            r2 = r3
            r3 = r13
            r12 = 1
            goto L35
        L9f:
            r0 = r17
            t0.s r1 = new t0.s
            java.net.NoRouteToHostException r2 = new java.net.NoRouteToHostException
            r3 = 23411(0x5b73, float:3.2806E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            java.lang.String r3 = i2.u.p(r13, r3)
            r2.<init>(r3)
            r3 = 2001(0x7d1, float:2.804E-42)
            r4 = 1
            r1.<init>(r2, r3, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C1715o.v(t0.k):java.net.HttpURLConnection");
    }

    public final void w(long j) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int min = (int) Math.min(j, 4096);
            InputStream inputStream = this.f21104n;
            int i3 = AbstractC1560u.f20190a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new C1719s(new InterruptedIOException(), 2000, 1);
            }
            if (read == -1) {
                throw new C1719s();
            }
            j -= read;
            a(read);
        }
    }

    @Override // t0.InterfaceC1708h
    public final Uri z() {
        HttpURLConnection httpURLConnection = this.f21103m;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        C1711k c1711k = this.f21102l;
        if (c1711k != null) {
            return c1711k.f21077a;
        }
        return null;
    }
}
