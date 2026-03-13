package r5;

import android.util.Base64;
import android.util.JsonWriter;
import com.stub.StubApp;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p5.g;

/* renamed from: r5.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1572e implements p5.e, g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20353a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f20354b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f20355c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f20356d;

    /* renamed from: e, reason: collision with root package name */
    public final C1568a f20357e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20358f;

    public C1572e(Writer writer, HashMap hashMap, HashMap hashMap2, C1568a c1568a, boolean z2) {
        this.f20354b = new JsonWriter(writer);
        this.f20355c = hashMap;
        this.f20356d = hashMap2;
        this.f20357e = c1568a;
        this.f20358f = z2;
    }

    @Override // p5.e
    public final p5.e a(p5.c cVar, boolean z2) {
        String str = cVar.f19692a;
        i();
        JsonWriter jsonWriter = this.f20354b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(z2);
        return this;
    }

    @Override // p5.g
    public final g add(String str) {
        i();
        this.f20354b.value(str);
        return this;
    }

    @Override // p5.e
    public final p5.e b(p5.c cVar, Object obj) {
        h(obj, cVar.f19692a);
        return this;
    }

    @Override // p5.g
    public final g c(boolean z2) {
        i();
        this.f20354b.value(z2);
        return this;
    }

    @Override // p5.e
    public final p5.e d(p5.c cVar, long j) {
        String str = cVar.f19692a;
        i();
        JsonWriter jsonWriter = this.f20354b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(j);
        return this;
    }

    @Override // p5.e
    public final p5.e e(p5.c cVar, int i3) {
        String str = cVar.f19692a;
        i();
        JsonWriter jsonWriter = this.f20354b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(i3);
        return this;
    }

    @Override // p5.e
    public final p5.e f(p5.c cVar, double d8) {
        String str = cVar.f19692a;
        i();
        JsonWriter jsonWriter = this.f20354b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(d8);
        return this;
    }

    public final C1572e g(Object obj) {
        JsonWriter jsonWriter = this.f20354b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                i();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            jsonWriter.beginArray();
            int i3 = 0;
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i3 < length) {
                    jsonWriter.value(r6[i3]);
                    i3++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i3 < length2) {
                    long j = jArr[i3];
                    i();
                    jsonWriter.value(j);
                    i3++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i3 < length3) {
                    jsonWriter.value(dArr[i3]);
                    i3++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i3 < length4) {
                    jsonWriter.value(zArr[i3]);
                    i3++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i3 < length5) {
                    g(numberArr[i3]);
                    i3++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i3 < length6) {
                    g(objArr[i3]);
                    i3++;
                }
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Collection) {
            jsonWriter.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                g(it.next());
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    h(entry.getValue(), (String) key);
                } catch (ClassCastException e10) {
                    throw new p5.b(String.format(StubApp.getString2(22681), key, key.getClass()), e10);
                }
            }
            jsonWriter.endObject();
            return this;
        }
        p5.d dVar = (p5.d) this.f20355c.get(obj.getClass());
        if (dVar != null) {
            jsonWriter.beginObject();
            dVar.a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        p5.f fVar = (p5.f) this.f20356d.get(obj.getClass());
        if (fVar != null) {
            fVar.a(obj, this);
            return this;
        }
        if (!(obj instanceof Enum)) {
            jsonWriter.beginObject();
            this.f20357e.a(obj, this);
            throw null;
        }
        if (obj instanceof InterfaceC1573f) {
            int a3 = ((InterfaceC1573f) obj).a();
            i();
            jsonWriter.value(a3);
            return this;
        }
        String name = ((Enum) obj).name();
        i();
        jsonWriter.value(name);
        return this;
    }

    public final C1572e h(Object obj, String str) {
        boolean z2 = this.f20358f;
        JsonWriter jsonWriter = this.f20354b;
        if (z2) {
            if (obj == null) {
                return this;
            }
            i();
            jsonWriter.name(str);
            g(obj);
            return this;
        }
        i();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        g(obj);
        return this;
    }

    public final void i() {
        if (!this.f20353a) {
            throw new IllegalStateException(StubApp.getString2(22682));
        }
    }
}
