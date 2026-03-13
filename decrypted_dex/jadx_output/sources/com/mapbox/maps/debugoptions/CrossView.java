package com.mapbox.maps.debugoptions;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.mapbox.maps.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/mapbox/maps/debugoptions/CrossView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "greenPaint", "Landroid/graphics/Paint;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CrossView extends View {
    private final Paint greenPaint;

    public /* synthetic */ CrossView(Context context, AttributeSet attributeSet, int i3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i3);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float height = canvas.getHeight() / 2.0f;
        float width = canvas.getWidth() / 2.0f;
        canvas.drawLine(0.0f, height, canvas.getWidth(), height, this.greenPaint);
        canvas.drawLine(width, 0.0f, width, canvas.getHeight(), this.greenPaint);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        int i10;
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(0);
        i10 = PaddingDebugViewKt.GREEN_DARK;
        paint.setColor(i10);
        paint.setStrokeWidth(UtilsKt.toDP(Float.valueOf(1.0f), context).floatValue());
        this.greenPaint = paint;
    }
}
