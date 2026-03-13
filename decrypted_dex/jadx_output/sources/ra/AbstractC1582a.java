package ra;

import android.util.Log;
import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import kotlin.jvm.internal.LongCompanionObject;
import oa.AbstractC1469b;
import oa.C1470c;
import oa.C1472e;
import oa.l;
import oa.m;
import oa.n;

/* renamed from: ra.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1582a {

    /* renamed from: d, reason: collision with root package name */
    public static final int f20498d = Long.toString(LongCompanionObject.MAX_VALUE).length();

    /* renamed from: a, reason: collision with root package name */
    public final CharsetDecoder f20499a = Ia.a.f3243f.newDecoder();

    /* renamed from: b, reason: collision with root package name */
    public final j f20500b;

    /* renamed from: c, reason: collision with root package name */
    public C1472e f20501c;

    public AbstractC1582a(j jVar) {
        this.f20500b = jVar;
    }

    public static boolean d(int i3) {
        return i3 >= 48 && i3 <= 57;
    }

    public static boolean e(int i3) {
        return i3 == 32 || i3 == 13 || i3 == 10 || i3 == 9 || i3 == 62 || i3 == 60 || i3 == 91 || i3 == 47 || i3 == 93 || i3 == 41 || i3 == 40 || i3 == 0 || i3 == 12 || i3 == 37;
    }

    public static boolean f(char c10) {
        if (d(c10)) {
            return true;
        }
        if (c10 < 'a' || c10 > 'f') {
            return c10 >= 'A' && c10 <= 'F';
        }
        return true;
    }

    public static boolean g(int i3) {
        return i3 == 0 || i3 == 9 || i3 == 12 || i3 == 10 || i3 == 13 || i3 == 32;
    }

    public final int a(int i3) {
        byte b2;
        byte[] bArr = new byte[3];
        j jVar = this.f20500b;
        int read = jVar.read(bArr);
        if (read == 3 && bArr[0] == 13 && (((b2 = bArr[1]) == 10 && bArr[2] == 47) || bArr[2] == 62 || b2 == 47 || b2 == 62)) {
            i3 = 0;
        }
        if (read > 0) {
            jVar.i(read, bArr);
        }
        return i3;
    }

    public final m b(n nVar) {
        C1472e c1472e = this.f20501c;
        if (c1472e != null) {
            return c1472e.a(nVar);
        }
        throw new IOException(StubApp.getString2(22804) + nVar + StubApp.getString2(22805) + this.f20500b.getPosition() + StubApp.getString2(22806));
    }

    public final boolean c() {
        return d(this.f20500b.peek());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e8, code lost:
    
        r0.read();
        u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ee, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final oa.C1468a h() {
        /*
            r10 = this;
            ra.j r0 = r10.f20500b
            long r1 = r0.getPosition()
            r3 = 91
            r10.m(r3)
            oa.a r4 = new oa.a
            r4.<init>()
            r10.u()
        L13:
            int r5 = r0.peek()
            if (r5 <= 0) goto Le8
            char r5 = (char) r5
            r6 = 93
            if (r5 == r6) goto Le8
            oa.b r5 = r10.l()
            boolean r6 = r5 instanceof oa.m
            if (r6 == 0) goto L79
            java.util.ArrayList r5 = r4.f18393a
            int r6 = r5.size()
            r7 = 0
            if (r6 <= 0) goto L78
            int r6 = r5.size()
            int r6 = r6 + (-1)
            oa.b r6 = r4.d(r6)
            boolean r6 = r6 instanceof oa.i
            if (r6 == 0) goto L78
            int r6 = r5.size()
            int r6 = r6 + (-1)
            oa.b r6 = r4.H(r6)
            oa.i r6 = (oa.i) r6
            int r8 = r5.size()
            if (r8 <= 0) goto L78
            int r8 = r5.size()
            int r8 = r8 + (-1)
            oa.b r8 = r4.d(r8)
            boolean r8 = r8 instanceof oa.i
            if (r8 == 0) goto L78
            int r5 = r5.size()
            int r5 = r5 + (-1)
            oa.b r5 = r4.H(r5)
            oa.i r5 = (oa.i) r5
            oa.n r7 = new oa.n
            long r8 = r5.f18416a
            long r5 = r6.f18416a
            int r5 = (int) r5
            r7.<init>(r8, r5)
            oa.m r5 = r10.b(r7)
            goto L79
        L78:
            r5 = r7
        L79:
            if (r5 == 0) goto L7f
            r4.a(r5)
            goto Le2
        L7f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = 22807(0x5917, float:3.196E-41)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r5.<init>(r6)
            long r6 = r0.getPosition()
            r5.append(r6)
            r6 = 22808(0x5918, float:3.1961E-41)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            r6 = 948(0x3b4, float:1.328E-42)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            android.util.Log.w(r6, r5)
            java.lang.String r5 = r10.s()
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto Lbe
            int r6 = r0.peek()
            if (r6 != r3) goto Lbe
            goto Le7
        Lbe:
            java.nio.charset.Charset r6 = Ia.a.f3241d
            byte[] r6 = r5.getBytes(r6)
            r0.B(r6)
            r6 = 22809(0x5919, float:3.1962E-41)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto Le7
            r6 = 22810(0x591a, float:3.1964E-41)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto Le2
            goto Le7
        Le2:
            r10.u()
            goto L13
        Le7:
            return r4
        Le8:
            r0.read()
            r10.u()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.AbstractC1582a.h():oa.a");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x01fa, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final oa.C1471d i() {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.AbstractC1582a.i():oa.d");
    }

    public final oa.j j() {
        String str;
        m('/');
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        j jVar = this.f20500b;
        int read = jVar.read();
        while (read != -1) {
            if (read == 35) {
                int read2 = jVar.read();
                int read3 = jVar.read();
                char c10 = (char) read2;
                if (f(c10)) {
                    char c11 = (char) read3;
                    if (f(c11)) {
                        String str2 = Character.toString(c10) + c11;
                        try {
                            byteArrayOutputStream.write(Integer.parseInt(str2, 16));
                            read2 = jVar.read();
                            read = read2;
                        } catch (NumberFormatException e10) {
                            throw new IOException(E1.a.k(StubApp.getString2(22819), str2, StubApp.getString2(620)), e10);
                        }
                    }
                }
                if (read3 == -1 || read2 == -1) {
                    Log.e(StubApp.getString2(948), StubApp.getString2(22820));
                    read = -1;
                    break;
                }
                jVar.y(read3);
                byteArrayOutputStream.write(read);
                read = read2;
            } else {
                if (e(read)) {
                    break;
                }
                byteArrayOutputStream.write(read);
                read = jVar.read();
            }
        }
        if (read != -1) {
            jVar.y(read);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            this.f20499a.decode(ByteBuffer.wrap(byteArray));
            str = new String(byteArray, Ia.a.f3243f);
        } catch (CharacterCodingException unused) {
            str = new String(byteArray, Ia.a.f3242e);
        }
        return oa.j.a(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        r2 = r0.toString();
        r0 = oa.q.f18639b;
        r3 = new java.io.ByteArrayOutputStream();
        r4 = new java.lang.StringBuilder(r2.trim());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if ((r4.length() % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r4.append('0');
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
    
        r5 = r4.length();
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        if (r0 >= r5) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        r6 = r0 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
    
        r3.write(java.lang.Integer.parseInt(r4.substring(r0, r6), 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009f, code lost:
    
        if (oa.q.f18639b != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a1, code lost:
    
        android.util.Log.w(com.stub.StubApp.getString2(948), com.stub.StubApp.getString2(22822));
        r3.write(63);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c9, code lost:
    
        throw new java.io.IOException(com.stub.StubApp.getString2(22823).concat(r2), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d3, code lost:
    
        return new oa.q(r3.toByteArray());
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final oa.q k() {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.AbstractC1582a.k():oa.q");
    }

    public final AbstractC1469b l() {
        u();
        j jVar = this.f20500b;
        char peek = (char) jVar.peek();
        if (peek == '(') {
            return k();
        }
        if (peek == '/') {
            return j();
        }
        if (peek == '<') {
            int read = jVar.read();
            char peek2 = (char) jVar.peek();
            jVar.y(read);
            return peek2 == '<' ? i() : k();
        }
        if (peek == 'R') {
            jVar.read();
            return new m(null);
        }
        if (peek == '[') {
            return h();
        }
        String string2 = StubApp.getString2(22827);
        String string22 = StubApp.getString2(22826);
        if (peek == 'f') {
            String str = new String(jVar.z(5), Ia.a.f3241d);
            if (str.equals(StubApp.getString2(9372))) {
                return C1470c.f18395c;
            }
            throw new IOException(StubApp.getString2(22835) + str + string2 + jVar + string22 + jVar.getPosition());
        }
        if (peek == 'n') {
            n(StubApp.getString2(1116).toCharArray());
            return oa.k.f18628a;
        }
        if (peek == 't') {
            String str2 = new String(jVar.z(4), Ia.a.f3241d);
            if (str2.equals(StubApp.getString2(6547))) {
                return C1470c.f18394b;
            }
            throw new IOException(StubApp.getString2(22834) + str2 + string2 + jVar + string22 + jVar.getPosition());
        }
        if (peek == 65535) {
            return null;
        }
        if (Character.isDigit(peek) || peek == '-' || peek == '+' || peek == '.') {
            StringBuilder sb2 = new StringBuilder();
            int read2 = jVar.read();
            while (true) {
                char c10 = (char) read2;
                if (!Character.isDigit(c10) && c10 != '-' && c10 != '+' && c10 != '.' && c10 != 'E' && c10 != 'e') {
                    break;
                }
                sb2.append(c10);
                read2 = jVar.read();
            }
            if (read2 != -1) {
                jVar.y(read2);
            }
            return l.d(sb2.toString());
        }
        long position = jVar.getPosition();
        String s10 = s();
        boolean isEmpty = s10.isEmpty();
        String string23 = StubApp.getString2(74);
        String string24 = StubApp.getString2(22828);
        if (!isEmpty) {
            if (StubApp.getString2(22809).equals(s10) || StubApp.getString2(22810).equals(s10)) {
                jVar.B(s10.getBytes(Ia.a.f3241d));
                return null;
            }
            StringBuilder l9 = com.mapbox.common.b.l(StubApp.getString2(22829), s10, string22);
            l9.append(jVar.getPosition());
            l9.append(string24);
            l9.append(position);
            l9.append(string23);
            Log.w(StubApp.getString2(948), l9.toString());
            return null;
        }
        int peek3 = jVar.peek();
        throw new IOException(StubApp.getString2(22830) + peek + StubApp.getString2(22831) + ((int) peek) + StubApp.getString2(22832) + ((char) peek3) + StubApp.getString2(22833) + peek3 + StubApp.getString2(22805) + jVar.getPosition() + string24 + position + string23);
    }

    public final void m(char c10) {
        j jVar = this.f20500b;
        char read = (char) jVar.read();
        if (read == c10) {
            return;
        }
        throw new IOException(StubApp.getString2(22836) + c10 + StubApp.getString2(22837) + read + StubApp.getString2(22826) + jVar.getPosition());
    }

    public final void n(char[] cArr) {
        u();
        for (char c10 : cArr) {
            j jVar = this.f20500b;
            if (jVar.read() != c10) {
                throw new IOException(StubApp.getString2(22838) + new String(cArr) + StubApp.getString2(22839) + c10 + StubApp.getString2(22826) + jVar.getPosition());
            }
        }
        u();
    }

    public final int o() {
        u();
        StringBuilder t3 = t();
        try {
            int parseInt = Integer.parseInt(t3.toString());
            if (parseInt < 0 || parseInt > 65535) {
                throw new IOException(Xa.h.g(parseInt, StubApp.getString2(22840), StubApp.getString2(22841)));
            }
            return parseInt;
        } catch (NumberFormatException e10) {
            byte[] bytes = t3.toString().getBytes(Ia.a.f3241d);
            j jVar = this.f20500b;
            jVar.B(bytes);
            throw new IOException(StubApp.getString2(22842) + jVar.getPosition() + StubApp.getString2(22843) + ((Object) t3) + StubApp.getString2(620), e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (10 != r0.peek()) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r0.read();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String p() {
        /*
            r6 = this;
            ra.j r0 = r6.f20500b
            boolean r1 = r0.c()
            if (r1 != 0) goto L35
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 11
            r1.<init>(r2)
        Lf:
            int r2 = r0.read()
            r3 = -1
            r4 = 13
            r5 = 10
            if (r2 == r3) goto L25
            if (r5 != r2) goto L1d
            goto L25
        L1d:
            if (r4 != r2) goto L20
            goto L25
        L20:
            char r2 = (char) r2
            r1.append(r2)
            goto Lf
        L25:
            if (r4 != r2) goto L30
            int r2 = r0.peek()
            if (r5 != r2) goto L30
            r0.read()
        L30:
            java.lang.String r0 = r1.toString()
            return r0
        L35:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 22844(0x593c, float:3.2011E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r2.<init>(r3)
            long r3 = r0.getPosition()
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.AbstractC1582a.p():java.lang.String");
    }

    public final long q() {
        u();
        StringBuilder t3 = t();
        try {
            return Long.parseLong(t3.toString());
        } catch (NumberFormatException e10) {
            byte[] bytes = t3.toString().getBytes(Ia.a.f3241d);
            j jVar = this.f20500b;
            jVar.B(bytes);
            throw new IOException(StubApp.getString2(22845) + jVar.getPosition() + StubApp.getString2(22843) + ((Object) t3) + StubApp.getString2(620), e10);
        }
    }

    public final long r() {
        long q10 = q();
        if (q10 >= 0 && q10 < 10000000000L) {
            return q10;
        }
        throw new IOException(StubApp.getString2(22846) + q10 + StubApp.getString2(22847));
    }

    public final String s() {
        u();
        StringBuilder sb2 = new StringBuilder();
        j jVar = this.f20500b;
        int read = jVar.read();
        while (true) {
            char c10 = (char) read;
            if (e(c10) || read == -1) {
                break;
            }
            sb2.append(c10);
            read = jVar.read();
        }
        if (read != -1) {
            jVar.y(read);
        }
        return sb2.toString();
    }

    public final StringBuilder t() {
        j jVar;
        StringBuilder sb2 = new StringBuilder();
        do {
            jVar = this.f20500b;
            int read = jVar.read();
            if (read < 48 || read > 57) {
                if (read != -1) {
                    jVar.y(read);
                }
                return sb2;
            }
            sb2.append((char) read);
        } while (sb2.length() <= f20498d);
        throw new IOException(StubApp.getString2(22848) + ((Object) sb2) + StubApp.getString2(22849) + jVar.getPosition());
    }

    public final void u() {
        j jVar = this.f20500b;
        int read = jVar.read();
        while (true) {
            if (!g(read) && read != 37) {
                break;
            }
            if (read == 37) {
                read = jVar.read();
                while (10 != read && 13 != read && read != -1) {
                    read = jVar.read();
                }
            } else {
                read = jVar.read();
            }
        }
        if (read != -1) {
            jVar.y(read);
        }
    }

    public final void v() {
        j jVar = this.f20500b;
        int read = jVar.read();
        while (32 == read) {
            read = jVar.read();
        }
        if (13 != read) {
            if (10 != read) {
                jVar.y(read);
            }
        } else {
            int read2 = jVar.read();
            if (10 != read2) {
                jVar.y(read2);
            }
        }
    }
}
