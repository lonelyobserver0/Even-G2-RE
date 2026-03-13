package c7;

import android.R;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.mapbox.maps.MapboxLogger;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j extends AppCompatImageView implements i {
    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
    }

    public void setEnable(boolean z2) {
        int i3;
        if (z2) {
            i3 = 0;
        } else {
            String string = getContext().getString(2131755178);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ing_attribution_disabled)");
            MapboxLogger.logW(StubApp.getString2(9634), string);
            i3 = 8;
        }
        setVisibility(i3);
    }

    public void setGravity(int i3) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).gravity = i3;
    }

    public void setIconColor(int i3) {
        setImageTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[0]}, new int[]{i3, i3}));
    }

    public void setViewOnClickListener(View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setOnClickListener(listener);
    }
}
