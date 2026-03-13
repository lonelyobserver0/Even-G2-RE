package Q9;

import E9.k;
import android.media.AudioManager;
import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import t6.C1737d;
import t6.EnumC1735b;
import w6.InterfaceC1866a;
import y6.C1972a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class b implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5776b;

    public /* synthetic */ b(Object obj, int i3) {
        this.f5775a = i3;
        this.f5776b = obj;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i3) {
        k kVar;
        switch (this.f5775a) {
            case 0:
                B6.a aVar = (B6.a) this.f5776b;
                if (i3 == -1) {
                    aVar.a();
                }
                aVar.l(StubApp.getString2(5365), Integer.valueOf(i3));
                break;
            default:
                boolean contains = SetsKt.setOf((Object[]) new Integer[]{-1, -2, -3}).contains(Integer.valueOf(i3));
                C1972a c1972a = (C1972a) this.f5776b;
                if (!contains) {
                    if (i3 == 1) {
                        C1737d c1737d = c1972a.f23528f;
                        Intrinsics.checkNotNull(c1737d);
                        if (c1737d.f21202q == EnumC1735b.f21178c && (kVar = c1972a.f23526d) != null && ((InterfaceC1866a) kVar.f2084e) != null && ((AtomicBoolean) kVar.f2086g).get()) {
                            kVar.f();
                            break;
                        }
                    }
                } else {
                    k kVar2 = c1972a.f23526d;
                    if (kVar2 != null && kVar2.b()) {
                        ((AtomicBoolean) kVar2.f2085f).set(true);
                        ((AtomicBoolean) kVar2.f2086g).set(true);
                        break;
                    }
                }
                break;
        }
    }
}
