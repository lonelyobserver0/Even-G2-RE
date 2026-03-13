package d0;

import android.util.Log;
import com.stub.StubApp;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: d0.D, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0766D {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13128a = false;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f13129b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public FunctionReferenceImpl f13130c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M f13131d;

    public C0766D(M m4) {
        this.f13131d = m4;
    }

    public final void a() {
        boolean J10 = M.J(3);
        M m4 = this.f13131d;
        if (J10) {
            Log.d(StubApp.getString2(49), StubApp.getString2(16463) + m4);
        }
        C0771a c0771a = m4.f13165h;
        if (c0771a != null) {
            c0771a.f13255q = false;
            c0771a.d(false);
            m4.z(true);
            m4.D();
            Iterator it = m4.f13170n.iterator();
            if (it.hasNext()) {
                throw com.mapbox.common.b.e(it);
            }
        }
        m4.f13165h = null;
    }
}
