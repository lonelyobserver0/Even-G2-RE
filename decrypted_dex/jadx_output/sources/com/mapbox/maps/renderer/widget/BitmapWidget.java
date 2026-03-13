package com.mapbox.maps.renderer.widget;

import android.graphics.Bitmap;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.renderer.widget.WidgetPosition;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tB#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\nB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0007H\u0016J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/mapbox/maps/renderer/widget/BitmapWidget;", "Lcom/mapbox/maps/renderer/widget/Widget;", "bitmap", "Landroid/graphics/Bitmap;", "position", "Lcom/mapbox/maps/renderer/widget/WidgetPosition;", "marginX", "", "marginY", "(Landroid/graphics/Bitmap;Lcom/mapbox/maps/renderer/widget/WidgetPosition;FF)V", "(Landroid/graphics/Bitmap;Lcom/mapbox/maps/renderer/widget/WidgetPosition;F)V", "originalPosition", "(Landroid/graphics/Bitmap;Lcom/mapbox/maps/renderer/widget/WidgetPosition;)V", "renderer", "Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;", "getRenderer$maps_sdk_release", "()Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;", "getPosition", "getRotation", "setPosition", "", "widgetPosition", "setRotation", "angleDegrees", "updateBitmap", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class BitmapWidget extends Widget {
    private final WidgetPosition originalPosition;
    private final BitmapWidgetRenderer renderer;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public BitmapWidget(Bitmap bitmap) {
        this(bitmap, (WidgetPosition) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
    }

    @Override // com.mapbox.maps.renderer.widget.Widget
    public WidgetPosition getPosition() {
        return getRenderer().getPosition();
    }

    @Override // com.mapbox.maps.renderer.widget.Widget
    public float getRotation() {
        return getRenderer().getRotationDegrees();
    }

    @Override // com.mapbox.maps.renderer.widget.Widget
    public void setPosition(WidgetPosition widgetPosition) {
        Intrinsics.checkNotNullParameter(widgetPosition, "widgetPosition");
        getRenderer().setPosition(widgetPosition);
        triggerRepaint$maps_sdk_release();
    }

    @Override // com.mapbox.maps.renderer.widget.Widget
    public void setRotation(float angleDegrees) {
        getRenderer().setRotation(angleDegrees);
        triggerRepaint$maps_sdk_release();
    }

    public final void updateBitmap(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        getRenderer().updateBitmap(bitmap);
        triggerRepaint$maps_sdk_release();
    }

    public /* synthetic */ BitmapWidget(Bitmap bitmap, WidgetPosition widgetPosition, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap, (i3 & 2) != 0 ? WidgetPositionKt.WidgetPosition(new Function1<WidgetPosition.Builder, Unit>() { // from class: com.mapbox.maps.renderer.widget.BitmapWidget.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WidgetPosition.Builder builder) {
                invoke2(builder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(WidgetPosition.Builder WidgetPosition) {
                Intrinsics.checkNotNullParameter(WidgetPosition, "$this$WidgetPosition");
                WidgetPosition.m31setVerticalAlignment(WidgetPosition.Vertical.TOP);
                WidgetPosition.m28setHorizontalAlignment(WidgetPosition.Horizontal.LEFT);
                WidgetPosition.m29setOffsetX(0.0f);
                WidgetPosition.m30setOffsetY(0.0f);
            }
        }) : widgetPosition);
    }

    @Override // com.mapbox.maps.renderer.widget.Widget
    /* renamed from: getRenderer$maps_sdk_release, reason: from getter */
    public BitmapWidgetRenderer getRenderer() {
        return this.renderer;
    }

    @JvmOverloads
    public BitmapWidget(Bitmap bitmap, WidgetPosition originalPosition) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(originalPosition, "originalPosition");
        this.originalPosition = originalPosition;
        this.renderer = new BitmapWidgetRenderer(bitmap, originalPosition);
    }

    public /* synthetic */ BitmapWidget(Bitmap bitmap, WidgetPosition widgetPosition, float f10, float f11, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap, (i3 & 2) != 0 ? new WidgetPosition(WidgetPosition.Horizontal.LEFT, WidgetPosition.Vertical.TOP) : widgetPosition, (i3 & 4) != 0 ? 0.0f : f10, (i3 & 8) != 0 ? 0.0f : f11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Constructor with margins is deprecated, the offset parameters has been merged into the WidgetPosition class, and the legacy constructor might be removed in future releases.", replaceWith = @ReplaceWith(expression = "BitmapWidget(context, position)", imports = {}))
    public BitmapWidget(Bitmap bitmap, final WidgetPosition position, final float f10, final float f11) {
        this(bitmap, WidgetPositionKt.WidgetPosition(new Function1<WidgetPosition.Builder, Unit>() { // from class: com.mapbox.maps.renderer.widget.BitmapWidget.2

            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            /* renamed from: com.mapbox.maps.renderer.widget.BitmapWidget$2$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                public static final /* synthetic */ int[] $EnumSwitchMapping$1;

                static {
                    int[] iArr = new int[WidgetPosition.Horizontal.values().length];
                    try {
                        iArr[WidgetPosition.Horizontal.LEFT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[WidgetPosition.Horizontal.CENTER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[WidgetPosition.Horizontal.RIGHT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                    int[] iArr2 = new int[WidgetPosition.Vertical.values().length];
                    try {
                        iArr2[WidgetPosition.Vertical.TOP.ordinal()] = 1;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr2[WidgetPosition.Vertical.CENTER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr2[WidgetPosition.Vertical.BOTTOM.ordinal()] = 3;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$1 = iArr2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WidgetPosition.Builder builder) {
                invoke2(builder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(WidgetPosition.Builder WidgetPosition) {
                float f12;
                float f13;
                Intrinsics.checkNotNullParameter(WidgetPosition, "$this$WidgetPosition");
                WidgetPosition.m28setHorizontalAlignment(WidgetPosition.this.getHorizontalAlignment());
                WidgetPosition.m31setVerticalAlignment(WidgetPosition.this.getVerticalAlignment());
                int i3 = WhenMappings.$EnumSwitchMapping$0[WidgetPosition.this.getHorizontalAlignment().ordinal()];
                if (i3 == 1 || i3 == 2) {
                    f12 = f10;
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f12 = -f10;
                }
                WidgetPosition.m29setOffsetX(f12);
                int i10 = WhenMappings.$EnumSwitchMapping$1[WidgetPosition.this.getVerticalAlignment().ordinal()];
                if (i10 == 1 || i10 == 2) {
                    f13 = f11;
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f13 = -f11;
                }
                WidgetPosition.m30setOffsetY(f13);
            }
        }));
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(position, "position");
    }

    public /* synthetic */ BitmapWidget(Bitmap bitmap, WidgetPosition widgetPosition, float f10, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap, (i3 & 2) != 0 ? new WidgetPosition(WidgetPosition.Horizontal.LEFT, WidgetPosition.Vertical.TOP) : widgetPosition, (i3 & 4) != 0 ? 0.0f : f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Constructor with margins is deprecated, the offset parameters has been merged into the WidgetPosition class, and the legacy constructor might be removed in future releases.", replaceWith = @ReplaceWith(expression = "BitmapWidget(context, position)", imports = {}))
    public BitmapWidget(Bitmap bitmap, WidgetPosition position, float f10) {
        this(bitmap, position, f10, 0.0f);
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(position, "position");
    }
}
