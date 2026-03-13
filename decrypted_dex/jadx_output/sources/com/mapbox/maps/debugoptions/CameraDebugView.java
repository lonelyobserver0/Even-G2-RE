package com.mapbox.maps.debugoptions;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.UtilsKt;
import com.stub.StubApp;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/debugoptions/CameraDebugView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "update", "", "cameraState", "Lcom/mapbox/maps/CameraState;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CameraDebugView extends AppCompatTextView {
    public /* synthetic */ CameraDebugView(Context context, AttributeSet attributeSet, int i3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i3);
    }

    public final void update(CameraState cameraState) {
        Intrinsics.checkNotNullParameter(cameraState, "cameraState");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) StubApp.getString2(14352));
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        Object[] copyOf = Arrays.copyOf(new Object[]{Double.valueOf(cameraState.getCenter().latitude())}, 1);
        String string2 = StubApp.getString2(14353);
        String format = String.format(string2, copyOf);
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) format);
        String string22 = StubApp.getString2(3692);
        SpannableStringBuilder append2 = append.append((CharSequence) string22);
        Intrinsics.checkNotNullExpressionValue(append2, "SpannableStringBuilder()…e()))\n      .append(\"\\n\")");
        StyleSpan styleSpan2 = new StyleSpan(1);
        int length2 = append2.length();
        append2.append((CharSequence) StubApp.getString2(14354));
        append2.setSpan(styleSpan2, length2, append2.length(), 17);
        String format2 = String.format(string2, Arrays.copyOf(new Object[]{Double.valueOf(cameraState.getCenter().longitude())}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(this, *args)");
        SpannableStringBuilder append3 = append2.append((CharSequence) format2).append((CharSequence) string22);
        Intrinsics.checkNotNullExpressionValue(append3, "SpannableStringBuilder()…e()))\n      .append(\"\\n\")");
        StyleSpan styleSpan3 = new StyleSpan(1);
        int length3 = append3.length();
        append3.append((CharSequence) StubApp.getString2(14355));
        append3.setSpan(styleSpan3, length3, append3.length(), 17);
        Object[] copyOf2 = Arrays.copyOf(new Object[]{Double.valueOf(cameraState.getZoom())}, 1);
        String string23 = StubApp.getString2(14356);
        String format3 = String.format(string23, copyOf2);
        Intrinsics.checkNotNullExpressionValue(format3, "format(this, *args)");
        SpannableStringBuilder append4 = append3.append((CharSequence) format3);
        double bearing = cameraState.getBearing();
        String string24 = StubApp.getString2(983);
        if (bearing != 0.0d) {
            append4.append((CharSequence) string22);
            Intrinsics.checkNotNullExpressionValue(append4, string24);
            StyleSpan styleSpan4 = new StyleSpan(1);
            int length4 = append4.length();
            append4.append((CharSequence) StubApp.getString2(14357));
            append4.setSpan(styleSpan4, length4, append4.length(), 17);
            String format4 = String.format(string23, Arrays.copyOf(new Object[]{Double.valueOf(cameraState.getBearing())}, 1));
            Intrinsics.checkNotNullExpressionValue(format4, "format(this, *args)");
            append4.append((CharSequence) format4);
        }
        if (cameraState.getPitch() != 0.0d) {
            append4.append((CharSequence) string22);
            Intrinsics.checkNotNullExpressionValue(append4, string24);
            StyleSpan styleSpan5 = new StyleSpan(1);
            int length5 = append4.length();
            append4.append((CharSequence) StubApp.getString2(14358));
            append4.setSpan(styleSpan5, length5, append4.length(), 17);
            String format5 = String.format(string23, Arrays.copyOf(new Object[]{Double.valueOf(cameraState.getPitch())}, 1));
            Intrinsics.checkNotNullExpressionValue(format5, "format(this, *args)");
            append4.append((CharSequence) format5);
        }
        setText(append4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraDebugView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        Intrinsics.checkNotNullParameter(context, "context");
        setTypeface(Typeface.MONOSPACE);
        int floatValue = (int) UtilsKt.toDP(Float.valueOf(4.0f), context).floatValue();
        setTextSize(13.0f);
        setPadding(floatValue, floatValue, floatValue, floatValue);
        setTextColor(-16777216);
        int floatValue2 = (int) UtilsKt.toDP(Float.valueOf(8.0f), context).floatValue();
        int floatValue3 = (int) UtilsKt.toDP(Float.valueOf(48.0f), context).floatValue();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(floatValue2, floatValue3, 0, 0);
        setLayoutParams(layoutParams);
        float floatValue4 = UtilsKt.toDP(Float.valueOf(5.0f), context).floatValue();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(floatValue4);
        gradientDrawable.setColor(-1);
        setBackground(gradientDrawable);
    }
}
