package W;

import androidx.datastore.preferences.protobuf.AbstractC0410j;
import androidx.datastore.preferences.protobuf.AbstractC0418s;
import androidx.datastore.preferences.protobuf.AbstractC0420u;
import androidx.datastore.preferences.protobuf.AbstractC0422w;
import androidx.datastore.preferences.protobuf.C0408h;
import androidx.datastore.preferences.protobuf.C0409i;
import androidx.datastore.preferences.protobuf.C0413m;
import androidx.datastore.preferences.protobuf.C0419t;
import androidx.datastore.preferences.protobuf.C0424y;
import androidx.datastore.preferences.protobuf.G;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.a0;
import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends AbstractC0420u {
    private static final e DEFAULT_INSTANCE;
    private static volatile P PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private G preferences_ = G.f9710b;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        AbstractC0420u.j(e.class, eVar);
    }

    public static G l(e eVar) {
        G g10 = eVar.preferences_;
        if (!g10.f9711a) {
            eVar.preferences_ = g10.b();
        }
        return eVar.preferences_;
    }

    public static c n() {
        return (c) ((AbstractC0418s) DEFAULT_INSTANCE.c(5));
    }

    public static e o(InputStream inputStream) {
        AbstractC0410j c0409i;
        e eVar = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = AbstractC0422w.f9853b;
            int length = bArr.length;
            c0409i = new C0408h(bArr, 0, length, false);
            try {
                c0409i.f(length);
            } catch (C0424y e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            c0409i = new C0409i(inputStream);
        }
        C0413m a3 = C0413m.a();
        AbstractC0420u i3 = eVar.i();
        try {
            Q q10 = Q.f9734c;
            q10.getClass();
            U a9 = q10.a(i3.getClass());
            Ab.g gVar = (Ab.g) c0409i.f9808b;
            if (gVar == null) {
                gVar = new Ab.g(c0409i);
            }
            a9.f(i3, gVar, a3);
            a9.b(i3);
            if (AbstractC0420u.f(i3, true)) {
                return (e) i3;
            }
            throw new C0424y(new a0().getMessage());
        } catch (a0 e11) {
            throw new C0424y(e11.getMessage());
        } catch (C0424y e12) {
            if (e12.f9854a) {
                throw new C0424y(e12.getMessage(), e12);
            }
            throw e12;
        } catch (IOException e13) {
            if (e13.getCause() instanceof C0424y) {
                throw ((C0424y) e13.getCause());
            }
            throw new C0424y(e13.getMessage(), e13);
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof C0424y) {
                throw ((C0424y) e14.getCause());
            }
            throw e14;
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
                Object[] objArr = {StubApp.getString2(6807), d.f8063a};
                return new T(DEFAULT_INSTANCE, StubApp.getString2(6808), objArr);
            case 3:
                return new e();
            case 4:
                return new c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                P p9 = PARSER;
                if (p9 != null) {
                    return p9;
                }
                synchronized (e.class) {
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

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
