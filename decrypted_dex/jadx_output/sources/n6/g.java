package n6;

import Z9.C0366a;
import android.hardware.Camera;
import android.util.Log;
import com.stub.StubApp;
import m6.q;
import m6.r;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g implements Camera.PreviewCallback {

    /* renamed from: a, reason: collision with root package name */
    public C0366a f17831a;

    /* renamed from: b, reason: collision with root package name */
    public q f17832b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f17833c;

    public g(h hVar) {
        this.f17833c = hVar;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        q qVar = this.f17832b;
        C0366a c0366a = this.f17831a;
        if (qVar == null || c0366a == null) {
            Log.d(StubApp.getString2(4933), StubApp.getString2(21417));
            if (c0366a != null) {
                new Exception(StubApp.getString2(21418));
                c0366a.w();
                return;
            }
            return;
        }
        try {
            if (bArr == null) {
                throw new NullPointerException(StubApp.getString2("21415"));
            }
            r rVar = new r(bArr, qVar.f17120a, qVar.f17121b, camera.getParameters().getPreviewFormat(), this.f17833c.f17844k);
            if (this.f17833c.f17836b.facing == 1) {
                rVar.f17126e = true;
            }
            synchronized (((m6.l) c0366a.f9105b).f17116h) {
                try {
                    m6.l lVar = (m6.l) c0366a.f9105b;
                    if (lVar.f17110b) {
                        lVar.f17109a.obtainMessage(2131231184, rVar).sendToTarget();
                    }
                } finally {
                }
            }
        } catch (RuntimeException e10) {
            Log.e("h", StubApp.getString2(21416), e10);
            c0366a.w();
        }
    }
}
