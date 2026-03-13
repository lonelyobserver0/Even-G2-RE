package A2;

import C2.r;
import android.location.Location;
import com.stub.StubApp;
import gb.InterfaceC0971C;
import io.flutter.plugin.common.MethodChannel;
import org.bouncycastle.asn1.eac.CertificateBody;
import q4.j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class g implements B2.a, r, InterfaceC0971C, q4.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f101b;

    public /* synthetic */ g(MethodChannel.Result result, int i3) {
        this.f100a = i3;
        this.f101b = result;
    }

    @Override // C2.r
    public void a(Location location) {
        this.f101b.success(android.support.v4.media.session.b.A(location));
    }

    @Override // B2.a
    public void b(int i3) {
        switch (this.f100a) {
            case 1:
                this.f101b.error(E1.a.b(i3), E1.a.a(i3), null);
                break;
            default:
                this.f101b.error(E1.a.b(i3), E1.a.a(i3), null);
                break;
        }
    }

    @Override // q4.d
    public void j(j jVar) {
        boolean isSuccessful = jVar.isSuccessful();
        MethodChannel.Result result = this.f101b;
        if (isSuccessful) {
            result.success(jVar.getResult());
        } else {
            Exception exception = jVar.getException();
            result.error(StubApp.getString2(CertificateBody.profileType), exception != null ? exception.getMessage() : StubApp.getString2(126), null);
        }
    }
}
