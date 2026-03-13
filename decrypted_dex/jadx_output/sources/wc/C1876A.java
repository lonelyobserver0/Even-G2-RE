package wc;

import Kc.C0098e;
import Kc.C0104k;
import Kc.InterfaceC0102i;
import com.stub.StubApp;
import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Logger;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wc.A, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1876A extends AbstractC1879D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f22307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22308c;

    public /* synthetic */ C1876A(v vVar, Object obj, int i3) {
        this.f22306a = i3;
        this.f22307b = vVar;
        this.f22308c = obj;
    }

    @Override // wc.AbstractC1879D
    public final long contentLength() {
        switch (this.f22306a) {
            case 0:
                return ((File) this.f22308c).length();
            default:
                return ((C0104k) this.f22308c).e();
        }
    }

    @Override // wc.AbstractC1879D
    public final v contentType() {
        switch (this.f22306a) {
        }
        return this.f22307b;
    }

    @Override // wc.AbstractC1879D
    public final void writeTo(InterfaceC0102i interfaceC0102i) {
        Object obj = this.f22308c;
        String string2 = StubApp.getString2(35404);
        int i3 = this.f22306a;
        Intrinsics.checkNotNullParameter(interfaceC0102i, string2);
        switch (i3) {
            case 0:
                Logger logger = Kc.v.f3853a;
                File file = (File) obj;
                Intrinsics.checkNotNullParameter(file, StubApp.getString2(4416));
                C0098e c0098e = new C0098e(new FileInputStream(file), Kc.J.f3789d);
                try {
                    ((Kc.A) interfaceC0102i).t(c0098e);
                    CloseableKt.closeFinally(c0098e, null);
                    return;
                } finally {
                }
            default:
                ((Kc.A) interfaceC0102i).q((C0104k) obj);
                return;
        }
    }
}
