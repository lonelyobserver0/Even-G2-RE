package com.mapbox.navigation.ui.components.maneuver.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import g9.C0965a;
import g9.C0966b;
import g9.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/mapbox/navigation/ui/components/maneuver/view/MapboxPrimaryManeuver;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lg9/b;", "getOptions$ui_components_release", "()Lg9/b;", "getOptions", "ui-components_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxPrimaryManeuver extends AppCompatTextView {

    /* renamed from: a, reason: collision with root package name */
    public final C0966b f12532a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxPrimaryManeuver(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2131820797);
        Intrinsics.checkNotNullParameter(context, "context");
        C0966b options = new C0966b(new C0965a(2131820787, new e(), new e()));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f12532a = options;
    }

    /* renamed from: getOptions$ui_components_release, reason: from getter */
    public final C0966b getF12532a() {
        return this.f12532a;
    }
}
