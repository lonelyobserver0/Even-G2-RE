package com.mapbox.maps.debugoptions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.UtilsKt;
import com.stub.StubApp;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/mapbox/maps/debugoptions/PaddingDebugView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bottom", "Landroid/widget/TextView;", "left", "paddingFrame", "right", "top", "update", "", "padding", "Lcom/mapbox/maps/EdgeInsets;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class PaddingDebugView extends FrameLayout {
    private final TextView bottom;
    private final TextView left;
    private final FrameLayout paddingFrame;
    private final TextView right;
    private final TextView top;

    public /* synthetic */ PaddingDebugView(Context context, AttributeSet attributeSet, int i3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i3);
    }

    @SuppressLint({"SetTextI18n"})
    public final void update(EdgeInsets padding) {
        Intrinsics.checkNotNullParameter(padding, "padding");
        FrameLayout frameLayout = this.paddingFrame;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        Double valueOf = Double.valueOf(padding.getLeft());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int doubleValue = (int) UtilsKt.toDP(valueOf, context).doubleValue();
        Double valueOf2 = Double.valueOf(padding.getTop());
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        int doubleValue2 = (int) UtilsKt.toDP(valueOf2, context2).doubleValue();
        Double valueOf3 = Double.valueOf(padding.getRight());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        int doubleValue3 = (int) UtilsKt.toDP(valueOf3, context3).doubleValue();
        Double valueOf4 = Double.valueOf(padding.getBottom());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        layoutParams2.setMargins(doubleValue, doubleValue2, doubleValue3, (int) UtilsKt.toDP(valueOf4, context4).doubleValue());
        frameLayout.setLayoutParams(layoutParams2);
        TextView textView = this.top;
        Object[] copyOf = Arrays.copyOf(new Object[]{Double.valueOf(padding.getTop())}, 1);
        String string2 = StubApp.getString2(14363);
        String format = String.format(string2, copyOf);
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        textView.setText(format);
        TextView textView2 = this.left;
        String format2 = String.format(string2, Arrays.copyOf(new Object[]{Double.valueOf(padding.getLeft())}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(this, *args)");
        textView2.setText(format2);
        TextView textView3 = this.right;
        String format3 = String.format(string2, Arrays.copyOf(new Object[]{Double.valueOf(padding.getRight())}, 1));
        Intrinsics.checkNotNullExpressionValue(format3, "format(this, *args)");
        textView3.setText(format3);
        TextView textView4 = this.bottom;
        String format4 = String.format(string2, Arrays.copyOf(new Object[]{Double.valueOf(padding.getBottom())}, 1));
        Intrinsics.checkNotNullExpressionValue(format4, "format(this, *args)");
        textView4.setText(format4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingDebugView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        this.paddingFrame = frameLayout;
        TextView textView = new TextView(context);
        this.top = textView;
        TextView textView2 = new TextView(context);
        this.left = textView2;
        TextView textView3 = new TextView(context);
        this.right = textView3;
        TextView textView4 = new TextView(context);
        this.bottom = textView4;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        Float valueOf = Float.valueOf(1.0f);
        int floatValue = (int) UtilsKt.toDP(valueOf, context).floatValue();
        i10 = PaddingDebugViewKt.GREEN_DARK;
        gradientDrawable.setStroke(floatValue, i10);
        frameLayout.setBackground(gradientDrawable);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        View crossView = new CrossView(context, null, 0, 6, null);
        Float valueOf2 = Float.valueOf(15.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) UtilsKt.toDP(valueOf2, context).floatValue(), (int) UtilsKt.toDP(valueOf2, context).floatValue());
        layoutParams.gravity = 17;
        crossView.setLayoutParams(layoutParams);
        for (TextView textView5 : CollectionsKt.listOf((Object[]) new TextView[]{textView, textView2, textView3, textView4})) {
            textView5.setTypeface(Typeface.MONOSPACE);
            textView5.setTextSize(10.0f);
            textView5.setTextColor(-1);
            i11 = PaddingDebugViewKt.GREEN_DARK;
            textView5.setBackgroundColor(i11);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            if (Intrinsics.areEqual(textView5, this.top)) {
                layoutParams2.gravity = 1;
            } else if (Intrinsics.areEqual(textView5, this.left)) {
                layoutParams2.gravity = 16;
            } else if (Intrinsics.areEqual(textView5, this.right)) {
                layoutParams2.gravity = 21;
            } else if (Intrinsics.areEqual(textView5, this.bottom)) {
                layoutParams2.gravity = 81;
            }
            layoutParams2.leftMargin = (int) UtilsKt.toDP(valueOf, context).floatValue();
            layoutParams2.rightMargin = (int) UtilsKt.toDP(valueOf, context).floatValue();
            textView5.setLayoutParams(layoutParams2);
            textView5.setPadding((int) UtilsKt.toDP(valueOf, context).floatValue(), 0, (int) UtilsKt.toDP(valueOf, context).floatValue(), 0);
            this.paddingFrame.addView(textView5);
        }
        this.paddingFrame.addView(crossView);
        addView(this.paddingFrame);
    }
}
