package Z9;

import com.stub.StubApp;
import fa.C0935a;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: Z9.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0374i implements X9.b {

    /* renamed from: a, reason: collision with root package name */
    public String f9123a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f9124b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0368c f9125c;

    /* renamed from: d, reason: collision with root package name */
    public byte[][] f9126d;

    /* renamed from: e, reason: collision with root package name */
    public byte[][] f9127e;

    public final void c(Object obj, String str) {
        if (obj != null) {
            this.f9124b.put(str, obj);
        }
    }

    @Override // X9.b
    public final C0935a d() {
        return new C0935a((List) this.f9124b.get(StubApp.getString2(6567)));
    }

    @Override // X9.b
    public final String getName() {
        return this.f9123a;
    }

    public final String toString() {
        return getClass().getSimpleName() + StubApp.getString2(8170) + this.f9123a + StubApp.getString2(8171) + this.f9124b + StubApp.getString2(8172) + this.f9125c + StubApp.getString2(8173) + Arrays.deepToString(this.f9126d) + StubApp.getString2(511);
    }
}
