package rc;

import Kb.a;
import Kc.C0104k;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import tc.C1766l;
import tc.C1768n;
import vb.InterfaceC1845b;

/* renamed from: rc.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1587b implements InterfaceC1845b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f20557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f20558b;

    public C1587b(MethodChannel.Result result, String str) {
        this.f20557a = str;
        this.f20558b = result;
    }

    @Override // vb.InterfaceC1845b
    public final void i(Db.c exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f20558b.error(StubApp.getString2(35307), exception.getMessage(), null);
    }

    @Override // vb.InterfaceC1845b
    public final void m(Hb.b bVar) {
        C1768n c1768n;
        Kb.a response = (Kb.a) bVar;
        Intrinsics.checkNotNullParameter(response, "response");
        a.C0000a[] images = response.images;
        String str = this.f20557a;
        if (images != null) {
            Intrinsics.checkNotNullExpressionValue(images, "images");
            ArrayList arrayList = new ArrayList(images.length);
            for (a.C0000a c0000a : images) {
                Intrinsics.checkNotNull(c0000a);
                Intrinsics.checkNotNullParameter(c0000a, "<this>");
                long j = c0000a.slot;
                String str2 = c0000a.version;
                C0104k c0104k = C0104k.f3820d;
                byte[] hash = c0000a.hash;
                Intrinsics.checkNotNullExpressionValue(hash, "hash");
                arrayList.add(new C1766l(0L, j, str2, u5.d.t(hash), c0000a.bootable, c0000a.pending, c0000a.confirmed, c0000a.active, c0000a.permanent, C0104k.f3820d));
            }
            c1768n = new C1768n(str, true, arrayList, 8);
        } else {
            c1768n = new C1768n(str, false, (ArrayList) null, 12);
        }
        this.f20558b.success(c1768n.a());
    }
}
