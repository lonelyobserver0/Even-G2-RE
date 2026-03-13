package B3;

import com.stub.StubApp;
import java.util.Set;
import y3.C1970c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r implements y3.f {

    /* renamed from: a, reason: collision with root package name */
    public final Set f646a;

    /* renamed from: b, reason: collision with root package name */
    public final j f647b;

    /* renamed from: c, reason: collision with root package name */
    public final t f648c;

    public r(Set set, j jVar, t tVar) {
        this.f646a = set;
        this.f647b = jVar;
        this.f648c = tVar;
    }

    public final s a(String str, C1970c c1970c, y3.e eVar) {
        Set set = this.f646a;
        if (set.contains(c1970c)) {
            return new s(this.f647b, str, c1970c, eVar, this.f648c, 0);
        }
        throw new IllegalArgumentException(String.format(StubApp.getString2(594), c1970c, set));
    }
}
