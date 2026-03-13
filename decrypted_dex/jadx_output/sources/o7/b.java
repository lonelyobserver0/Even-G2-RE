package o7;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.mapbox.maps.MapboxLogger;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b extends AppCompatImageView implements a {
    public boolean getLogoEnabled() {
        return getVisibility() == 0;
    }

    public int getLogoGravity() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        return ((FrameLayout.LayoutParams) layoutParams).gravity;
    }

    public void setLogoEnabled(boolean z2) {
        int i3;
        if (z2) {
            i3 = 0;
        } else {
            String string = getContext().getString(2131755179);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ox_warning_logo_disabled)");
            MapboxLogger.logW(StubApp.getString2(21619), string);
            i3 = 8;
        }
        setVisibility(i3);
    }

    public void setLogoGravity(int i3) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).gravity = i3;
    }
}
