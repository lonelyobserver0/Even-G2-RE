package com.google.android.material.transformation;

import A.e;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
        new Rect();
        new RectF();
        new RectF();
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, A.b
    public final void b(View view) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException(StubApp.getString2(12530));
        }
    }

    @Override // A.b
    public final void c(e eVar) {
        if (eVar.f15h == 0) {
            eVar.f15h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new RectF();
        new RectF();
    }
}
