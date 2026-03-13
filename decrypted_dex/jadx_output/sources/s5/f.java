package s5;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.asn1.eac.CertificateBody;
import r5.C1568a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f implements p5.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f20761f = Charset.forName(StubApp.getString2(640));

    /* renamed from: g, reason: collision with root package name */
    public static final p5.c f20762g = new p5.c(StubApp.getString2(728), E1.a.p(E1.a.o(e.class, new a(1))));

    /* renamed from: h, reason: collision with root package name */
    public static final p5.c f20763h = new p5.c(StubApp.getString2(1061), E1.a.p(E1.a.o(e.class, new a(2))));

    /* renamed from: i, reason: collision with root package name */
    public static final C1568a f20764i = new C1568a(1);

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f20765a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f20766b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f20767c;

    /* renamed from: d, reason: collision with root package name */
    public final C1568a f20768d;

    /* renamed from: e, reason: collision with root package name */
    public final h f20769e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, C1568a c1568a) {
        this.f20765a = byteArrayOutputStream;
        this.f20766b = hashMap;
        this.f20767c = hashMap2;
        this.f20768d = c1568a;
    }

    public static int j(p5.c cVar) {
        e eVar = (e) ((Annotation) cVar.f19693b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).f20757a;
        }
        throw new p5.b(StubApp.getString2(23133));
    }

    @Override // p5.e
    public final p5.e a(p5.c cVar, boolean z2) {
        g(cVar, z2 ? 1 : 0, true);
        return this;
    }

    @Override // p5.e
    public final p5.e b(p5.c cVar, Object obj) {
        h(cVar, obj, true);
        return this;
    }

    public final void c(p5.c cVar, double d8, boolean z2) {
        if (z2 && d8 == 0.0d) {
            return;
        }
        k((j(cVar) << 3) | 1);
        this.f20765a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d8).array());
    }

    @Override // p5.e
    public final p5.e d(p5.c cVar, long j) {
        if (j == 0) {
            return this;
        }
        e eVar = (e) ((Annotation) cVar.f19693b.get(e.class));
        if (eVar == null) {
            throw new p5.b(StubApp.getString2(23133));
        }
        k(((a) eVar).f20757a << 3);
        l(j);
        return this;
    }

    @Override // p5.e
    public final p5.e e(p5.c cVar, int i3) {
        g(cVar, i3, true);
        return this;
    }

    @Override // p5.e
    public final p5.e f(p5.c cVar, double d8) {
        c(cVar, d8, true);
        return this;
    }

    public final void g(p5.c cVar, int i3, boolean z2) {
        if (z2 && i3 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f19693b.get(e.class));
        if (eVar == null) {
            throw new p5.b(StubApp.getString2(23133));
        }
        k(((a) eVar).f20757a << 3);
        k(i3);
    }

    public final void h(p5.c cVar, Object obj, boolean z2) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z2 && charSequence.length() == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f20761f);
            k(bytes.length);
            this.f20765a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                h(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                i(f20764i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            c(cVar, ((Double) obj).doubleValue(), z2);
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z2 && floatValue == 0.0f) {
                return;
            }
            k((j(cVar) << 3) | 5);
            this.f20765a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z2 && longValue == 0) {
                return;
            }
            e eVar = (e) ((Annotation) cVar.f19693b.get(e.class));
            if (eVar == null) {
                throw new p5.b(StubApp.getString2(23133));
            }
            k(((a) eVar).f20757a << 3);
            l(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            g(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z2);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z2 && bArr.length == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            k(bArr.length);
            this.f20765a.write(bArr);
            return;
        }
        p5.d dVar = (p5.d) this.f20766b.get(obj.getClass());
        if (dVar != null) {
            i(dVar, cVar, obj, z2);
            return;
        }
        p5.f fVar = (p5.f) this.f20767c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.f20769e;
            hVar.f20771a = false;
            hVar.f20773c = cVar;
            hVar.f20772b = z2;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof c) {
            g(cVar, ((c) obj).a(), true);
        } else if (obj instanceof Enum) {
            g(cVar, ((Enum) obj).ordinal(), true);
        } else {
            i(this.f20768d, cVar, obj, z2);
        }
    }

    public final void i(p5.d dVar, p5.c cVar, Object obj, boolean z2) {
        b bVar = new b();
        bVar.f20758a = 0L;
        try {
            OutputStream outputStream = this.f20765a;
            this.f20765a = bVar;
            try {
                dVar.a(obj, this);
                this.f20765a = outputStream;
                long j = bVar.f20758a;
                bVar.close();
                if (z2 && j == 0) {
                    return;
                }
                k((j(cVar) << 3) | 2);
                l(j);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f20765a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void k(int i3) {
        while ((i3 & (-128)) != 0) {
            this.f20765a.write((i3 & CertificateBody.profileType) | 128);
            i3 >>>= 7;
        }
        this.f20765a.write(i3 & CertificateBody.profileType);
    }

    public final void l(long j) {
        while (((-128) & j) != 0) {
            this.f20765a.write((((int) j) & CertificateBody.profileType) | 128);
            j >>>= 7;
        }
        this.f20765a.write(((int) j) & CertificateBody.profileType);
    }
}
