package W;

import androidx.datastore.preferences.protobuf.AbstractC0402b;
import androidx.datastore.preferences.protobuf.AbstractC0418s;
import androidx.datastore.preferences.protobuf.AbstractC0420u;
import androidx.datastore.preferences.protobuf.AbstractC0422w;
import androidx.datastore.preferences.protobuf.C0419t;
import androidx.datastore.preferences.protobuf.InterfaceC0421v;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.T;
import com.stub.StubApp;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends AbstractC0420u {
    private static final g DEFAULT_INSTANCE;
    private static volatile P PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0421v strings_ = S.f9737d;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC0420u.j(g.class, gVar);
    }

    public static void l(g gVar, Set set) {
        InterfaceC0421v interfaceC0421v = gVar.strings_;
        if (!((AbstractC0402b) interfaceC0421v).f9763a) {
            S s10 = (S) interfaceC0421v;
            int i3 = s10.f9739c;
            gVar.strings_ = s10.c(i3 == 0 ? 10 : i3 * 2);
        }
        RandomAccess randomAccess = gVar.strings_;
        Charset charset = AbstractC0422w.f9852a;
        set.getClass();
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(set.size() + ((S) randomAccess).f9739c);
        }
        S s11 = (S) randomAccess;
        int i10 = s11.f9739c;
        for (Object obj : set) {
            if (obj == null) {
                String str = StubApp.getString2(6809) + (s11.f9739c - i10) + StubApp.getString2(6810);
                for (int i11 = s11.f9739c - 1; i11 >= i10; i11--) {
                    s11.remove(i11);
                }
                throw new NullPointerException(str);
            }
            s11.add(obj);
        }
    }

    public static g m() {
        return DEFAULT_INSTANCE;
    }

    public static f o() {
        return (f) ((AbstractC0418s) DEFAULT_INSTANCE.c(5));
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
                Object[] objArr = {StubApp.getString2(6811)};
                return new T(DEFAULT_INSTANCE, StubApp.getString2(6812), objArr);
            case 3:
                return new g();
            case 4:
                return new f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                P p9 = PARSER;
                if (p9 != null) {
                    return p9;
                }
                synchronized (g.class) {
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

    public final InterfaceC0421v n() {
        return this.strings_;
    }
}
