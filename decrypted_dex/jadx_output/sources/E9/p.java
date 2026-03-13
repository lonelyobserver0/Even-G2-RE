package E9;

import android.content.Context;
import android.media.MediaPlayer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final r f2094a;

    /* renamed from: b, reason: collision with root package name */
    public MediaPlayer f2095b;

    /* renamed from: c, reason: collision with root package name */
    public float f2096c;

    /* renamed from: d, reason: collision with root package name */
    public C2.d f2097d;

    /* renamed from: e, reason: collision with root package name */
    public F9.b f2098e;

    public p(Context context, r playerAttributes) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(playerAttributes, "playerAttributes");
        this.f2094a = playerAttributes;
        this.f2096c = 1.0f;
    }

    public final void a(MediaPlayer mediaPlayer) {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.f2095b = null;
        F9.b bVar = this.f2098e;
        if (bVar != null) {
            this.f2098e = null;
            C2.d dVar = this.f2097d;
            if (dVar != null) {
                dVar.k(bVar);
            }
        }
    }
}
