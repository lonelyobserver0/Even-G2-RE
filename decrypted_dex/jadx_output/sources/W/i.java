package W;

import androidx.datastore.preferences.protobuf.AbstractC0418s;
import androidx.datastore.preferences.protobuf.AbstractC0420u;
import androidx.datastore.preferences.protobuf.C0407g;
import androidx.datastore.preferences.protobuf.C0419t;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.T;
import com.stub.StubApp;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i extends AbstractC0420u {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final i DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile P PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        AbstractC0420u.j(i.class, iVar);
    }

    public static h D() {
        return (h) ((AbstractC0418s) DEFAULT_INSTANCE.c(5));
    }

    public static void l(i iVar, long j) {
        iVar.valueCase_ = 4;
        iVar.value_ = Long.valueOf(j);
    }

    public static void m(i iVar, String str) {
        iVar.getClass();
        str.getClass();
        iVar.valueCase_ = 5;
        iVar.value_ = str;
    }

    public static void n(i iVar, g gVar) {
        iVar.getClass();
        iVar.value_ = gVar;
        iVar.valueCase_ = 6;
    }

    public static void o(i iVar, double d8) {
        iVar.valueCase_ = 7;
        iVar.value_ = Double.valueOf(d8);
    }

    public static void p(i iVar, C0407g c0407g) {
        iVar.getClass();
        iVar.valueCase_ = 8;
        iVar.value_ = c0407g;
    }

    public static void q(i iVar, boolean z2) {
        iVar.valueCase_ = 1;
        iVar.value_ = Boolean.valueOf(z2);
    }

    public static void r(i iVar, float f10) {
        iVar.valueCase_ = 2;
        iVar.value_ = Float.valueOf(f10);
    }

    public static void s(i iVar, int i3) {
        iVar.valueCase_ = 3;
        iVar.value_ = Integer.valueOf(i3);
    }

    public static i v() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final g B() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.m();
    }

    public final int C() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0420u
    public final Object c(int i3) {
        P p8;
        switch (AbstractC1856e.c(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = {StubApp.getString2(6813), StubApp.getString2(6814), g.class};
                return new T(DEFAULT_INSTANCE, StubApp.getString2(6815), objArr);
            case 3:
                return new i();
            case 4:
                return new h(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                P p9 = PARSER;
                if (p9 != null) {
                    return p9;
                }
                synchronized (i.class) {
                    try {
                        p8 = PARSER;
                        if (p8 == null) {
                            p8 = new C0419t();
                            PARSER = p8;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return p8;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean t() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final C0407g u() {
        return this.valueCase_ == 8 ? (C0407g) this.value_ : C0407g.f9780c;
    }

    public final double w() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float x() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }
}
