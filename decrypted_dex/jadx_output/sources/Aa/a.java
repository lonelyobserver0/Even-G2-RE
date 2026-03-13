package Aa;

import com.stub.StubApp;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f247a;

    /* renamed from: b, reason: collision with root package name */
    public final b f248b;

    public a(float[] fArr, b bVar) {
        this.f247a = (float[]) fArr.clone();
        this.f248b = bVar;
    }

    public final String toString() {
        return StubApp.getString2(377) + Arrays.toString(this.f247a) + StubApp.getString2(378);
    }
}
