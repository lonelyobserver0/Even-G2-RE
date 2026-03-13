package E0;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import l4.E0;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class b implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R0.e f1730b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f1731c;

    public /* synthetic */ b(m mVar, R0.e eVar, int i3) {
        this.f1729a = i3;
        this.f1731c = mVar;
        this.f1730b = eVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j3) {
        switch (this.f1729a) {
            case 0:
                ((d) this.f1731c).getClass();
                R0.e eVar = this.f1730b;
                eVar.getClass();
                if (AbstractC1560u.f20190a >= 30) {
                    eVar.a(j);
                    break;
                } else {
                    Handler handler = eVar.f5938a;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    break;
                }
            default:
                ((E0) this.f1731c).getClass();
                R0.e eVar2 = this.f1730b;
                eVar2.getClass();
                if (AbstractC1560u.f20190a >= 30) {
                    eVar2.a(j);
                    break;
                } else {
                    Handler handler2 = eVar2.f5938a;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    break;
                }
        }
    }
}
