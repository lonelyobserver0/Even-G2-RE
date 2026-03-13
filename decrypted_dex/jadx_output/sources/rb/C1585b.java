package rb;

import com.stub.StubApp;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.q;
import pb.AbstractC1498a;
import pb.r;
import v0.InterfaceC1820o;

/* renamed from: rb.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1585b extends r implements q {

    /* renamed from: e, reason: collision with root package name */
    public boolean f20550e;

    @Override // pb.r
    public final AbstractC1498a b(InterfaceC1820o interfaceC1820o, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer) {
        if (textureRegistry$SurfaceProducer == null) {
            throw new IllegalArgumentException(StubApp.getString2(22966));
        }
        boolean handlesCropAndRotation = textureRegistry$SurfaceProducer.handlesCropAndRotation();
        C1584a c1584a = new C1584a(interfaceC1820o, this.f19797a);
        c1584a.f20549e = handlesCropAndRotation;
        return c1584a;
    }

    @Override // pb.r
    public final void c() {
        super.c();
        this.f19798b.release();
    }
}
