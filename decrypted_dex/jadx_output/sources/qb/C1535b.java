package qb;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import c5.B;
import com.stub.StubApp;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import java.util.Objects;
import pb.g;
import pb.i;
import pb.r;
import sb.C1637b;

/* renamed from: qb.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1535b extends PlatformViewFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20131a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20132b;

    public C1535b(C1637b c1637b) {
        super(StandardMessageCodec.INSTANCE);
        this.f20132b = c1637b;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public final PlatformView create(Context context, int i3, Object obj) {
        switch (this.f20131a) {
            case 0:
                i iVar = (i) obj;
                Objects.requireNonNull(iVar);
                return new C1534a(context, ((r) ((LongSparseArray) ((B) this.f20132b).f10833b).get(iVar.f19783a.longValue())).f19800d);
            default:
                if (((Integer) obj) == null) {
                    throw new IllegalStateException(StubApp.getString2(22346));
                }
                Object e10 = ((C1637b) this.f20132b).e(r3.intValue());
                if (e10 instanceof PlatformView) {
                    return (PlatformView) e10;
                }
                if (e10 instanceof View) {
                    return new C1534a((View) e10);
                }
                throw new IllegalStateException(StubApp.getString2(22345) + obj + StubApp.getString2(81) + e10);
        }
    }

    public C1535b(B b2) {
        super(g.f19780a);
        this.f20132b = b2;
    }
}
