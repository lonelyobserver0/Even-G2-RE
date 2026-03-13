package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0416p {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f9823c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final W f9824a = W.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f9825b;

    static {
        new C0416p(0);
    }

    public C0416p() {
    }

    public static void b(C0411k c0411k, p0 p0Var, int i3, Object obj) {
        if (p0Var == p0.f9827d) {
            c0411k.j0(i3, 3);
            ((AbstractC0401a) obj).b(c0411k);
            c0411k.j0(i3, 4);
        }
        c0411k.j0(i3, p0Var.f9831b);
        switch (p0Var.ordinal()) {
            case 0:
                c0411k.d0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0411k.b0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0411k.n0(((Long) obj).longValue());
                break;
            case 3:
                c0411k.n0(((Long) obj).longValue());
                break;
            case 4:
                c0411k.f0(((Integer) obj).intValue());
                break;
            case 5:
                c0411k.d0(((Long) obj).longValue());
                break;
            case 6:
                c0411k.b0(((Integer) obj).intValue());
                break;
            case 7:
                c0411k.V(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0407g)) {
                    c0411k.i0((String) obj);
                    break;
                } else {
                    c0411k.Z((C0407g) obj);
                    break;
                }
            case 9:
                ((AbstractC0401a) obj).b(c0411k);
                break;
            case 10:
                AbstractC0401a abstractC0401a = (AbstractC0401a) obj;
                c0411k.getClass();
                c0411k.l0(((AbstractC0420u) abstractC0401a).a(null));
                abstractC0401a.b(c0411k);
                break;
            case 11:
                if (!(obj instanceof C0407g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0411k.l0(length);
                    c0411k.W(bArr, 0, length);
                    break;
                } else {
                    c0411k.Z((C0407g) obj);
                    break;
                }
            case 12:
                c0411k.l0(((Integer) obj).intValue());
                break;
            case 13:
                c0411k.f0(((Integer) obj).intValue());
                break;
            case 14:
                c0411k.b0(((Integer) obj).intValue());
                break;
            case 15:
                c0411k.d0(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0411k.l0((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0411k.n0((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f9825b) {
            return;
        }
        W w10 = this.f9824a;
        int size = w10.f9748a.size();
        for (int i3 = 0; i3 < size; i3++) {
            Map.Entry c10 = w10.c(i3);
            if (c10.getValue() instanceof AbstractC0420u) {
                AbstractC0420u abstractC0420u = (AbstractC0420u) c10.getValue();
                abstractC0420u.getClass();
                Q q10 = Q.f9734c;
                q10.getClass();
                q10.a(abstractC0420u.getClass()).b(abstractC0420u);
                abstractC0420u.h();
            }
        }
        if (!w10.f9750c) {
            if (w10.f9748a.size() > 0) {
                w10.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = w10.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!w10.f9750c) {
            w10.f9749b = w10.f9749b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(w10.f9749b);
            w10.f9752e = w10.f9752e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(w10.f9752e);
            w10.f9750c = true;
        }
        this.f9825b = true;
    }

    public final Object clone() {
        C0416p c0416p = new C0416p();
        W w10 = this.f9824a;
        if (w10.f9748a.size() > 0) {
            Map.Entry c10 = w10.c(0);
            if (c10.getKey() != null) {
                throw new ClassCastException();
            }
            c10.getValue();
            throw null;
        }
        Iterator it = w10.d().iterator();
        if (!it.hasNext()) {
            return c0416p;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0416p) {
            return this.f9824a.equals(((C0416p) obj).f9824a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9824a.hashCode();
    }

    public C0416p(int i3) {
        a();
        a();
    }
}
