package j8;

import com.mapbox.common.SdkInformation;
import com.stub.StubApp;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import u8.k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class b implements H8.d {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f15376a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final SdkInformation f15377b;

    static {
        Pair pair;
        int ordinal = k.f21475a.ordinal();
        if (ordinal == 0) {
            pair = TuplesKt.to(StubApp.getString2(2158), StubApp.getString2(2159));
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            pair = TuplesKt.to(StubApp.getString2(2156), StubApp.getString2(2157));
        }
        f15377b = new SdkInformation((String) pair.component1(), StubApp.getString2(2160), (String) pair.component2());
    }
}
