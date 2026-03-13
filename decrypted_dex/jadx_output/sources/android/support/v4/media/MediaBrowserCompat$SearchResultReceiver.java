package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import c.C0546d;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
class MediaBrowserCompat$SearchResultReceiver extends C0546d {
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
        if (!bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        parcelableArray.getClass();
        ArrayList arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
