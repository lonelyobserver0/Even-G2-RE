package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import c.C0546d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
class MediaBrowserCompat$ItemReceiver extends C0546d {
    @Override // c.C0546d
    public final void d(int i3, Bundle bundle) {
        if (bundle != null) {
            bundle = android.support.v4.media.session.b.E(bundle);
        }
        if (i3 != 0) {
            throw null;
        }
        if (bundle == null) {
            throw null;
        }
        if (!bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
